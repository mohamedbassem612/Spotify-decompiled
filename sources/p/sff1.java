package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class sff1 implements uff1 {
    public final srt0 a;

    public sff1(srt0 srt0Var) {
        this.a = srt0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sff1) && u890.j(this.a, ((sff1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
