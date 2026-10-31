package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class law implements jiw {
    public final fde1 a;
    public final int b;

    public law(fde1 fde1Var, int i) {
        this.a = fde1Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof law)) {
            return false;
        }
        law lawVar = (law) obj;
        return this.a == lawVar.a && this.b == lawVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
