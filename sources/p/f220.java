package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class f220 {
    public static final df41 a = new df41(zs10.S0, wo10.h);

    public static final Map a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c220 c220Var = (c220) it.next();
            b220 b220Var = c220Var.c;
            mmr0 mmr0Var = null;
            x120 x120Var = b220Var instanceof x120 ? (x120) b220Var : null;
            if (x120Var != null) {
                mmr0Var = new mmr0(c220Var.a, new dqy(x120Var.b, x120Var.c, x120Var.d, x120Var.a));
            }
            if (mmr0Var != null) {
                arrayList.add(mmr0Var);
            }
        }
        return sqg0.T(arrayList);
    }
}
