package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class s0e0 {
    public final uia a;
    public final uia b;
    public final long c;
    public final long d;
    public final Float e;
    public final Float f;

    public s0e0(uia uiaVar, uia uiaVar2, long j, long j2, Float f, Float f2) {
        this.a = uiaVar;
        this.b = uiaVar2;
        this.c = j;
        this.d = j2;
        this.e = f;
        this.f = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0e0)) {
            return false;
        }
        s0e0 s0e0Var = (s0e0) obj;
        return u890.j(this.a, s0e0Var.a) && u890.j(this.b, s0e0Var.b) && this.c == s0e0Var.c && this.d == s0e0Var.d && u890.j(this.e, s0e0Var.e) && u890.j(this.f, s0e0Var.f);
    }

    public final int hashCode() {
        uia uiaVar = this.a;
        int iHashCode = (uiaVar == null ? 0 : uiaVar.hashCode()) * 31;
        uia uiaVar2 = this.b;
        int iF = cy30.f(cy30.f((iHashCode + (uiaVar2 == null ? 0 : uiaVar2.hashCode())) * 31, this.c, 31), this.d, 31);
        Float f = this.e;
        int iHashCode2 = (iF + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.f;
        return iHashCode2 + (f2 != null ? f2.hashCode() : 0);
    }
}
