package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class h55 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new f55(this, (byte) 1));

    public h55(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        h55 h55Var = (h55) this.c.getValue();
        return h55Var != null ? h55Var.a() : this.a;
    }

    @Override // p.pdy0
    public final List models() {
        return k4p1.x(new fpb("clear_cache_on_trim_enabled", "android-transcript-endpoints-impl", a()));
    }
}
