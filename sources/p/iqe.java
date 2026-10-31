package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class iqe implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ rqe a;

    public iqe(rqe rqeVar) {
        this.a = rqeVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        hqe hqeVar;
        if (onmVar instanceof hqe) {
            hqeVar = (hqe) onmVar;
            int i = hqeVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                hqeVar.b = i - Integer.MIN_VALUE;
            } else {
                hqeVar = new hqe(this, onmVar);
            }
        } else {
            hqeVar = new hqe(this, onmVar);
        }
        Object obj2 = hqeVar.a;
        d9n d9nVar = d9n.a;
        int i2 = hqeVar.b;
        try {
            if (i2 == 0) {
                hm5.M(obj2);
                wpe wpeVar = (wpe) obj;
                rq2 rq2Var = this.a.a.P;
                rqe rqeVar = this.a;
                fq2 fq2Var = rqeVar.a;
                String str = wpeVar.a;
                uya1 uya1Var = wpeVar.b;
                if (uya1Var == null) {
                    uya1Var = new uya1(2, rqeVar.X.a());
                }
                uya1 uya1Var2 = uya1Var;
                String str2 = wpeVar.c;
                String str3 = wpeVar.d;
                rq2Var.getClass();
                gp21 gp21Var = new gp21(282, null, null, rq2Var == rq2.NPV_MARTINI_CHAT ? "spotify:internal:npv-mini-chat" : null, str2, str3, rq2Var, null, uya1Var2, false);
                hqeVar.b = 1;
                if (fq2Var.z(str, gp21Var, hqeVar) == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj2);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            n57.t("Failed to send request", e2);
        }
        return rih1.a;
    }
}
