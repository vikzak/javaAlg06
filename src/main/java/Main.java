public class Main {
    /*
    * 1) Создать и запустить программу для построения двоичного дерева.
    * В цикле построить двадцать деревьев с глубиной в 6 уровней.
    * Данные, которыми необходимо заполнить узлы деревьев, представляются в виде чисел типа int.
    * Число, которое попадает в узел, должно генерироваться случайным образом в диапазоне от -100 до 100.
    * 2)Проанализировать, какой процент созданных деревьев являются несбалансированными.
*  */
    public static void main(String[] args) {
        int myTreeCount = 20;
        int notBalanceCount = 0;
        int balanceCount = 0;

        for (int i = 0; i < myTreeCount; i++) {
            MyTree<Integer, Integer> map = MyTree.generateMyTree();
            if (map.isBalanced()) {
                balanceCount++;
            } else {
                notBalanceCount++;
            }
        }
        MyTree.myTreeInfoResult(notBalanceCount, balanceCount, myTreeCount);
    }



}
