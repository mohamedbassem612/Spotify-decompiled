package p;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoreconsumermobile.elements.backbutton.BackButtonView;
import com.spotify.encoreconsumermobile.layout.headers.BehaviorRetainingAppBarLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class m2s implements qzh {
    public final gw70 a;
    public final boolean b;
    public final ComposeView c;
    public final idd1 d = new idd1(new i2s(this, (byte) 2));
    public final idd1 e = new idd1(new i2s(this, (byte) 1));
    public final idd1 f = new idd1(n0r.T0);
    public final hrr0 g = v8r.q(new f260(0.0f, 0));
    public final h72 h;
    public final dh30 i;
    public iu30 t;

    public m2s(Context context, gw70 gw70Var, boolean z) {
        this.a = gw70Var;
        this.b = z;
        byte b = 1;
        byte b2 = 0;
        h72 h72VarG = h72.G(LayoutInflater.from(context));
        BehaviorRetainingAppBarLayout behaviorRetainingAppBarLayout = (BehaviorRetainingAppBarLayout) h72VarG.b;
        h360.h(h72VarG);
        this.h = h72VarG;
        ConstraintLayout constraintLayoutF = h360.f(h72VarG, 2131625085);
        int i = 2131428156;
        ComposeView composeViewT = m5n1.t(constraintLayoutF, 2131428156);
        if (composeViewT != null) {
            i = 2131429618;
            if (m5n1.t(constraintLayoutF, 2131429618) != null) {
                i = 2131429619;
                Barrier barrierT = m5n1.t(constraintLayoutF, 2131429619);
                if (barrierT != null) {
                    ConstraintLayout constraintLayout = constraintLayoutF;
                    this.i = new dh30(constraintLayout, composeViewT, barrierT, constraintLayout);
                    if (z) {
                        h360.e(h72VarG);
                    }
                    h360.i(h72VarG, v160.h);
                    h360.a(h72VarG, constraintLayout, barrierT);
                    ((View) h72VarG.f).setVisibility(0);
                    ((BackButtonView) h72VarG.e).setAccessibilityTraversalAfter(barrierT.getId());
                    if (!z) {
                        h360.k(h72VarG);
                    }
                    behaviorRetainingAppBarLayout.a(new rzg(this, (byte) 6));
                    composeViewT.setContent(new j2i(1318002594, new k2s(this, b2), true));
                    ComposeView composeView = new ComposeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                    composeView.setContent(new j2i(-84585400, new k2s(this, b), true));
                    this.c = composeView;
                    k8p1.o((ViewStub) h72VarG.c, composeView);
                    qzg layoutParams = composeView.getLayoutParams();
                    qzg qzgVar = layoutParams instanceof qzg ? layoutParams : null;
                    if (qzgVar != null) {
                        ((FrameLayout.LayoutParams) qzgVar).width = -2;
                        ((FrameLayout.LayoutParams) qzgVar).height = -2;
                        qzgVar.a = 1;
                        int dimensionPixelSize = behaviorRetainingAppBarLayout.getResources().getDimensionPixelSize(z ? 2131167139 : 2131165344);
                        ((FrameLayout.LayoutParams) qzgVar).rightMargin = dimensionPixelSize;
                        qzgVar.setMarginEnd(dimensionPixelSize);
                        return;
                    }
                    return;
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutF.getResources().getResourceName(i)));
        throw null;
    }

    public final void f(Object obj) {
        nt70 nt70Var = (nt70) obj;
        String str = nt70Var.b;
        Integer num = nt70Var.e;
        int iIntValue = num != null ? num.intValue() : ((Number) this.d.getValue()).intValue();
        h72 h72Var = this.h;
        h360.j(h72Var, iIntValue);
        TextView textView = (TextView) h72Var.Y;
        if (str == null) {
            str = "";
        }
        textView.setText(str);
        bpb1 bpb1Var = (wen0) this.f.getValue();
        bpb1Var.getClass();
        bpb1Var.m((Object) null, nt70Var);
    }

    public final View getView() {
        return (BehaviorRetainingAppBarLayout) this.h.b;
    }

    public final void n(iu30 iu30Var) {
        this.t = iu30Var;
        ((BackButtonView) this.h.e).n(new mwr(iu30Var, (byte) 16));
    }
}
