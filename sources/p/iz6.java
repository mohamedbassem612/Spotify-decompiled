package p;

import android.content.Context;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class iz6 implements oi51 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public iz6(p9p p9pVar, neq neqVar, abm abmVar, xf4 xf4Var) {
        this.a = (byte) 4;
        this.b = p9pVar;
        this.d = neqVar;
        this.e = abmVar;
        this.c = xf4Var;
    }

    public final void a(ji50 ji50Var, tcr0 tcr0Var) {
        byte b = this.a;
        pcr0 pcr0Var = pcr0.a;
        qcr0 qcr0Var = qcr0.a;
        Object obj = this.d;
        kcr0 kcr0Var = kcr0.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        Object obj4 = this.e;
        switch (b) {
            case 0:
                mu6 mu6Var = new mu6(this, (byte) 3);
                q4o.D.getClass();
                Set set = n4o.b;
                ji50Var.b.put(pfr0.class, r4o1.Q(fz6.Y, set, mu6Var, ad5.d1));
                break;
            case 1:
                jqb0 jqb0Var = new jqb0();
                jqb0Var.b = new qbo0();
                ji50Var.b.put(wer0.class, new r3r(new xzq(new sb00(((zei0) obj).a(ji50Var.a, new p410(new g050(this, (byte) 14), (kko) tcr0Var.a(kcr0Var), (ojv0) obj4, jqb0Var, (p731) null, (vu30) null, 112), new uei0(false, new har0(((Context) obj2).getResources().getDimensionPixelSize(2131167023)), false, false, false, false, true, false, false, 7672), new wei0(false, false, 12)), jqb0Var), w760.a), oq50.Y, 4));
                break;
            case 2:
                String str = ((vfr0) tcr0Var.a(qcr0Var)).a;
                stt0 stt0Var = (stt0) tcr0Var.a(pcr0Var);
                ms11 ms11VarQ = ((zl5) obj2).q(str, ((b7r0) obj3).get(), (kko) tcr0Var.a(kcr0Var), stt0Var);
                xaf1 xaf1Var = new xaf1(this, ms11VarQ, (byte) 4);
                xj61 xj61Var = new xj61();
                xj61Var.addAll((Set) ms11VarQ.l.b);
                if (((abm) obj4).a()) {
                    xj61Var.add(new yp21(bql.class));
                }
                xj61 xj61VarJ = cwl1.j(xj61Var);
                ji50Var.b.put(kfr0.class, r4o1.Q(udf1.g, xj61VarJ, xaf1Var, ggf1.b));
                break;
            case 3:
                ms11 ms11VarQ2 = ((zl5) obj2).q(((vfr0) tcr0Var.a(qcr0Var)).a, ((b7r0) obj3).get(), (kko) tcr0Var.a(kcr0Var), (btt0) tcr0Var.a(pcr0Var));
                juc1 juc1Var = new juc1(this, ms11VarQ2, new up41(this, (byte) 29), (byte) 24);
                xj61 xj61Var2 = new xj61();
                xj61Var2.addAll((Set) ms11VarQ2.l.b);
                if (((abm) obj4).a()) {
                    xj61Var2.add(new yp21(bql.class));
                }
                xj61 xj61VarJ2 = cwl1.j(xj61Var2);
                ji50Var.b.put(mfr0.class, r4o1.Q(iwf1.S0, xj61VarJ2, juc1Var, ggf1.N0));
                break;
            default:
                LinkedHashMap linkedHashMap = ji50Var.b;
                if (!((xf4) obj3).k()) {
                    wcf1 wcf1Var = new wcf1(this, (byte) 26);
                    xj61 xj61Var3 = new xj61();
                    xj61Var3.addAll(onh1.i);
                    if (((abm) obj4).a()) {
                        xj61Var3.add(onh1.t);
                    }
                    linkedHashMap.put(nfr0.class, r4o1.Q(qmh1.U0, cwl1.j(xj61Var3), wcf1Var, lbg1.X0));
                } else {
                    linkedHashMap.put(nfr0.class, new r3r(new xzq(((neq) obj).a(ji50Var.a), qmh1.S0), lbg1.W0, 4));
                }
                break;
        }
    }

    public final Class b() {
        switch (this.a) {
            case 0:
                return pfr0.class;
            case 1:
                return wer0.class;
            case 2:
                return kfr0.class;
            case 3:
                return mfr0.class;
            default:
                return nfr0.class;
        }
    }

    public final Set c() {
        byte b = this.a;
        pcr0 pcr0Var = pcr0.a;
        qcr0 qcr0Var = qcr0.a;
        jcr0 jcr0Var = jcr0.a;
        w7x w7xVar = w7x.a;
        kcr0 kcr0Var = kcr0.a;
        switch (b) {
            case 0:
                return w7xVar;
            case 1:
                return Collections.singleton(new scr0(kcr0Var, v160.W0));
            case 2:
                return f46.S0(new scr0[]{new scr0(jcr0Var, udf1.h), new scr0(qcr0Var, udf1.i), new scr0(pcr0Var, udf1.t), new scr0(kcr0Var, udf1.X)});
            case 3:
                return f46.S0(new scr0[]{new scr0(jcr0Var, iwf1.T0), new scr0(qcr0Var, iwf1.U0), new scr0(pcr0Var, iwf1.V0), new scr0(kcr0Var, iwf1.W0)});
            default:
                return w7xVar;
        }
    }

    public /* synthetic */ iz6(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
