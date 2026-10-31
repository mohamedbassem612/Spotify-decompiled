package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.offline_esperanto.proto.EsOffline;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jsu implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ nsu a;

    public jsu(nsu nsuVar) {
        this.a = nsuVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        isu isuVar;
        if (onmVar instanceof isu) {
            isuVar = (isu) onmVar;
            int i = isuVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                isuVar.b = i - Integer.MIN_VALUE;
            } else {
                isuVar = new isu(this, onmVar);
            }
        } else {
            isuVar = new isu(this, onmVar);
        }
        Object obj2 = isuVar.a;
        int i2 = isuVar.b;
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
        lmw lmwVar = this.a.b;
        lt20 lt20Var = new lt20(new buz(new lt20(hu20.e(rqt0.u(new any(rqt0.u(new i0h(new php0(((oqp0) lmwVar.b).callStream("spotify.offline_esperanto.proto.Offline", "SubscribeContexts", EsOffline.GetContextsRequest.p()), (byte) 5), (byte) 28)), (byte) 6)), new uls((lnm) null, lmwVar, (byte) 15)), new mnl(3, (lnm) null, (byte) 21), (byte) 1), (byte) 0), new jk(3, (lnm) null, (byte) 29), (byte) 0);
        wmk wmkVar = new wmk(r261Var, (byte) 4);
        isuVar.b = 1;
        Object objCollect = lt20Var.collect(new inu(wmkVar, (byte) 10), isuVar);
        d9n d9nVar = d9n.a;
        if (objCollect != d9nVar) {
            objCollect = rih1Var;
        }
        return objCollect == d9nVar ? d9nVar : rih1Var;
    }
}
