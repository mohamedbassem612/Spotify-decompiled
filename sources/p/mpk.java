package p;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoreconsumermobile.layout.headers.BehaviorRetainingAppBarLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mpk {
    public final idd1 a = new idd1(aok.c);
    public final h72 b;
    public final aod c;

    public mpk(Context context) {
        h72 h72VarG = h72.G(LayoutInflater.from(context));
        h360.h(h72VarG);
        this.b = h72VarG;
        ConstraintLayout constraintLayoutF = h360.f(h72VarG, 2131624457);
        int i = 2131428156;
        ViewStub viewStub = (ViewStub) m5n1.t(constraintLayoutF, 2131428156);
        if (viewStub != null) {
            ConstraintLayout constraintLayout = constraintLayoutF;
            i = 2131431403;
            if (m5n1.t(constraintLayoutF, 2131431403) != null) {
                i = 2131431404;
                Barrier barrierT = m5n1.t(constraintLayoutF, 2131431404);
                if (barrierT != null) {
                    this.c = new aod(constraintLayout, viewStub, constraintLayout, barrierT);
                    ComposeView composeView = new ComposeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                    composeView.setContent(new j2i(1402337035, new boj(this, (byte) 20), true));
                    h360.i(h72VarG, new ptj(1, this, mpk.class, "applyContentWindowInsetTop", "applyContentWindowInsetTop(I)V", 0, (byte) 4));
                    h360.a(h72VarG, constraintLayout, barrierT);
                    ((BehaviorRetainingAppBarLayout) h72VarG.b).a(new rzg(this, (byte) 2));
                    k8p1.o(viewStub, composeView);
                    return;
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutF.getResources().getResourceName(i)));
        throw null;
    }

    public final void a(uy30 uy30Var) {
        int color = Color.parseColor(uy30Var.c);
        h72 h72Var = this.b;
        h360.j(h72Var, color);
        ((TextView) h72Var.Y).setText(uy30Var.a);
        bpb1 bpb1Var = (wen0) this.a.getValue();
        bpb1Var.getClass();
        bpb1Var.m((Object) null, uy30Var);
    }
}
