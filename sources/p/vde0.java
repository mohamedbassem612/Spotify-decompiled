package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class vde0 {
    public final String a;
    public final int b;

    public vde0(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vde0)) {
            return false;
        }
        vde0 vde0Var = (vde0) obj;
        return this.a.equals(vde0Var.a) && this.b == vde0Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }
}
