package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class fc60 {
    public final String a;
    public final String b;
    public final cmt c;
    public final int d;
    public final String e;
    public final boolean f;

    public fc60(String str, String str2, cmt cmtVar, int i, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = cmtVar;
        this.d = i;
        this.e = str3;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fc60)) {
            return false;
        }
        fc60 fc60Var = (fc60) obj;
        return u890.j(this.a, fc60Var.a) && u890.j(this.b, fc60Var.b) && u890.j(this.c, fc60Var.c) && this.d == fc60Var.d && u890.j(this.e, fc60Var.e) && this.f == fc60Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + cy30.d(kaa0.f(this.d, (this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31, 31), 31, this.e);
    }
}
