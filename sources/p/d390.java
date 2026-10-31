package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class d390 {
    public final ydf0 a = new ydf0(10);
    public final ydf0 b = new ydf0(10);
    public final xgn0 c = ygn0.a();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ga01 ga01Var, onm onmVar) {
        b390 b390Var;
        vgn0 vgn0Var;
        if (onmVar instanceof b390) {
            b390Var = (b390) onmVar;
            int i = b390Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                b390Var.e = i - Integer.MIN_VALUE;
            } else {
                b390Var = new b390(this, onmVar);
            }
        } else {
            b390Var = new b390(this, onmVar);
        }
        Object obj = b390Var.c;
        int i2 = b390Var.e;
        if (i2 == 0) {
            hm5.M(obj);
            b390Var.a = ga01Var;
            vgn0Var = this.c;
            b390Var.b = vgn0Var;
            b390Var.e = 1;
            Object objA = vgn0Var.a(b390Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vgn0 vgn0Var2 = b390Var.b;
            ga01 ga01Var2 = b390Var.a;
            hm5.M(obj);
            vgn0Var = vgn0Var2;
            ga01Var = ga01Var2;
        }
        try {
            return (k8g1) this.b.c(ga01Var);
        } finally {
            vgn0Var.c((Object) null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(ga01 ga01Var, k8g1 k8g1Var, onm onmVar) throws Throwable {
        c390 c390Var;
        int i;
        k8g1 k8g1Var2;
        vgn0 vgn0Var;
        vgn0 vgn0Var2;
        ga01 ga01Var2;
        k8g1 k8g1Var3;
        if (onmVar instanceof c390) {
            c390Var = (c390) onmVar;
            int i2 = c390Var.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c390Var.g = i2 - Integer.MIN_VALUE;
            } else {
                c390Var = new c390(this, onmVar);
            }
        } else {
            c390Var = new c390(this, onmVar);
        }
        Object obj = c390Var.e;
        int i3 = c390Var.g;
        d9n d9nVar = d9n.a;
        try {
            if (i3 == 0) {
                hm5.M(obj);
                c390Var.a = ga01Var;
                c390Var.b = k8g1Var;
                vgn0 vgn0Var3 = this.c;
                c390Var.c = vgn0Var3;
                i = 0;
                c390Var.d = 0;
                c390Var.g = 1;
                if (vgn0Var3.a(c390Var) != d9nVar) {
                    k8g1Var2 = k8g1Var;
                    vgn0Var = vgn0Var3;
                }
                return d9nVar;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                vgn0Var2 = c390Var.c;
                k8g1Var3 = c390Var.b;
                ga01Var2 = c390Var.a;
                try {
                    hm5.M(obj);
                    vgn0Var2.c((Object) null);
                    return rih1.a;
                } catch (Throwable th) {
                    th = th;
                    vgn0Var2.c((Object) null);
                    throw th;
                }
            }
            int i4 = c390Var.d;
            vgn0Var = c390Var.c;
            k8g1 k8g1Var4 = c390Var.b;
            ga01 ga01Var3 = c390Var.a;
            hm5.M(obj);
            k8g1Var2 = k8g1Var4;
            i = i4;
            ga01Var = ga01Var3;
            c390Var.a = ga01Var;
            c390Var.b = k8g1Var2;
            c390Var.c = vgn0Var;
            c390Var.d = i;
            c390Var.g = 2;
            if (hap1.i(0L, c390Var) != d9nVar) {
                ga01Var2 = ga01Var;
                vgn0Var2 = vgn0Var;
                k8g1Var3 = k8g1Var2;
                vgn0Var2.c((Object) null);
                return rih1.a;
            }
            return d9nVar;
        } catch (Throwable th2) {
            th = th2;
            vgn0Var2 = vgn0Var;
            vgn0Var2.c((Object) null);
            throw th;
        }
    }
}
