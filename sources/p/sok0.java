package p;

import android.app.Activity;
import android.content.Context;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class sok0 {
    public final Context a;
    public final AtomicReference b = new AtomicReference();

    public sok0(Context context) {
        this.a = context;
    }

    public final Object a(a38 a38Var) {
        hfp1 hfp1VarE;
        l441 l441Var = new l441(aym.t(a38Var));
        kce1 kce1Var = kce1.b;
        lzo1 lzo1Var = (lzo1) qok0.c().a(lzo1.class);
        lce1 lce1Var = (lce1) lzo1Var.a.L0(kce1Var);
        im00 im00Var = lzo1Var.b;
        kce1Var.getClass();
        nxo1 nxo1Var = new nxo1(lce1Var, (Executor) im00Var.a.get(), ucp1.r(kce1Var.b()), kce1Var);
        o9n1 o9n1Var = new o9n1(this.a, (Activity) null, o9n1.n, mh5.k, jz40.c);
        ArrayList arrayList = new ArrayList();
        arrayList.add(nxo1Var);
        zod.j("APIs must not be empty.", !arrayList.isEmpty());
        fi5 fi5VarJ = fi5.j(arrayList, true);
        if (fi5VarJ.a.isEmpty()) {
            hfp1VarE = o0c.z(new cjm0(0, false));
        } else {
            asd1 asd1VarB = asd1.b();
            asd1VarB.a = new pl10[]{upo1.a};
            asd1VarB.b = true;
            asd1VarB.c = (char) 27304;
            asd1VarB.d = new frl1(o9n1Var, fi5VarJ, (byte) 12);
            hfp1VarE = o9n1Var.e(0, asd1VarB.a());
        }
        rok0 rok0Var = new rok0(l441Var, nxo1Var, (byte) 0);
        hfp1VarE.getClass();
        hfp1VarE.d(dsd1.a, rok0Var);
        hfp1VarE.m(new n6y(l441Var));
        return l441Var.a();
    }
}
