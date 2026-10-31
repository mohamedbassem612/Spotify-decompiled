package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class d1m1 implements r1m1 {
    public final String a;
    public final String b;
    public final int c;

    public d1m1(int i, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1m1)) {
            return false;
        }
        d1m1 d1m1Var = (d1m1) obj;
        return this.a.equals(d1m1Var.a) && this.b.equals(d1m1Var.b) && this.c == d1m1Var.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
