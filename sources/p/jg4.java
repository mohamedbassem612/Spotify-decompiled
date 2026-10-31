package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jg4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final luk c;
    public final idd1 d;

    public jg4(boolean z, boolean z2, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = lukVar;
        this.d = new idd1(new cg4(this, (byte) 3));
    }

    public final boolean a() {
        jg4 jg4Var = (jg4) this.d.getValue();
        return jg4Var != null ? jg4Var.a() : this.a;
    }

    public final boolean b() {
        jg4 jg4Var = (jg4) this.d.getValue();
        return jg4Var != null ? jg4Var.b() : this.b;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("server_driven_lock_requires_local_churn_lock_check", "android-feature-lockstate-detection", a()), new fpb("use_server_driven_lock_state", "android-feature-lockstate-detection", b()));
    }

    public jg4(luk lukVar) {
        this(true, false, lukVar);
    }
}
