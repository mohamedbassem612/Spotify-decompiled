package p;

import android.view.View;
import androidx.recyclerview.widget.a;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class sm90 extends xic0 {
    public final /* synthetic */ byte g = 0;
    public Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sm90(ViewPager2 viewPager2) {
        super((byte) 1);
        this.h = viewPager2;
    }

    public int[] c(a aVar, View view) {
        switch (this.g) {
            case 0:
                int[] iArr = new int[2];
                uqq0 uqq0Var = (uqq0) this.h;
                if (uqq0Var == null) {
                    uqq0Var = new uqq0(aVar);
                    this.h = uqq0Var;
                }
                iArr[0] = (aVar.S() == 1 ? uqq0Var.d(view) : uqq0Var.g(view)) - (aVar.S() == 1 ? aVar.O0 : 0);
                return iArr;
            default:
                return super.c(aVar, view);
        }
    }

    public final View i(a aVar) {
        switch (this.g) {
            case 0:
                uqq0 uqq0Var = (uqq0) this.h;
                if (uqq0Var == null) {
                    uqq0Var = new uqq0(aVar);
                    this.h = uqq0Var;
                }
                View view = null;
                if (aVar != null && aVar.I() != 0) {
                    int I = aVar.I();
                    int i = aVar.S() == 1 ? aVar.O0 : 0;
                    int i2 = Integer.MAX_VALUE;
                    for (int i3 = 0; i3 < I; i3++) {
                        View viewH = aVar.H(i3);
                        int iAbs = Math.abs((aVar.S() == 1 ? uqq0Var.d(viewH) : uqq0Var.g(viewH)) - i);
                        if (iAbs < i2) {
                            view = viewH;
                            i2 = iAbs;
                        }
                    }
                }
                return view;
            default:
                ((ViewPager2) this.h).Q0.getClass();
                return super.i(aVar);
        }
    }

    public /* synthetic */ sm90() {
        super((byte) 1);
    }
}
