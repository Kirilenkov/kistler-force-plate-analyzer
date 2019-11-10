import org.apache.spark.SparkContext
import org.apache.spark.SparkConf

object RW extends App {
    val conf: SparkConf =
        new SparkConf()
          .setMaster("local[*]")
          .setAppName("Kistler_app")
          .set("spark.driver.host", "localhost")
    val sc: SparkContext = new SparkContext(conf)
    val RDD = sc.textFile("C:\\Users\\Kirill\\Desktop\\kistler\\main\\Kirill 003.txt")
    RDD.collect().foreach(x => println(x))
}
