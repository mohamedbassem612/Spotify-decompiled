package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@o661
public final class zn21 {
    public static final yn21 Companion = new yn21();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;

    public /* synthetic */ zn21(String str, int i, String str2, String str3, boolean z, String str4) {
        if (16 != (i & 16)) {
            o6p1.t(i, 16, xn21.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zn21)) {
            return false;
        }
        zn21 zn21Var = (zn21) obj;
        return u890.j(this.a, zn21Var.a) && u890.j(this.b, zn21Var.b) && u890.j(this.c, zn21Var.c) && u890.j(this.d, zn21Var.d) && this.e == zn21Var.e;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        return Boolean.hashCode(this.e) + ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public zn21(String str, String str2, String str3, String str4, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
    }
}
