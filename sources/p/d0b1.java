package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class d0b1 {
    public final ji0 a;
    public final boolean b;

    public d0b1(ji0 ji0Var, boolean z) {
        this.a = ji0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0b1)) {
            return false;
        }
        d0b1 d0b1Var = (d0b1) obj;
        return u890.j(this.a, d0b1Var.a) && this.b == d0b1Var.b;
    }

    public final int hashCode() {
        ji0 ji0Var = this.a;
        return Boolean.hashCode(this.b) + ((ji0Var == null ? 0 : ji0Var.hashCode()) * 31);
    }
}
