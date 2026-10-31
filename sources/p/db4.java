package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class db4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final luk c;
    public final idd1 d;

    public db4(boolean z, boolean z2, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = lukVar;
        this.d = new idd1(new u74(this, (byte) 22));
    }

    public final boolean a() {
        db4 db4Var = (db4) this.d.getValue();
        return db4Var != null ? db4Var.a() : this.a;
    }

    public final boolean b() {
        db4 db4Var = (db4) this.d.getValue();
        return db4Var != null ? db4Var.b() : this.b;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("observe_on_computation_scheduler", "android-connectivity-productstateesperanto", a()), new fpb("use_presession_product_state_client", "android-connectivity-productstateesperanto", b())});
    }

    public db4(luk lukVar) {
        this(false, false, lukVar);
    }
}
