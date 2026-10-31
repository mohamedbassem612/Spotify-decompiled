package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class oyc {
    public final rz21 a;

    public oyc(rz21 rz21Var) {
        this.a = rz21Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oyc) && u890.j(this.a, ((oyc) obj).a);
    }

    public final int hashCode() {
        rz21 rz21Var = this.a;
        if (rz21Var == null) {
            return 0;
        }
        return rz21Var.hashCode();
    }
}
