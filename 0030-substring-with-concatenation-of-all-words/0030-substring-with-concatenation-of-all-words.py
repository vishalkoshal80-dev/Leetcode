class Solution:
    def findSubstring(self, s: str, words: List[str]) -> List[int]:
        if not s or not words:
            return []
        word_len = len(words[0])
        total_words = len(words)
        word_map = {}
        for w in words:
            word_map[w] = word_map.get(w, 0) + 1
        res = []
        for i in range(word_len):
            left = i
            curr_map = {}
            count = 0
            for j in range(i, len(s) - word_len + 1, word_len):
                w = s[j:j + word_len]
                if w in word_map:
                    curr_map[w] = curr_map.get(w, 0) + 1
                    count += 1
                    while curr_map[w] > word_map[w]:
                        curr_map[s[left:left + word_len]] -= 1
                        left += word_len
                        count -= 1
                    if count == total_words:
                        res.append(left)
                else:
                    curr_map.clear()
                    count = 0
                    left = j + word_len
        return res
                                                                                                                                                                                                                                                                                                                                                                                                                                         