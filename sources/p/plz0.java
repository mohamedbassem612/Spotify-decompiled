package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@o661
public final class plz0 {
    public static final olz0 Companion = new olz0();
    public static final znb0[] g = {dm5.S(2, ijz0.d), null, null, null, null, null};
    public final slz0 a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;

    public /* synthetic */ plz0(int i, slz0 slz0Var, String str, String str2, String str3, String str4, int i2) {
        this.a = (i & 1) == 0 ? slz0.b : slz0Var;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str4;
        }
        if ((i & 32) == 0) {
            this.f = 0;
        } else {
            this.f = i2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof plz0)) {
            return false;
        }
        plz0 plz0Var = (plz0) obj;
        return this.a == plz0Var.a && u890.j(this.b, plz0Var.b) && u890.j(this.c, plz0Var.c) && u890.j(this.d, plz0Var.d) && u890.j(this.e, plz0Var.e) && this.f == plz0Var.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public plz0() {
        this.a = slz0.b;
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = 0;
    }
}
