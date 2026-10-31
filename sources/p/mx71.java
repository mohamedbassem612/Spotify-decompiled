package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mx71 implements vx71 {
    public final ew71 a;

    public mx71(ew71 ew71Var) {
        this.a = ew71Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mx71) && this.a == ((mx71) obj).a;
    }

    public final int hashCode() {
        ew71 ew71Var = this.a;
        if (ew71Var == null) {
            return 0;
        }
        return ew71Var.hashCode();
    }
}
