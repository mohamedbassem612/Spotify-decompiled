package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ri00 {
    public final x720 a;

    public ri00(x720 x720Var) {
        this.a = x720Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ri00) && this.a.equals(((ri00) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
