package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.spotify.encoreconsumermobile.elements.entityaction.EntityActionView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qcy extends LinearLayout implements tlv {
    public final t7y a;
    public final q4u b;

    public qcy(Context context) {
        super(context, null, 0);
        t7y t7yVarN = t7y.n(LayoutInflater.from(context), this);
        getRootView().setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        setOrientation(0);
        this.a = t7yVarN;
        this.b = nln.w(new q4u[]{nln.x(ocy.b, nln.v(new gcy(this, (byte) 5))), nln.x(pcy.b, nln.v(new gcy(this, (byte) 6)))});
    }

    @Override // p.mi90
    public final void f(Object obj) {
        this.b.a((ncy) obj);
    }

    @Override // p.mi90
    public final void n(iu30 iu30Var) {
        t7y t7yVar = this.a;
        ((EntityActionView) t7yVar.c).n(iu30Var);
        ((EntityActionView) t7yVar.b).n(iu30Var);
    }
}
