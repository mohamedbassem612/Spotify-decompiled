package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class uup0 extends xup0 {
    public final hvl1 a;

    public uup0(hvl1 hvl1Var) {
        this.a = hvl1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uup0) && this.a.equals(((uup0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() - 1150326230;
    }
}
