package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fz1 {
    public final String a;
    public final String b;

    public fz1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fz1)) {
            return false;
        }
        fz1 fz1Var = (fz1) obj;
        return u890.j(this.a, fz1Var.a) && u890.j(this.b, fz1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
