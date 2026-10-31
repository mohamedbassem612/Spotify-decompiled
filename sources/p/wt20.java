package p;

import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wt20 implements mr20 {
    public final /* synthetic */ mr20 a;
    public final /* synthetic */ byte b;

    /* JADX WARN: Multi-variable type inference failed */
    public wt20(mr20 mr20Var, int i) {
        this.a = mr20Var;
        this.b = i;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.coroutines.flow.internal.AbortFlowException */
    /* JADX WARN: Code duplicated, block: B:29:0x005c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object collect(vr20 vr20Var, lnm lnmVar) throws AbortFlowException {
        vt20 vt20Var;
        Object obj;
        if (lnmVar instanceof vt20) {
            vt20Var = (vt20) lnmVar;
            int i = vt20Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                vt20Var.b = i - Integer.MIN_VALUE;
            } else {
                vt20Var = new vt20(this, lnmVar);
            }
        } else {
            vt20Var = new vt20(this, lnmVar);
        }
        Object obj2 = vt20Var.a;
        int i2 = vt20Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            Object obj3 = new Object();
            n811 n811Var = new n811();
            try {
                mr20 mr20Var = this.a;
                yt20 yt20Var = new yt20(n811Var, this.b, vr20Var, obj3);
                vt20Var.d = obj3;
                vt20Var.b = 1;
                Object objCollect = mr20Var.collect(yt20Var, vt20Var);
                d9n d9nVar = d9n.a;
                if (objCollect == d9nVar) {
                    return d9nVar;
                }
            } catch (AbortFlowException e) {
                e = e;
                obj = obj3;
                if (e.a != obj) {
                    throw e;
                }
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj = vt20Var.d;
            try {
                hm5.M(obj2);
            } catch (AbortFlowException e2) {
                e = e2;
                if (e.a != obj) {
                    throw e;
                }
            }
        }
        return rih1.a;
    }
}
