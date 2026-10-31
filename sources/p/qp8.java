package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qp8 {
    public final String a;
    public final String b;
    public final String c;

    public qp8(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qp8)) {
            return false;
        }
        qp8 qp8Var = (qp8) obj;
        return this.a.equals(qp8Var.a) && u890.j(this.b, qp8Var.b) && this.c.equals(qp8Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
