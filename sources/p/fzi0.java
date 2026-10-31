package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class fzi0 extends gzi0 {
    public final String a;
    public final wnw0 b;
    public final String c;

    public fzi0(String str, String str2, wnw0 wnw0Var) {
        this.a = str;
        this.b = wnw0Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fzi0)) {
            return false;
        }
        fzi0 fzi0Var = (fzi0) obj;
        return this.a.equals(fzi0Var.a) && this.b == fzi0Var.b && u890.j(this.c, fzi0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
