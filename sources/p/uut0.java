package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class uut0 {
    public final int a;
    public final String b;
    public final String c;
    public final String d;

    public uut0(String str, String str2, int i, String str3) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uut0)) {
            return false;
        }
        uut0 uut0Var = (uut0) obj;
        return this.a == uut0Var.a && u890.j(this.b, uut0Var.b) && u890.j(this.c, uut0Var.c) && u890.j(this.d, uut0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(l1d.C(this.a) * 31, 31, this.b), 31, this.c);
    }

    public /* synthetic */ uut0() {
        this("", "", 1, "");
    }
}
