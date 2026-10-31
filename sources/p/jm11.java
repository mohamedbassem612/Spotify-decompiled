package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jm11 {
    public final etd a;

    public jm11(etd etdVar) {
        this.a = etdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jm11) && this.a.equals(((jm11) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
