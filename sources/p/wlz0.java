package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@o661
public final class wlz0 {
    public static final vlz0 Companion = new vlz0();
    public final String a;
    public final String b;
    public final sgf1 c;
    public final bhf1 d;
    public final glc1 e;
    public final klc1 f;
    public final ooc1 g;
    public final roc1 h;
    public final fid0 i;
    public final ag1 j;
    public final String k;
    public final boolean l;

    public /* synthetic */ wlz0(int i, String str, String str2, sgf1 sgf1Var, bhf1 bhf1Var, glc1 glc1Var, klc1 klc1Var, ooc1 ooc1Var, roc1 roc1Var, fid0 fid0Var, ag1 ag1Var, String str3, boolean z) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, ulz0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = new sgf1();
        } else {
            this.c = sgf1Var;
        }
        if ((i & 8) == 0) {
            this.d = new bhf1();
        } else {
            this.d = bhf1Var;
        }
        if ((i & 16) == 0) {
            this.e = new glc1();
        } else {
            this.e = glc1Var;
        }
        if ((i & 32) == 0) {
            this.f = new klc1();
        } else {
            this.f = klc1Var;
        }
        if ((i & 64) == 0) {
            this.g = new ooc1();
        } else {
            this.g = ooc1Var;
        }
        if ((i & 128) == 0) {
            this.h = new roc1();
        } else {
            this.h = roc1Var;
        }
        if ((i & 256) == 0) {
            this.i = new fid0();
        } else {
            this.i = fid0Var;
        }
        if ((i & 512) == 0) {
            this.j = new ag1();
        } else {
            this.j = ag1Var;
        }
        if ((i & 1024) == 0) {
            this.k = "";
        } else {
            this.k = str3;
        }
        if ((i & 2048) == 0) {
            this.l = false;
        } else {
            this.l = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wlz0)) {
            return false;
        }
        wlz0 wlz0Var = (wlz0) obj;
        return u890.j(this.a, wlz0Var.a) && u890.j(this.b, wlz0Var.b) && u890.j(this.c, wlz0Var.c) && u890.j(this.d, wlz0Var.d) && u890.j(this.e, wlz0Var.e) && u890.j(this.f, wlz0Var.f) && u890.j(this.g, wlz0Var.g) && u890.j(this.h, wlz0Var.h) && u890.j(this.i, wlz0Var.i) && u890.j(this.j, wlz0Var.j) && u890.j(this.k, wlz0Var.k) && this.l == wlz0Var.l;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.l) + cy30.d((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.k);
    }
}
