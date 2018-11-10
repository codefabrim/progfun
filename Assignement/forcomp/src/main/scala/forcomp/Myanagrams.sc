import forcomp.Anagrams.{Occurrences, Word}

val word = "HelloWorld"

   word groupBy (c => )


for {
  c <- word

} yield


def wordOccurrences(w: Word): Occurrences =
  w.toLowerCase.toList.groupBy(x => x)
    .mapValues(x => x.length)
    .toList.sortBy(_._1)


def wordOccurrences2(w: Word): Occurrences =
   w.toLowerCase.groupBy(_.charValue).mapValues(_.size).toList.sortBy(_._1)