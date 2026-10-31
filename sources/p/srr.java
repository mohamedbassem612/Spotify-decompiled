package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoreconsumermobile.elements.backbutton.BackButtonView;
import com.spotify.encoreconsumermobile.layout.headers.BehaviorRetainingAppBarLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class srr implements qzh {
    public final h72 a;
    public final wdm b;
    public final int c;
    public Integer d;
    public final r4u e;
    public iu30 f;
    public View g;

    public srr(Context context, gw70 gw70Var) {
        h72 h72VarG = h72.G(LayoutInflater.from(context));
        BehaviorRetainingAppBarLayout behaviorRetainingAppBarLayout = (BehaviorRetainingAppBarLayout) h72VarG.b;
        h360.h(h72VarG);
        this.a = h72VarG;
        MotionLayout motionLayoutF = h360.f(h72VarG, 2131624496);
        int i = 2131427611;
        ArtworkView artworkViewT = m5n1.t(motionLayoutF, 2131427611);
        if (artworkViewT != null) {
            i = 2131427620;
            View viewT = m5n1.t(motionLayoutF, 2131427620);
            if (viewT != null) {
                i = 2131427673;
                View viewT2 = m5n1.t(motionLayoutF, 2131427673);
                if (viewT2 != null) {
                    i = 2131427675;
                    View viewT3 = m5n1.t(motionLayoutF, 2131427675);
                    if (viewT3 != null) {
                        MotionLayout motionLayout = motionLayoutF;
                        i = 2131428262;
                        TextView textView = (TextView) m5n1.t(motionLayoutF, 2131428262);
                        if (textView != null) {
                            i = 2131428263;
                            ConstraintLayout constraintLayoutT = m5n1.t(motionLayoutF, 2131428263);
                            if (constraintLayoutT != null) {
                                i = 2131428264;
                                TextView textView2 = (TextView) m5n1.t(motionLayoutF, 2131428264);
                                if (textView2 != null) {
                                    i = 2131428438;
                                    TextView textView3 = (TextView) m5n1.t(motionLayoutF, 2131428438);
                                    if (textView3 != null) {
                                        i = 2131429051;
                                        if (m5n1.t(motionLayoutF, 2131429051) != null) {
                                            i = 2131429052;
                                            if (m5n1.t(motionLayoutF, 2131429052) != null) {
                                                i = 2131431115;
                                                TextView textView4 = (TextView) m5n1.t(motionLayoutF, 2131431115);
                                                if (textView4 != null) {
                                                    i = 2131431356;
                                                    TextView textView5 = (TextView) m5n1.t(motionLayoutF, 2131431356);
                                                    if (textView5 != null) {
                                                        this.b = new wdm(motionLayout, artworkViewT, viewT, viewT2, viewT3, motionLayout, textView, constraintLayoutT, textView2, textView3, textView4, textView5, (byte) 1);
                                                        this.c = behaviorRetainingAppBarLayout.getContext().getColor(2131101370);
                                                        this.e = r4u.c(new r4u[]{r4u.d(new rrr(mrr.b, (byte) 0), r4u.a(new rmr(this, (byte) 3))), r4u.d(new rrr(nrr.b, (byte) 0), r4u.a(new efr(this, (byte) 4))), r4u.d(new rrr(orr.b, (byte) 0), r4u.a(new tzo(this, (byte) 9))), r4u.d(new rrr(prr.b, (byte) 0), r4u.a(new ogr(this, (byte) 5))), r4u.d(new rrr(qrr.b, (byte) 0), r4u.a(new vun(this, (byte) 11))), r4u.d(new rrr(lrr.b, (byte) 0), r4u.a(new qmr(this, (byte) 3)))});
                                                        ViewGroup.LayoutParams layoutParams = motionLayout.getLayoutParams();
                                                        if (layoutParams == null) {
                                                            bhn0.i("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                                            throw null;
                                                        }
                                                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                                                        marginLayoutParams.width = -1;
                                                        marginLayoutParams.height = context.getResources().getDimensionPixelSize(2131165609);
                                                        motionLayout.setLayoutParams(marginLayoutParams);
                                                        ((Toolbar) h72VarG.X).setAlpha(1.0f);
                                                        h360.i(h72VarG, v160.h);
                                                        h360.a(h72VarG, motionLayout, textView5);
                                                        ((View) h72VarG.f).setVisibility(0);
                                                        ((BackButtonView) h72VarG.e).setAccessibilityTraversalAfter(textView5.getId());
                                                        h360.k(h72VarG);
                                                        behaviorRetainingAppBarLayout.a(new pun(h72VarG, this, (byte) 1));
                                                        artworkViewT.setViewContext(new f47(gw70Var));
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
        bhn0.i("Missing required view with ID: ".concat(motionLayoutF.getResources().getResourceName(i)));
        throw null;
    }

    public final void f(Object obj) {
        this.e.e((qfo) obj);
    }

    public final View getView() {
        return (BehaviorRetainingAppBarLayout) this.a.b;
    }

    public final void n(iu30 iu30Var) {
        ((BackButtonView) this.a.e).n(new m0o(iu30Var, (byte) 25));
        this.f = iu30Var;
    }
}
