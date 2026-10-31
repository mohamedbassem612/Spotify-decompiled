package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tx60 implements dbr0 {
    public final String a;
    public final r6h1 b;

    public tx60(int i, String str, r6h1 r6h1Var) {
        str = (i & 2) != 0 ? null : str;
        r6h1Var = (i & 4) != 0 ? r6h1.c : r6h1Var;
        this.a = str;
        this.b = r6h1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tx60)) {
            return false;
        }
        tx60 tx60Var = (tx60) obj;
        return u890.j(this.a, tx60Var.a) && this.b.equals(tx60Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
