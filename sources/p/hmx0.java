package p;

import android.view.View;
import android.view.ViewGroup;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hmx0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ imx0 b;

    public /* synthetic */ hmx0(imx0 imx0Var, byte b) {
        this.a = b;
        this.b = imx0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        View view2;
        byte b = this.a;
        imx0 imx0Var = this.b;
        switch (b) {
            case 0:
                if (imx0Var.g) {
                    String str = imx0Var.h;
                    if (str != null) {
                        imx0Var.a.a = str;
                    }
                    i8h1 i8h1Var = imx0Var.b;
                    x6h1 x6h1VarC = imx0Var.c.a.c();
                    x6h1VarC.i.add(new a7h1("horizontal_layout", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    x6h1 x6h1VarC2 = x6h1VarC.a().c();
                    x6h1VarC2.i.add(new a7h1("promotional_label", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = true;
                    y6h1 y6h1VarA = x6h1VarC2.a();
                    k7h1 k7h1Var = new k7h1();
                    ((xjn) k7h1Var).a = y6h1VarA;
                    ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                    i8h1Var.f(k7h1Var.a(), (Set) null);
                }
                imx0Var.b();
                break;
            default:
                ViewGroup viewGroup = imx0Var.d;
                if (viewGroup != null && (view = imx0Var.e) != null && (view2 = imx0Var.f) != null && imx0Var.g) {
                    fjg1.a(viewGroup, imx0Var.a(view, view2));
                    view.setVisibility(4);
                    view2.setVisibility(0);
                }
                break;
        }
    }
}
