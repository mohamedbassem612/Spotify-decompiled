package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rf4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final luk c;
    public final idd1 d = new idd1(new pe4(this, (byte) 22));

    public rf4(boolean z, boolean z2, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = lukVar;
    }

    public final boolean a() {
        rf4 rf4Var = (rf4) this.d.getValue();
        return rf4Var != null ? rf4Var.a() : this.a;
    }

    public final boolean b() {
        rf4 rf4Var = (rf4) this.d.getValue();
        return rf4Var != null ? rf4Var.b() : this.b;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("custom_back_behaviour", "android-feature-churn-locked-state", a()), new fpb("use_payment_cancellation_endpoint", "android-feature-churn-locked-state", b())});
    }
}
