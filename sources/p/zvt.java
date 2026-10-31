package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@o661
public final class zvt {
    public static final yvt Companion = new yvt();
    public static final znb0[] g = {null, null, null, null, dm5.S(2, u6t.Z), null};
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;
    public final String f;

    public /* synthetic */ zvt(int i, String str, String str2, String str3, String str4, String str5, List list) {
        if (15 != (i & 15)) {
            o6p1.t(i, 15, xvt.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list;
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
        if (!(obj instanceof zvt)) {
            return false;
        }
        zvt zvtVar = (zvt) obj;
        return u890.j(this.a, zvtVar.a) && u890.j(this.b, zvtVar.b) && u890.j(this.c, zvtVar.c) && u890.j(this.d, zvtVar.d) && u890.j(this.e, zvtVar.e) && u890.j(this.f, zvtVar.f);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        List list = this.e;
        int iHashCode = (iD + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
