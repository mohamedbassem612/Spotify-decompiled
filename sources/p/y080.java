package p;

import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class y080 implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wt20 b;

    public /* synthetic */ y080(wt20 wt20Var, byte b) {
        this.a = b;
        this.b = wt20Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.coroutines.flow.internal.AbortFlowException */
    public final Object collect(vr20 vr20Var, lnm lnmVar) throws AbortFlowException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        wt20 wt20Var = this.b;
        switch (b) {
            case 0:
                Object objCollect = wt20Var.collect(new gw60(vr20Var, (byte) 11), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            default:
                Object objCollect2 = wt20Var.collect(new g6z0(vr20Var, (byte) 3), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
        }
    }
}
