package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dba0 implements gba0 {
    public final no90 a;

    public dba0(no90 no90Var) {
        this.a = no90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dba0) && this.a.equals(((dba0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
