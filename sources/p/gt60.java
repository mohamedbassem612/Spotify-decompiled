package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class gt60 extends jto1 {
    public final whz b;

    public gt60(whz whzVar) {
        this.b = whzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gt60) && this.b.equals(((gt60) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
