package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class st8 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public st8(nhc nhcVar, boolean z, boolean z2, int i) {
        super(2);
        this.a = (byte) 3;
        this.d = nhcVar;
        this.b = z;
        this.c = z2;
    }

    public final Object invoke(Object obj, Object obj2) {
        jax haxVar;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = this.c;
        boolean z2 = this.b;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    String strO0 = cwl1.o0(x340Var2, 2131960226);
                    if (z2) {
                        x340Var2.i0(-1331027211);
                        x340Var2.r(false);
                        haxVar = jax.a;
                    } else {
                        x340Var2.i0(-1330980184);
                        haxVar = new hax(cwl1.o0(x340Var2, 2131960223));
                        x340Var2.r(false);
                    }
                    nyx.a(2, (wux) null, apo.r(-352304390, new bk0(z, (iu30) obj3, strO0, haxVar), x340Var2), x340Var2, 3078, 6);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    fra fraVar = een.N0;
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var4).b;
                    iu30 iu30Var = (iu30) obj3;
                    jw31 jw31VarA = ew31.a(new d36(8.0f, true, new um5(false)), fraVar, x340Var4, 0);
                    int iHashCode = Long.hashCode(x340Var4.T);
                    xos0 xos0VarM = x340Var4.m();
                    qim0 qim0VarE = zr7.E(x340Var4, nim0.a);
                    hzj.A.getClass();
                    if (x340Var4.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var4.m0();
                    if (x340Var4.S) {
                        x340Var4.l(hmb0.t1);
                    } else {
                        x340Var4.v0();
                    }
                    nko1.H(jw31VarA, x340Var4, y580.O0);
                    nko1.H(xos0VarM, x340Var4, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var4, y580.R0);
                    nko1.F(x340Var4);
                    nko1.H(qim0VarE, x340Var4, y580.Y);
                    if (z2) {
                        x340Var4.i0(538439297);
                        boolean zG = x340Var4.g(iu30Var);
                        Object objT = x340Var4.T();
                        if (zG || objT == m4cVar) {
                            objT = new zi80(iu30Var, (byte) 3);
                            x340Var4.s0(objT);
                        }
                        h7p1.g(0, (Function0) objT, x340Var4, z);
                        x340Var4.r(false);
                    } else {
                        x340Var4.i0(538545007);
                        x340Var4.r(false);
                    }
                    boolean zG2 = x340Var4.g(iu30Var);
                    Object objT2 = x340Var4.T();
                    if (zG2 || objT2 == m4cVar) {
                        objT2 = new zi80(iu30Var, (byte) 4);
                        x340Var4.s0(objT2);
                    }
                    h7p1.l(0, (Function0) objT2, x340Var4, z);
                    x340Var4.r(true);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                ioo1.d(z2, z, (iu30) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                ((nhc) obj3).g(z2, z, (b0k) obj, czo1.p(1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ st8(boolean z, boolean z2, iu30 iu30Var, byte b) {
        super(2);
        this.a = b;
        this.b = z;
        this.c = z2;
        this.d = iu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public st8(boolean z, boolean z2, iu30 iu30Var, int i) {
        super(2);
        this.a = (byte) 2;
        this.b = z;
        this.c = z2;
        this.d = iu30Var;
    }
}
