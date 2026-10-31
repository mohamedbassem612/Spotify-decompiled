package p;

import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kt41 extends sgp0 {
    public final /* synthetic */ byte b;
    public final /* synthetic */ mt41 c;

    /* JADX WARN: Illegal instructions before constructor call */
    public kt41(mt41 mt41Var, byte b) {
        this.b = b;
        switch (b) {
            case 1:
                this.c = mt41Var;
                super((Object) null);
                break;
            default:
                Boolean bool = Boolean.FALSE;
                this.c = mt41Var;
                super(bool);
                break;
        }
    }

    public final void a(mma0 mma0Var, Object obj, Object obj2) {
        lik1 lik1Var;
        byte b = 1;
        switch (this.b) {
            case 0:
                Boolean bool = (Boolean) obj2;
                if (((Boolean) obj).booleanValue() != bool.booleanValue()) {
                    xyf0 xyf0Var = (xyf0) this.c.b.b;
                    xyf0Var.g.c(xyf0.i[1], xyf0Var, bool);
                }
                break;
            default:
                mt41 mt41Var = this.c;
                eyh0 eyh0Var = mt41Var.a;
                ArrayList arrayList = mt41Var.e;
                a32 a32Var = (a32) obj2;
                if (!u890.j((a32) obj, a32Var)) {
                    ((CoordinatorLayout) eyh0Var.b).removeCallbacks(mt41Var.g);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((Function0) it.next()).invoke();
                    }
                    arrayList.clear();
                    mt41Var.a();
                    byte b2 = 0;
                    if (a32Var == null) {
                        ViewTreeObserver.OnGlobalLayoutListener x22Var = new x22(new lt41(mt41Var, b), (byte) 0);
                        ((ViewTreeObserver) eyh0Var.d).addOnGlobalLayoutListener(x22Var);
                        arrayList.add(new y4(eyh0Var, x22Var, (byte) 24));
                    } else {
                        ViewTreeObserver.OnScrollChangedListener z22Var = new z22(new ggx0(0, mt41Var, mt41.class, "updateIsScrolledToBottom", "updateIsScrolledToBottom()V", 0, (byte) 20), (byte) 0);
                        a32Var.b.addOnScrollChangedListener(z22Var);
                        arrayList.add(new y4(a32Var, z22Var, (byte) 26));
                        y22 y22Var = new y22(new lt41(mt41Var, b2), b2);
                        a32Var.a.addOnAttachStateChangeListener(y22Var);
                        arrayList.add(new y4(a32Var, y22Var, (byte) 25));
                        bn70 bn70VarA = ((war0) ((idd1) eyh0Var.c).getValue()).a();
                        String str = (bn70VarA == null || (lik1Var = bn70VarA.b) == null) ? null : lik1Var.a;
                        if (str != null) {
                            int i = a32Var.c;
                            Integer numValueOf = i != -1 ? Integer.valueOf(i) : null;
                            if (numValueOf != null) {
                                mt41Var.d.put(str, Integer.valueOf(numValueOf.intValue()));
                            }
                        }
                    }
                }
                break;
        }
    }
}
