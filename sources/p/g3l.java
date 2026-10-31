package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class g3l {
    public final f3l a;
    public final c2l b;

    public g3l(f3l f3lVar, c2l c2lVar) {
        this.a = f3lVar;
        this.b = c2lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g3l)) {
            return false;
        }
        g3l g3lVar = (g3l) obj;
        return this.a.equals(g3lVar.a) && u890.j(this.b, g3lVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
