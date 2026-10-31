package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nrs0 {
    public final String a;
    public final int b;
    public final int c;

    public nrs0(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nrs0)) {
            return false;
        }
        nrs0 nrs0Var = (nrs0) obj;
        return this.a.equals(nrs0Var.a) && this.b == nrs0Var.b && this.c == nrs0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
