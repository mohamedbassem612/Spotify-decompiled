package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xjk extends jkk {
    public final h290 a;
    public final String b;

    public xjk(String str, h290 h290Var) {
        this.a = h290Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xjk)) {
            return false;
        }
        xjk xjkVar = (xjk) obj;
        return this.a.equals(xjkVar.a) && u890.j(this.b, xjkVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
