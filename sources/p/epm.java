package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class epm implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ m441 b;
    public final /* synthetic */ Set c;

    public /* synthetic */ epm(m441 m441Var, Set set, byte b) {
        this.a = b;
        this.b = m441Var;
        this.c = set;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        Set set = this.c;
        m441 m441Var = this.b;
        switch (b) {
            case 0:
                Object objCollect = m441Var.collect(new nw9(vr20Var, set, (byte) 1), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            case 1:
                Object objCollect2 = m441Var.collect(new nw9(vr20Var, set, (byte) 2), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
            case 2:
                Object objCollect3 = m441Var.collect(new nw9(vr20Var, set, (byte) 3), lnmVar);
                return objCollect3 == d9nVar ? objCollect3 : rih1Var;
            default:
                Object objCollect4 = m441Var.collect(new nw9(vr20Var, set, (byte) 4), lnmVar);
                return objCollect4 == d9nVar ? objCollect4 : rih1Var;
        }
    }
}
