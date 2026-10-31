package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class woe0 {
    public final String a;
    public final moe0 b;
    public final String c;
    public final String d;

    public woe0(String str, moe0 moe0Var, String str2, String str3) {
        this.a = str;
        this.b = moe0Var;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof woe0)) {
            return false;
        }
        woe0 woe0Var = (woe0) obj;
        return u890.j(this.a, woe0Var.a) && u890.j(this.b, woe0Var.b) && u890.j(this.c, woe0Var.c) && u890.j(this.d, woe0Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public /* synthetic */ woe0() {
        this("", ioe0.a, null, null);
    }
}
