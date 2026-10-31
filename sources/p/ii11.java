package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ii11 {
    public final ue21 a;
    public final int b;

    public ii11(ue21 ue21Var, int i) {
        this.a = ue21Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ii11)) {
            return false;
        }
        ii11 ii11Var = (ii11) obj;
        return this.a.equals(ii11Var.a) && this.b == ii11Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }
}
