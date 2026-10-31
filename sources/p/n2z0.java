package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class n2z0 implements o2z0 {
    public final oho1 a;

    public n2z0(oho1 oho1Var) {
        this.a = oho1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n2z0) && this.a.equals(((n2z0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
