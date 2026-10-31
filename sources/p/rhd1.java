package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class rhd1 {
    public final fpd a;
    public final boolean b;

    public rhd1(fpd fpdVar, boolean z) {
        this.a = fpdVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rhd1)) {
            return false;
        }
        rhd1 rhd1Var = (rhd1) obj;
        return u890.j(this.a, rhd1Var.a) && this.b == rhd1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
