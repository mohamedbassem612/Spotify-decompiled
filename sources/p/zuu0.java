package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zuu0 implements cvu0 {
    public final String a;
    public final String b;
    public final String c;
    public final w4i1 d;
    public final String e;
    public final String f;

    public zuu0(String str, String str2, String str3, w4i1 w4i1Var, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = w4i1Var;
        this.e = str4;
        this.f = str5;
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
        if (!(obj instanceof zuu0)) {
            return false;
        }
        zuu0 zuu0Var = (zuu0) obj;
        return u890.j(this.a, zuu0Var.a) && u890.j(this.b, zuu0Var.b) && u890.j(this.c, zuu0Var.c) && u890.j(this.d, zuu0Var.d) && u890.j(this.e, zuu0Var.e) && u890.j(this.f, zuu0Var.f);
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
        return this.f.hashCode() + cy30.d(ydh.d(this.d, cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e);
    }
}
