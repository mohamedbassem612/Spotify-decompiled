package p;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoremobile.tooltip.TooltipContainer;
import com.spotify.encoremobile.viewstub.EncoreViewStub;
import com.spotify.mainlayout.ui.view.MainLayout;
import com.spotify.mainlayout.ui.view.containers.MainLayoutContentContainerView;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class l1g0 {
    public final gj5 a;
    public final bbr0 b;
    public final qe41 c;
    public final e1g0 d;
    public final i8h1 e;
    public final l6h1 f;
    public final boolean g;
    public final boolean h;
    public final m0n0 i;
    public final ffe1 j;
    public final hu2 k;
    public final s6a l;
    public final cwq0 m;
    public final ehc0 n;
    public final kly0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final kly0 f44p;
    public final ehc0 q;
    public final lnn0 r;
    public final ki10 s;
    public final k1g0 t = new k1g0(this, 1);
    public final k1g0 u = new k1g0(this, 2);
    public final k1g0 v = new k1g0(this, 0);
    public MainLayout w;
    public j1g0 x;

    public l1g0(gj5 gj5Var, bbr0 bbr0Var, q2g0 q2g0Var, qe41 qe41Var, e1g0 e1g0Var, i8h1 i8h1Var, l6h1 l6h1Var, boolean z, boolean z2, m0n0 m0n0Var, ffe1 ffe1Var, hu2 hu2Var, s6a s6aVar, cwq0 cwq0Var, ehc0 ehc0Var, thq thqVar, thq thqVar2, ehc0 ehc0Var2, lnn0 lnn0Var) {
        this.a = gj5Var;
        this.b = bbr0Var;
        this.c = qe41Var;
        this.d = e1g0Var;
        this.e = i8h1Var;
        this.f = l6h1Var;
        this.g = z;
        this.h = z2;
        this.i = m0n0Var;
        this.j = ffe1Var;
        this.k = hu2Var;
        this.l = s6aVar;
        this.m = cwq0Var;
        this.n = ehc0Var;
        this.o = thqVar;
        this.f44p = thqVar2;
        this.q = ehc0Var2;
        this.r = lnn0Var;
        this.s = new ki10(bbr0Var, q2g0Var);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:101:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:106:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:54:0x0172  */
    /* JADX WARN: Code duplicated, block: B:93:0x0295  */
    /* JADX WARN: Code duplicated, block: B:95:0x0298  */
    /* JADX WARN: Code duplicated, block: B:98:0x029c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v15, types: [android.view.ViewGroup, p.j1g0] */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.view.View, android.view.ViewGroup, com.spotify.mainlayout.ui.view.MainLayout, java.lang.Object] */
    public final void a(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        int i;
        int i2;
        zzq0 zzq0VarH;
        MainLayoutContentContainerView mainLayoutContentContainerView;
        ypg0 ypg0VarB;
        iac0 iac0Var;
        pzf0 pzf0Var;
        qim0 qim0Var;
        int iOrdinal;
        MainLayoutContentContainerView nowPlayingViewAttachmentsContainer;
        i0g0 nowPlayingViewAnimator$src_main_java_com_spotify_mainlayout_ui_view_view;
        float fA;
        c7p0 c7p0Var;
        oe41 oe41VarP = this.c.p();
        oe41VarP.c("main_layout_ui_holder", new aks(this, (byte) 1));
        Bundle bundleA = oe41VarP.a("main_layout_ui_holder");
        e1g0 e1g0Var = this.d;
        if (bundleA != null && (c7p0Var = (c7p0) o7h.t0(bundleA.getInt("npv_mode", -1), c7p0.d)) != null) {
            e1g0Var.a(c7p0Var);
        }
        boolean z = this.g;
        m0n0 m0n0Var = this.i;
        lnn0 lnn0Var = this.r;
        if (z) {
            ?? j1g0Var = new j1g0(layoutInflater.getContext(), this);
            Iterator it = j1g0Var.getLegacyViews().a.iterator();
            while (it.hasNext()) {
                frameLayout.addView((ViewGroup) it.next());
            }
            jon1.G(j1g0Var.getLegacyViews().b, lnn0Var, 12);
            jon1.G(j1g0Var.getLegacyViews().c, lnn0Var, 8);
            fdg1.A((ViewGroup) j1g0Var, qyf0.a);
            this.x = j1g0Var;
        } else {
            int i3 = frameLayout.getContext().getResources().getConfiguration().screenWidthDp;
            int i4 = frameLayout.getContext().getResources().getConfiguration().screenHeightDp;
            if (i3 < 720 || i4 < 600) {
                i = ((i3 < 600 || i4 < 600) && i3 >= 600) ? 2131625079 : 2131626296;
            } else {
                i = 2131625114;
            }
            ?? r7 = (MainLayout) layoutInflater.inflate(i, (ViewGroup) frameLayout, false);
            this.w = r7;
            iac0 iac0Var2 = this.a;
            u9c0 u9c0VarQ = cto1.q(iac0Var2);
            tac0 tac0Var = ((f0i) iac0Var2).a;
            eq80 eq80Var = new eq80(new e3h1(this.f, (n7h1) null, this.e));
            bbr0 bbr0Var = this.b;
            ozf0 ozf0Var = new ozf0(u9c0VarQ, r7, e1g0Var, bbr0Var, eq80Var, m0n0Var);
            MainLayoutContentContainerView navigationContainer = r7.getNavigationContainer();
            int iOrdinal2 = r7.getMode().ordinal();
            if (iOrdinal2 == 0) {
                i2 = 1;
            } else if (iOrdinal2 != 1) {
                if (iOrdinal2 != 2) {
                    eg.o();
                    return;
                }
                i2 = 1;
            } else {
                i2 = 2;
            }
            int iOrdinal3 = r7.getMode().ordinal();
            if (iOrdinal3 == 0 || iOrdinal3 == 1) {
                zzq0VarH = uyn1.h(3, 0.0f, 0.0f);
            } else {
                if (iOrdinal3 != 2) {
                    eg.o();
                    return;
                }
                zzq0VarH = uyn1.h(1, 0.0f, ozf0Var.a(2131165904));
            }
            ozf0.c(ozf0Var, navigationContainer, "navigationBar", this.n, new ttn0(i2, zzq0VarH), null, 24);
            lzf0 lzf0Var = new lzf0(ozf0Var, (byte) 2);
            EncoreViewStub encoreViewStubFindViewById = r7.findViewById(2131428960);
            EncoreViewStub encoreViewStub = encoreViewStubFindViewById instanceof EncoreViewStub ? encoreViewStubFindViewById : null;
            if (encoreViewStub == null) {
                mainLayoutContentContainerView = null;
            } else {
                o6 mainLayoutContentContainerView2 = this.h ? new MainLayoutContentContainerView(r7.getContext()) : (View) lzf0Var.invoke(r7.getContext());
                k8p1.o(encoreViewStub, mainLayoutContentContainerView2);
                if (mainLayoutContentContainerView2 instanceof MainLayoutContentContainerView) {
                    mainLayoutContentContainerView = (MainLayoutContentContainerView) mainLayoutContentContainerView2;
                } else {
                    mainLayoutContentContainerView = null;
                }
            }
            r7.getFragmentOverlayContainer().setTag(2131429842, r7.getInsets$src_main_java_com_spotify_mainlayout_ui_view_view().c());
            rih1 rih1Var = rih1.a;
            if (mainLayoutContentContainerView != null) {
                ozf0.c(ozf0Var, mainLayoutContentContainerView, "overlayPage", this.m, rih1Var, dvf0.i, 16);
            }
            rih1 rih1Var2 = rih1Var;
            boolean z2 = r7.getMode() == qyf0.b;
            MainLayoutContentContainerView nowPlayingViewContainer = r7.getNowPlayingViewContainer();
            if (nowPlayingViewContainer == null) {
                iac0Var = iac0Var2;
                rih1Var2 = rih1Var2;
            } else {
                int iOrdinal4 = r7.getMode().ordinal();
                if (iOrdinal4 == 0 || iOrdinal4 == 1) {
                    ypg0VarB = gio1.b(new w6p0(new t6p0((mzf0) null, (Integer) null)));
                } else {
                    if (iOrdinal4 != 2) {
                        eg.o();
                        return;
                    }
                    ypg0VarB = z2 ? new ypg0(dvf0.t, new cp20(new lzf0(ozf0Var, (byte) 4), (zob1) e1g0Var.d.getValue())) : gio1.b(new w6p0(new u6p0((mzf0) null)));
                }
                pzf0 pzf0Var2 = (pzf0) this.o.get();
                dvf0 dvf0Var = dvf0.g;
                MainLayout mainLayout = z2 ? r7 : 0;
                qim0 qim0Var2 = nim0.a;
                if (mainLayout == 0 || (nowPlayingViewAnimator$src_main_java_com_spotify_mainlayout_ui_view_view = mainLayout.getNowPlayingViewAnimator$src_main_java_com_spotify_mainlayout_ui_view_view()) == null) {
                    iac0Var = iac0Var2;
                    pzf0Var = pzf0Var2;
                } else {
                    lbc0 lbc0Var = new lbc0(1, ozf0Var, ozf0.class, "setNowPlayingViewMode", "setNowPlayingViewMode(Lcom/spotify/mainlayout/preferences/NowPlayingViewMainLayoutMode;)V", 0, (byte) 19);
                    p811 p811Var = new p811();
                    l811 l811Var = new l811();
                    l811 l811Var2 = new l811();
                    l811 l811Var3 = new l811();
                    g1g0 g1g0Var = new g1g0(lbc0Var, nowPlayingViewAnimator$src_main_java_com_spotify_mainlayout_ui_view_view, l811Var, l811Var2, l811Var3, p811Var);
                    iac0Var = iac0Var2;
                    pzf0Var = pzf0Var2;
                    qim0 qim0VarB = f8d1.b(bmq0.L(qim0Var2, g1g0Var, (g6o0) null), rih1Var2, new lpo(lbc0Var, nowPlayingViewAnimator$src_main_java_com_spotify_mainlayout_ui_view_view, l811Var, l811Var2, l811Var3, p811Var));
                    if (qim0VarB != null) {
                        qim0Var = qim0VarB;
                    }
                    nowPlayingViewContainer.E("nowPlayingView", pzf0Var, ypg0VarB, bbr0Var, eq80Var, m0n0Var, r7.getInsets$src_main_java_com_spotify_mainlayout_ui_view_view(), dvf0Var, qim0Var);
                    iOrdinal = r7.getMode().ordinal();
                    if (iOrdinal != 0) {
                        z2 = true;
                    } else if (iOrdinal != 1) {
                        z2 = false;
                    } else if (iOrdinal != 2) {
                        eg.o();
                        return;
                    }
                    if (!z2 && (nowPlayingViewAttachmentsContainer = r7.getNowPlayingViewAttachmentsContainer()) != null) {
                        nowPlayingViewAttachmentsContainer.E("nowPlayingViewAttachments", (pzf0) this.f44p.get(), new cp20(new j2d0(nowPlayingViewContainer.P0, ozf0Var, (byte) 19), ypg0VarB), bbr0Var, eq80Var, m0n0Var, r7.getInsets$src_main_java_com_spotify_mainlayout_ui_view_view(), dvf0.h, qim0Var2);
                    }
                    fn31.T(u9c0VarQ, (o8n) null, 0, new tfe0((Object) nowPlayingViewContainer, (Object) ozf0Var, (lnm) null, (byte) 12), 3);
                }
                qim0Var = qim0Var2;
                nowPlayingViewContainer.E("nowPlayingView", pzf0Var, ypg0VarB, bbr0Var, eq80Var, m0n0Var, r7.getInsets$src_main_java_com_spotify_mainlayout_ui_view_view(), dvf0Var, qim0Var);
                iOrdinal = r7.getMode().ordinal();
                if (iOrdinal != 0) {
                    z2 = true;
                } else if (iOrdinal != 1) {
                    z2 = false;
                } else if (iOrdinal != 2) {
                    eg.o();
                    return;
                }
                if (!z2) {
                }
                fn31.T(u9c0VarQ, (o8n) null, 0, new tfe0((Object) nowPlayingViewContainer, (Object) ozf0Var, (lnm) null, (byte) 12), 3);
            }
            ozf0.c(ozf0Var, r7.getLimitedExperienceIndicatorContainer(), "limitedExperienceIndicator", this.q, rih1Var2, new lzf0(ozf0Var, (byte) 1), 16);
            rih1 rih1Var3 = rih1Var2;
            float fB = ozf0Var.b();
            int iOrdinal5 = r7.getMode().ordinal();
            if (iOrdinal5 == 0 || iOrdinal5 == 1) {
                fA = ozf0Var.a(2131166393);
            } else {
                if (iOrdinal5 != 2) {
                    eg.o();
                    return;
                }
                fA = 0.0f;
            }
            eu2 eu2Var = new eu2(fB, new zzq0(fA, 0.0f, fA, 0.0f));
            MainLayoutContentContainerView responseAgentContainer = r7.getResponseAgentContainer();
            fu2 fu2Var = new fu2(2, eu2Var);
            dvf0 dvf0Var2 = dvf0.e;
            hu2 hu2Var = this.k;
            ozf0.c(ozf0Var, responseAgentContainer, "responseAgent", hu2Var, fu2Var, dvf0Var2, 16);
            ozf0.c(ozf0Var, r7.getThinkingAgentContainer(), "thinkingAgent", hu2Var, new fu2(1, eu2Var), dvf0.f, 16);
            ozf0.c(ozf0Var, r7.getBannerContainer(), "banner", this.l, rih1Var3, new lzf0(ozf0Var, (byte) 0), 16);
            jon1.G(r7.getFragmentContainer(), lnn0Var, 12);
            jon1.G(r7.getFragmentOverlayContainer(), lnn0Var, 8);
            fdg1.A((ViewGroup) r7, r7.getMode());
            TooltipContainer tooltipContainer = r7.getTooltipContainer();
            if (tooltipContainer.t != null) {
                n57.e("TooltipContainer already initialized");
            } else {
                ffe1 ffe1Var = this.j;
                tooltipContainer.t = new esa1((e4j0) ffe1Var.b, (i4f1) ffe1Var.c, (byte) 26);
            }
            ji10 ji10VarB0 = this.s.b0(hgr0.class);
            k1g0 k1g0Var = this.t;
            ji10VarB0.d(k1g0Var);
            tac0Var.a(new zh0(ji10VarB0, k1g0Var, (byte) 9));
            bbr0 bbr0Var2 = this.b;
            war0 war0VarB0 = bbr0Var2.b0(f6w0.class);
            k1g0 k1g0Var2 = this.u;
            war0VarB0.d(k1g0Var2);
            tac0Var.a(new zh0(war0VarB0, k1g0Var2, (byte) 9));
            war0 war0VarB1 = bbr0Var2.b0(uwq0.class);
            k1g0 k1g0Var3 = this.v;
            war0VarB1.d(k1g0Var3);
            tac0Var.a(new zh0(war0VarB1, k1g0Var3, (byte) 9));
            fn31.T(cto1.q(iac0Var), (o8n) null, 0, new tfe0((Object) this, (Object) r7, (lnm) null, (byte) 14), 3);
        }
        b().setTag(2131429970, m0n0Var);
    }

    public final ViewGroup b() {
        ConstraintLayout constraintLayout = this.w;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        o6 o6Var = this.x;
        if (o6Var != null) {
            return o6Var;
        }
        eg.m("No view created");
        return null;
    }
}
