package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ia3 {
    public final fa3 a;
    public final String b;
    public final int c;

    public ia3(fa3 fa3Var, String str, int i) {
        this.a = fa3Var;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ia3)) {
            return false;
        }
        ia3 ia3Var = (ia3) obj;
        return u890.j(this.a, ia3Var.a) && u890.j(this.b, ia3Var.b) && this.c == ia3Var.c;
    }

    public final int hashCode() {
        fa3 fa3Var = this.a;
        int iHashCode = (fa3Var == null ? 0 : fa3Var.hashCode()) * 31;
        String str = this.b;
        return l1d.C(this.c) + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }
}
