package p;

import com.spotify.base.java.logging.Logger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ft1 implements vr20 {
    public static final ft1 b = new ft1(0);
    public static final ft1 c = new ft1(1);
    public static final ft1 d = new ft1(2);
    public static final ft1 e = new ft1(3);
    public static final ft1 f = new ft1(4);
    public static final ft1 g = new ft1(5);
    public static final ft1 h = new ft1(6);
    public static final ft1 i = new ft1(7);
    public final /* synthetic */ byte a;

    public /* synthetic */ ft1(byte b2) {
        this.a = b2;
    }

    public final Object emit(Object obj, lnm lnmVar) {
        byte b2 = this.a;
        fcv0 fcv0Var = fcv0.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return rih1Var;
            case 1:
                return rih1Var;
            case 2:
                pr31 pr31Var = (pr31) obj;
                String str = pr31Var.b;
                e130.u(pr31Var);
                return rih1Var;
            case 3:
                gcv0 gcv0Var = (gcv0) obj;
                if (!u890.j(gcv0Var, fcv0Var)) {
                    if (!(gcv0Var instanceof ecv0)) {
                        eg.o();
                        return null;
                    }
                    Logger.d(l1d.m("Polling error: ", ((ecv0) gcv0Var).a.getMessage()), new Object[0]);
                }
                return rih1Var;
            case 4:
                gcv0 gcv0Var2 = (gcv0) obj;
                if (!u890.j(gcv0Var2, fcv0Var)) {
                    if (!(gcv0Var2 instanceof ecv0)) {
                        eg.o();
                        return null;
                    }
                    Logger.d(l1d.m("Polling error: ", ((ecv0) gcv0Var2).a.getMessage()), new Object[0]);
                }
                return rih1Var;
            case 5:
                return rih1Var;
            case 6:
                return rih1Var;
            case 7:
                return rih1Var;
            case 8:
                return rih1Var;
            default:
                return rih1Var;
        }
    }
}
