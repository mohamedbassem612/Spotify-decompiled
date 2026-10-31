package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class vdn {
    public String a;
    public String b;
    public String c;
    public String d;

    public final cen a() {
        return new cen(this.a, this.b, this.c, this.d);
    }

    public final void b(String str) {
        this.c = str;
    }

    public final void c(String str) {
        this.b = str;
    }

    public final void d(String str) {
        this.a = str;
    }

    public final void e(String str) {
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vdn)) {
            return false;
        }
        vdn vdnVar = (vdn) obj;
        return this.a.equals(vdnVar.a) && u890.j(this.b, vdnVar.b) && u890.j(this.c, vdnVar.c) && u890.j(this.d, vdnVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }
}
