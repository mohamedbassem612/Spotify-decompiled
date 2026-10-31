package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class bvu0 implements cvu0 {
    public final String a;
    public final String b;
    public final String c;
    public final w4i1 d;
    public final String e;

    public bvu0(String str, String str2, String str3, w4i1 w4i1Var, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = w4i1Var;
        this.e = str4;
    }

    public final String a() {
        return this.e;
    }

    public final String d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bvu0)) {
            return false;
        }
        bvu0 bvu0Var = (bvu0) obj;
        return u890.j(this.a, bvu0Var.a) && u890.j(this.b, bvu0Var.b) && u890.j(this.c, bvu0Var.c) && u890.j(this.d, bvu0Var.d) && u890.j(this.e, bvu0Var.e);
    }

    public final String getId() {
        return this.a;
    }

    public final String getPlaylistUri() {
        return this.c;
    }

    public final w4i1 getSender() {
        return this.d;
    }

    public final int hashCode() {
        return this.e.hashCode() + ydh.d(this.d, cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }
}
