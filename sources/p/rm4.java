package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class rm4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final luk d;
    public final idd1 e = new idd1(new om4(this, (byte) 1));

    public rm4(boolean z, boolean z2, boolean z3, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = lukVar;
    }

    public final boolean a() {
        rm4 rm4Var = (rm4) this.e.getValue();
        return rm4Var != null ? rm4Var.a() : this.a;
    }

    public final boolean b() {
        rm4 rm4Var = (rm4) this.e.getValue();
        return rm4Var != null ? rm4Var.b() : this.b;
    }

    public final boolean c() {
        rm4 rm4Var = (rm4) this.e.getValue();
        return rm4Var != null ? rm4Var.c() : this.c;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("enable_bcp47_client_language", "android-libs-lyrics", a()), new fpb("enable_common_capping", "android-libs-lyrics", b()), new fpb("enable_v3_lyrics_endpoint", "android-libs-lyrics", c()));
    }
}
