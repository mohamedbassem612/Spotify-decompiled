package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class t671 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final List f;

    public /* synthetic */ t671(int i, String str, String str2, String str3, String str4, List list, boolean z) {
        this(str, (i & 2) != 0 ? null : str2, (i & 32) != 0 ? z6x.a : list, (i & 4) != 0 ? null : str3, str4, (i & 16) != 0 ? true : z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t671)) {
            return false;
        }
        t671 t671Var = (t671) obj;
        return u890.j(this.a, t671Var.a) && u890.j(this.b, t671Var.b) && u890.j(this.c, t671Var.c) && u890.j(this.d, t671Var.d) && this.e == t671Var.e && u890.j(this.f, t671Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return this.f.hashCode() + xcg1.g(cy30.d((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.d), 31, this.e);
    }

    public t671(String str, String str2, List list, String str3, String str4, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = list;
    }
}
