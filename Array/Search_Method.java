package Array;
import java.util.Stack;

public class Search_Method {

    public static void main(String[] args) {
        // creating stack
        Stack<String> st = new Stack<>();

        // populating stack
        st.push("Java");
        st.push("Source");
        st.push("code");

        // searching 'code' element
        System.out.println("Searching 'code' in stack: " + st.search("code"));
    }
}
