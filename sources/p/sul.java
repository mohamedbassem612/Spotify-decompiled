package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class sul implements cwl {
    public final i2n a;

    public sul(i2n i2nVar) {
        this.a = i2nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sul) && this.a.equals(((sul) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
