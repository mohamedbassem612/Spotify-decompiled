package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class uyd {
    public final List a;
    public final List b;
    public final boolean c;
    public final boolean d;

    public uyd(List list, List list2, boolean z, boolean z2) {
        this.a = list;
        this.b = list2;
        this.c = z;
        this.d = z2;
    }

    public static uyd a(uyd uydVar, List list, ArrayList arrayList, boolean z, int i) {
        if ((i & 1) != 0) {
            list = uydVar.a;
        }
        List list2 = arrayList;
        if ((i & 2) != 0) {
            list2 = uydVar.b;
        }
        boolean z2 = (i & 4) != 0 ? uydVar.c : true;
        if ((i & 8) != 0) {
            z = uydVar.d;
        }
        uydVar.getClass();
        return new uyd(list, list2, z2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uyd)) {
            return false;
        }
        uyd uydVar = (uyd) obj;
        return u890.j(this.a, uydVar.a) && u890.j(this.b, uydVar.b) && this.c == uydVar.c && this.d == uydVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + xcg1.g(f4i1.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
