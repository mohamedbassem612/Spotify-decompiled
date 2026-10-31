package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ddm extends a8d1 implements bv30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ boolean b;
    public /* synthetic */ boolean c;
    public /* synthetic */ Object d;
    public /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ddm(Object obj, lnm lnmVar, byte b) {
        super(5, lnmVar);
        this.a = b;
        this.f = obj;
    }

    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj6 = this.f;
        switch (b) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
                ddm ddmVar = new ddm((wcm) obj6, (lnm) obj5, (byte) 0);
                ddmVar.b = zBooleanValue;
                ddmVar.d = (Boolean) obj2;
                ddmVar.e = (Map) obj3;
                ddmVar.c = zBooleanValue2;
                return ddmVar.invokeSuspend(rih1Var);
            case 1:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                boolean zBooleanValue4 = ((Boolean) obj2).booleanValue();
                ddm ddmVar2 = new ddm((git0) obj6, (lnm) obj5, (byte) 1);
                ddmVar2.b = zBooleanValue3;
                ddmVar2.c = zBooleanValue4;
                ddmVar2.d = (kit0) obj3;
                ddmVar2.e = (oit0) obj4;
                return ddmVar2.invokeSuspend(rih1Var);
            default:
                boolean zBooleanValue5 = ((Boolean) obj3).booleanValue();
                boolean zBooleanValue6 = ((Boolean) obj4).booleanValue();
                ddm ddmVar3 = new ddm((y861) obj6, (lnm) obj5, (byte) 2);
                ddmVar3.d = (String) obj;
                ddmVar3.e = (ioj0) obj2;
                ddmVar3.b = zBooleanValue5;
                ddmVar3.c = zBooleanValue6;
                return ddmVar3.invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00a1  */
    public final Object invokeSuspend(Object obj) {
        cdz cdzVar;
        goj0 goj0VarA;
        mdz mdzVar;
        goj0 goj0VarA2;
        byte b = this.a;
        ddz hit0Var = null;
        Object obj2 = this.f;
        switch (b) {
            case 0:
                boolean z = this.b;
                Boolean bool = (Boolean) this.d;
                Map map = (Map) this.e;
                boolean z2 = this.c;
                hm5.M(obj);
                bool.getClass();
                boolean zBooleanValue = bool.booleanValue();
                gd2 gd2Var = (id2) map.get(((wcm) obj2).a);
                return new bdm(z, zBooleanValue, (gd2Var instanceof gd2) && gd2Var.a, z2);
            case 1:
                boolean z3 = this.b;
                boolean z4 = this.c;
                kit0 kit0Var = (kit0) this.d;
                oit0 oit0Var = (oit0) this.e;
                hm5.M(obj);
                qfd qfdVar = oit0Var.a;
                if (qfdVar == null) {
                    hit0Var = iit0.a;
                } else {
                    rh7 rh7Var = qfdVar.d;
                    if (rh7Var != null && qfdVar.c == 3) {
                        hit0Var = new hit0(rh7Var.a);
                    }
                    if (hit0Var == null) {
                        hit0Var = iit0.a;
                    }
                }
                return new lit0(z4, z3, kit0Var, (git0) obj2, hit0Var);
            default:
                String str = (String) this.d;
                ioj0 ioj0Var = (ioj0) this.e;
                boolean z5 = this.b;
                boolean z6 = this.c;
                hm5.M(obj);
                hoj0 hoj0VarC = ioj0Var.c(ddz.class, str);
                if (hoj0VarC != null && (goj0VarA2 = hoj0VarC.a()) != null) {
                    hit0Var = (ddz) goj0VarA2.a;
                }
                hoj0 hoj0VarC2 = ioj0Var.c(mdz.class, str);
                return new zag1(str, (hit0Var != null && (hit0Var.b.isEmpty() ^ true)) && ((hit0Var == null || (cdzVar = (cdz) o7h.s0(hit0Var.b)) == null || !cdzVar.e) ? true : ((y861) obj2).a), (hoj0VarC2 == null || (goj0VarA = hoj0VarC2.a()) == null || (mdzVar = (mdz) goj0VarA.a) == null || !mdzVar.i) ? false : true, z5, z6);
        }
    }
}
