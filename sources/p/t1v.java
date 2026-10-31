package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class t1v implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ezc b;
    public final /* synthetic */ Set c;

    public /* synthetic */ t1v(ezc ezcVar, Set set, byte b) {
        this.a = b;
        this.b = ezcVar;
        this.c = set;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        Set set = this.c;
        ezc ezcVar = this.b;
        switch (b) {
            case 0:
                Object objCollect = ezcVar.collect(new nw9(vr20Var, set, (byte) 8), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            default:
                Object objCollect2 = ezcVar.collect(new nw9(vr20Var, set, (byte) 21), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
        }
    }
}
