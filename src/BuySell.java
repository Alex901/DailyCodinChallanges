public class BuySell{
		protected int buy;
		protected int sell;
		protected int profit;
		
		public BuySell(int buy, int sell){
			this.buy = buy;
			this.sell = sell;
			profit = sell - buy;
		}

		public int getBuy() {
			return buy;
		}

		public int getSell() {
			return sell;
		}

		public int getProfit() {
			return profit;
		}
		
		
	}