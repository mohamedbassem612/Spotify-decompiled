package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lzd {
    public final lkf1 a;
    public final Object b;

    public lzd(lkf1 lkf1Var, Object obj) {
        this.a = lkf1Var;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lzd)) {
            return false;
        }
        lzd lzdVar = (lzd) obj;
        return this.a == lzdVar.a && u890.j(this.b, lzdVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Object obj = this.b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }
}
