package p;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoreconsumermobile.elements.badge.contentrestriction.ContentRestrictionBadgeView;
import com.spotify.encoreconsumermobile.elements.badge.locked.LockedBadgeView;
import com.spotify.encoreconsumermobile.elements.badge.premium.PremiumBadgeView;
import com.spotify.encoreconsumermobile.elements.badge.video.VideoBadgeView;
import com.spotify.search.uiusecases.PlayIndicatorComposeView;
import com.spotify.search.uiusecases.actionbarsearch.ActionBarComplexRowSearchView;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class evs implements qzh, qad1 {
    public final Context a;
    public final gw70 b;
    public final ci4 c;
    public boolean d;
    public final uw0 e;
    public final v8o0 f;
    public final v8o0 g;

    public evs(Context context, gw70 gw70Var, ci4 ci4Var) {
        this.a = context;
        this.b = gw70Var;
        this.c = ci4Var;
        ConstraintLayout constraintLayoutInflate = LayoutInflater.from(context).inflate(2131626276, (ViewGroup) null, false);
        int i = 2131427445;
        ActionBarComplexRowSearchView actionBarComplexRowSearchView = (ActionBarComplexRowSearchView) m5n1.t(constraintLayoutInflate, 2131427445);
        if (actionBarComplexRowSearchView != null) {
            i = 2131427611;
            View view = (ArtworkView) m5n1.t(constraintLayoutInflate, 2131427611);
            if (view != null) {
                i = 2131427614;
                ComposeView composeViewT = m5n1.t(constraintLayoutInflate, 2131427614);
                if (composeViewT != null) {
                    i = 2131427741;
                    if (m5n1.t(constraintLayoutInflate, 2131427741) != null) {
                        i = 2131428537;
                        TextView textView = (TextView) m5n1.t(constraintLayoutInflate, 2131428537);
                        if (textView != null) {
                            i = 2131429846;
                            LockedBadgeView lockedBadgeViewT = m5n1.t(constraintLayoutInflate, 2131429846);
                            if (lockedBadgeViewT != null) {
                                i = 2131430403;
                                PlayIndicatorComposeView playIndicatorComposeView = (PlayIndicatorComposeView) m5n1.t(constraintLayoutInflate, 2131430403);
                                if (playIndicatorComposeView != null) {
                                    i = 2131430468;
                                    PremiumBadgeView premiumBadgeViewT = m5n1.t(constraintLayoutInflate, 2131430468);
                                    if (premiumBadgeViewT != null) {
                                        i = 2131430479;
                                        TextView textView2 = (TextView) m5n1.t(constraintLayoutInflate, 2131430479);
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
                                                        i = 2131431584;
                                                        VideoBadgeView videoBadgeViewT = m5n1.t(constraintLayoutInflate, 2131431584);
                                                        if (videoBadgeViewT != null) {
                                                            i = 2131431662;
                                                            TextView textView5 = (TextView) m5n1.t(constraintLayoutInflate, 2131431662);
                                                            if (textView5 != null) {
                                                                uw0 uw0Var = new uw0(constraintLayout, actionBarComplexRowSearchView, view, composeViewT, textView, lockedBadgeViewT, playIndicatorComposeView, premiumBadgeViewT, textView2, contentRestrictionBadgeViewT, textView3, textView4, videoBadgeViewT, textView5, (byte) 27);
                                                                constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                                                view.setViewContext(new f47(gw70Var));
                                                                v9w0 v9w0VarQ = b2u.q(constraintLayout);
                                                                Collections.addAll(v9w0VarQ.c, textView4, textView3);
                                                                Collections.addAll(v9w0VarQ.d, view);
                                                                v9w0VarQ.e = false;
                                                                v9w0VarQ.a();
                                                                view.setConstrainIconToSmallestDimension(true);
                                                                this.e = uw0Var;
                                                                this.f = new v8o0(constraintLayout.getContext(), 1);
                                                                this.g = new v8o0(constraintLayout.getContext(), 2);
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
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        throw null;
    }

    public final m9d1 a() {
        return this.g.c();
    }

    public final m9d1 b() {
        return this.f.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [android.view.View, com.spotify.search.uiusecases.PlayIndicatorComposeView] */
    /* JADX WARN: Type inference failed for: r9v8, types: [android.view.ViewGroup, com.spotify.search.uiusecases.actionbarsearch.ActionBarComplexRowSearchView] */
    public final void f(Object obj) {
        int i;
        int i2;
        String str;
        int i3;
        boolean z;
        int i4;
        char c;
        wlf1 wlf1Var = (wlf1) obj;
        int i5 = wlf1Var.f;
        boolean z2 = wlf1Var.i;
        String str2 = wlf1Var.X0;
        boolean z3 = wlf1Var.O0;
        List list = wlf1Var.W0;
        String str3 = wlf1Var.a;
        boolean z4 = wlf1Var.U0;
        boolean z5 = wlf1Var.S0;
        boolean z6 = wlf1Var.g;
        boolean z7 = wlf1Var.V0;
        boolean z8 = wlf1Var.N0;
        boolean z9 = wlf1Var.R0;
        boolean z10 = (z9 || z5) && z8;
        int iOrdinal = (z10 || (z8 && z4 && z7) ? this.c : ci4.b).ordinal();
        if (iOrdinal == 0) {
            i = 2131167170;
            i2 = 2131167170;
        } else if (iOrdinal != 1) {
            eg.o();
            return;
        } else {
            i = 2131167202;
            i2 = 2131167201;
        }
        uw0 uw0Var = this.e;
        ArtworkView artworkView = (ArtworkView) uw0Var.f;
        ?? r8 = (PlayIndicatorComposeView) uw0Var.t;
        ActionBarComplexRowSearchView actionBarComplexRowSearchView = (ActionBarComplexRowSearchView) uw0Var.e;
        TextView textView = (TextView) uw0Var.h;
        ComposeView composeView = (ComposeView) uw0Var.g;
        TextView textView2 = (TextView) uw0Var.O0;
        TextView textView3 = (TextView) uw0Var.b;
        ConstraintLayout constraintLayout = (ConstraintLayout) uw0Var.d;
        ViewGroup.LayoutParams layoutParams = artworkView.getLayoutParams();
        if (layoutParams == null) {
            bhn0.i("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            return;
        }
        layoutParams.width = constraintLayout.getContext().getResources().getDimensionPixelSize(i);
        layoutParams.height = constraintLayout.getContext().getResources().getDimensionPixelSize(i2);
        artworkView.setLayoutParams(layoutParams);
        textView3.setText(str3);
        textView3.setMaxLines(z5 ? 2 : 1);
        ((TextView) uw0Var.Z).setText(wlf1Var.b);
        TextView textView4 = (TextView) uw0Var.c;
        String str4 = wlf1Var.Q0;
        if (list.isEmpty()) {
            str = str2;
            str3 = str3;
            actionBarComplexRowSearchView = actionBarComplexRowSearchView;
            textView4.setText(str4);
            textView4.setTextAppearance(2132017723);
            textView4.setVisibility(!ihc1.y0(str4) ? 0 : 8);
        } else {
            if (z6) {
                textView4.setText(textView4.getResources().getText(2131961554));
                textView4.setTextAppearance(2132017723);
                str = str2;
            } else {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                Context context = this.a;
                spannableStringBuilder.append(f4i1.e(context.getString(2131961514), " "), new l0e1(context, 2132017723, -1), 33);
                for (Iterator it = list.iterator(); it.hasNext(); it = it) {
                    gp51 gp51Var = (gp51) it.next();
                    boolean z11 = gp51Var.b;
                    String str5 = gp51Var.a;
                    if (z11) {
                        c = '!';
                        spannableStringBuilder.append(str5, new l0e1(context, 2132017723, -1), 33);
                    } else {
                        c = '!';
                        spannableStringBuilder.append(str5, new l0e1(context, 2132017724, -1), 33);
                    }
                    str2 = str2;
                }
                str = str2;
                textView4.setText(new SpannedString(spannableStringBuilder));
            }
            textView4.setVisibility(0);
        }
        if (z8 && z7) {
            textView2.setVisibility(0);
            if (z4) {
                composeView.setVisibility(8);
                artworkView.setVisibility(0);
                artworkView.h(new s07(new g07((String) null, yz6.d), new rk70(2131231986)));
                i3 = 0;
                i4 = 8;
                z = true;
            } else {
                composeView.setViewCompositionStrategy(p5x0.W0);
                z = true;
                composeView.setContent(new j2i(1256455306, new g1o(wlf1Var, this, (byte) 23), true));
                i3 = 0;
                composeView.setVisibility(0);
                artworkView.setVisibility(4);
                i4 = 8;
            }
        } else {
            i3 = 0;
            z = true;
            i4 = 8;
            textView2.setVisibility(8);
            composeView.setVisibility(8);
            artworkView.setVisibility(0);
            artworkView.h(z10 ? new n17(r(wlf1Var)) : new g17(r(wlf1Var)));
        }
        ((LockedBadgeView) uw0Var.i).c(z3);
        ((ContentRestrictionBadgeView) uw0Var.Y).c(wlf1Var.e);
        ((PremiumBadgeView) uw0Var.X).c(wlf1Var.t);
        ((VideoBadgeView) uw0Var.N0).setVisibility((!z8 || z9 || z5) ? i4 : i3);
        textView.setVisibility((str.length() <= 0 || z7) ? i4 : i3);
        textView.setText(str);
        y10 y10Var = z2 ? new y10(wlf1Var.P0) : null;
        z10 z10Var = wlf1Var.X ? new z10(4) : null;
        ?? r9 = actionBarComplexRowSearchView;
        r9.f(new b20(str3, y10Var, z10Var != null ? z10Var.a : i3));
        boolean z12 = i5 != 3 ? z : i3;
        constraintLayout.setActivated(z12);
        constraintLayout.setSelected(z12);
        r8.setVisibility(z12 != 0 ? i3 : i4);
        r8.z(mno1.A(i5));
        boolean z13 = !z6;
        int i6 = i3;
        while (i6 < constraintLayout.getChildCount()) {
            int i7 = i6 + 1;
            View childAt = constraintLayout.getChildAt(i6);
            if (childAt == null) {
                tw20.p();
                return;
            } else {
                childAt.setEnabled(z13);
                i6 = i7;
            }
        }
        int i8 = i3;
        while (i8 < r9.getChildCount()) {
            int i9 = i8 + 1;
            View childAt2 = r9.getChildAt(i8);
            if (childAt2 == null) {
                tw20.p();
                return;
            } else {
                childAt2.setEnabled(z13);
                i8 = i9;
            }
        }
        this.f.b = wlf1Var.Z;
        this.g.b = (!z2 || z6 || z3 || z7) ? i3 : z;
        this.d = z6;
    }

    public final View getView() {
        return (ConstraintLayout) this.e.d;
    }

    public final void n(iu30 iu30Var) {
        uw0 uw0Var = this.e;
        ConstraintLayout constraintLayout = (ConstraintLayout) uw0Var.d;
        constraintLayout.setOnClickListener(new aqs(iu30Var, (byte) 5));
        constraintLayout.setOnLongClickListener(new n8r(this, iu30Var, (byte) 1));
        ((ActionBarComplexRowSearchView) uw0Var.e).n(new shs(iu30Var, (byte) 10));
        this.f.e = new hbs(iu30Var, (byte) 7);
        this.g.e = new hbs(iu30Var, (byte) 8);
    }

    public final g07 r(wlf1 wlf1Var) {
        boolean z = wlf1Var.g;
        String str = wlf1Var.c;
        if (z || wlf1Var.h || wlf1Var.V0) {
            str = null;
        } else if (!wlf1Var.T0 && wlf1Var.N0 && wlf1Var.R0 && this.c != ci4.b) {
            str = wlf1Var.d;
        }
        return new g07(str, yz6.d);
    }
}
