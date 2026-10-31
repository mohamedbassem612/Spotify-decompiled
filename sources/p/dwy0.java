package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@o661
public final class dwy0 {
    public static final cwy0 Companion = new cwy0();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public /* synthetic */ dwy0(int i, String str, String str2, String str3, String str4, String str5) {
        if (15 != (i & 15)) {
            o6p1.t(i, 15, bwy0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dwy0)) {
            return false;
        }
        dwy0 dwy0Var = (dwy0) obj;
        return u890.j(this.a, dwy0Var.a) && u890.j(this.b, dwy0Var.b) && u890.j(this.c, dwy0Var.c) && u890.j(this.d, dwy0Var.d) && u890.j(this.e, dwy0Var.e);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        return iD + (str == null ? 0 : str.hashCode());
    }

    public dwy0(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }
}
