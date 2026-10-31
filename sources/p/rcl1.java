package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rcl1 extends hab0 implements xu30 {
    public final /* synthetic */ Float a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ iu30 e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;
    public final /* synthetic */ String h;
    public final /* synthetic */ String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rcl1(Float f, Function0 function0, String str, boolean z, iu30 iu30Var, String str2, String str3, String str4, String str5) {
        super(3);
        this.a = f;
        this.b = function0;
        this.c = str;
        this.d = z;
        this.e = iu30Var;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = str5;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        x340 x340Var2 = x340Var;
        boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16);
        j06 j06Var = x340Var2.a;
        if (zY) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            Object objT = x340Var2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = dw81.W0;
                x340Var2.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarD, false, (iu30) objT);
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
            Float f = this.a;
            boolean zG = x340Var2.g(f);
            Object objT2 = x340Var2.T();
            if (zG || objT2 == m4cVar) {
                objT2 = new cr60(f != null ? f.floatValue() : 0.5f);
                x340Var2.s0(objT2);
            }
            cr60 cr60Var = (cr60) objT2;
            ven0 ven0VarS = v8r.s(this.b, x340Var2);
            fwx fwxVarG = hso1.G(ytx.c, 0L, 0L, x340Var2, ytx.d, 30);
            Uri uri = Uri.parse(this.c);
            boolean zG2 = x340Var2.g(ven0VarS);
            Object objT3 = x340Var2.T();
            if (zG2 || objT3 == m4cVar) {
                objT3 = new i2g1(ven0VarS, (byte) 26);
                x340Var2.s0(objT3);
            }
            eso1.h(oi7.a(uri, (gw70) null, (xb10) null, (yqi1) null, fwxVarG, fwxVarG, false, false, (j6m) null, (iu30) objT3, (iu30) null, (iu30) null, 0L, x340Var2, 2359296, 0, 126878), isl.a, u291.d(nim0Var, 1.0f), (p3v) null, (zvx) null, (ecx) null, mif1.P0, cr60Var, (ColorFilter) null, x340Var2, 1797552, 256);
            fq7.g(this.d, null, xay.e(2, irn1.o0(400, 0, (dlv) null, 6)), xay.f(2, irn1.o0(300, 0, (dlv) null, 6)), null, apo.r(-1454955313, new sgi1(f, this.e, (byte) 13), x340Var2), x340Var2, 200064, 18);
            x340 x340Var3 = x340Var2;
            qim0 qim0VarF = u291.f(u291.i(u291.c(h2c.a.a(nim0Var, een.X), 0.5f), 80.0f, 144.0f), 1.0f);
            mmr0 mmr0Var = new mmr0(Float.valueOf(0.0f), new u7h(u7h.j));
            Float fValueOf = Float.valueOf(0.5f);
            long j = u7h.b;
            t1c.a(dug.e(qim0VarF, v9c.t(new mmr0[]{mmr0Var, new mmr0(fValueOf, new u7h(u7h.b(j, 0.4f, 0.0f, 0.0f, 0.0f, 14))), new mmr0(Float.valueOf(1.0f), new u7h(u7h.b(j, 0.75f, 0.0f, 0.0f, 0.0f, 14)))}, 0.0f, 0.0f, 14), (hw61) null, 0.0f, 6), x340Var3, 0);
            qim0 qim0VarD2 = u291.d(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var3).b;
            qim0 qim0VarX = uyn1.x(qim0VarD2, 8.0f);
            mbh mbhVarA = jbh.a(h36.d, een.P0, x340Var3, 6);
            int iHashCode2 = Long.hashCode(x340Var3.T);
            xos0 xos0VarM2 = x340Var3.m();
            qim0 qim0VarE2 = zr7.E(x340Var3, qim0VarX);
            x340Var3.m0();
            if (x340Var3.S) {
                x340Var3.l(n4kVar);
            } else {
                x340Var3.v0();
            }
            nko1.H(mbhVarA, x340Var3, lljVar);
            nko1.H(xos0VarM2, x340Var3, lljVar2);
            x0d.q(iHashCode2, x340Var3, lljVar3, x340Var3);
            nko1.H(qim0VarE2, x340Var3, lljVar4);
            String str = this.f;
            if (str == null) {
                x340Var3.i0(-340194466);
                x340Var3.r(false);
            } else {
                x340Var3.i0(-340194465);
                w2g0.c((qim0) null, (tl3) null, apo.r(-1846052519, new dba1(str, (byte) 16), x340Var3), x340Var3, 3072, 7);
                x340Var3 = x340Var3;
                x340Var3.r(false);
            }
            String str2 = this.g;
            if (str2 == null || str2.length() == 0) {
                x340Var3.i0(-339231915);
                x340Var3.r(false);
            } else {
                x340Var3.i0(-339557043);
                x340 x340Var4 = x340Var3;
                uwo1.e(str2, u291.f(nim0Var, 1.0f), cbx.d(x340Var3).m, cbx.a(x340Var3).b.b, new a0e1(5), (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var4, 1572912, 0, 1696);
                x340Var3 = x340Var4;
                x340Var3.r(false);
            }
            String str3 = this.h;
            if (str3.length() > 0) {
                x340Var3.i0(-339177138);
                x340 x340Var5 = x340Var3;
                uwo1.e(str3, u291.f(nim0Var, 1.0f), cbx.d(x340Var3).k, cbx.a(x340Var3).b.a, new a0e1(5), (iu30) null, 2, false, new cjc0(2), 0, (qx8) null, x340Var5, 1572912, 0, 1696);
                x340Var3 = x340Var5;
                x340Var3.r(false);
            } else {
                x340Var3.i0(-338852971);
                x340Var3.r(false);
            }
            String str4 = this.i;
            if (str4 == null || str4.length() == 0) {
                x340Var3.i0(-338466091);
                x340Var3.r(false);
            } else {
                x340Var3.i0(-338791219);
                x340 x340Var6 = x340Var3;
                uwo1.e(str4, u291.f(nim0Var, 1.0f), cbx.d(x340Var3).m, cbx.a(x340Var3).b.b, new a0e1(5), (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var6, 1572912, 0, 1696);
                x340Var3 = x340Var6;
                x340Var3.r(false);
            }
            x340Var3.r(true);
            x340Var3.r(true);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
