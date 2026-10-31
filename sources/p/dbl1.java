package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dbl1 extends kkn {
    public final String e;
    public final String f;
    public final String g;

    public dbl1(String str, String str2, String str3) {
        super((byte) 17);
        this.e = str;
        this.f = str2;
        this.g = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dbl1)) {
            return false;
        }
        dbl1 dbl1Var = (dbl1) obj;
        return this.e.equals(dbl1Var.e) && this.f.equals(dbl1Var.f) && this.g.equals(dbl1Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + cy30.d(this.e.hashCode() * 31, 31, this.f);
    }
}
