package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lyi1 extends yoi1 {
    public final String h;
    public final String i;
    public final String j;

    public lyi1(String str, String str2, String str3) {
        super((byte) 21);
        this.h = str;
        this.i = str2;
        this.j = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lyi1)) {
            return false;
        }
        lyi1 lyi1Var = (lyi1) obj;
        return this.h.equals(lyi1Var.h) && this.i.equals(lyi1Var.i) && this.j.equals(lyi1Var.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + cy30.d(this.h.hashCode() * 31, 31, this.i);
    }
}
