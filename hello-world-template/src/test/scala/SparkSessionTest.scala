
import org.apache.spark.sql.SparkSession

object SparkSessionTest {

  def main(args:Array[String]): Unit ={

    val spark = SparkSession.builder()
      .master("local[1]")
      .appName("SparkByExample")
      .getOrCreate();

    println("First SparkContext:")
    println("APP Name :"+spark.sparkContext.appName);
    println("Deploy Mode :"+spark.sparkContext.deployMode);
    println("Master :"+spark.sparkContext.master);



    //Create RDD from parallelize
    val dataSeq = Seq(("Java", 20000), ("Python", 100000), ("Scala", 3000))
    val rdd=spark.sparkContext.parallelize(dataSeq)



//    val sparkSession2 = SparkSession.builder()
//      .master("local[1]")
//      .appName("SparkByExample-test")
//      .getOrCreate();
//
//    println("Second SparkContext:")
//    println("APP Name :"+sparkSession2.sparkContext.appName);
//    println("Deploy Mode :"+sparkSession2.sparkContext.deployMode);
//    println("Master :"+sparkSession2.sparkContext.master);

  }
}
