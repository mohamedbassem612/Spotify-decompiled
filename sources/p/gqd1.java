package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.rxjava3.core.Single;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class gqd1 {
    public final tgb a;
    public final ygb b;
    public final tgb c;
    public final vi11 d;
    public final jgz0 e;
    public final llm f;

    public gqd1(tgb tgbVar, ygb ygbVar, tgb tgbVar2, q8n q8nVar, vi11 vi11Var, jgz0 jgz0Var) {
        this.a = tgbVar;
        this.b = ygbVar;
        this.c = tgbVar2;
        this.d = vi11Var;
        this.e = jgz0Var;
        this.f = l1d.x(q8nVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(cqd1 cqd1Var, lnm lnmVar) {
        fqd1 fqd1Var;
        if (lnmVar instanceof fqd1) {
            fqd1Var = (fqd1) lnmVar;
            int i = fqd1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                fqd1Var.c = i - Integer.MIN_VALUE;
            } else {
                fqd1Var = new fqd1(this, lnmVar);
            }
        } else {
            fqd1Var = new fqd1(this, lnmVar);
        }
        Object objJ = fqd1Var.a;
        int i2 = fqd1Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objJ);
                cqd1Var.getClass();
                Single singleA = jgz0.a(this.e, PlayOrigin.create("spotify-tap-ble"), LoggingParams.builder().build(), (Boolean) null, 28);
                fqd1Var.c = 1;
                objJ = fc11.j(singleA, fqd1Var);
                d9n d9nVar = d9n.a;
                if (objJ == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objJ);
            }
            objJ.getClass();
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.e(e2, "Tap BLE Peripheral: Playback failed", new Object[0]);
        }
        return rih1.a;
    }
}
