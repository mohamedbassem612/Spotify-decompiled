package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class cod0 implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lt20 b;
    public final /* synthetic */ List c;

    public /* synthetic */ cod0(lt20 lt20Var, List list, byte b) {
        this.a = b;
        this.b = lt20Var;
        this.c = list;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        List list = this.c;
        lt20 lt20Var = this.b;
        switch (b) {
            case 0:
                Object objCollect = lt20Var.collect(new ku2(vr20Var, list, (byte) 5), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            case 1:
                Object objCollect2 = lt20Var.collect(new ku2(vr20Var, list, (byte) 6), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
            default:
                Object objCollect3 = lt20Var.collect(new ku2(vr20Var, list, (byte) 7), lnmVar);
                return objCollect3 == d9nVar ? objCollect3 : rih1Var;
        }
    }
}
