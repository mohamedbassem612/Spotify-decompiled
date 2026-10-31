package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xmg0 extends ymg0 {
    public final umg0 a;

    public xmg0(umg0 umg0Var) {
        this.a = umg0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xmg0) && this.a.equals(((xmg0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
