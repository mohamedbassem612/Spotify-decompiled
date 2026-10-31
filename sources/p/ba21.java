package p;

import android.content.res.Resources;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ba21 {
    public final e2b0 a;
    public final lzn0 b;
    public final kt91 c;
    public final Resources d;
    public final q8n e;
    public final q8n f;

    public ba21(e2b0 e2b0Var, lzn0 lzn0Var, kt91 kt91Var, Resources resources, q8n q8nVar, q8n q8nVar2) {
        this.a = e2b0Var;
        this.b = lzn0Var;
        this.c = kt91Var;
        this.d = resources;
        this.e = q8nVar;
        this.f = q8nVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(onm onmVar) {
        aa21 aa21Var;
        if (onmVar instanceof aa21) {
            aa21Var = (aa21) onmVar;
            int i = aa21Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aa21Var.c = i - Integer.MIN_VALUE;
            } else {
                aa21Var = new aa21(this, onmVar);
            }
        } else {
            aa21Var = new aa21(this, onmVar);
        }
        Object obj = aa21Var.a;
        int i2 = aa21Var.c;
        rih1 m231Var = rih1.a;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                k2b0 k2b0Var = this.a;
                aa21Var.c = 1;
                Object objH = k2b0Var.a.h(aa21Var);
                d9n d9nVar = d9n.a;
                if (objH != d9nVar) {
                    objH = m231Var;
                }
                if (objH == d9nVar) {
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
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        return e331.a(m231Var) == null ? ga21.a : fa21.a;
    }
}
