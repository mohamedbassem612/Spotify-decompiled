package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ed7 extends ld7 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final List e;
    public final List f;

    public ed7(String str, String str2, String str3, boolean z, List list, List list2, int i) {
        str = (i & 1) != 0 ? "" : str;
        str2 = (i & 2) != 0 ? null : str2;
        str3 = (i & 4) != 0 ? "" : str3;
        z = (i & 8) != 0 ? false : z;
        int i2 = i & 16;
        List list3 = z6x.a;
        list = i2 != 0 ? list3 : list;
        list2 = (i & 32) != 0 ? list3 : list2;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = list;
        this.f = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ed7)) {
            return false;
        }
        ed7 ed7Var = (ed7) obj;
        return this.a.equals(ed7Var.a) && u890.j(this.b, ed7Var.b) && this.c.equals(ed7Var.c) && this.d == ed7Var.d && this.e.equals(ed7Var.e) && this.f.equals(ed7Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.f.hashCode() + f4i1.b(xcg1.g(cy30.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e);
    }
}
