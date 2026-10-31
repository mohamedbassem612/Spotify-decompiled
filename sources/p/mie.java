package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class mie implements whm0 {
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final List f;
    public final boolean g;

    public mie(int i, String str, String str2, String str3, String str4, List list, boolean z) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = list;
        this.g = z;
    }

    public static mie b(mie mieVar, int i, String str, String str2, String str3, List list, boolean z, int i2) {
        String str4 = str;
        String str5 = mieVar.a;
        if ((i2 & 4) != 0) {
            str4 = mieVar.c;
        }
        if ((i2 & 8) != 0) {
            str2 = mieVar.d;
        }
        if ((i2 & 16) != 0) {
            str3 = mieVar.e;
        }
        if ((i2 & 32) != 0) {
            list = mieVar.f;
        }
        if ((i2 & 64) != 0) {
            z = mieVar.g;
        }
        boolean z2 = z;
        mieVar.getClass();
        List list2 = list;
        String str6 = str3;
        return new mie(i, str5, str4, str2, str6, list2, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mie)) {
            return false;
        }
        mie mieVar = (mie) obj;
        return u890.j(this.a, mieVar.a) && this.b == mieVar.b && u890.j(this.c, mieVar.c) && u890.j(this.d, mieVar.d) && u890.j(this.e, mieVar.e) && u890.j(this.f, mieVar.f) && this.g == mieVar.g;
    }

    public final int hashCode() {
        int iK = ab80.k(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        int iHashCode = (iK + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return Boolean.hashCode(this.g) + f4i1.b((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.f);
    }

    public /* synthetic */ mie(String str) {
        this(4, str, null, null, null, z6x.a, false);
    }
}
