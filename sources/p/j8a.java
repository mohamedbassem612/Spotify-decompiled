package p;

import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class j8a extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ View b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j8a(View view, byte b) {
        super(3);
        this.a = b;
        this.b = view;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        vrl1 prl1Var;
        byte b = this.a;
        View view = this.b;
        switch (b) {
            case 0:
                hsl1 hsl1Var = (hsl1) obj2;
                view.setPadding(view.getPaddingLeft(), ((uc80) obj3).b + hsl1Var.a.i(519).b, view.getPaddingRight(), view.getPaddingBottom());
                return hsl1Var;
            case 1:
                hsl1 hsl1Var2 = (hsl1) obj2;
                esl1 esl1Var = hsl1Var2.a;
                View viewFindViewById = view.findViewById(2131431405);
                if (viewFindViewById != null) {
                    viewFindViewById.setPadding(viewFindViewById.getPaddingLeft(), esl1Var.i(519).b, viewFindViewById.getPaddingRight(), viewFindViewById.getPaddingBottom());
                }
                view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), esl1Var.i(519).d);
                int i = Build.VERSION.SDK_INT;
                if (i >= 36) {
                    prl1Var = new url1(hsl1Var2);
                } else if (i >= 35) {
                    prl1Var = new trl1(hsl1Var2);
                } else if (i >= 34) {
                    prl1Var = new srl1(hsl1Var2);
                } else if (i >= 31) {
                    prl1Var = new rrl1(hsl1Var2);
                } else if (i >= 30) {
                    prl1Var = new qrl1(hsl1Var2);
                } else {
                    prl1Var = i >= 29 ? new prl1(hsl1Var2) : new nrl1(hsl1Var2);
                }
                prl1Var.d(519, nk80.e);
                return prl1Var.b();
            default:
                View view2 = (View) obj;
                hsl1 hsl1Var3 = (hsl1) obj2;
                view2.setPadding(view2.getPaddingLeft(), dug.k(view.getContext()) + hsl1Var3.a.i(519).b, view2.getPaddingRight(), view2.getPaddingBottom());
                return hsl1Var3;
        }
    }
}
