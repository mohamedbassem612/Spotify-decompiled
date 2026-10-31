package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class o1p {
    public final ym7 a;
    public final jly0 b = xqu.b(new n1p(this, (byte) 0));

    public o1p(ym7 ym7Var) {
        this.a = ym7Var;
    }

    public final zwg a() {
        Set setSingleton;
        Set setSingleton2;
        onv0 onv0VarB = b();
        onv0 onv0VarB2 = b();
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(new qs80());
        arrayList.add(new rs80());
        if (arrayList.isEmpty()) {
            setSingleton = Collections.EMPTY_SET;
        } else {
            setSingleton = arrayList.size() == 1 ? Collections.singleton(arrayList.get(0)) : Collections.unmodifiableSet(new HashSet(arrayList));
        }
        Set set = setSingleton;
        Set setSingleton3 = Collections.singleton(new x911());
        ArrayList arrayList2 = new ArrayList(3);
        arrayList2.add(new ln80((byte) 0));
        arrayList2.add(new ln80((byte) 1));
        arrayList2.add(new mn80(new ln80((byte) 0)));
        if (arrayList2.isEmpty()) {
            setSingleton2 = Collections.EMPTY_SET;
        } else {
            setSingleton2 = arrayList2.size() == 1 ? Collections.singleton(arrayList2.get(0)) : Collections.unmodifiableSet(new HashSet(arrayList2));
        }
        return new zwg(onv0VarB, onv0VarB2, set, setSingleton3, setSingleton2);
    }

    public final onv0 b() {
        ym7 ym7Var = this.a;
        return new onv0(ym7Var.f(), ym7Var.b(), ym7Var.a());
    }
}
