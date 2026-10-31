package com.spotify.widgets.npvwidget;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.Collections;
import java.util.Objects;
import p.a690;
import p.a7h1;
import p.b7x;
import p.bwn0;
import p.c3u0;
import p.d9n;
import p.dwn0;
import p.eg;
import p.epl1;
import p.eth;
import p.fdg1;
import p.fkj1;
import p.gvg;
import p.hm5;
import p.i3o1;
import p.jfv;
import p.jsn0;
import p.kb61;
import p.kk0;
import p.kly0;
import p.lik1;
import p.lnm;
import p.lsn0;
import p.lzn0;
import p.mmr0;
import p.mwn0;
import p.n57;
import p.ngv;
import p.nik1;
import p.npl1;
import p.obq;
import p.onm;
import p.ou80;
import p.r6h1;
import p.rc2;
import p.rih1;
import p.smo1;
import p.sqg0;
import p.sqk0;
import p.tv80;
import p.w7h1;
import p.x6h1;
import p.x7h1;
import p.xj61;
import p.xm41;
import p.xs80;
import p.y6h1;
import p.yly0;
import p.ys80;
import p.ytw0;
import p.z7h1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class t {
    public final Context a;
    public final lzn0 b;
    public final xs80 c;
    public final m d;
    public final mwn0 e;
    public final k f;
    public final xm41 g;
    public final kly0 h;
    public final kly0 i;

    public t(Context context, lzn0 lzn0Var, xs80 xs80Var, m mVar, mwn0 mwn0Var, k kVar, xm41 xm41Var, obq obqVar, obq obqVar2) {
        this.a = context;
        this.b = lzn0Var;
        this.c = xs80Var;
        this.d = mVar;
        this.e = mwn0Var;
        this.f = kVar;
        this.g = xm41Var;
        this.h = obqVar;
        this.i = obqVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(onm onmVar) {
        yly0 yly0Var;
        if (onmVar instanceof yly0) {
            yly0Var = (yly0) onmVar;
            int i = yly0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                yly0Var.c = i - Integer.MIN_VALUE;
            } else {
                yly0Var = new yly0(this, onmVar);
            }
        } else {
            yly0Var = new yly0(this, onmVar);
        }
        Object objP = yly0Var.a;
        int i2 = yly0Var.c;
        if (i2 == 0) {
            hm5.M(objP);
            ytw0 ytw0Var = jfv.b;
            long jK0 = fdg1.k0(5, ngv.e);
            c3u0 c3u0Var = new c3u0(this, (lnm) null, (byte) 23);
            yly0Var.c = 1;
            objP = rc2.P(jK0, c3u0Var, yly0Var);
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
        kb61 kb61Var = (kb61) objP;
        if (kb61Var == null) {
            n57.s("Session scope not entered within timeout, widget attribution skipped");
        }
        return kb61Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object b(m mVar, WidgetInteraction.Background background, String str, onm onmVar) {
        o oVar;
        tv80 tv80VarM;
        WidgetInteraction.Background background2;
        String str2;
        Object objA;
        npl1 npl1VarP;
        if (onmVar instanceof o) {
            oVar = (o) onmVar;
            int i = oVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                oVar.f = i - Integer.MIN_VALUE;
            } else {
                oVar = new o(this, onmVar);
            }
        } else {
            oVar = new o(this, onmVar);
        }
        Object obj = oVar.d;
        int i2 = oVar.f;
        if (i2 == 0) {
            hm5.M(obj);
            Objects.toString(background.getSessionState());
            mVar.getClass();
            String pageIdentifier = background.getPageIdentifier();
            y6h1 y6h1Var = y6h1.i;
            x6h1 x6h1VarI = i3o1.i();
            x6h1VarI.h = "music";
            x6h1VarI.a = "mobile-widget-npv-recommendations";
            x6h1VarI.f = "7.2.0";
            x6h1VarI.g = "22.0.0";
            x6h1VarI.b = pageIdentifier;
            x6h1 x6h1VarR = kk0.r(x6h1VarI, "any");
            x6h1VarR.i.add(new a7h1("background", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarR.j = false;
            y6h1 y6h1VarA = x6h1VarR.a();
            String destinationViewUri = background.getDestinationViewUri();
            z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
            if (destinationViewUri == null) {
                destinationViewUri = "";
            }
            w7h1 w7h1Var = new w7h1("", "", z7h1Var, new x7h1("open_app", 1, sqg0.J(new mmr0[]{new mmr0("destination", destinationViewUri), new mmr0("app", "music")})), y6h1VarA, r6h1.c, System.currentTimeMillis());
            mVar.b(background.getPageIdentifier());
            tv80VarM = mVar.a.m(w7h1Var, (xj61) null);
            background2 = background;
            oVar.a = background2;
            str2 = str;
            oVar.b = str2;
            oVar.c = tv80VarM;
            oVar.f = 1;
            objA = a(oVar);
            Object obj2 = d9n.a;
            if (objA == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            tv80VarM = oVar.c;
            str2 = oVar.b;
            WidgetInteraction.Background background3 = oVar.a;
            hm5.M(obj);
            objA = obj;
            background2 = background3;
        }
        kb61 kb61Var = (kb61) objA;
        if (kb61Var != null && (npl1VarP = kb61Var.P()) != null) {
            npl1VarP.b(new epl1(tv80VarM.a.a, background2.getSessionState() == WidgetInteraction.BackgroundSessionState.ACTIVE ? background2.getUri() : "", str2));
        }
        h(background2.getDestinationViewUri(), tv80VarM.a);
        int i3 = n.a[background2.getSessionState().ordinal()];
        Context context = this.a;
        if (i3 == 1) {
            Intent intentA = this.c.a(context);
            intentA.setAction("com.spotify.mobile.android.ui.action.player.SHOW");
            intentA.setFlags(805306368);
            context.startActivity(intentA);
        } else if (i3 == 2) {
            this.b.f(new dwn0(background2.getDestinationViewUri(), "", true, false, 0, 0, false, (a690) null, (Bundle) null, new bwn0(tv80VarM)));
        } else {
            if (i3 != 3) {
                eg.o();
                return null;
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(background2.getDestinationViewUri()));
            intent.setFlags(268435456);
            context.startActivity(intent);
        }
        return rih1.a;
    }

    public final Object c(Intent intent, fkj1 fkj1Var) {
        Object objG;
        Uri uri;
        boolean zHasExtra = intent.hasExtra("com.spotify.widgets.npvwidget.EXTRA_WIDGET_INTERACTION");
        rih1 rih1Var = rih1.a;
        if (zHasExtra) {
            WidgetInteraction widgetInteraction = Build.VERSION.SDK_INT >= 33 ? (WidgetInteraction) intent.getParcelableExtra("com.spotify.widgets.npvwidget.EXTRA_WIDGET_INTERACTION", WidgetInteraction.class) : (WidgetInteraction) intent.getParcelableExtra("com.spotify.widgets.npvwidget.EXTRA_WIDGET_INTERACTION");
            String stringExtra = intent.getStringExtra("com.spotify.widgets.npvwidget.EXTRA_WIDGET_CATEGORY");
            if (stringExtra == null) {
                stringExtra = "";
            }
            boolean z = widgetInteraction instanceof WidgetInteraction.ItemClick;
            d9n d9nVar = d9n.a;
            m mVar = this.d;
            if (z) {
                Object objD = d(mVar, (WidgetInteraction.ItemClick) widgetInteraction, stringExtra, fkj1Var);
                if (objD == d9nVar) {
                    return objD;
                }
            } else {
                if (widgetInteraction instanceof WidgetInteraction.Login) {
                    WidgetInteraction.Login login = (WidgetInteraction.Login) widgetInteraction;
                    boolean zHasExtra2 = intent.hasExtra("com.spotify.widgets.npvwidget.EXTRA_BRANCH_CAMPAIGN");
                    Context context = this.a;
                    if (zHasExtra2) {
                        String stringExtra2 = intent.getStringExtra("com.spotify.widgets.npvwidget.EXTRA_BRANCH_CAMPAIGN");
                        String stringExtra3 = intent.getStringExtra("com.spotify.widgets.npvwidget.EXTRA_BRANCH_DEEPLINK_PATH");
                        if (stringExtra3 == null) {
                            stringExtra3 = nik1.z0.a;
                        }
                        String packageName = context.getPackageName();
                        StringBuilder sbN = gvg.n("https://spotify.link/content_linking?~campaign=", stringExtra2, "&~feature=content_linking&$deeplink_path=", stringExtra3, "&$fallback_url=open.spotify.com&~channel=");
                        sbN.append(packageName);
                        uri = Uri.parse(sbN.toString());
                        uri.getClass();
                    } else {
                        uri = Uri.parse(nik1.z0.a);
                        uri.getClass();
                    }
                    uri.toString();
                    Intent intent2 = new Intent("android.intent.action.VIEW");
                    intent2.setData(uri);
                    intent2.setFlags(268435456);
                    String pageIdentifier = login.getPageIdentifier();
                    y6h1 y6h1Var = y6h1.i;
                    x6h1 x6h1VarI = i3o1.i();
                    x6h1VarI.h = "music";
                    x6h1VarI.a = "mobile-widget-npv-recommendations";
                    x6h1VarI.f = "7.2.0";
                    x6h1VarI.g = "22.0.0";
                    x6h1VarI.b = pageIdentifier;
                    x6h1 x6h1VarR = kk0.r(x6h1VarI, "any");
                    x6h1VarR.i.add(new a7h1("login_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarR.j = false;
                    y6h1 y6h1VarA = x6h1VarR.a();
                    lik1 lik1Var = nik1.z0;
                    String str = lik1Var.a;
                    h(lik1Var.a, mVar.a.j(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("open_app", 1, sqg0.J(new mmr0[]{new mmr0("destination", str != null ? str : ""), new mmr0("app", "music")})), y6h1VarA, r6h1.c, System.currentTimeMillis())).a);
                    context.startActivity(intent2);
                    return rih1Var;
                }
                if (widgetInteraction instanceof WidgetInteraction.SpotifyLogo) {
                    Object objF = f(mVar, (WidgetInteraction.SpotifyLogo) widgetInteraction, stringExtra, fkj1Var);
                    if (objF == d9nVar) {
                        return objF;
                    }
                } else if (widgetInteraction instanceof WidgetInteraction.NpvMetadata) {
                    Object objE = e(mVar, (WidgetInteraction.NpvMetadata) widgetInteraction, stringExtra, fkj1Var);
                    if (objE == d9nVar) {
                        return objE;
                    }
                } else if (widgetInteraction instanceof WidgetInteraction.Background) {
                    Object objB = b(mVar, (WidgetInteraction.Background) widgetInteraction, stringExtra, fkj1Var);
                    if (objB == d9nVar) {
                        return objB;
                    }
                } else if ((widgetInteraction instanceof WidgetInteraction.WrappedClick) && (objG = g((WidgetInteraction.WrappedClick) widgetInteraction, fkj1Var)) == d9nVar) {
                    return objG;
                }
            }
        }
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object d(m mVar, WidgetInteraction.ItemClick itemClick, String str, onm onmVar) {
        p pVar;
        w7h1 w7h1Var;
        tv80 tv80VarM;
        String str2;
        Object objA;
        npl1 npl1VarP;
        WidgetInteraction.ItemClick itemClick2 = itemClick;
        if (onmVar instanceof p) {
            pVar = (p) onmVar;
            int i = pVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                pVar.f = i - Integer.MIN_VALUE;
            } else {
                pVar = new p(this, onmVar);
            }
        } else {
            pVar = new p(this, onmVar);
        }
        Object obj = pVar.d;
        int i2 = pVar.f;
        Object obj2 = rih1.a;
        Object obj3 = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            mVar.getClass();
            boolean z = itemClick2 instanceof WidgetInteraction.ItemClick.GridItemClick;
            b7x b7xVar = b7x.a;
            if (z) {
                WidgetInteraction.ItemClick.GridItemClick gridItemClick = (WidgetInteraction.ItemClick.GridItemClick) itemClick2;
                sqk0 sqk0VarA = m.a(gridItemClick);
                String string = gridItemClick.getItemUri().toString();
                w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("open_app", 1, sqg0.J(new mmr0[]{new mmr0("destination", string != null ? string : ""), new mmr0("app", "music")})), sqk0VarA.b, r6h1.c, System.currentTimeMillis());
            } else {
                if (!(itemClick2 instanceof WidgetInteraction.ItemClick.HeroItemClick)) {
                    eg.o();
                    return null;
                }
                WidgetInteraction.ItemClick.HeroItemClick heroItemClick = (WidgetInteraction.ItemClick.HeroItemClick) itemClick2;
                String pageIdentifier = heroItemClick.getPageIdentifier();
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-widget-npv-recommendations";
                x6h1VarI.f = "7.2.0";
                x6h1VarI.g = "22.0.0";
                x6h1VarI.b = pageIdentifier;
                y6h1 y6h1VarA = x6h1VarI.a();
                Collections.singletonList("any");
                String string2 = heroItemClick.getHeroItemUri().toString();
                x6h1 x6h1VarC = y6h1VarA.c();
                x6h1VarC.i.add(new a7h1("hero_item", (String) null, (Integer) null, string2, (String) null));
                x6h1VarC.j = true;
                y6h1 y6h1VarA2 = x6h1VarC.a();
                String string3 = heroItemClick.getHeroItemUri().toString();
                w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("open_app", 1, sqg0.J(new mmr0[]{new mmr0("destination", string3 != null ? string3 : ""), new mmr0("app", "music")})), y6h1VarA2, r6h1.c, System.currentTimeMillis());
            }
            mVar.b(itemClick2.getPageIdentifier());
            tv80VarM = mVar.a.m(w7h1Var, (xj61) null);
            pVar.a = itemClick2;
            str2 = str;
            pVar.b = str2;
            pVar.c = tv80VarM;
            pVar.f = 1;
            objA = a(pVar);
            if (objA != obj3) {
            }
            return obj3;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(obj);
                return obj2;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        tv80VarM = pVar.c;
        String str3 = pVar.b;
        WidgetInteraction.ItemClick itemClick3 = pVar.a;
        hm5.M(obj);
        str2 = str3;
        itemClick2 = itemClick3;
        objA = obj;
        kb61 kb61Var = (kb61) objA;
        if (kb61Var != null && (npl1VarP = kb61Var.P()) != null) {
            npl1VarP.b(new epl1(tv80VarM.a.a, itemClick2.getUri().toString(), str2));
        }
        this.b.a(itemClick2.getUri().toString(), tv80VarM, (Bundle) null);
        if (itemClick2.getShouldStartPlayback()) {
            pVar.a = null;
            pVar.b = null;
            pVar.c = null;
            pVar.f = 2;
            k kVar = this.f;
            eth.z(kVar.i, new e(tv80VarM, itemClick2, str2));
            Object objS = smo1.s(new g(kVar, itemClick2, tv80VarM, str2, null), pVar);
            if (objS != obj3) {
                objS = obj2;
            }
            if (objS != obj3) {
                objS = obj2;
            }
            if (objS == obj3) {
                return obj3;
            }
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object e(m mVar, WidgetInteraction.NpvMetadata npvMetadata, String str, onm onmVar) {
        q qVar;
        tv80 tv80VarM;
        WidgetInteraction.NpvMetadata npvMetadata2;
        String str2;
        Object objA;
        npl1 npl1VarP;
        if (onmVar instanceof q) {
            qVar = (q) onmVar;
            int i = qVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                qVar.f = i - Integer.MIN_VALUE;
            } else {
                qVar = new q(this, onmVar);
            }
        } else {
            qVar = new q(this, onmVar);
        }
        Object obj = qVar.d;
        int i2 = qVar.f;
        if (i2 == 0) {
            hm5.M(obj);
            mVar.getClass();
            String pageIdentifier = npvMetadata.getPageIdentifier();
            y6h1 y6h1Var = y6h1.i;
            x6h1 x6h1VarI = i3o1.i();
            x6h1VarI.h = "music";
            x6h1VarI.a = "mobile-widget-npv-recommendations";
            x6h1VarI.f = "7.2.0";
            x6h1VarI.g = "22.0.0";
            x6h1VarI.b = pageIdentifier;
            x6h1 x6h1VarR = kk0.r(x6h1VarI, "any");
            x6h1VarR.i.add(new a7h1("npv", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarR.j = false;
            y6h1 y6h1VarA = x6h1VarR.a();
            String uri = npvMetadata.getUri();
            x6h1 x6h1VarC = y6h1VarA.c();
            x6h1VarC.i.add(new a7h1("metadata", (String) null, (Integer) null, uri, (String) null));
            x6h1VarC.j = true;
            y6h1 y6h1VarA2 = x6h1VarC.a();
            String str3 = nik1.p1.a;
            z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
            if (str3 == null) {
                str3 = "";
            }
            w7h1 w7h1Var = new w7h1("", "", z7h1Var, new x7h1("open_app", 1, sqg0.J(new mmr0[]{new mmr0("destination", str3), new mmr0("app", "music")})), y6h1VarA2, r6h1.c, System.currentTimeMillis());
            mVar.b(npvMetadata.getPageIdentifier());
            tv80VarM = mVar.a.m(w7h1Var, (xj61) null);
            npvMetadata2 = npvMetadata;
            qVar.a = npvMetadata2;
            str2 = str;
            qVar.b = str2;
            qVar.c = tv80VarM;
            qVar.f = 1;
            objA = a(qVar);
            Object obj2 = d9n.a;
            if (objA == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            tv80VarM = qVar.c;
            str2 = qVar.b;
            WidgetInteraction.NpvMetadata npvMetadata3 = qVar.a;
            hm5.M(obj);
            objA = obj;
            npvMetadata2 = npvMetadata3;
        }
        kb61 kb61Var = (kb61) objA;
        if (kb61Var != null && (npl1VarP = kb61Var.P()) != null) {
            npl1VarP.b(new epl1(tv80VarM.a.a, npvMetadata2.getUri(), str2));
        }
        h(nik1.p1.a, tv80VarM.a);
        ys80 ys80Var = this.c;
        Context context = this.a;
        Intent intentA = ys80Var.a(context);
        intentA.setAction("com.spotify.mobile.android.ui.action.player.SHOW");
        intentA.setFlags(805306368);
        context.startActivity(intentA);
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object f(m mVar, WidgetInteraction.SpotifyLogo spotifyLogo, String str, onm onmVar) {
        r rVar;
        tv80 tv80VarM;
        String str2;
        Object objA;
        npl1 npl1VarP;
        if (onmVar instanceof r) {
            rVar = (r) onmVar;
            int i = rVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                rVar.e = i - Integer.MIN_VALUE;
            } else {
                rVar = new r(this, onmVar);
            }
        } else {
            rVar = new r(this, onmVar);
        }
        Object obj = rVar.c;
        int i2 = rVar.e;
        if (i2 == 0) {
            hm5.M(obj);
            mVar.getClass();
            String pageIdentifier = spotifyLogo.getPageIdentifier();
            y6h1 y6h1Var = y6h1.i;
            x6h1 x6h1VarI = i3o1.i();
            x6h1VarI.h = "music";
            x6h1VarI.a = "mobile-widget-npv-recommendations";
            x6h1VarI.f = "7.2.0";
            x6h1VarI.g = "22.0.0";
            x6h1VarI.b = pageIdentifier;
            y6h1 y6h1VarA = x6h1VarI.a();
            Collections.singletonList("any");
            String reason = spotifyLogo.getReason();
            x6h1 x6h1VarC = y6h1VarA.c();
            x6h1VarC.i.add(new a7h1("logo", (String) null, (Integer) null, (String) null, reason));
            x6h1VarC.j = false;
            y6h1 y6h1VarA2 = x6h1VarC.a();
            String str3 = nik1.z0.a;
            z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
            if (str3 == null) {
                str3 = "";
            }
            w7h1 w7h1Var = new w7h1("", "", z7h1Var, new x7h1("open_app", 1, sqg0.J(new mmr0[]{new mmr0("destination", str3), new mmr0("app", "music")})), y6h1VarA2, r6h1.c, System.currentTimeMillis());
            mVar.b(spotifyLogo.getPageIdentifier());
            tv80VarM = mVar.a.m(w7h1Var, (xj61) null);
            str2 = str;
            rVar.a = str2;
            rVar.b = tv80VarM;
            rVar.e = 1;
            objA = a(rVar);
            Object obj2 = d9n.a;
            if (objA == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            tv80VarM = rVar.b;
            String str4 = rVar.a;
            hm5.M(obj);
            objA = obj;
            str2 = str4;
        }
        kb61 kb61Var = (kb61) objA;
        if (kb61Var != null && (npl1VarP = kb61Var.P()) != null) {
            npl1VarP.b(new epl1(tv80VarM.a.a, "", str2));
        }
        this.b.f(new dwn0(nik1.z0.a, "", true, false, 0, 0, false, (a690) null, (Bundle) null, tv80VarM != null ? new bwn0(tv80VarM) : null));
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x017c A[PHI: r1
      0x017c: PHI (r1v34 java.lang.Object) = (r1v33 java.lang.Object), (r1v1 java.lang.Object) binds: [B:46:0x0179, B:18:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x0184  */
    /* JADX WARN: Code duplicated, block: B:51:0x0186  */
    /* JADX WARN: Code duplicated, block: B:53:0x0189  */
    /* JADX WARN: Code duplicated, block: B:56:0x019e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01b8, code lost:
    
        if (r1 == r11) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(com.spotify.widgets.npvwidget.WidgetInteraction.WrappedClick r25, p.onm r26) {
        /*
            Method dump skipped, instruction units count: 476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.widgets.npvwidget.t.g(com.spotify.widgets.npvwidget.WidgetInteraction$WrappedClick, p.onm):java.lang.Object");
    }

    public final void h(String str, ou80 ou80Var) {
        this.e.e(ou80Var != null ? new lsn0(str, ou80Var) : jsn0.a);
    }
}
