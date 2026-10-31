package p;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.StyleSpan;
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
import com.spotify.encoremobile.viewstub.EncoreViewStub;
import com.spotify.search.uiusecases.PlayIndicatorComposeView;
import com.spotify.search.uiusecases.actionbarsearch.ActionBarComplexRowSearchView;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class iws implements qzh, qad1 {
    public final gw70 a;
    public final boolean b;
    public final ai4 c;
    public boolean d;
    public final oq51 e;
    public final s24 f;
    public final ActionBarComplexRowSearchView g;
    public final v8o0 h;
    public final v8o0 i;

    /* JADX WARN: Type inference failed for: r3v18, types: [android.view.View, androidx.constraintlayout.widget.ConstraintLayout, com.spotify.search.uiusecases.actionbarsearch.ActionBarComplexRowSearchView] */
    public iws(Context context, gw70 gw70Var, boolean z, ai4 ai4Var) {
        this.a = gw70Var;
        this.b = z;
        this.c = ai4Var;
        this.e = new oq51(context);
        ConstraintLayout constraintLayoutInflate = LayoutInflater.from(context).inflate(2131626281, (ViewGroup) null, false);
        int i = 2131427445;
        EncoreViewStub encoreViewStubT = m5n1.t(constraintLayoutInflate, 2131427445);
        if (encoreViewStubT != null) {
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
                            i = 2131429056;
                            if (m5n1.t(constraintLayoutInflate, 2131429056) != null) {
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
                                                                    s24 s24Var = new s24(constraintLayout, encoreViewStubT, view, composeViewT, textView, lockedBadgeViewT, playIndicatorComposeView, premiumBadgeViewT, textView2, contentRestrictionBadgeViewT, textView3, textView4, videoBadgeViewT, textView5);
                                                                    constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                                                    view.setViewContext(new f47(gw70Var));
                                                                    view.setConstrainIconToSmallestDimension(true);
                                                                    ?? actionBarComplexRowSearchView = new ActionBarComplexRowSearchView(context, null, 0, 6, null);
                                                                    actionBarComplexRowSearchView.setId(View.generateViewId());
                                                                    k8p1.o(encoreViewStubT, (View) actionBarComplexRowSearchView);
                                                                    this.g = actionBarComplexRowSearchView;
                                                                    v9w0 v9w0VarQ = b2u.q(constraintLayout);
                                                                    Collections.addAll(v9w0VarQ.c, textView4, textView3);
                                                                    Collections.addAll(v9w0VarQ.d, view);
                                                                    v9w0VarQ.e = false;
                                                                    v9w0VarQ.a();
                                                                    this.f = s24Var;
                                                                    this.h = new v8o0(constraintLayout.getContext(), 1);
                                                                    this.i = new v8o0(constraintLayout.getContext(), 2);
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
        return this.i.c();
    }

    public final m9d1 b() {
        return this.h.c();
    }

    /* JADX WARN: Type inference failed for: r13v2, types: [android.view.View, com.spotify.search.uiusecases.PlayIndicatorComposeView] */
    /* JADX WARN: Type inference failed for: r2v7, types: [android.view.View, android.view.ViewGroup, com.spotify.search.uiusecases.actionbarsearch.ActionBarComplexRowSearchView] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void f(Object obj) {
        int i;
        int i2;
        int i3;
        qzf1 qzf1Var = (qzf1) obj;
        List list = qzf1Var.R0;
        String str = qzf1Var.V0;
        boolean z = qzf1Var.O0;
        boolean z2 = qzf1Var.i;
        String str2 = qzf1Var.b;
        String str3 = qzf1Var.Q0;
        String str4 = qzf1Var.a;
        int i4 = qzf1Var.f;
        boolean z3 = qzf1Var.T0;
        boolean z4 = qzf1Var.g;
        boolean z5 = qzf1Var.U0;
        boolean z6 = qzf1Var.S0;
        boolean z7 = qzf1Var.N0;
        if (z6 || (z7 && z3 && z5)) {
            i = 2131167202;
            i2 = 2131167201;
        } else {
            i = 2131167170;
            i2 = 2131167170;
        }
        s24 s24Var = this.f;
        ArtworkView artworkView = (ArtworkView) s24Var.c;
        ?? r13 = (PlayIndicatorComposeView) s24Var.g;
        TextView textView = (TextView) s24Var.i;
        VideoBadgeView videoBadgeView = (VideoBadgeView) s24Var.Z;
        PremiumBadgeView premiumBadgeView = (PremiumBadgeView) s24Var.h;
        ContentRestrictionBadgeView contentRestrictionBadgeView = (ContentRestrictionBadgeView) s24Var.t;
        LockedBadgeView lockedBadgeView = (LockedBadgeView) s24Var.f;
        ComposeView composeView = (ComposeView) s24Var.d;
        TextView textView2 = (TextView) s24Var.N0;
        TextView textView3 = (TextView) s24Var.X;
        TextView textView4 = (TextView) s24Var.Y;
        TextView textView5 = (TextView) s24Var.e;
        ConstraintLayout constraintLayout = (ConstraintLayout) s24Var.b;
        ViewGroup.LayoutParams layoutParams = artworkView.getLayoutParams();
        if (layoutParams == null) {
            bhn0.i("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            return;
        }
        layoutParams.width = constraintLayout.getContext().getResources().getDimensionPixelSize(i);
        layoutParams.height = constraintLayout.getContext().getResources().getDimensionPixelSize(i2);
        artworkView.setLayoutParams(layoutParams);
        boolean z8 = i4 != 3;
        textView4.setText((list.isEmpty() || z8) ? str4 : this.e.a(list, true, this.c));
        if (ihc1.y0(str3)) {
            textView3.setText(str2);
        } else {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) bmq0.k0(p7h.M(new String[]{str3, str2})));
            spannableStringBuilder.setSpan(new StyleSpan(1), 0, str3.length(), 34);
            textView3.setText(new SpannedString(spannableStringBuilder));
        }
        yz6 yz6Var = yz6.d;
        if (z7 && z5) {
            textView2.setVisibility(0);
            if (z3) {
                composeView.setVisibility(8);
                artworkView.setVisibility(0);
                artworkView.h(new s07(new g07((String) null, yz6Var), new rk70(2131231986)));
                i3 = 0;
            } else {
                composeView.setViewCompositionStrategy(p5x0.W0);
                composeView.setContent(new j2i(-794437519, new g1o(qzf1Var, this, (byte) 24), true));
                i3 = 0;
                composeView.setVisibility(0);
                artworkView.setVisibility(4);
            }
        } else {
            i3 = 0;
            textView2.setVisibility(8);
            composeView.setVisibility(8);
            artworkView.setVisibility(0);
            g07 g07Var = new g07((z4 || qzf1Var.h) ? null : qzf1Var.c, yz6Var);
            artworkView.h(z6 ? new n17(g07Var) : new g17(g07Var));
        }
        boolean z9 = this.b;
        y10 y10Var = (z9 && z2) ? new y10(qzf1Var.P0) : null;
        z10 z10Var = qzf1Var.X ? new z10(4) : null;
        b20 b20Var = new b20(str4, y10Var, z10Var != null ? z10Var.a : i3);
        ?? r2 = this.g;
        r2.f(b20Var);
        lockedBadgeView.c(z);
        contentRestrictionBadgeView.c(qzf1Var.e);
        premiumBadgeView.c(qzf1Var.t);
        videoBadgeView.setVisibility((!z7 || z6) ? 8 : 0);
        textView5.setVisibility((str.length() <= 0 || z5) ? 8 : 0);
        textView5.setText(str);
        textView.setVisibility(qzf1Var.Y ? 0 : 8);
        constraintLayout.setActivated(z8);
        r13.setVisibility(z8 ? 0 : 8);
        r13.z(mno1.A(i4));
        constraintLayout.setSelected(z8);
        boolean z10 = !z4;
        artworkView.setEnabled(z10);
        textView4.setEnabled(z10);
        textView3.setEnabled(z10);
        textView.setEnabled(z10);
        contentRestrictionBadgeView.setEnabled(z10);
        premiumBadgeView.setEnabled(z10);
        lockedBadgeView.setEnabled(z10);
        videoBadgeView.setEnabled(z10);
        textView5.setEnabled(z10);
        r2.setEnabled(z10);
        int i5 = 0;
        while (i5 < r2.getChildCount()) {
            int i6 = i5 + 1;
            View childAt = r2.getChildAt(i5);
            if (childAt == null) {
                tw20.p();
                return;
            } else {
                childAt.setEnabled(z10);
                i5 = i6;
            }
        }
        this.h.b = qzf1Var.Z;
        this.i.b = (!z9 || z2 == 0 || z4 || z || z5) ? false : true;
        this.d = z4;
    }

    public final View getView() {
        return (ConstraintLayout) this.f.b;
    }

    public final void n(iu30 iu30Var) {
        ConstraintLayout constraintLayout = (ConstraintLayout) this.f.b;
        constraintLayout.setOnClickListener(new aqs(iu30Var, (byte) 12));
        constraintLayout.setOnLongClickListener(new gws(this, iu30Var));
        this.g.n(new hws(iu30Var, (byte) 0));
        this.h.e = new hbs(iu30Var, (byte) 10);
        this.i.e = new hbs(iu30Var, (byte) 11);
    }
}
