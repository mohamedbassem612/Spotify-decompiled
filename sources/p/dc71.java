package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@o661
public final class dc71 {
    public static final hb71 Companion = new hb71();
    public static final znb0[] g = {null, null, null, dm5.S(2, da71.c), null, null};
    public final String a;
    public final String b;
    public final String c;
    public final Map d;
    public final String e;
    public final String f;

    public /* synthetic */ dc71(int i, String str, String str2, String str3, String str4, String str5, Map map) {
        if (11 != (i & 11)) {
            o6p1.t(i, 11, gb71.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        this.d = map;
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dc71)) {
            return false;
        }
        dc71 dc71Var = (dc71) obj;
        return u890.j(this.a, dc71Var.a) && u890.j(this.b, dc71Var.b) && u890.j(this.c, dc71Var.c) && u890.j(this.d, dc71Var.d) && u890.j(this.e, dc71Var.e) && u890.j(this.f, dc71Var.f);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iE = cy30.e((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        String str2 = this.e;
        int iHashCode = (iE + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        return iHashCode + (str3 != null ? str3.hashCode() : 0);
    }
}
