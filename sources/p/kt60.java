package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class kt60 extends jto1 {
    public final np21 b;

    public kt60(np21 np21Var) {
        this.b = np21Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kt60) && u890.j(this.b, ((kt60) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
