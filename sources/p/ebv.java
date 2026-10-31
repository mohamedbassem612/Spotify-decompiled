package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class ebv {
    public static final String a;

    static {
        w6b1 w6b1VarA = f7b1.a(blc0.q4);
        w6b1VarA.getClass();
        a = (String) w6b1VarA.c.get(0);
    }

    public static final boolean a(String str) {
        Set set = s4b1.f;
        blc0 blc0Var = uic.x(str).c;
        return blc0Var == blc0.q4 || blc0Var == blc0.v4 || blc0Var == blc0.i4 || blc0Var == blc0.V3;
    }
}
