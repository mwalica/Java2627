void main() {
    List<String> names = new ArrayList<>(List.of("Jan", "Adam", "Kasia"));
    List<Integer> numbers = new ArrayList<>(List.of(34, 56, 1, 78));
    names.sort((name1, name2) -> name2.compareTo(name2));
    numbers.sort((num1, num2) -> num2 - num1);
    IO.println(names);
    IO.println(numbers);
}