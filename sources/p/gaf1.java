package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gaf1 {
    public final rx7 a;
    public final boolean b;

    public gaf1(rx7 rx7Var, boolean z) {
        this.a = rx7Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gaf1)) {
            return false;
        }
        gaf1 gaf1Var = (gaf1) obj;
        return u890.j(this.a, gaf1Var.a) && this.b == gaf1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
