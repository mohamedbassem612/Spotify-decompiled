package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fdc0 implements idc0 {
    public final String a;
    public final int b;

    public fdc0(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fdc0)) {
            return false;
        }
        fdc0 fdc0Var = (fdc0) obj;
        return u890.j(this.a, fdc0Var.a) && this.b == fdc0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
