package p;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoreconsumermobile.elements.backbutton.BackButtonView;
import com.spotify.encoreconsumermobile.layout.headers.BehaviorRetainingAppBarLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jys implements qzh {
    public final idd1 a = new idd1(n0r.a1);
    public final idd1 b = new idd1(n0r.Z0);
    public final h72 c;
    public final ptf1 d;

    public jys(Context context, gw70 gw70Var, ng20 ng20Var) {
        h72 h72VarG = h72.G(LayoutInflater.from(context));
        h360.h(h72VarG);
        this.c = h72VarG;
        ConstraintLayout constraintLayoutF = h360.f(h72VarG, 2131626295);
        int i = 2131428156;
        ViewStub viewStub = (ViewStub) m5n1.t(constraintLayoutF, 2131428156);
        if (viewStub != null) {
            ConstraintLayout constraintLayout = constraintLayoutF;
            i = 2131431570;
            if (m5n1.t(constraintLayoutF, 2131431570) != null) {
                i = 2131431571;
                Barrier barrierT = m5n1.t(constraintLayoutF, 2131431571);
                if (barrierT != null) {
                    this.d = new ptf1(constraintLayout, viewStub, constraintLayout, barrierT);
                    ComposeView composeView = new ComposeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                    composeView.setContent(new j2i(1683531669, new n7m((Object) composeView, (Object) gw70Var, (Object) this, (Object) ng20Var, (byte) 17), true));
                    h360.i(h72VarG, new wsr(1, this, jys.class, "applyContentWindowInsetTop", "applyContentWindowInsetTop(I)V", 0, (byte) 26));
                    h360.a(h72VarG, constraintLayout, barrierT);
                    ((BehaviorRetainingAppBarLayout) h72VarG.b).a(new rzg(this, (byte) 9));
                    k8p1.o(viewStub, composeView);
                    return;
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutF.getResources().getResourceName(i)));
        throw null;
    }

    public final void f(Object obj) {
        uxi1 uxi1Var = (uxi1) obj;
        int color = Color.parseColor(uxi1Var.e);
        h72 h72Var = this.c;
        h360.j(h72Var, color);
        ((TextView) h72Var.Y).setText(uxi1Var.a);
        bpb1 bpb1Var = (wen0) this.a.getValue();
        bpb1Var.getClass();
        bpb1Var.m((Object) null, uxi1Var);
    }

    public final View getView() {
        return (BehaviorRetainingAppBarLayout) this.c.b;
    }

    public final void n(iu30 iu30Var) {
        ((BackButtonView) this.c.e).n(new hws(iu30Var, (byte) 1));
        bpb1 bpb1Var = (wen0) this.b.getValue();
        bpb1Var.getClass();
        bpb1Var.m((Object) null, iu30Var);
    }
}
