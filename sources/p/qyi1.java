package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qyi1 extends yoi1 {
    public final String h;
    public final String i;
    public final String j;
    public final String k;

    public qyi1(String str, String str2, String str3, String str4) {
        super((byte) 21);
        this.h = str;
        this.i = str2;
        this.j = str3;
        this.k = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qyi1)) {
            return false;
        }
        qyi1 qyi1Var = (qyi1) obj;
        return this.h.equals(qyi1Var.h) && this.i.equals(qyi1Var.i) && this.j.equals(qyi1Var.j) && this.k.equals(qyi1Var.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + cy30.d(cy30.d(this.h.hashCode() * 31, 31, this.i), 31, this.j);
    }
}
