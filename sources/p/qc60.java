package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class qc60 {
    public final int a;
    public final String b;
    public final String c;

    public qc60(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qc60)) {
            return false;
        }
        qc60 qc60Var = (qc60) obj;
        return this.a == qc60Var.a && this.b.equals(qc60Var.b) && this.c.equals(qc60Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(Integer.hashCode(this.a) * 31, 31, this.b);
    }
}
