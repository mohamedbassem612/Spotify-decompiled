package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class wn9 {
    public final ub10 a;
    public final String b;
    public final boolean c;

    public wn9(ub10 ub10Var, String str, boolean z) {
        this.a = ub10Var;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wn9)) {
            return false;
        }
        wn9 wn9Var = (wn9) obj;
        return this.a.equals(wn9Var.a) && this.b.equals(wn9Var.b) && this.c == wn9Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
