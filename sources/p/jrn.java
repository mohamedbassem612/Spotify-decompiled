package p;

import android.net.Uri;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class jrn extends hab0 implements xu30 {
    public final /* synthetic */ Comparable X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jrn(String str, String str2, boolean z, String str3, p8q0 p8q0Var, iu30 iu30Var, String str4, boolean z2, lag lagVar, String str5, String str6) {
        super(3);
        this.b = str;
        this.f = str2;
        this.c = z;
        this.g = str3;
        this.h = p8q0Var;
        this.d = iu30Var;
        this.i = str4;
        this.e = z2;
        this.t = lagVar;
        this.X = str5;
        this.Y = str6;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        Object obj4 = this.Y;
        Comparable comparable = this.X;
        Object obj5 = this.t;
        Object obj6 = this.i;
        iu30 iu30Var = this.d;
        Object obj7 = this.h;
        Object obj8 = this.g;
        Object obj9 = this.f;
        String strO0 = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                m4c m4cVar = fkj0.X;
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                WeakHashMap weakHashMap = osl1.x;
                qim0 qim0VarB = uyn1.B(qim0VarF, 0.0f, 0.0f, 0.0f, poo1.x(new bgc0(lhc.g(x340Var).g, 32), x340Var).a(), 7);
                y7e1 y7e1Var = (y7e1) obj9;
                ven0 ven0Var = (ven0) obj8;
                Function0 function0 = (Function0) obj7;
                Uri uri = (Uri) obj5;
                Uri uri2 = (Uri) comparable;
                lz20 lz20Var = (lz20) obj4;
                Function0 function1 = (Function0) obj6;
                mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
                x340 x340Var2 = x340Var;
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
                hzj.A.getClass();
                x340 x340Var3 = x340Var;
                if (x340Var3.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var3.m0();
                if (x340Var3.S) {
                    x340Var3.l(n4kVar);
                } else {
                    x340Var3.v0();
                }
                nko1.H(mbhVarA, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                x340Var3.i0(-661992918);
                if (strO0.length() == 0) {
                    strO0 = cwl1.o0(x340Var, 2131952826);
                }
                String str = strO0;
                x340Var3.r(false);
                boolean z = !ihc1.y0(y7e1Var.d().d) && this.c;
                boolean zI = x340Var3.i(ven0Var) | x340Var3.g(function0);
                Object objT = x340Var3.T();
                if (zI || objT == m4cVar) {
                    objT = new cb(function0, ven0Var, (byte) 12);
                    x340Var3.s0(objT);
                }
                Function0 function2 = (Function0) objT;
                boolean zI2 = x340Var3.i(ven0Var) | x340Var3.g(iu30Var) | x340Var3.i(y7e1Var);
                Object objT2 = x340Var3.T();
                if (zI2 || objT2 == m4cVar) {
                    objT2 = new irn(iu30Var, y7e1Var, ven0Var, (byte) 0);
                    x340Var3.s0(objT2);
                }
                aqo1.j(0, str, function2, (Function0) objT2, x340Var, (qim0) null, z);
                qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                t1c.a(dug.f(u291.h(uyn1.z(0.0f, 16.0f, 1, qim0VarF2), 1.0f), cbx.a(x340Var).a.b.c(), d4o1.a), x340Var, 0);
                aqo1.g(uri == null ? uri2 : uri, y7e1Var, lz20Var, function1, this.e, (qim0) null, x340Var, 0);
                cvx cvxVar2 = cbx.b(x340Var).b;
                ydh.l(nim0Var, 16.0f, x340Var, x340Var3, true);
                return rih1Var;
            default:
                x340 x340Var4 = (b0k) obj2;
                ((Number) obj3).intValue();
                String str2 = (String) obj9;
                String str3 = (String) obj8;
                p8q0 p8q0Var = (p8q0) obj7;
                String str4 = (String) obj6;
                lag lagVar = (lag) obj5;
                String str5 = (String) comparable;
                String str6 = (String) obj4;
                gra graVar = een.d;
                gfh0 gfh0VarC = t1c.c(graVar, false);
                x340 x340Var5 = x340Var4;
                int iHashCode2 = Long.hashCode(x340Var5.T);
                xos0 xos0VarM2 = x340Var5.m();
                qim0 qim0VarE2 = zr7.E(x340Var4, nim0Var);
                hzj.A.getClass();
                x340 x340Var6 = x340Var4;
                if (x340Var6.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var6.m0();
                if (x340Var6.S) {
                    x340Var6.l(n4kVar);
                } else {
                    x340Var6.v0();
                }
                nko1.H(gfh0VarC, x340Var4, y580.O0);
                nko1.H(xos0VarM2, x340Var4, y580.N0);
                nko1.H(Integer.valueOf(iHashCode2), x340Var4, y580.R0);
                nko1.F(x340Var4);
                nko1.H(qim0VarE2, x340Var4, y580.Y);
                c680.m(strO0, str2, x340Var4, 0);
                boolean z2 = p8q0Var instanceof o8q0;
                boolean zG = x340Var6.g(iu30Var) | x340Var6.g(str4);
                Object objT3 = x340Var6.T();
                if (zG || objT3 == fkj0.X) {
                    objT3 = new are(iu30Var, str4, (byte) 11);
                    x340Var6.s0(objT3);
                }
                h2c h2cVar = h2c.a;
                c680.l(this.c, str3, z2, (Function0) objT3, h2cVar.a(nim0Var, graVar), x340Var4, 0);
                if (this.e) {
                    x340Var6.i0(2052512698);
                    otw.c(new tm((gw70) lagVar.b, (cnk) lagVar.c, (lc20) lagVar.d, (ynk) lagVar.e), new dnk(str5, str6), h2cVar.a(nim0Var, een.t), (ipb1) null, x340Var4, 0, 8);
                    x340Var6.r(false);
                } else {
                    x340Var6.i0(2052756792);
                    x340Var6.r(false);
                }
                x340Var6.r(true);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jrn(String str, y7e1 y7e1Var, boolean z, ven0 ven0Var, Function0 function0, iu30 iu30Var, Uri uri, Uri uri2, lz20 lz20Var, Function0 function1, boolean z2) {
        super(3);
        this.b = str;
        this.f = y7e1Var;
        this.c = z;
        this.g = ven0Var;
        this.h = function0;
        this.d = iu30Var;
        this.t = uri;
        this.X = uri2;
        this.Y = lz20Var;
        this.i = function1;
        this.e = z2;
    }
}
