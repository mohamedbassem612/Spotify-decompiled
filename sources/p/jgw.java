package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class jgw implements pgw {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public jgw(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0016  */
    /* JADX WARN: Code duplicated, block: B:22:0x002e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0046  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        boolean zEquals3;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jgw)) {
            return false;
        }
        jgw jgwVar = (jgw) obj;
        String str = jgwVar.a;
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
        String str3 = jgwVar.b;
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
        if (!zEquals2) {
            return false;
        }
        String str5 = jgwVar.c;
        String str6 = this.c;
        if (str6 == null) {
            if (str5 == null) {
                zEquals3 = true;
            } else {
                zEquals3 = false;
            }
        } else if (str5 == null) {
            zEquals3 = false;
        } else {
            zEquals3 = str6.equals(str5);
        }
        return zEquals3 && u890.j(this.d, jgwVar.d) && u890.j(this.e, jgwVar.e);
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        String str = this.a;
        if (str == null) {
            iHashCode = 0;
        } else {
            nl7 nl7Var = dyf.b;
            iHashCode = str.hashCode();
        }
        int i = iHashCode * 31;
        String str2 = this.b;
        if (str2 == null) {
            iHashCode2 = 0;
        } else {
            nl7 nl7Var2 = ss20.b;
            iHashCode2 = str2.hashCode();
        }
        int i2 = (i + iHashCode2) * 31;
        String str3 = this.c;
        return this.e.hashCode() + cy30.d((i2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.d);
    }
}
