package ca.utoronto.bntester.internal;

import org.cytoscape.work.AbstractTask;
import org.cytoscape.work.TaskMonitor;
import org.cytoscape.work.Tunable;
import org.cytoscape.work.util.BoundedDouble;
import org.cytoscape.work.util.BoundedFloat;
import org.cytoscape.work.util.BoundedInteger;
import org.cytoscape.work.util.BoundedLong;

public class TesterTask extends AbstractTask {
	
	@Tunable(description = "Bounded Int 1", params = "slider=true")
	public BoundedInteger bint1 = new BoundedInteger(0, 0, 3, false, false);

	@Tunable(description = "Bounded Int 2", required = true, format = "###,###", params = "slider=true")
	public BoundedInteger bint2 = new BoundedInteger(0, 2, 4, false, false);

	@Tunable(description = "Bounded Int 3", required = true, format = "###,###", params = "slider=true")
	public BoundedInteger bint3 = new BoundedInteger(0, 1, 5, false, false);

	@Tunable(description = "Bounded Int 4", required = true, format = "###,###", params = "slider=true")
	public BoundedInteger bint4 = new BoundedInteger(0, 6, 6, false, false);

	@Tunable(description = "Bounded Int 5", required = true, format = "###,###", params = "slider=true")
	public BoundedInteger bint5 = new BoundedInteger(0, 0, 7, false, false);

	@Tunable(description = "Bounded Int 6", required = true, format = "###,###", params = "slider=true")
	public BoundedInteger bint6 = new BoundedInteger(0, 0, 10, false, false);

	@Tunable(description = "Bounded Int 7", required = true, format = "###,###", params = "slider=true")
	public BoundedInteger bint7 = new BoundedInteger(0, 0, 20, false, false);

	@Tunable(description = "Bounded Int 8", required = true, format = "###,###", params = "slider=true")
	public BoundedInteger bint8 = new BoundedInteger(0, 0, 100, false, false);

	@Tunable(description = "Bounded Long", required = true, format = "###,###", params = "slider=true")
	public BoundedLong blong = new BoundedLong(0L, 0L, 10_000_000L, false, false);

	@Tunable(description = "Bounded Float", required = true, format = "\u00A4###,##0.00", params = "slider=true")
	public BoundedFloat bfloat = new BoundedFloat(0.0f, 0.0f, 1000000.0f, false, false);
	
	@Tunable(description = "Bounded Float (0.0 - 1.0)", required = true, params = "slider=true")
	public BoundedFloat bfloat01 = new BoundedFloat(0.0f, 1.0f, 1.0f, false, false);
	
	@Tunable(description = "Bounded Double (0.0 - 1.0)", required = true, params = "slider=true")
	public BoundedDouble bdbl01 = new BoundedDouble(0.0, 0.7, 1.0, false, false);
	
	@Tunable(description = "Bounded Double (0.0 - 0.001)", required = true, params = "slider=true")
	public BoundedDouble bdbl001 = new BoundedDouble(0.0, 0.0004, 0.001, false, false);
	
	@Tunable(description = "Bounded Double (0.95 - 1.0)", required = true, params = "slider=true")
	public BoundedDouble bdbl951 = new BoundedDouble(0.95, 0.975, 1.0, false, false);

	@Override
	public void run(TaskMonitor tm) {
		// Nothing to do here...
	}
}
