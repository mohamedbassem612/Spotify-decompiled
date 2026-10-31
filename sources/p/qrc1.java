package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@o661
public final class qrc1 {
    public static final prc1 Companion = new prc1();
    public static final znb0[] c = {dm5.S(2, orc1.b), dm5.S(2, orc1.c)};
    public final List a;
    public final List b;

    public /* synthetic */ qrc1(int i, List list, List list2) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, nrc1.a.getDescriptor());
            throw null;
        }
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qrc1)) {
            return false;
        }
        qrc1 qrc1Var = (qrc1) obj;
        return u890.j(this.a, qrc1Var.a) && u890.j(this.b, qrc1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public qrc1(ArrayList arrayList, List list) {
        this.a = list;
        this.b = arrayList;
    }
}
