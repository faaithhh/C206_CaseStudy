//Faith
public class Category {
 private String name;
 
public Category(String name) {
this.name = name;
}
 
public String getName() {
 return name;
}
public String toString() {
 String categoryName = String.format("%s", name);
 return categoryName;
}
 
 
}