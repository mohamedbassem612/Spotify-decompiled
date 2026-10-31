package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class lgw implements pgw {
    public final String a;
    public final String b;
    public final String c;

    public lgw(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0016  */
    /* JADX WARN: Code duplicated, block: B:22:0x002e  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (this != obj) {
            if (obj instanceof lgw) {
                lgw lgwVar = (lgw) obj;
                String str = lgwVar.a;
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
                if (zEquals) {
                    String str3 = lgwVar.b;
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
                    if (zEquals2 && this.c.equals(lgwVar.c)) {
                    }
                }
            }
            return false;
        }
        return true;
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
        return this.c.hashCode() + ((i + iHashCode2) * 31);
    }
}
