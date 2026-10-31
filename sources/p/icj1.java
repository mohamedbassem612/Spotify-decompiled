package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class icj1 {
    public final uoa a;
    public final fv0 b;
    public final boolean c;

    public icj1(uoa uoaVar, fv0 fv0Var, boolean z) {
        this.a = uoaVar;
        this.b = fv0Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof icj1) {
            icj1 icj1Var = (icj1) obj;
            if (u890.j(this.a, icj1Var.a) && this.b == icj1Var.b && this.c == icj1Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
