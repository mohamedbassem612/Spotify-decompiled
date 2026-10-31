package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ata0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ mta0 a;

    public ata0(mta0 mta0Var) {
        this.a = mta0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        zsa0 zsa0Var;
        if (onmVar instanceof zsa0) {
            zsa0Var = (zsa0) onmVar;
            int i = zsa0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                zsa0Var.b = i - Integer.MIN_VALUE;
            } else {
                zsa0Var = new zsa0(this, onmVar);
            }
        } else {
            zsa0Var = new zsa0(this, onmVar);
        }
        Object obj2 = zsa0Var.a;
        int i2 = zsa0Var.b;
        try {
            if (i2 == 0) {
                hm5.M(obj2);
                esa0 esa0Var = (esa0) obj;
                fns fnsVar = igu.a;
                bs50 bs50Var = pyf0.a;
                y160 y160Var = new y160(this.a, esa0Var, (lnm) null, (byte) 18);
                zsa0Var.b = 1;
                Object objY = fn31.Y(bs50Var, y160Var, zsa0Var);
                d9n d9nVar = d9n.a;
                if (objY == d9nVar) {
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
            n57.t("Failed to open the DJ playlist", e2);
        }
        return rih1.a;
    }
}
