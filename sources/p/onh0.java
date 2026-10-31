package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class onh0 {
    public final String a;
    public final int b;
    public final int c;
    public final int d;

    public onh0(int i, int i2, int i3, String str) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onh0)) {
            return false;
        }
        onh0 onh0Var = (onh0) obj;
        return u890.j(this.a, onh0Var.a) && this.b == onh0Var.b && this.c == onh0Var.c && this.d == onh0Var.d;
    }

    public final int hashCode() {
        return l1d.C(this.d) + kaa0.f(this.c, kaa0.f(this.b, this.a.hashCode() * 31, 31), 31);
    }
}
