function reverseWords(sentence) {
    let words = sentence.split(' ');

    for (let i = 0; i < words.length; i++) {
        words[i] = reverseWord(words[i]);
    }

    return words.join(' ');
}
function reverseWord(word) {
    let reversed = '';
    for (let i = word.length - 1; i >= 0; i--) {
        reversed += word[i];
    }
    return reversed;
}
let inputSentence = "This is a sunny day";
let reversedSentence = reverseWords(inputSentence);
console.log(reversedSentence);
