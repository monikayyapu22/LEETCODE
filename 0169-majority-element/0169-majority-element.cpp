class Solution {
public:
    int majorityElement(vector<int>& nums) {
        map<int,int> mp;
        int x=nums.size()/2;
        for(int i=0;i<nums.size();i++)
        {
            mp[nums[i]]++;
        }
        for(auto it:mp)
        {
            if(it.second>x)
            {
                return it.first;
            }
        }
        return -1;
    }
};