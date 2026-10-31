package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vfb1 extends hab0 implements vu30 {
    public final /* synthetic */ xu30 N0;
    public final /* synthetic */ xu30 X;
    public final /* synthetic */ xu30 Y;
    public final /* synthetic */ xu30 Z;
    public final /* synthetic */ uw9 a;
    public final /* synthetic */ xu30 b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ xu30 d;
    public final /* synthetic */ xu30 e;
    public final /* synthetic */ xu30 f;
    public final /* synthetic */ xu30 g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ xu30 i;
    public final /* synthetic */ xu30 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vfb1(j8e0 j8e0Var, uw9 uw9Var, xu30 xu30Var, mta mtaVar, iu30 iu30Var, xu30 xu30Var2, xu30 xu30Var3, xu30 xu30Var4, xu30 xu30Var5, boolean z, xu30 xu30Var6, xu30 xu30Var7, xu30 xu30Var8, xu30 xu30Var9, xu30 xu30Var10, xu30 xu30Var11) {
        super(2);
        this.a = uw9Var;
        this.b = xu30Var;
        this.c = iu30Var;
        this.d = xu30Var2;
        this.e = xu30Var3;
        this.f = xu30Var4;
        this.g = xu30Var5;
        this.h = z;
        this.i = xu30Var6;
        this.t = xu30Var7;
        this.X = xu30Var8;
        this.Y = xu30Var9;
        this.Z = xu30Var10;
        this.N0 = xu30Var11;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00c4  */
    public final Object invoke(Object obj, Object obj2) {
        int i;
        xu30 xu30Var;
        xu30 xu30Var2;
        xu30 xu30Var3;
        xu30 xu30Var4;
        xu30 xu30Var5;
        int i2;
        float f;
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            uw9 uw9Var = this.a;
            u7h u7hVar = uw9Var != null ? new u7h(uw9Var.a) : null;
            long j = u7hVar != null ? u7hVar.a : u7h.j;
            x340Var2.i0(-164858127);
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var2).f;
            cr31 cr31VarB = er31.b(6.0f);
            x340Var2.r(false);
            jvx jvxVar = new jvx(j, cr31VarB);
            qim0 qim0VarY = nim0.a;
            qim0 qim0VarF = u291.f(qim0VarY, 1.0f);
            xu30 xu30Var6 = this.b;
            if (uw9Var != null) {
                x340Var2.i0(-815399132);
                boolean z = (xu30Var6 == null || uw9Var.b == 1) ? false : true;
                cvx cvxVar = cbx.b(x340Var2).b;
                if (z) {
                    x340Var2.i0(-164817351);
                    x340Var2.r(false);
                    f = 0.0f;
                } else {
                    x340Var2.i0(-164816225);
                    cvx cvxVar2 = cbx.b(x340Var2).b;
                    x340Var2.r(false);
                    f = 4.0f;
                }
                qim0VarY = uyn1.y(qim0VarY, 8.0f, f);
                x340Var2.r(false);
            } else {
                x340Var2.i0(-814277831);
                x340Var2.r(false);
            }
            qim0 qim0VarThen = qim0VarF.then(qim0VarY);
            if (uw9Var == null || (i2 = uw9Var.b) == 0) {
                i = 2;
            } else {
                int iC = l1d.C(i2);
                if (iC == 0) {
                    i = 1;
                } else if (iC == 1) {
                    i = 2;
                } else {
                    if (iC != 2) {
                        eg.o();
                        return null;
                    }
                    i = 3;
                }
            }
            cvx cvxVar3 = cbx.b(x340Var2).b;
            boolean zD = x340Var2.d(4.0f);
            Object objT = x340Var2.T();
            if (zD || objT == m4cVar) {
                objT = new uvx(1, null, 3, null, uyn1.h(2, 4.0f, 0.0f), null, null, 2, null, 362);
                x340Var2.s0(objT);
            }
            uvx uvxVar = (uvx) objT;
            String strO0 = cwl1.o0(x340Var2, 2131962905);
            iu30 iu30Var = this.c;
            boolean zG = x340Var2.g(iu30Var);
            Object objT2 = x340Var2.T();
            if (zG || objT2 == m4cVar) {
                objT2 = new pba1(iu30Var, (byte) 12);
                x340Var2.s0(objT2);
            }
            Function0 function0 = (Function0) objT2;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return null;
            }
            gbx gbxVar = new gbx(new y50(strO0), function0);
            String strO1 = cwl1.o0(x340Var2, 2131962906);
            boolean zG2 = x340Var2.g(iu30Var);
            Object objT3 = x340Var2.T();
            if (zG2 || objT3 == m4cVar) {
                objT3 = new pba1(iu30Var, (byte) 13);
                x340Var2.s0(objT3);
            }
            Function0 function1 = (Function0) objT3;
            if (ihc1.y0(strO1)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return null;
            }
            gbx gbxVar2 = new gbx(new y50(strO1), function1);
            xu30 xu30Var7 = this.d;
            boolean z2 = this.h;
            if (xu30Var7 == null) {
                x340Var2.i0(-813905491);
                x340Var2.r(false);
                xu30Var = null;
            } else {
                x340Var2.i0(-813905490);
                xu30 xu30VarR = apo.r(-2097996571, new ufb1((byte) 0, xu30Var7, z2), x340Var2);
                x340Var2.r(false);
                xu30Var = xu30VarR;
            }
            xu30 xu30Var8 = this.e;
            if (xu30Var8 == null) {
                x340Var2.i0(-813816211);
                x340Var2.r(false);
                xu30Var2 = null;
            } else {
                x340Var2.i0(-813816210);
                xu30 xu30VarR2 = apo.r(-1498302597, new ufb1((byte) 1, xu30Var8, z2), x340Var2);
                x340Var2.r(false);
                xu30Var2 = xu30VarR2;
            }
            xu30 xu30Var9 = this.f;
            if (xu30Var9 == null) {
                x340Var2.i0(-813720979);
                x340Var2.r(false);
                xu30Var3 = null;
            } else {
                x340Var2.i0(-813720978);
                xu30 xu30VarR3 = apo.r(392282842, new ufb1((byte) 2, xu30Var9, z2), x340Var2);
                x340Var2.r(false);
                xu30Var3 = xu30VarR3;
            }
            j2i j2iVarR = apo.r(-1113128866, new n8k0(z2, this.i, this.t, (byte) 15), x340Var2);
            j2i j2iVarR2 = apo.r(777456573, new nu31(this.X, this.Y, this.Z, (byte) 21), x340Var2);
            xu30 xu30Var10 = this.g;
            if (xu30Var10 == null) {
                x340Var2.i0(-812881747);
                x340Var2.r(false);
                xu30Var4 = null;
            } else {
                x340Var2.i0(-812881746);
                xu30 xu30VarR4 = apo.r(1769071863, new ufb1((byte) 3, xu30Var10, z2), x340Var2);
                x340Var2.r(false);
                xu30Var4 = xu30VarR4;
            }
            if (xu30Var6 == null) {
                x340Var2.i0(-812790483);
                x340Var2.r(false);
                xu30Var5 = null;
            } else {
                x340Var2.i0(-812790482);
                xu30 xu30VarR5 = apo.r(-635309994, new ufb1((byte) 4, xu30Var6, z2), x340Var2);
                x340Var2.r(false);
                xu30Var5 = xu30VarR5;
            }
            kto1.e(jvxVar, qim0VarThen, i, uvxVar, (max) null, (idn0) null, (ga80) null, gbxVar, gbxVar2, xu30Var, xu30Var2, xu30Var3, j2iVarR, j2iVarR2, xu30Var4, xu30Var5, apo.r(-2140721702, new ufb1((byte) 5, this.N0, z2), x340Var2), x340Var2, 4104, 1576320, 112);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
