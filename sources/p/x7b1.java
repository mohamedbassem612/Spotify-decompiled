package p;

import androidx.compose.ui.text.font.FontWeight;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class x7b1 extends hab0 implements vu30 {
    public final /* synthetic */ String X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ Locale Z;
    public final /* synthetic */ long a;
    public final /* synthetic */ u7h b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ zk80 g;
    public final /* synthetic */ String h;
    public final /* synthetic */ String i;
    public final /* synthetic */ String t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x7b1(long j, u7h u7hVar, qim0 qim0Var, Function0 function0, String str, Function0 function1, zk80 zk80Var, String str2, String str3, String str4, String str5, String str6, Locale locale) {
        super(2);
        this.a = j;
        this.b = u7hVar;
        this.c = qim0Var;
        this.d = function0;
        this.e = str;
        this.f = function1;
        this.g = zk80Var;
        this.h = str2;
        this.i = str3;
        this.t = str4;
        this.X = str5;
        this.Y = str6;
        this.Z = locale;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        long j;
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2);
        j06 j06Var = x340Var2.a;
        if (zY) {
            int i = im80.b;
            long j2 = this.a;
            u7h u7hVar = this.b;
            if (u7hVar != null) {
                j = u7hVar.a;
            } else {
                j = z4p1.B(j2) > 0.5f ? u7h.b : u7h.f;
            }
            long j3 = j;
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var2).f;
            qim0 qim0VarX = bin.x(dug.f(i1p1.q(this.c, er31.b(8.0f)), j2, d4o1.a), false, null, null, null, this.d, 15);
            String str = this.e;
            boolean zG = x340Var2.g(str);
            Object objT = x340Var2.T();
            if (zG || objT == fkj0.X) {
                objT = new hqa1(str, (byte) 2);
                x340Var2.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarX, true, (iu30) objT);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarB);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            zov0 zov0Var = cbx.b(x340Var2).g;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarA = uyn1.A(nim0Var, 8.0f, 8.0f, 8.0f, 24.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarA);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE2, x340Var2, lljVar4);
            zk80 zk80Var = this.g;
            grn1.l(zk80Var.c, j3, x340Var2, 0);
            lee1 lee1Var = cbx.d(x340Var2).h;
            yfu yfuVar = ajx.a;
            Object obj3 = yfuVar.b;
            FontWeight fontWeight = (FontWeight) ((bjx) yfuVar.c).e;
            cjc0 cjc0Var = new cjc0(1);
            cvx cvxVar = cbx.b(x340Var2).b;
            gxo1.c(this.h, uyn1.B(nim0Var, 0.0f, 2.0f, 0.0f, 0.0f, 13), lee1Var, j3, null, 2, false, cjc0Var, null, 150.0f, fontWeight, null, x340Var2, 196608, 0, 2384);
            int i2 = zk80Var.e;
            cvx cvxVar2 = cbx.b(x340Var2).b;
            grn1.a(i2, 0, this.i, x340Var2, uyn1.B(nim0Var, 0.0f, 8.0f, 0.0f, 0.0f, 13));
            long j4 = zk80Var.f;
            Locale locale = this.Z;
            locale.getClass();
            cvx cvxVar3 = cbx.b(x340Var2).b;
            grn1.f(this.t, this.X, j4, this.Y, locale, j3, uyn1.B(nim0Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), x340Var2, 0);
            x340Var2.r(true);
            s8p1.b(this.f, j3, h2c.a.a(nim0Var, een.Y), x340Var2, 0);
            x340Var2.r(true);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
