package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class yjt0 {
    public final String a;
    public final wjt0 b;
    public final String c;

    public yjt0(String str, wjt0 wjt0Var, String str2) {
        this.a = str;
        this.b = wjt0Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yjt0)) {
            return false;
        }
        yjt0 yjt0Var = (yjt0) obj;
        return u890.j(this.a, yjt0Var.a) && this.b.equals(yjt0Var.b) && u890.j(this.c, yjt0Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
