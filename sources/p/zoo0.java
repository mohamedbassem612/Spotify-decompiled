package p;

import io.reactivex.rxjava3.core.Single;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zoo0 {
    public static final bma1 f;
    public static final bma1 g;
    public static final bma1 h;
    public final yqg a;
    public final Single b;
    public final bma1 c;
    public final bma1 d;
    public final bma1 e;

    static {
        new c9c((byte) 17);
        nbc nbcVar = bma1.b;
        f = nbcVar.u("notification_opt_in_nudge_interaction_timestamp");
        g = nbcVar.u("notification_opt_in_nudge_interaction_chat_id");
        h = nbcVar.u("notification_opt_in_nudge_alert_interaction_page_uri");
    }

    public zoo0(yqg yqgVar, Single single, pf4 pf4Var) {
        this.a = yqgVar;
        this.b = single;
        int iK = pf4Var.k();
        this.c = c9c.g(iK);
        this.d = c9c.i(iK, "notification_opt_in_nudge_dismiss_count");
        this.e = c9c.i(iK, "notification_opt_in_nudge_interaction_count");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(onm onmVar) {
        noo0 noo0Var;
        List list;
        if (onmVar instanceof noo0) {
            noo0Var = (noo0) onmVar;
            int i = noo0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                noo0Var.d = i - Integer.MIN_VALUE;
            } else {
                noo0Var = new noo0(this, onmVar);
            }
        } else {
            noo0Var = new noo0(this, onmVar);
        }
        Object obj = noo0Var.b;
        int i2 = noo0Var.d;
        if (i2 == 0) {
            hm5.M(obj);
            List listM = p7h.M(new bma1[]{this.c, f, g, h, this.d, this.e});
            noo0Var.a = listM;
            noo0Var.d = 1;
            Object objJ = fc11.j(this.b, noo0Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
            obj = objJ;
            list = listM;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = noo0Var.a;
            hm5.M(obj);
        }
        hma1 hma1VarEdit = ((dma1) obj).edit();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hma1VarEdit.f((bma1) it.next());
        }
        hma1VarEdit.g();
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(onm onmVar) {
        ooo0 ooo0Var;
        if (onmVar instanceof ooo0) {
            ooo0Var = (ooo0) onmVar;
            int i = ooo0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ooo0Var.c = i - Integer.MIN_VALUE;
            } else {
                ooo0Var = new ooo0(this, onmVar);
            }
        } else {
            ooo0Var = new ooo0(this, onmVar);
        }
        Object objJ = ooo0Var.a;
        int i2 = ooo0Var.c;
        if (i2 == 0) {
            hm5.M(objJ);
            ooo0Var.c = 1;
            objJ = fc11.j(this.b, ooo0Var);
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
        hma1 hma1VarEdit = ((dma1) objJ).edit();
        hma1VarEdit.f(h);
        hma1VarEdit.g();
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(onm onmVar) {
        poo0 poo0Var;
        if (onmVar instanceof poo0) {
            poo0Var = (poo0) onmVar;
            int i = poo0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                poo0Var.c = i - Integer.MIN_VALUE;
            } else {
                poo0Var = new poo0(this, onmVar);
            }
        } else {
            poo0Var = new poo0(this, onmVar);
        }
        Object objJ = poo0Var.a;
        int i2 = poo0Var.c;
        if (i2 == 0) {
            hm5.M(objJ);
            poo0Var.c = 1;
            objJ = fc11.j(this.b, poo0Var);
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
        hma1 hma1VarEdit = ((dma1) objJ).edit();
        hma1VarEdit.f(f);
        hma1VarEdit.f(g);
        hma1VarEdit.g();
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(onm onmVar) {
        qoo0 qoo0Var;
        if (onmVar instanceof qoo0) {
            qoo0Var = (qoo0) onmVar;
            int i = qoo0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qoo0Var.c = i - Integer.MIN_VALUE;
            } else {
                qoo0Var = new qoo0(this, onmVar);
            }
        } else {
            qoo0Var = new qoo0(this, onmVar);
        }
        Object objJ = qoo0Var.a;
        int i2 = qoo0Var.c;
        if (i2 == 0) {
            hm5.M(objJ);
            qoo0Var.c = 1;
            objJ = fc11.j(this.b, qoo0Var);
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
        String strE = ((dma1) objJ).e(h, "");
        if (strE == null || strE.length() == 0) {
            return null;
        }
        return strE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(onm onmVar) {
        roo0 roo0Var;
        if (onmVar instanceof roo0) {
            roo0Var = (roo0) onmVar;
            int i = roo0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                roo0Var.c = i - Integer.MIN_VALUE;
            } else {
                roo0Var = new roo0(this, onmVar);
            }
        } else {
            roo0Var = new roo0(this, onmVar);
        }
        Object objJ = roo0Var.a;
        int i2 = roo0Var.c;
        if (i2 == 0) {
            hm5.M(objJ);
            roo0Var.c = 1;
            objJ = fc11.j(this.b, roo0Var);
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
        return yah0.p(((dma1) objJ).l(this.d, 0));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(onm onmVar) {
        soo0 soo0Var;
        if (onmVar instanceof soo0) {
            soo0Var = (soo0) onmVar;
            int i = soo0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                soo0Var.c = i - Integer.MIN_VALUE;
            } else {
                soo0Var = new soo0(this, onmVar);
            }
        } else {
            soo0Var = new soo0(this, onmVar);
        }
        Object objJ = soo0Var.a;
        int i2 = soo0Var.c;
        if (i2 == 0) {
            hm5.M(objJ);
            soo0Var.c = 1;
            objJ = fc11.j(this.b, soo0Var);
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
        String strE = ((dma1) objJ).e(g, "");
        if (strE == null || strE.length() == 0) {
            return null;
        }
        return strE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(onm onmVar) {
        too0 too0Var;
        if (onmVar instanceof too0) {
            too0Var = (too0) onmVar;
            int i = too0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                too0Var.c = i - Integer.MIN_VALUE;
            } else {
                too0Var = new too0(this, onmVar);
            }
        } else {
            too0Var = new too0(this, onmVar);
        }
        Object objJ = too0Var.a;
        int i2 = too0Var.c;
        if (i2 == 0) {
            hm5.M(objJ);
            too0Var.c = 1;
            objJ = fc11.j(this.b, too0Var);
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
        return yah0.p(((dma1) objJ).l(this.e, 0));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(onm onmVar) {
        uoo0 uoo0Var;
        if (onmVar instanceof uoo0) {
            uoo0Var = (uoo0) onmVar;
            int i = uoo0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                uoo0Var.c = i - Integer.MIN_VALUE;
            } else {
                uoo0Var = new uoo0(this, onmVar);
            }
        } else {
            uoo0Var = new uoo0(this, onmVar);
        }
        Object objJ = uoo0Var.a;
        int i2 = uoo0Var.c;
        if (i2 == 0) {
            hm5.M(objJ);
            uoo0Var.c = 1;
            objJ = fc11.j(this.b, uoo0Var);
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
        return yah0.q(((dma1) objJ).g(f, 0L));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(onm onmVar) {
        voo0 voo0Var;
        if (onmVar instanceof voo0) {
            voo0Var = (voo0) onmVar;
            int i = voo0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                voo0Var.c = i - Integer.MIN_VALUE;
            } else {
                voo0Var = new voo0(this, onmVar);
            }
        } else {
            voo0Var = new voo0(this, onmVar);
        }
        Object objJ = voo0Var.a;
        int i2 = voo0Var.c;
        if (i2 == 0) {
            hm5.M(objJ);
            voo0Var.c = 1;
            objJ = fc11.j(this.b, voo0Var);
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
        dma1 dma1Var = (dma1) objJ;
        bma1 bma1Var = this.d;
        int iL = dma1Var.l(bma1Var, 0);
        hma1 hma1VarEdit = dma1Var.edit();
        hma1VarEdit.b(bma1Var, iL + 1);
        hma1VarEdit.g();
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(onm onmVar) {
        woo0 woo0Var;
        if (onmVar instanceof woo0) {
            woo0Var = (woo0) onmVar;
            int i = woo0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                woo0Var.c = i - Integer.MIN_VALUE;
            } else {
                woo0Var = new woo0(this, onmVar);
            }
        } else {
            woo0Var = new woo0(this, onmVar);
        }
        Object objJ = woo0Var.a;
        int i2 = woo0Var.c;
        if (i2 == 0) {
            hm5.M(objJ);
            woo0Var.c = 1;
            objJ = fc11.j(this.b, woo0Var);
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
        dma1 dma1Var = (dma1) objJ;
        bma1 bma1Var = this.e;
        int iL = dma1Var.l(bma1Var, 0);
        hma1 hma1VarEdit = dma1Var.edit();
        hma1VarEdit.b(bma1Var, iL + 1);
        hma1VarEdit.g();
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(String str, onm onmVar) {
        xoo0 xoo0Var;
        if (onmVar instanceof xoo0) {
            xoo0Var = (xoo0) onmVar;
            int i = xoo0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                xoo0Var.d = i - Integer.MIN_VALUE;
            } else {
                xoo0Var = new xoo0(this, onmVar);
            }
        } else {
            xoo0Var = new xoo0(this, onmVar);
        }
        Object objJ = xoo0Var.b;
        int i2 = xoo0Var.d;
        if (i2 == 0) {
            hm5.M(objJ);
            xoo0Var.a = str;
            xoo0Var.d = 1;
            objJ = fc11.j(this.b, xoo0Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = xoo0Var.a;
            hm5.M(objJ);
        }
        hma1 hma1VarEdit = ((dma1) objJ).edit();
        hma1VarEdit.d(h, str);
        hma1VarEdit.g();
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(String str, onm onmVar) {
        yoo0 yoo0Var;
        if (onmVar instanceof yoo0) {
            yoo0Var = (yoo0) onmVar;
            int i = yoo0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                yoo0Var.d = i - Integer.MIN_VALUE;
            } else {
                yoo0Var = new yoo0(this, onmVar);
            }
        } else {
            yoo0Var = new yoo0(this, onmVar);
        }
        Object objJ = yoo0Var.b;
        int i2 = yoo0Var.d;
        if (i2 == 0) {
            hm5.M(objJ);
            yoo0Var.a = str;
            yoo0Var.d = 1;
            objJ = fc11.j(this.b, yoo0Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = yoo0Var.a;
            hm5.M(objJ);
        }
        hma1 hma1VarEdit = ((dma1) objJ).edit();
        hma1VarEdit.c(f, this.a.b());
        if (str == null) {
            str = "";
        }
        hma1VarEdit.d(g, str);
        hma1VarEdit.g();
        return rih1.a;
    }
}
