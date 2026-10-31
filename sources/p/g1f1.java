package p;

import android.app.Activity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class g1f1 implements hcb0 {
    public final Activity a;
    public final lzn0 b;
    public final a1r0 c;
    public final bbc d = mno1.a(1, 2, 4);
    public final b431 e;

    public g1f1(cir0 cir0Var, Activity activity, lzn0 lzn0Var, a1r0 a1r0Var) {
        this.a = activity;
        this.b = lzn0Var;
        this.c = a1r0Var;
        this.e = cir0Var.h().a(uj1.z, new az41(this, (byte) 3));
    }

    public final mr20 a() {
        return k4p1.B(this.d);
    }

    public final void b(fcb0 fcb0Var, tv80 tv80Var) {
        ou80 ou80Var;
        this.e.a(fcb0Var, (tv80Var == null || (ou80Var = tv80Var.a) == null) ? null : ou80Var.a);
    }

    public final void close() {
        Activity activity = this.a;
        a1r0 a1r0Var = this.c;
        boolean zH = a1r0Var.h(activity);
        x6c0 x6c0Var = ctf0.d;
        if (zH) {
            a1r0Var.b(x6c0Var);
        } else {
            this.b.b(x6c0Var);
        }
    }
}
