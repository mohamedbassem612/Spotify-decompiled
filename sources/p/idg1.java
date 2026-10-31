package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class idg1 implements z0i {
    public final hdg1 a;
    public final boolean b;

    public idg1(hdg1 hdg1Var, boolean z) {
        this.a = hdg1Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof idg1)) {
            return false;
        }
        idg1 idg1Var = (idg1) obj;
        return this.a.equals(idg1Var.a) && this.b == idg1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
