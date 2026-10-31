package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.spotify.encoreconsumermobile.elements.addtobutton.AddToButtonView;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkShadow;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoreconsumermobile.elements.backbutton.BackButtonView;
import com.spotify.encoreconsumermobile.elements.badge.contentrestriction.ContentRestrictionBadgeView;
import com.spotify.encoreconsumermobile.elements.contextmenu.ContextMenuButton;
import com.spotify.encoreconsumermobile.elements.downloadbutton.DownloadButtonView;
import com.spotify.encoreconsumermobile.elements.playbutton.PlayButtonView;
import com.spotify.encoreconsumermobile.elements.quickactions.ban.BanButton;
import com.spotify.encoreconsumermobile.elements.shuffle.ShuffleButtonView;
import com.spotify.encoreconsumermobile.elements.smartshufflebutton.SmartShuffleButtonView;
import com.spotify.encoreconsumermobile.layout.headers.BehaviorRetainingAppBarLayout;
import com.spotify.watchfeed.uiusecases.element.explorerentrypoint.WatchFeedEntityExplorerEntryPointButtonView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lvs implements qzh {
    public vnf1 X;
    public Function0 Y;
    public final WatchFeedEntityExplorerEntryPointButtonView Z;
    public final Context a;
    public final h72 b;
    public final arl c;
    public final ip31 d;
    public final PlayButtonView e;
    public final TextView f;
    public final r4u g;
    public final int h;
    public final int i;
    public final String t;

    public lvs(Context context, gw70 gw70Var) {
        this.a = context;
        h72 h72VarG = h72.G(LayoutInflater.from(context));
        BehaviorRetainingAppBarLayout behaviorRetainingAppBarLayout = (BehaviorRetainingAppBarLayout) h72VarG.b;
        h360.h(h72VarG);
        this.b = h72VarG;
        ConstraintLayout constraintLayoutF = h360.f(h72VarG, 2131624465);
        int i = 2131427476;
        ViewStub viewStub = (ViewStub) m5n1.t(constraintLayoutF, 2131427476);
        if (viewStub != null) {
            i = 2131427611;
            ArtworkView artworkViewT = m5n1.t(constraintLayoutF, 2131427611);
            if (artworkViewT != null) {
                i = 2131427624;
                ArtworkShadow artworkShadowT = m5n1.t(constraintLayoutF, 2131427624);
                if (artworkShadowT != null) {
                    i = 2131427625;
                    if (((Space) m5n1.t(constraintLayoutF, 2131427625)) != null) {
                        i = 2131427626;
                        if (((Space) m5n1.t(constraintLayoutF, 2131427626)) != null) {
                            i = 2131427627;
                            if (((Space) m5n1.t(constraintLayoutF, 2131427627)) != null) {
                                i = 2131427628;
                                if (((Space) m5n1.t(constraintLayoutF, 2131427628)) != null) {
                                    i = 2131428210;
                                    if (((Space) m5n1.t(constraintLayoutF, 2131428210)) != null) {
                                        ConstraintLayout constraintLayout = constraintLayoutF;
                                        i = 2131428213;
                                        Space space = (Space) m5n1.t(constraintLayoutF, 2131428213);
                                        if (space != null) {
                                            i = 2131428285;
                                            if (((FrameLayout) m5n1.t(constraintLayoutF, 2131428285)) != null) {
                                                i = 2131428286;
                                                ViewStub viewStub2 = (ViewStub) m5n1.t(constraintLayoutF, 2131428286);
                                                if (viewStub2 != null) {
                                                    i = 2131428438;
                                                    if (((TextView) m5n1.t(constraintLayoutF, 2131428438)) != null) {
                                                        i = 2131428446;
                                                        if (((FrameLayout) m5n1.t(constraintLayoutF, 2131428446)) != null) {
                                                            i = 2131429064;
                                                            if (m5n1.t(constraintLayoutF, 2131429064) != null) {
                                                                i = 2131429069;
                                                                if (m5n1.t(constraintLayoutF, 2131429069) != null) {
                                                                    i = 2131430486;
                                                                    if (m5n1.t(constraintLayoutF, 2131430486) != null) {
                                                                        i = 2131430841;
                                                                        if (((ViewStub) m5n1.t(constraintLayoutF, 2131430841)) != null) {
                                                                            i = 2131431356;
                                                                            TextView textView = (TextView) m5n1.t(constraintLayoutF, 2131431356);
                                                                            if (textView != null) {
                                                                                i = 2131431402;
                                                                                if (((Space) m5n1.t(constraintLayoutF, 2131431402)) != null) {
                                                                                    i = 2131431421;
                                                                                    if (m5n1.t(constraintLayoutF, 2131431421) != null) {
                                                                                        arl arlVar = new arl(constraintLayout, viewStub, artworkViewT, artworkShadowT, space, viewStub2, textView);
                                                                                        this.c = arlVar;
                                                                                        viewStub.setLayoutResource(2131623975);
                                                                                        ConstraintLayout constraintLayoutInflate = viewStub.inflate();
                                                                                        ConstraintLayout constraintLayout2 = constraintLayoutInflate;
                                                                                        int i2 = 2131427521;
                                                                                        AddToButtonView addToButtonViewT = m5n1.t(constraintLayoutInflate, 2131427521);
                                                                                        if (addToButtonViewT != null) {
                                                                                            i2 = 2131427684;
                                                                                            BanButton banButtonT = m5n1.t(constraintLayoutInflate, 2131427684);
                                                                                            if (banButtonT != null) {
                                                                                                i2 = 2131427687;
                                                                                                if (m5n1.t(constraintLayoutInflate, 2131427687) != null) {
                                                                                                    i2 = 2131428234;
                                                                                                    ContextMenuButton contextMenuButtonT = m5n1.t(constraintLayoutInflate, 2131428234);
                                                                                                    if (contextMenuButtonT != null) {
                                                                                                        i2 = 2131428511;
                                                                                                        DownloadButtonView downloadButtonViewT = m5n1.t(constraintLayoutInflate, 2131428511);
                                                                                                        if (downloadButtonViewT != null) {
                                                                                                            i2 = 2131428681;
                                                                                                            WatchFeedEntityExplorerEntryPointButtonView watchFeedEntityExplorerEntryPointButtonView = (WatchFeedEntityExplorerEntryPointButtonView) m5n1.t(constraintLayoutInflate, 2131428681);
                                                                                                            if (watchFeedEntityExplorerEntryPointButtonView != null) {
                                                                                                                i2 = 2131429047;
                                                                                                                if (m5n1.t(constraintLayoutInflate, 2131429047) != null) {
                                                                                                                    i2 = 2131429049;
                                                                                                                    if (m5n1.t(constraintLayoutInflate, 2131429049) != null) {
                                                                                                                        i2 = 2131429050;
                                                                                                                        if (m5n1.t(constraintLayoutInflate, 2131429050) != null) {
                                                                                                                            i2 = 2131429106;
                                                                                                                            if (m5n1.t(constraintLayoutInflate, 2131429106) != null) {
                                                                                                                                i2 = 2131429107;
                                                                                                                                if (((Space) m5n1.t(constraintLayoutInflate, 2131429107)) != null) {
                                                                                                                                    i2 = 2131429973;
                                                                                                                                    TextView textView2 = (TextView) m5n1.t(constraintLayoutInflate, 2131429973);
                                                                                                                                    if (textView2 != null) {
                                                                                                                                        i2 = 2131430674;
                                                                                                                                        ContentRestrictionBadgeView contentRestrictionBadgeViewT = m5n1.t(constraintLayoutInflate, 2131430674);
                                                                                                                                        if (contentRestrictionBadgeViewT != null) {
                                                                                                                                            i2 = 2131430970;
                                                                                                                                            ShuffleButtonView shuffleButtonViewT = m5n1.t(constraintLayoutInflate, 2131430970);
                                                                                                                                            if (shuffleButtonViewT != null) {
                                                                                                                                                i2 = 2131431012;
                                                                                                                                                SmartShuffleButtonView smartShuffleButtonViewT = m5n1.t(constraintLayoutInflate, 2131431012);
                                                                                                                                                if (smartShuffleButtonViewT != null) {
                                                                                                                                                    ip31 ip31Var = new ip31(constraintLayout2, constraintLayout2, addToButtonViewT, banButtonT, contextMenuButtonT, downloadButtonViewT, watchFeedEntityExplorerEntryPointButtonView, textView2, contentRestrictionBadgeViewT, shuffleButtonViewT, smartShuffleButtonViewT);
                                                                                                                                                    shuffleButtonViewT.setVisibility(0);
                                                                                                                                                    smartShuffleButtonViewT.setVisibility(8);
                                                                                                                                                    this.d = ip31Var;
                                                                                                                                                    this.e = h360.g(h72VarG);
                                                                                                                                                    viewStub2.setLayoutResource(2131624489);
                                                                                                                                                    this.f = (TextView) viewStub2.inflate();
                                                                                                                                                    this.g = r4u.c(new r4u[]{r4u.d(new hyr(ivs.b, (byte) 1), r4u.a(new rjn(this, (byte) 21))), r4u.d(new hyr(jvs.b, (byte) 1), r4u.a(new vun(this, (byte) 22))), r4u.d(new hyr(kvs.b, (byte) 1), r4u.a(new qmr(this, (byte) 12))), r4u.a(new rmr(this, (byte) 13)), r4u.a(new efr(this, (byte) 12)), r4u.a(new tzo(this, (byte) 18)), r4u.a(new h9n(this, (byte) 18)), r4u.d(new hyr(gvs.b, (byte) 1), r4u.a(new sun(this, (byte) 20))), r4u.d(new hyr(hvs.b, (byte) 1), r4u.a(new her(this, (byte) 16)))});
                                                                                                                                                    this.h = behaviorRetainingAppBarLayout.getContext().getColor(2131101370);
                                                                                                                                                    this.i = context.getResources().getDimensionPixelSize(2131166120);
                                                                                                                                                    this.t = behaviorRetainingAppBarLayout.getContext().getString(2131955429);
                                                                                                                                                    this.Y = n0r.Y0;
                                                                                                                                                    this.Z = watchFeedEntityExplorerEntryPointButtonView;
                                                                                                                                                    downloadButtonViewT.setVisibility(8);
                                                                                                                                                    h360.i(h72VarG, new wsr(1, arlVar, brl.class, "applySystemWindowInsetTop", "applySystemWindowInsetTop(Lcom/spotify/encoreconsumermobile/layout/headers/databinding/ContentBinding;I)V", 1, (byte) 11));
                                                                                                                                                    h360.a(h72VarG, constraintLayout, textView);
                                                                                                                                                    artworkViewT.setViewContext(new f47(gw70Var));
                                                                                                                                                    behaviorRetainingAppBarLayout.a(new fvs(this));
                                                                                                                                                    behaviorRetainingAppBarLayout.addOnAttachStateChangeListener(new y22(this, (byte) 8));
                                                                                                                                                    return;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i2)));
                                                                                        throw null;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutF.getResources().getResourceName(i)));
        throw null;
    }

    public static final void k(lvs lvsVar) {
        ip31 ip31Var = lvsVar.d;
        Toolbar toolbar = (Toolbar) lvsVar.b.X;
        if (toolbar.getAlpha() == 1.0f && ((TextView) ip31Var.f).isImportantForAccessibility()) {
            ((ConstraintLayout) ip31Var.b).setImportantForAccessibility(4);
        } else {
            if (toolbar.getAlpha() >= 1.0f || ((TextView) ip31Var.f).isImportantForAccessibility()) {
                return;
            }
            ((ConstraintLayout) ip31Var.b).setImportantForAccessibility(1);
        }
    }

    public final void f(Object obj) {
        kjj1 jjj1Var;
        snf1 snf1Var = (snf1) obj;
        vnf1 vnf1Var = snf1Var.m;
        vnf1 vnf1Var2 = this.X;
        if (vnf1Var2 == null || !vnf1Var2.equals(vnf1Var)) {
            this.X = vnf1Var;
            WatchFeedEntityExplorerEntryPointButtonView watchFeedEntityExplorerEntryPointButtonView = this.Z;
            if (vnf1Var != null) {
                unf1 unf1Var = vnf1Var.c;
                String str = unf1Var.a;
                yzu yzuVar = vnf1Var.e;
                k0t k0tVar = (k0t) yzuVar.c;
                k0tVar.c(new x500(watchFeedEntityExplorerEntryPointButtonView.getVideoSurfaceView(), watchFeedEntityExplorerEntryPointButtonView.getThumbnailView()));
                watchFeedEntityExplorerEntryPointButtonView.setViewContext((h7l1) yzuVar.a);
                zfr zfrVar = (zfr) yzuVar.d;
                x8c0 lifecycle = ((iac0) zfrVar.b).getLifecycle();
                bxr bxrVar = (bxr) zfrVar.c;
                if (bxrVar != null) {
                    lifecycle.d(bxrVar);
                }
                bxr bxrVar2 = new bxr();
                lifecycle.a(bxrVar2);
                zfrVar.c = bxrVar2;
                String str2 = vnf1Var.a;
                n17 n17Var = new n17(new g07(vnf1Var.d.a));
                sp00 sp00Var = watchFeedEntityExplorerEntryPointButtonView.a;
                WatchFeedEntityExplorerEntryPointButtonView watchFeedEntityExplorerEntryPointButtonView2 = (WatchFeedEntityExplorerEntryPointButtonView) sp00Var.b;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) sp00Var.c;
                watchFeedEntityExplorerEntryPointButtonView2.setContentDescription(str2);
                if (!watchFeedEntityExplorerEntryPointButtonView.c) {
                    lottieAnimationView.setAnimation(2131886210);
                    h7l1 h7l1Var = watchFeedEntityExplorerEntryPointButtonView.d;
                    if (h7l1Var == null) {
                        u890.C("viewContext");
                        throw null;
                    }
                    if (h7l1Var.b.b(5)) {
                        lottieAnimationView.g();
                    } else {
                        lottieAnimationView.setProgress(1.0f);
                    }
                    watchFeedEntityExplorerEntryPointButtonView.c = true;
                }
                ((ArtworkView) sp00Var.d).h(n17Var);
                watchFeedEntityExplorerEntryPointButtonView.setVisibility(0);
                int iC = l1d.C(unf1Var.b);
                if (iC == 0) {
                    jjj1Var = new jjj1(0L, 0L, str);
                } else {
                    if (iC != 1) {
                        eg.o();
                        return;
                    }
                    jjj1Var = new kjj1(str);
                }
                k0tVar.c(new vxz(new sqj1(jjj1Var, "watch-feed-entrypoint-track-entity-explorer", new rqj1(9, ((x75) ((j3v) yzuVar.b).b).a()))));
            } else {
                watchFeedEntityExplorerEntryPointButtonView.setVisibility(8);
            }
        }
        this.g.e(snf1Var);
    }

    public final View getView() {
        return (BehaviorRetainingAppBarLayout) this.b.b;
    }

    public final void n(iu30 iu30Var) {
        ((BackButtonView) this.b.e).n(new shs(iu30Var, (byte) 11));
        this.e.n(new shs(iu30Var, (byte) 12));
        ip31 ip31Var = this.d;
        ((AddToButtonView) ip31Var.c).n(new shs(iu30Var, (byte) 13));
        ((ContextMenuButton) ip31Var.e).n(new shs(iu30Var, (byte) 14));
        ((ShuffleButtonView) ip31Var.h).n(new shs(iu30Var, (byte) 15));
        ((SmartShuffleButtonView) ip31Var.i).n(new shs(iu30Var, (byte) 16));
        ((BanButton) ip31Var.d).n(new shs(iu30Var, (byte) 17));
        this.Y = new hbs(iu30Var, (byte) 9);
        this.Z.n(new shs(iu30Var, (byte) 18));
    }
}
