class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int mini=prices[0];
        int n=prices.size();
        int maxprofit=0;
        for(int i=1;i<n;i++)
        {
            int cost=prices[i]-mini;
            maxprofit=max(maxprofit,cost);
            mini=min(prices[i],mini);
        }
        return maxprofit;
    }
};