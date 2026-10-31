package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class p5m extends e6m {
    public final h290 a;
    public final String b;

    public p5m(String str, h290 h290Var) {
        this.a = h290Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p5m)) {
            return false;
        }
        p5m p5mVar = (p5m) obj;
        return this.a.equals(p5mVar.a) && u890.j(this.b, p5mVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
