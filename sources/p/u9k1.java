package p;

import android.os.Bundle;
import android.view.View;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class u9k1 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v9k1 b;

    public /* synthetic */ u9k1(v9k1 v9k1Var, byte b) {
        this.a = b;
        this.b = v9k1Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        v9k1 v9k1Var = this.b;
        switch (b) {
            case 0:
                v9k1Var.b.e();
                break;
            case 1:
                a9k1 a9k1Var = (a9k1) obj;
                v9k1Var.b.a(a9k1Var.a, a9k1Var.b, (Bundle) null);
                break;
            case 2:
                g9k1 g9k1Var = (g9k1) obj;
                d520 d520Var = v9k1Var.c;
                lik1 lik1Var = (lik1) d520Var.b;
                String strF = v9k1Var.a.F();
                if (strF == null) {
                    strF = "";
                }
                boolean z = g9k1Var.a;
                tv80 tv80Var = g9k1Var.b;
                fm6 fm6Var = new fm6(strF, lik1Var, null, new bm6(false, false, false, z, false, (ok51) null, false, (p860) null, 1928));
                if (!((em6) d520Var.g).a.a()) {
                    mfm mfmVarA = ((i4q) d520Var.e).a(lik1Var);
                    Observable observableA = ((js6) d520Var.d).a(fm6Var);
                    AtomicReferenceArray atomicReferenceArray = p6r0.e;
                    mfm.b(mfmVarA, observableA, yon1.G0(), new bjm(6, strF, (String) null), tv80Var, 16);
                } else {
                    ((yhm) d520Var.f).a(fm6Var, tv80Var);
                }
                break;
            case 3:
                q9k1 q9k1Var = (q9k1) obj;
                d520 d520Var2 = v9k1Var.c;
                String str = q9k1Var.a;
                tv80 tv80Var2 = q9k1Var.b;
                lik1 lik1Var2 = (lik1) d520Var2.b;
                dmf1 dmf1Var = new dmf1(str, lik1Var2, (String) null, new vsf1((String) null, (String) null, false, (String) null, false, false, true, false, false, false, (String) null, false, false, false, true, false, (ugo0) null, (ok51) null, false, (g371) null, false, false, false, false, false, false, false, false, (p860) null, (String) null, false, false, -32833, 63), b7x.a);
                if (!((bmf1) d520Var2.h).a.a()) {
                    mfm mfmVarA2 = ((i4q) d520Var2.e).a(lik1Var2);
                    Observable observableD = ((jsf1) d520Var2.c).d(dmf1Var);
                    AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
                    mfm.b(mfmVarA2, observableD, yon1.G0(), new bjm(6, str, (String) null), tv80Var2, 16);
                } else {
                    ((yhm) d520Var2.f).a(dmf1Var, tv80Var2);
                }
                break;
            case 4:
                r8k1 r8k1Var = (r8k1) obj;
                vb2.b(v9k1Var.d, new db2(r8k1Var.a), true, r8k1Var.b);
                break;
            default:
                kt91 kt91Var = v9k1Var.e;
                ((o9k1) obj).getClass();
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131953979});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                kt91Var.k(new er91((fs91) null, "", 2131953979, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                break;
        }
    }
}
