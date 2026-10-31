package p;

import android.R;
import android.app.Activity;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tq90 {
    public final lx91 a;
    public final e831 b;
    public final ux70 c;

    public tq90(lx91 lx91Var, e831 e831Var, ux70 ux70Var) {
        this.a = lx91Var;
        this.b = e831Var;
        this.c = ux70Var;
    }

    public final void a(pp90 pp90Var, hr90 hr90Var) {
        Object next;
        ArrayList arrayList = pp90Var.c;
        boolean z = pp90Var.h.b.e;
        ux70 ux70Var = this.c;
        e831 e831Var = this.b;
        if (!z) {
            if (z) {
                eg.o();
                return;
            }
            sq90 sq90Var = new sq90(this, hr90Var, (byte) 1);
            Activity activityA = e831Var.a();
            if (activityA != null) {
                yt91 yt91Var = (yt91) ux70Var.invoke(activityA);
                lx70 lx70Var = lx70.T0;
                Iterator it = arrayList.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!((hp90) next).e);
                hp90 hp90Var = (hp90) next;
                yt91Var.k(hp90Var != null ? hp90Var.b : null, sq90Var, lx70Var);
                return;
            }
            return;
        }
        sq90 sq90Var2 = new sq90(this, hr90Var, (byte) 0);
        if (pp90Var.d.c == 14 || arrayList.size() <= 1) {
            sq90Var2.invoke();
            return;
        }
        Activity activityA2 = e831Var.a();
        if (activityA2 != null) {
            yt91 yt91Var2 = (yt91) ux70Var.invoke(activityA2);
            Activity activity = (Activity) yt91Var2.b;
            if (((pw40) yt91Var2.d) != null) {
                return;
            }
            ((b0a0) yt91Var2.c).getClass();
            uw0 uw0Var = new uw0();
            uw0Var.c = activity.getString(2131962644);
            String string = activity.getString(2131962642);
            fh61 fh61Var = new fh61(sq90Var2, yt91Var2, (byte) 29);
            uw0Var.Z = string;
            uw0Var.N0 = fh61Var;
            String string2 = activity.getString(R.string.cancel);
            fe81 fe81Var = new fe81(yt91Var2, (byte) 25);
            uw0Var.b = string2;
            uw0Var.O0 = fe81Var;
            mw40 mw40Var = new mw40(activity, uw0Var);
            mw40Var.g = new whr(yt91Var2, (byte) 5);
            mw40Var.f = new vae(yt91Var2, (byte) 13);
            pw40 pw40VarB = mw40Var.b();
            pw40VarB.b();
            yt91Var2.d = pw40VarB;
        }
    }
}
