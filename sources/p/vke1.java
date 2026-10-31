package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vke1 {
    public final String a;
    public final boolean b;

    public vke1(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vke1)) {
            return false;
        }
        vke1 vke1Var = (vke1) obj;
        return u890.j(this.a, vke1Var.a) && this.b == vke1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
