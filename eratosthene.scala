
object eratosthene {
  def main(args: Array[String]):Unit={
    println("Enter number to find all the prime numbers before it")
    val limit=scala.io.StdIn.readInt()
    val numbers=List.range(2,limit)
    if(!numbers.isEmpty){
     //calling function to find all the 
     println(find_prime_numbers(numbers))
    }
    test()
 }
  def find_prime_numbers(numbers:List[Int]):List[Int]={
    find_multiples(numbers.last,numbers.head,2,numbers)
  }
  def test(){
    val list=List(2,3,4,5,6,7,8,9,10)
    val testlist=List(2,3,5,7)
    if(find_prime_numbers(list)==testlist){
      println("Test passed");
    }
  }
  def find_multiples(lastnumber:Int,current_number:Int,iterator:Int,list:List[Int]):List[Int]={
    if(current_number*2>lastnumber){
      list
    }
    else if(!list.contains(current_number))
       find_multiples(lastnumber,current_number+1,2,list)
    else if(current_number*iterator<=lastnumber){
       val newlist=list.filter(_!=current_number*iterator)
       find_multiples(lastnumber,current_number,iterator+1,newlist)
      }
    else if(current_number*iterator>lastnumber)
      find_multiples(lastnumber,current_number+1,2,list)
    else{
       list
     }
 }
  
}