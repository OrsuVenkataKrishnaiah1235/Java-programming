import java.util.*;
class for_each
{
public static void main(String[] args)
{
String[] Data={"hello","krishna","my","world","\0"};
for(String i:Data)
{
System.out.println(i);
}
for(int i=0;i<Data.length;i++)
{
System.out.println(Data[i]);
}
}}
