package p;

import com.spotify.base.java.logging.Logger;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class l5g0 {
    public final ezb1 a;
    public final y281 b;
    public final lzn0 c;
    public final yu3 d;
    public final ix7 e;
    public final ConcurrentHashMap f = new ConcurrentHashMap();

    public l5g0(ezb1 ezb1Var, y281 y281Var, owo owoVar, qwo qwoVar, h8l0 h8l0Var, n8l0 n8l0Var, lzn0 lzn0Var, twb twbVar) {
        this.a = ezb1Var;
        this.b = y281Var;
        this.c = lzn0Var;
        this.d = owoVar.a(n8l0Var);
        this.e = qwoVar.a(h8l0Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, String str2, g4a g4aVar, onm onmVar) {
        h5g0 h5g0Var;
        k6g0 m231Var;
        if (onmVar instanceof h5g0) {
            h5g0Var = (h5g0) onmVar;
            int i = h5g0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                h5g0Var.d = i - Integer.MIN_VALUE;
            } else {
                h5g0Var = new h5g0(this, onmVar);
            }
        } else {
            h5g0Var = new h5g0(this, onmVar);
        }
        Object obj = h5g0Var.b;
        int i2 = h5g0Var.d;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                y281 y281Var = this.b;
                h5g0Var.a = str2;
                h5g0Var.d = 1;
                rih1 rih1VarH = ((va40) y281Var.b).h(str2, str, g4aVar, h5g0Var);
                rih1 rih1Var = d9n.a;
                if (rih1VarH != rih1Var) {
                    rih1VarH = rih1.a;
                }
                if (rih1VarH == rih1Var) {
                    return rih1Var;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str2 = h5g0Var.a;
                hm5.M(obj);
            }
            m231Var = new k6g0(str2);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        if (thA == null) {
            return m231Var;
        }
        Logger.e(thA, l1d.m("Error restoring entity to list: ", str2), new Object[0]);
        return new j6g0(str2);
    }
}
