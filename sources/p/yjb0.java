package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yjb0 extends fsa {
    public final pta a;

    public yjb0(pta ptaVar) {
        this.a = ptaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yjb0) && this.a.equals(((yjb0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
