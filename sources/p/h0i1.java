package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class h0i1 {
    public static final bma1 e;
    public static final bma1 f;
    public static final bma1 g;
    public static final bma1 h;
    public static final bma1 i;
    public final joo a;
    public final ut71 b;
    public final Context c;
    public final yqg d;

    static {
        nbc nbcVar = bma1.b;
        e = nbcVar.u("UpsellOfferStorageImpl.CTA_TEXT_KEY");
        f = nbcVar.u("UpsellOfferStorageImpl.CTA_EXPIRATION_KEY");
        g = nbcVar.u("UpsellOfferStorageImpl.CTA_RENEW_AFTER_KEY");
        h = nbcVar.u("UpsellOfferStorageImpl.CTA_LINK_KEY");
        i = nbcVar.u("UpsellOfferStorageImpl.LEGAL_DISCLAIMER_KEY");
    }

    public h0i1(joo jooVar, ut71 ut71Var, Context context, yqg yqgVar) {
        this.a = jooVar;
        this.b = ut71Var;
        this.c = context;
        this.d = yqgVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(onm onmVar) {
        b0i1 b0i1Var;
        if (onmVar instanceof b0i1) {
            b0i1Var = (b0i1) onmVar;
            int i2 = b0i1Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                b0i1Var.c = i2 - Integer.MIN_VALUE;
            } else {
                b0i1Var = new b0i1(this, onmVar);
            }
        } else {
            b0i1Var = new b0i1(this, onmVar);
        }
        Object objD = b0i1Var.a;
        int i3 = b0i1Var.c;
        if (i3 == 0) {
            hm5.M(objD);
            b0i1Var.c = 1;
            objD = d(b0i1Var);
            d9n d9nVar = d9n.a;
            if (objD == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objD);
        }
        hma1 hma1VarEdit = ((dma1) objD).edit();
        hma1VarEdit.f(f);
        hma1VarEdit.f(e);
        hma1VarEdit.f(h);
        hma1VarEdit.f(i);
        hma1VarEdit.g();
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(onm onmVar) {
        c0i1 c0i1Var;
        if (onmVar instanceof c0i1) {
            c0i1Var = (c0i1) onmVar;
            int i2 = c0i1Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0i1Var.c = i2 - Integer.MIN_VALUE;
            } else {
                c0i1Var = new c0i1(this, onmVar);
            }
        } else {
            c0i1Var = new c0i1(this, onmVar);
        }
        Object objD = c0i1Var.a;
        int i3 = c0i1Var.c;
        String str = null;
        if (i3 == 0) {
            hm5.M(objD);
            c0i1Var.c = 1;
            objD = d(c0i1Var);
            d9n d9nVar = d9n.a;
            if (objD == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objD);
        }
        dma1 dma1Var = (dma1) objD;
        long jG = dma1Var.g(f, -1L);
        String strE = dma1Var.e(e, (String) null);
        if (strE == null || strE.length() == 0 || (jG != -1 && jG <= this.d.b())) {
            return null;
        }
        String strE2 = dma1Var.e(h, (String) null);
        if (strE2 == null || strE2.length() <= 0) {
            strE2 = null;
        }
        String strE3 = dma1Var.e(i, (String) null);
        if (strE3 != null && strE3.length() > 0) {
            str = strE3;
        }
        return new s3c1(strE, strE2, str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(onm onmVar) {
        d0i1 d0i1Var;
        if (onmVar instanceof d0i1) {
            d0i1Var = (d0i1) onmVar;
            int i2 = d0i1Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d0i1Var.c = i2 - Integer.MIN_VALUE;
            } else {
                d0i1Var = new d0i1(this, onmVar);
            }
        } else {
            d0i1Var = new d0i1(this, onmVar);
        }
        Object objD = d0i1Var.a;
        int i3 = d0i1Var.c;
        if (i3 == 0) {
            hm5.M(objD);
            d0i1Var.c = 1;
            objD = d(d0i1Var);
            d9n d9nVar = d9n.a;
            if (objD == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objD);
        }
        return yah0.q(((dma1) objD).g(g, -1L));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(onm onmVar) {
        e0i1 e0i1Var;
        if (onmVar instanceof e0i1) {
            e0i1Var = (e0i1) onmVar;
            int i2 = e0i1Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                e0i1Var.c = i2 - Integer.MIN_VALUE;
            } else {
                e0i1Var = new e0i1(this, onmVar);
            }
        } else {
            e0i1Var = new e0i1(this, onmVar);
        }
        Object objA = e0i1Var.a;
        int i3 = e0i1Var.c;
        if (i3 == 0) {
            hm5.M(objA);
            e0i1Var.c = 1;
            objA = this.a.a(e0i1Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objA);
        }
        return this.b.b(this.c, (String) objA);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(s3c1 s3c1Var, Long l, onm onmVar) {
        f0i1 f0i1Var;
        s3c1 s3c1Var2;
        long j;
        if (onmVar instanceof f0i1) {
            f0i1Var = (f0i1) onmVar;
            int i2 = f0i1Var.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f0i1Var.e = i2 - Integer.MIN_VALUE;
            } else {
                f0i1Var = new f0i1(this, onmVar);
            }
        } else {
            f0i1Var = new f0i1(this, onmVar);
        }
        Object obj = f0i1Var.c;
        int i3 = f0i1Var.e;
        if (i3 == 0) {
            hm5.M(obj);
            long jLongValue = (l == null || l.longValue() <= 0) ? -1L : l.longValue();
            f0i1Var.a = s3c1Var;
            f0i1Var.b = jLongValue;
            f0i1Var.e = 1;
            Object objD = d(f0i1Var);
            d9n d9nVar = d9n.a;
            if (objD == d9nVar) {
                return d9nVar;
            }
            long j2 = jLongValue;
            obj = objD;
            s3c1Var2 = s3c1Var;
            j = j2;
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = f0i1Var.b;
            s3c1Var2 = f0i1Var.a;
            hm5.M(obj);
        }
        hma1 hma1VarEdit = ((dma1) obj).edit();
        hma1VarEdit.d(e, s3c1Var2.b());
        hma1VarEdit.c(f, j);
        String strA = s3c1Var2.a();
        if (strA == null) {
            strA = "";
        }
        hma1VarEdit.d(h, strA);
        String strC = s3c1Var2.c();
        hma1VarEdit.d(i, strC != null ? strC : "");
        hma1VarEdit.g();
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(long j, onm onmVar) {
        g0i1 g0i1Var;
        if (onmVar instanceof g0i1) {
            g0i1Var = (g0i1) onmVar;
            int i2 = g0i1Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g0i1Var.d = i2 - Integer.MIN_VALUE;
            } else {
                g0i1Var = new g0i1(this, onmVar);
            }
        } else {
            g0i1Var = new g0i1(this, onmVar);
        }
        Object objD = g0i1Var.b;
        int i3 = g0i1Var.d;
        if (i3 == 0) {
            hm5.M(objD);
            g0i1Var.a = j;
            g0i1Var.d = 1;
            objD = d(g0i1Var);
            d9n d9nVar = d9n.a;
            if (objD == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = g0i1Var.a;
            hm5.M(objD);
        }
        hma1 hma1VarEdit = ((dma1) objD).edit();
        hma1VarEdit.c(g, j);
        hma1VarEdit.g();
        return rih1.a;
    }
}
