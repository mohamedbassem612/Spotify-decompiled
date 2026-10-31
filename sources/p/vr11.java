package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vr11 extends xr11 {
    public final id2 a;
    public final String b;

    public vr11(id2 id2Var, String str) {
        this.a = id2Var;
        this.b = str;
    }

    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vr11)) {
            return false;
        }
        vr11 vr11Var = (vr11) obj;
        return u890.j(this.a, vr11Var.a) && u890.j(this.b, vr11Var.b);
    }

    public final int hashCode() {
        id2 id2Var = this.a;
        int iHashCode = (id2Var == null ? 0 : id2Var.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
