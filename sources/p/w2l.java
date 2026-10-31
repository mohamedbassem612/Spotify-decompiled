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
public final class w2l extends bk5 {
    public final lpd V1;
    public r2l W1;

    public w2l(lpd lpdVar) {
        this.V1 = lpdVar;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        r2l r2lVar = this.W1;
        if (r2lVar == null) {
            u890.C("listener");
            throw null;
        }
        v1k v1kVar = r2lVar.g;
        i8h1 i8h1Var = (i8h1) v1kVar.b;
        x6h1 x6h1VarC = ((dsk0) v1kVar.d).b.c();
        x6h1VarC.i.add(new a7h1("close_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
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
        composeView.setContent(new j2i(501230268, new v2l(this, (byte) 2), true));
        return composeView;
    }
}
