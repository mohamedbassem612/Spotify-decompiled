package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class cnh1 {
    public final zmh1 a;
    public final String b;

    public cnh1(zmh1 zmh1Var, String str) {
        this.a = zmh1Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cnh1)) {
            return false;
        }
        cnh1 cnh1Var = (cnh1) obj;
        return u890.j(this.a, cnh1Var.a) && u890.j(this.b, cnh1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
