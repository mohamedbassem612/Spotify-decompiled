package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class usm0 implements xsm0 {
    public final jtm0 a;

    public usm0(jtm0 jtm0Var) {
        this.a = jtm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof usm0) && this.a.equals(((usm0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
