package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoreconsumermobile.elements.badge.contentrestriction.ContentRestrictionBadgeView;
import com.spotify.encoreconsumermobile.elements.badge.locked.LockedBadgeView;
import com.spotify.search.uiusecases.PlayIndicatorComposeView;
import com.spotify.search.uiusecases.actionbarsearch.ActionBarComplexRowSearchView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class afr implements qzh {
    public final /* synthetic */ byte a;
    public final boolean b;
    public final ai4 c;
    public final oq51 d;
    public final Object e;
    public final Object f;

    /* JADX WARN: Code duplicated, block: B:23:0x00e2 A[PHI: r3
      0x00e2: PHI (r3v18 int) = (r3v17 int), (r3v19 int) binds: [B:11:0x006c, B:13:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    public afr(Context context, gw70 gw70Var, boolean z, ai4 ai4Var, byte b) {
        this.a = b;
        int i = 2131431356;
        switch (b) {
            case 2:
                this.b = z;
                this.c = ai4Var;
                this.d = new oq51(context);
                ConstraintLayout constraintLayoutInflate = LayoutInflater.from(context).inflate(2131625417, (ViewGroup) null, false);
                ActionBarComplexRowSearchView actionBarComplexRowSearchView = (ActionBarComplexRowSearchView) m5n1.t(constraintLayoutInflate, 2131427445);
                if (actionBarComplexRowSearchView != null) {
                    View view = (ArtworkView) m5n1.t(constraintLayoutInflate, 2131427611);
                    if (view == null) {
                        i = 2131427611;
                    } else if (m5n1.t(constraintLayoutInflate, 2131427741) != null) {
                        ConstraintLayout constraintLayout = constraintLayoutInflate;
                        TextView textView = (TextView) m5n1.t(constraintLayoutInflate, 2131431115);
                        if (textView != null) {
                            TextView textView2 = (TextView) m5n1.t(constraintLayoutInflate, 2131431356);
                            if (textView2 != null) {
                                ytp0 ytp0Var = new ytp0(constraintLayout, actionBarComplexRowSearchView, view, textView, textView2, (byte) 16);
                                view.setViewContext(new f47(gw70Var));
                                v9w0 v9w0VarP = b2u.p(constraintLayout);
                                Collections.addAll(v9w0VarP.c, textView2, textView);
                                Collections.addAll(v9w0VarP.d, view);
                                v9w0VarP.a();
                                constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                this.e = ytp0Var;
                                this.f = textView.getTextColors();
                                return;
                            }
                        } else {
                            i = 2131431115;
                        }
                    } else {
                        i = 2131427741;
                    }
                } else {
                    i = 2131427445;
                }
                bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
                throw null;
            default:
                this.e = context;
                this.b = z;
                this.c = ai4Var;
                this.d = new oq51(context);
                ConstraintLayout constraintLayoutInflate2 = LayoutInflater.from(context).inflate(2131624035, (ViewGroup) null, false);
                ActionBarComplexRowSearchView actionBarComplexRowSearchView2 = (ActionBarComplexRowSearchView) m5n1.t(constraintLayoutInflate2, 2131427445);
                if (actionBarComplexRowSearchView2 != null) {
                    View view2 = (ArtworkView) m5n1.t(constraintLayoutInflate2, 2131427611);
                    if (view2 == null) {
                        i = 2131427611;
                    } else if (m5n1.t(constraintLayoutInflate2, 2131427741) != null) {
                        int i2 = 2131429846;
                        LockedBadgeView lockedBadgeViewT = m5n1.t(constraintLayoutInflate2, 2131429846);
                        if (lockedBadgeViewT != null) {
                            i2 = 2131430674;
                            ContentRestrictionBadgeView contentRestrictionBadgeViewT = m5n1.t(constraintLayoutInflate2, 2131430674);
                            if (contentRestrictionBadgeViewT != null) {
                                ConstraintLayout constraintLayout2 = constraintLayoutInflate2;
                                TextView textView3 = (TextView) m5n1.t(constraintLayoutInflate2, 2131431115);
                                if (textView3 != null) {
                                    TextView textView4 = (TextView) m5n1.t(constraintLayoutInflate2, 2131431356);
                                    if (textView4 != null) {
                                        i = 2131431550;
                                        TextView textView5 = (TextView) m5n1.t(constraintLayoutInflate2, 2131431550);
                                        if (textView5 != null) {
                                            kp5 kp5Var = new kp5(constraintLayout2, actionBarComplexRowSearchView2, view2, lockedBadgeViewT, contentRestrictionBadgeViewT, textView3, textView4, textView5);
                                            constraintLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                            view2.setViewContext(new f47(gw70Var));
                                            v9w0 v9w0VarQ = b2u.q(constraintLayout2);
                                            Collections.addAll(v9w0VarQ.c, textView4, textView3, textView5);
                                            Collections.addAll(v9w0VarQ.d, view2);
                                            v9w0VarQ.e = false;
                                            v9w0VarQ.a();
                                            this.f = kp5Var;
                                            return;
                                        }
                                    }
                                } else {
                                    i = 2131431115;
                                }
                            } else {
                                i = i2;
                            }
                        } else {
                            i = i2;
                        }
                    } else {
                        i = 2131427741;
                    }
                } else {
                    i = 2131427445;
                }
                bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate2.getResources().getResourceName(i)));
                throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [android.view.View, android.view.ViewGroup, com.spotify.search.uiusecases.actionbarsearch.ActionBarComplexRowSearchView] */
    /* JADX WARN: Type inference failed for: r14v4, types: [android.view.View, android.view.ViewGroup, com.spotify.search.uiusecases.actionbarsearch.ActionBarComplexRowSearchView] */
    /* JADX WARN: Type inference failed for: r14v6, types: [android.view.View, com.spotify.search.uiusecases.PlayIndicatorComposeView] */
    public final void f(Object obj) {
        CharSequence spannedString;
        int i;
        int i2;
        byte b = this.a;
        boolean z = this.b;
        yz6 yz6Var = yz6.d;
        Object obj2 = this.f;
        ai4 ai4Var = this.c;
        oq51 oq51Var = this.d;
        Object obj3 = this.e;
        switch (b) {
            case 0:
                ag3 ag3Var = (ag3) obj;
                Context context = (Context) obj3;
                String str = ag3Var.a;
                boolean z2 = ag3Var.d;
                String str2 = ag3Var.e;
                kp5 kp5Var = (kp5) obj2;
                TextView textView = (TextView) kp5Var.g;
                LockedBadgeView lockedBadgeView = (LockedBadgeView) kp5Var.d;
                ArtworkView artworkView = (ArtworkView) kp5Var.c;
                ?? r12 = (ActionBarComplexRowSearchView) kp5Var.b;
                TextView textView2 = (TextView) kp5Var.f;
                TextView textView3 = (TextView) kp5Var.h;
                List list = ag3Var.i;
                textView.setText(!list.isEmpty() ? oq51Var.a(list, true, ai4Var) : str);
                String str3 = ag3Var.t;
                String str4 = ag3Var.b;
                if (ihc1.y0(str3)) {
                    spannedString = str4;
                } else {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) bmq0.k0(p7h.M(new String[]{str3, str4})));
                    spannableStringBuilder.setSpan(new StyleSpan(1), 0, str3.length(), 34);
                    spannedString = new SpannedString(spannableStringBuilder);
                }
                textView2.setText(spannedString);
                ((ContentRestrictionBadgeView) kp5Var.e).c(ag3Var.g);
                textView3.setVisibility(str2 != 0 ? 0 : 8);
                if (str2 != 0) {
                    if (str2.length() == 0) {
                        textView3.setText(context.getString(2131961548));
                    } else {
                        textView3.setText(context.getString(2131961547, str2));
                    }
                }
                r12.f(new b20(str, z ? new y10(ag3Var.h) : null, 0));
                artworkView.h(new k07(new g07(z2 != 0 ? null : ag3Var.c, yz6Var), false));
                lockedBadgeView.c(ag3Var.f);
                boolean z3 = !z2;
                textView.setEnabled(z3);
                textView2.setEnabled(z3);
                artworkView.setEnabled(z3);
                textView3.setEnabled(z3);
                lockedBadgeView.setEnabled(z3);
                r12.setEnabled(z3);
                int i3 = 0;
                while (i3 < r12.getChildCount()) {
                    int i4 = i3 + 1;
                    View childAt = r12.getChildAt(i3);
                    if (childAt == null) {
                        tw20.p();
                    } else {
                        childAt.setEnabled(z3);
                        i3 = i4;
                    }
                    break;
                }
                break;
            case 1:
                fbz fbzVar = (fbz) obj;
                Enum r0 = (bi4) obj3;
                pbq pbqVar = (pbq) obj2;
                String str5 = fbzVar.a;
                List list2 = fbzVar.X;
                String str6 = fbzVar.Z;
                boolean z4 = fbzVar.f;
                String str7 = fbzVar.c;
                int i5 = fbzVar.t;
                String str8 = fbzVar.g;
                boolean z5 = fbzVar.Y;
                boolean z6 = fbzVar.h && (!(str8 == null || str8.length() == 0) || z5);
                Enum r3 = bi4.b;
                int iOrdinal = (z6 ? r0 : r3).ordinal();
                if (iOrdinal == 0) {
                    i = 2131167170;
                    i2 = 2131167170;
                } else if (iOrdinal != 1) {
                    eg.o();
                } else {
                    i = 2131167202;
                    i2 = 2131167201;
                }
                ArtworkView artworkView2 = (ArtworkView) pbqVar.g;
                ?? r14 = (ActionBarComplexRowSearchView) pbqVar.b;
                ?? r15 = (PlayIndicatorComposeView) pbqVar.t;
                ContentRestrictionBadgeView contentRestrictionBadgeView = (ContentRestrictionBadgeView) pbqVar.X;
                TextView textView4 = (TextView) pbqVar.c;
                TextView textView5 = (TextView) pbqVar.d;
                TextView textView6 = (TextView) pbqVar.h;
                TextView textView7 = (TextView) pbqVar.i;
                ConstraintLayout constraintLayout = (ConstraintLayout) pbqVar.f;
                ViewGroup.LayoutParams layoutParams = artworkView2.getLayoutParams();
                if (layoutParams == null) {
                    bhn0.i("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                } else {
                    layoutParams.width = constraintLayout.getContext().getResources().getDimensionPixelSize(i);
                    layoutParams.height = constraintLayout.getContext().getResources().getDimensionPixelSize(i2);
                    artworkView2.setLayoutParams(layoutParams);
                    boolean z7 = i5 != 3;
                    ((TextView) pbqVar.e).setVisibility(z5 ? 0 : 8);
                    textView5.setText((list2.isEmpty() || z7) ? str5 : oq51Var.a(list2, true, ai4Var));
                    textView4.setText(fbzVar.b);
                    textView7.setText(str7);
                    textView7.setVisibility(str7.length() > 0 ? 0 : 8);
                    g07 g07Var = new g07((z4 || z5) ? null : (str8 == 0 || str8.length() == 0 || r0 == r3) ? false : true ? str8 : fbzVar.d, yz6Var);
                    artworkView2.h(z5 ? new s07(g07Var, new rk70(2131231986)) : new e17(g07Var));
                    contentRestrictionBadgeView.c(fbzVar.e);
                    textView6.setVisibility((str6.length() <= 0 || z5) ? 8 : 0);
                    textView6.setText(str6);
                    constraintLayout.setActivated(z7);
                    r15.setVisibility(z7 ? 0 : 8);
                    r15.z(mno1.A(i5));
                    r14.f(new b20(str5, z ? new y10(fbzVar.i) : null, 0));
                    constraintLayout.setSelected(z7);
                    boolean z8 = !z4;
                    textView5.setEnabled(z8);
                    textView4.setEnabled(z8);
                    artworkView2.setEnabled(z8);
                    contentRestrictionBadgeView.setEnabled(z8);
                    textView7.setEnabled(z8);
                    textView6.setEnabled(z8);
                    r14.setEnabled(z8);
                    int i6 = 0;
                    while (i6 < r14.getChildCount()) {
                        int i7 = i6 + 1;
                        View childAt2 = r14.getChildAt(i6);
                        if (childAt2 == null) {
                            tw20.p();
                        } else {
                            childAt2.setEnabled(z8);
                            i6 = i7;
                        }
                    }
                }
                break;
            default:
                xsu0 xsu0Var = (xsu0) obj;
                String str9 = xsu0Var.a;
                ytp0 ytp0Var = (ytp0) obj3;
                TextView textView8 = (TextView) ytp0Var.f;
                TextView textView9 = (TextView) ytp0Var.e;
                List list3 = xsu0Var.f;
                textView8.setText(!list3.isEmpty() ? oq51Var.a(list3, true, ai4Var) : str9);
                textView9.setText(xsu0Var.b);
                ColorStateList colorStateList = (ColorStateList) obj2;
                if (xsu0Var.h) {
                    textView9.setTextColor(xfo1.r(textView9, 2130968788));
                } else {
                    textView9.setTextColor(colorStateList);
                }
                ((ArtworkView) ytp0Var.d).h(new y07(new g07(xsu0Var.c, yz6Var), false));
                ((ActionBarComplexRowSearchView) ytp0Var.c).f(new b20(str9, (z && xsu0Var.e) ? new y10(xsu0Var.d) : null, 0));
                break;
        }
    }

    public final View getView() {
        byte b = this.a;
        Object obj = this.f;
        switch (b) {
            case 0:
                return (ConstraintLayout) ((kp5) obj).a;
            case 1:
                return (ConstraintLayout) ((pbq) obj).f;
            default:
                return (ConstraintLayout) ((ytp0) this.e).b;
        }
    }

    public final void n(iu30 iu30Var) {
        byte b = this.a;
        Object obj = this.f;
        switch (b) {
            case 0:
                kp5 kp5Var = (kp5) obj;
                ((ConstraintLayout) kp5Var.a).setOnClickListener(new yer(iu30Var, (byte) 2));
                ((ActionBarComplexRowSearchView) kp5Var.b).n(new m0o(iu30Var, (byte) 8));
                break;
            case 1:
                pbq pbqVar = (pbq) obj;
                ((ConstraintLayout) pbqVar.f).setOnClickListener(new trr(iu30Var, (byte) 17));
                ((ActionBarComplexRowSearchView) pbqVar.b).n(new mwr(iu30Var, (byte) 11));
                break;
            default:
                ytp0 ytp0Var = (ytp0) this.e;
                ((ConstraintLayout) ytp0Var.b).setOnClickListener(new oes(iu30Var, (byte) 9));
                ((ActionBarComplexRowSearchView) ytp0Var.c).n(new mwr(iu30Var, (byte) 24));
                break;
        }
    }

    public afr(Context context, gw70 gw70Var, bi4 bi4Var, boolean z, ai4 ai4Var) {
        this.a = (byte) 1;
        this.e = bi4Var;
        this.b = z;
        this.c = ai4Var;
        this.d = new oq51(context);
        ConstraintLayout constraintLayoutInflate = LayoutInflater.from(context).inflate(2131624603, (ViewGroup) null, false);
        int i = 2131427445;
        ActionBarComplexRowSearchView actionBarComplexRowSearchView = (ActionBarComplexRowSearchView) m5n1.t(constraintLayoutInflate, 2131427445);
        if (actionBarComplexRowSearchView != null) {
            i = 2131427611;
            View view = (ArtworkView) m5n1.t(constraintLayoutInflate, 2131427611);
            if (view != null) {
                i = 2131427741;
                if (m5n1.t(constraintLayoutInflate, 2131427741) != null) {
                    i = 2131428537;
                    TextView textView = (TextView) m5n1.t(constraintLayoutInflate, 2131428537);
                    if (textView != null) {
                        i = 2131429973;
                        TextView textView2 = (TextView) m5n1.t(constraintLayoutInflate, 2131429973);
                        if (textView2 != null) {
                            i = 2131430403;
                            PlayIndicatorComposeView playIndicatorComposeView = (PlayIndicatorComposeView) m5n1.t(constraintLayoutInflate, 2131430403);
                            if (playIndicatorComposeView != null) {
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
                                            i = 2131431662;
                                            TextView textView5 = (TextView) m5n1.t(constraintLayoutInflate, 2131431662);
                                            if (textView5 != null) {
                                                pbq pbqVar = new pbq(constraintLayout, actionBarComplexRowSearchView, view, textView, textView2, playIndicatorComposeView, contentRestrictionBadgeViewT, textView3, textView4, textView5, (byte) 9);
                                                view.setViewContext(new f47(gw70Var));
                                                v9w0 v9w0VarQ = b2u.q(constraintLayout);
                                                ArrayList arrayList = v9w0VarQ.c;
                                                Collections.addAll(arrayList, textView4);
                                                Collections.addAll(arrayList, textView3);
                                                Collections.addAll(arrayList, textView2);
                                                Collections.addAll(v9w0VarQ.d, view);
                                                v9w0VarQ.e = false;
                                                v9w0VarQ.a();
                                                constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                                this.f = pbqVar;
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
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        throw null;
    }
}
