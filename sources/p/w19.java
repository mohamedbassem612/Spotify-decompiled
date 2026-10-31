package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class w19 {
    public static final w19 h;
    public static final w19 i;
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final Long e;
    public final Long f;
    public final Long g;

    static {
        v19 v19Var = new v19();
        v19Var.a = "";
        v19Var.b = "";
        v19Var.e = 0L;
        v19Var.f = 0L;
        v19Var.c = false;
        byte b = (byte) (v19Var.h | 1);
        v19Var.d = false;
        v19Var.h = (byte) (b | 2);
        v19Var.g = 0L;
        h = v19Var.a();
        v19 v19Var2 = new v19();
        v19Var2.a = "";
        v19Var2.b = "";
        v19Var2.e = 0L;
        v19Var2.f = 0L;
        v19Var2.c = false;
        byte b2 = (byte) (v19Var2.h | 1);
        v19Var2.d = true;
        v19Var2.h = (byte) (b2 | 2);
        v19Var2.g = 0L;
        i = v19Var2.a();
    }

    public w19(String str, String str2, boolean z, boolean z2, Long l, Long l2, Long l3) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = l;
        this.f = l2;
        this.g = l3;
    }

    public final boolean a() {
        if (this.a.length() == 0) {
            return false;
        }
        Long l = this.f;
        return l.longValue() == 0 || !this.e.equals(l);
    }

    public final v19 b() {
        v19 v19Var = new v19();
        v19Var.a = this.a;
        v19Var.b = this.b;
        v19Var.c = this.c;
        v19Var.d = this.d;
        v19Var.e = this.e;
        v19Var.f = this.f;
        v19Var.g = this.g;
        v19Var.h = (byte) 3;
        return v19Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w19)) {
            return false;
        }
        w19 w19Var = (w19) obj;
        return this.a.equals(w19Var.a) && this.b.equals(w19Var.b) && this.c == w19Var.c && this.d == w19Var.d && this.e.equals(w19Var.e) && this.f.equals(w19Var.f) && this.g.equals(w19Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() ^ ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sbN = gvg.n("PreviewPlayerState{previewId=", this.a, ", previewKey=", this.b, ", isLoading=");
        sbN.append(this.c);
        sbN.append(", isError=");
        sbN.append(this.d);
        sbN.append(", position=");
        sbN.append(this.e);
        sbN.append(", duration=");
        sbN.append(this.f);
        sbN.append(", timestamp=");
        sbN.append(this.g);
        sbN.append("}");
        return sbN.toString();
    }
}
