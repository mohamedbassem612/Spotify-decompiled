package p;

import com.spotify.wrapped.v1.proto.RiveAnimation;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gl31 {
    public final String a;
    public final vnr0 b;
    public final boolean c;
    public final vnr0 d;
    public final int e;
    public final RiveAnimation f;
    public final float g;
    public final fl31 h;
    public final el31 i;

    public gl31(String str, vnr0 vnr0Var, boolean z, vnr0 vnr0Var2, int i, RiveAnimation riveAnimation, float f, fl31 fl31Var, el31 el31Var) {
        this.a = str;
        this.b = vnr0Var;
        this.c = z;
        this.d = vnr0Var2;
        this.e = i;
        this.f = riveAnimation;
        this.g = f;
        this.h = fl31Var;
        this.i = el31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gl31)) {
            return false;
        }
        gl31 gl31Var = (gl31) obj;
        return u890.j(this.a, gl31Var.a) && this.b.equals(gl31Var.b) && this.c == gl31Var.c && this.d.equals(gl31Var.d) && this.e == gl31Var.e && u890.j(this.f, gl31Var.f) && p3v.c(this.g, gl31Var.g) && this.h.equals(gl31Var.h) && this.i.equals(gl31Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + ((this.h.hashCode() + x0d.f((this.f.hashCode() + kaa0.f(this.e, (this.d.hashCode() + xcg1.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c)) * 31, 31)) * 31, 31, this.g)) * 31);
    }
}
