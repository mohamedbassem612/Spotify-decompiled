package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class eob0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eob0(lbh lbhVar, qim0 qim0Var, pob0 pob0Var, cr41 cr41Var, boolean z, boolean z2, boolean z3, iu30 iu30Var, int i) {
        super(2);
        this.e = lbhVar;
        this.f = qim0Var;
        this.g = pob0Var;
        this.h = cr41Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.i = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        qim0 qim0Var;
        boolean z;
        float f;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.g;
        Object obj6 = this.f;
        Object obj7 = this.e;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                ljo1.g((lbh) obj7, (qim0) obj6, (pob0) obj5, (cr41) obj4, this.b, this.c, this.d, (iu30) obj3, (b0k) obj, czo1.p(27649));
                return rih1Var;
            case 1:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                vtf1 vtf1Var = (vtf1) obj4;
                xhl xhlVar = (xhl) obj6;
                if ((iIntValue & 11) == 2) {
                    x340 x340Var2 = x340Var;
                    if (x340Var2.H()) {
                        x340Var2.b0();
                        return rih1Var;
                    }
                }
                ((ven0) obj7).setValue(rih1Var);
                int i = ((uhl) xhlVar).b;
                xhlVar.m();
                x340 x340Var3 = x340Var;
                x340Var3.i0(1092986335);
                xhl xhlVar2 = (xhl) xhlVar.l().b;
                ihl ihlVarK = xhlVar2.k();
                ihl ihlVarK2 = xhlVar2.k();
                qim0 qim0Var2 = nim0.a;
                t1c.a(dug.f(u291.d(qim0Var2, 1.0f), u7h.b(u7h.b, 0.2f, 0.0f, 0.0f, 0.0f, 14), d4o1.a), x340Var3, 6);
                shl shlVarE = xhlVar.e();
                if (vtf1Var.d.length() <= 0 || !this.b) {
                    qim0Var = qim0Var2;
                    z = false;
                    f = 0.0f;
                    x340Var3.i0(1093870392);
                    x340Var3.r(false);
                } else {
                    x340Var3.i0(1093206341);
                    qim0Var = qim0Var2;
                    ncf0 ncf0VarG = h5p1.G(new pcf0(vtf1Var.d), (String) null, (xu30) null, x340Var3, 0, 62);
                    kbf0 kbf0VarN = zpn1.n(ncf0VarG.c(), this.c, false, (bcf0) null, 0.0f, Integer.MAX_VALUE, x340Var3, 952);
                    fcf0 fcf0VarC = ncf0VarG.c();
                    boolean zG = x340Var3.g(kbf0VarN);
                    Object objT = x340Var3.T();
                    if (zG || objT == m4cVar) {
                        objT = new uk1(kbf0VarN, (byte) 17);
                        x340Var3.s0(objT);
                    }
                    Function0 function0 = (Function0) objT;
                    f = 0.0f;
                    qim0 qim0VarZ = uyn1.z(5.0f, 0.0f, 2, u291.f(qim0Var, 1.0f));
                    boolean zG2 = x340Var3.g(ihlVarK);
                    Object objT2 = x340Var3.T();
                    if (zG2 || objT2 == m4cVar) {
                        objT2 = new pu(ihlVarK, (byte) 28);
                        x340Var3.s0(objT2);
                    }
                    mp10.e(fcf0VarC, function0, xhl.j(qim0VarZ, ihlVarK2, (iu30) objT2), false, false, false, (xc21) null, false, (ddf0) null, (tl3) null, (j6m) null, false, false, (Map) null, (jj7) null, false, x340Var3, 0, 0, 65528);
                    x340Var3 = x340Var3;
                    z = false;
                    x340Var3.r(false);
                }
                qim0 qim0VarF = u291.f(qim0Var, 1.0f);
                boolean zG3 = x340Var3.g(shlVarE);
                Object objT3 = x340Var3.T();
                if (zG3 || objT3 == m4cVar) {
                    objT3 = new esy0(shlVarE, (byte) 2);
                    x340Var3.s0(objT3);
                }
                qim0 qim0VarJ = xhl.j(qim0VarF, ihlVarK, (iu30) objT3);
                gfh0 gfh0VarC = t1c.c(een.d, z);
                int iHashCode = Long.hashCode(x340Var3.T);
                xos0 xos0VarM = x340Var3.m();
                qim0 qim0VarE = zr7.E(x340Var3, qim0VarJ);
                hzj.A.getClass();
                if (x340Var3.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var3.m0();
                if (x340Var3.S) {
                    x340Var3.l(hmb0.t1);
                } else {
                    x340Var3.v0();
                }
                nko1.H(gfh0VarC, x340Var3, y580.O0);
                nko1.H(xos0VarM, x340Var3, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var3, y580.R0);
                nko1.F(x340Var3);
                nko1.H(qim0VarE, x340Var3, y580.Y);
                uwr uwrVar = cbx.a;
                cua cuaVar = cbx.b(x340Var3).f;
                cr31 cr31VarB = er31.b(8.0f);
                tob1 tob1VarA = z95.a(this.d ? 12.0f : 70.0f, (fe5) null, "marginAnimation", x340Var3, 384, 10);
                x340 x340Var4 = x340Var3;
                fwx fwxVarG = hso1.G(ltx.c, 0L, ((yex) zex.a.d).c, x340Var4, ltx.d, 22);
                eso1.h(oi7.a(Uri.parse(vtf1Var.c.a), (gw70) null, (xb10) obj3, (yqi1) null, fwxVarG, fwxVarG, false, false, (j6m) null, (iu30) null, (iu30) null, (iu30) null, 0L, x340Var4, 2359296, 0, 130966), isl.a, i1p1.q(sto1.o(d7e.r(1.0f, uyn1.z(((p3v) tob1VarA.getValue()).a, f, 2, qim0Var), z), 16.0f, cr31VarB, false, 0L, u7h.j, 12), cr31VarB), (p3v) null, (zvx) null, (ecx) null, mif1.P0, (tl3) null, (ColorFilter) null, x340Var4, 1600560, 416);
                x340Var4.r(true);
                x340Var4.r(z);
                if (((uhl) xhlVar).b == i) {
                    return rih1Var;
                }
                qxd0.S((su) obj5, x340Var4);
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                s1p1.f((String) obj7, (String) obj6, this.b, this.c, this.d, (Function0) obj5, (Function0) obj4, (Function0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eob0(String str, String str2, boolean z, boolean z2, boolean z3, Function0 function0, Function0 function1, Function0 function2, int i) {
        super(2);
        this.e = str;
        this.f = str2;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.g = function0;
        this.h = function1;
        this.i = function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eob0(ven0 ven0Var, xhl xhlVar, su suVar, vtf1 vtf1Var, boolean z, boolean z2, boolean z3, xb10 xb10Var) {
        super(2);
        this.e = ven0Var;
        this.f = xhlVar;
        this.g = suVar;
        this.h = vtf1Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.i = xb10Var;
    }
}
