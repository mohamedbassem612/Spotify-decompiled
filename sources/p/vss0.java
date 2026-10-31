package p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vss0 implements rhh0 {
    public final dts0 a;
    public final ham b;

    public vss0(dts0 dts0Var, ham hamVar) {
        this.a = dts0Var;
        this.b = hamVar;
    }

    public final Observable a(r9c r9cVar) {
        return yoi1.i(new m9r0(yoi1.g(this.a.e(r9cVar, 1)), this, (byte) 5), o6x.a);
    }

    public final Single b(r9c r9cVar) {
        return rqt0.F(o6x.a, new ian0(this, r9cVar, (lnm) null, (byte) 11));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(List list, onm onmVar) {
        tss0 tss0Var;
        if (onmVar instanceof tss0) {
            tss0Var = (tss0) onmVar;
            int i = tss0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                tss0Var.d = i - Integer.MIN_VALUE;
            } else {
                tss0Var = new tss0(this, onmVar);
            }
        } else {
            tss0Var = new tss0(this, onmVar);
        }
        Object objL = tss0Var.b;
        int i2 = tss0Var.d;
        try {
            if (i2 == 0) {
                hm5.M(objL);
                ham hamVar = this.b;
                tss0Var.a = list;
                tss0Var.d = 1;
                objL = hamVar.l(list, tss0Var);
                Object obj = d9n.a;
                if (objL == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                list = tss0Var.a;
                hm5.M(objL);
            }
            return (List) objL;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.l(e2, "Subtitle decoration failed", new Object[0]);
            return list;
        }
    }
}
