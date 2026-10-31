package p;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xmg1 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nm1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xmg1(nm1 nm1Var, byte b) {
        super(4);
        this.a = b;
        this.b = nm1Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        nm1 nm1Var = this.b;
        switch (b) {
            case 0:
                jjm0 jjm0Var = (jjm0) obj;
                umg1 umg1Var = (umg1) obj2;
                int iIntValue = ((Number) obj4).intValue();
                String str = umg1Var.a;
                x340 x340Var = (b0k) obj3;
                x340Var.i0(938886093);
                Object objT = x340Var.T();
                m4c m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = d3p1.F((d0r) nm1Var.b, (o3r) nm1Var.c, umg1Var);
                    x340Var.s0(objT);
                }
                ven0 ven0VarH = rwq.h((zob1) objT, x340Var, 0);
                boolean zG = x340Var.g(str);
                Object objT2 = x340Var.T();
                if (zG || objT2 == m4cVar) {
                    objT2 = new lt20(((tag1) nm1Var.g).b(str), new q8t0(3, (lnm) null, (byte) 25), (byte) 0);
                    x340Var.s0(objT2);
                }
                ven0 ven0VarG = rwq.g((mr20) objT2, (Object) null, (o8n) null, x340Var, 48, 2);
                k1r k1rVar = (k1r) ven0VarH.getValue();
                ArrayList arrayList = k1rVar instanceof i1r ? ((wmg1) u890.k(k1rVar, (d0r) null, (n4r) null)).a.b : z6x.a;
                cdz cdzVar = (cdz) o7h.s0(arrayList);
                String str2 = cdzVar != null ? cdzVar.b : null;
                boolean zI = x340Var.i(nm1Var) | ((((iIntValue & 112) ^ 48) > 32 && x340Var.g(umg1Var)) || (iIntValue & 48) == 32);
                Object objT3 = x340Var.T();
                if (zI || objT3 == m4cVar) {
                    objT3 = new w63(nm1Var, umg1Var, (lnm) null, (byte) 28);
                    x340Var.s0(objT3);
                }
                jjm0Var.a((zu30) objT3, x340Var, (iIntValue << 3) & 112);
                boolean z = arrayList.size() > 1;
                String str3 = (String) ven0VarG.getValue();
                vmg1 vmg1Var = new vmg1(z, nhc1.S(str3, str2, true) ? null : str3);
                x340Var.r(false);
                return vmg1Var;
            default:
                Integer numValueOf = Integer.valueOf(((Number) obj3).intValue());
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                return new gtl0(new htl0(new ntl0(new qtl0(numValueOf, yon1.D4().c, ((umg1) obj).a, (r6h1) obj4), (otl0) nm1Var.h), (byte) 0));
        }
    }
}
