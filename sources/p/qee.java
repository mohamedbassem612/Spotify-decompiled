package p;

import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import java.util.WeakHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qee implements f4h1 {
    public final /* synthetic */ byte a = 1;
    public final Object b;

    public qee(ViewGroup viewGroup, efr efrVar, xpw xpwVar, k331 k331Var) {
        ComposeView composeView = new ComposeView(viewGroup.getContext(), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        composeView.setContent(new j2i(-1531306710, new n7m(efrVar, viewGroup, xpwVar, k331Var, (byte) 26), true));
        this.b = composeView;
    }

    public final Object getView() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return (View) ((h72) obj).f;
            default:
                return (ComposeView) obj;
        }
    }

    public final void start() {
        nk80 nk80VarI;
        switch (this.a) {
            case 0:
                View view = (View) ((h72) this.b).f;
                WeakHashMap weakHashMap = b8k1.a;
                hsl1 hsl1VarA = s7k1.a(view);
                view.setPadding(view.getPaddingLeft(), (hsl1VarA == null || (nk80VarI = hsl1VarA.a.i(519)) == null) ? 0 : nk80VarI.b, view.getPaddingRight(), view.getPaddingBottom());
                break;
        }
    }

    public final void stop() {
        byte b = this.a;
    }

    private final void b() {
    }

    private final void c() {
    }

    private final void d() {
    }

    public qee(h72 h72Var) {
        this.b = h72Var;
    }
}
