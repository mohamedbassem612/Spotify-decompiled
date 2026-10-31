package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vkg1 {
    public final String a;
    public final boolean b;

    public vkg1(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vkg1)) {
            return false;
        }
        vkg1 vkg1Var = (vkg1) obj;
        return this.a.equals(vkg1Var.a) && this.b == vkg1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
