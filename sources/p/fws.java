package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoreconsumermobile.elements.artistandaddedbyname.ArtistAndAddedByNameView;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoreconsumermobile.elements.badge.contentrestriction.ContentRestrictionBadgeView;
import com.spotify.encoreconsumermobile.elements.badge.enhanced.EnhancedBadgeView;
import com.spotify.encoreconsumermobile.elements.badge.queued.QueuedBadgeView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.facepile.FacePileView;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fws implements qzh {
    public final int N0;
    public final int O0;
    public final znb0 P0;
    public final int X;
    public final int Y;
    public final int Z;
    public final /* synthetic */ tgv a;
    public final gw70 b;
    public final wdm c;
    public final FacePileView d;
    public iu30 e;
    public boolean f;
    public final hrr0 g;
    public boolean h;
    public final hrr0 i;
    public final int t;

    public fws(Context context, gw70 gw70Var) {
        tgv tgvVar = new tgv();
        tgvVar.a = -1;
        tgvVar.b = -1;
        tgvVar.c = -1;
        tgvVar.d = -1;
        tgvVar.e = -1;
        tgvVar.f = -1;
        this.a = tgvVar;
        this.b = gw70Var;
        ConstraintLayout constraintLayoutInflate = LayoutInflater.from(context).inflate(2131625117, (ViewGroup) null, false);
        int i = 2131427611;
        View view = (ArtworkView) m5n1.t(constraintLayoutInflate, 2131427611);
        if (view != null) {
            i = 2131427687;
            if (m5n1.t(constraintLayoutInflate, 2131427687) != null) {
                i = 2131428198;
                if (m5n1.t(constraintLayoutInflate, 2131428198) != null) {
                    i = 2131428530;
                    View view2 = (EncoreButton) m5n1.t(constraintLayoutInflate, 2131428530);
                    if (view2 != null) {
                        i = 2131428664;
                        EnhancedBadgeView enhancedBadgeViewT = m5n1.t(constraintLayoutInflate, 2131428664);
                        if (enhancedBadgeViewT != null) {
                            i = 2131428819;
                            if (m5n1.t(constraintLayoutInflate, 2131428819) != null) {
                                int i2 = 2131429706;
                                ImageView imageView = (ImageView) m5n1.t(constraintLayoutInflate, 2131429706);
                                if (imageView != null) {
                                    i2 = 2131429989;
                                    ComposeView composeViewT = m5n1.t(constraintLayoutInflate, 2131429989);
                                    if (composeViewT != null) {
                                        i2 = 2131430570;
                                        QueuedBadgeView queuedBadgeViewT = m5n1.t(constraintLayoutInflate, 2131430570);
                                        if (queuedBadgeViewT != null) {
                                            i2 = 2131430674;
                                            ContentRestrictionBadgeView contentRestrictionBadgeViewT = m5n1.t(constraintLayoutInflate, 2131430674);
                                            if (contentRestrictionBadgeViewT != null) {
                                                i2 = 2131430921;
                                                ComposeView composeViewT2 = m5n1.t(constraintLayoutInflate, 2131430921);
                                                if (composeViewT2 != null) {
                                                    i2 = 2131431115;
                                                    View view3 = (ArtistAndAddedByNameView) m5n1.t(constraintLayoutInflate, 2131431115);
                                                    if (view3 != null) {
                                                        i2 = 2131431356;
                                                        TextView textView = (TextView) m5n1.t(constraintLayoutInflate, 2131431356);
                                                        if (textView != null) {
                                                            ConstraintLayout constraintLayout = constraintLayoutInflate;
                                                            i2 = 2131431584;
                                                            FrameLayout frameLayout = (FrameLayout) m5n1.t(constraintLayoutInflate, 2131431584);
                                                            if (frameLayout != null) {
                                                                this.c = new wdm(constraintLayout, view, view2, enhancedBadgeViewT, imageView, composeViewT, queuedBadgeViewT, contentRestrictionBadgeViewT, composeViewT2, view3, textView, frameLayout, (byte) 22);
                                                                this.d = constraintLayout.findViewById(2131428819);
                                                                this.e = mls.Z0;
                                                                this.g = v8r.q(Boolean.FALSE);
                                                                this.i = v8r.q((Object) null);
                                                                this.t = context.getResources().getDimensionPixelSize(2131167170);
                                                                this.X = context.getResources().getDimensionPixelSize(2131167170);
                                                                this.Y = context.getResources().getDimensionPixelSize(2131167171);
                                                                this.Z = context.getResources().getDimensionPixelSize(2131167174);
                                                                this.N0 = context.getResources().getDimensionPixelSize(2131167172);
                                                                this.O0 = context.getResources().getDimensionPixelSize(2131167023);
                                                                this.P0 = dm5.S(3, new ots(this, (byte) 8));
                                                                constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                                                v9w0 v9w0VarQ = b2u.q(constraintLayout);
                                                                Collections.addAll(v9w0VarQ.d, view2, view);
                                                                Collections.addAll(v9w0VarQ.c, textView, view3);
                                                                v9w0VarQ.e = false;
                                                                v9w0VarQ.a();
                                                                view.setViewContext(new f47(gw70Var));
                                                                composeViewT.setViewCompositionStrategy(p5x0.W0);
                                                                composeViewT.setContent(new j2i(736810059, new pvs(this, (byte) 1), true));
                                                                zbs zbsVar = new zbs(context);
                                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) zbsVar.b.c;
                                                                zbsVar.a(new tan0(1, true));
                                                                constraintLayout2.setImportantForAccessibility(4);
                                                                frameLayout.addView(constraintLayout2);
                                                                return;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i2;
                            }
                        }
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        throw null;
    }

    public final void f(Object obj) {
        gzf1 gzf1Var = (gzf1) obj;
        ezf1 ezf1Var = gzf1Var.e;
        ((q4u) this.P0.getValue()).a(gzf1Var);
        wdm wdmVar = this.c;
        n1p1.p((ArtistAndAddedByNameView) wdmVar.X, gzf1Var.q, gzf1Var.r);
        ConstraintLayout constraintLayout = (ConstraintLayout) wdmVar.b;
        boolean z = gzf1Var.i;
        ezf1 ezf1Var2 = ezf1.c;
        boolean z2 = z && ezf1Var == ezf1Var2;
        boolean z3 = gzf1Var.j && ezf1Var == ezf1Var2;
        boolean z4 = gzf1Var.k;
        boolean z5 = gzf1Var.l;
        boolean z6 = gzf1Var.n;
        boolean z7 = gzf1Var.o;
        qvs qvsVar = new qvs(this, (byte) 1);
        View viewFindViewById = constraintLayout.findViewById(2131428530);
        tgv tgvVar = this.a;
        b8k1.l(constraintLayout, tgvVar.b);
        b8k1.h(constraintLayout, 0);
        b8k1.l(constraintLayout, tgvVar.a);
        b8k1.h(constraintLayout, 0);
        tgvVar.b = -1;
        tgvVar.a = -1;
        if (z2) {
            tgvVar.a = b8k1.a(constraintLayout, constraintLayout.getResources().getString(2131960780), new xq81(qvsVar, (byte) 20));
        }
        if (z3) {
            tgvVar.b = b8k1.a(constraintLayout, constraintLayout.getResources().getString(2131960779), new h5a1(qvsVar, (byte) 13));
        }
        b8k1.l(constraintLayout, tgvVar.c);
        b8k1.h(constraintLayout, 0);
        b8k1.l(constraintLayout, tgvVar.d);
        b8k1.h(constraintLayout, 0);
        b8k1.l(constraintLayout, tgvVar.e);
        b8k1.h(constraintLayout, 0);
        tgvVar.c = -1;
        tgvVar.d = -1;
        tgvVar.e = -1;
        if (!z6) {
            tgvVar.e = b8k1.a(constraintLayout, constraintLayout.getResources().getString(2131960783), i2x0.R0);
            b8k1.m(constraintLayout, fg.g, constraintLayout.getResources().getString(2131960783), (sh) null);
        } else if (!z6 || z7) {
            tgvVar.d = b8k1.a(constraintLayout, constraintLayout.getResources().getString(2131960799), new o2b1(qvsVar, (byte) 13));
        } else {
            tgvVar.c = b8k1.a(constraintLayout, constraintLayout.getResources().getString(2131960789), new y281(qvsVar, (byte) 23));
        }
        if (z4) {
            b8k1.a(constraintLayout, constraintLayout.getResources().getString(2131960753), new ep31(qvsVar, (byte) 29));
        }
        b8k1.l(constraintLayout, tgvVar.f);
        b8k1.h(constraintLayout, 0);
        tgvVar.f = -1;
        if (z5) {
            tgvVar.f = b8k1.a(constraintLayout, constraintLayout.getResources().getString(2131960782), new zb91(qvsVar, (byte) 17));
        }
        b8k1.a(constraintLayout, constraintLayout.getResources().getString(2131960786), new ezb1(qvsVar, (byte) 10));
        b8k1.m(viewFindViewById, fg.h, constraintLayout.getResources().getString(2131960757), (sh) null);
    }

    public final View getView() {
        return (ConstraintLayout) this.c.b;
    }

    public final void n(iu30 iu30Var) {
        this.e = new shs(iu30Var, (byte) 28);
        ((ConstraintLayout) this.c.b).setOnClickListener(new aqs(iu30Var, (byte) 10));
    }
}
