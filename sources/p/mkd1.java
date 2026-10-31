package p;

import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mkd1 {
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final String e;
    public final byte f;
    public final int g;

    /* JADX WARN: Multi-variable type inference failed */
    public mkd1(int i, int i2, String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
        this.e = str3;
        this.f = i2;
        String upperCase = str2.toUpperCase(Locale.ROOT);
        this.g = ihc1.h0(upperCase, "INT", false) ? 3 : (ihc1.h0(upperCase, "CHAR", false) || ihc1.h0(upperCase, "CLOB", false) || ihc1.h0(upperCase, "TEXT", false)) ? 2 : ihc1.h0(upperCase, "BLOB", false) ? 5 : (ihc1.h0(upperCase, "REAL", false) || ihc1.h0(upperCase, "FLOA", false) || ihc1.h0(upperCase, "DOUB", false)) ? 4 : 1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof mkd1) {
                boolean z = this.d > 0;
                mkd1 mkd1Var = (mkd1) obj;
                byte b = mkd1Var.f;
                if (z == (mkd1Var.d > 0) && u890.j(this.a, mkd1Var.a) && this.c == mkd1Var.c) {
                    String str = mkd1Var.e;
                    byte b2 = this.f;
                    String str2 = this.e;
                    if ((b2 != 1 || b != 2 || str2 == null || tyo1.h(str2, str)) && ((b2 != 2 || b != 1 || str == null || tyo1.h(str, str2)) && ((b2 == 0 || b2 != b || (str2 == null ? str == null : tyo1.h(str2, str))) && this.g == mkd1Var.g))) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.g) * 31) + (this.c ? 1231 : 1237)) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |Column {\n            |   name = '");
        sb.append(this.a);
        sb.append("',\n            |   type = '");
        sb.append(this.b);
        sb.append("',\n            |   affinity = '");
        sb.append(this.g);
        sb.append("',\n            |   notNull = '");
        sb.append(this.c);
        sb.append("',\n            |   primaryKeyPosition = '");
        sb.append(this.d);
        sb.append("',\n            |   defaultValue = '");
        String str = this.e;
        if (str == null) {
            str = "undefined";
        }
        sb.append(str);
        sb.append("'\n            |}\n        ");
        return jhc1.C(jhc1.K(sb.toString()));
    }
}
