package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zxe implements nye {
    public final String a;
    public final String b;
    public final String c;
    public final sl01 d;

    public zxe(String str, String str2, String str3, sl01 sl01Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = sl01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zxe)) {
            return false;
        }
        zxe zxeVar = (zxe) obj;
        return u890.j(this.a, zxeVar.a) && u890.j(this.b, zxeVar.b) && u890.j(this.c, zxeVar.c) && this.d == zxeVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
