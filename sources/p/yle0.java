package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yle0 extends hme0 {
    public final jj40 a;

    public yle0(jj40 jj40Var) {
        this.a = jj40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yle0) && this.a.equals(((yle0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
