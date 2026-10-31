package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class kgw implements pgw {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public kgw(String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0016  */
    /* JADX WARN: Code duplicated, block: B:22:0x002e  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kgw)) {
            return false;
        }
        kgw kgwVar = (kgw) obj;
        String str = kgwVar.a;
        String str2 = this.a;
        if (str2 == null) {
            if (str == null) {
                zEquals = true;
            } else {
                zEquals = false;
            }
        } else if (str == null) {
            zEquals = false;
        } else {
            nl7 nl7Var = dyf.b;
            zEquals = str2.equals(str);
        }
        if (!zEquals) {
            return false;
        }
        String str3 = kgwVar.b;
        String str4 = this.b;
        if (str4 == null) {
            if (str3 == null) {
                zEquals2 = true;
            } else {
                zEquals2 = false;
            }
        } else if (str3 == null) {
            zEquals2 = false;
        } else {
            nl7 nl7Var2 = ss20.b;
            zEquals2 = str4.equals(str3);
        }
        return zEquals2 && u890.j(this.c, kgwVar.c) && this.d == kgwVar.d;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2 = 0;
        String str = this.a;
        if (str == null) {
            iHashCode = 0;
        } else {
            nl7 nl7Var = dyf.b;
            iHashCode = str.hashCode();
        }
        int i = iHashCode * 31;
        String str2 = this.b;
        if (str2 != null) {
            nl7 nl7Var2 = ss20.b;
            iHashCode2 = str2.hashCode();
        }
        return Boolean.hashCode(this.d) + cy30.d((i + iHashCode2) * 31, 31, this.c);
    }
}
