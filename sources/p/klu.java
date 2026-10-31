package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class klu {
    public final dlu a;

    public klu(dlu dluVar) {
        this.a = dluVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof klu) && this.a.equals(((klu) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
