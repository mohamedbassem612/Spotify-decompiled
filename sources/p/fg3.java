package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fg3 {
    public final eg3 a;
    public final boolean b;

    public fg3(eg3 eg3Var, boolean z) {
        this.a = eg3Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fg3)) {
            return false;
        }
        fg3 fg3Var = (fg3) obj;
        return this.a.equals(fg3Var.a) && this.b == fg3Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
