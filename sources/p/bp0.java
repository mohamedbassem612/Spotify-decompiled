package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class bp0 implements dp0 {
    public final g32 a;

    public bp0(g32 g32Var) {
        this.a = g32Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bp0) && this.a.equals(((bp0) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
