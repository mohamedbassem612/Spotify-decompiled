package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vp10 implements z0i {
    public final z0i a;
    public final z0i b;

    public vp10(z0i z0iVar, z0i z0iVar2) {
        this.a = z0iVar;
        this.b = z0iVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vp10)) {
            return false;
        }
        vp10 vp10Var = (vp10) obj;
        return u890.j(this.a, vp10Var.a) && u890.j(this.b, vp10Var.b);
    }

    public final int hashCode() {
        z0i z0iVar = this.a;
        int iHashCode = (z0iVar == null ? 0 : z0iVar.hashCode()) * 31;
        z0i z0iVar2 = this.b;
        return iHashCode + (z0iVar2 != null ? z0iVar2.hashCode() : 0);
    }
}
