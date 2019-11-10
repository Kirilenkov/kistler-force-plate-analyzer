import org.apache.spark.SparkContext
import org.apache.spark.SparkConf

object RW extends App {
    val conf = new SparkConf().setAppName("KISTLER_ANALYZER").setMaster("local[2]").set("spark.executor.memory","1g")
    val sc = new SparkContext(conf)
    val RDD = sc.textFile("C:\\Users\\Kirill\\Desktop\\kistler\\main\\Kirill 003.txt")
    RDD.collect().foreach(x => println(x))
}
