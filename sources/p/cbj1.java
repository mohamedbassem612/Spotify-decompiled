package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class cbj1 extends hab0 implements bv30 {
    public final /* synthetic */ dbj1 a;
    public final /* synthetic */ z3q b;
    public final /* synthetic */ av0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbj1(dbj1 dbj1Var, z3q z3qVar, av0 av0Var) {
        super(5);
        this.a = dbj1Var;
        this.b = z3qVar;
        this.c = av0Var;
    }

    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ksw kswVar = (ksw) obj;
        edj1 edj1Var = (edj1) obj2;
        iu30 iu30Var = (iu30) obj3;
        b0k b0kVar = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        int i = (iIntValue & 896) ^ 384;
        boolean z = (i > 256 && ((x340) b0kVar).g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var = (x340) b0kVar;
        Object objT = x340Var.T();
        if (z || objT == m4cVar) {
            objT = new ceg1(iu30Var, (byte) 26);
            x340Var.s0(objT);
        }
        n9p1.e(kswVar, (iu30) objT, x340Var, iIntValue & 14);
        boolean zB = ((uvb0) ((crl1) x340Var.k(t4k.u))).b();
        Boolean boolValueOf = Boolean.valueOf(zB);
        boolean zH = x340Var.h(zB) | ((i > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256);
        Object objT2 = x340Var.T();
        if (zH || objT2 == m4cVar) {
            objT2 = new ag21(iu30Var, zB, (byte) 6);
            x340Var.s0(objT2);
        }
        qxd0.C(boolValueOf, (Function0) objT2, x340Var);
        kiv kivVarD = ibj1.d();
        dbj1 dbj1Var = this.a;
        mod.c(new ely0[]{kivVarD.a(dbj1.j(dbj1Var, edj1Var, x340Var)), ibj1.f().a(dbj1.i(dbj1Var)), ibj1.a().a(this.b), ibj1.c().a(this.c), oi7.a.a(dbj1.h(dbj1Var)), qp0.b().a(dbj1.e(dbj1Var)), ibj1.b().a(Boolean.valueOf(dbj1.g(dbj1Var))), ibj1.e().a(dbj1.f(dbj1Var))}, apo.r(-334744157, new wpg1(edj1Var, dbj1Var, iu30Var, (byte) 27), x340Var), x340Var, 56);
        return rih1.a;
    }
}
