package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class d35 implements pdy0 {
    public final boolean a;
    public final int b;
    public final boolean c;
    public final luk d;
    public final idd1 e;

    public d35(int i, luk lukVar, boolean z, boolean z2) {
        this.a = z;
        this.b = i;
        this.c = z2;
        this.d = lukVar;
        this.e = new idd1(new k25(this, (byte) 8));
    }

    public final boolean a() {
        d35 d35Var = (d35) this.e.getValue();
        return d35Var != null ? d35Var.a() : this.a;
    }

    public final int b() {
        d35 d35Var = (d35) this.e.getValue();
        return d35Var != null ? d35Var.b() : this.b;
    }

    public final boolean c() {
        d35 d35Var = (d35) this.e.getValue();
        return d35Var != null ? d35Var.c() : this.c;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("flow_available", "android-system-inappuserfeedback", a()), new fpb("shake_detector_gravity_threshold", "android-system-inappuserfeedback", b(), 1000, 2500), new fpb("user_feedback_enabled", "android-system-inappuserfeedback", c()));
    }

    public d35(luk lukVar) {
        this(1300, lukVar, false, false);
    }
}
