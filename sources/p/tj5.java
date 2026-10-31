package p;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class tj5 extends rek1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tj5(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void d(View view) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                yj5 yj5Var = ((sj5) obj).b;
                yj5Var.U0.setAlpha(1.0f);
                yj5Var.X0.f((qek1) null);
                yj5Var.X0 = null;
                break;
            case 1:
                yj5 yj5Var2 = (yj5) obj;
                yj5Var2.U0.setAlpha(1.0f);
                yj5Var2.X0.f((qek1) null);
                yj5Var2.X0 = null;
                break;
            default:
                yj5 yj5Var3 = (yj5) ((em3) obj).c;
                yj5Var3.U0.setVisibility(8);
                PopupWindow popupWindow = yj5Var3.V0;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (yj5Var3.U0.getParent() instanceof View) {
                    View view2 = (View) yj5Var3.U0.getParent();
                    WeakHashMap weakHashMap = b8k1.a;
                    view2.requestApplyInsets();
                }
                yj5Var3.U0.e();
                yj5Var3.X0.f((qek1) null);
                yj5Var3.X0 = null;
                ViewGroup viewGroup = yj5Var3.Z0;
                WeakHashMap weakHashMap2 = b8k1.a;
                viewGroup.requestApplyInsets();
                break;
        }
    }

    @Override // p.rek1
    public void e() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((sj5) obj).b.U0.setVisibility(0);
                break;
            case 1:
                yj5 yj5Var = (yj5) obj;
                yj5Var.U0.setVisibility(0);
                if (yj5Var.U0.getParent() instanceof View) {
                    View view = (View) yj5Var.U0.getParent();
                    WeakHashMap weakHashMap = b8k1.a;
                    view.requestApplyInsets();
                }
                break;
        }
    }
}
