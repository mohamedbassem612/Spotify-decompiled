package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class cse1 extends ese1 {
    public final srt0 a;

    public cse1(srt0 srt0Var) {
        this.a = srt0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cse1) && this.a.equals(((cse1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
