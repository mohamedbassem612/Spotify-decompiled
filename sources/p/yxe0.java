package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yxe0 {
    public final zzy a;
    public final String b;
    public final String c;

    public yxe0(zzy zzyVar, String str, String str2) {
        this.a = zzyVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yxe0)) {
            return false;
        }
        yxe0 yxe0Var = (yxe0) obj;
        return u890.j(this.a, yxe0Var.a) && u890.j(this.b, yxe0Var.b) && u890.j(this.c, yxe0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
