package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class o4d {
    public final qro1 a;
    public final boolean b;

    public o4d(qro1 qro1Var, boolean z) {
        this.a = qro1Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o4d)) {
            return false;
        }
        o4d o4dVar = (o4d) obj;
        return this.a.equals(o4dVar.a) && this.b == o4dVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
