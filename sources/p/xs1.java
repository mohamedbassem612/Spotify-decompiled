package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xs1 implements bt1 {
    public final pia1 a;

    public xs1(pia1 pia1Var) {
        this.a = pia1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xs1) && this.a == ((xs1) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
