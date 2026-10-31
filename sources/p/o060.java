package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class o060 {
    public final gd80 a;

    public o060(gd80 gd80Var) {
        this.a = gd80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o060) && u890.j(this.a, ((o060) obj).a);
    }

    public final int hashCode() {
        gd80 gd80Var = this.a;
        if (gd80Var == null) {
            return 0;
        }
        return gd80Var.hashCode();
    }
}
