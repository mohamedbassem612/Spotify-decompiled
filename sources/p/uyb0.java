package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lp/uyb0;", "Lp/t2u;", "Lp/o6r0;", "Lp/jik1;", "src_main_java_com_spotify_leavebehindads_listpage-listpage"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class uyb0 extends t2u implements o6r0, jik1 {
    public final yg30 V1;
    public w7r0 W1;
    public ees X1;
    public final lik1 Y1;

    public uyb0(bf70 bf70Var) {
        this.V1 = bf70Var;
        e1(0, 2132018162);
        this.Y1 = nik1.X2;
    }

    public final void I0(View view, Bundle bundle) {
        View viewN = b8k1.n(view, 2131428103);
        viewN.setContentDescription(l0(2131957205));
        b8k1.m(viewN, fg.g, l0(2131957206), (sh) null);
        viewN.setOnClickListener(new zfs(this, (byte) 27));
    }

    public final n6r0 e() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return yon1.T3();
    }

    /* JADX INFO: renamed from: getViewUri, reason: from getter */
    public final lik1 getY1() {
        return this.Y1;
    }

    public final void v0(Context context) {
        yg30 yg30Var = this.V1;
        if (yg30Var != null) {
            yg30Var.f(this);
        }
        super.v0(context);
    }

    public final void w0(Bundle bundle) {
        super.w0(bundle);
        if (bundle != null) {
            Z0(false, false);
        }
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(2131625127, viewGroup, false);
        Drawable g4b1Var = new g4b1(h0(), j4b1.Q7, a8o.y(24.0f, viewGroup2.getResources()));
        g4b1Var.c(x74.E(viewGroup2.getContext(), 2131100487));
        ((ImageView) b8k1.n(viewGroup2, 2131428103)).setImageDrawable(g4b1Var);
        ees eesVar = this.X1;
        if (eesVar == null) {
            u890.C("pageLoaderViewBuilder");
            throw null;
        }
        ges gesVarA = eesVar.a(P0());
        iac0 iac0VarN0 = n0();
        w7r0 w7r0Var = this.W1;
        if (w7r0Var == null) {
            u890.C("pageLoaderScope");
            throw null;
        }
        gesVarA.E(iac0VarN0, w7r0Var.get());
        viewGroup2.addView((View) gesVarA, (ViewGroup.LayoutParams) new LinearLayout.LayoutParams(-1, -1));
        return viewGroup2;
    }

    public uyb0() {
        this(null);
    }
}
