package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class isq0 {
    public final wsq0 a;
    public final v3d b;
    public final boolean c;

    public isq0(wsq0 wsq0Var, v3d v3dVar, boolean z) {
        this.a = wsq0Var;
        this.b = v3dVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isq0)) {
            return false;
        }
        isq0 isq0Var = (isq0) obj;
        return this.a.equals(isq0Var.a) && u890.j(this.b, isq0Var.b) && this.c == isq0Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        v3d v3dVar = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (v3dVar == null ? 0 : v3dVar.hashCode())) * 31);
    }
}
