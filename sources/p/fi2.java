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
public final class fi2 extends zf30 {
    public final g21 F1;
    public zwg G1;

    public fi2(g21 g21Var) {
        this.F1 = g21Var;
    }

    public final void v0(Context context) {
        this.F1.f(this);
        super.v0(context);
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int iC;
        String string;
        String string2;
        int iD;
        Bundle bundle2 = ((zf30) this).f;
        int i = (bundle2 == null || (string2 = bundle2.getString("arg_reason")) == null || (iD = kk0.d(string2)) == 0) ? 1 : iD;
        Bundle bundle3 = ((zf30) this).f;
        if (bundle3 == null || (string = bundle3.getString("arg_source")) == null || (iC = kk0.c(string)) == 0) {
            iC = 5;
        }
        Bundle bundle4 = ((zf30) this).f;
        boolean z = bundle4 != null ? bundle4.getBoolean("arg_show_action_buttons", true) : true;
        String strR = k1o1.r(P0(), iC);
        ComposeView composeView = new ComposeView(P0(), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        composeView.setViewCompositionStrategy(p5x0.W0);
        composeView.setContent(apo.j(871934612, new ei2(i, strR, z, this, (byte) 1), true));
        return composeView;
    }
}
