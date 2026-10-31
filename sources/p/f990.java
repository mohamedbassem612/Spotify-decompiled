package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class f990 implements g990 {
    public final y990 a;

    public f990(y990 y990Var) {
        this.a = y990Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f990) && this.a == ((f990) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
