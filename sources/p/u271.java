package p;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class u271 {
    public final /* synthetic */ byte a;
    public final uu00 b;

    public /* synthetic */ u271(uu00 uu00Var, byte b) {
        this.a = b;
        this.b = uu00Var;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x009e  */
    /* JADX WARN: Code duplicated, block: B:9:0x0023  */
    public Object a(String str, onm onmVar) {
        xd71 xd71Var;
        ha81 ha81Var;
        byte b = this.a;
        zu00 zu00Var = this.b;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 1:
                if (onmVar instanceof xd71) {
                    xd71Var = (xd71) onmVar;
                    int i = xd71Var.c;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        xd71Var.c = i - Integer.MIN_VALUE;
                    } else {
                        xd71Var = new xd71(this, onmVar);
                    }
                } else {
                    xd71Var = new xd71(this, onmVar);
                }
                Object objL = xd71Var.a;
                int i2 = xd71Var.c;
                if (i2 == 0) {
                    hm5.M(objL);
                    Observable map = zu00Var.b(new oi("episode-share", false, new pg61(str, (byte) 9))).filter(gex0.X).map(new xrh(str, (byte) 7));
                    xd71Var.c = 1;
                    objL = fc11.l(map, 1, (Object) null, xd71Var);
                    if (objL == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i2 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(objL);
                }
                return ((tv00) objL).b;
            default:
                if (onmVar instanceof ha81) {
                    ha81Var = (ha81) onmVar;
                    int i3 = ha81Var.d;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        ha81Var.d = i3 - Integer.MIN_VALUE;
                    } else {
                        ha81Var = new ha81(this, onmVar);
                    }
                } else {
                    ha81Var = new ha81(this, onmVar);
                }
                Object objL2 = ha81Var.b;
                int i4 = ha81Var.d;
                if (i4 == 0) {
                    hm5.M(objL2);
                    Observable observableFilter = zu00Var.b(new oi("episode-share", false, new pg61(str, (byte) 17))).filter(hgx0.Y);
                    ha81Var.a = str;
                    ha81Var.d = 1;
                    objL2 = fc11.l(observableFilter, 1, (Object) null, ha81Var);
                    if (objL2 == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i4 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = ha81Var.a;
                    hm5.M(objL2);
                }
                uv00 uv00Var = (uv00) objL2;
                jo70 jo70Var = uv00Var.a(jo70.class, str).b;
                hll hllVar = uv00Var.a(hll.class, str).b;
                xkk1 xkk1Var = uv00Var.a(xkk1.class, str).b;
                return new ia81(jo70Var, hllVar, xkk1Var != null ? ucp1.p(xkk1Var) : null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(String str, uz70 uz70Var, onm onmVar) {
        t271 t271Var;
        mq70 mq70Var;
        vp70 vp70Var;
        if (onmVar instanceof t271) {
            t271Var = (t271) onmVar;
            int i = t271Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                t271Var.d = i - Integer.MIN_VALUE;
            } else {
                t271Var = new t271(this, onmVar);
            }
        } else {
            t271Var = new t271(this, onmVar);
        }
        Object objL = t271Var.b;
        int i2 = t271Var.d;
        if (i2 == 0) {
            hm5.M(objL);
            Observable map = this.b.b(new oi("episode-share", false, new pg61(str, (byte) 6))).filter(kcx0.X).map(new xrh(str, (byte) 6));
            t271Var.a = uz70Var;
            t271Var.d = 1;
            objL = fc11.l(map, 1, (Object) null, t271Var);
            d9n d9nVar = d9n.a;
            if (objL == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uz70Var = t271Var.a;
            hm5.M(objL);
        }
        xkk1 xkk1Var = ((tv00) objL).b;
        if (xkk1Var != null && (mq70Var = xkk1Var.b) != null) {
            int iOrdinal = uz70Var.ordinal();
            if (iOrdinal == 0) {
                vp70Var = vp70.c;
            } else if (iOrdinal == 1) {
                vp70Var = vp70.b;
            } else if (iOrdinal == 2) {
                vp70Var = vp70.d;
            } else {
                if (iOrdinal != 3) {
                    eg.o();
                    return null;
                }
                vp70Var = vp70.e;
            }
            up70 up70VarA = mq70Var.a(vp70Var);
            if (up70VarA != null) {
                return up70VarA.a.a;
            }
        }
        return null;
    }
}
