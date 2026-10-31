package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoreconsumermobile.elements.badge.contentrestriction.ContentRestrictionBadgeView;
import com.spotify.encoreconsumermobile.elements.badge.locked.LockedBadgeView;
import com.spotify.search.uiusecases.PlayIndicatorComposeView;
import com.spotify.search.uiusecases.actionbarsearch.ActionBarComplexRowSearchView;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xer implements qzh {
    public final Context a;
    public final boolean b;
    public final boolean c;
    public final em0 d;

    public xer(Context context, gw70 gw70Var, boolean z, boolean z2) {
        this.a = context;
        this.b = z;
        this.c = z2;
        ConstraintLayout constraintLayoutInflate = LayoutInflater.from(context).inflate(2131624033, (ViewGroup) null, false);
        int i = 2131427445;
        ActionBarComplexRowSearchView actionBarComplexRowSearchView = (ActionBarComplexRowSearchView) m5n1.t(constraintLayoutInflate, 2131427445);
        if (actionBarComplexRowSearchView != null) {
            i = 2131427611;
            View view = (ArtworkView) m5n1.t(constraintLayoutInflate, 2131427611);
            if (view != null) {
                i = 2131427682;
                if (m5n1.t(constraintLayoutInflate, 2131427682) != null) {
                    i = 2131427683;
                    if (((Space) m5n1.t(constraintLayoutInflate, 2131427683)) != null) {
                        i = 2131427741;
                        if (m5n1.t(constraintLayoutInflate, 2131427741) != null) {
                            i = 2131429846;
                            LockedBadgeView lockedBadgeViewT = m5n1.t(constraintLayoutInflate, 2131429846);
                            if (lockedBadgeViewT != null) {
                                i = 2131430403;
                                PlayIndicatorComposeView playIndicatorComposeView = (PlayIndicatorComposeView) m5n1.t(constraintLayoutInflate, 2131430403);
                                if (playIndicatorComposeView != null) {
                                    i = 2131430479;
                                    TextView textView = (TextView) m5n1.t(constraintLayoutInflate, 2131430479);
                                    if (textView != null) {
                                        i = 2131430631;
                                        TextView textView2 = (TextView) m5n1.t(constraintLayoutInflate, 2131430631);
                                        if (textView2 != null) {
                                            i = 2131430674;
                                            ContentRestrictionBadgeView contentRestrictionBadgeViewT = m5n1.t(constraintLayoutInflate, 2131430674);
                                            if (contentRestrictionBadgeViewT != null) {
                                                ConstraintLayout constraintLayout = constraintLayoutInflate;
                                                i = 2131431115;
                                                TextView textView3 = (TextView) m5n1.t(constraintLayoutInflate, 2131431115);
                                                if (textView3 != null) {
                                                    i = 2131431356;
                                                    TextView textView4 = (TextView) m5n1.t(constraintLayoutInflate, 2131431356);
                                                    if (textView4 != null) {
                                                        em0 em0Var = new em0(constraintLayout, actionBarComplexRowSearchView, view, lockedBadgeViewT, playIndicatorComposeView, textView, textView2, contentRestrictionBadgeViewT, textView3, textView4, (byte) 3);
                                                        view.setViewContext(new f47(gw70Var));
                                                        v9w0 v9w0VarQ = b2u.q(constraintLayout);
                                                        Collections.addAll(v9w0VarQ.c, textView4, textView3, textView2);
                                                        Collections.addAll(v9w0VarQ.d, view);
                                                        v9w0VarQ.a();
                                                        constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                                        this.d = em0Var;
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
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        throw null;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [android.view.View, android.view.ViewGroup, com.spotify.search.uiusecases.actionbarsearch.ActionBarComplexRowSearchView] */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.view.View, com.spotify.search.uiusecases.PlayIndicatorComposeView] */
    public final void f(Object obj) {
        c73 c73Var = (c73) obj;
        boolean z = c73Var.d;
        String str = c73Var.t;
        String str2 = c73Var.e;
        em0 em0Var = this.d;
        TextView textView = (TextView) em0Var.X;
        ?? r7 = (ActionBarComplexRowSearchView) em0Var.c;
        ArtworkView artworkView = (ArtworkView) em0Var.d;
        ?? r9 = (PlayIndicatorComposeView) em0Var.f;
        TextView textView2 = (TextView) em0Var.g;
        TextView textView3 = (TextView) em0Var.t;
        TextView textView4 = (TextView) em0Var.h;
        String str3 = c73Var.a;
        textView.setText(str3);
        int i = c73Var.g;
        textView.setActivated(i != 3);
        textView3.setText(c73Var.b);
        textView2.setVisibility(!ihc1.y0(str) ? 0 : 8);
        textView2.setText(str);
        ((ContentRestrictionBadgeView) em0Var.i).c(c73Var.i);
        r9.setVisibility(i != 3 ? 0 : 8);
        r9.z(mno1.A(i));
        textView4.setVisibility(str2 != null ? 0 : 8);
        if (str2 != null) {
            int length = str2.length();
            Context context = this.a;
            if (length == 0) {
                textView4.setText(context.getString(2131961548));
            } else {
                textView4.setText(context.getString(2131961547, str2));
            }
        }
        artworkView.h(new k07(new g07(z ? null : c73Var.c, yz6.d), false));
        y10 y10Var = (str2 == null || this.b) ? new y10(c73Var.f) : null;
        z10 z10Var = this.c ? new z10(1) : null;
        r7.f(new b20(str3, y10Var, z10Var != null ? z10Var.a : 0));
        ((LockedBadgeView) em0Var.e).c(c73Var.h);
        boolean z2 = !z;
        textView.setEnabled(z2);
        textView3.setEnabled(z2);
        artworkView.setEnabled(z2);
        textView4.setEnabled(z2);
        r7.setEnabled(z2);
        int i2 = 0;
        while (i2 < r7.getChildCount()) {
            int i3 = i2 + 1;
            View childAt = r7.getChildAt(i2);
            if (childAt == null) {
                tw20.p();
                return;
            } else {
                childAt.setEnabled(z2);
                i2 = i3;
            }
        }
    }

    public final View getView() {
        return (ConstraintLayout) this.d.b;
    }

    public final void n(iu30 iu30Var) {
        em0 em0Var = this.d;
        ((ConstraintLayout) em0Var.b).setOnClickListener(new v20(iu30Var, (byte) 29));
        ((ActionBarComplexRowSearchView) em0Var.c).n(new m0o(iu30Var, (byte) 6));
    }
}
