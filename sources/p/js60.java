package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class js60 {
    public final ps60 a;
    public final String b;
    public final kda0 c;
    public final String d;
    public final j16 e;

    public js60(ps60 ps60Var, String str, kda0 kda0Var, String str2, j16 j16Var) {
        this.a = ps60Var;
        this.b = str;
        this.c = kda0Var;
        this.d = str2;
        this.e = j16Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof js60)) {
            return false;
        }
        js60 js60Var = (js60) obj;
        return u890.j(this.a, js60Var.a) && u890.j(this.b, js60Var.b) && this.c == js60Var.c && u890.j(this.d, js60Var.d) && this.e == js60Var.e;
    }

    public final int hashCode() {
        ps60 ps60Var = this.a;
        int iHashCode = (this.c.hashCode() + cy30.d((ps60Var == null ? 0 : ps60Var.hashCode()) * 31, 31, this.b)) * 31;
        String str = this.d;
        return this.e.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }
}
