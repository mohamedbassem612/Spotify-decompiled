package p;

import android.util.SparseArray;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class aow0 {
    public static final SparseArray a = new SparseArray();
    public static final HashMap b;

    static {
        HashMap map = new HashMap();
        b = map;
        map.put(xnw0.a, 0);
        map.put(xnw0.b, 1);
        map.put(xnw0.c, 2);
        for (xnw0 xnw0Var : map.keySet()) {
            a.append(((Integer) b.get(xnw0Var)).intValue(), xnw0Var);
        }
    }

    public static int a(xnw0 xnw0Var) {
        Integer num = (Integer) b.get(xnw0Var);
        if (num != null) {
            return num.intValue();
        }
        bhn0.A(xnw0Var, "PriorityMapping is missing known Priority value ");
        return 0;
    }

    public static xnw0 b(int i) {
        xnw0 xnw0Var = (xnw0) a.get(i);
        if (xnw0Var != null) {
            return xnw0Var;
        }
        hhg1.n(f4i1.c(i, "Unknown Priority for value "));
        return null;
    }
}
