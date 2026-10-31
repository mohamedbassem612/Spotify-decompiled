package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ma90 implements na90 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final m5r0 d;

    public ma90(String str, boolean z, boolean z2, m5r0 m5r0Var) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = m5r0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ma90)) {
            return false;
        }
        ma90 ma90Var = (ma90) obj;
        return this.a.equals(ma90Var.a) && this.b == ma90Var.b && this.c == ma90Var.c && this.d.equals(ma90Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
