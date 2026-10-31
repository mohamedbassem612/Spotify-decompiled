package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoreconsumermobile.elements.badge.contentrestriction.ContentRestrictionBadgeView;
import com.spotify.search.uiusecases.actionbarsearch.ActionBarComplexRowSearchView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lxr implements qzh {
    public final Context a;
    public final bi4 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final uw0 g;

    public lxr(Context context, gw70 gw70Var, bi4 bi4Var, boolean z, boolean z2, boolean z3) {
        this.a = context;
        this.b = bi4Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z3 ? 3 : 2;
        ConstraintLayout constraintLayoutInflate = LayoutInflater.from(context).inflate(2131624600, (ViewGroup) null, false);
        int i = 2131427445;
        ActionBarComplexRowSearchView actionBarComplexRowSearchView = (ActionBarComplexRowSearchView) m5n1.t(constraintLayoutInflate, 2131427445);
        if (actionBarComplexRowSearchView != null) {
            i = 2131427611;
            View view = (ArtworkView) m5n1.t(constraintLayoutInflate, 2131427611);
            if (view != null) {
                i = 2131427741;
                if (m5n1.t(constraintLayoutInflate, 2131427741) != null) {
                    i = 2131428438;
                    TextView textView = (TextView) m5n1.t(constraintLayoutInflate, 2131428438);
                    if (textView != null) {
                        i = 2131428444;
                        TextView textView2 = (TextView) m5n1.t(constraintLayoutInflate, 2131428444);
                        if (textView2 != null) {
                            i = 2131428445;
                            View viewT = m5n1.t(constraintLayoutInflate, 2131428445);
                            if (viewT != null) {
                                i = 2131428537;
                                TextView textView3 = (TextView) m5n1.t(constraintLayoutInflate, 2131428537);
                                if (textView3 != null) {
                                    i = 2131429139;
                                    TextView textView4 = (TextView) m5n1.t(constraintLayoutInflate, 2131429139);
                                    if (textView4 != null) {
                                        i = 2131429973;
                                        TextView textView5 = (TextView) m5n1.t(constraintLayoutInflate, 2131429973);
                                        if (textView5 != null) {
                                            i = 2131430674;
                                            ContentRestrictionBadgeView contentRestrictionBadgeViewT = m5n1.t(constraintLayoutInflate, 2131430674);
                                            if (contentRestrictionBadgeViewT != null) {
                                                i = 2131430675;
                                                ContentRestrictionBadgeView contentRestrictionBadgeViewT2 = m5n1.t(constraintLayoutInflate, 2131430675);
                                                if (contentRestrictionBadgeViewT2 != null) {
                                                    ConstraintLayout constraintLayout = constraintLayoutInflate;
                                                    i = 2131431115;
                                                    TextView textView6 = (TextView) m5n1.t(constraintLayoutInflate, 2131431115);
                                                    if (textView6 != null) {
                                                        i = 2131431356;
                                                        TextView textView7 = (TextView) m5n1.t(constraintLayoutInflate, 2131431356);
                                                        if (textView7 != null) {
                                                            i = 2131431662;
                                                            TextView textView8 = (TextView) m5n1.t(constraintLayoutInflate, 2131431662);
                                                            if (textView8 != null) {
                                                                uw0 uw0Var = new uw0(constraintLayout, actionBarComplexRowSearchView, view, textView, textView2, viewT, textView3, textView4, textView5, contentRestrictionBadgeViewT, contentRestrictionBadgeViewT2, textView6, textView7, textView8, (byte) 18);
                                                                view.setViewContext(new f47(gw70Var));
                                                                v9w0 v9w0VarQ = b2u.q(constraintLayout);
                                                                ArrayList arrayList = v9w0VarQ.c;
                                                                Collections.addAll(arrayList, textView7);
                                                                Collections.addAll(arrayList, textView6);
                                                                Collections.addAll(arrayList, textView5);
                                                                Collections.addAll(arrayList, textView4);
                                                                Collections.addAll(arrayList, textView);
                                                                Collections.addAll(v9w0VarQ.d, view);
                                                                v9w0VarQ.e = false;
                                                                v9w0VarQ.a();
                                                                constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                                                this.g = uw0Var;
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

    public final SpannedString a(t2z t2zVar, String str) {
        int iB0;
        String str2 = t2zVar.i;
        smc0 smc0VarN = k4p1.n();
        if (this.e) {
            smc0VarN.add(str);
        }
        smc0VarN.add(str2);
        String strK0 = bmq0.k0(k4p1.k(smc0VarN));
        if (str2.length() == 0) {
            iB0 = strK0.length();
        } else {
            iB0 = ihc1.h0(strK0, "•", false) ? ihc1.B0(strK0, " • ", 0, 6) + 2 : 0;
        }
        return b(p7h.M(new gp51[]{new gp51(strK0.substring(0, iB0), true), new gp51(strK0.substring(iB0), false)}));
    }

    public final SpannedString b(List list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            gp51 gp51Var = (gp51) it.next();
            spannableStringBuilder.append(gp51Var.a, new l0e1(this.a, gp51Var.b ? 2132017505 : 2132017507, -1), 33);
        }
        return new SpannedString(spannableStringBuilder);
    }

    /* JADX WARN: Type inference failed for: r11v2, types: [android.view.View, android.view.ViewGroup, com.spotify.search.uiusecases.actionbarsearch.ActionBarComplexRowSearchView] */
    public final void f(Object obj) {
        int i;
        int i2;
        String str;
        TextView textView;
        ViewGroup viewGroup;
        int i3;
        int i4;
        int i5;
        int i6;
        t2z t2zVar = (t2z) obj;
        uw0 uw0Var = this.g;
        ArtworkView artworkView = (ArtworkView) uw0Var.f;
        String str2 = t2zVar.P0;
        k4m k4mVar = t2zVar.g;
        String str3 = t2zVar.e;
        String str4 = t2zVar.b;
        ArrayList arrayList = t2zVar.t;
        String str5 = t2zVar.d;
        boolean z = t2zVar.h;
        String str6 = t2zVar.Z;
        boolean z2 = t2zVar.O0;
        boolean z3 = t2zVar.X && (!(str6 == null || str6.length() == 0) || z2);
        Enum r14 = bi4.b;
        Enum r15 = this.b;
        int iOrdinal = (z3 ? r15 : r14).ordinal();
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
        ?? r11 = (ActionBarComplexRowSearchView) uw0Var.e;
        TextView textView2 = (TextView) uw0Var.t;
        ContentRestrictionBadgeView contentRestrictionBadgeView = (ContentRestrictionBadgeView) uw0Var.Z;
        ContentRestrictionBadgeView contentRestrictionBadgeView2 = (ContentRestrictionBadgeView) uw0Var.Y;
        TextView textView3 = (TextView) uw0Var.g;
        TextView textView4 = (TextView) uw0Var.b;
        TextView textView5 = (TextView) uw0Var.X;
        TextView textView6 = (TextView) uw0Var.c;
        TextView textView7 = (TextView) uw0Var.N0;
        ViewGroup viewGroup2 = (ConstraintLayout) uw0Var.d;
        ViewGroup.LayoutParams layoutParams = artworkView.getLayoutParams();
        if (layoutParams == null) {
            bhn0.i("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            return;
        }
        layoutParams.width = viewGroup2.getContext().getResources().getDimensionPixelSize(i);
        layoutParams.height = viewGroup2.getContext().getResources().getDimensionPixelSize(i2);
        artworkView.setLayoutParams(layoutParams);
        ((TextView) uw0Var.O0).setVisibility(z2 ? 0 : 8);
        if (z != 0 || z2) {
            str = null;
        } else {
            str = (str6 == null || str6.length() == 0 || r15 == r14) ? t2zVar.f : str6;
        }
        g07 g07Var = new g07(str, yz6.d);
        artworkView.h(z2 ? new s07(g07Var, new rk70(2131231986)) : new e17(g07Var));
        if (arrayList.isEmpty()) {
            textView5.setVisibility(8);
            textView7.setMaxLines(2);
        } else {
            textView5.setVisibility(0);
            textView5.setText(b(arrayList));
            textView7.setMaxLines(1);
        }
        textView7.setText(str4);
        textView4.setText(t2zVar.c);
        SpannedString spannedStringA = a(t2zVar, str5);
        SpannedString spannedStringA2 = a(t2zVar, str3);
        boolean z4 = this.c;
        int i7 = this.f;
        if (!z4 || z) {
            textView = textView3;
            viewGroup = viewGroup2;
            viewGroup.post(new a6n(this, (byte) 5));
        } else {
            boolean z5 = t2zVar.N0;
            if (z5) {
                i6 = 2131961502;
                i5 = 12;
            } else {
                i5 = i7;
                i6 = 2131961501;
            }
            TextView textView8 = (TextView) uw0Var.h;
            textView8.setText(textView8.getContext().getString(i6));
            int[] iArr = new int[2];
            textView8.getLocationInWindow(iArr);
            int i8 = iArr[0];
            int i9 = iArr[1];
            int width = textView8.getWidth() + i8;
            int height = textView8.getHeight() + i9;
            DisplayMetrics displayMetrics = textView8.getResources().getDisplayMetrics();
            int i10 = displayMetrics.widthPixels;
            int i11 = displayMetrics.heightPixels;
            boolean z6 = i8 == 0;
            boolean z7 = i9 == 0;
            boolean z8 = width == i10;
            boolean z9 = height == i11;
            if (z6 || z7 || z8 || z9 || (textView8.getImeOptions() & 255) != 6) {
            }
            textView8.post(new ai(textView8, (byte) 0));
            textView = textView3;
            textView.addOnLayoutChangeListener(new kxr(this, z5));
            i7 = i5;
            viewGroup = viewGroup2;
        }
        textView.setMaxLines(i7);
        textView.setText(spannedStringA);
        textView.setContentDescription(spannedStringA2);
        textView.setVisibility(!ihc1.y0(spannedStringA) ? 0 : 8);
        boolean z10 = this.e;
        if (z10) {
            i3 = 8;
            contentRestrictionBadgeView2.setVisibility(8);
            contentRestrictionBadgeView.setVisibility(0);
            contentRestrictionBadgeView.c(k4mVar);
        } else {
            i3 = 8;
            contentRestrictionBadgeView2.setVisibility(0);
            contentRestrictionBadgeView2.c(k4mVar);
            contentRestrictionBadgeView.setVisibility(8);
        }
        textView6.setText(str5);
        textView6.setContentDescription(str3);
        textView6.setVisibility((ihc1.y0(str5) || z10) ? i3 : 0);
        textView2.setVisibility((str2.length() <= 0 || z2) ? i3 : 0);
        textView2.setText(str2);
        y10 y10Var = new y10(t2zVar.Y);
        z10 z10Var = this.d ? new z10(5) : null;
        r11.f(new b20(str4, y10Var, z10Var != null ? z10Var.a : 0));
        boolean z11 = !z;
        int i12 = 0;
        while (i12 < viewGroup.getChildCount()) {
            int i13 = i12 + 1;
            View childAt = viewGroup.getChildAt(i12);
            if (childAt == null) {
                tw20.p();
                return;
            } else {
                childAt.setEnabled(z11);
                i12 = i13;
            }
        }
        if (textView4.getCompoundDrawables().length == 0) {
            i4 = 0;
        } else {
            i4 = 0;
            Drawable drawable = textView4.getCompoundDrawables()[0];
            if (drawable != null) {
                drawable.setTint(textView4.getCurrentTextColor());
            }
        }
        r11.setEnabled(z11);
        int i14 = i4;
        while (i14 < r11.getChildCount()) {
            int i15 = i14 + 1;
            View childAt2 = r11.getChildAt(i14);
            if (childAt2 == null) {
                tw20.p();
                return;
            } else {
                childAt2.setEnabled(z11);
                i14 = i15;
            }
        }
    }

    public final View getView() {
        return (ConstraintLayout) this.g.d;
    }

    public final void n(iu30 iu30Var) {
        uw0 uw0Var = this.g;
        ((ConstraintLayout) uw0Var.d).setOnClickListener(new trr(iu30Var, (byte) 11));
        ((ActionBarComplexRowSearchView) uw0Var.e).n(new mwr(iu30Var, (byte) 8));
        ((TextView) uw0Var.h).setOnClickListener(new trr(iu30Var, (byte) 12));
    }
}
