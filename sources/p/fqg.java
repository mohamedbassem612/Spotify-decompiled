package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fqg {
    public final String a;
    public final byte b;
    public final orc0 c;
    public final int d;

    /* JADX WARN: Multi-variable type inference failed */
    public fqg(int i, int i2, String str, orc0 orc0Var) {
        this.a = str;
        this.b = i;
        this.c = orc0Var;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fqg)) {
            return false;
        }
        fqg fqgVar = (fqg) obj;
        return this.a.equals(fqgVar.a) && this.b == fqgVar.b && this.c.equals(fqgVar.c) && this.d == fqgVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + ((this.c.hashCode() + kaa0.f(this.b, this.a.hashCode() * 31, 31)) * 31);
    }
}
