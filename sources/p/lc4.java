package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class lc4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final luk c;
    public final idd1 d = new idd1(new wb4(this, (byte) 5));

    public lc4(boolean z, boolean z2, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = lukVar;
    }

    public final boolean a() {
        lc4 lc4Var = (lc4) this.d.getValue();
        return lc4Var != null ? lc4Var.a() : this.a;
    }

    public final boolean b() {
        lc4 lc4Var = (lc4) this.d.getValue();
        return lc4Var != null ? lc4Var.b() : this.b;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("connection_quality_data_saver_enabled", "android-datasaver-connectionquality-impl", a()), new fpb("event_logging_enabled", "android-datasaver-connectionquality-impl", b()));
    }
}
