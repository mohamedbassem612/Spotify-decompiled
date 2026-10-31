package p;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jrk implements isw {
    public final sp00 a;
    public final v1k b;
    public final boolean c;
    public final kdn0 d = new kdn0();
    public final idd1 e = new idd1(new irk(this, (byte) 1));
    public final idd1 f = new idd1(new irk(this, (byte) 0));
    public final View g;

    public jrk(ViewGroup viewGroup, Context context, sp00 sp00Var, v1k v1kVar, boolean z) {
        this.a = sp00Var;
        this.b = v1kVar;
        this.c = z;
        View viewInflate = LayoutInflater.from(context).inflate(2131624461, viewGroup, false);
        b8k1.n(viewInflate, 2131428155).setContent(apo.j(548352911, new jjk(viewInflate, this, (byte) 3), true));
        this.g = viewInflate;
    }

    public final void a(Object obj, ysw yswVar) {
        lrk lrkVar = (lrk) obj;
        Resources resources = this.g.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(2131167023) + (this.c ? 0 : resources.getDimensionPixelSize(2131165289));
        idd1 idd1Var = this.e;
        FrameLayout frameLayout = (FrameLayout) idd1Var.getValue();
        frameLayout.setPaddingRelative(dimensionPixelSize, frameLayout.getPaddingTop(), dimensionPixelSize, frameLayout.getPaddingBottom());
        this.d.m(lrkVar);
        x360 x360VarA = lrkVar.a();
        FrameLayout frameLayout2 = (FrameLayout) idd1Var.getValue();
        frameLayout2.removeAllViews();
        if (x360VarA != null) {
            frameLayout2.addView(this.a.e(x360VarA, frameLayout2).w);
            frameLayout2.setVisibility(0);
        }
    }

    public final View getView() {
        return this.g;
    }
}
