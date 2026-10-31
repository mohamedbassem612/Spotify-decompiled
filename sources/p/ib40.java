package p;

import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ib40 {
    public final xb40 a;
    public final z710 b;
    public final va40 c;
    public final sp00 d;
    public final q8n e;

    public ib40(xb40 xb40Var, z710 z710Var, va40 va40Var, sp00 sp00Var, q8n q8nVar) {
        this.a = xb40Var;
        this.b = z710Var;
        this.c = va40Var;
        this.d = sp00Var;
        this.e = q8nVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ab40 ab40Var, onm onmVar) {
        hb40 hb40Var;
        if (onmVar instanceof hb40) {
            hb40Var = (hb40) onmVar;
            int i = hb40Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hb40Var.c = i - Integer.MIN_VALUE;
            } else {
                hb40Var = new hb40(this, onmVar);
            }
        } else {
            hb40Var = new hb40(this, onmVar);
        }
        Object obj = hb40Var.a;
        int i2 = hb40Var.c;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                va40 va40Var = this.c;
                String str = ab40Var.e;
                LinkedHashMap linkedHashMap = ab40Var.f;
                hb40Var.c = 1;
                d9n d9nVarG = va40Var.g(str, linkedHashMap, hb40Var);
                d9n d9nVar = d9n.a;
                if (d9nVarG == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
            return kb40.a;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            return new ob40(e2);
        }
    }
}
