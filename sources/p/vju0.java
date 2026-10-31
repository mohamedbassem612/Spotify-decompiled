package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vju0 {
    public final int a;
    public final String b;
    public final aku0 c;

    public vju0(int i, String str, aku0 aku0Var) {
        this.a = i;
        this.b = str;
        this.c = aku0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vju0)) {
            return false;
        }
        vju0 vju0Var = (vju0) obj;
        return this.a == vju0Var.a && u890.j(this.b, vju0Var.b) && u890.j(this.c, vju0Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(l1d.C(this.a) * 31, 31, this.b);
        aku0 aku0Var = this.c;
        return iD + (aku0Var == null ? 0 : aku0Var.hashCode());
    }
}
