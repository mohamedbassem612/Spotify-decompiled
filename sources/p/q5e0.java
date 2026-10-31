package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class q5e0 {
    public final uia a;
    public final int b;
    public final Float c;

    public q5e0(uia uiaVar, int i, Float f) {
        this.a = uiaVar;
        this.b = i;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q5e0)) {
            return false;
        }
        q5e0 q5e0Var = (q5e0) obj;
        return u890.j(this.a, q5e0Var.a) && this.b == q5e0Var.b && u890.j(this.c, q5e0Var.c);
    }

    public final int hashCode() {
        uia uiaVar = this.a;
        int iF = kaa0.f(this.b, (uiaVar == null ? 0 : uiaVar.hashCode()) * 31, 31);
        Float f = this.c;
        return iF + (f != null ? f.hashCode() : 0);
    }
}
