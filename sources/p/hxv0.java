package p;

import androidx.compose.ui.graphics.ColorFilter;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class hxv0 extends hab0 implements xu30 {
    public final /* synthetic */ ven0 N0;
    public final /* synthetic */ tob1 O0;
    public final /* synthetic */ iu30 P0;
    public final /* synthetic */ esv0 X;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ boolean Z;
    public final /* synthetic */ vuv0 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ iu30 f;
    public final /* synthetic */ ven0 g;
    public final /* synthetic */ ven0 h;
    public final /* synthetic */ Function0 i;
    public final /* synthetic */ gw70 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hxv0(vuv0 vuv0Var, String str, boolean z, boolean z2, boolean z3, iu30 iu30Var, ven0 ven0Var, ven0 ven0Var2, Function0 function0, gw70 gw70Var, esv0 esv0Var, boolean z4, boolean z5, ven0 ven0Var3, tob1 tob1Var, iu30 iu30Var2) {
        super(3);
        this.a = vuv0Var;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = iu30Var;
        this.g = ven0Var;
        this.h = ven0Var2;
        this.i = function0;
        this.t = gw70Var;
        this.X = esv0Var;
        this.Y = z4;
        this.Z = z5;
        this.N0 = ven0Var3;
        this.O0 = tob1Var;
        this.P0 = iu30Var2;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0130  */
    /* JADX WARN: Code duplicated, block: B:56:0x027e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [int] */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        qim0 qim0VarA;
        Function0 function0;
        boolean z;
        ?? r2;
        boolean zG;
        Object objT;
        String str;
        boolean z2;
        boolean z3;
        i2c i2cVar = (i2c) obj;
        ((Number) obj3).intValue();
        m4c m4cVar = fkj0.X;
        vuv0 vuv0Var = this.a;
        String str2 = vuv0Var.e;
        ven0 ven0Var = this.h;
        boolean zBooleanValue = ((Boolean) ven0Var.getValue()).booleanValue();
        ven0 ven0Var2 = this.g;
        boolean zBooleanValue2 = ((Boolean) ven0Var2.getValue()).booleanValue();
        b0k b0kVar = (x340) ((b0k) obj2);
        iu30 iu30Var = this.f;
        boolean zG2 = b0kVar.g(iu30Var);
        j06 j06Var = ((x340) b0kVar).a;
        boolean zI = zG2 | b0kVar.i(ven0Var2) | b0kVar.i(ven0Var);
        Object objT2 = b0kVar.T();
        if (zI || objT2 == m4cVar) {
            objT2 = new fff(iu30Var, ven0Var2, ven0Var, (byte) 4);
            b0kVar.s0(objT2);
        }
        Function0 function1 = (Function0) objT2;
        boolean zG3 = b0kVar.g(iu30Var);
        Object objT3 = b0kVar.T();
        if (zG3 || objT3 == m4cVar) {
            objT3 = new smt0(iu30Var, (byte) 20);
            b0kVar.s0(objT3);
        }
        ejo1.d(str2, this.b, this.c, zBooleanValue, zBooleanValue2, this.d, this.e, function1, (Function0) objT3, this.i, this.t, this.X, b0kVar, 0);
        b0k b0kVar2 = b0kVar;
        nim0 nim0Var = nim0.a;
        boolean z4 = this.d;
        if (z4) {
            float fD = i2cVar.d() / 1.5584415f;
            float f = n660.h;
            qim0VarA = uyn1.B(nim0Var, 0.0f, (fD - 58.0f) + 24.0f, 0.0f, 0.0f, 13);
        } else {
            qim0VarA = i2cVar.a(nim0Var, een.t);
        }
        qim0 qim0VarF = u291.f(qim0VarA, 1.0f);
        mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar2, 0);
        int iHashCode = Long.hashCode(((x340) b0kVar2).T);
        xos0 xos0VarM = b0kVar2.m();
        qim0 qim0VarE = zr7.E(b0kVar2, qim0VarF);
        hzj.A.getClass();
        if (j06Var == null) {
            tgp1.p();
            throw null;
        }
        b0kVar2.m0();
        boolean z5 = ((x340) b0kVar2).S;
        n4k n4kVar = hmb0.t1;
        if (z5) {
            b0kVar2.l(n4kVar);
        } else {
            b0kVar2.v0();
        }
        llj lljVar = y580.O0;
        nko1.H(mbhVarA, b0kVar2, lljVar);
        llj lljVar2 = y580.N0;
        nko1.H(xos0VarM, b0kVar2, lljVar2);
        Integer numValueOf = Integer.valueOf(iHashCode);
        llj lljVar3 = y580.R0;
        nko1.H(numValueOf, b0kVar2, lljVar3);
        nko1.F(b0kVar2);
        llj lljVar4 = y580.Y;
        nko1.H(qim0VarE, b0kVar2, lljVar4);
        uuv0 uuv0Var = vuv0Var.m;
        Function0 function2 = this.i;
        if (uuv0Var != null) {
            k760 k760Var = uuv0Var.a;
            if (k760Var.equals(h760.a) || k760Var.equals(f760.a) || (str = vuv0Var.k) == null || ihc1.y0(str)) {
                function0 = function2;
                z4 = z4;
                z = true;
                r2 = 0;
                b0kVar2.i0(-1540086631);
                jmr0 jmr0VarN = i3o1.n(2131233774, b0kVar2, 0);
                String strO0 = cwl1.o0(b0kVar2, 2131960272);
                float f2 = n660.h;
                qim0 qim0VarD = eqr0.D(0.0f, -24.0f, 1, nim0Var);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(b0kVar2).b;
                qim0 qim0VarX = uyn1.x(qim0VarD, 16.0f);
                zG = b0kVar2.g(function0);
                objT = b0kVar2.T();
                if (zG || objT == m4cVar) {
                    objT = new hii0(function0, (byte) 12);
                    b0kVar2.s0(objT);
                }
                cwl1.f(jmr0VarN, strO0, i541.C(qim0VarX, (iu30) objT), (tl3) null, (j6m) null, 0.0f, (ColorFilter) null, b0kVar2, 8, 120);
                b0kVar2 = b0kVar2;
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(-1539647454);
                fra fraVar = een.N0;
                float f3 = n660.h;
                qim0 qim0VarF2 = u291.f(eqr0.D(0.0f, -24.0f, 1, nim0Var), 1.0f);
                yla.s(b0kVar2);
                qim0 qim0VarJ = u291.j(32.0f, 0.0f, 2, qim0VarF2);
                jw31 jw31VarA = ew31.a(h36.a, fraVar, b0kVar2, 0);
                int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
                xos0 xos0VarM2 = b0kVar2.m();
                qim0 qim0VarE2 = zr7.E(b0kVar2, qim0VarJ);
                b0kVar2.m0();
                if (((x340) b0kVar2).S) {
                    b0kVar2.l(n4kVar);
                } else {
                    b0kVar2.v0();
                }
                nko1.H(jw31VarA, b0kVar2, lljVar);
                nko1.H(xos0VarM2, b0kVar2, lljVar2);
                x0d.q(iHashCode2, b0kVar2, lljVar3, b0kVar2);
                nko1.H(qim0VarE2, b0kVar2, lljVar4);
                myo1.k(vuv0Var, function2, b0kVar2, 0);
                z = true;
                kk0.s(1.0f, true, b0kVar2);
                if (this.Y && ((Boolean) ven0Var.getValue()).booleanValue() && (z3 = this.Z)) {
                    b0kVar2.i0(319332266);
                    boolean z6 = this.c;
                    boolean z7 = !z6;
                    boolean zH = b0kVar2.h(z6);
                    ven0 ven0Var3 = this.N0;
                    boolean zI2 = zH | b0kVar2.i(ven0Var3);
                    tob1 tob1Var = this.O0;
                    boolean zI3 = zI2 | b0kVar2.i(tob1Var) | b0kVar2.h(z3);
                    iu30 iu30Var2 = this.P0;
                    boolean zG4 = zI3 | b0kVar2.g(iu30Var2);
                    Object objT4 = b0kVar2.T();
                    if (zG4 || objT4 == m4cVar) {
                        objT4 = new n6v(z6, z3, iu30Var2, ven0Var3, tob1Var);
                        b0kVar2.s0(objT4);
                    }
                    Function0 function3 = (Function0) objT4;
                    String str3 = vuv0Var.i;
                    z2 = false;
                    String str4 = vuv0Var.j;
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar2 = cbx.b(b0kVar2).b;
                    qim0 qim0VarB = uyn1.B(nim0Var, 0.0f, 0.0f, 16.0f, 0.0f, 11);
                    boolean zG5 = b0kVar2.g(function2);
                    Object objT5 = b0kVar2.T();
                    if (zG5 || objT5 == m4cVar) {
                        objT5 = new hii0(function2, (byte) 13);
                        b0kVar2.s0(objT5);
                    }
                    qim0 qim0VarN = anm1.N("premium_visual_header_video_pause", i541.C(qim0VarB, (iu30) objT5));
                    function0 = function2;
                    t3p1.s(0, str3, str4, function3, b0kVar2, qim0VarN, z7);
                    b0kVar2.r(false);
                } else {
                    function0 = function2;
                    z2 = false;
                    b0kVar2.i0(320354770);
                    b0kVar2.r(false);
                }
                b0kVar2.r(true);
                b0kVar2.r(z2);
                r2 = z2;
            }
        } else {
            function0 = function2;
            z4 = z4;
            z = true;
            r2 = 0;
            b0kVar2.i0(-1540086631);
            jmr0 jmr0VarN2 = i3o1.n(2131233774, b0kVar2, 0);
            String strO1 = cwl1.o0(b0kVar2, 2131960272);
            float f4 = n660.h;
            qim0 qim0VarD2 = eqr0.D(0.0f, -24.0f, 1, nim0Var);
            uwr uwrVar3 = cbx.a;
            cvx cvxVar3 = cbx.b(b0kVar2).b;
            qim0 qim0VarX2 = uyn1.x(qim0VarD2, 16.0f);
            zG = b0kVar2.g(function0);
            objT = b0kVar2.T();
            if (zG) {
                objT = new hii0(function0, (byte) 12);
                b0kVar2.s0(objT);
            } else {
                objT = new hii0(function0, (byte) 12);
                b0kVar2.s0(objT);
            }
            cwl1.f(jmr0VarN2, strO1, i541.C(qim0VarX2, (iu30) objT), (tl3) null, (j6m) null, 0.0f, (ColorFilter) null, b0kVar2, 8, 120);
            b0kVar2 = b0kVar2;
            b0kVar2.r(false);
        }
        wgo1.j(vuv0Var, function0, z4 ^ z, b0kVar2, (int) r2);
        b0kVar2.r(z);
        return rih1.a;
    }
}
