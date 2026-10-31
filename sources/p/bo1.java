package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class bo1 {
    public static final String a;
    public static final String b;

    static {
        w6b1 w6b1VarA = f7b1.a(blc0.C4);
        w6b1VarA.getClass();
        a = (String) w6b1VarA.c.get(0);
        w6b1 w6b1VarA2 = f7b1.a(blc0.q4);
        w6b1VarA2.getClass();
        b = (String) w6b1VarA2.c.get(0);
    }

    public static final boolean a(s4b1 s4b1Var) {
        v5b1 v5b1Var = s4b1Var.d;
        b3i1 type = v5b1Var != null ? v5b1Var.getType() : null;
        return u890.j(type, nyu0.e) || u890.j(type, wyu0.f);
    }

    public static final boolean b(String str) {
        Set set = s4b1.f;
        blc0 blc0Var = uic.x(str).c;
        return blc0Var == blc0.yi || blc0Var == blc0.zi;
    }

    public static final boolean c(String str) {
        Set set = s4b1.f;
        blc0 blc0Var = uic.x(str).c;
        return blc0Var == blc0.C4 || blc0Var == blc0.D4 || u890.j(str, "spotify:playlist:37i9dQZF1FgnTBfUlzkeKt");
    }

    public static final boolean d(blc0 blc0Var) {
        return blc0Var == blc0.q4 || blc0Var == blc0.v4 || blc0Var == blc0.i4 || blc0Var == blc0.V3;
    }
}
