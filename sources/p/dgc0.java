package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dgc0 {
    public static final a1i b = new a1i(f7c0.Y, gsh.Y);
    public final ir61 a;

    public dgc0(ir61 ir61Var) {
        this.a = ir61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dgc0) && this.a.equals(((dgc0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
