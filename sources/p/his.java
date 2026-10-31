package p;

import android.os.Build;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class his extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ FrameLayout b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ his(FrameLayout frameLayout, byte b) {
        super(3);
        this.a = b;
        this.b = frameLayout;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        url1 prl1Var;
        byte b = this.a;
        FrameLayout frameLayout = this.b;
        switch (b) {
            case 0:
                hsl1 hsl1Var = (hsl1) obj2;
                frameLayout.setPadding(frameLayout.getPaddingLeft(), frameLayout.getPaddingTop(), frameLayout.getPaddingRight(), ((uc80) obj3).d + hsl1Var.a.i(519).d);
                return hsl1Var;
            case 1:
                hsl1 hsl1Var2 = (hsl1) obj2;
                uc80 uc80Var = (uc80) obj3;
                nk80 nk80VarI = hsl1Var2.a.i(519);
                frameLayout.setPadding(frameLayout.getPaddingLeft(), uc80Var.b + nk80VarI.b, frameLayout.getPaddingRight(), uc80Var.d + nk80VarI.d);
                return hsl1Var2;
            default:
                hsl1 hsl1Var3 = (hsl1) obj2;
                nk80 nk80VarI2 = hsl1Var3.a.i(2);
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                if (marginLayoutParams != null) {
                    int i = marginLayoutParams.leftMargin;
                    int i2 = nk80VarI2.a;
                    int i3 = nk80VarI2.c;
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (i == i2 && marginLayoutParams.rightMargin == i3) ? null : marginLayoutParams;
                    if (marginLayoutParams2 != null) {
                        marginLayoutParams2.leftMargin = i2;
                        marginLayoutParams2.rightMargin = i3;
                        frameLayout.setLayoutParams(marginLayoutParams2);
                    }
                }
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 36) {
                    prl1Var = new url1(hsl1Var3);
                } else if (i4 >= 35) {
                    prl1Var = new trl1(hsl1Var3);
                } else if (i4 >= 34) {
                    prl1Var = new srl1(hsl1Var3);
                } else if (i4 >= 31) {
                    prl1Var = new rrl1(hsl1Var3);
                } else if (i4 >= 30) {
                    prl1Var = new qrl1(hsl1Var3);
                } else {
                    prl1Var = i4 >= 29 ? new prl1(hsl1Var3) : new nrl1(hsl1Var3);
                }
                prl1Var.d(2, nk80.c(0, nk80VarI2.b, 0, nk80VarI2.d));
                return prl1Var.b();
        }
    }
}
