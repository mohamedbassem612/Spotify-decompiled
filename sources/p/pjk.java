package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class pjk {
    public final h290 a;
    public final String b;

    public pjk(String str, h290 h290Var) {
        this.a = h290Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pjk)) {
            return false;
        }
        pjk pjkVar = (pjk) obj;
        return this.a.equals(pjkVar.a) && u890.j(this.b, pjkVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
