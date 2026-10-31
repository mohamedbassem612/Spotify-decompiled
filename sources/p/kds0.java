package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@o661
public final class kds0 {
    public static final jds0 Companion = new jds0();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public /* synthetic */ kds0(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        if (127 != (i & 127)) {
            o6p1.t(i, 127, ids0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kds0)) {
            return false;
        }
        kds0 kds0Var = (kds0) obj;
        return u890.j(this.a, kds0Var.a) && u890.j(this.b, kds0Var.b) && u890.j(this.c, kds0Var.c) && u890.j(this.d, kds0Var.d) && u890.j(this.e, kds0Var.e) && u890.j(this.f, kds0Var.f) && u890.j(this.g, kds0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public kds0(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }
}
