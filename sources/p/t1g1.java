package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class t1g1 {
    public final String a;
    public final String b;
    public final int c;

    public t1g1(int i, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1g1)) {
            return false;
        }
        t1g1 t1g1Var = (t1g1) obj;
        return this.a.equals(t1g1Var.a) && this.b.equals(t1g1Var.b) && this.c == t1g1Var.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
