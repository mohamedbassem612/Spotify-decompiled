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

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class p2l extends bk5 {
    public final lpd V1;
    public r2l W1;

    public p2l(lpd lpdVar) {
        this.V1 = lpdVar;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        r2l r2lVar = this.W1;
        if (r2lVar != null) {
            r2lVar.g.A();
        } else {
            u890.C("listener");
            throw null;
        }
    }

    public final void v0(Context context) {
        this.V1.f(this);
        super/*p.t2u*/.v0(context);
    }

    public final void w0(Bundle bundle) {
        super/*p.t2u*/.w0(bundle);
        e1(0, 2132017483);
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ComposeView composeView = new ComposeView(P0(), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        composeView.setFilterTouchesWhenObscured(true);
        composeView.setContent(new j2i(-1434069633, new o2l(this, (byte) 2), true));
        return composeView;
    }
}
