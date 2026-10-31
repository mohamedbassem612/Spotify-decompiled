package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ho7 extends hab0 implements xu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ iu30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ho7(String str, boolean z, iu30 iu30Var) {
        super(3);
        this.b = str;
        this.c = z;
        this.d = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = this.c;
        nim0 nim0Var = nim0.a;
        iu30 iu30Var = this.d;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                m4c m4cVar = fkj0.X;
                String strN0 = cwl1.n0(z ? 2131952568 : 2131952569, new Object[]{this.b}, x340Var);
                qim0 qim0VarN = anm1.N("audience-user-row-checkbox-test-tag", nim0Var);
                x340 x340Var2 = x340Var;
                boolean zG = x340Var2.g(strN0);
                Object objT = x340Var2.T();
                if (zG || objT == m4cVar) {
                    objT = new wk3(strN0, (byte) 17);
                    x340Var2.s0(objT);
                }
                qim0 qim0VarB = s161.b(qim0VarN, false, (iu30) objT);
                boolean zG2 = x340Var2.g(iu30Var);
                Object objT2 = x340Var2.T();
                if (zG2 || objT2 == m4cVar) {
                    objT2 = new ib2(iu30Var, (byte) 18);
                    x340Var2.s0(objT2);
                }
                aex.b(this.c, (iu30) objT2, qim0VarB, (String) null, 0, (idn0) null, (ga80) null, x340Var2, 0, 120);
                break;
            default:
                ew20 ew20Var = (ew20) obj;
                ((Number) obj3).intValue();
                x340 x340Var3 = (b0k) obj2;
                Object objT3 = x340Var3.T();
                m4c m4cVar2 = fkj0.X;
                if (objT3 == m4cVar2) {
                    objT3 = v8r.q(null);
                    x340Var3.s0(objT3);
                }
                ven0 ven0Var = (ven0) objT3;
                uwr uwrVar = cbx.a;
                lee1 lee1Var = cbx.d(x340Var3).c;
                cjc0 cjc0Var = new cjc0(2);
                px8 px8Var = new px8(fc11.G(18), fc11.G(24), fc11.G(2), (mx8) null, 8);
                qim0 qim0VarA = ew20Var.a(1.0f, nim0Var, false);
                Object objT4 = x340Var3.T();
                if (objT4 == m4cVar2) {
                    objT4 = bmh.U0;
                    x340Var3.s0(objT4);
                }
                qim0 qim0VarN2 = anm1.N("standard_header_title", s161.b(qim0VarA, false, (iu30) objT4));
                boolean zI = x340Var3.i(ven0Var);
                Object objT5 = x340Var3.T();
                if (zI || objT5 == m4cVar2) {
                    objT5 = new nf0(ven0Var, (byte) 2);
                    x340Var3.s0(objT5);
                }
                qim0 qim0VarX = j9k1.x(qim0VarN2, (xu30) objT5);
                boolean zI2 = x340Var3.i(ven0Var);
                Object objT6 = x340Var3.T();
                if (zI2 || objT6 == m4cVar2) {
                    objT6 = new f4g(ven0Var, (byte) 11);
                    x340Var3.s0(objT6);
                }
                uwo1.e(this.b, qim0VarX, lee1Var, 0L, (a0e1) null, (iu30) objT6, 2, false, cjc0Var, 0, px8Var, x340Var3, 0, 8, 664);
                if (!z) {
                    x340Var3.i0(-521651694);
                    x340Var3.r(false);
                } else {
                    x340Var3.i0(-522367639);
                    long jA = cbx.a(x340Var3).a.b.a();
                    gdx gdxVarS = yla.s(x340Var3);
                    qim0 qim0VarD = u291.D(nim0Var, (era) null, 3);
                    boolean zG3 = x340Var3.g(iu30Var);
                    Object objT7 = x340Var3.T();
                    if (zG3 || objT7 == m4cVar2) {
                        objT7 = new yth(iu30Var, (byte) 6);
                        x340Var3.s0(objT7);
                    }
                    gbx gbxVar = new gbx(z50.c, (Function0) objT7);
                    boolean zF = x340Var3.f(jA);
                    Object objT8 = x340Var3.T();
                    if (zF || objT8 == m4cVar2) {
                        objT8 = new sre((byte) 2, jA);
                        x340Var3.s0(objT8);
                    }
                    foo1.c(gbxVar, new hdx(0, (vu30) null, (vu30) objT8, (vu30) null, (hw61) null, 27), qim0VarD, (max) null, gdxVarS, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, xdi.a, x340Var3, 0, 48, 2008);
                    x340Var3.r(false);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ho7(boolean z, String str, iu30 iu30Var) {
        super(3);
        this.c = z;
        this.b = str;
        this.d = iu30Var;
    }
}
