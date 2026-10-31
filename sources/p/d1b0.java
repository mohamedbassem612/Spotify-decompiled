package p;

import android.os.Bundle;
import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class d1b0 {
    public static final long h;
    public static final /* synthetic */ int i = 0;
    public final lzn0 a;
    public final dg30 b;
    public final e1b0 c;
    public final Flowable d;
    public final f1b0 e;
    public final uu00 f;
    public final kly0 g;

    static {
        ytw0 ytw0Var = jfv.b;
        h = fdg1.k0(1, ngv.g);
    }

    public d1b0(lzn0 lzn0Var, dg30 dg30Var, e1b0 e1b0Var, Flowable flowable, f1b0 f1b0Var, uu00 uu00Var, kly0 kly0Var) {
        this.a = lzn0Var;
        this.b = dg30Var;
        this.c = e1b0Var;
        this.d = flowable;
        this.e = f1b0Var;
        this.f = uu00Var;
        this.g = kly0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object a(onm onmVar) {
        c1b0 c1b0Var;
        jfv jfvVar;
        e1b0 e1b0Var = this.c;
        yqg yqgVar = e1b0Var.a;
        dma1 dma1Var = e1b0Var.b;
        if (onmVar instanceof c1b0) {
            c1b0Var = (c1b0) onmVar;
            int i2 = c1b0Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c1b0Var.c = i2 - Integer.MIN_VALUE;
            } else {
                c1b0Var = new c1b0(this, onmVar);
            }
        } else {
            c1b0Var = new c1b0(this, onmVar);
        }
        Object obj = c1b0Var.a;
        int i3 = c1b0Var.c;
        rih1 rih1Var = rih1.a;
        byte b = 1;
        lnm lnmVar = null;
        if (i3 == 0) {
            hm5.M(obj);
            long jG = dma1Var.g(e1b0.c, 0L);
            Long lValueOf = Long.valueOf(jG);
            if (jG == 0) {
                lValueOf = null;
            }
            if (lValueOf != null) {
                long jLongValue = lValueOf.longValue();
                ytw0 ytw0Var = jfv.b;
                jfvVar = new jfv(fdg1.l0(yqgVar.b() - jLongValue, ngv.d));
            } else {
                jfvVar = null;
            }
            if (jfvVar != null && jfv.c(jfvVar.a, h) < 0) {
                return rih1Var;
            }
            jge jgeVarE = hu20.e(this.e.a, new z0b0(lnmVar, this, b));
            nw5 nw5Var = new nw5(2, (lnm) null, (byte) 12);
            c1b0Var.c = 1;
            Object objJ = b5p1.j(jgeVarE, nw5Var, c1b0Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        l1d.B(yqgVar, dma1Var.edit(), e1b0.c);
        String str = nik1.u0.a;
        dg30 dg30Var = this.b;
        lzn0 lzn0Var = this.a;
        if (lzn0Var.j(dg30Var)) {
            lzn0Var.h(str);
            return rih1Var;
        }
        a1r0.j((a1r0) this.g.get(), str, (String) null, (Bundle) null, false, 14);
        return rih1Var;
    }
}
