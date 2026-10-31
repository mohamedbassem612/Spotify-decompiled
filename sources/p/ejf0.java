package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ejf0 implements fjf0 {
    public final wm21 a;

    public ejf0(wm21 wm21Var) {
        this.a = wm21Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ejf0) && this.a.equals(((ejf0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
