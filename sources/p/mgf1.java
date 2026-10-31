package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mgf1 {
    public static final bma1 g;
    public static final bma1 h;
    public final jgf1 a;
    public final yqg b;
    public final llm c;
    public final ucd d;
    public final Context e;
    public final joo f;

    static {
        nbc nbcVar = bma1.b;
        g = nbcVar.u("TopUpEligibility.eligible");
        h = nbcVar.u("TopUpEligibility.expiresAt");
    }

    public mgf1(jgf1 jgf1Var, yqg yqgVar, llm llmVar, ucd ucdVar, Context context, joo jooVar) {
        this.a = jgf1Var;
        this.b = yqgVar;
        this.c = llmVar;
        this.d = ucdVar;
        this.e = context;
        this.f = jooVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(onm onmVar) {
        kgf1 kgf1Var;
        if (onmVar instanceof kgf1) {
            kgf1Var = (kgf1) onmVar;
            int i = kgf1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kgf1Var.c = i - Integer.MIN_VALUE;
            } else {
                kgf1Var = new kgf1(this, onmVar);
            }
        } else {
            kgf1Var = new kgf1(this, onmVar);
        }
        Object objA = kgf1Var.a;
        int i2 = kgf1Var.c;
        if (i2 == 0) {
            hm5.M(objA);
            kgf1Var.c = 1;
            objA = this.f.a(kgf1Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objA);
        }
        Context context = this.e;
        return this.d.b.b(context, (String) objA);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(onm onmVar) {
        lgf1 lgf1Var;
        if (onmVar instanceof lgf1) {
            lgf1Var = (lgf1) onmVar;
            int i = lgf1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lgf1Var.c = i - Integer.MIN_VALUE;
            } else {
                lgf1Var = new lgf1(this, onmVar);
            }
        } else {
            lgf1Var = new lgf1(this, onmVar);
        }
        Object objA = lgf1Var.a;
        int i2 = lgf1Var.c;
        if (i2 == 0) {
            hm5.M(objA);
            lgf1Var.c = 1;
            objA = a(lgf1Var);
            Object obj = d9n.a;
            if (objA == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objA);
        }
        dma1 dma1Var = (dma1) objA;
        long jB = this.b.b();
        long jG = dma1Var.g(h, 0L);
        bma1 bma1Var = g;
        if (jB < jG) {
            return Boolean.valueOf(dma1Var.h(bma1Var, false));
        }
        fn31.T(this.c, (o8n) null, 0, new wn2((Object) this, jB, (Object) dma1Var, (lnm) null, (byte) 18), 3);
        return Boolean.valueOf(dma1Var.h(bma1Var, false));
    }
}
