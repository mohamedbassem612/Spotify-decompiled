package p;

import io.reactivex.rxjava3.internal.operators.completable.CompletableCreate;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class tu40 {
    public final ljg a;
    public final gw70 b;
    public final qib c;
    public final f95 d;
    public final hrr0 e = xto.t((Object) null);

    public tu40(ljg ljgVar, gw70 gw70Var, qib qibVar, f95 f95Var) {
        this.a = ljgVar;
        this.b = gw70Var;
        this.c = qibVar;
        this.d = f95Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, onm onmVar) {
        nu40 nu40Var;
        if (onmVar instanceof nu40) {
            nu40Var = (nu40) onmVar;
            int i = nu40Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nu40Var.c = i - Integer.MIN_VALUE;
            } else {
                nu40Var = new nu40(this, onmVar);
            }
        } else {
            nu40Var = new nu40(this, onmVar);
        }
        Object obj = nu40Var.a;
        int i2 = nu40Var.c;
        boolean z = true;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                CompletableCreate completableCreateO = this.b.f(str).o();
                nu40Var.c = 1;
                Object objI = fc11.i(completableCreateO, nu40Var);
                d9n d9nVar = d9n.a;
                if (objI == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            z = false;
        }
        return yah0.m(z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c7, code lost:
    
        if (r1 == r8) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(kotlin.jvm.functions.Function0 r26, p.onm r27) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.tu40.b(kotlin.jvm.functions.Function0, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00f0, code lost:
    
        if (r1 == r8) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(p.zt40 r29, kotlin.jvm.functions.Function0 r30, kotlin.jvm.functions.Function0 r31, p.onm r32) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.tu40.c(p.zt40, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, p.onm):java.lang.Object");
    }
}
