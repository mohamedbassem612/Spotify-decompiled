package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class m30 extends n30 {
    public final String a;
    public final x360 b;

    public m30(String str, x360 x360Var) {
        this.a = str;
        this.b = x360Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m30)) {
            return false;
        }
        m30 m30Var = (m30) obj;
        return u890.j(this.a, m30Var.a) && u890.j(this.b, m30Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        x360 x360Var = this.b;
        return iHashCode + (x360Var == null ? 0 : x360Var.hashCode());
    }
}
