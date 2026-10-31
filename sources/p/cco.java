package p;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class cco {
    public static final long g;
    public static final /* synthetic */ int h = 0;
    public final jbo a;
    public final eco b;
    public final g1i c;
    public final fna d;
    public final jr2 e;
    public final q8n f;

    static {
        ytw0 ytw0Var = jfv.b;
        g = fdg1.k0(3, ngv.e);
    }

    public cco(jbo jboVar, eco ecoVar, g1i g1iVar, fna fnaVar, jr2 jr2Var, q8n q8nVar) {
        this.a = jboVar;
        this.b = ecoVar;
        this.c = g1iVar;
        this.d = fnaVar;
        this.e = jr2Var;
        this.f = q8nVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable a(String str, onm onmVar) {
        bco bcoVar;
        if (onmVar instanceof bco) {
            bcoVar = (bco) onmVar;
            int i = bcoVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                bcoVar.d = i - Integer.MIN_VALUE;
            } else {
                bcoVar = new bco(this, onmVar);
            }
        } else {
            bcoVar = new bco(this, onmVar);
        }
        Object objI = bcoVar.b;
        int i2 = bcoVar.d;
        try {
            if (i2 == 0) {
                hm5.M(objI);
                wr2 wr2Var = this.e;
                tt2 tt2Var = new tt2(str, (ot2) null);
                bcoVar.a = str;
                bcoVar.d = 1;
                objI = wr2Var.i(tt2Var, "in-app-aio", (String) null, bcoVar);
                d9n d9nVar = d9n.a;
                if (objI == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = bcoVar.a;
                hm5.M(objI);
            }
            ArrayList arrayList = ((ss2) objI).b;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str2 = ((bt2) it.next()).a;
                if (ihc1.y0(str2)) {
                    str2 = null;
                }
                if (str2 != null) {
                    arrayList2.add(str2);
                }
            }
            if (!arrayList2.isEmpty()) {
                this.a.b(str, arrayList2);
            }
            return arrayList2;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            return z6x.a;
        }
    }
}
