package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class y4x0 extends i541 {
    public final String d;
    public final tv80 e;
    public final String f;

    public y4x0(String str, String str2, tv80 tv80Var) {
        this.d = str;
        this.e = tv80Var;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y4x0)) {
            return false;
        }
        y4x0 y4x0Var = (y4x0) obj;
        return u890.j(this.d, y4x0Var.d) && u890.j(this.e, y4x0Var.e) && u890.j(this.f, y4x0Var.f);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + (this.d.hashCode() * 31)) * 31;
        String str = this.f;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
