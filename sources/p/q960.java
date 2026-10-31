package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class q960 {
    public final int a;
    public final String b;
    public final String c;

    public q960(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q960)) {
            return false;
        }
        q960 q960Var = (q960) obj;
        return this.a == q960Var.a && this.b.equals(q960Var.b) && this.c.equals(q960Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(l1d.C(this.a) * 31, 31, this.b);
    }
}
