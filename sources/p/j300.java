package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class j300 implements y600 {
    public final String a;
    public final rz21 b;
    public final int c;
    public final String d;

    public j300(String str, rz21 rz21Var, int i, String str2) {
        this.a = str;
        this.b = rz21Var;
        this.c = i;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j300)) {
            return false;
        }
        j300 j300Var = (j300) obj;
        if (!u890.j(this.a, j300Var.a) || !this.b.equals(j300Var.b) || this.c != j300Var.c) {
            return false;
        }
        String str = j300Var.d;
        nl7 nl7Var = bp21.b;
        return this.d.equals(str);
    }

    public final int hashCode() {
        int iF = kaa0.f(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
        nl7 nl7Var = bp21.b;
        return this.d.hashCode() + iF;
    }
}
