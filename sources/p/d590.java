package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class d590 extends f590 {
    public final ncy a;

    public d590(ncy ncyVar) {
        this.a = ncyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d590) && this.a.equals(((d590) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
