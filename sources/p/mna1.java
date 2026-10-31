package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@o661
public final class mna1<T> {
    public static final lna1 Companion = new lna1();
    public static final znb0[] c = {dm5.S(2, new mf41((byte) 3)), null};
    public static final m0v0 d;
    public final List a;
    public final List b;

    static {
        m0v0 m0v0Var = new m0v0("androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate", (pf40) null, 2);
        m0v0Var.j("keys", false);
        m0v0Var.j("values", false);
        d = m0v0Var;
    }

    public /* synthetic */ mna1(int i, List list, List list2) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, d);
            throw null;
        }
        this.a = list;
        this.b = list2;
    }

    public mna1(ArrayList arrayList, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = arrayList2;
    }
}
