package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class i0e0 implements k0e0 {
    public final String a;
    public final String b;
    public final int c;
    public final o0e0 d;

    public i0e0(String str, String str2, int i, o0e0 o0e0Var) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = o0e0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0e0)) {
            return false;
        }
        i0e0 i0e0Var = (i0e0) obj;
        return this.a.equals(i0e0Var.a) && this.b.equals(i0e0Var.b) && this.c == i0e0Var.c && this.d.equals(i0e0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ab80.k(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
    }
}
