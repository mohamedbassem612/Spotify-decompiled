package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wup0 extends xup0 {
    public final hvl1 a;

    public wup0(hvl1 hvl1Var) {
        this.a = hvl1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wup0) && this.a.equals(((wup0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() - 1150326230;
    }
}
