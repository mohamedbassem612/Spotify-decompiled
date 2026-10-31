package p;

import android.os.Bundle;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class xts extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mxr b;
    public final /* synthetic */ lvc1 c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xts(mxr mxrVar, lvc1 lvc1Var, int i, byte b) {
        super(1);
        this.a = b;
        this.b = mxrVar;
        this.c = lvc1Var;
        this.d = i;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.d;
        lvc1 lvc1Var = this.c;
        mxr mxrVar = this.b;
        switch (b) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                if (((Integer) mxrVar.c) == null) {
                    ViewPager2 viewPager2 = (ViewPager2) lvc1Var.d;
                    if (!viewPager2.isLaidOut() || viewPager2.isLayoutRequested()) {
                        viewPager2.addOnLayoutChangeListener(new zts(lvc1Var, iIntValue, (byte) 0));
                    } else {
                        viewPager2.setCurrentItem(iIntValue);
                    }
                    View view = (View) mxrVar.b;
                    if (view != null) {
                        view.setVisibility(iIntValue == i ? 0 : 8);
                    }
                    mxrVar.c = Integer.valueOf(iIntValue);
                }
                break;
            default:
                Bundle bundle = (Bundle) obj;
                if (bundle.containsKey("selectedPosition")) {
                    int i2 = bundle.getInt("selectedPosition");
                    ViewPager2 viewPager3 = (ViewPager2) lvc1Var.d;
                    if (!viewPager3.isLaidOut() || viewPager3.isLayoutRequested()) {
                        viewPager3.addOnLayoutChangeListener(new zts(lvc1Var, i2, (byte) 0));
                    } else {
                        viewPager3.setCurrentItem(i2);
                    }
                    View view2 = (View) mxrVar.b;
                    if (view2 != null) {
                        view2.setVisibility(i2 == i ? 0 : 8);
                    }
                    mxrVar.c = Integer.valueOf(i2);
                }
                break;
        }
        return rih1Var;
    }
}
