package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bhi1 implements chi1 {
    public final String a;
    public final tv80 b;

    public bhi1(String str, tv80 tv80Var) {
        this.a = str;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bhi1)) {
            return false;
        }
        bhi1 bhi1Var = (bhi1) obj;
        return u890.j(this.a, bhi1Var.a) && this.b.equals(bhi1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
