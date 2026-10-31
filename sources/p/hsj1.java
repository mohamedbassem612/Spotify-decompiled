package p;

import com.spotify.base.java.logging.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hsj1 extends a8d1 implements dv30 {
    public /* synthetic */ ioj0 a;
    public /* synthetic */ boolean b;
    public /* synthetic */ Map c;
    public /* synthetic */ Boolean d;
    public /* synthetic */ w8c0 e;
    public final /* synthetic */ nuj1 f;
    public final /* synthetic */ msj1 g;
    public final /* synthetic */ hij1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hsj1(nuj1 nuj1Var, msj1 msj1Var, hij1 hij1Var, lnm lnmVar) {
        super(6, lnmVar);
        this.f = nuj1Var;
        this.g = msj1Var;
        this.h = hij1Var;
    }

    public final Object Y(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        msj1 msj1Var = this.g;
        hij1 hij1Var = this.h;
        hsj1 hsj1Var = new hsj1(this.f, msj1Var, hij1Var, (lnm) obj6);
        hsj1Var.a = (ioj0) obj;
        hsj1Var.b = zBooleanValue;
        hsj1Var.c = (Map) obj3;
        hsj1Var.d = (Boolean) obj4;
        hsj1Var.e = (w8c0) obj5;
        return hsj1Var.invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        goj0 goj0VarA;
        goj0 goj0VarA2;
        goj0 goj0VarA3;
        goj0 goj0VarA4;
        goj0 goj0VarA5;
        goj0 goj0VarA6;
        goj0 goj0VarA7;
        ioj0 ioj0Var = this.a;
        boolean z = this.b;
        Map map = this.c;
        Boolean bool = this.d;
        w8c0 w8c0Var = this.e;
        hm5.M(obj);
        List list = this.f.c;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            ez00 mmr0Var = null;
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            hoj0 hoj0VarC = ioj0Var.c(jo70.class, str);
            jo70 jo70Var = (jo70) ((hoj0VarC == null || (goj0VarA7 = hoj0VarC.a()) == null) ? null : (ez00) goj0VarA7.a);
            hoj0 hoj0VarC2 = ioj0Var.c(hll.class, str);
            hll hllVar = (hll) ((hoj0VarC2 == null || (goj0VarA6 = hoj0VarC2.a()) == null) ? null : (ez00) goj0VarA6.a);
            if (jo70Var == null || hllVar == null) {
                Logger.k("Dropping video preview item %s: missing %s", new Object[]{str, o7h.y0(f46.i0(new String[]{jo70Var == null ? "IdentityTrait" : null, hllVar == null ? "ConsumptionExperienceTrait" : null}), (CharSequence) null, (String) null, (String) null, (iu30) null, 63)});
            } else {
                hoj0 hoj0VarC3 = ioj0Var.c(pjw0.class, str);
                pjw0 pjw0Var = (pjw0) ((hoj0VarC3 == null || (goj0VarA5 = hoj0VarC3.a()) == null) ? null : (ez00) goj0VarA5.a);
                hoj0 hoj0VarC4 = ioj0Var.c(yo60.class, str);
                yo60 yo60Var = (yo60) ((hoj0VarC4 == null || (goj0VarA4 = hoj0VarC4.a()) == null) ? null : (ez00) goj0VarA4.a);
                hoj0 hoj0VarC5 = ioj0Var.c(zoy0.class, str);
                zoy0 zoy0Var = (zoy0) ((hoj0VarC5 == null || (goj0VarA3 = hoj0VarC5.a()) == null) ? null : (ez00) goj0VarA3.a);
                hoj0 hoj0VarC6 = ioj0Var.c(prl.class, str);
                prl prlVar = (prl) ((hoj0VarC6 == null || (goj0VarA2 = hoj0VarC6.a()) == null) ? null : (ez00) goj0VarA2.a);
                hoj0 hoj0VarC7 = ioj0Var.c(xkk1.class, str);
                if (hoj0VarC7 != null && (goj0VarA = hoj0VarC7.a()) != null) {
                    mmr0Var = (ez00) goj0VarA.a;
                }
                mmr0Var = new mmr0(str, new gvj1(jo70Var, hllVar, pjw0Var, yo60Var, zoy0Var, prlVar, (xkk1) mmr0Var));
            }
            if (mmr0Var != null) {
                arrayList.add(mmr0Var);
            }
        }
        return new aa10(sqg0.T(arrayList), z, this.g.d.b(4), map, bool != null ? bool.booleanValue() : ((Boolean) this.h.invoke(null)).booleanValue(), w8c0Var == w8c0.e ? euj1.c : duj1.c);
    }
}
