package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoreconsumermobile.elements.artistandaddedbyname.ArtistAndAddedByNameView;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoreconsumermobile.elements.badge.contentrestriction.ContentRestrictionBadgeView;
import com.spotify.encoreconsumermobile.elements.badge.enhanced.EnhancedBadgeView;
import com.spotify.encoreconsumermobile.elements.badge.queued.QueuedBadgeView;
import com.spotify.encoremobile.facepile.FacePileView;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class atr implements qzh {
    public final gw70 a;
    public final m980 b;
    public final pbq c;
    public final FacePileView d;
    public final int e;
    public final int f;
    public final hrr0 g;
    public final hrr0 h;
    public final znb0 i;

    public atr(Context context, gw70 gw70Var, m980 m980Var) {
        this.a = gw70Var;
        this.b = m980Var;
        ConstraintLayout constraintLayoutInflate = LayoutInflater.from(context).inflate(2131625115, (ViewGroup) null, false);
        int i = 2131427611;
        View view = (ArtworkView) m5n1.t(constraintLayoutInflate, 2131427611);
        if (view != null) {
            i = 2131428198;
            if (m5n1.t(constraintLayoutInflate, 2131428198) != null) {
                i = 2131428664;
                EnhancedBadgeView enhancedBadgeViewT = m5n1.t(constraintLayoutInflate, 2131428664);
                if (enhancedBadgeViewT != null) {
                    i = 2131428819;
                    if (m5n1.t(constraintLayoutInflate, 2131428819) != null) {
                        int i2 = 2131429989;
                        ComposeView composeViewT = m5n1.t(constraintLayoutInflate, 2131429989);
                        if (composeViewT != null) {
                            i2 = 2131430403;
                            ComposeView composeViewT2 = m5n1.t(constraintLayoutInflate, 2131430403);
                            if (composeViewT2 != null) {
                                i2 = 2131430570;
                                QueuedBadgeView queuedBadgeViewT = m5n1.t(constraintLayoutInflate, 2131430570);
                                if (queuedBadgeViewT != null) {
                                    i2 = 2131430674;
                                    ContentRestrictionBadgeView contentRestrictionBadgeViewT = m5n1.t(constraintLayoutInflate, 2131430674);
                                    if (contentRestrictionBadgeViewT != null) {
                                        i2 = 2131431115;
                                        View view2 = (ArtistAndAddedByNameView) m5n1.t(constraintLayoutInflate, 2131431115);
                                        if (view2 != null) {
                                            i2 = 2131431356;
                                            TextView textView = (TextView) m5n1.t(constraintLayoutInflate, 2131431356);
                                            if (textView != null) {
                                                ConstraintLayout constraintLayout = constraintLayoutInflate;
                                                i2 = 2131431584;
                                                FrameLayout frameLayout = (FrameLayout) m5n1.t(constraintLayoutInflate, 2131431584);
                                                if (frameLayout != null) {
                                                    this.c = new pbq((Object) constraintLayout, (Object) view, (Object) enhancedBadgeViewT, (Object) composeViewT, (Object) composeViewT2, (Object) queuedBadgeViewT, (Object) contentRestrictionBadgeViewT, (Object) view2, (Object) textView, (Object) frameLayout, (byte) 16);
                                                    this.d = constraintLayout.findViewById(2131428819);
                                                    this.e = context.getResources().getDimensionPixelSize(2131167170);
                                                    this.f = context.getResources().getDimensionPixelSize(2131167174);
                                                    this.g = v8r.q(zkt0.c);
                                                    this.h = v8r.q((Object) null);
                                                    this.i = dm5.S(3, new dor(this, (byte) 3));
                                                    constraintLayout.setFocusable(false);
                                                    constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                                    view.setViewContext(new f47(gw70Var));
                                                    composeViewT.setViewCompositionStrategy(p5x0.W0);
                                                    composeViewT.setContent(new j2i(-897967690, new nsr(this, (byte) 1), true));
                                                    textView.setTextColor(xfo1.r(constraintLayout, 2130970419));
                                                    v9w0 v9w0VarQ = b2u.q(constraintLayout);
                                                    Collections.addAll(v9w0VarQ.c, textView, view2);
                                                    Collections.addAll(v9w0VarQ.d, view);
                                                    v9w0VarQ.e = false;
                                                    v9w0VarQ.a();
                                                    zbs zbsVar = new zbs(context);
                                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) zbsVar.b.c;
                                                    zbsVar.a(new tan0(1, true));
                                                    constraintLayout2.setImportantForAccessibility(4);
                                                    frameLayout.addView(constraintLayout2);
                                                    composeViewT2.setContent(new j2i(1469924255, new nsr(this, (byte) 3), true));
                                                    return;
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
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        throw null;
    }

    public final void f(Object obj) {
        ano anoVar = (ano) obj;
        ((q4u) this.i.getValue()).a(anoVar);
        n1p1.p((ArtistAndAddedByNameView) this.c.c, anoVar.i, anoVar.j);
    }

    public final View getView() {
        return (ConstraintLayout) this.c.f;
    }

    public final void n(iu30 iu30Var) {
        ((ConstraintLayout) this.c.f).setOnClickListener(new trr(iu30Var, (byte) 2));
    }
}
