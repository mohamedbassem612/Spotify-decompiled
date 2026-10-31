package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class p4x0 extends i541 {
    public final myv d;

    public p4x0(myv myvVar) {
        this.d = myvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p4x0) && this.d.equals(((p4x0) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
