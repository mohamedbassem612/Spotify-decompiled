package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class i68 extends j68 {
    public final kuo1 a;
    public final String b;
    public final int c;

    public i68(kuo1 kuo1Var, String str, int i) {
        this.a = kuo1Var;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i68)) {
            return false;
        }
        i68 i68Var = (i68) obj;
        return this.a.equals(i68Var.a) && this.b.equals(i68Var.b) && this.c == i68Var.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
