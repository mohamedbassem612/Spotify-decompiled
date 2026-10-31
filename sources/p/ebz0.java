package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ebz0 {
    public final boolean a;
    public final eko1 b;

    public ebz0(boolean z, eko1 eko1Var) {
        this.a = z;
        this.b = eko1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ebz0)) {
            return false;
        }
        ebz0 ebz0Var = (ebz0) obj;
        return this.a == ebz0Var.a && this.b.equals(ebz0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
