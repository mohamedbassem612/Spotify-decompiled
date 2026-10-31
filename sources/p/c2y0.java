package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class c2y0 {
    public final boolean a;
    public final cio b;

    public c2y0(boolean z, cio cioVar) {
        this.a = z;
        this.b = cioVar;
    }

    public static c2y0 a(c2y0 c2y0Var, boolean z, cio cioVar, int i) {
        if ((i & 1) != 0) {
            z = c2y0Var.a;
        }
        if ((i & 2) != 0) {
            cioVar = c2y0Var.b;
        }
        return new c2y0(z, cioVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2y0)) {
            return false;
        }
        c2y0 c2y0Var = (c2y0) obj;
        return this.a == c2y0Var.a && u890.j(this.b, c2y0Var.b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        cio cioVar = this.b;
        return iHashCode + (cioVar == null ? 0 : cioVar.hashCode());
    }
}
