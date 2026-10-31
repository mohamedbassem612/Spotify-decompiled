package p;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nzj implements qzh {
    public final /* synthetic */ byte a;
    public final bpb1 b;
    public final bpb1 c;
    public final ComposeView d;

    public nzj(Context context) {
        this.a = (byte) 1;
        this.b = gio1.b(new r9x("", "", "", false));
        this.c = gio1.b(nvr.Y);
        ComposeView composeView = new ComposeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        composeView.setContent(new j2i(-760792299, new i4o(this, (byte) 13), true));
        this.d = composeView;
    }

    public final void f(Object obj) {
        byte b = this.a;
        bpb1 bpb1Var = this.b;
        switch (b) {
            case 0:
                bpb1Var.l(obj);
                break;
            default:
                bpb1Var.getClass();
                bpb1Var.m((Object) null, (r9x) obj);
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
        byte b = this.a;
        bpb1 bpb1Var = this.c;
        switch (b) {
            case 0:
                bpb1Var.getClass();
                bpb1Var.m((Object) null, iu30Var);
                break;
            default:
                bpb1Var.getClass();
                bpb1Var.m((Object) null, iu30Var);
                break;
        }
    }

    public nzj(Context context, j2i j2iVar) {
        this.a = (byte) 0;
        this.b = gio1.b((Object) null);
        this.c = gio1.b(cjj.X0);
        ComposeView composeView = new ComposeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        composeView.setContent(new j2i(116068782, new l2i(this, j2iVar, (byte) 27), true));
        this.d = composeView;
    }
}
