package p;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class a7x0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ RecyclerView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a7x0(RecyclerView recyclerView, byte b) {
        super(3);
        this.a = b;
        this.b = recyclerView;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        gfn0 gfn0VarA;
        byte b = this.a;
        RecyclerView recyclerView = this.b;
        switch (b) {
            case 0:
                hsl1 hsl1Var = (hsl1) obj2;
                recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), hsl1Var.a.i(2).d);
                return hsl1Var;
            default:
                View view = (View) obj;
                hsl1 hsl1Var2 = (hsl1) obj2;
                uc80 uc80Var = (uc80) obj3;
                rzf0 rzf0VarB = szf0.b(view);
                Integer numValueOf = (rzf0VarB == null || (gfn0VarA = rzf0VarB.a()) == null) ? null : Integer.valueOf(gfn0VarA.d(z1a1.b(view.getContext())));
                recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), uc80Var.d + (numValueOf != null ? numValueOf.intValue() : hsl1Var2.a.i(519).d));
                return hsl1Var2;
        }
    }
}
