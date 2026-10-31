package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jjf {
    public final mjf a;

    public jjf(mjf mjfVar) {
        this.a = mjfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jjf) && this.a.equals(((jjf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
