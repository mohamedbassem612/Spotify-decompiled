package p;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class mxw extends t2u {
    public final thn V1;
    public kg0 W1;
    public ohv0 X1;

    public mxw(thn thnVar) {
        this.V1 = thnVar;
    }

    public final void v0(Context context) {
        this.V1.f(this);
        super.v0(context);
    }

    public final void w0(Bundle bundle) {
        super.w0(bundle);
        ohv0 ohv0Var = this.X1;
        if (ohv0Var != null) {
            ohv0Var.a(new nhv0("email_method_picker", null));
        } else {
            u890.C("preAuthUbiTracker");
            throw null;
        }
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ComposeView composeView = new ComposeView(P0(), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        composeView.setViewCompositionStrategy(p5x0.W0);
        composeView.setContent(apo.j(-1324981600, new utt(this, (byte) 29), true));
        return composeView;
    }
}
