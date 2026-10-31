package p;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yyr implements qzh {
    public iu30 b;
    public final ComposeView d;
    public final /* synthetic */ byte a = 0;
    public final kdn0 c = new kdn0();

    public yyr(Context context) {
        ComposeView composeView = new ComposeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        composeView.setContent(new j2i(697666011, new i4o(this, (byte) 17), true));
        this.d = composeView;
    }

    public final void f(Object obj) {
        byte b = this.a;
        kdn0 kdn0Var = this.c;
        switch (b) {
            case 0:
                kdn0Var.m((m920) obj);
                break;
            default:
                kdn0Var.m(obj);
                break;
        }
    }

    public final View getView() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.d;
    }

    public final void n(iu30 iu30Var) {
        switch (this.a) {
            case 0:
                this.b = iu30Var;
                break;
            default:
                this.b = iu30Var;
                break;
        }
    }

    public yyr(Context context, gw70 gw70Var, zu30 zu30Var) {
        ComposeView composeView = new ComposeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        composeView.setContent(new j2i(1969767053, new kfx(gw70Var, this, zu30Var, (byte) 1), true));
        this.d = composeView;
    }
}
