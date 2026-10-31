package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bxk implements fxk {
    public final r591 a;

    public bxk(r591 r591Var) {
        this.a = r591Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bxk) && this.a == ((bxk) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
