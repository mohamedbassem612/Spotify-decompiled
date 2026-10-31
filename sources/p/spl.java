package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@o661
public final class spl {
    public static final hol Companion = new hol();
    public static final znb0[] l = {null, null, null, dm5.S(2, aok.t), dm5.S(2, aok.X), dm5.S(2, aok.Y), dm5.S(2, aok.Z), null, null};
    public final long a;
    public final long b;
    public final long c;
    public final List d;
    public final List e;
    public final List f;
    public final List g;
    public final Float h;
    public final kfh0 i;
    public final List j;
    public final List k;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public spl(int i, long j, long j2, long j3, List list, List list2, List list3, List list4, Float f, kfh0 kfh0Var) {
        List list5;
        ?? r6;
        z6x arrayList = null;
        if (71 != (i & 71)) {
            o6p1.t(i, 71, gol.a.getDescriptor());
            throw null;
        }
        this.a = j;
        this.b = j2;
        this.c = j3;
        if ((i & 8) == 0) {
            this.d = null;
            list5 = null;
        } else {
            this.d = list;
            list5 = list;
        }
        if ((i & 16) == 0) {
            this.e = null;
            r6 = 0;
        } else {
            this.e = list2;
            r6 = list2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = list3;
        }
        this.g = list4;
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = f;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = kfh0Var;
        }
        z6x z6xVar = z6x.a;
        if (r6 == 0) {
            if (list5 != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list5) {
                    if (((aww0) obj).c != null) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(new mvj1((aww0) it.next()));
                }
                r6 = arrayList3;
            } else {
                r6 = 0;
            }
            if (r6 == 0) {
                r6 = z6xVar;
            }
        }
        this.j = r6;
        z6x z6xVar2 = this.f;
        if (z6xVar2 == null) {
            List list6 = this.d;
            if (list6 != null) {
                ArrayList arrayList4 = new ArrayList();
                for (Object obj2 : list6) {
                    if (((aww0) obj2).h != null) {
                        arrayList4.add(obj2);
                    }
                }
                arrayList = new ArrayList(q7h.U(arrayList4, 10));
                Iterator it2 = arrayList4.iterator();
                while (it2.hasNext()) {
                    arrayList.add(new i18((aww0) it2.next()));
                }
            }
            if (arrayList != null) {
                z6xVar = arrayList;
            }
        } else {
            z6xVar = z6xVar2;
        }
        this.k = z6xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof spl)) {
            return false;
        }
        spl splVar = (spl) obj;
        return this.a == splVar.a && this.b == splVar.b && this.c == splVar.c && u890.j(this.d, splVar.d) && u890.j(this.e, splVar.e) && u890.j(this.f, splVar.f) && u890.j(this.g, splVar.g) && u890.j(this.h, splVar.h) && u890.j(this.i, splVar.i);
    }

    public final int hashCode() {
        int iF = cy30.f(cy30.f(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31);
        List list = this.d;
        int iHashCode = (iF + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.e;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.f;
        int iB = f4i1.b((iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31, 31, this.g);
        Float f = this.h;
        int iHashCode3 = (iB + (f == null ? 0 : f.hashCode())) * 31;
        kfh0 kfh0Var = this.i;
        return iHashCode3 + (kfh0Var != null ? kfh0Var.hashCode() : 0);
    }
}
