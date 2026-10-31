package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class cv71 {
    public static final bma1 f;
    public static final bma1 g;
    public final Context a;
    public final ut71 b;
    public final mr20 c;
    public final xgn0 d = ygn0.a();
    public final xgn0 e = ygn0.a();

    static {
        nbc nbcVar = bma1.b;
        f = nbcVar.u("com.spotify.widgets.dynamicnpvwidget.wrapped.KEY_STORY_TAP_COUNT");
        g = nbcVar.u("com.spotify.widgets.dynamicnpvwidget.wrapped.KEY_PLAYLIST_TAP_COUNT");
    }

    public cv71(Context context, ut71 ut71Var, mr20 mr20Var) {
        this.a = context;
        this.b = ut71Var;
        this.c = mr20Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(onm onmVar) {
        xu71 xu71Var;
        if (onmVar instanceof xu71) {
            xu71Var = (xu71) onmVar;
            int i = xu71Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xu71Var.c = i - Integer.MIN_VALUE;
            } else {
                xu71Var = new xu71(this, onmVar);
            }
        } else {
            xu71Var = new xu71(this, onmVar);
        }
        Object objJ = xu71Var.a;
        int i2 = xu71Var.c;
        if (i2 == 0) {
            hm5.M(objJ);
            ck01 ck01Var = new ck01(2, (lnm) null, (byte) 19);
            xu71Var.c = 1;
            objJ = b5p1.j(this.c, ck01Var, xu71Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        return ((th61) objJ).a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(onm onmVar) {
        yu71 yu71Var;
        if (onmVar instanceof yu71) {
            yu71Var = (yu71) onmVar;
            int i = yu71Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                yu71Var.c = i - Integer.MIN_VALUE;
            } else {
                yu71Var = new yu71(this, onmVar);
            }
        } else {
            yu71Var = new yu71(this, onmVar);
        }
        Object objA = yu71Var.a;
        int i2 = yu71Var.c;
        if (i2 == 0) {
            hm5.M(objA);
            yu71Var.c = 1;
            objA = a(yu71Var);
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
        String str = (String) objA;
        return str.length() == 0 ? new Integer(0) : new Integer(this.b.b(this.a, str).l(g, 0));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(onm onmVar) {
        zu71 zu71Var;
        if (onmVar instanceof zu71) {
            zu71Var = (zu71) onmVar;
            int i = zu71Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zu71Var.c = i - Integer.MIN_VALUE;
            } else {
                zu71Var = new zu71(this, onmVar);
            }
        } else {
            zu71Var = new zu71(this, onmVar);
        }
        Object objA = zu71Var.a;
        int i2 = zu71Var.c;
        if (i2 == 0) {
            hm5.M(objA);
            zu71Var.c = 1;
            objA = a(zu71Var);
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
        String str = (String) objA;
        return str.length() == 0 ? new Integer(0) : new Integer(this.b.b(this.a, str).l(f, 0));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(onm onmVar) {
        av71 av71Var;
        xgn0 xgn0Var;
        String str;
        if (onmVar instanceof av71) {
            av71Var = (av71) onmVar;
            int i = av71Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                av71Var.e = i - Integer.MIN_VALUE;
            } else {
                av71Var = new av71(this, onmVar);
            }
        } else {
            av71Var = new av71(this, onmVar);
        }
        Object objA = av71Var.c;
        int i2 = av71Var.e;
        rih1 rih1Var = rih1.a;
        Object obj = d9n.a;
        if (i2 == 0) {
            hm5.M(objA);
            av71Var.e = 1;
            objA = a(av71Var);
            if (objA != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            hm5.M(objA);
        } else {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xgn0Var = av71Var.b;
            str = av71Var.a;
            hm5.M(objA);
        }
        try {
            dma1 dma1VarB = this.b.b(this.a, str);
            bma1 bma1Var = g;
            int iL = dma1VarB.l(bma1Var, 0);
            hma1 hma1VarEdit = dma1VarB.edit();
            hma1VarEdit.b(bma1Var, iL + 1);
            hma1VarEdit.g();
            return rih1Var;
        } finally {
            xgn0Var.c((Object) null);
        }
        String str2 = (String) objA;
        if (str2.length() == 0) {
            return rih1Var;
        }
        av71Var.a = str2;
        xgn0Var = this.e;
        av71Var.b = xgn0Var;
        av71Var.e = 2;
        if (xgn0Var.a(av71Var) != obj) {
            str = str2;
            dma1 dma1VarB2 = this.b.b(this.a, str);
            bma1 bma1Var2 = g;
            int iL2 = dma1VarB2.l(bma1Var2, 0);
            hma1 hma1VarEdit2 = dma1VarB2.edit();
            hma1VarEdit2.b(bma1Var2, iL2 + 1);
            hma1VarEdit2.g();
            return rih1Var;
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(onm onmVar) {
        bv71 bv71Var;
        xgn0 xgn0Var;
        String str;
        if (onmVar instanceof bv71) {
            bv71Var = (bv71) onmVar;
            int i = bv71Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                bv71Var.e = i - Integer.MIN_VALUE;
            } else {
                bv71Var = new bv71(this, onmVar);
            }
        } else {
            bv71Var = new bv71(this, onmVar);
        }
        Object objA = bv71Var.c;
        int i2 = bv71Var.e;
        rih1 rih1Var = rih1.a;
        Object obj = d9n.a;
        if (i2 == 0) {
            hm5.M(objA);
            bv71Var.e = 1;
            objA = a(bv71Var);
            if (objA != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            hm5.M(objA);
        } else {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xgn0Var = bv71Var.b;
            str = bv71Var.a;
            hm5.M(objA);
        }
        try {
            dma1 dma1VarB = this.b.b(this.a, str);
            bma1 bma1Var = f;
            int iL = dma1VarB.l(bma1Var, 0);
            hma1 hma1VarEdit = dma1VarB.edit();
            hma1VarEdit.b(bma1Var, iL + 1);
            hma1VarEdit.g();
            return rih1Var;
        } finally {
            xgn0Var.c((Object) null);
        }
        String str2 = (String) objA;
        if (str2.length() == 0) {
            return rih1Var;
        }
        bv71Var.a = str2;
        xgn0Var = this.d;
        bv71Var.b = xgn0Var;
        bv71Var.e = 2;
        if (xgn0Var.a(bv71Var) != obj) {
            str = str2;
            dma1 dma1VarB2 = this.b.b(this.a, str);
            bma1 bma1Var2 = f;
            int iL2 = dma1VarB2.l(bma1Var2, 0);
            hma1 hma1VarEdit2 = dma1VarB2.edit();
            hma1VarEdit2.b(bma1Var2, iL2 + 1);
            hma1VarEdit2.g();
            return rih1Var;
        }
        return obj;
    }
}
