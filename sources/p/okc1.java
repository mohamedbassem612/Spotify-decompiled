package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class okc1 {
    public final ohc1 a;

    public okc1(ohc1 ohc1Var) {
        this.a = ohc1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof okc1) && this.a.equals(((okc1) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
