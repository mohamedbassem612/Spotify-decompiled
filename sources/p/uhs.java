package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoreconsumermobile.elements.backbutton.BackButtonView;
import com.spotify.encoreconsumermobile.elements.contextmenu.ContextMenuButton;
import com.spotify.encoreconsumermobile.elements.creatorbutton.CreatorButtonView;
import com.spotify.encoreconsumermobile.layout.headers.BehaviorRetainingAppBarLayout;
import com.spotify.encoremobile.viewstub.EncoreViewStub;
import com.spotify.prerelease.uiusecases.mutebutton.MuteButtonView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class uhs implements qzh {
    public j4w0 X;
    public final nqr Y;
    public ths Z;
    public final Context a;
    public final ivj1 b;
    public final qzh c;
    public final h72 d;
    public final mzr0 e;
    public final ytp0 f;
    public final MuteButtonView g;
    public final ContextMenuButton h;
    public final int i;
    public final r4u t;

    public uhs(Context context, ivj1 ivj1Var, gw70 gw70Var, af10 af10Var, qzh qzhVar, boolean z) {
        int i;
        this.a = context;
        this.b = ivj1Var;
        this.c = qzhVar;
        h72 h72VarG = h72.G(LayoutInflater.from(context));
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) h72VarG.g;
        BehaviorRetainingAppBarLayout behaviorRetainingAppBarLayout = (BehaviorRetainingAppBarLayout) h72VarG.b;
        h360.h(h72VarG);
        this.d = h72VarG;
        ConstraintLayout constraintLayoutF = h360.f(h72VarG, 2131625449);
        int i2 = 2131427476;
        ViewStub viewStub = (ViewStub) m5n1.t(constraintLayoutF, 2131427476);
        if (viewStub != null) {
            i2 = 2131428254;
            FrameLayout frameLayout = (FrameLayout) m5n1.t(constraintLayoutF, 2131428254);
            if (frameLayout != null) {
                i2 = 2131428255;
                if (((LinearLayout) m5n1.t(constraintLayoutF, 2131428255)) != null) {
                    i2 = 2131428544;
                    TextView textView = (TextView) m5n1.t(constraintLayoutF, 2131428544);
                    if (textView != null) {
                        i2 = 2131428828;
                        ArtworkView artworkViewT = m5n1.t(constraintLayoutF, 2131428828);
                        if (artworkViewT != null) {
                            i2 = 2131431356;
                            TextView textView2 = (TextView) m5n1.t(constraintLayoutF, 2131431356);
                            if (textView2 != null) {
                                i2 = 2131431586;
                                ConstraintLayout constraintLayoutT = m5n1.t(constraintLayoutF, 2131431586);
                                if (constraintLayoutT != null) {
                                    i2 = 2131431600;
                                    ProgressBar progressBar = (ProgressBar) m5n1.t(constraintLayoutF, 2131431600);
                                    if (progressBar != null) {
                                        i2 = 2131431606;
                                        VideoSurfaceView videoSurfaceViewT = m5n1.t(constraintLayoutF, 2131431606);
                                        if (videoSurfaceViewT != null) {
                                            ConstraintLayout constraintLayout = constraintLayoutF;
                                            this.e = new mzr0(constraintLayout, viewStub, frameLayout, textView, artworkViewT, textView2, constraintLayoutT, progressBar, videoSurfaceViewT);
                                            viewStub.setLayoutResource(2131625446);
                                            ConstraintLayout constraintLayoutInflate = viewStub.inflate();
                                            int i3 = 2131428234;
                                            ContextMenuButton contextMenuButtonT = m5n1.t(constraintLayoutInflate, 2131428234);
                                            if (contextMenuButtonT != null) {
                                                i3 = 2131428280;
                                                CreatorButtonView creatorButtonViewT = m5n1.t(constraintLayoutInflate, 2131428280);
                                                if (creatorButtonViewT != null) {
                                                    i3 = 2131429048;
                                                    if (m5n1.t(constraintLayoutInflate, 2131429048) != null) {
                                                        i3 = 2131429050;
                                                        if (m5n1.t(constraintLayoutInflate, 2131429050) != null) {
                                                            i3 = 2131429973;
                                                            TextView textView3 = (TextView) m5n1.t(constraintLayoutInflate, 2131429973);
                                                            if (textView3 != null) {
                                                                i3 = 2131430478;
                                                                EncoreViewStub encoreViewStubT = m5n1.t(constraintLayoutInflate, 2131430478);
                                                                if (encoreViewStubT != null) {
                                                                    i3 = 2131430938;
                                                                    ImageButton imageButton = (ImageButton) m5n1.t(constraintLayoutInflate, 2131430938);
                                                                    if (imageButton != null) {
                                                                        this.f = new ytp0(constraintLayoutInflate, contextMenuButtonT, creatorButtonViewT, textView3, encoreViewStubT, imageButton);
                                                                        ViewStub viewStub2 = (ViewStub) h72VarG.c;
                                                                        viewStub2.setLayoutResource(2131625448);
                                                                        View viewInflate = viewStub2.inflate();
                                                                        MuteButtonView muteButtonView = (MuteButtonView) m5n1.t(viewInflate, 2131430096);
                                                                        if (muteButtonView != null) {
                                                                            ContextMenuButton contextMenuButtonT2 = m5n1.t(viewInflate, 2131431401);
                                                                            if (contextMenuButtonT2 != null) {
                                                                                LinearLayout linearLayout = (LinearLayout) viewInflate;
                                                                                this.g = muteButtonView;
                                                                                this.h = contextMenuButtonT2;
                                                                                this.i = behaviorRetainingAppBarLayout.getContext().getColor(2131101370);
                                                                                this.t = r4u.c(new r4u[]{r4u.d(new bvn(lhs.b, (byte) 2), r4u.a(new rjn((Object) this, (byte) 18))), r4u.d(new bvn(nhs.b, (byte) 2), r4u.a(new vun(this, (byte) 18))), r4u.d(new bvn(ohs.b, (byte) 2), r4u.a(new qmr(this, (byte) 9))), r4u.d(new bvn(phs.b, (byte) 2), r4u.a(new rmr(this, (byte) 9))), r4u.d(new bvn(qhs.b, (byte) 2), r4u.a(new lqr(this, (byte) 7))), r4u.d(new bvn(ghs.b, (byte) 2), r4u.a(new a0m(this, (byte) 20))), r4u.d(new bvn(hhs.b, (byte) 2), r4u.a(new wcr(this, (byte) 11))), r4u.d(new bvn(ihs.b, (byte) 2), r4u.a(new xap((Object) this, (byte) 13))), r4u.d(new bvn(jhs.b, (byte) 2), r4u.a(new h9n(this, (byte) 15))), r4u.d(new bvn(khs.b, (byte) 2), r4u.a(new sun(this, (byte) 16))), r4u.d(new bvn(mhs.b, (byte) 2), r4u.a(new her(this, (byte) 12)))});
                                                                                WeakHashMap weakHashMap = b8k1.a;
                                                                                r7k1.c(collapsingToolbarLayout, (k1q0) null);
                                                                                r7k1.c(collapsingToolbarLayout, new ogr(this, (byte) 8));
                                                                                h360.a(h72VarG, constraintLayout, textView2);
                                                                                artworkViewT.setViewContext(new f47(gw70Var));
                                                                                creatorButtonViewT.setViewContext(new szn(af10Var));
                                                                                imageButton.setImageDrawable(azo1.q(2131101354, context, j4b1.Y5));
                                                                                textView3.setTextAppearance(2132018006);
                                                                                nqr nqrVar = new nqr(new b2c(context, gw70Var, 0), new yir(context, (byte) 13), null, null);
                                                                                this.Y = nqrVar;
                                                                                frameLayout.addView(nqrVar.f);
                                                                                behaviorRetainingAppBarLayout.a(new rzg(this, (byte) 7));
                                                                                videoSurfaceViewT.setScaleType(b3k1.c);
                                                                                videoSurfaceViewT.setBufferingThrobberEnabled(false);
                                                                                k8p1.o(encoreViewStubT, qzhVar.getView());
                                                                                ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                                                                                if (layoutParams == null) {
                                                                                    bhn0.i("null cannot be cast to non-null type com.google.android.material.appbar.CollapsingToolbarLayout.LayoutParams");
                                                                                    throw null;
                                                                                }
                                                                                qzg qzgVar = (qzg) layoutParams;
                                                                                ((FrameLayout.LayoutParams) qzgVar).width = -2;
                                                                                ((FrameLayout.LayoutParams) qzgVar).height = -2;
                                                                                qzgVar.a = 1;
                                                                                linearLayout.setLayoutParams(qzgVar);
                                                                                contextMenuButtonT2.setVisibility(z ? 0 : 8);
                                                                                if (z) {
                                                                                    contextMenuButtonT.setVisibility(8);
                                                                                    return;
                                                                                }
                                                                                return;
                                                                            }
                                                                            i = 2131431401;
                                                                        } else {
                                                                            i = 2131430096;
                                                                        }
                                                                        bhn0.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
                                                                        throw null;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i3)));
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
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutF.getResources().getResourceName(i2)));
        throw null;
    }

    public final void f(Object obj) {
        j4w0 j4w0Var = (j4w0) obj;
        this.X = j4w0Var;
        this.t.e(j4w0Var);
    }

    public final View getView() {
        return (BehaviorRetainingAppBarLayout) this.d.b;
    }

    public final void n(iu30 iu30Var) {
        ((BackButtonView) this.d.e).n(new mwr(iu30Var, (byte) 28));
        ((VideoSurfaceView) this.e.g).setOnClickListener(new cvr(this, iu30Var, (byte) 11));
        ytp0 ytp0Var = this.f;
        ((CreatorButtonView) ytp0Var.d).n(new mwr(iu30Var, (byte) 29));
        ((ImageButton) ytp0Var.f).setOnClickListener(new oes(iu30Var, (byte) 19));
        this.g.n(new rhs(this, iu30Var));
        this.Y.n(new shs(iu30Var, (byte) 0));
        this.Z = new ths(this, iu30Var);
        this.c.n(new rhs(iu30Var, this));
        ((ContextMenuButton) ytp0Var.c).n(new shs(iu30Var, (byte) 1));
        this.h.n(new mwr(iu30Var, (byte) 27));
    }
}
