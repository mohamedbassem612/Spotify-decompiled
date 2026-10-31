package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class yh extends wwo1 {
    public final jce b;

    public yh(jce jceVar) {
        this.b = jceVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yh) && this.b.equals(((yh) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
