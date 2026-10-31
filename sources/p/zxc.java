package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zxc implements z0i {
    public final String a;
    public final yxc b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public zxc(String str, yxc yxcVar, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = yxcVar;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zxc)) {
            return false;
        }
        zxc zxcVar = (zxc) obj;
        return this.a.equals(zxcVar.a) && u890.j(this.b, zxcVar.b) && this.c.equals(zxcVar.c) && this.d.equals(zxcVar.d) && this.e.equals(zxcVar.e) && this.f.equals(zxcVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        yxc yxcVar = this.b;
        return this.f.hashCode() + cy30.d(cy30.d(cy30.d((iHashCode + (yxcVar == null ? 0 : yxcVar.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e);
    }
}
