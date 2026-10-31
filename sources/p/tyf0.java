package p;

import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import com.spotify.mainlayout.ui.view.MainLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tyf0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ MainLayout b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tyf0(MainLayout mainLayout, byte b) {
        super(1);
        this.a = b;
        this.b = mainLayout;
    }

    public final Object invoke(Object obj) {
        int iMax;
        nk80 nk80VarC;
        byte b = this.a;
        MainLayout mainLayout = this.b;
        switch (b) {
            case 0:
                return Boolean.valueOf(super/*android.view.View*/.dispatchTouchEvent((MotionEvent) obj));
            case 1:
                vzf0 vzf0Var = mainLayout.F1;
                hwb hwbVar = vzf0.i;
                gfn0 gfn0Var = (gfn0) vzf0Var.c.d;
                wat watVar = (wat) vzf0Var.b.getValue();
                hwbVar.getClass();
                return hwb.A((WindowInsets) obj, nk80.c(0, gfn0Var.c(watVar), 0, gfn0Var.d(watVar)));
            default:
                WindowInsets windowInsets = (WindowInsets) obj;
                vzf0 vzf0Var2 = mainLayout.F1;
                hwb hwbVar2 = vzf0.i;
                int iOrdinal = vzf0Var2.a.getMode().ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    nk80 nk80VarI = hsl1.g((View) null, windowInsets).a.i(519);
                    if (vzf0.k) {
                        int i = nk80VarI.d;
                        ce0 ce0Var = vzf0Var2.g;
                        mma0 mma0Var = vzf0.j[2];
                        iMax = Math.max(i, ((Number) ((sgp0) ce0Var).a).intValue());
                    } else {
                        iMax = 0;
                    }
                    nk80VarC = nk80.c(0, nk80VarI.b, 0, iMax);
                } else {
                    if (iOrdinal != 2) {
                        eg.o();
                        return null;
                    }
                    gfn0 gfn0Var2 = (gfn0) vzf0Var2.c.c;
                    wat watVar2 = (wat) vzf0Var2.b.getValue();
                    hwbVar2.getClass();
                    nk80VarC = nk80.c(0, gfn0Var2.c(watVar2), 0, gfn0Var2.d(watVar2));
                }
                hwbVar2.getClass();
                return hwb.A(windowInsets, nk80VarC);
        }
    }
}
