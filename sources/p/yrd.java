package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yrd {
    public final String a;
    public final String b;
    public final Integer c;
    public final String d;
    public final String e;
    public final pud f;
    public final List g;
    public final boolean h;
    public final vtd i;
    public final long j;

    public /* synthetic */ yrd(String str, String str2, String str3, String str4, pud pudVar, List list, boolean z, vtd vtdVar, long j, int i) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : 2131231786, (i & 8) != 0 ? null : str3, str4, pudVar, list, (i & 128) != 0 ? false : z, vtdVar, (i & 512) != 0 ? 0L : j);
    }

    public static yrd a(yrd yrdVar, ArrayList arrayList) {
        return new yrd(yrdVar.a, yrdVar.b, yrdVar.c, yrdVar.d, yrdVar.e, yrdVar.f, arrayList, yrdVar.h, yrdVar.i, yrdVar.j);
    }

    public final ArrayList b() {
        List list = this.g;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dvd dvdVar = ((avd) it.next()).d;
            cvd cvdVar = dvdVar instanceof cvd ? (cvd) dvdVar : null;
            List list2 = cvdVar != null ? cvdVar.a : null;
            if (list2 == null) {
                list2 = z6x.a;
            }
            r7h.W(list2, arrayList);
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yrd)) {
            return false;
        }
        yrd yrdVar = (yrd) obj;
        return u890.j(this.a, yrdVar.a) && u890.j(this.b, yrdVar.b) && u890.j(this.c, yrdVar.c) && u890.j(this.d, yrdVar.d) && u890.j(this.e, yrdVar.e) && this.f == yrdVar.f && u890.j(this.g, yrdVar.g) && this.h == yrdVar.h && u890.j(this.i, yrdVar.i) && this.j == yrdVar.j;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.d;
        return Long.hashCode(this.j) + ((this.i.hashCode() + xcg1.g(f4i1.b((this.f.hashCode() + cy30.d((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.e)) * 31, 31, this.g), 31, this.h)) * 31);
    }

    public yrd(String str, String str2, Integer num, String str3, String str4, pud pudVar, List list, boolean z, vtd vtdVar, long j) {
        this.a = str;
        this.b = str2;
        this.c = num;
        this.d = str3;
        this.e = str4;
        this.f = pudVar;
        this.g = list;
        this.h = z;
        this.i = vtdVar;
        this.j = j;
    }
}
