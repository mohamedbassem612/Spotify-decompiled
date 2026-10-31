package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class o6g1 {
    public static final Set a = f46.S0(new blc0[]{blc0.g1, blc0.u1, blc0.m2, blc0.de, blc0.ee, blc0.Pg, blc0.fh, blc0.ti});
    public static final Set b = f46.S0(new b3i1[]{nyu0.e, wyu0.f});

    /* JADX WARN: Code duplicated, block: B:10:0x0023 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public static boolean a(String str) {
        Set set = s4b1.f;
        s4b1 s4b1VarX = uic.x(str);
        v5b1 v5b1Var = s4b1VarX.d;
        if (v5b1Var != null) {
            if (!b.contains(v5b1Var.getType())) {
                if (a.contains(s4b1VarX.c)) {
                    return false;
                }
            }
        } else if (a.contains(s4b1VarX.c)) {
            return false;
        }
        return true;
    }
}
