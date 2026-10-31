package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class nny0 implements vi0 {
    public final String a;
    public final String b;
    public final int c;
    public final int d;

    public nny0(String str, String str2, int i, int i2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nny0)) {
            return false;
        }
        nny0 nny0Var = (nny0) obj;
        return u890.j(this.a, nny0Var.a) && this.b.equals(nny0Var.b) && this.c == nny0Var.c && this.d == nny0Var.d;
    }

    public final int hashCode() {
        return l1d.C(this.d) + kaa0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
    }
}
