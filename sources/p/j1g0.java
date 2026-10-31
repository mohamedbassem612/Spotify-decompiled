package p;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class j1g0 extends o6 {
    public final t1g0 N0;
    public final /* synthetic */ l1g0 O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j1g0(Context context, l1g0 l1g0Var) {
        super(context, (AttributeSet) null, 6, 0);
        this.O0 = l1g0Var;
        h1g0 h1g0Var = h1g0.a;
        ViewGroup viewGroup = (ViewGroup) h1g0Var.invoke(context);
        viewGroup.setId(2131428946);
        viewGroup.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        viewGroup.setVisibility(8);
        ViewGroup viewGroup2 = (ViewGroup) h1g0Var.invoke(context);
        viewGroup2.setId(2131428960);
        viewGroup2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        viewGroup2.setVisibility(8);
        ViewGroup viewGroup3 = (ViewGroup) i1g0.a.invoke(context);
        viewGroup3.setId(2131431013);
        viewGroup3.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        viewGroup3.setVisibility(8);
        this.N0 = new t1g0(viewGroup, viewGroup2, viewGroup3);
        setViewCompositionStrategy(p5x0.W0);
        setTag(2131428196, Boolean.FALSE);
    }

    public final void a(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(-1698018405);
        l1g0 l1g0Var = this.O0;
        l1g0Var.i.b(6, apo.r(-199966082, new q0g0(l1g0Var, this, (byte) 1), x340Var), x340Var);
        x340Var.r(false);
    }

    public final t1g0 getLegacyViews() {
        return this.N0;
    }
}
