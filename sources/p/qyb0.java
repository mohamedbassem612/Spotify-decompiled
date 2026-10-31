package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class qyb0 {
    public static final pyb0 Companion = new pyb0();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final f3g1 i;
    public final String j;
    public final y8o k;
    public final String l;

    public /* synthetic */ qyb0(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, f3g1 f3g1Var, String str9, y8o y8oVar, String str10) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str5;
        }
        if ((i & 32) == 0) {
            this.f = "";
        } else {
            this.f = str6;
        }
        if ((i & 64) == 0) {
            this.g = "";
        } else {
            this.g = str7;
        }
        if ((i & 128) == 0) {
            this.h = "";
        } else {
            this.h = str8;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = f3g1Var;
        }
        if ((i & 512) == 0) {
            this.j = "";
        } else {
            this.j = str9;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = y8oVar;
        }
        if ((i & 2048) == 0) {
            this.l = "";
        } else {
            this.l = str10;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qyb0)) {
            return false;
        }
        qyb0 qyb0Var = (qyb0) obj;
        return u890.j(this.a, qyb0Var.a) && u890.j(this.b, qyb0Var.b) && u890.j(this.c, qyb0Var.c) && u890.j(this.d, qyb0Var.d) && u890.j(this.e, qyb0Var.e) && u890.j(this.f, qyb0Var.f) && u890.j(this.g, qyb0Var.g) && u890.j(this.h, qyb0Var.h) && u890.j(this.i, qyb0Var.i) && u890.j(this.j, qyb0Var.j) && u890.j(this.k, qyb0Var.k) && u890.j(this.l, qyb0Var.l);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
        f3g1 f3g1Var = this.i;
        int iD2 = cy30.d((iD + (f3g1Var == null ? 0 : f3g1Var.hashCode())) * 31, 31, this.j);
        y8o y8oVar = this.k;
        return this.l.hashCode() + ((iD2 + (y8oVar != null ? y8oVar.hashCode() : 0)) * 31);
    }
}
