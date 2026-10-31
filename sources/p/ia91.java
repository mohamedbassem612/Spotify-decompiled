package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ia91 extends dwb {
    public final hq81 V1;
    public n381 W1;
    public y991 X1;

    public ia91(hq81 hq81Var) {
        this.V1 = hq81Var;
    }

    public final int b1() {
        return 2132017861;
    }

    public final void v0(Context context) {
        this.V1.f(this);
        super/*p.t2u*/.v0(context);
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        n381 n381Var = this.W1;
        if (n381Var == null) {
            u890.C("logger");
            throw null;
        }
        n381Var.l();
        View viewInflate = layoutInflater.inflate(2131626168, viewGroup, false);
        viewInflate.findViewById(2131427827).setOnClickListener(new gl61(this, (byte) 2));
        ((ImageView) viewInflate.findViewById(2131429075)).setVisibility(0);
        return viewInflate;
    }
}
