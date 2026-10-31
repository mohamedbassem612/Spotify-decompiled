package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class b1c extends hab0 implements xu30 {
    public final /* synthetic */ tob1 N0;
    public final /* synthetic */ pob0 X;
    public final /* synthetic */ lbh Y;
    public final /* synthetic */ iu30 Z;
    public final /* synthetic */ c380 a;
    public final /* synthetic */ Integer b;
    public final /* synthetic */ vu30 c;
    public final /* synthetic */ ar41 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ tyq f;
    public final /* synthetic */ ven0 g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ ven0 i;
    public final /* synthetic */ c9n t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1c(c380 c380Var, Integer num, vu30 vu30Var, ar41 ar41Var, boolean z, tyq tyqVar, ven0 ven0Var, boolean z2, ven0 ven0Var2, c9n c9nVar, pob0 pob0Var, lbh lbhVar, iu30 iu30Var, tob1 tob1Var) {
        super(3);
        this.a = c380Var;
        this.b = num;
        this.c = vu30Var;
        this.d = ar41Var;
        this.e = z;
        this.f = tyqVar;
        this.g = ven0Var;
        this.h = z2;
        this.i = ven0Var2;
        this.t = c9nVar;
        this.X = pob0Var;
        this.Y = lbhVar;
        this.Z = iu30Var;
        this.N0 = tob1Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        int iIntValue = ((Number) obj).intValue();
        x340 x340Var = (b0k) obj2;
        int iIntValue2 = ((Number) obj3).intValue();
        m4c m4cVar = fkj0.X;
        if ((iIntValue2 & 6) == 0) {
            iIntValue2 |= x340Var.e(iIntValue) ? 4 : 2;
        }
        x340 x340Var2 = x340Var;
        boolean zY = x340Var2.Y(iIntValue2 & 1, (iIntValue2 & 19) != 18);
        rih1 rih1Var = rih1.a;
        if (!zY) {
            x340Var2.b0();
            return rih1Var;
        }
        c380 c380Var = this.a;
        Object obj4 = c380Var.get(iIntValue);
        ven0 ven0Var = this.i;
        Integer num = this.b;
        boolean z = num != null && num.intValue() == iIntValue && ((Boolean) ven0Var.getValue()).booleanValue();
        int i2 = iIntValue2 & 14;
        boolean z2 = i2 == 4;
        vu30 vu30Var = this.c;
        boolean zG = z2 | x340Var2.g(vu30Var) | x340Var2.g(c380Var);
        Object objT = x340Var2.T();
        if (zG || objT == m4cVar) {
            objT = vu30Var != null ? new gu2(vu30Var, c380Var, iIntValue, (byte) 7) : null;
            x340Var2.s0(objT);
        }
        iu30 iu30Var = (iu30) objT;
        boolean z3 = i2 == 4;
        ar41 ar41Var = this.d;
        boolean zG2 = x340Var2.g(ar41Var) | z3 | x340Var2.h(this.e);
        Object objT2 = x340Var2.T();
        if (zG2 || objT2 == m4cVar) {
            i = iIntValue;
            a1c a1cVar = new a1c(this.e, this.t, ven0Var, this.X, i, this.Y, ar41Var);
            x340Var2.s0(a1cVar);
            objT2 = a1cVar;
        } else {
            i = iIntValue;
        }
        Function0 function0 = (Function0) objT2;
        boolean zG3 = x340Var2.g(obj4) | x340Var2.g(function0) | x340Var2.g(iu30Var) | x340Var2.h(z);
        Object objT3 = x340Var2.T();
        if (zG3 || objT3 == m4cVar) {
            objT3 = this.Z.invoke(new pyg(obj4, z, function0, iu30Var, false));
            x340Var2.s0(objT3);
        }
        Object obj5 = objT3;
        ipb1 ipb1VarC = wpb1.C(String.valueOf(i), this.f, obj5, x340Var2, 0, 8);
        Object objT4 = x340Var2.T();
        ven0 ven0Var2 = this.g;
        if (objT4 == m4cVar) {
            Boolean bool = (Boolean) ven0Var2.getValue();
            bool.getClass();
            objT4 = v8r.q(bool);
            x340Var2.s0(objT4);
        }
        ven0 ven0Var3 = (ven0) objT4;
        boolean zI = x340Var2.i(ven0Var3) | x340Var2.i(ven0Var2);
        Object objT5 = x340Var2.T();
        if (zI || objT5 == m4cVar) {
            objT5 = new vs3(ven0Var3, ven0Var2, (lnm) null, (byte) 2);
            x340Var2.s0(objT5);
        }
        qxd0.t(rih1Var, x340Var2, (vu30) objT5);
        boolean zG4 = x340Var2.g(num);
        Object objT6 = x340Var2.T();
        if (zG4 || objT6 == m4cVar) {
            objT6 = yv91.a(new ptb(num, (byte) 2));
            x340Var2.s0(objT6);
        }
        tob1 tob1Var = (tob1) objT6;
        int i3 = i * 60;
        tob1 tob1VarB = z95.b(((Boolean) ven0Var3.getValue()).booleanValue() ? 1.0f : 0.0f, irn1.o0(200, i3, (dlv) null, 4), "alpha", (iu30) null, x340Var2, 3072, 20);
        int i4 = i;
        mod.b(alg0.d.a(Boolean.valueOf(this.h)), apo.r(-1471243008, new y0c(i4, this.b, this.a, this.e, this.N0, tob1Var, z95.b(((Boolean) ven0Var3.getValue()).booleanValue() ? 1.0f : 0.2f, new pxg1(300, i3, mlv.b), "scale", (iu30) null, x340Var2, 3072, 20), tob1VarB, this.f, obj5, ipb1VarC, (byte) 1), x340Var2), x340Var2, 56);
        return rih1Var;
    }
}
