package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@o661
public final class sr81 {
    public static final rr81 Companion = new rr81();
    public static final znb0[] h = {null, null, null, null, null, null, dm5.S(2, gr81.c)};
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final Map g;

    public /* synthetic */ sr81(int i, String str, String str2, String str3, String str4, String str5, String str6, Map map) {
        if (31 != (i & 31)) {
            o6p1.t(i, 31, qr81.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str6;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sr81)) {
            return false;
        }
        sr81 sr81Var = (sr81) obj;
        return u890.j(this.a, sr81Var.a) && u890.j(this.b, sr81Var.b) && u890.j(this.c, sr81Var.c) && u890.j(this.d, sr81Var.d) && u890.j(this.e, sr81Var.e) && u890.j(this.f, sr81Var.f) && u890.j(this.g, sr81Var.g);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        Map map = this.g;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public sr81(String str, String str2, String str3, String str4, String str5, Map map) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = "android";
        this.e = str4;
        this.f = str5;
        this.g = map;
    }
}
