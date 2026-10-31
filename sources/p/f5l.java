package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class f5l implements m5l {
    public final i5l a;
    public final hry0 b;

    public f5l(i5l i5lVar, hry0 hry0Var) {
        this.a = i5lVar;
        this.b = hry0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f5l)) {
            return false;
        }
        f5l f5lVar = (f5l) obj;
        return this.a.equals(f5lVar.a) && u890.j(this.b, f5lVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
