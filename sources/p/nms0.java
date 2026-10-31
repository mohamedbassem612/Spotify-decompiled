package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nms0 implements pms0 {
    public final String a;
    public final String b;
    public final String c;

    public nms0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nms0)) {
            return false;
        }
        nms0 nms0Var = (nms0) obj;
        return u890.j(this.a, nms0Var.a) && u890.j(this.b, nms0Var.b) && u890.j(this.c, nms0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
