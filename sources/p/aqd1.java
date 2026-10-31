package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class aqd1 {
    public final tgb a;
    public final ygb b;
    public final tgb c;
    public final qfl1 d;
    public final kly0 e;
    public final jgz0 f;
    public final llm g;
    public final xgn0 h = ygn0.a();
    public final LinkedHashSet i = new LinkedHashSet();
    public final ArrayList j = new ArrayList();

    public aqd1(tgb tgbVar, ygb ygbVar, tgb tgbVar2, q8n q8nVar, qfl1 qfl1Var, caq caqVar, jgz0 jgz0Var) {
        this.a = tgbVar;
        this.b = ygbVar;
        this.c = tgbVar2;
        this.d = qfl1Var;
        this.e = caqVar;
        this.f = jgz0Var;
        this.g = l1d.x(q8nVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(cqd1 cqd1Var, lnm lnmVar) {
        zpd1 zpd1Var;
        if (lnmVar instanceof zpd1) {
            zpd1Var = (zpd1) lnmVar;
            int i = zpd1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zpd1Var.c = i - Integer.MIN_VALUE;
            } else {
                zpd1Var = new zpd1(this, lnmVar);
            }
        } else {
            zpd1Var = new zpd1(this, lnmVar);
        }
        Object objJ = zpd1Var.a;
        int i2 = zpd1Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objJ);
                cqd1Var.getClass();
                Single singleA = jgz0.a(this.f, PlayOrigin.create("spotify-tap-ble"), LoggingParams.builder().build(), (Boolean) null, 28);
                zpd1Var.c = 1;
                objJ = fc11.j(singleA, zpd1Var);
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
            Logger.e(e2, "Tap BLE: Playback failed", new Object[0]);
        }
        return rih1.a;
    }
}
