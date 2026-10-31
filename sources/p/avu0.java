package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class avu0 implements cvu0 {
    public final String a;
    public final String b;
    public final String c;
    public final w4i1 d;
    public final String e;
    public final boolean f;

    public avu0(String str, String str2, String str3, w4i1 w4i1Var, String str4, int i) {
        str = (i & 1) != 0 ? "" : str;
        str2 = (i & 2) != 0 ? "" : str2;
        w4i1Var = (i & 8) != 0 ? new w4i1("", "", 12, (String) null) : w4i1Var;
        str4 = (i & 16) != 0 ? "" : str4;
        boolean z = (i & 32) == 0;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = w4i1Var;
        this.e = str4;
        this.f = z;
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
        if (!(obj instanceof avu0)) {
            return false;
        }
        avu0 avu0Var = (avu0) obj;
        return this.a.equals(avu0Var.a) && this.b.equals(avu0Var.b) && u890.j(this.c, avu0Var.c) && this.d.equals(avu0Var.d) && this.e.equals(avu0Var.e) && this.f == avu0Var.f;
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
        return Boolean.hashCode(this.f) + cy30.d(ydh.d(this.d, cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e);
    }
}
