package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xqf1 {
    public final String a;
    public final tv80 b;

    public xqf1(String str, tv80 tv80Var) {
        this.a = str;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xqf1)) {
            return false;
        }
        xqf1 xqf1Var = (xqf1) obj;
        return u890.j(this.a, xqf1Var.a) && this.b.equals(xqf1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
