package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zrp0 {
    public final String a;
    public final String b;
    public final hux c;
    public final c380 d;

    public zrp0(String str, String str2, hux huxVar, c380 c380Var) {
        this.a = str;
        this.b = str2;
        this.c = huxVar;
        this.d = c380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zrp0)) {
            return false;
        }
        zrp0 zrp0Var = (zrp0) obj;
        return this.a.equals(zrp0Var.a) && this.b.equals(zrp0Var.b) && u890.j(this.c, zrp0Var.c) && u890.j(this.d, zrp0Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        hux huxVar = this.c;
        return this.d.hashCode() + ((iD + (huxVar == null ? 0 : huxVar.hashCode())) * 31);
    }
}
