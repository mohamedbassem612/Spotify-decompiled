package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class m0k {
    public final List a;
    public final List b;
    public final List c;
    public final List d;
    public final List e;
    public final String f;
    public final List g;
    public final pnt h;
    public final List i;

    public m0k(List list, List list2, List list3, List list4, List list5, String str, List list6, pnt pntVar, List list7) {
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
        this.e = list5;
        this.f = str;
        this.g = list6;
        this.h = pntVar;
        this.i = list7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0k)) {
            return false;
        }
        m0k m0kVar = (m0k) obj;
        return this.a.equals(m0kVar.a) && this.b.equals(m0kVar.b) && this.c.equals(m0kVar.c) && this.d.equals(m0kVar.d) && this.e.equals(m0kVar.e) && u890.j(this.f, m0kVar.f) && this.g.equals(m0kVar.g) && u890.j(this.h, m0kVar.h) && this.i.equals(m0kVar.i);
    }

    public final int hashCode() {
        int iB = f4i1.b(f4i1.b(f4i1.b(f4i1.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        int iB2 = f4i1.b((iB + (str == null ? 0 : str.hashCode())) * 31, 31, this.g);
        pnt pntVar = this.h;
        return this.i.hashCode() + ((iB2 + (pntVar != null ? pntVar.hashCode() : 0)) * 31);
    }
}
