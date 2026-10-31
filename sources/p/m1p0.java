package p;

import android.content.Context;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class m1p0 {
    public static final /* synthetic */ mma0[] f = {new een0(m1p0.class, "nowPlayingBarBaseHeight", "getNowPlayingBarBaseHeight()I", 0)};
    public final dx0 a;
    public final boolean b;
    public final idd1 c;
    public final lb5 d;
    public final ce0 e;

    public m1p0(dx0 dx0Var, Context context, i8h1 i8h1Var, l6h1 l6h1Var, boolean z) {
        this.a = dx0Var;
        this.b = z;
        idd1 idd1Var = new idd1(new s2n0(this, context, (byte) 25));
        this.c = idd1Var;
        lb5 lb5Var = new lb5(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, context.getResources().getDimensionPixelSize(2131166762));
        layoutParams.bottomMargin = context.getResources().getDimensionPixelSize(2131166041) - ((Number) idd1Var.getValue()).intValue();
        lb5Var.setLayoutParams(layoutParams);
        lb5Var.setCollapsed(true);
        lb5Var.b = new ivn0(lb5Var, (byte) 15);
        this.d = lb5Var;
        this.e = new ce0(Integer.valueOf(context.getResources().getDimensionPixelSize(2131166041)), this, (byte) 17);
        op80 jp80Var = new jp80(lb5Var);
        op80 eq80Var = new eq80(new e3h1(l6h1Var, (n7h1) null, i8h1Var));
        op80 wchVar = q6x.b;
        if (jp80Var.equals(wchVar) && eq80Var.equals(wchVar)) {
            jp80Var = wchVar;
        } else if (jp80Var.equals(wchVar)) {
            jp80Var = eq80Var;
        } else if (!eq80Var.equals(wchVar)) {
            wchVar = new wch(jp80Var, eq80Var);
            jp80Var = wchVar;
        }
        xhk1.c(lb5Var, jp80Var);
    }
}
