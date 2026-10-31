package p;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class t5j0 extends hab0 implements vu30 {
    public final /* synthetic */ float N0;
    public final /* synthetic */ ven0 X;
    public final /* synthetic */ float Y;
    public final /* synthetic */ float Z;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ven0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ String d;
    public final /* synthetic */ u201 e;
    public final /* synthetic */ c380 f;
    public final /* synthetic */ c380 g;
    public final /* synthetic */ oa0 h;
    public final /* synthetic */ ven0 i;
    public final /* synthetic */ ven0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5j0(boolean z, ven0 ven0Var, boolean z2, String str, u201 u201Var, c380 c380Var, c380 c380Var2, oa0 oa0Var, ven0 ven0Var2, ven0 ven0Var3, ven0 ven0Var4, float f, float f2, float f3) {
        super(2);
        this.a = z;
        this.b = ven0Var;
        this.c = z2;
        this.d = str;
        this.e = u201Var;
        this.f = c380Var;
        this.g = c380Var2;
        this.h = oa0Var;
        this.i = ven0Var2;
        this.t = ven0Var3;
        this.X = ven0Var4;
        this.Y = f;
        this.Z = f2;
        this.N0 = f3;
    }

    public final Object invoke(Object obj, Object obj2) {
        Function0 function0;
        boolean z;
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2);
        j06 j06Var = x340Var2.a;
        if (zY) {
            Object objT = x340Var2.T();
            m4c m4cVar = fkj0.X;
            ven0 ven0Var = this.b;
            if (objT == m4cVar) {
                objT = new q2j0(ven0Var, (byte) 2);
                x340Var2.s0(objT);
            }
            nim0 nim0Var = nim0.a;
            qim0 qim0VarX = bin.x(nim0Var, false, null, null, null, (Function0) objT, 15);
            boolean z2 = this.a;
            mbh mbhVarA = jbh.a(h36.c, z2 ? een.R0 : een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarX);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z3 = x340Var2.S;
            Function0 function1 = hmb0.t1;
            if (z3) {
                x340Var2.l(function1);
            } else {
                x340Var2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            boolean z4 = this.c;
            if (z4) {
                x340Var2.i0(-950728337);
                boolean zBooleanValue = ((Boolean) ven0Var.getValue()).booleanValue();
                Object objT2 = x340Var2.T();
                if (objT2 == m4cVar) {
                    objT2 = new abh0(this.i, (byte) 9);
                    x340Var2.s0(objT2);
                }
                iu30 iu30Var = (iu30) objT2;
                Object objT3 = x340Var2.T();
                if (objT3 == m4cVar) {
                    objT3 = new xs3(this.t, this.X, (byte) 13);
                    x340Var2.s0(objT3);
                }
                function0 = function1;
                bpo1.k(z2, zBooleanValue, this.d, iu30Var, this.e, (iu30) objT3, this.f, x340Var2, 199680);
                z = false;
                x340Var2.r(false);
            } else {
                z4 = z4;
                function0 = function1;
                z = false;
                x340Var2.i0(-950238940);
                x340Var2.r(false);
            }
            c380 c380Var = this.g;
            if (c380Var.isEmpty()) {
                x340Var2.i0(-949471132);
                x340Var2.r(z);
            } else {
                x340Var2.i0(-950183233);
                wnb0 wnb0Var = new wnb0(1.0f, z);
                gfh0 gfh0VarC = t1c.c(een.d, z);
                int iHashCode2 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM2 = x340Var2.m();
                qim0 qim0VarE2 = zr7.E(x340Var2, wnb0Var);
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(function0);
                } else {
                    x340Var2.v0();
                }
                nko1.H(gfh0VarC, x340Var2, lljVar);
                nko1.H(xos0VarM2, x340Var2, lljVar2);
                x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
                nko1.H(qim0VarE2, x340Var2, lljVar4);
                op71.g(x340Var2, u291.h(nim0Var, Math.min(this.Y + (z4 ? 16.0f : 0.0f), (((Configuration) x340Var2.k(AndroidCompositionLocals_androidKt.a)).screenHeightDp - this.Z) - this.N0)));
                x340Var2.r(true);
                o0p1.a(z2, ((Boolean) ven0Var.getValue()).booleanValue(), c380Var, this.h, x340Var2, 0);
                x340Var2.r(false);
            }
            x340Var2.r(true);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
