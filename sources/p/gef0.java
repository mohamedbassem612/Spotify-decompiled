package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gef0 {
    public final a9h a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public gef0(a9h a9hVar, String str, String str2, String str3, String str4, String str5) {
        this.a = a9hVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gef0)) {
            return false;
        }
        gef0 gef0Var = (gef0) obj;
        return this.a.equals(gef0Var.a) && this.b.equals(gef0Var.b) && this.c.equals(gef0Var.c) && this.d.equals(gef0Var.d) && this.e.equals(gef0Var.e) && this.f.equals(gef0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }
}
