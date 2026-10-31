package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class bo3 extends qxd0 {
    public final dia1 d;
    public final uia1 e;

    public bo3(dia1 dia1Var, uia1 uia1Var) {
        this.d = dia1Var;
        this.e = uia1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bo3)) {
            return false;
        }
        bo3 bo3Var = (bo3) obj;
        return this.d == bo3Var.d && this.e.equals(bo3Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }
}
