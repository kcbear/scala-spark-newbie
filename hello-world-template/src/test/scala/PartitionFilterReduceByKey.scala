import org.apache.spark.rdd.RDD
import org.apache.spark.sql.SparkSession


object PartitionFilterReduceByKey {
  def main(args:Array[String]): Unit = {
    val spark: SparkSession = SparkSession.builder()
      .master("local[3]")
      .appName("SparkByExamples.com")
      .getOrCreate()

    val sc = spark.sparkContext

    val rdd:RDD[String] = sc.textFile("src/test/resources/data.csv")
    println("initial partition count:" + rdd.getNumPartitions)

    val reparRdd = rdd.repartition(4)
    println("re-partition count:" + reparRdd.getNumPartitions)

    rdd.collect().foreach(println)
    val audi = rdd.filter(f => f.contains("Audi"))
    audi.foreach(println)

    val rdd3:RDD[String] = audi.map(m => m.split(",").apply(0))
    rdd3.foreach(println)

    val rdd4:RDD[(String, Int)] =rdd3.map(m => (m,1))
    rdd4.foreach(println)

    val rdd5 = rdd4.reduceByKey(_ + _)
    rdd5.foreach(println)
  }
}
