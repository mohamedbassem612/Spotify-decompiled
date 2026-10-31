package p;

import android.os.Build;
import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ls10 implements os10 {
    public final yge0 a;
    public final kt91 b;
    public final String c;
    public final String d;
    public final String e;
    public final WeakReference f;

    public ls10(yge0 yge0Var, kt91 kt91Var, String str, String str2, String str3, dg30 dg30Var) {
        this.a = yge0Var;
        this.b = kt91Var;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = new WeakReference(dg30Var);
    }

    public final void a(lx10 lx10Var) {
        String str = lx10Var.a;
        yge0 yge0Var = this.a;
        ((cyg0) yge0Var.c).d(str, this.e);
        yge0Var.j("optout_marquee", str, this.c, this.d);
        dg30 dg30Var = (dg30) this.f.get();
        if (dg30Var != null) {
            dg30Var.finish();
            if (Build.VERSION.SDK_INT < 34) {
                dg30Var.overridePendingTransition(0, 2130772031);
            } else {
                dg30Var.overrideActivityTransition(1, 0, 2130772031);
            }
        }
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131958197});
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
        this.b.o(new er91((fs91) null, "", 2131958197, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
    }
}
