package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class f5z {
    public static final List a = p7h.M(new Object[]{new r9b0(2131952667, 14), new fgc0(new gr61(1), false, 1), new fgc0(new gr61(2), false, 2), new fgc0(new gr61(3), false, 3), new fgc0(new gr61(5), false, 4), new fgc0(new gr61(10), false, 5), new fgc0(hr61.a, false, 6)});

    public static ArrayList a(ir61 ir61Var) {
        List list = a;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        for (Object fgc0Var : list) {
            if (fgc0Var instanceof fgc0) {
                fgc0 fgc0Var2 = (fgc0) fgc0Var;
                ir61 ir61Var2 = fgc0Var2.a;
                if (u890.j(ir61Var2, ir61Var)) {
                    fgc0Var = new fgc0(ir61Var2, true, fgc0Var2.c);
                }
            }
            arrayList.add(fgc0Var);
        }
        return arrayList;
    }
}
