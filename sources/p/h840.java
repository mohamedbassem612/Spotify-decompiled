package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class h840 implements l840 {
    public final String a;
    public final int b;
    public final String c;
    public final boolean d;

    public h840(int i, String str, String str2, boolean z) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = z;
    }

    public final boolean a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h840)) {
            return false;
        }
        h840 h840Var = (h840) obj;
        return this.a.equals(h840Var.a) && this.b == h840Var.b && u890.j(this.c, h840Var.c) && this.d == h840Var.d;
    }

    public final int hashCode() {
        int iK = ab80.k(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        return Boolean.hashCode(this.d) + ((iK + (str == null ? 0 : str.hashCode())) * 31);
    }
}
