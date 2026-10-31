package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class reb extends hab0 implements vu30 {
    public final /* synthetic */ ven0 N0;
    public final /* synthetic */ String O0;
    public final /* synthetic */ dk80 X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ Function0 Z;
    public final /* synthetic */ long a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ m0d c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ lz20 e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ String g;
    public final /* synthetic */ y7e1 h;
    public final /* synthetic */ fyx i;
    public final /* synthetic */ boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public reb(long j, boolean z, m0d m0dVar, iu30 iu30Var, lz20 lz20Var, Function0 function0, String str, y7e1 y7e1Var, fyx fyxVar, boolean z2, dk80 dk80Var, String str2, Function0 function1, ven0 ven0Var, String str3) {
        super(2);
        this.a = j;
        this.b = z;
        this.c = m0dVar;
        this.d = iu30Var;
        this.e = lz20Var;
        this.f = function0;
        this.g = str;
        this.h = y7e1Var;
        this.i = fyxVar;
        this.t = z2;
        this.X = dk80Var;
        this.Y = str2;
        this.Z = function1;
        this.N0 = ven0Var;
        this.O0 = str3;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x026d  */
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i;
        boolean z2;
        b0k b0kVar = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        m4c m4cVar = fkj0.X;
        b0k b0kVar2 = (x340) b0kVar;
        boolean zY = b0kVar2.Y(iIntValue & 1, (iIntValue & 3) != 2);
        j06 j06Var = ((x340) b0kVar2).a;
        if (zY) {
            fra fraVar = een.N0;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarQ = i1p1.q(u291.h(u291.f(nim0Var, 1.0f), 48.0f), px61.b(b0kVar2, 5));
            uwr uwrVar = cbx.a;
            qim0 qim0VarF = dug.f(qim0VarQ, cbx.a(b0kVar2).a.c, px61.b(b0kVar2, 5));
            long j = this.a;
            qqb qqbVarD = k1u.d(1.0f, j);
            qim0 qim0VarF2 = d1u.F(qim0VarF, qqbVarD.a, qqbVarD.b, px61.b(b0kVar2, 5));
            jw31 jw31VarA = ew31.a(h36.a, fraVar, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarF2);
            hzj.A.getClass();
            String strK = null;
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            boolean z3 = ((x340) b0kVar2).S;
            n4k n4kVar = hmb0.t1;
            if (z3) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, b0kVar2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar2, lljVar3);
            nko1.F(b0kVar2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, b0kVar2, lljVar4);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM2 = b0kVar2.m();
            qim0 qim0VarE2 = zr7.E(b0kVar2, nim0Var);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            nko1.H(gfh0VarC, b0kVar2, lljVar);
            nko1.H(xos0VarM2, b0kVar2, lljVar2);
            x0d.q(iHashCode2, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE2, b0kVar2, lljVar4);
            qim0 qim0VarC = u291.c(u291.v(nim0Var, 104.0f), 1.0f);
            m0d m0dVar = this.c;
            boolean z4 = m0dVar != null;
            pm31 pm31Var = new pm31(0);
            Function0 function0 = this.Z;
            boolean zG = b0kVar2.g(function0);
            ven0 ven0Var = this.N0;
            boolean zI = zG | b0kVar2.i(ven0Var);
            Object objT = b0kVar2.T();
            if (zI || objT == m4cVar) {
                objT = new cb(function0, ven0Var, (byte) 5);
                b0kVar2.s0(objT);
            }
            qim0 qim0VarN = anm1.N("calling_code_picker", bin.x(qim0VarC, z4, this.Y, pm31Var, (idn0) null, (Function0) objT, 8));
            boolean zI2 = b0kVar2.i(m0dVar);
            String str = this.O0;
            boolean zG2 = zI2 | b0kVar2.g(str);
            Object objT2 = b0kVar2.T();
            if (zG2 || objT2 == m4cVar) {
                objT2 = new kd8(m0dVar, str, (byte) 25);
                b0kVar2.s0(objT2);
            }
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, s161.b(qim0VarN, false, (iu30) objT2));
            gfh0 gfh0VarC2 = t1c.c(een.h, false);
            int iHashCode3 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM3 = b0kVar2.m();
            qim0 qim0VarE3 = zr7.E(b0kVar2, qim0VarZ);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            nko1.H(gfh0VarC2, b0kVar2, lljVar);
            nko1.H(xos0VarM3, b0kVar2, lljVar2);
            x0d.q(iHashCode3, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE3, b0kVar2, lljVar4);
            if (m0dVar == null) {
                b0kVar2.i0(670571489);
                xto1.e(u291.r(nim0Var, 24.0f), 0, 0L, 0L, b0kVar2, 0, 14);
                i = 0;
                b0kVar2.r(false);
                z = true;
            } else {
                b0kVar2.i0(670689010);
                qim0 qim0VarF3 = u291.f(nim0Var, 1.0f);
                jw31 jw31VarA2 = ew31.a(h36.g, fraVar, b0kVar2, 0);
                int iHashCode4 = Long.hashCode(((x340) b0kVar2).T);
                xos0 xos0VarM4 = b0kVar2.m();
                qim0 qim0VarE4 = zr7.E(b0kVar2, qim0VarF3);
                b0kVar2.m0();
                if (((x340) b0kVar2).S) {
                    b0kVar2.l(n4kVar);
                } else {
                    b0kVar2.v0();
                }
                nko1.H(jw31VarA2, b0kVar2, lljVar);
                nko1.H(xos0VarM4, b0kVar2, lljVar2);
                x0d.q(iHashCode4, b0kVar2, lljVar3, b0kVar2);
                nko1.H(qim0VarE4, b0kVar2, lljVar4);
                uwo1.e(m0dVar.b, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2046);
                w0h1.a(mlx.c, isl.a, (qim0) null, cbx.a(b0kVar2).c.b, 0L, false, b0kVar2, mlx.d | 48, 52);
                b0kVar2 = b0kVar2;
                z = true;
                b0kVar2.r(true);
                i = 0;
                b0kVar2.r(false);
            }
            b0kVar2.r(z);
            b0kVar2.r(z);
            t1c.a(dug.f(u291.c(u291.v(nim0Var, 1.0f), 1.0f), j, d4o1.a), b0kVar2, i);
            if (this.b) {
                if (u890.j(m0dVar != null ? m0dVar.a : null, "BR")) {
                    strK = x0d.k(b0kVar2, -1056537703, 2131956574, b0kVar2, false);
                } else {
                    b0kVar2.i0(-1056424026);
                    b0kVar2.r(false);
                }
            } else {
                b0kVar2.i0(-1056424026);
                b0kVar2.r(false);
            }
            String str2 = strK;
            kua0 kua0Var = new kua0(0, null, 4, 2, 115);
            iu30 iu30Var = this.d;
            boolean zG3 = b0kVar2.g(iu30Var);
            Object objT3 = b0kVar2.T();
            if (zG3 || objT3 == m4cVar) {
                z2 = true;
                objT3 = new jeb(iu30Var, (byte) 1);
                b0kVar2.s0(objT3);
            } else {
                z2 = true;
            }
            yta0 yta0Var = (yta0) objT3;
            qim0 qim0VarP = vby0.p(u291.c(new wnb0(1.0f, z2), 1.0f), this.e);
            Function0 function1 = this.f;
            boolean zG4 = b0kVar2.g(function1);
            Object objT4 = b0kVar2.T();
            if (zG4 || objT4 == m4cVar) {
                objT4 = new vj0(function1, (byte) 7);
                b0kVar2.s0(objT4);
            }
            qim0 qim0VarN2 = anm1.N("phone_number_text", cev0.G(qim0VarP, (iu30) objT4));
            String str3 = this.g;
            boolean zG5 = b0kVar2.g(str3);
            Object objT5 = b0kVar2.T();
            if (zG5 || objT5 == m4cVar) {
                objT5 = new nb9(str3, (byte) 20);
                b0kVar2.s0(objT5);
            }
            b0k b0kVar3 = b0kVar2;
            rwo1.a(this.h, this.i, s161.b(qim0VarN2, false, (iu30) objT5), (max) null, str2, (vu30) null, (vu30) null, this.t, this.X, (lee1) null, kua0Var, yta0Var, d6e1.b, (vu30) null, (idn0) null, (uwg) null, (es41) null, (vzq0) null, 0.0f, false, b0kVar3, 0, 0, 0, 2082024);
            b0kVar3.r(true);
        } else {
            b0kVar2.b0();
        }
        return rih1.a;
    }
}
