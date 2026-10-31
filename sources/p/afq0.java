package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class afq0 implements ffq0 {
    public final v2g0 a;

    public afq0(v2g0 v2g0Var) {
        this.a = v2g0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof afq0) && this.a.equals(((afq0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
