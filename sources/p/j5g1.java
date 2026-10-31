package p;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoreconsumermobile.elements.badge.contentrestriction.ContentRestrictionBadgeView;
import com.spotify.encoreconsumermobile.elements.badge.trailer.TrailerBadgeView;
import com.spotify.encoremobile.component.icons.IconMoreAndroid;
import java.util.Collections;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class j5g1 implements isw {
    public final oi N0;
    public final q5g1 O0;
    public s5g1 P0;
    public final r4u Q0;
    public final ConstraintLayout R0;
    public final ContentRestrictionBadgeView X;
    public final TrailerBadgeView Y;
    public final TextView Z;
    public final iu30 a;
    public final ggv b;
    public final vun c;
    public final gw70 d;
    public final yqg e;
    public final aod f;
    public final Context g;
    public final int h;
    public final ImageView i;
    public final TextView t;

    public j5g1(ViewGroup viewGroup, iu30 iu30Var, ggv ggvVar, vun vunVar, gw70 gw70Var, yqg yqgVar, aod aodVar, float f) {
        this.a = iu30Var;
        this.b = ggvVar;
        this.c = vunVar;
        this.d = gw70Var;
        this.e = yqgVar;
        this.f = aodVar;
        Context context = viewGroup.getContext();
        this.g = context;
        this.h = context.getResources().getDimensionPixelOffset(2131165269);
        View viewInflate = LayoutInflater.from(context).inflate(2131625428, viewGroup, false);
        View view = (ConstraintLayout) viewInflate;
        int i = 2131431492;
        LinearLayout linearLayout = (LinearLayout) m5n1.t(viewInflate, 2131431492);
        if (linearLayout != null) {
            i = 2131431493;
            TrailerBadgeView trailerBadgeViewT = m5n1.t(viewInflate, 2131431493);
            if (trailerBadgeViewT != null) {
                i = 2131431494;
                ConstraintLayout constraintLayoutT = m5n1.t(viewInflate, 2131431494);
                if (constraintLayoutT != null) {
                    i = 2131431495;
                    ContentRestrictionBadgeView contentRestrictionBadgeView = (ContentRestrictionBadgeView) m5n1.t(viewInflate, 2131431495);
                    if (contentRestrictionBadgeView != null) {
                        i = 2131431496;
                        ImageView imageView = (ImageView) m5n1.t(viewInflate, 2131431496);
                        if (imageView != null) {
                            i = 2131431497;
                            if (((LinearLayout) m5n1.t(viewInflate, 2131431497)) != null) {
                                i = 2131431498;
                                TextView textView = (TextView) m5n1.t(viewInflate, 2131431498);
                                if (textView != null) {
                                    i = 2131431499;
                                    TextView textView2 = (TextView) m5n1.t(viewInflate, 2131431499);
                                    if (textView2 != null) {
                                        this.i = imageView;
                                        this.t = textView2;
                                        this.X = contentRestrictionBadgeView;
                                        this.Y = trailerBadgeViewT;
                                        this.Z = textView;
                                        oi oiVar = new oi(linearLayout);
                                        oiVar.b = true;
                                        linearLayout.setDuplicateParentStateEnabled(true);
                                        View view2 = (View) oiVar.d;
                                        if (view2 != null) {
                                            view2.setDuplicateParentStateEnabled(true);
                                        }
                                        this.N0 = oiVar;
                                        this.O0 = new q5g1(context, yqgVar);
                                        v9w0 v9w0VarQ = b2u.q(view);
                                        Collections.addAll(v9w0VarQ.d, view);
                                        v9w0VarQ.a();
                                        ViewGroup.LayoutParams layoutParams = constraintLayoutT.getLayoutParams();
                                        if (layoutParams == null) {
                                            bhn0.i("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                            throw null;
                                        }
                                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                                        int i2 = (int) f;
                                        marginLayoutParams.setMarginStart(i2);
                                        marginLayoutParams.setMarginEnd(i2);
                                        constraintLayoutT.setLayoutParams(layoutParams);
                                        this.Q0 = r4u.c(new r4u[]{r4u.d(c4x0.U0, r4u.a(new h5a1(this, (byte) 14))), r4u.d(e4x0.T0, r4u.a(new y281((Object) this, (byte) 24))), r4u.d(new mta(this, (byte) 28), r4u.a(new o2b1(this, (byte) 14))), r4u.d(new cua(this, (byte) 28), r4u.a(new vr51(this, (byte) 28))), r4u.d(f4x0.S0, r4u.a(new xq81(this, (byte) 21)))});
                                        this.R0 = view;
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00ee  */
    public final void a(Object obj, ysw yswVar) {
        b5g1 b5g1Var = (b5g1) obj;
        boolean zEquals = b5g1Var.equals(z4g1.a);
        ConstraintLayout constraintLayout = this.R0;
        if (zEquals) {
            constraintLayout.setVisibility(8);
            return;
        }
        if (!(b5g1Var instanceof a5g1)) {
            eg.o();
            return;
        }
        a5g1 a5g1Var = (a5g1) b5g1Var;
        ast0 ast0Var = a5g1Var.c;
        o5g1 o5g1Var = a5g1Var.a;
        String str = o5g1Var.b;
        this.Q0.e(a5g1Var);
        constraintLayout.setContentDescription(str);
        fg fgVar = fg.g;
        Context context = this.g;
        b8k1.m(constraintLayout, fgVar, context.getString(2131963365), (sh) null);
        iix0 iix0VarI = fj30.I(a5g1Var.b, Long.valueOf(((long) o5g1Var.c) * 1000));
        s5g1 s5g1Var = this.P0;
        ast0 ast0Var2 = ast0.a;
        if (s5g1Var == null) {
            constraintLayout = constraintLayout;
        } else {
            gix0 gix0Var = iix0VarI instanceof gix0 ? (gix0) iix0VarI : null;
            long j = gix0Var != null ? gix0Var.c : 0L;
            long jF = iix0VarI != null ? iix0VarI.f() : 0L;
            long jB = this.e.b();
            boolean z = ast0Var == ast0Var2;
            r5g1 r5g1Var = new r5g1(j, jF, jB, z);
            boolean z2 = z;
            p5g1 p5g1Var = s5g1Var.c;
            if (p5g1Var != null) {
                long jC = p5g1Var.h.c();
                int i = !z2 ? 1 : 2;
                if (p5g1Var.Z0 != i) {
                    int iC = l1d.C(i);
                    if (iC == 0) {
                        p5g1Var.W0 = jC - ((long) ((p5g1Var.T0 * 200) / 255));
                    } else {
                        if (iC != 1) {
                            eg.o();
                            return;
                        }
                        p5g1Var.X0 = jC - ((long) ((p5g1Var.U0 * 300) / 255));
                    }
                    int iC2 = l1d.C(p5g1Var.Z0);
                    if (iC2 == 0) {
                        p5g1Var.W0 = jC - ((long) (((255 - p5g1Var.T0) * 200) / 255));
                    } else {
                        if (iC2 != 1) {
                            eg.o();
                            return;
                        }
                        p5g1Var.X0 = jC - ((long) (((255 - p5g1Var.U0) * 300) / 255));
                    }
                    p5g1Var.Z0 = i;
                } else {
                    constraintLayout = constraintLayout;
                }
                p5g1Var.Q0 = r5g1Var;
                p5g1Var.c();
            } else {
                constraintLayout = constraintLayout;
            }
        }
        w4g1 w4g1Var = new w4g1(str, o5g1Var.a, o5g1Var.d);
        IconMoreAndroid iconMoreAndroid = new IconMoreAndroid(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        iconMoreAndroid.setFocusable(false);
        iconMoreAndroid.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        iconMoreAndroid.setImageTintList(x74.E(context, 2131101341));
        iconMoreAndroid.setPadding(context.getResources().getDimensionPixelSize(2131165550), 0, 0, 0);
        iconMoreAndroid.setMinimumWidth(0);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131165551);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
        layoutParams.setMargins(0, 0, 0, 0);
        iconMoreAndroid.setLayoutParams(layoutParams);
        iconMoreAndroid.setContentDescription(context.getString(2131954306, context.getString(2131954291), str));
        iconMoreAndroid.setOnClickListener(new cvr(this.c, w4g1Var, (byte) 18));
        oi oiVar = this.N0;
        oiVar.J(iconMoreAndroid);
        View view = (View) oiVar.d;
        ((ViewGroup) oiVar.c).setVisibility(view != null ? view.getVisibility() : 8);
        ConstraintLayout constraintLayout2 = constraintLayout;
        constraintLayout2.setOnClickListener(new r230(o5g1Var, this, a5g1Var.f, ast0Var == ast0Var2));
        constraintLayout2.setVisibility(0);
    }

    public final View getView() {
        return this.R0;
    }
}
