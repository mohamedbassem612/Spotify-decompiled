package p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class q400 implements w600 {
    public final ContextTrack a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final qtf1 g;
    public final String h;

    public q400(ContextTrack contextTrack, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, qtf1 qtf1Var, String str) {
        this.a = contextTrack;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = qtf1Var;
        this.h = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q400)) {
            return false;
        }
        q400 q400Var = (q400) obj;
        return this.a.equals(q400Var.a) && this.b == q400Var.b && this.c == q400Var.c && this.d == q400Var.d && this.e == q400Var.e && this.f == q400Var.f && u890.j(this.g, q400Var.g) && u890.j(this.h, q400Var.h);
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        qtf1 qtf1Var = this.g;
        int iHashCode = (iG + (qtf1Var == null ? 0 : qtf1Var.hashCode())) * 31;
        String str = this.h;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
