package p;

import io.reactivex.rxjava3.functions.Consumer;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class aqm1 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dqm1 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ aqm1(dqm1 dqm1Var, String str, String str2, byte b) {
        this.a = b;
        this.b = dqm1Var;
        this.c = str;
        this.d = str2;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        String str = this.d;
        String str2 = this.c;
        dqm1 dqm1Var = this.b;
        switch (b) {
            case 0:
                ypm1 ypm1Var = (ypm1) obj;
                dqm1Var.a.d(str2, str);
                if (!ypm1Var.a) {
                    xpm1 xpm1Var = ypm1Var.b;
                    if (xpm1Var instanceof vpm1) {
                        zpm1 zpm1Var = ((vpm1) xpm1Var).a;
                        dqm1Var.k.a(cfr.b(dqm1Var.c, Collections.singletonList(zpm1Var.b), this.d, Collections.singletonList(zpm1Var.a), z6x.a, this.d).subscribe());
                    }
                } else {
                    ix7 ix7Var = dqm1Var.i;
                    kt91 kt91Var = (kt91) ix7Var.b;
                    Set set = s4b1.f;
                    String strZ = uic.A(uic.x(str).h()).z();
                    if (strZ == null) {
                        hhg1.n("Required value was null.");
                    } else {
                        i8h1 i8h1Var = ((lt8) ix7Var.d).a;
                        r6h1 r6h1Var = r6h1.c;
                        y6h1 y6h1Var = y6h1.i;
                        x6h1 x6h1VarI = i3o1.i();
                        x6h1VarI.h = "music";
                        x6h1VarI.a = "mobile-auto-download-snackbar";
                        x6h1VarI.f = "1.0.0";
                        x6h1VarI.g = "22.0.0";
                        x6h1VarI.d = str;
                        x6h1 x6h1VarC = x6h1VarI.a().c();
                        x6h1VarC.i.add(new a7h1("onboarding_snackbar", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC.j = true;
                        y6h1 y6h1VarA = x6h1VarC.a();
                        k7h1 k7h1Var = new k7h1();
                        ((xjn) k7h1Var).a = y6h1VarA;
                        ((xjn) k7h1Var).b = r6h1Var;
                        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                        i8h1Var.f(k7h1Var.a(), (Set) null);
                        n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131952671});
                        n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                        n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131952671});
                        er91 er91Var = new er91((fs91) null, "", 2131952671, (String) null, 2131952670, new kw6(ix7Var, strZ, str, (byte) 1), (cvr) null, (xq91) null, false);
                        if (!kt91Var.g()) {
                            kt91Var.o(er91Var);
                        } else {
                            kt91Var.k(er91Var);
                        }
                    }
                }
                break;
            default:
                dqm1Var.a.d(str2, str);
                break;
        }
    }
}
