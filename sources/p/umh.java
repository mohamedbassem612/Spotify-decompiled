package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class umh {
    public final boolean a;
    public final njb0 b;
    public final boolean c;

    public umh(boolean z, njb0 njb0Var, boolean z2) {
        this.a = z;
        this.b = njb0Var;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof umh)) {
            return false;
        }
        umh umhVar = (umh) obj;
        return this.a == umhVar.a && u890.j(this.b, umhVar.b) && this.c == umhVar.c;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        njb0 njb0Var = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (njb0Var == null ? 0 : njb0Var.hashCode())) * 31);
    }
}
