package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qb40 extends rb40 {
    public final int a;
    public final String b;

    public qb40(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qb40)) {
            return false;
        }
        qb40 qb40Var = (qb40) obj;
        return this.a == qb40Var.a && this.b.equals(qb40Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
