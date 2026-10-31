package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ann {
    public final hux a;
    public final Integer b;
    public final String c;
    public final Integer d;
    public final String e;
    public final List f;
    public final pmn g;
    public final snn h;

    /* JADX WARN: Code duplicated, block: B:17:0x0025  */
    public ann(xmn xmnVar) {
        boolean z;
        qnn qnnVar = xmnVar.d;
        mmn mmnVar = xmnVar.a;
        hux huxVar = mmnVar.a;
        Integer num = mmnVar.c;
        if (num != null) {
            if (qnnVar instanceof rnn) {
                z = false;
            } else {
                if (!(qnnVar instanceof qnn)) {
                    eg.o();
                    throw null;
                }
                z = qnnVar.c;
            }
            num = z ? num : null;
            num = num == null ? mmnVar.b : num;
        }
        Integer num2 = mmnVar.d;
        String str = mmnVar.e;
        vrv0 vrv0Var = xmnVar.c;
        ArrayList arrayList = vrv0Var != null ? (ArrayList) vrv0Var.e : null;
        arrayList = arrayList == null ? z6x.a : arrayList;
        pmn pmnVar = mmnVar.g;
        this.a = huxVar;
        this.b = num;
        this.c = null;
        this.d = num2;
        this.e = str;
        this.f = arrayList;
        this.g = pmnVar;
        this.h = qnnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ann)) {
            return false;
        }
        ann annVar = (ann) obj;
        return u890.j(this.a, annVar.a) && u890.j(this.b, annVar.b) && u890.j(this.c, annVar.c) && u890.j(this.d, annVar.d) && u890.j(this.e, annVar.e) && this.f.equals(annVar.f) && this.g.equals(annVar.g) && this.h.equals(annVar.h);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.e;
        return this.h.hashCode() + ((this.g.hashCode() + f4i1.b((iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f)) * 31);
    }
}
