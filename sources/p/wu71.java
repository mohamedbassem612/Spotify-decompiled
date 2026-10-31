package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class wu71 {
    public static final bma1 d = bma1.b.u("com.spotify.widgets.npvwidget.KEY_PREFS_CAMPAIGN_DISMISSED");
    public final Context a;
    public final ut71 b;
    public final mr20 c;

    public wu71(Context context, ut71 ut71Var, mr20 mr20Var) {
        this.a = context;
        this.b = ut71Var;
        this.c = mr20Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(onm onmVar) {
        su71 su71Var;
        if (onmVar instanceof su71) {
            su71Var = (su71) onmVar;
            int i = su71Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                su71Var.c = i - Integer.MIN_VALUE;
            } else {
                su71Var = new su71(this, onmVar);
            }
        } else {
            su71Var = new su71(this, onmVar);
        }
        Object objB = su71Var.a;
        int i2 = su71Var.c;
        if (i2 == 0) {
            hm5.M(objB);
            su71Var.c = 1;
            objB = b(su71Var);
            Object obj = d9n.a;
            if (objB == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objB);
        }
        String str = (String) objB;
        int length = str.length();
        rih1 rih1Var = rih1.a;
        if (length == 0) {
            return rih1Var;
        }
        hma1 hma1VarEdit = this.b.b(this.a, str).edit();
        hma1VarEdit.f(d);
        hma1VarEdit.g();
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(onm onmVar) {
        tu71 tu71Var;
        if (onmVar instanceof tu71) {
            tu71Var = (tu71) onmVar;
            int i = tu71Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tu71Var.c = i - Integer.MIN_VALUE;
            } else {
                tu71Var = new tu71(this, onmVar);
            }
        } else {
            tu71Var = new tu71(this, onmVar);
        }
        Object objJ = tu71Var.a;
        int i2 = tu71Var.c;
        if (i2 == 0) {
            hm5.M(objJ);
            ck01 ck01Var = new ck01(2, (lnm) null, (byte) 18);
            tu71Var.c = 1;
            objJ = b5p1.j(this.c, ck01Var, tu71Var);
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
    public final Object c(onm onmVar) {
        uu71 uu71Var;
        if (onmVar instanceof uu71) {
            uu71Var = (uu71) onmVar;
            int i = uu71Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                uu71Var.c = i - Integer.MIN_VALUE;
            } else {
                uu71Var = new uu71(this, onmVar);
            }
        } else {
            uu71Var = new uu71(this, onmVar);
        }
        Object objB = uu71Var.a;
        int i2 = uu71Var.c;
        if (i2 == 0) {
            hm5.M(objB);
            uu71Var.c = 1;
            objB = b(uu71Var);
            Object obj = d9n.a;
            if (objB == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objB);
        }
        String str = (String) objB;
        return str.length() == 0 ? Boolean.FALSE : Boolean.valueOf(this.b.b(this.a, str).h(d, false));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(onm onmVar) {
        vu71 vu71Var;
        if (onmVar instanceof vu71) {
            vu71Var = (vu71) onmVar;
            int i = vu71Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vu71Var.c = i - Integer.MIN_VALUE;
            } else {
                vu71Var = new vu71(this, onmVar);
            }
        } else {
            vu71Var = new vu71(this, onmVar);
        }
        Object objB = vu71Var.a;
        int i2 = vu71Var.c;
        if (i2 == 0) {
            hm5.M(objB);
            vu71Var.c = 1;
            objB = b(vu71Var);
            Object obj = d9n.a;
            if (objB == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objB);
        }
        String str = (String) objB;
        int length = str.length();
        rih1 rih1Var = rih1.a;
        if (length == 0) {
            return rih1Var;
        }
        hma1 hma1VarEdit = this.b.b(this.a, str).edit();
        hma1VarEdit.a(d, true);
        hma1VarEdit.g();
        return rih1Var;
    }
}
