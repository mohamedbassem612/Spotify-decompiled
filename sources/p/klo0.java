package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class klo0 extends sio1 {
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public klo0(int i, String str, String str2, String str3, String str4, String str5) {
        this.c = i;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof klo0)) {
            return false;
        }
        klo0 klo0Var = (klo0) obj;
        return this.c == klo0Var.c && u890.j(this.d, klo0Var.d) && u890.j(this.e, klo0Var.e) && u890.j(this.f, klo0Var.f) && u890.j(this.g, klo0Var.g) && u890.j(this.h, klo0Var.h);
    }

    public final int hashCode() {
        int iD = cy30.d(l1d.C(this.c) * 31, 31, this.d);
        String str = this.e;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }
}
