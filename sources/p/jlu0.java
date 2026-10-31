package p;

import com.spotify.base.java.logging.Logger;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public abstract class jlu0 {
    public static final long a;

    static {
        ytw0 ytw0Var = jfv.b;
        a = fdg1.k0(5, ngv.e);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(iyc0 iyc0Var, String str, onm onmVar) {
        ilu0 ilu0Var;
        Boolean m231Var;
        if (onmVar instanceof ilu0) {
            ilu0Var = (ilu0) onmVar;
            int i = ilu0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ilu0Var.c = i - Integer.MIN_VALUE;
            } else {
                ilu0Var = new ilu0(onmVar);
            }
        } else {
            ilu0Var = new ilu0(onmVar);
        }
        Object objP = ilu0Var.b;
        int i2 = ilu0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objP);
                long j = a;
                f3t0 f3t0Var = new f3t0(iyc0Var, str, (lnm) null, (byte) 22);
                ilu0Var.a = str;
                ilu0Var.c = 1;
                objP = rc2.P(j, f3t0Var, ilu0Var);
                d9n d9nVar = d9n.a;
                if (objP == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = ilu0Var.a;
                hm5.M(objP);
            }
            m231Var = Boolean.valueOf(u890.j(objP, Boolean.TRUE));
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        if (thA != null) {
            Logger.l(thA, "Failed to enable mixing on created playlist %s", new Object[]{str});
            return Boolean.FALSE;
        }
        Boolean bool = m231Var;
        if (!bool.booleanValue()) {
            Logger.k("Mixing was not enabled on created playlist %s", new Object[]{str});
        }
        return bool;
    }
}
