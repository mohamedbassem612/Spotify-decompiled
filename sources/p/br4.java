package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class br4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final luk c;
    public final idd1 d = new idd1(new rq4(this, (byte) 6));

    public br4(boolean z, boolean z2, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = lukVar;
    }

    public final boolean a() {
        br4 br4Var = (br4) this.d.getValue();
        return br4Var != null ? br4Var.a() : this.a;
    }

    public final boolean b() {
        br4 br4Var = (br4) this.d.getValue();
        return br4Var != null ? br4Var.b() : this.b;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("songdna_chip_enabled", "android-lyrics-credits", a()), new fpb("songdna_credits_enabled", "android-lyrics-credits", b())});
    }
}
