package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@o661
public final class wz10 {
    public static final vz10 Companion = new vz10();
    public static final znb0[] e = {dm5.S(2, ny00.P0), null, null, null};
    public final List a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ wz10(int i, String str, String str2, String str3, List list) {
        if (9 != (i & 9)) {
            o6p1.t(i, 9, uz10.a.getDescriptor());
            throw null;
        }
        this.a = list;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wz10)) {
            return false;
        }
        wz10 wz10Var = (wz10) obj;
        return u890.j(this.a, wz10Var.a) && u890.j(this.b, wz10Var.b) && u890.j(this.c, wz10Var.c) && u890.j(this.d, wz10Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return this.d.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
