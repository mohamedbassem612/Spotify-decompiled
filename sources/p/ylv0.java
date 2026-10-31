package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ylv0 {
    public final uoa a;
    public final fv0 b;

    public ylv0(uoa uoaVar, fv0 fv0Var) {
        this.a = uoaVar;
        this.b = fv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ylv0) {
            ylv0 ylv0Var = (ylv0) obj;
            return u890.j(this.a, ylv0Var.a) && this.b == ylv0Var.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
