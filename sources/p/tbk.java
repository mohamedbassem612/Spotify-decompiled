package p;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewStub;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoreconsumermobile.layout.headers.BehaviorRetainingAppBarLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tbk {
    public final idd1 a = new idd1(fki.b1);
    public final idd1 b = new idd1(fki.a1);
    public final h72 c;

    public tbk(Context context, gw70 gw70Var, lbs lbsVar, d0r d0rVar) {
        h72 h72VarG = h72.G(LayoutInflater.from(context));
        h360.h(h72VarG);
        this.c = h72VarG;
        ConstraintLayout constraintLayoutF = h360.f(h72VarG, 2131624449);
        int i = 2131428156;
        ViewStub viewStub = (ViewStub) m5n1.t(constraintLayoutF, 2131428156);
        if (viewStub != null) {
            i = 2131431403;
            if (m5n1.t(constraintLayoutF, 2131431403) != null) {
                i = 2131431404;
                if (m5n1.t(constraintLayoutF, 2131431404) != null) {
                    ComposeView composeView = new ComposeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                    composeView.setContent(new j2i(-575887032, new hwd(this, gw70Var, lbsVar, d0rVar, (byte) 20), true));
                    h360.i(h72VarG, new ptj(1, this, tbk.class, "applyContentWindowInsetTop", "applyContentWindowInsetTop(I)V", 0, (byte) 2));
                    ((Toolbar) h72VarG.X).setBackgroundColor(-15592942);
                    ((BehaviorRetainingAppBarLayout) h72VarG.b).a(new rzg(h72VarG, (byte) 1));
                    k8p1.o(viewStub, composeView);
                    return;
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutF.getResources().getResourceName(i)));
        throw null;
    }
}
