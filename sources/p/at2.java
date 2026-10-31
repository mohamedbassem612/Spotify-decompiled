package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class at2 {
    public final String a;
    public final zs2 b;

    public at2(String str, zs2 zs2Var) {
        this.a = str;
        this.b = zs2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof at2)) {
            return false;
        }
        at2 at2Var = (at2) obj;
        return this.a.equals(at2Var.a) && u890.j(this.b, at2Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        zs2 zs2Var = this.b;
        return iHashCode + (zs2Var == null ? 0 : zs2Var.hashCode());
    }
}
