package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class n300 implements y600 {
    public final String a;
    public final rz21 b;
    public final String c;

    public n300(String str, rz21 rz21Var, String str2) {
        this.a = str;
        this.b = rz21Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n300)) {
            return false;
        }
        n300 n300Var = (n300) obj;
        if (!this.a.equals(n300Var.a) || !this.b.equals(n300Var.b)) {
            return false;
        }
        String str = n300Var.c;
        nl7 nl7Var = bp21.b;
        return u890.j(this.c, str);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        nl7 nl7Var = bp21.b;
        return this.c.hashCode() + iHashCode;
    }
}
