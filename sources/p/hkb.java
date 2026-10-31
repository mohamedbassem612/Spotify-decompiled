package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class hkb {
    public final luq0 a;

    public hkb(luq0 luq0Var) {
        this.a = luq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hkb) && this.a == ((hkb) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
