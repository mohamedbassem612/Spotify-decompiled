package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class po90 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;

    public po90(boolean z, boolean z2, String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
    }

    public static po90 a(po90 po90Var, String str, String str2) {
        return new po90(po90Var.d, po90Var.e, str, po90Var.b, str2);
    }

    public final String b() {
        return this.b;
    }

    public final boolean c() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof po90)) {
            return false;
        }
        po90 po90Var = (po90) obj;
        return this.a.equals(po90Var.a) && u890.j(this.b, po90Var.b) && u890.j(this.c, po90Var.c) && this.d == po90Var.d && this.e == po90Var.e;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(this.e) + xcg1.g((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
    }
}
