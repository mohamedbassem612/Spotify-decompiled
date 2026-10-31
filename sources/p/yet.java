package p;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class yet implements isw {
    public final /* synthetic */ byte a;
    public final ComposeView b;
    public final /* synthetic */ hrr0 c;

    public /* synthetic */ yet(ComposeView composeView, hrr0 hrr0Var, byte b) {
        this.a = b;
        this.c = hrr0Var;
        this.b = composeView;
    }

    public final void a(Object obj, ysw yswVar) {
        byte b = this.a;
        hrr0 hrr0Var = this.c;
        switch (b) {
            case 0:
                hrr0Var.setValue((tet) obj);
                break;
            case 1:
                hrr0Var.setValue((em10) obj);
                break;
            default:
                hrr0Var.setValue((ssv0) obj);
                break;
        }
    }

    public final View getView() {
        byte b = this.a;
        return this.b;
    }
}
