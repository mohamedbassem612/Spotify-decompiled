package p;

import com.spotify.home.evopage.mobius.Effect;
import com.spotify.home.evopage.mobius.e;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class bk00 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ e a;

    public bk00(e eVar) {
        this.a = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    public final Object a(Object obj, r261 r261Var, onm onmVar) throws Throwable {
        ak00 ak00Var;
        if (onmVar instanceof ak00) {
            ak00Var = (ak00) onmVar;
            int i = ak00Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ak00Var.b = i - Integer.MIN_VALUE;
            } else {
                ak00Var = new ak00(this, onmVar);
            }
        } else {
            ak00Var = new ak00(this, onmVar);
        }
        Object obj2 = ak00Var.a;
        int i2 = ak00Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            Effect.LoadHomeStructure loadHomeStructure = (Effect.LoadHomeStructure) obj;
            y2e0 y2e0Var = this.a.a;
            boolean zH = y2e0Var.c.h();
            tp60 tp60Var = y2e0Var.k;
            tp60Var.i(new yp60(zH ? 1 : 2));
            String sessionId = loadHomeStructure.getSessionId();
            if (sessionId != null) {
                tp60Var.l(new mq60(sessionId));
            }
            m441 m441VarL = zH ? h4p1.l(new s2e0(loadHomeStructure, (lnm) null, y2e0Var)) : h4p1.l(new n2e0(loadHomeStructure, null, y2e0Var));
            cg00 cg00Var = new cg00(r261Var, (byte) 4);
            ak00Var.b = 1;
            Object objCollect = m441VarL.collect(cg00Var, ak00Var);
            d9n d9nVar = d9n.a;
            if (objCollect == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj2);
        }
        return rih1.a;
    }
}
