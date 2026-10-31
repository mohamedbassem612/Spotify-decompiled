package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mlb {
    public final zc8 a;
    public final zoy0 b;

    public mlb(zc8 zc8Var, zoy0 zoy0Var) {
        this.a = zc8Var;
        this.b = zoy0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mlb)) {
            return false;
        }
        mlb mlbVar = (mlb) obj;
        return this.a.equals(mlbVar.a) && u890.j(this.b, mlbVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        zoy0 zoy0Var = this.b;
        return iHashCode + (zoy0Var == null ? 0 : zoy0Var.hashCode());
    }
}
