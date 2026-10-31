package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class lz60 implements oz60 {
    public final String a;
    public final co0 b;

    public lz60(String str, co0 co0Var) {
        this.a = str;
        this.b = co0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lz60)) {
            return false;
        }
        lz60 lz60Var = (lz60) obj;
        return u890.j(this.a, lz60Var.a) && this.b == lz60Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
