package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ypg {
    public final String a;
    public final int b;
    public final byte c;
    public final orc0 d;

    /* JADX WARN: Multi-variable type inference failed */
    public ypg(int i, int i2, String str, orc0 orc0Var) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = orc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ypg)) {
            return false;
        }
        ypg ypgVar = (ypg) obj;
        return this.a.equals(ypgVar.a) && this.b == ypgVar.b && this.c == ypgVar.c && this.d.equals(ypgVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + kaa0.f(this.c, kaa0.f(this.b, this.a.hashCode() * 31, 31), 31);
    }
}
