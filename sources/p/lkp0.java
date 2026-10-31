package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class lkp0 extends tkp0 {
    public final d2l a;

    public lkp0(d2l d2lVar) {
        this.a = d2lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lkp0) && this.a.equals(((lkp0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
