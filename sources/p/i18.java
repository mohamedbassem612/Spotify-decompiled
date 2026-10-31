package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@o661
public final class i18 {
    public static final h18 Companion = new h18();
    public static final znb0[] k = {null, null, null, null, null, null, null, dm5.S(2, vc7.t), null, null};
    public final long a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final int g;
    public final List h;
    public final String i;
    public final Boolean j;

    public /* synthetic */ i18(int i, long j, int i2, String str, String str2, String str3, String str4, int i3, List list, String str5, Boolean bool) {
        if (111 != (i & 111)) {
            o6p1.t(i, 111, g18.a.getDescriptor());
            throw null;
        }
        this.a = j;
        this.b = i2;
        this.c = str;
        this.d = str2;
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
        this.f = str4;
        this.g = i3;
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = list;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str5;
        }
        if ((i & 512) == 0) {
            this.j = Boolean.FALSE;
        } else {
            this.j = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i18)) {
            return false;
        }
        i18 i18Var = (i18) obj;
        return this.a == i18Var.a && this.b == i18Var.b && u890.j(this.c, i18Var.c) && u890.j(this.d, i18Var.d) && u890.j(this.e, i18Var.e) && u890.j(this.f, i18Var.f) && this.g == i18Var.g && u890.j(this.h, i18Var.h) && u890.j(this.i, i18Var.i) && u890.j(this.j, i18Var.j);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(kaa0.f(this.b, Long.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d);
        String str = this.e;
        int iF = kaa0.f(this.g, cy30.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.f), 31);
        List list = this.h;
        int iHashCode = (iF + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.i;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.j;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public i18(aww0 aww0Var) {
        long j = aww0Var.a;
        Integer num = aww0Var.g;
        num.getClass();
        int iIntValue = num.intValue();
        String str = aww0Var.h;
        str.getClass();
        String str2 = aww0Var.i;
        String str3 = aww0Var.j;
        int i = aww0Var.k;
        List list = aww0Var.n;
        Boolean bool = Boolean.TRUE;
        this.a = j;
        this.b = iIntValue;
        this.c = str;
        this.d = str2;
        this.e = null;
        this.f = str3;
        this.g = i;
        this.h = list;
        this.i = null;
        this.j = bool;
    }
}
