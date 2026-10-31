package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kat {
    public final String a;
    public final String b;
    public final List c;
    public final List d;
    public final dat e;
    public final dat f;
    public final boolean g;
    public final int h;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ kat(String str, String str2, ArrayList arrayList, ArrayList arrayList2, dat datVar, dat datVar2, boolean z, int i) {
        str = (i & 1) != 0 ? "" : str;
        str2 = (i & 2) != 0 ? "" : str2;
        int i2 = i & 4;
        ArrayList arrayList3 = z6x.a;
        this(str, str2, (List) (i2 != 0 ? arrayList3 : arrayList), (List) ((i & 8) != 0 ? arrayList3 : arrayList2), (i & 16) != 0 ? new dat() : datVar, (i & 32) != 0 ? new dat() : datVar2, (i & 64) != 0 ? false : z, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kat)) {
            return false;
        }
        kat katVar = (kat) obj;
        return u890.j(this.a, katVar.a) && u890.j(this.b, katVar.b) && u890.j(this.c, katVar.c) && u890.j(this.d, katVar.d) && u890.j(this.e, katVar.e) && u890.j(this.f, katVar.f) && this.g == katVar.g && this.h == katVar.h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.h) + xcg1.g((this.f.hashCode() + ((this.e.hashCode() + f4i1.b(f4i1.b(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31)) * 31, 31, this.g);
    }

    public kat(String str, String str2, List list, List list2, dat datVar, dat datVar2, boolean z, int i) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = list2;
        this.e = datVar;
        this.f = datVar2;
        this.g = z;
        this.h = i;
    }
}
