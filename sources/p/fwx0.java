package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fwx0 {
    public final String a;
    public final String b;

    public fwx0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fwx0)) {
            return false;
        }
        fwx0 fwx0Var = (fwx0) obj;
        return u890.j(this.a, fwx0Var.a) && u890.j(this.b, fwx0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
