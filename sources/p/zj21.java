package p;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zj21 extends bk5 {
    public final jf11 V1;
    public ck21 W1;
    public ik21 X1;

    public zj21(jf11 jf11Var) {
        this.V1 = jf11Var;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        ik21 ik21Var = this.X1;
        if (ik21Var == null) {
            u890.C("callbacks");
            throw null;
        }
        ik21Var.i.c();
        ik21Var.h = null;
    }

    public final void v0(Context context) {
        ck21 ck21Var;
        this.V1.f(this);
        Bundle bundle = ((zf30) this).f;
        if (bundle == null || (ck21Var = (ck21) bundle.getParcelable("model")) == null) {
            ck21Var = ck21.e;
        }
        this.W1 = ck21Var;
        super/*p.t2u*/.v0(context);
    }

    public final void w0(Bundle bundle) {
        super/*p.t2u*/.w0(bundle);
        e1(0, 2132017794);
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ComposeView composeView = new ComposeView(P0(), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        composeView.setFilterTouchesWhenObscured(true);
        composeView.setContent(apo.j(-562624589, new yj21(this, (byte) 2), true));
        return composeView;
    }
}
