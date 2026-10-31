package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qy1 {
    public final String a;
    public final String b;
    public final int c;

    public qy1(String str, int i) {
        int i2 = (i & 4) != 0 ? 1 : 2;
        this.a = str;
        this.b = "";
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qy1)) {
            return false;
        }
        qy1 qy1Var = (qy1) obj;
        return u890.j(this.a, qy1Var.a) && this.b.equals(qy1Var.b) && this.c == qy1Var.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
