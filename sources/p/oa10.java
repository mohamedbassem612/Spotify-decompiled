package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class oa10 {
    public final String a;
    public final String b;
    public final hux c;
    public final boolean d;

    public oa10(String str, String str2, hux huxVar, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = huxVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oa10)) {
            return false;
        }
        oa10 oa10Var = (oa10) obj;
        return this.a.equals(oa10Var.a) && this.b.equals(oa10Var.b) && u890.j(this.c, oa10Var.c) && this.d == oa10Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + eqq.k(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
