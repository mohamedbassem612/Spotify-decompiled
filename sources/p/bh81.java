package p;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bh81 extends sgp0 {
    public final /* synthetic */ byte b;
    public final /* synthetic */ fh81 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh81(fh81 fh81Var, byte b) {
        super((Object) null);
        this.b = b;
        switch (b) {
            case 2:
                this.c = fh81Var;
                super(0);
                break;
            default:
                this.c = fh81Var;
                break;
        }
    }

    public final void a(mma0 mma0Var, Object obj, Object obj2) {
        int iP;
        byte b = this.b;
        fh81 fh81Var = this.c;
        switch (b) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                if (((Boolean) obj).booleanValue() != zBooleanValue) {
                    ph81 ph81Var = fh81Var.i1;
                    if (!zBooleanValue) {
                        wnh1.H(ph81Var.a());
                    } else {
                        ph81Var.a().F();
                    }
                }
                break;
            case 1:
                th81 th81Var = (th81) obj2;
                FrameLayout frameLayout = fh81Var.v1;
                CoordinatorLayout coordinatorLayout = fh81Var.x1;
                FrameLayout frameLayout2 = fh81Var.w1;
                t8p1 t8p1Var = th81Var != null ? th81Var.c : null;
                rh81 rh81Var = t8p1Var instanceof rh81 ? (rh81) t8p1Var : null;
                frameLayout2.setOutlineProvider(rh81Var != null ? rh81Var.e : null);
                coordinatorLayout.setTag(2131431015, Boolean.valueOf((th81Var != null ? th81Var.c : null) instanceof rh81));
                int dimensionPixelSize = (th81Var != null ? th81Var.c : null) instanceof rh81 ? fh81Var.getResources().getDimensionPixelSize(2131165905) : 0;
                ViewGroup.LayoutParams layoutParams = coordinatorLayout.getLayoutParams();
                if (layoutParams == null) {
                    bhn0.i("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    int i = marginLayoutParams.topMargin;
                    marginLayoutParams.setMarginStart(dimensionPixelSize);
                    marginLayoutParams.topMargin = i;
                    marginLayoutParams.setMarginEnd(dimensionPixelSize);
                    marginLayoutParams.bottomMargin = dimensionPixelSize;
                    coordinatorLayout.setLayoutParams(marginLayoutParams);
                    ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
                    if (layoutParams2 == null) {
                        bhn0.i("null cannot be cast to non-null type androidx.drawerlayout.widget.DrawerLayout.LayoutParams");
                    } else {
                        j8v j8vVar = (j8v) layoutParams2;
                        if (th81Var != null) {
                            sh81 sh81Var = th81Var.b;
                            iP = yoi1.p((int) (fh81Var.getContext().getResources().getDisplayMetrics().widthPixels * sh81Var.a), sh81Var.b, sh81Var.c);
                        } else {
                            iP = -1;
                        }
                        ((ViewGroup.MarginLayoutParams) j8vVar).width = iP;
                        frameLayout.setLayoutParams(j8vVar);
                        fh81.w(fh81Var);
                        WeakHashMap weakHashMap = b8k1.a;
                        frameLayout.requestApplyInsets();
                    }
                }
                break;
            default:
                ((Number) obj2).intValue();
                ((Number) obj).intValue();
                fh81Var.x();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh81(Boolean bool, fh81 fh81Var) {
        super(bool);
        this.b = (byte) 0;
        this.c = fh81Var;
    }
}
