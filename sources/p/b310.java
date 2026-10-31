package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class b310 implements d310 {
    public final vol a;
    public final lpl b;

    public b310(vol volVar, lpl lplVar) {
        this.a = volVar;
        this.b = lplVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b310)) {
            return false;
        }
        b310 b310Var = (b310) obj;
        return this.a.equals(b310Var.a) && this.b.equals(b310Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
