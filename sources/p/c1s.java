package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoreconsumermobile.elements.badge.contentrestriction.ContentRestrictionBadgeView;
import com.spotify.encoreconsumermobile.elements.badge.video.VideoBadgeView;
import com.spotify.encoreconsumermobile.elements.clearbutton.ClearButtonView;
import com.spotify.encoremobile.component.icons.IconLoadingIndicatorAlt;
import com.spotify.liveevents.uiusecases.concertentityheader.elements.CalendarIconView;
import com.spotify.search.uiusecases.actionbarsearch.ActionBarComplexRowSearchView;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class c1s implements qad1, qzh {
    public final gw70 a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final wj3 f;
    public final v8o0 g;
    public final v8o0 h;
    public CalendarIconView i;

    public c1s(Context context, gw70 gw70Var, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = gw70Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        ConstraintLayout constraintLayoutInflate = LayoutInflater.from(context).inflate(2131625078, (ViewGroup) null, false);
        int i = 2131427445;
        ActionBarComplexRowSearchView actionBarComplexRowSearchView = (ActionBarComplexRowSearchView) m5n1.t(constraintLayoutInflate, 2131427445);
        if (actionBarComplexRowSearchView != null) {
            i = 2131427553;
            TextView textView = (TextView) m5n1.t(constraintLayoutInflate, 2131427553);
            if (textView != null) {
                i = 2131427611;
                View view = (ArtworkView) m5n1.t(constraintLayoutInflate, 2131427611);
                if (view != null) {
                    i = 2131427614;
                    ComposeView composeViewT = m5n1.t(constraintLayoutInflate, 2131427614);
                    if (composeViewT != null) {
                        i = 2131428165;
                        ViewStub viewStub = (ViewStub) m5n1.t(constraintLayoutInflate, 2131428165);
                        if (viewStub != null) {
                            i = 2131428537;
                            TextView textView2 = (TextView) m5n1.t(constraintLayoutInflate, 2131428537);
                            if (textView2 != null) {
                                i = 2131429056;
                                if (m5n1.t(constraintLayoutInflate, 2131429056) != null) {
                                    i = 2131429706;
                                    IconLoadingIndicatorAlt iconLoadingIndicatorAltT = m5n1.t(constraintLayoutInflate, 2131429706);
                                    if (iconLoadingIndicatorAltT != null) {
                                        i = 2131430647;
                                        ClearButtonView clearButtonViewT = m5n1.t(constraintLayoutInflate, 2131430647);
                                        if (clearButtonViewT != null) {
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
                                                        i = 2131431572;
                                                        ImageView imageView = (ImageView) m5n1.t(constraintLayoutInflate, 2131431572);
                                                        if (imageView != null) {
                                                            i = 2131431584;
                                                            VideoBadgeView videoBadgeViewT = m5n1.t(constraintLayoutInflate, 2131431584);
                                                            if (videoBadgeViewT != null) {
                                                                i = 2131431662;
                                                                TextView textView5 = (TextView) m5n1.t(constraintLayoutInflate, 2131431662);
                                                                if (textView5 != null) {
                                                                    wj3 wj3Var = new wj3(constraintLayout, actionBarComplexRowSearchView, textView, view, composeViewT, viewStub, textView2, iconLoadingIndicatorAltT, clearButtonViewT, contentRestrictionBadgeViewT, textView3, textView4, imageView, videoBadgeViewT, textView5, (byte) 14);
                                                                    view.setViewContext(new f47(gw70Var));
                                                                    v9w0 v9w0VarQ = b2u.q(constraintLayout);
                                                                    Collections.addAll(v9w0VarQ.c, textView4, textView3);
                                                                    Collections.addAll(v9w0VarQ.d, view);
                                                                    v9w0VarQ.a();
                                                                    constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                                                    view.setConstrainIconToSmallestDimension(true);
                                                                    this.f = wj3Var;
                                                                    this.g = new v8o0(constraintLayout.getContext(), 1);
                                                                    this.h = new v8o0(constraintLayout.getContext(), 2);
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
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        throw null;
    }

    public final m9d1 a() {
        return this.h.c();
    }

    public final m9d1 b() {
        return this.g.c();
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [android.view.View, android.view.ViewGroup, com.spotify.search.uiusecases.actionbarsearch.ActionBarComplexRowSearchView] */
    public final void f(Object obj) {
        int i;
        int i2;
        int i3;
        String str;
        int i4;
        int i5;
        boolean z;
        bk60 bk60Var = (bk60) obj;
        boolean z2 = bk60Var.X;
        String str2 = bk60Var.Z0;
        boolean z3 = bk60Var.U0;
        CharSequence charSequence = bk60Var.b;
        String str3 = bk60Var.a;
        ck60 ck60Var = bk60Var.e;
        int i6 = bk60Var.T0;
        String str4 = bk60Var.d;
        boolean z4 = bk60Var.X0;
        boolean z5 = str4 == null || ihc1.y0(str4);
        if ((i6 != 1 || z5) && !z4) {
            i = 2131167170;
            i2 = 2131167170;
        } else {
            i = 2131167202;
            i2 = 2131167201;
        }
        wj3 wj3Var = this.f;
        ArtworkView artworkView = (ArtworkView) wj3Var.e;
        ClearButtonView clearButtonView = (ClearButtonView) wj3Var.t;
        IconLoadingIndicatorAlt iconLoadingIndicatorAlt = (IconLoadingIndicatorAlt) wj3Var.i;
        ContentRestrictionBadgeView contentRestrictionBadgeView = (ContentRestrictionBadgeView) wj3Var.X;
        TextView textView = (TextView) wj3Var.Z;
        TextView textView2 = (TextView) wj3Var.Y;
        TextView textView3 = (TextView) wj3Var.h;
        TextView textView4 = (TextView) wj3Var.P0;
        ?? r4 = (ActionBarComplexRowSearchView) wj3Var.c;
        ConstraintLayout constraintLayout = (ConstraintLayout) wj3Var.b;
        ViewGroup.LayoutParams layoutParams = artworkView.getLayoutParams();
        if (layoutParams == null) {
            bhn0.i("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            return;
        }
        layoutParams.width = constraintLayout.getContext().getResources().getDimensionPixelSize(i);
        layoutParams.height = constraintLayout.getContext().getResources().getDimensionPixelSize(i2);
        artworkView.setLayoutParams(layoutParams);
        ComposeView composeView = (ComposeView) wj3Var.f;
        textView4.setVisibility(z4 ? 0 : 8);
        textView.setText(str3);
        textView2.setText(charSequence);
        textView2.setVisibility(charSequence.length() > 0 ? 0 : 8);
        yj60 yj60Var = bk60Var.a1;
        if (ck60Var != ck60.Y || yj60Var == null) {
            i3 = 0;
            CalendarIconView calendarIconView = this.i;
            if (calendarIconView != null) {
                calendarIconView.setVisibility(8);
            }
        } else {
            CalendarIconView calendarIconView2 = this.i;
            if (calendarIconView2 == null) {
                calendarIconView2 = (CalendarIconView) ((ViewStub) wj3Var.g).inflate();
                this.i = calendarIconView2;
            }
            calendarIconView2.c(new xwc(124, (Integer) null, (Integer) null, yj60Var.a, yj60Var.b, false));
            i3 = 0;
            calendarIconView2.setVisibility(0);
        }
        if (!z3 || z4) {
            r4.setVisibility(8);
        } else {
            r4.setVisibility(i3);
            r4.f(new b20(str3, new y10(bk60Var.V0), i3));
        }
        xz6 xz6Var = bk60Var.Y ? xz6.d : yz6.d;
        if (bk60Var.t || z4) {
            str = null;
        } else {
            str = (i6 == 2 || str4 == null || ihc1.y0(str4)) ? bk60Var.c : str4;
        }
        g07 g07Var = new g07(str, xz6Var);
        s07 s07Var = new s07(g07Var, new rk70(2131231986));
        int iC = l1d.C(bk60Var.Y0);
        if (iC == 0) {
            i4 = 8;
            composeView.setVisibility(8);
            artworkView.setVisibility(0);
            switch (ck60Var.ordinal()) {
                case 0:
                case 13:
                    i5 = 0;
                    artworkView.h(new e17(g07Var));
                    break;
                case 1:
                    i5 = 0;
                    artworkView.h(bk60Var.O0 ? new n17(g07Var) : new g17(g07Var));
                    break;
                case 2:
                    i5 = 0;
                    artworkView.h(new l07(g07Var, false));
                    break;
                case 3:
                    artworkView.h(new j17(str3, str3, g07Var));
                    i5 = 0;
                    break;
                case 4:
                    artworkView.h(new p07(g07Var));
                    i5 = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 12:
                case 14:
                    artworkView.h(new g17(g07Var));
                    i5 = 0;
                    break;
                case 10:
                    artworkView.h(new m17(g07Var));
                    i5 = 0;
                    break;
                case 11:
                    artworkView.h(new g17(g07Var));
                    i5 = 0;
                    break;
                default:
                    eg.o();
                    break;
            }
            return;
        }
        if (iC == 1) {
            composeView.setViewCompositionStrategy(p5x0.W0);
            composeView.setContent(new j2i(-1974115483, new g1o(bk60Var, this, (byte) 18), true));
            i5 = 0;
            composeView.setVisibility(0);
            artworkView.setVisibility(4);
        } else {
            if (iC != 2) {
                eg.o();
                return;
            }
            composeView.setVisibility(8);
            artworkView.setVisibility(0);
            artworkView.h(s07Var);
            i5 = 0;
        }
        i4 = 8;
        textView3.setVisibility((str2.length() <= 0 || z4) ? i4 : i5);
        textView3.setText(str2);
        contentRestrictionBadgeView.c(bk60Var.h);
        iconLoadingIndicatorAlt.setVisibility((ck60Var == ck60.Z && bk60Var.f) ? i5 : i4);
        ((VideoBadgeView) wj3Var.O0).setVisibility(bk60Var.P0 ? 0 : 8);
        boolean z6 = bk60Var.g != 3;
        constraintLayout.setActivated(z6);
        constraintLayout.setSelected(z6);
        boolean z7 = !bk60Var.i;
        textView.setEnabled(z7);
        textView2.setEnabled(z7);
        artworkView.setEnabled(z7);
        contentRestrictionBadgeView.setEnabled(z7);
        iconLoadingIndicatorAlt.setEnabled(z7);
        textView4.setEnabled(z7);
        textView3.setEnabled(z7);
        boolean z8 = !z2;
        r4.setEnabled(z8);
        int i7 = 0;
        while (i7 < r4.getChildCount()) {
            int i8 = i7 + 1;
            View childAt = r4.getChildAt(i7);
            if (childAt == null) {
                tw20.p();
                return;
            } else {
                childAt.setEnabled(z8);
                i7 = i8;
            }
        }
        this.g.b = bk60Var.Z;
        this.h.b = ck60Var == ck60.b && z3 && !z2 && !z4;
        boolean z9 = (bk60Var.R0 && this.d) || (bk60Var.S0 && this.e);
        ((TextView) wj3Var.d).setVisibility(z9 ? 0 : 8);
        ImageView imageView = (ImageView) wj3Var.N0;
        boolean z10 = bk60Var.Q0 && !z9;
        int iOrdinal = ck60Var.ordinal();
        if (iOrdinal != 2) {
            z = iOrdinal != 6 ? false : this.c;
        } else {
            z = this.b;
        }
        cwl1.c0(imageView, z10, z);
        clearButtonView.setContentDescription(constraintLayout.getContext().getString(2131956575, str3));
        b8k1.p(clearButtonView, new zdc((byte) 2));
    }

    public final View getView() {
        return (ConstraintLayout) this.f.b;
    }

    public final void n(iu30 iu30Var) {
        wj3 wj3Var = this.f;
        ((ConstraintLayout) wj3Var.b).setOnClickListener(new o0s(iu30Var, (byte) 2));
        ((ActionBarComplexRowSearchView) wj3Var.c).n(new mwr(iu30Var, (byte) 15));
        ((ClearButtonView) wj3Var.t).setOnClickListener(new o0s(iu30Var, (byte) 3));
        this.g.e = new qzn(iu30Var, (byte) 23);
        this.h.e = new qzn(iu30Var, (byte) 24);
    }
}
