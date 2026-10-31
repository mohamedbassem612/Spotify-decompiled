package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class r1f implements q3f {
    public final xwu a;

    public r1f(xwu xwuVar) {
        this.a = xwuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r1f) && u890.j(this.a, ((r1f) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
