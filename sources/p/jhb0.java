package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class jhb0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ phb0 a;
    public final /* synthetic */ cir0 b;

    public jhb0(phb0 phb0Var, cir0 cir0Var) {
        this.a = phb0Var;
        this.b = cir0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) throws Exception {
        ihb0 ihb0Var;
        kib0 kib0Var = this.a.b;
        if (onmVar instanceof ihb0) {
            ihb0Var = (ihb0) onmVar;
            int i = ihb0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ihb0Var.b = i - Integer.MIN_VALUE;
            } else {
                ihb0Var = new ihb0(this, onmVar);
            }
        } else {
            ihb0Var = new ihb0(this, onmVar);
        }
        Object obj2 = ihb0Var.a;
        int i2 = ihb0Var.b;
        rih1 rih1Var = rih1.a;
        try {
            if (i2 == 0) {
                hm5.M(obj2);
                fhb0 fhb0Var = (fhb0) obj;
                kib0Var.a = true;
                myq0 myq0VarA = this.b.a();
                qhs0 qhs0Var = fhb0Var.a;
                y231 y231Var = new y231(new qib0(qhs0Var.a, qhs0Var.b, qhs0Var.c, qhs0Var.d));
                ihb0Var.b = 1;
                Object objY = fn31.Y((q8n) myq0VarA.b, new e3p0(myq0VarA, y231Var, (lnm) null, (byte) 22), ihb0Var);
                d9n d9nVar = d9n.a;
                if (objY != d9nVar) {
                    objY = rih1Var;
                }
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
            return rih1Var;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            kib0Var.a = false;
            throw e2;
        }
    }
}
