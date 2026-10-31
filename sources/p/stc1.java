package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class stc1 implements ttc1 {
    public final String a;
    public final String b;
    public final utc1 c;
    public final j2i d;

    public stc1(String str, String str2, utc1 utc1Var, j2i j2iVar) {
        this.a = str;
        this.b = str2;
        this.c = utc1Var;
        this.d = j2iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof stc1) {
            stc1 stc1Var = (stc1) obj;
            return this.a.equals(stc1Var.a) && this.b.equals(stc1Var.b) && this.c.equals(stc1Var.c) && this.d == stc1Var.d;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31);
    }
}
