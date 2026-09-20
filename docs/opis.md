# Opis elementów

**setContentView** – ustawia, jaki plik XML ma być wyświetlany jako interfejs użytkownika danej aktywności.

**findViewById** – wyszukuje w layoutcie konkretny widok (przycisk, tekst itd.) na podstawie jego id.

**R** – automatycznie generowana klasa, która zawiera odwołania do wszystkich zasobów projektu (layouty, stringi, id-ki).

**onCreate** – metoda wywoływana przy tworzeniu aktywności, w której najczęściej inicjalizujemy widoki i logikę.

**super.onCreate** – wywołanie metody nadrzędnej, które jest konieczne, żeby system Android poprawnie zainicjalizował aktywność.

**AndroidManifest.xml** – plik konfiguracyjny aplikacji, w którym deklarujemy wszystkie aktywności, uprawnienia i podstawowe informacje o aplikacji.

**@+id/** – składnia używana w XML do tworzenia nowego identyfikatora widoku.

**match_parent** – wartość, która każe widokowi zająć całą dostępną przestrzeń rodzica.

**dp** – jednostka niezależna od gęstości ekranu, używana do określania rozmiarów i marginesów.

**sp** – jednostka skalowana wraz z ustawieniami czcionki użytkownika, używana głównie do rozmiaru tekstu.