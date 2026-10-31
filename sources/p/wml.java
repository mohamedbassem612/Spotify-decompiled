package p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Single;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class wml {
    public static final tml b = new tml(new sml("", null, null, 0, null));
    public final uu00 a;

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public Object a(String str, onm onmVar) {
        p37 p37Var;
        mq70 mq70Var;
        List list;
        up70 up70Var;
        if (onmVar instanceof p37) {
            p37Var = (p37) onmVar;
            int i = p37Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                p37Var.d = i - Integer.MIN_VALUE;
            } else {
                p37Var = new p37(this, onmVar);
            }
        } else {
            p37Var = new p37(this, onmVar);
        }
        Object objI = p37Var.b;
        int i2 = p37Var.d;
        String str2 = null;
        try {
            if (i2 == 0) {
                hm5.M(objI);
                if (str.length() == 0) {
                    return new xlj0(new ulj0("Entity URI cannot be empty"));
                }
                ezc ezcVarG = yoi1.g(this.a.b(new oi("listening-activity-artwork", false, new wk3(str, (byte) 14))).filter(vrg.h));
                p37Var.a = str;
                p37Var.d = 1;
                objI = b5p1.i(ezcVarG, p37Var);
                d9n d9nVar = d9n.a;
                if (objI == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = p37Var.a;
                hm5.M(objI);
            }
            xkk1 xkk1Var = ((uv00) objI).a(xkk1.class, str).b;
            if (xkk1Var != null && (mq70Var = xkk1Var.a) != null && (list = mq70Var.a) != null && (up70Var = (up70) o7h.s0(list)) != null) {
                str2 = up70Var.a.a;
            }
            return str2 != null ? new ylj0(str2) : new xlj0(new wlj0("No artwork found for entity URI: ".concat(str)));
        } catch (Exception e) {
            Logger.k("ArtworkMetadataServiceImpl: Failed to fetch artwork for " + str + ": " + e, new Object[0]);
            return new xlj0(new vlj0(l1d.m("Failed to fetch artwork: ", e.getMessage())));
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x009a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(String str, onm onmVar) {
        uml umlVar;
        tml tmlVar;
        qwm qwmVar;
        qwm qwmVar2;
        if (onmVar instanceof uml) {
            umlVar = (uml) onmVar;
            int i = umlVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                umlVar.e = i - Integer.MIN_VALUE;
            } else {
                umlVar = new uml(this, onmVar);
            }
        } else {
            umlVar = new uml(this, onmVar);
        }
        Object objJ = umlVar.c;
        int i2 = umlVar.e;
        Object obj = d9n.a;
        if (i2 == 0) {
            hm5.M(objJ);
            Single singleOnErrorReturnItem = this.a.b(new oi("container_context_menu", false, new kak(str, (byte) 9))).map(new gal(this, str, (byte) 2)).firstOrError().onErrorReturnItem(b);
            umlVar.e = 1;
            objJ = fc11.j(singleOnErrorReturnItem, umlVar);
            if (objJ != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            hm5.M(objJ);
        } else {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qwmVar2 = umlVar.b;
            tmlVar = umlVar.a;
            hm5.M(objJ);
        }
        String str2 = (String) objJ;
        sml smlVar = tmlVar.a;
        return new sml(smlVar.a, str2, smlVar.c, smlVar.d, str2 != null ? new qwm(qwmVar2.a, str2) : null);
        tmlVar = (tml) objJ;
        sml smlVar2 = tmlVar.a;
        String str3 = smlVar2.b;
        if ((str3 != null && !ihc1.y0(str3)) || (qwmVar = smlVar2.e) == null) {
            return smlVar2;
        }
        String str4 = qwmVar.a;
        umlVar.a = tmlVar;
        umlVar.b = qwmVar;
        umlVar.e = 2;
        objJ = c(str4, umlVar);
        if (objJ != obj) {
            qwmVar2 = qwmVar;
            String str5 = (String) objJ;
            sml smlVar3 = tmlVar.a;
            return new sml(smlVar3.a, str5, smlVar3.c, smlVar3.d, str5 != null ? new qwm(qwmVar2.a, str5) : null);
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object c(String str, onm onmVar) {
        vml vmlVar;
        if (onmVar instanceof vml) {
            vmlVar = (vml) onmVar;
            int i = vmlVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vmlVar.c = i - Integer.MIN_VALUE;
            } else {
                vmlVar = new vml(this, onmVar);
            }
        } else {
            vmlVar = new vml(this, onmVar);
        }
        Object objJ = vmlVar.a;
        int i2 = vmlVar.c;
        if (i2 == 0) {
            hm5.M(objJ);
            Single singleOnErrorReturnItem = this.a.b(new oi("container_context_menu", false, new kak(str, (byte) 10))).map(new k9p1(str, (byte) 4)).firstOrError().onErrorReturnItem("");
            vmlVar.c = 1;
            objJ = fc11.j(singleOnErrorReturnItem, vmlVar);
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
        String str2 = (String) objJ;
        str2.getClass();
        if (ihc1.y0(str2)) {
            return null;
        }
        return objJ;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d(String str, onm onmVar) {
        xxs xxsVar;
        mig1 m231Var;
        String str2;
        lhg1 lhg1VarA;
        if (onmVar instanceof xxs) {
            xxsVar = (xxs) onmVar;
            int i = xxsVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xxsVar.c = i - Integer.MIN_VALUE;
            } else {
                xxsVar = new xxs(this, onmVar);
            }
        } else {
            xxsVar = new xxs(this, onmVar);
        }
        Object objJ = xxsVar.a;
        int i2 = xxsVar.c;
        try {
            if (i2 == 0) {
                hm5.M(objJ);
                Single singleFlatMap = this.a.b(new oi("add-to-playlist", false, new i3o(str, (byte) 15))).filter(wcp1.W0).firstOrError().flatMap(vgp1.X0);
                xxsVar.c = 1;
                objJ = fc11.j(singleFlatMap, xxsVar);
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
            m231Var = (mig1) objJ;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        if (m231Var instanceof m231) {
            m231Var = null;
        }
        mig1 mig1Var = m231Var;
        if (mig1Var == null || (lhg1VarA = kkg1.a((str2 = mig1Var.f))) == null) {
            return null;
        }
        ruq0 ruq0Var = lhg1VarA.b;
        String str3 = ruq0Var.a;
        String str4 = ruq0Var.b;
        return new ukg1(p7h.M(new String[]{str3, str4}), new ajg1(ruq0Var.a, str4, str2));
    }

    public Single e(String str) {
        return this.a.b(new oi("free-on-demand-download-upsell", false, new fki0(str, (byte) 28))).filter(o610.U0).firstOrError().timeout(1L, TimeUnit.SECONDS).map(new vdn1(str, (byte) 11)).onErrorReturnItem(new arp0(7, (String) null, (String) null));
    }

    public wml(kkg1 kkg1Var, uu00 uu00Var) {
        this.a = uu00Var;
    }
}
