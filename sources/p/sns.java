package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class sns implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x010 b;
    public final /* synthetic */ Set c;

    public /* synthetic */ sns(x010 x010Var, Set set, byte b) {
        this.a = b;
        this.b = x010Var;
        this.c = set;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        Set set = this.c;
        x010 x010Var = this.b;
        switch (b) {
            case 0:
                Object objCollect = x010Var.collect(new nw9(vr20Var, set, (byte) 5), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            default:
                Object objCollect2 = x010Var.collect(new nw9(vr20Var, set, (byte) 15), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
        }
    }
}
