package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gaf0 extends xaf0 {
    public final igb a;

    public gaf0(igb igbVar) {
        this.a = igbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gaf0) && this.a.equals(((gaf0) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
