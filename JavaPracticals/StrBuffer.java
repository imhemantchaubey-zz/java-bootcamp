class StrBuffer{
      public static void main(String args[]){
            StringBuffer sb = new StringBuffer("one");
            System.out.println(sb);
            sb.append("two");
            System.out.println(sb);
            sb.insert(0, "three");
            System.out.println(sb);
            sb.replace(1, 2, "four");
            System.out.println(sb);
            sb.delete(1, 2);
            System.out.println(sb);
            sb.reverse();
            System.out.println(sb);
            System.out.println(sb.charAt(6));
            System.out.println(sb.capacity());
            sb.ensureCapacity(34);
            System.out.println(sb.capacity());
            sb.ensureCapacity(75);
            System.out.println(sb.capacity());
      }
}
//15_Comp_A_Hemant Chaubey