package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vp80 extends jap1 {
    public final int c;
    public final String d;

    public vp80(int i, String str) {
        this.c = i;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vp80)) {
            return false;
        }
        vp80 vp80Var = (vp80) obj;
        return this.c == vp80Var.c && u890.j(this.d, vp80Var.d);
    }

    public final int hashCode() {
        int iK = ab80.k(1, ab80.k(this.c, l1d.C(2) * 31, 31), 31);
        String str = this.d;
        return iK + (str == null ? 0 : str.hashCode());
    }
}
