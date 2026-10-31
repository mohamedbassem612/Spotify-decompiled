package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tle0 extends hme0 {
    public final jj40 a;

    public tle0(jj40 jj40Var) {
        this.a = jj40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tle0) && this.a.equals(((tle0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
