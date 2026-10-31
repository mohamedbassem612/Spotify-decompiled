package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class m35 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new k25(this, (byte) 16));

    public m35(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        m35 m35Var = (m35) this.c.getValue();
        return m35Var != null ? m35Var.a() : this.a;
    }

    @Override // p.pdy0
    public final List models() {
        return k4p1.x(new fpb("enable_condensed_heading", "android-system-preview-card-heading", a()));
    }
}
