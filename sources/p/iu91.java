package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class iu91 extends a8d1 implements vu30 {
    public final /* synthetic */ drr0 X;
    public final /* synthetic */ adn a;
    public final /* synthetic */ float b;
    public final /* synthetic */ ven0 c;
    public final /* synthetic */ ven0 d;
    public final /* synthetic */ ven0 e;
    public final /* synthetic */ ven0 f;
    public final /* synthetic */ ven0 g;
    public final /* synthetic */ ven0 h;
    public final /* synthetic */ ven0 i;
    public final /* synthetic */ drr0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iu91(adn adnVar, float f, ven0 ven0Var, ven0 ven0Var2, ven0 ven0Var3, ven0 ven0Var4, ven0 ven0Var5, ven0 ven0Var6, ven0 ven0Var7, drr0 drr0Var, drr0 drr0Var2, lnm lnmVar) {
        super(2, lnmVar);
        this.a = adnVar;
        this.b = f;
        this.c = ven0Var;
        this.d = ven0Var2;
        this.e = ven0Var3;
        this.f = ven0Var4;
        this.g = ven0Var5;
        this.h = ven0Var6;
        this.i = ven0Var7;
        this.t = drr0Var;
        this.X = drr0Var2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new iu91(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        iu91 iu91VarCreate = create((c9n) obj, (lnm) obj2);
        rih1 rih1Var = rih1.a;
        iu91VarCreate.invokeSuspend(rih1Var);
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        mmr0 mmr0Var;
        float f;
        hm5.M(obj);
        adn adnVar = this.a;
        yy30 yy30Var = adnVar.e;
        zhd zhdVar = adnVar.g;
        yy30 yy30Var2 = yy30.c;
        ven0 ven0Var = this.g;
        if (yy30Var == yy30Var2) {
            this.c.setValue(adnVar.N0);
            this.d.setValue(zhdVar);
            ven0 ven0Var2 = this.e;
            this.f.setValue(Integer.valueOf(((List) ven0Var2.getValue()).size()));
            avs0 avs0Var = null;
            if (zhdVar != null) {
                hg50 hg50Var = zhdVar.a;
                mmr0Var = new mmr0(new Float(hg50Var.a), new Float(hg50Var.b));
            } else {
                mmr0Var = null;
            }
            List list = (List) ven0Var2.getValue();
            cqz0 cqz0Var = dqz0.a;
            List list2 = list;
            ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
            Iterator it = list2.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                f = this.b;
                if (!zHasNext) {
                    break;
                }
                mmr0 mmr0Var2 = (mmr0) it.next();
                float fFloatValue = ((Number) mmr0Var2.a).floatValue();
                float f2 = f / 2.0f;
                float fFloatValue2 = (((Number) mmr0Var2.b).floatValue() * f) + f2;
                e9 e9Var = dqz0.b;
                arrayList.add(new avs0((fFloatValue * f) + f2, fFloatValue2, (e9Var.e() * 100.0f) - 50.0f, (e9Var.e() * 100.0f) - 50.0f, 0.0f, ((e9Var.e() * 2.0f) - 1.0f) * 57.3f));
            }
            if (mmr0Var != null) {
                float fFloatValue3 = ((Number) mmr0Var.a).floatValue();
                float fFloatValue4 = ((Number) mmr0Var.b).floatValue();
                float f3 = f / 2.0f;
                e9 e9Var2 = dqz0.b;
                avs0Var = new avs0((fFloatValue3 * f) + f3, (fFloatValue4 * f) + f3, (e9Var2.e() * 100.0f) - 50.0f, (e9Var2.e() * 100.0f) - 50.0f, 0.0f, ((e9Var2.e() * 2.0f) - 1.0f) * 57.3f);
            }
            if (avs0Var != null) {
                arrayList = o7h.O0(avs0Var, arrayList);
            }
            ven0Var.setValue(arrayList);
            this.h.setValue(Boolean.FALSE);
            ven0 ven0Var3 = this.i;
            ven0Var3.setValue(Integer.valueOf(((Number) ven0Var3.getValue()).intValue() + 1));
        } else if (yy30Var != yy30.d) {
            ven0Var.setValue(z6x.a);
            this.t.t(0.0f);
            this.X.t(1300.0f);
        }
        return rih1.a;
    }
}
