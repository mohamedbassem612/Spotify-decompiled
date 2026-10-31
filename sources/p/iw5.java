package p;

import com.spotify.base.java.logging.Logger;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class iw5 implements ote0 {
    public final lw5 a;
    public final ynb0 b;
    public final q8n c;

    public iw5(lw5 lw5Var, ynb0 ynb0Var, q8n q8nVar) {
        this.a = lw5Var;
        this.b = ynb0Var;
        this.c = q8nVar;
    }

    public final void a(x8c0 x8c0Var) {
        u9c0 u9c0VarH = zso1.H(x8c0Var);
        fn31.T(u9c0VarH, this.c, 0, new hi2(this, u9c0VarH, (lnm) null, (byte) 26), 2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(m2t m2tVar, onm onmVar) {
        hw5 hw5Var;
        if (onmVar instanceof hw5) {
            hw5Var = (hw5) onmVar;
            int i = hw5Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                hw5Var.d = i - Integer.MIN_VALUE;
            } else {
                hw5Var = new hw5(this, onmVar);
            }
        } else {
            hw5Var = new hw5(this, onmVar);
        }
        Object obj = hw5Var.b;
        int i2 = hw5Var.d;
        d9n d9nVar = rih1.a;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m2t m2tVar2 = hw5Var.a;
                hm5.M(obj);
                return d9nVar;
            }
            hm5.M(obj);
            hw5Var.a = m2tVar;
            hw5Var.d = 1;
            m2tVar.a.a.m0(new pvg1("cold_startup"));
            d9n d9nVar2 = d9n.a;
            return d9nVar == d9nVar2 ? d9nVar2 : d9nVar;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Logger.e(th, "[AppReadiness] Startup settled action failed: ".concat(m2tVar.getClass().getName()), new Object[0]);
            return d9nVar;
        }
    }
}
