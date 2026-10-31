package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class yxe implements nye {
    public final String a;
    public final String b;
    public final gxz0 c;
    public final boolean d;

    public yxe(String str, String str2, gxz0 gxz0Var, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = gxz0Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yxe)) {
            return false;
        }
        yxe yxeVar = (yxe) obj;
        return u890.j(this.a, yxeVar.a) && u890.j(this.b, yxeVar.b) && this.c.equals(yxeVar.c) && this.d == yxeVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31);
    }
}
