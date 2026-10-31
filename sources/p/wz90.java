package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class wz90 implements whm0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final List e;

    public /* synthetic */ wz90(int i) {
        this(null, null, (i & 4) != 0, false, z6x.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wz90)) {
            return false;
        }
        wz90 wz90Var = (wz90) obj;
        return u890.j(this.a, wz90Var.a) && u890.j(this.b, wz90Var.b) && this.c == wz90Var.c && this.d == wz90Var.d && u890.j(this.e, wz90Var.e);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return this.e.hashCode() + xcg1.g(xcg1.g((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.c), 31, this.d);
    }

    public wz90(String str, String str2, boolean z, boolean z2, List list) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = list;
    }
}
