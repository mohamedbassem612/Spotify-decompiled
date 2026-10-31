package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class o5z0 extends ajo1 {
    public final adz0 d;
    public final int e;
    public final String f;

    public o5z0(adz0 adz0Var, int i, String str) {
        this.d = adz0Var;
        this.e = i;
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o5z0)) {
            return false;
        }
        o5z0 o5z0Var = (o5z0) obj;
        return this.d.equals(o5z0Var.d) && this.e == o5z0Var.e && this.f.equals(o5z0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + kaa0.f(this.e, this.d.hashCode() * 31, 31);
    }
}
