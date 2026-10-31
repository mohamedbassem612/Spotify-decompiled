package p;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.webkit.WebSettings;
import com.spotify.base.java.logging.Logger;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hzb extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hzb(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = obj;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return new hzb((ozb) obj2, lnmVar, (byte) 0);
            case 1:
                return new hzb((d0c) obj2, lnmVar, (byte) 1);
            case 2:
                return new hzb((ljc) obj2, lnmVar, (byte) 2);
            case 3:
                return new hzb((ypd) obj2, lnmVar, (byte) 3);
            case 4:
                return new hzb((qse) obj2, lnmVar, (byte) 4);
            case 5:
                return new hzb((jue) obj2, lnmVar, (byte) 5);
            case 6:
                return new hzb((ewe) obj2, lnmVar, (byte) 6);
            case 7:
                return new hzb((toj0) obj2, lnmVar, (byte) 7);
            case 8:
                return new hzb((bp5) obj2, lnmVar, (byte) 8);
            case 9:
                return new hzb((lag) obj2, lnmVar, (byte) 9);
            case 10:
                return new hzb((yrg) obj2, lnmVar, (byte) 10);
            case 11:
                return new hzb((tsg) obj2, lnmVar, (byte) 11);
            case 12:
                return new hzb((mxg) obj2, lnmVar, (byte) 12);
            case 13:
                return new hzb((xwi0) obj2, lnmVar, (byte) 13);
            case 14:
                return new hzb((xlz0) obj2, lnmVar, (byte) 14);
            case 15:
                return new hzb((kbe1) obj2, lnmVar, (byte) 15);
            case 16:
                return new hzb((txj) obj2, lnmVar, (byte) 16);
            case 17:
                return new hzb((cnk) obj2, lnmVar, (byte) 17);
            case 18:
                return new hzb((auk) obj2, lnmVar, (byte) 18);
            case 19:
                return new hzb((ynb0) obj2, lnmVar, (byte) 19);
            case 20:
                return new hzb((vwl1) obj2, lnmVar, (byte) 20);
            case 21:
                return new hzb((s1m) obj2, lnmVar, (byte) 21);
            case 22:
                return new hzb((i4m) obj2, lnmVar, (byte) 22);
            case 23:
                return new hzb((tem) obj2, lnmVar, (byte) 23);
            case 24:
                return new hzb((lag) obj2, lnmVar, (byte) 24);
            case 25:
                return new hzb((k9k) obj2, lnmVar, (byte) 25);
            case 26:
                return new hzb((tdo) obj2, lnmVar, (byte) 26);
            case 27:
                return new hzb((evo) obj2, lnmVar, (byte) 27);
            case 28:
                return new hzb((gvo) obj2, lnmVar, (byte) 28);
            default:
                return new hzb((otr) obj2, lnmVar, (byte) 29);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 1:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 2:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 3:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 4:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 5:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 6:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 7:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 8:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 9:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 10:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 11:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 12:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 13:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 14:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 15:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 16:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 17:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 18:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 19:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 20:
                create((ojl) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 21:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 22:
                create((nbl) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 23:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 24:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 25:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 27:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 28:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            default:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                hm5.M(obj);
                ((ozb) this.b).k.m((Object) null, Boolean.TRUE);
                return rih1.a;
            case 1:
                hm5.M(obj);
                ((d0c) this.b).d.a();
                return rih1.a;
            case 2:
                hm5.M(obj);
                ljc ljcVar = (ljc) this.b;
                qyo1.x(((mjc) ljcVar.h.get()).a.a, false, true, new z8b0());
                ((yic) ljcVar.i.get()).a();
                return rih1.a;
            case 3:
                hm5.M(obj);
                ypd ypdVar = (ypd) this.b;
                ypdVar.c = new i3b(ypdVar.a);
                return rih1.a;
            case 4:
                hm5.M(obj);
                qse qseVar = (qse) this.b;
                aab1 aab1Var = (aab1) qseVar.c.invoke();
                if (aab1Var != null) {
                    aab1Var.a(qseVar.d);
                }
                return rih1.a;
            case 5:
                hm5.M(obj);
                kt91 kt91Var = ((jue) this.b).b;
                if (kt91Var.g()) {
                    n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131953303});
                    n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                    kt91Var.k(new er91((fs91) null, "", 2131953303, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                }
                return rih1.a;
            case 6:
                hm5.M(obj);
                ewe eweVar = (ewe) this.b;
                ((i8h1) ((ynb0) eweVar.e).get()).f(((dsk0) eweVar.h).e(), (Set) null);
                return rih1.a;
            case 7:
                hm5.M(obj);
                kt91 kt91Var2 = (kt91) ((toj0) this.b).c;
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131963769});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                kt91Var2.k(new er91((fs91) null, "", 2131963769, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                return rih1.a;
            case 8:
                hm5.M(obj);
                bp5 bp5Var = (bp5) this.b;
                ((kly0) bp5Var.c).get();
                if (!((e85) bp5Var.e).a()) {
                    Context context = bp5Var.b;
                    try {
                        try {
                            Logger.g("ClientMessagingPlatform: WebView warmup starting", new Object[0]);
                            WebSettings.getDefaultUserAgent(context);
                            Logger.g("ClientMessagingPlatform: WebView warmup completed", new Object[0]);
                        } catch (Exception e) {
                            Logger.d("ClientMessagingPlatform: WebView warmup failed: " + e.getMessage(), new Object[0]);
                        }
                    } finally {
                        zrw0 zrw0Var = bsw0.a;
                        bsw0.a(context, c2u.a);
                    }
                    break;
                }
                return rih1.a;
            case 9:
                s6i0 s6i0Var = s6i0.a;
                hm5.M(obj);
                lag lagVar = (lag) this.b;
                String str = ((u3i0) lagVar.d).e;
                if (str != null) {
                    ((jfe) ((f7i0) lagVar.e).b.computeIfAbsent(str, azt.f)).l(s6i0Var);
                }
                ((tbr0) lagVar.b).a(new y231(s6i0Var));
                return rih1.a;
            case 10:
                hm5.M(obj);
                ((yrg) this.b).a.e();
                return rih1.a;
            case 11:
                hm5.M(obj);
                tsg tsgVar = (tsg) this.b;
                tsgVar.b.close();
                tsgVar.d.clear();
                tsgVar.e = null;
                smo1.p(tsgVar.c, (CancellationException) null);
                return rih1.a;
            case 12:
                hm5.M(obj);
                krw0.i.f.d(((mxg) this.b).c);
                return rih1.a;
            case 13:
                hm5.M(obj);
                zdz0 zdz0Var = ((xwi0) this.b).a;
                zdz0Var.b.invoke(new l5j0(zdz0Var.a));
                return rih1.a;
            case 14:
                hm5.M(obj);
                ((xlz0) this.b).c.invoke();
                return rih1.a;
            case 15:
                hm5.M(obj);
                ((kbe1) this.b).c.invoke();
                return rih1.a;
            case 16:
                hm5.M(obj);
                t45 t45Var = ((txj) this.b).b.b;
                if (t45Var != null) {
                    t45Var.g("UntilListComposition");
                }
                return rih1.a;
            case 17:
                hm5.M(obj);
                v1k v1kVar = ((cnk) this.b).g;
                ((kt91) v1kVar.b).k(new er91((fs91) null, ((Resources) v1kVar.c).getString(2131961314), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                return rih1.a;
            case 18:
                hm5.M(obj);
                juk jukVar = ((auk) this.b).H1;
                if (jukVar != null) {
                    jukVar.a.a(new nhv0("start_retry", (String) null));
                    return rih1.a;
                }
                u890.C("configurationLoadingTracking");
                throw null;
            case 19:
                hm5.M(obj);
                ((w5b1) ((ynb0) this.b).get()).g.a();
                return rih1.a;
            case 20:
                hm5.M(obj);
                int i = ajl.a;
                vwl1 vwl1Var = (vwl1) this.b;
                qs10 qs10VarA = qs10.a();
                Objects.toString(vwl1Var);
                qs10VarA.getClass();
                return rih1.a;
            case 21:
                hm5.M(obj);
                s1m s1mVar = (s1m) this.b;
                s1mVar.f.a(new jse(s1mVar.a, Collections.singletonList("SEARCH"), null), (String) null);
                return rih1.a;
            case 22:
                hm5.M(obj);
                i4m i4mVar = (i4m) this.b;
                List<vih0> listG = i4mVar.b.g();
                xj61 xj61Var = new xj61();
                for (vih0 vih0Var : listG) {
                    if (!vih0Var.h()) {
                        xj61Var.add(vih0Var.e());
                    }
                }
                wkg0 it = cwl1.j(xj61Var).iterator();
                while (((g0y) it).hasNext()) {
                    vsr0 vsr0Var = (vsr0) it.next();
                    Logger.g("MBS Smart reload of %s. Reason: connectivity change", new Object[]{vsr0Var});
                    i4mVar.c.c(vsr0Var.a);
                }
                return rih1.a;
            case 23:
                hm5.M(obj);
                pem pemVar = (tem) this.b;
                if (!(pemVar instanceof oem)) {
                    if (pemVar instanceof qem) {
                        ((qem) pemVar).a.invoke();
                    } else {
                        if (!(pemVar instanceof pem)) {
                            eg.o();
                            return null;
                        }
                        pemVar.d.invoke();
                    }
                }
                return rih1.a;
            case 24:
                hm5.M(obj);
                ((lzn0) ((lag) this.b).b).e();
                return rih1.a;
            case 25:
                hm5.M(obj);
                k9k k9kVar = (k9k) this.b;
                r091 r091Var = (r091) k9kVar.e;
                if (r091Var != null) {
                    r091Var.g();
                }
                k9kVar.e = null;
                k9kVar.f = null;
                return Boolean.valueOf(((ttm0) ((kly0) k9kVar.b).get()).b((zau0) ((idd1) k9kVar.d).getValue()));
            case 26:
                hm5.M(obj);
                ((tdo) this.b).b.a(ixb.c);
                return rih1.a;
            case 27:
                hm5.M(obj);
                ((evo) this.b).h.c("");
                return rih1.a;
            case 28:
                hm5.M(obj);
                gvo gvoVar = (gvo) this.b;
                aab1 aab1Var2 = (aab1) gvoVar.e.invoke();
                if (aab1Var2 != null) {
                    aab1Var2.a(gvoVar.f);
                }
                return rih1.a;
            default:
                hm5.M(obj);
                ((otr) this.b).b.h(nik1.p2.a);
                return rih1.a;
        }
    }
}
