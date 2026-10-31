package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dxw extends gxw {
    public final qgo1 a;
    public final boolean b;

    public dxw(qgo1 qgo1Var, boolean z) {
        this.a = qgo1Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxw)) {
            return false;
        }
        dxw dxwVar = (dxw) obj;
        return this.a.equals(dxwVar.a) && this.b == dxwVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
