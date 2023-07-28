public class builtJavaSortingFunctions {
//    Встроенные функции сортировки Java
//    Рассмотрим метод sort() классов Collections и Arrays, а также структуры данных вроде TreeMap и TreeSet.
    //Метод Collections.sort() для сортировки коллекций


/*    List<ObjectName> list = new ArrayList<ObjectName>();
    Collections.sort(list, new Comparator<ObjectName>() {
        public int compare(ObjectName o1, ObjectName o2) {
            return o1.toString().compareTo(o2.toString());
        }
    });


    //Метод Arrays.sort() для сортировки массивов:

    ObjectName[] arr = new ObjectName[10];
    Arrays.sort(arr, new Comparator<ObjectName>() {
        public int compare(ObjectName o1, ObjectName o2) {
            return o1.toString().compareTo(o2.toString());
        }
    });

//    Метод sort() удобно использовать в том случае, если массив или коллекция заблаговременно заполнены значениями.
//    Структуры данных

//    TreeMap и TreeSet

    //Для сортировки списков List и множеств Set следует использовать структуру TreeSet:


    Set<ObjectName> sortedSet = new TreeSet<ObjectName>(new Comparator<ObjectName>() {
        public int compare(ObjectName o1, ObjectName o2) {
            return o1.toString().compareTo(o2.toString());
        }
    });
    sortedSet.addAll(unsortedSet);

    //Если же речь идёт о коллекции пар ключ/значение Map, для сортировки подойдёт структура TreeMap, которая сортируется по ключу:

    Map<String, Integer> sortedMap = new TreeMap<String, Integer>(String.CASE_INSENSITIVE_ORDER);
    sortedMap.putAll(unsortedMap);

    Map<ObjectName, String> sortedMap = new TreeMap<ObjectName, String>(new Comparator<ObjectName>() {
        public int compare(ObjectName o1, ObjectName o2) {
            return o1.toString().compareTo(o2.toString());
        }
    });
    sortedMap.putAll(unsortedMap);

//    Самосортируемые структуры данных имеют эффективность O(log(n)),
//    а значит при удвоении количества данных в коллекции время поиска не удваивается,
//    а увеличивается на постоянную величину.

 */
}
