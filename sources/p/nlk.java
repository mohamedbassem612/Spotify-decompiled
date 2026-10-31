package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nlk extends vlk {
    public final lto0 a;

    public nlk(lto0 lto0Var) {
        this.a = lto0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nlk) && this.a.equals(((nlk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
