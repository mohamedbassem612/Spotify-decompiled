package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class e9y0 {
    public final a3y0 a;

    public e9y0(a3y0 a3y0Var) {
        this.a = a3y0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e9y0) && this.a.equals(((e9y0) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
