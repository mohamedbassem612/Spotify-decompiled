package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mh21 {
    public final x4i1 a;
    public final String b;
    public final String c;
    public final String d;

    public mh21(x4i1 x4i1Var, String str, String str2, String str3) {
        this.a = x4i1Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mh21)) {
            return false;
        }
        mh21 mh21Var = (mh21) obj;
        return u890.j(this.a, mh21Var.a) && u890.j(this.b, mh21Var.b) && u890.j(this.c, mh21Var.c) && u890.j(this.d, mh21Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
