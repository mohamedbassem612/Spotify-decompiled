package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class eph implements iph {
    public final ace0 a;

    public eph(ace0 ace0Var) {
        this.a = ace0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eph) && this.a.equals(((eph) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
