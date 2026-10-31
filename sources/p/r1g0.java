package p;

import android.view.ViewGroup;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class r1g0 {
    public static final /* synthetic */ mma0[] h = {new een0(r1g0.class, "systemBarsInsets", "getSystemBarsInsets()Landroidx/compose/foundation/layout/WindowInsets;", 0), new een0(r1g0.class, "mainPageInsetBottom", "getMainPageInsetBottom()I", 0), new een0(r1g0.class, "mainPageInsetBottomLegacy", "getMainPageInsetBottomLegacy()I", 0)};
    public final ViewGroup a;
    public final idd1 b = new idd1(new tzf0(this, 5));
    public final odn0 c;
    public final odn0 d;
    public final q1g0 e;
    public final q1g0 f;
    public final q1g0 g;

    public r1g0(ViewGroup viewGroup) {
        this.a = viewGroup;
        odn0 odn0Var = new odn0((byte) 1);
        WeakHashMap weakHashMap = b8k1.a;
        hsl1 hsl1VarA = s7k1.a(viewGroup);
        if (hsl1VarA != null) {
            gfn0 gfn0Var = (gfn0) ((hrr0) odn0Var.b).getValue();
            nk80 nk80VarI = hsl1VarA.a.i(519);
            mn20 mn20Var = new mn20(nk80VarI.a, nk80VarI.b, nk80VarI.c, nk80VarI.d);
            if (!u890.j(gfn0Var.e(), mn20Var)) {
                gfn0Var.f(mn20Var);
            }
        }
        this.c = odn0Var;
        this.d = odn0Var;
        viewGroup.setTag(2131429884, odn0Var);
        this.e = new q1g0(poo1.r(0, 14), this);
        this.f = new q1g0(this, (byte) 1);
        this.g = new q1g0(this, (byte) 2);
    }

    public final void a(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1785287555);
        int i2 = (x340Var.g(this) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            WeakHashMap weakHashMap = osl1.x;
            this.e.c(h[0], this, lhc.g(x340Var).g);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mbf0(this, i, (byte) 13);
        }
    }

    public final void b() {
        mma0[] mma0VarArr = h;
        mma0 mma0Var = mma0VarArr[0];
        int iC = ((erl1) ((sgp0) this.e).a).c((wat) this.b.getValue());
        mma0 mma0Var2 = mma0VarArr[1];
        int iIntValue = ((Number) ((sgp0) this.f).a).intValue();
        gfn0 gfn0Var = (gfn0) ((hrr0) this.c.c).getValue();
        nk80 nk80VarC = nk80.c(0, iC, 0, iIntValue);
        mn20 mn20Var = new mn20(nk80VarC.a, nk80VarC.b, nk80VarC.c, nk80VarC.d);
        if (!u890.j(gfn0Var.e(), mn20Var)) {
            gfn0Var.f(mn20Var);
        }
        WeakHashMap weakHashMap = b8k1.a;
        this.a.requestApplyInsets();
    }
}
