package p;

import android.os.Parcelable;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class hsg1 implements Parcelable {
    public static final Set b = dm61.z0(blc0.ON_DEMAND_TRIAL_OPT_IN_UPSELL_DOWNLOAD, blc0.ON_DEMAND_TRIAL_OPT_IN_UPSELL_PICK_TRACK, blc0.ON_DEMAND_TRIAL_OPT_IN_UPSELL_SKIP_PREV, blc0.ON_DEMAND_TRIAL_OPT_IN_UPSELL_SKIP_NEXT, blc0.ON_DEMAND_TRIAL_OPT_IN_UPSELL_UNSHUFFLE, blc0.ON_DEMAND_TRIAL_OPT_IN_UPSELL_SCRUB, blc0.ON_DEMAND_TRIAL_OPT_IN_UPSELL_QUEUE_REORDER);
    public static final Set c = dm61.z0(asg1.d, bsg1.d, gsg1.d, fsg1.d, esg1.d, dsg1.d, csg1.d);
    public final blc0 a;

    public hsg1(blc0 blc0Var) {
        this.a = blc0Var;
    }

    public final String a() {
        w6b1 w6b1VarA = f7b1.a(this.a);
        String str = w6b1VarA != null ? (String) o7h.s0(w6b1VarA.c) : null;
        if (str != null) {
            return str;
        }
        bhn0.g(this, "No uri found for ");
        return null;
    }

    public final String b(int i) {
        return l1d.k(i, a(), "?trial_length_days=");
    }
}
