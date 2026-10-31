package p;

import android.content.Context;
import android.os.Build;
import android.view.View;
import com.spotify.allboarding.allboardingimpl.presentation.contentpicker.ContentPickerFragment;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jp5 implements rjp0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jp5(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final void b(Object obj) {
        goj0 goj0VarA;
        byte b = this.a;
        k910 k910VarA = null;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                o1f0 o1f0Var = (o1f0) obj;
                nxa1 nxa1Var = (nxa1) ((kdn0) obj3).e();
                if (nxa1Var == null) {
                    nxa1Var = nxa1.a;
                }
                kp5 kp5Var = (kp5) obj2;
                fai0 fai0Var = (fai0) kp5Var.g;
                o1f0Var.getClass();
                kp5Var.q(fai0Var, nxa1Var, o1f0Var);
                break;
            case 1:
                uy30 uy30Var = ((gpk) obj3).a;
                hoj0 hoj0VarC = ((ioj0) obj).c(s5k.class, uy30Var.d);
                s5k s5kVar = (hoj0VarC == null || (goj0VarA = hoj0VarC.a()) == null) ? null : (s5k) goj0VarA.a;
                ((mpk) ((spk) obj2).e).a(new uy30(s5kVar != null ? s5kVar.a : uy30Var.a, uy30Var.b, uy30Var.c, null));
                break;
            case 2:
                tam0 tam0Var = (tam0) obj;
                a4m a4mVarD1 = ((ContentPickerFragment) obj3).d1();
                String str = tam0Var.a;
                qpl qplVar = tam0Var.b;
                a4mVarD1.U(new qzl(new gxs0(str, 0, qplVar, false, qplVar.d, 64)));
                fe41 fe41Var = (fe41) obj2;
                fe41Var.b.N("searchResult_mobius");
                ee41 ee41Var = (ee41) fe41Var.a.remove("searchResult_mobius");
                if (ee41Var != null) {
                    ee41Var.n();
                }
                break;
            case 3:
                war0 war0Var = (war0) obj;
                rjp0 rjp0Var = (rjp0) obj2;
                p811 p811Var = (p811) obj3;
                if (!u890.j(war0Var, p811Var.a)) {
                    war0 war0Var2 = (war0) p811Var.a;
                    if (war0Var2 != null) {
                        war0Var2.c(rjp0Var);
                    }
                    p811Var.a = war0Var;
                }
                if (war0Var == null) {
                    rjp0Var.b((Object) null);
                } else {
                    war0Var.d(rjp0Var);
                }
                break;
            case 4:
                if (obj == null) {
                    n57.g("Source should not emit null values", new Throwable("Source should not emit null values", (Throwable) obj2));
                } else {
                    ((fai0) obj3).m(obj);
                }
                break;
            case 5:
                dbr0 dbr0Var = (dbr0) obj;
                ii10 ii10Var = (ii10) obj3;
                if (dbr0Var == null) {
                    ii10Var.Y = true;
                    if (ii10Var.Z) {
                        ii10Var.m(((ji10) obj2).b.a());
                    }
                } else {
                    ii10Var.Y = false;
                    ii10Var.m(dbr0Var);
                }
                break;
            case 6:
                if (obj != null) {
                    ((fai0) obj3).m(((vq80) obj2).invoke(obj));
                }
                break;
            case 7:
                fai0 fai0Var2 = (fai0) obj3;
                mmj0 mmj0Var = (mmj0) fai0Var2.e();
                if (mmj0Var != null) {
                    Object objE = ((y8n) obj2).e();
                    omj0 omj0Var = objE instanceof omj0 ? (omj0) objE : null;
                    k910VarA = mmj0.a(mmj0Var, false, (hy50) null, omj0Var != null ? omj0Var.a : null, false, false, 55);
                }
                fai0Var2.m(k910VarA);
                break;
            case 8:
                bt21 bt21Var = (bt21) obj;
                if (bt21Var != null && bt21Var.a) {
                    if (Build.VERSION.SDK_INT < 30) {
                        ((t1n0) obj2).N0().getWindow().setSoftInputMode(16);
                    } else {
                        ((View) obj3).setOnApplyWindowInsetsListener(gg7.d);
                    }
                    break;
                }
                break;
            case 9:
                iix0 iix0Var = (iix0) ((whx0) obj).a.get(((uv11) obj3).a);
                fai0 fai0Var3 = (fai0) obj2;
                k910 k910Var = (k910) fai0Var3.e();
                if (!u890.j(k910Var != null ? k910Var.c : null, iix0Var)) {
                    k910 k910Var2 = (k910) fai0Var3.e();
                    fai0Var3.m(k910Var2 != null ? k910.a(k910Var2, (t6g1) null, (dt11) null, iix0Var, (n6u) null, false, (rrt0) null, false, false, false, (Double) null, (me2) null, 8187) : null);
                }
                break;
            case 10:
                if (obj != null) {
                    ((fai0) obj3).m(((nt01) obj2).invoke(obj));
                }
                break;
            default:
                ((fai0) obj3).m(jnc1.a((k1r) obj, (Context) obj2));
                break;
        }
    }
}
