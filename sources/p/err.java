package p;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoreconsumermobile.elements.seemoretextview.SeeMoreTextView;
import com.spotify.encoremobile.component.icons.IconMedal;
import java.util.Arrays;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class err implements qzh {
    public final r4u N0;
    public final idd1 O0;
    public final SeeMoreTextView X;
    public final int Y;
    public iu30 Z;
    public final Context a;
    public final gw70 b;
    public final br0 c;
    public final xpw d;
    public final fta e;
    public final ImageView f;
    public final FrameLayout g;
    public final ComposeView h;
    public final ComposeView i;
    public final ComposeView t;

    /* JADX WARN: Code duplicated, block: B:32:0x01ef A[PHI: r9
      0x01ef: PHI (r9v5 int) = (r9v4 int), (r9v11 int), (r9v12 int) binds: [B:15:0x0071, B:21:0x009b, B:23:0x00a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x0206 A[PHI: r6
      0x0206: PHI (r6v3 int) = (r6v2 int), (r6v4 int), (r6v5 int) binds: [B:5:0x0038, B:7:0x0044, B:9:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    public err(Context context, gw70 gw70Var, br0 br0Var, ng20 ng20Var) {
        this.a = context;
        this.b = gw70Var;
        this.c = br0Var;
        this.d = ng20Var;
        ConstraintLayout constraintLayoutInflate = LayoutInflater.from(context).inflate(2131624087, (ViewGroup) null, false);
        int i = 2131427523;
        if (m5n1.t(constraintLayoutInflate, 2131427523) != null) {
            int i2 = 2131427721;
            if (((LinearLayout) m5n1.t(constraintLayoutInflate, 2131427721)) != null) {
                i2 = 2131428278;
                TextView textView = (TextView) m5n1.t(constraintLayoutInflate, 2131428278);
                if (textView != null) {
                    ConstraintLayout constraintLayout = constraintLayoutInflate;
                    i2 = 2131428281;
                    if (((SeeMoreTextView) m5n1.t(constraintLayoutInflate, 2131428281)) == null) {
                        i = i2;
                    } else if (((ImageView) m5n1.t(constraintLayoutInflate, 2131428282)) == null) {
                        i = 2131428282;
                    } else if (m5n1.t(constraintLayoutInflate, 2131428975) != null) {
                        int i3 = 2131428998;
                        ConstraintLayout constraintLayoutT = m5n1.t(constraintLayoutInflate, 2131428998);
                        if (constraintLayoutT != null) {
                            int i4 = 2131429000;
                            if (((IconMedal) m5n1.t(constraintLayoutT, 2131429000)) != null) {
                                i4 = 2131429001;
                                if (((TextView) m5n1.t(constraintLayoutT, 2131429001)) != null) {
                                    hva hvaVar = new hva(constraintLayoutT);
                                    i3 = 2131428999;
                                    FrameLayout frameLayout = (FrameLayout) m5n1.t(constraintLayoutInflate, 2131428999);
                                    if (frameLayout != null) {
                                        i3 = 2131429614;
                                        if (m5n1.t(constraintLayoutInflate, 2131429614) == null) {
                                            i = i3;
                                        } else if (((FrameLayout) m5n1.t(constraintLayoutInflate, 2131429617)) == null) {
                                            i = 2131429617;
                                        } else {
                                            if (m5n1.t(constraintLayoutInflate, 2131429805) != null) {
                                                this.e = new fta(constraintLayout, textView, hvaVar, frameLayout, (byte) 4);
                                                this.Y = context.getResources().getDimensionPixelSize(2131167225);
                                                this.Z = r5r.d1;
                                                r4u[] r4uVarArr = (r4u[]) p7h.O(new r4u[]{r4u.d(v560.V0, r4u.a(new sun(this, (byte) 8))), r4u.d(new bvn(tqr.b, (byte) 1), r4u.a(new her(this, (byte) 4))), r4u.d(new bvn(uqr.b, (byte) 1), r4u.a(new rjn(this, (byte) 11))), r4u.d(qz70.V0, r4u.a(new vun(this, (byte) 10))), r4u.d(b6j0.U0, r4u.a(new wcr(this, (byte) 5))), r4u.d(ios.V0, r4u.a(new xap(this, (byte) 6))), r4u.d(fmv.W0, r4u.a(new h9n(this, (byte) 10)))}).toArray(new r4u[0]);
                                                this.N0 = r4u.c((r4u[]) Arrays.copyOf(r4uVarArr, r4uVarArr.length));
                                                this.O0 = new idd1(new dor(this, (byte) 2));
                                                constraintLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
                                                ImageView imageView = (ImageView) constraintLayout.findViewById(2131428282);
                                                this.f = imageView;
                                                this.g = (FrameLayout) constraintLayout.findViewById(2131429617);
                                                this.h = constraintLayout.findViewById(2131429805);
                                                this.i = constraintLayout.findViewById(2131428975);
                                                this.t = constraintLayout.findViewById(2131427523);
                                                SeeMoreTextView seeMoreTextView = (SeeMoreTextView) constraintLayout.findViewById(2131428281);
                                                this.X = seeMoreTextView;
                                                seeMoreTextView.N0 = new m4r(this, (byte) 15);
                                                imageView.setOnClickListener(new sqr(this, (byte) 0));
                                                constraintLayout.setOnClickListener(new sqr(this, (byte) 1));
                                                ((GradientDrawable) constraintLayout.getBackground()).setColor(context.getColor(2131101501));
                                                return;
                                            }
                                            i = 2131429805;
                                        }
                                    } else {
                                        i = i3;
                                    }
                                }
                            }
                            bhn0.i("Missing required view with ID: ".concat(constraintLayoutT.getResources().getResourceName(i4)));
                            throw null;
                        }
                        i = i3;
                    } else {
                        i = 2131428975;
                    }
                } else {
                    i = i2;
                }
            } else {
                i = i2;
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        throw null;
    }

    public final void f(Object obj) {
        oyn oynVar = (oyn) obj;
        this.N0.e(oynVar);
        fta ftaVar = this.e;
        lvx.t((ConstraintLayout) ftaVar.b, this.Y);
        ConstraintLayout constraintLayout = (ConstraintLayout) ftaVar.b;
        b8k1.q(constraintLayout, true);
        Set set = oynVar.m;
        String str = oynVar.c;
        String str2 = oynVar.j;
        boolean zContains = set.contains(gyn.b);
        Context context = this.a;
        if (zContains) {
            b8k1.a(constraintLayout, str2.length() == 0 ? context.getString(2131954288, str) : str2, new qmr(this, (byte) 2));
        }
        if (set.contains(gyn.a)) {
            String string = oynVar.i;
            if (string.length() == 0) {
                string = context.getString(2131954287, str);
            }
            b8k1.a(constraintLayout, string, new rmr(this, (byte) 2));
        }
        b8k1.m(this.X, fg.g, str2, (sh) null);
    }

    public final View getView() {
        return (ConstraintLayout) this.e.b;
    }

    public final void n(iu30 iu30Var) {
        this.Z = iu30Var;
    }
}
