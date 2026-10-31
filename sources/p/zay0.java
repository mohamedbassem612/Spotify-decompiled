package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zay0 {
    public final wa71 a;
    public final z771 b;

    public zay0(wa71 wa71Var, z771 z771Var) {
        this.a = wa71Var;
        this.b = z771Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zay0)) {
            return false;
        }
        zay0 zay0Var = (zay0) obj;
        return u890.j(this.a, zay0Var.a) && u890.j(this.b, zay0Var.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }
}
