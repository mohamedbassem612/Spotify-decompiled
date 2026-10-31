package p;

import android.view.View;
import com.spotify.player.model.Context;
import com.spotify.player.model.ContextPage;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.command.options.PlayerOptionOverrides;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.model.command.options.SkipToTrack;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tg80 {
    public static final long m;
    public static final /* synthetic */ int n = 0;
    public final f33 a;
    public final jr2 b;
    public final o751 c;
    public final xrc0 d;
    public final e7p0 e;
    public final kt91 f;
    public final yqg g;
    public final di4 h;
    public String i;
    public String j;
    public final llm k;
    public final bpb1 l = gio1.b(Boolean.FALSE);

    static {
        ytw0 ytw0Var = jfv.b;
        m = fdg1.k0(15, ngv.e);
    }

    public tg80(f33 f33Var, jr2 jr2Var, o751 o751Var, xrc0 xrc0Var, e7p0 e7p0Var, kt91 kt91Var, yqg yqgVar, di4 di4Var, q8n q8nVar) {
        this.a = f33Var;
        this.b = jr2Var;
        this.c = o751Var;
        this.d = xrc0Var;
        this.e = e7p0Var;
        this.f = kt91Var;
        this.g = yqgVar;
        this.h = di4Var;
        this.k = i3a.k(q8nVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, onm onmVar) {
        pg80 pg80Var;
        if (onmVar instanceof pg80) {
            pg80Var = (pg80) onmVar;
            int i = pg80Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pg80Var.c = i - Integer.MIN_VALUE;
            } else {
                pg80Var = new pg80(this, onmVar);
            }
        } else {
            pg80Var = new pg80(this, onmVar);
        }
        Object objP = pg80Var.a;
        int i2 = pg80Var.c;
        if (i2 == 0) {
            hm5.M(objP);
            x060 x060Var = new x060(this, str, (lnm) null, (byte) 19);
            pg80Var.c = 1;
            objP = rc2.P(m, x060Var, pg80Var);
            d9n d9nVar = d9n.a;
            if (objP == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objP);
        }
        return Boolean.valueOf(u890.j(objP, Boolean.TRUE));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, String str2, String str3, tv80 tv80Var, onm onmVar) {
        qg80 qg80Var;
        if (onmVar instanceof qg80) {
            qg80Var = (qg80) onmVar;
            int i = qg80Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                qg80Var.e = i - Integer.MIN_VALUE;
            } else {
                qg80Var = new qg80(this, onmVar);
            }
        } else {
            qg80Var = new qg80(this, onmVar);
        }
        Object objI = qg80Var.c;
        int i2 = qg80Var.e;
        rih1 rih1Var = rih1.a;
        Object obj = d9n.a;
        if (i2 == 0) {
            hm5.M(objI);
            lik1 lik1VarB = nik1.r.b(str);
            ezc ezcVarG = yoi1.g(Observable.create(new ycc1((Object) this.a, (str2 == null || str2.length() == 0 || str3 == null || str3.length() == 0) ? new o13(w6p1.j(str), lik1VarB) : new p13(str2, str3, lik1VarB), (byte) 23)).onErrorReturn(qzs0.f));
            qg80Var.a = str;
            qg80Var.b = tv80Var;
            qg80Var.e = 1;
            objI = b5p1.i(ezcVarG, qg80Var);
            if (objI != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(objI);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        tv80Var = qg80Var.b;
        str = qg80Var.a;
        hm5.M(objI);
        s13 s13Var = (t13) objI;
        if (!(s13Var instanceof s13)) {
            if (s13Var instanceof r13) {
                e();
                return rih1Var;
            }
            eg.o();
            return null;
        }
        this.i = str;
        String str4 = s13Var.a;
        this.j = str4;
        qg80Var.a = null;
        qg80Var.b = null;
        qg80Var.e = 2;
        return d(str4, tv80Var, qg80Var) == obj ? obj : rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0081  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object c(String str, tv80 tv80Var, onm onmVar) {
        rg80 rg80Var;
        String str2;
        xs2 xs2Var;
        if (onmVar instanceof rg80) {
            rg80Var = (rg80) onmVar;
            int i = rg80Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                rg80Var.e = i - Integer.MIN_VALUE;
            } else {
                rg80Var = new rg80(this, onmVar);
            }
        } else {
            rg80Var = new rg80(this, onmVar);
        }
        rg80 rg80Var2 = rg80Var;
        Object objA = rg80Var2.c;
        int i2 = rg80Var2.e;
        rih1 rih1Var = rih1.a;
        Object obj = d9n.a;
        if (i2 == 0) {
            hm5.M(objA);
            tt2 tt2Var = new tt2(w6p1.j(str), (ot2) null);
            rg80Var2.a = str;
            rg80Var2.b = tv80Var;
            rg80Var2.e = 1;
            objA = jr2.a(this.b, tt2Var, "chat-mvp", (String) null, (dt2) null, rg80Var2, 124);
            if (objA != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(objA);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        tv80Var = rg80Var2.b;
        str = rg80Var2.a;
        hm5.M(objA);
        hr2 hr2Var = ((ls2) objA).b;
        if (hr2Var != null) {
            Iterator it = hr2Var.b.iterator();
            do {
                if (!it.hasNext()) {
                    xs2Var = null;
                    break;
                }
                xs2Var = ((gr2) it.next()).a;
            } while (xs2Var == null);
            if (xs2Var != null) {
                str2 = xs2Var.a;
            } else {
                str2 = null;
            }
        } else {
            str2 = null;
        }
        if (str2 == null) {
            e();
            return rih1Var;
        }
        this.i = str;
        this.j = str2;
        rg80Var2.a = null;
        rg80Var2.b = null;
        rg80Var2.e = 2;
        return d(str2, tv80Var, rg80Var2) == obj ? obj : rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0160  */
    /* JADX WARN: Code duplicated, block: B:42:0x0164 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0166  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object d(String str, tv80 tv80Var, onm onmVar) {
        sg80 sg80Var;
        String str2;
        tv80 tv80Var2;
        Single singleJust;
        String str3;
        tv80 tv80Var3;
        if (onmVar instanceof sg80) {
            sg80Var = (sg80) onmVar;
            int i = sg80Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                sg80Var.e = i - Integer.MIN_VALUE;
            } else {
                sg80Var = new sg80(this, onmVar);
            }
        } else {
            sg80Var = new sg80(this, onmVar);
        }
        Object objJ = sg80Var.c;
        int i2 = sg80Var.e;
        rih1 rih1Var = rih1.a;
        Object obj = d9n.a;
        if (i2 == 0) {
            hm5.M(objJ);
            sg80Var.a = str;
            sg80Var.b = tv80Var;
            sg80Var.e = 1;
            Object objA = a(str, sg80Var);
            if (objA != obj) {
                str2 = str;
                tv80Var2 = tv80Var;
                objJ = objA;
            }
            return obj;
        }
        if (i2 == 1) {
            tv80 tv80Var4 = sg80Var.b;
            String str4 = sg80Var.a;
            hm5.M(objJ);
            tv80Var2 = tv80Var4;
            str2 = str4;
        } else {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            tv80Var3 = sg80Var.b;
            hm5.M(objJ);
        }
        if (!((Boolean) objJ).booleanValue()) {
            e();
            return rih1Var;
        }
        if (tv80Var3 != null) {
            e7p0.e(this.e, tv80Var3);
        }
        return rih1Var;
        if (!((Boolean) objJ).booleanValue()) {
            e();
            return rih1Var;
        }
        long jB = this.g.b();
        o751 o751Var = this.c;
        vku vkuVar = o751Var.d;
        if (sgy.i(str2) || sgy.a(str2)) {
            List listSingletonList = Collections.singletonList(ContextPage.builder().tracks(Collections.singletonList(ContextTrack.builder(str2).build())).build());
            e8r0 e8r0Var = o751Var.c;
            String str5 = e8r0Var.a().c;
            xkg0 xkg0Var = new xkg0();
            if (str5.length() > 0) {
                xkg0Var.put("context_description", str5);
            }
            tv80 tv80Var5 = tv80Var2;
            tv80Var2 = tv80Var5;
            vkuVar.a(o751Var.a.a(o751Var.b(Context.builder(e8r0Var.a().e).pages(listSingletonList).metadata(xkg0Var.b()).build(), tv80Var5, jB, PreparePlayOptions.builder().skipTo(SkipToTrack.builder().trackUri(str2).build()).playerOptionsOverride(PlayerOptionOverrides.builder().modes(b7x.a).build()).build())).onErrorReturn(new pvc(o751Var, (byte) 23)).subscribe());
            singleJust = Single.just(Boolean.TRUE);
            str3 = null;
        } else {
            vkuVar.a(o751Var.h.a(str2).flatMap(new l751(str2, o751Var, tv80Var2, jB)).onErrorReturn(new lqc(o751Var, (byte) 23)).subscribe());
            singleJust = Single.just(Boolean.TRUE);
            singleJust.getClass();
            str3 = null;
        }
        sg80Var.a = str3;
        sg80Var.b = tv80Var2;
        sg80Var.e = 2;
        objJ = fc11.j(singleJust, sg80Var);
        if (objJ != obj) {
            tv80Var3 = tv80Var2;
            if (!((Boolean) objJ).booleanValue()) {
                e();
                return rih1Var;
            }
            if (tv80Var3 != null) {
                e7p0.e(this.e, tv80Var3);
            }
            return rih1Var;
        }
        return obj;
    }

    public final void e() {
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131956708});
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
        er91 er91Var = new er91((fs91) null, "", 2131956708, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false);
        kt91 kt91Var = this.f;
        if (kt91Var.g()) {
            kt91Var.k(er91Var);
        } else {
            kt91Var.o(er91Var);
        }
    }
}
