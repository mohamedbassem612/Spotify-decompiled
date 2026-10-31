package p;

import android.content.res.Resources;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ax3 {
    public final a2b0 a;
    public final kt91 b;
    public final los c;
    public final q7r0 d;
    public final Resources e;
    public final lzn0 f;
    public final sb40 g;
    public final i8h1 h;
    public final q8n i;

    public ax3(a2b0 a2b0Var, kt91 kt91Var, los losVar, q7r0 q7r0Var, Resources resources, lzn0 lzn0Var, sb40 sb40Var, i8h1 i8h1Var, q8n q8nVar) {
        this.a = a2b0Var;
        this.b = kt91Var;
        this.c = losVar;
        this.d = q7r0Var;
        this.e = resources;
        this.f = lzn0Var;
        this.g = sb40Var;
        this.h = i8h1Var;
        this.i = q8nVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(rw3 rw3Var, onm onmVar) {
        yw3 yw3Var;
        kza0 m231Var;
        if (onmVar instanceof yw3) {
            yw3Var = (yw3) onmVar;
            int i = yw3Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                yw3Var.c = i - Integer.MIN_VALUE;
            } else {
                yw3Var = new yw3(this, onmVar);
            }
        } else {
            yw3Var = new yw3(this, onmVar);
        }
        Object objC = yw3Var.a;
        int i2 = yw3Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objC);
                a2b0 a2b0Var = this.a;
                String str = rw3Var.i;
                yw3Var.c = 1;
                objC = a2b0Var.c(str, yw3Var);
                Object obj = d9n.a;
                if (objC == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objC);
            }
            m231Var = (kza0) objC;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        if (m231Var instanceof m231) {
            m231Var = kza0.a;
        }
        return new cx3(m231Var);
    }
}
