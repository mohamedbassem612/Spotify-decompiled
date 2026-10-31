package p;

import com.spotify.wrapped.v1.proto.RiveAnimation;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tk31 {
    public final String a;
    public final vnr0 b;
    public final RiveAnimation c;
    public final String d;
    public final rk31 e;
    public final sk31 f;
    public final qk31 g;

    public tk31(String str, vnr0 vnr0Var, RiveAnimation riveAnimation, String str2, rk31 rk31Var, sk31 sk31Var, qk31 qk31Var) {
        this.a = str;
        this.b = vnr0Var;
        this.c = riveAnimation;
        this.d = str2;
        this.e = rk31Var;
        this.f = sk31Var;
        this.g = qk31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tk31)) {
            return false;
        }
        tk31 tk31Var = (tk31) obj;
        return u890.j(this.a, tk31Var.a) && this.b.equals(tk31Var.b) && u890.j(this.c, tk31Var.c) && u890.j(this.d, tk31Var.d) && this.e.equals(tk31Var.e) && this.f.equals(tk31Var.f) && this.g.equals(tk31Var.g);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        String str = this.d;
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31);
    }
}
