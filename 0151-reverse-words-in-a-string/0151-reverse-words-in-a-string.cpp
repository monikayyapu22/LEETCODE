class Solution {
public:
    string reverseWords(string s) {
        stringstream ss(s);
        int n=s.length();
        string token="";
        string result="";
        while(ss>>token)
        {
            result=token+ " " +result;
        }
        if (!result.empty() && result.back() == ' ') {
            result.pop_back();
        }
        return result;
    }
};