package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ovk {
    public final r591 a;

    public ovk(r591 r591Var) {
        this.a = r591Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ovk) && this.a == ((ovk) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
