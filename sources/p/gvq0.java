package p;

import android.view.View;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gvq0 extends hab0 implements xu30 {
    public final /* synthetic */ dxb N0;
    public final /* synthetic */ kvq0 O0;
    public final /* synthetic */ Function0 P0;
    public final /* synthetic */ iu30 Q0;
    public final /* synthetic */ ven0 X;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ View Z;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ zf11 d;
    public final /* synthetic */ tob1 e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ ven0 g;
    public final /* synthetic */ ven0 h;
    public final /* synthetic */ ven0 i;
    public final /* synthetic */ ven0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gvq0(boolean z, boolean z2, boolean z3, zf11 zf11Var, ven0 ven0Var, Function0 function0, ven0 ven0Var2, ven0 ven0Var3, ven0 ven0Var4, ven0 ven0Var5, ven0 ven0Var6, boolean z4, View view, dxb dxbVar, kvq0 kvq0Var, Function0 function1, iu30 iu30Var) {
        super(3);
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = zf11Var;
        this.e = ven0Var;
        this.f = function0;
        this.g = ven0Var2;
        this.h = ven0Var3;
        this.i = ven0Var4;
        this.t = ven0Var5;
        this.X = ven0Var6;
        this.Y = z4;
        this.Z = view;
        this.N0 = dxbVar;
        this.O0 = kvq0Var;
        this.P0 = function1;
        this.Q0 = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        vy71 vy71Var;
        Function0 function0;
        Integer num;
        nwb nwbVar = (nwb) obj;
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        m4c m4cVar = fkj0.X;
        if ((iIntValue & 6) == 0) {
            iIntValue |= (iIntValue & 8) == 0 ? x340Var.g(nwbVar) : x340Var.i(nwbVar) ? 4 : 2;
        }
        x340 x340Var2 = x340Var;
        boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18);
        rih1 rih1Var = rih1.a;
        if (!zY) {
            x340Var2.b0();
            return rih1Var;
        }
        int i = iIntValue & 14;
        boolean z = i == 4 || ((iIntValue & 8) != 0 && x340Var2.g(nwbVar));
        boolean z2 = this.a;
        boolean zH = z | x340Var2.h(z2);
        Object objT = x340Var2.T();
        ven0 ven0Var = this.g;
        if (zH || objT == m4cVar) {
            objT = new pcp0(this.f, nwbVar, ven0Var, (byte) 12);
            x340Var2.s0(objT);
        }
        Function0 function1 = (Function0) objT;
        boolean zH2 = (i == 4 || ((iIntValue & 8) != 0 && x340Var2.i(nwbVar))) | x340Var2.h(z2);
        boolean z3 = this.c;
        boolean zH3 = zH2 | x340Var2.h(z3);
        Object objT2 = x340Var2.T();
        if (zH3 || objT2 == m4cVar) {
            objT2 = new nxx(nwbVar, z2, z3, (byte) 3);
            x340Var2.s0(objT2);
        }
        boolean z4 = this.b;
        vy71 vy71VarF = dem0.f(0, 0, x340Var2, (iu30) objT2, z4);
        hxb hxbVar = (hxb) ven0Var.getValue();
        zf11 zf11Var = this.d;
        boolean zG = x340Var2.g(zf11Var);
        Object objT3 = x340Var2.T();
        if (zG || objT3 == m4cVar) {
            objT3 = new ozp0(zf11Var, ven0Var, (byte) 11);
            x340Var2.s0(objT3);
        }
        qxd0.i(hxbVar, (iu30) objT3, x340Var2);
        xy71 xy71VarD = vy71VarF.d();
        boolean zG2 = x340Var2.g(vy71VarF) | (i == 4 || ((iIntValue & 8) != 0 && x340Var2.i(nwbVar)));
        Object objT4 = x340Var2.T();
        if (zG2 || objT4 == m4cVar) {
            objT4 = new e3p0(vy71VarF, nwbVar, (lnm) null, (byte) 12);
            x340Var2.s0(objT4);
        }
        qxd0.t(xy71VarD, x340Var2, (vu30) objT4);
        boolean z5 = i == 4 || ((iIntValue & 8) != 0 && x340Var2.i(nwbVar));
        Object objT5 = x340Var2.T();
        if (z5 || objT5 == m4cVar) {
            objT5 = new cnp0(nwbVar, (byte) 27);
            x340Var2.s0(objT5);
        }
        qxd0.i(rih1Var, (iu30) objT5, x340Var2);
        tob1 tob1Var = this.e;
        ixb ixbVar = tob1Var != null ? (ixb) tob1Var.getValue() : null;
        boolean zG3 = x340Var2.g(tob1Var) | x340Var2.g(vy71VarF) | x340Var2.g(function1) | x340Var2.h(z4);
        Object objT6 = x340Var2.T();
        if (zG3 || objT6 == m4cVar) {
            vy71Var = vy71VarF;
            function0 = function1;
            objT6 = new fjk(this.e, vy71Var, function0, this.b, this.g, (lnm) null);
            x340Var2.s0(objT6);
        } else {
            vy71Var = vy71VarF;
            function0 = function1;
        }
        qxd0.t(ixbVar, x340Var2, (vu30) objT6);
        uwr uwrVar = cbx.a;
        long jA = cbx.a(x340Var2).a.a.a();
        ven0 ven0Var2 = this.h;
        nxb nxbVar = (nxb) ven0Var2.getValue();
        mxb mxbVar = nxbVar != null ? nxbVar.e : null;
        if (mxbVar instanceof jxb) {
            x340Var2.i0(1237415811);
            x340Var2.r(false);
            jA = z4p1.e(((jxb) mxbVar).a);
        } else if (mxbVar instanceof kxb) {
            x340Var2.i0(1237418414);
            jA = f5p1.k(x340Var2, ((kxb) mxbVar).a);
            x340Var2.r(false);
        } else {
            x340Var2.i0(1237420033);
            x340Var2.r(false);
        }
        nxb nxbVar2 = (nxb) ven0Var2.getValue();
        float f = yoi1.m(new p3v((nxbVar2 == null || (num = nxbVar2.c) == null) ? 640.0f : num.intValue()), new p3v(640.0f)).a;
        Object objT7 = x340Var2.T();
        if (objT7 == m4cVar) {
            objT7 = qxd0.M(o6x.a, x340Var2);
            x340Var2.s0(objT7);
        }
        c9n c9nVar = (c9n) objT7;
        ven0 ven0Var3 = this.i;
        hcr0 hcr0Var = (hcr0) ven0Var3.getValue();
        ven0 ven0Var4 = this.t;
        cxb cxbVar = (cxb) ven0Var4.getValue();
        Object objT8 = x340Var2.T();
        if (objT8 == m4cVar) {
            objT8 = new ofk0(ven0Var2, this.X, ven0Var4, (lnm) null);
            x340Var2.s0(objT8);
        }
        abr0.a(48, apo.r(656915748, new fvq0(vy71Var, hcr0Var, cxbVar, this.b, function0, jA, f, this.c, this.Y, this.X, ven0Var2, this.Z, this.g, nwbVar, this.a, c9nVar, this.N0, ven0Var4, this.O0, this.P0, this.Q0, ven0Var3), x340Var2), x340Var2, (vu30) objT8);
        return rih1Var;
    }
}
