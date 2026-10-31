package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ow9 implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mr20 b;
    public final /* synthetic */ Set c;

    public /* synthetic */ ow9(mr20 mr20Var, Set set, byte b) {
        this.a = b;
        this.b = mr20Var;
        this.c = set;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        Set set = this.c;
        mr20 mr20Var = this.b;
        switch (b) {
            case 0:
                Object objCollect = mr20Var.collect(new nw9(vr20Var, set, (byte) 0), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            case 1:
                Object objCollect2 = mr20Var.collect(new mib(vr20Var, set, (byte) 8), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
            case 2:
                Object objCollect3 = mr20Var.collect(new nw9(vr20Var, set, (byte) 11), lnmVar);
                return objCollect3 == d9nVar ? objCollect3 : rih1Var;
            case 3:
                Object objCollect4 = mr20Var.collect(new nw9(vr20Var, set, (byte) 12), lnmVar);
                return objCollect4 == d9nVar ? objCollect4 : rih1Var;
            case 4:
                Object objCollect5 = mr20Var.collect(new nw9(vr20Var, set, (byte) 14), lnmVar);
                return objCollect5 == d9nVar ? objCollect5 : rih1Var;
            case 5:
                Object objCollect6 = mr20Var.collect(new nw9(vr20Var, set, (byte) 17), lnmVar);
                return objCollect6 == d9nVar ? objCollect6 : rih1Var;
            default:
                Object objCollect7 = mr20Var.collect(new nw9(vr20Var, set, (byte) 22), lnmVar);
                return objCollect7 == d9nVar ? objCollect7 : rih1Var;
        }
    }
}
