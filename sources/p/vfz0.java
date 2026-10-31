package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vfz0 {
    public final int a;
    public final String b;

    public vfz0(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vfz0)) {
            return false;
        }
        vfz0 vfz0Var = (vfz0) obj;
        return this.a == vfz0Var.a && u890.j(this.b, vfz0Var.b);
    }

    public final int hashCode() {
        int iC = l1d.C(this.a) * 31;
        String str = this.b;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
