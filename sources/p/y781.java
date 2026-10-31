package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@o661
public final class y781 {
    public static final x781 Companion = new x781();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;

    public /* synthetic */ y781(String str, int i, String str2, String str3, boolean z, String str4) {
        if (31 != (i & 31)) {
            o6p1.t(i, 31, w781.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y781)) {
            return false;
        }
        y781 y781Var = (y781) obj;
        return u890.j(this.a, y781Var.a) && u890.j(this.b, y781Var.b) && u890.j(this.c, y781Var.c) && u890.j(this.d, y781Var.d) && this.e == y781Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public y781(String str, String str2, String str3, String str4, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
    }
}
