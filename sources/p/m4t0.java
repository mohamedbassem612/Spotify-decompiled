package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class m4t0 implements n4t0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;

    public m4t0(int i, String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m4t0)) {
            return false;
        }
        m4t0 m4t0Var = (m4t0) obj;
        return this.a.equals(m4t0Var.a) && this.b.equals(m4t0Var.b) && this.c.equals(m4t0Var.c) && this.d.equals(m4t0Var.d) && this.e == m4t0Var.e;
    }

    public final int hashCode() {
        return l1d.C(this.e) + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
