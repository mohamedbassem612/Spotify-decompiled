package p;

import android.R;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class h0i {
    public static final ViewGroup.LayoutParams a = new ViewGroup.LayoutParams(-2, -2);

    public static void a(g0i g0iVar, j2i j2iVar) {
        ComposeView childAt = ((ViewGroup) g0iVar.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        ComposeView composeView = childAt instanceof ComposeView ? childAt : null;
        if (composeView != null) {
            composeView.setParentCompositionContext((v3k) null);
            composeView.setContent(j2iVar);
            return;
        }
        ComposeView composeView2 = new ComposeView(g0iVar, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        composeView2.setParentCompositionContext((v3k) null);
        composeView2.setContent(j2iVar);
        View decorView = g0iVar.getWindow().getDecorView();
        if (x9p1.h(decorView) == null) {
            x9p1.p(decorView, g0iVar);
        }
        if (lap1.k(decorView) == null) {
            lap1.o(decorView, g0iVar);
        }
        if (hm5.w(decorView) == null) {
            hm5.J(decorView, g0iVar);
        }
        g0iVar.setContentView(composeView2, a);
    }
}
