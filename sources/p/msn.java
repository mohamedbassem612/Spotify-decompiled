package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class msn {
    public static final List b = p7h.M(new String[]{"link", "type"});
    public final n481 a;

    public msn(n481 n481Var) {
        this.a = n481Var;
    }

    public static boolean a(c481 c481Var) {
        i1z i1zVar;
        i1z i1zVar2;
        t5g1 t5g1Var = c481Var.i;
        Object obj = null;
        String str = (t5g1Var == null || (i1zVar2 = t5g1Var.a) == null) ? null : i1zVar2.a;
        if (str == null || str.length() == 0) {
            return false;
        }
        for (Object obj2 : c481Var.b) {
            if (((i1z) obj2).a.equals((t5g1Var == null || (i1zVar = t5g1Var.a) == null) ? null : i1zVar.a)) {
                obj = obj2;
                break;
            }
        }
        return obj != null;
    }
}
