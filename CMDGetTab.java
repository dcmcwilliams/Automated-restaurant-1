
public class CMDGetTab implements Command {
    private Aggregator agg;

    public CMDGetTab(Aggregator agg) {
        this.agg = agg;
    }

    public int[] execute() {

        Tab tab = new Tab(this.agg);
        return tab.getTab();
    }
}