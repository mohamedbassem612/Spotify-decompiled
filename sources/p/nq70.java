package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nq70 {
    public final String a;
    public final String b;
    public final Integer c;
    public final Integer d;

    public nq70(Integer num, Integer num2, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = num;
        this.d = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nq70)) {
            return false;
        }
        nq70 nq70Var = (nq70) obj;
        return this.a.equals(nq70Var.a) && this.b.equals(nq70Var.b) && this.c.equals(nq70Var.c) && this.d.equals(nq70Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + pze0.e(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
