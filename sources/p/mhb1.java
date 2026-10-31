package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mhb1 {
    public final String a;
    public final String b;
    public final vzh1 c;
    public final String d;

    public mhb1(String str, String str2, vzh1 vzh1Var, String str3) {
        this.a = str;
        this.b = str2;
        this.c = vzh1Var;
        this.d = str3;
    }

    public static mhb1 a(mhb1 mhb1Var, tzh1 tzh1Var, String str, int i) {
        String str2 = mhb1Var.a;
        String str3 = mhb1Var.b;
        if ((i & 4) != 0) {
            tzh1Var = mhb1Var.c;
        }
        if ((i & 8) != 0) {
            str = mhb1Var.d;
        }
        mhb1Var.getClass();
        return new mhb1(str2, str3, tzh1Var, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mhb1)) {
            return false;
        }
        mhb1 mhb1Var = (mhb1) obj;
        return u890.j(this.a, mhb1Var.a) && u890.j(this.b, mhb1Var.b) && u890.j(this.c, mhb1Var.c) && u890.j(this.d, mhb1Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        vzh1 vzh1Var = this.c;
        int iHashCode3 = (iHashCode2 + (vzh1Var == null ? 0 : vzh1Var.hashCode())) * 31;
        String str3 = this.d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }
}
