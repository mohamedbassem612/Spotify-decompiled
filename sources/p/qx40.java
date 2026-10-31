package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qx40 extends tx40 {
    public final String a;
    public final String b;
    public final int c;

    public qx40(int i, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qx40)) {
            return false;
        }
        qx40 qx40Var = (qx40) obj;
        return this.a.equals(qx40Var.a) && this.b.equals(qx40Var.b) && this.c == qx40Var.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
