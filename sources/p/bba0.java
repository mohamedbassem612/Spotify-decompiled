package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bba0 implements gba0 {
    public final no90 a;

    public bba0(no90 no90Var) {
        this.a = no90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bba0) && this.a.equals(((bba0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
