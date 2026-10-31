package p;

import android.graphics.Rect;
import android.view.View;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class z0g0 implements fkk1 {
    public static final /* synthetic */ mma0[] f = {new een0(z0g0.class, "currentKeyboardHeight", "getCurrentKeyboardHeight()I", 0), new een0(z0g0.class, "currentSystemInsets", "getCurrentSystemInsets()Landroidx/core/graphics/Insets;", 0), new een0(z0g0.class, "currentContainer", "getCurrentContainer()Lkotlin/jvm/functions/Function0;", 0)};
    public final View a;
    public final fai0 b = new fai0();
    public final y0g0 c = new y0g0(this, (byte) 0);
    public final y0g0 d = new y0g0(this, (byte) 1);
    public final y0g0 e = new y0g0(new tzf0(this, 2), this);

    public z0g0(View view, s6p0 s6p0Var, iac0 iac0Var, eua0 eua0Var, ced1 ced1Var) {
        this.a = view;
        byte b = 0;
        eua0Var.a().f(iac0Var, new w0g0(this, b));
        ced1Var.a().f(iac0Var, new x0g0(this, b));
        s6p0Var.a().f(iac0Var, new w0g0(this, (byte) 1));
    }

    public final ymd0 a() {
        return this.b;
    }

    public final void b() {
        mma0[] mma0VarArr = f;
        mma0 mma0Var = mma0VarArr[2];
        View view = (View) ((Function0) ((sgp0) this.e).a).invoke();
        mma0 mma0Var2 = mma0VarArr[0];
        int iIntValue = ((Number) ((sgp0) this.c).a).intValue();
        mma0 mma0Var3 = mma0VarArr[1];
        nk80 nk80Var = (nk80) ((sgp0) this.d).a;
        int height = view.getHeight();
        int width = view.getWidth();
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        this.b.j(new Rect(i, i2, (width + i) - nk80Var.c, iIntValue > 0 ? (height + i2) - iIntValue : height + i2));
    }
}
