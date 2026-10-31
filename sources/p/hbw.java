package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hbw {
    public final yad0 a;

    public hbw(yad0 yad0Var) {
        this.a = yad0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hbw) && this.a.equals(((hbw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
