package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jh20 extends lh20 {
    public final atq0 a;

    public jh20(atq0 atq0Var) {
        this.a = atq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jh20) && this.a.equals(((jh20) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
