package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class a211 extends d211 {
    public final srt0 a;

    public a211(srt0 srt0Var) {
        this.a = srt0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a211) && this.a.equals(((a211) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
