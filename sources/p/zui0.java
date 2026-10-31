package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@o661
public final class zui0 {
    public static final yui0 Companion = new yui0();
    public static final znb0[] f = {null, dm5.S(2, z7i0.t), null, null, null};
    public final String a;
    public final List b;
    public final String c;
    public final String d;
    public final boolean e;

    public /* synthetic */ zui0(int i, String str, String str2, String str3, List list, boolean z) {
        if (19 != (i & 19)) {
            o6p1.t(i, 19, xui0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = list;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zui0)) {
            return false;
        }
        zui0 zui0Var = (zui0) obj;
        return u890.j(this.a, zui0Var.a) && u890.j(this.b, zui0Var.b) && u890.j(this.c, zui0Var.c) && u890.j(this.d, zui0Var.d) && this.e == zui0Var.e;
    }

    public final int hashCode() {
        int iB = f4i1.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return Boolean.hashCode(this.e) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
