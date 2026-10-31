package p;

import android.content.res.Resources;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class x5g0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ a6g0 a;

    public x5g0(a6g0 a6g0Var) {
        this.a = a6g0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        w5g0 w5g0Var;
        u7l0 u7l0Var;
        if (onmVar instanceof w5g0) {
            w5g0Var = (w5g0) onmVar;
            int i = w5g0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                w5g0Var.b = i - Integer.MIN_VALUE;
            } else {
                w5g0Var = new w5g0(this, onmVar);
            }
        } else {
            w5g0Var = new w5g0(this, onmVar);
        }
        Object obj2 = w5g0Var.a;
        int i2 = w5g0Var.b;
        rih1 rih1Var = rih1.a;
        if (i2 != 0) {
            if (i2 == 1) {
                hm5.M(obj2);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj2);
        d5g0 d5g0Var = (d5g0) obj;
        l5g0 l5g0Var = this.a.a;
        String str = d5g0Var.b;
        iyr0 iyr0Var = d5g0Var.c;
        yu3 yu3Var = l5g0Var.d;
        String string = ((Resources) yu3Var.b).getString(2131958073);
        int iOrdinal = iyr0Var.ordinal();
        if (iOrdinal == 0) {
            u7l0Var = u7l0.REMOVE_FROM_APPROVED;
        } else {
            if (iOrdinal != 1) {
                eg.o();
                return null;
            }
            u7l0Var = u7l0.REMOVE_FROM_BLOCKED;
        }
        m441 m441Var = new m441(new xd1(yu3Var, str, u7l0Var, string, (lnm) null));
        q5g0 q5g0Var = new q5g0(r261Var, (byte) 3);
        w5g0Var.b = 1;
        Object objCollect = m441Var.collect(new buc0(q5g0Var, str, (byte) 2), w5g0Var);
        d9n d9nVar = d9n.a;
        if (objCollect != d9nVar) {
            objCollect = rih1Var;
        }
        return objCollect == d9nVar ? d9nVar : rih1Var;
    }
}
