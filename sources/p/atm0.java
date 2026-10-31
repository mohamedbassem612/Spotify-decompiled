package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class atm0 implements etm0 {
    public final jtm0 a;

    public atm0(jtm0 jtm0Var) {
        this.a = jtm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof atm0) && this.a.equals(((atm0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
