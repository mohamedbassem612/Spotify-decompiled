package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class oq01 {
    public final String a;
    public final String b;
    public final x360 c;
    public final String d;
    public final boolean e;

    public oq01(String str, String str2, x360 x360Var, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = x360Var;
        this.d = str3;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oq01)) {
            return false;
        }
        oq01 oq01Var = (oq01) obj;
        return this.a.equals(oq01Var.a) && this.b.equals(oq01Var.b) && u890.j(this.c, oq01Var.c) && this.d.equals(oq01Var.d) && this.e == oq01Var.e;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        x360 x360Var = this.c;
        return Boolean.hashCode(this.e) + cy30.d((iD + (x360Var == null ? 0 : x360Var.hashCode())) * 31, 31, this.d);
    }
}
