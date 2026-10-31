package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mff1 {
    public final String a;
    public final tv80 b;

    public mff1(String str, tv80 tv80Var) {
        this.a = str;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mff1)) {
            return false;
        }
        mff1 mff1Var = (mff1) obj;
        return u890.j(this.a, mff1Var.a) && this.b.equals(mff1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
