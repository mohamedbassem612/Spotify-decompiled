package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.offline_esperanto.proto.EsOffline;
import com.spotify.offline_esperanto.proto.c;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qcq0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ bdq0 a;

    public qcq0(bdq0 bdq0Var) {
        this.a = bdq0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        pcq0 pcq0Var;
        if (onmVar instanceof pcq0) {
            pcq0Var = (pcq0) onmVar;
            int i = pcq0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                pcq0Var.b = i - Integer.MIN_VALUE;
            } else {
                pcq0Var = new pcq0(this, onmVar);
            }
        } else {
            pcq0Var = new pcq0(this, onmVar);
        }
        Object obj2 = pcq0Var.a;
        int i2 = pcq0Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            ccq0 ccq0Var = (ccq0) obj;
            yfc0 yfc0Var = this.a.c;
            byp0 byp0Var = (byp0) yfc0Var.b;
            ept eptVar = ccq0Var.b;
            List listL1 = o7h.l1(ccq0Var.a);
            vpp0 vpp0Var = byp0Var.a;
            c cVarQ = EsOffline.GetContextsRequest.q();
            roz rozVarO = EsOffline.DeviceKey.o();
            rozVarO.q(eptVar.c);
            rozVarO.n(eptVar.d);
            cVarQ.r(rozVarO);
            cVarQ.n(listL1);
            m441 m441Var = new m441(new wkk0(new k6e0(new uop0(yoi1.g(vpp0Var.c(cVarQ.build())), (byte) 4), (byte) 16), (lnm) null, yfc0Var));
            klp0 klp0Var = new klp0(r261Var, (byte) 1);
            pcq0Var.b = 1;
            Object objCollect = m441Var.collect(klp0Var, pcq0Var);
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
