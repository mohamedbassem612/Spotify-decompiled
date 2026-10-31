package p;

import android.content.res.Resources;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ir91 {
    public final dg30 a;
    public final ccc0 b;
    public final kt91 c;
    public final kly0 d;
    public final co31 e;

    public ir91(dg30 dg30Var, ccc0 ccc0Var, kt91 kt91Var, tsq tsqVar, co31 co31Var) {
        this.a = dg30Var;
        this.b = ccc0Var;
        this.c = kt91Var;
        this.d = tsqVar;
        this.e = co31Var;
    }

    public final void a(oo3 oo3Var) {
        er91 er91Var;
        er91 er91Var2;
        int i;
        if (oo3Var.equals(ho3.a)) {
            n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131964169});
            n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
            er91Var2 = new er91((fs91) null, "", 2131964169, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false);
        } else if (oo3Var.equals(io3.a)) {
            n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131964170});
            n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
            er91Var2 = new er91((fs91) null, "", 2131964170, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false);
        } else if (oo3Var.equals(jo3.a)) {
            n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131964171});
            n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
            er91Var2 = new er91((fs91) null, "", 2131964171, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false);
        } else if (oo3Var.equals(mo3.a)) {
            n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131964142});
            n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
            er91Var2 = new er91((fs91) null, "", 2131964142, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false);
        } else {
            boolean z = oo3Var instanceof no3;
            dg30 dg30Var = this.a;
            if (z) {
                Resources resources = dg30Var.getResources();
                no3 no3Var = (no3) oo3Var;
                int iOrdinal = no3Var.a.ordinal();
                if (iOrdinal == 0) {
                    i = 2131820962;
                } else if (iOrdinal == 1) {
                    i = 2131820974;
                } else {
                    if (iOrdinal != 2) {
                        eg.o();
                        return;
                    }
                    i = 2131820973;
                }
                int i2 = no3Var.b;
                er91Var = new er91((fs91) null, resources.getQuantityString(i, i2, Integer.valueOf(i2)), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false);
            } else if (oo3Var.equals(lo3.a)) {
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131964089});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                er91Var2 = new er91((fs91) null, "", 2131964089, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false);
            } else {
                if (!(oo3Var instanceof ko3)) {
                    eg.o();
                    return;
                }
                er91Var = new er91((fs91) null, dg30Var.getString(2131964082, ((ko3) oo3Var).a), (Integer) null, dg30Var.getString(2131964083), (Integer) null, new wa21(this, oo3Var, (byte) 13), (cvr) null, (xq91) null, false);
            }
            er91Var2 = er91Var;
        }
        kt91 kt91Var = this.c;
        if (kt91Var.g()) {
            kt91Var.k(er91Var2);
        } else {
            kt91Var.o(er91Var2);
        }
    }
}
