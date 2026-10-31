package p;

import androidx.compose.ui.text.font.FontWeight;
import java.util.Locale;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jck extends hab0 implements vu30 {
    public final /* synthetic */ hdk a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ float e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ float g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jck(hdk hdkVar, boolean z, boolean z2, iu30 iu30Var, float f, Function0 function0, float f2) {
        super(2);
        this.a = hdkVar;
        this.b = z;
        this.c = z2;
        this.d = iu30Var;
        this.e = f;
        this.f = function0;
        this.g = f2;
    }

    /* JADX WARN: Type inference failed for: r15v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [boolean, int] */
    public final Object invoke(Object obj, Object obj2) {
        hdk hdkVar;
        vu30 vu30Var;
        llj lljVar;
        Function0 function0;
        u7h u7hVar;
        ?? r7;
        pw31 pw31Var;
        u7h u7hVar2;
        long j;
        vu30 vu30Var2;
        boolean z;
        boolean z2;
        boolean z3;
        ?? r15;
        long j2;
        cjc0 cjc0Var;
        long j3;
        long j4;
        cjc0 cjc0Var2;
        boolean z4;
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2);
        j06 j06Var = x340Var2.a;
        if (zY) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            jw31 jw31VarA = ew31.a(h36.g, een.O0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z5 = x340Var2.S;
            Function0 function1 = hmb0.t1;
            if (z5) {
                x340Var2.l(function1);
            } else {
                x340Var2.v0();
            }
            llj lljVar2 = y580.O0;
            nko1.H(jw31VarA, x340Var2, lljVar2);
            vu30 vu30Var3 = y580.N0;
            nko1.H(xos0VarM, x340Var2, vu30Var3);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            vu30 vu30Var4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, vu30Var4);
            hdk hdkVar2 = this.a;
            String str = hdkVar2.e;
            String str2 = hdkVar2.d;
            u7h u7hVar3 = hdkVar2.j;
            boolean z6 = hdkVar2.s;
            int length = str.length();
            boolean z7 = this.b;
            cjc0 cjc0Var3 = bjc0.a;
            pw31 pw31Var2 = pw31.a;
            if (length > 0) {
                x340Var2.i0(-652085221);
                String str3 = hdkVar2.e;
                uwr uwrVar = cbx.a;
                lee1 lee1Var = cbx.d(x340Var2).k;
                if (u7hVar3 == null) {
                    x340Var2.i0(-1960692607);
                    j4 = cbx.a(x340Var2).b.a;
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(-1960693878);
                    x340Var2.r(false);
                    j4 = u7hVar3.a;
                }
                if (z7) {
                    cjc0Var2 = cjc0Var3;
                    z4 = true;
                } else {
                    z4 = true;
                    cjc0Var2 = new cjc0(1);
                }
                qim0 qim0VarA = pw31Var2.a(1.0f, nim0Var, z4);
                vu30Var = vu30Var3;
                function0 = function1;
                hdkVar = hdkVar2;
                u7hVar = u7hVar3;
                cjc0 cjc0Var4 = cjc0Var2;
                pw31Var = pw31Var2;
                lljVar = lljVar3;
                uwo1.e(str3, qim0VarA, lee1Var, j4, (a0e1) null, (iu30) null, 2, false, cjc0Var4, 0, (qx8) null, x340Var2, 0, 0, 1712);
                x340Var2 = x340Var2;
                r7 = 0;
                x340Var2.r(false);
            } else {
                hdkVar = hdkVar2;
                vu30Var = vu30Var3;
                lljVar = lljVar3;
                function0 = function1;
                u7hVar = u7hVar3;
                r7 = 0;
                pw31Var = pw31Var2;
                x340Var2.i0(-651717499);
                op71.g(x340Var2, pw31Var.a(1.0f, nim0Var, true));
                x340Var2.r(false);
            }
            boolean z8 = this.c;
            if (z6 != 0 || z8) {
                x340Var2.i0(-651569071);
                uwr uwrVar2 = cbx.a;
                cvx cvxVar = cbx.b(x340Var2).b;
                jw31 jw31VarA2 = ew31.a(new d36(16.0f, true, new um5((boolean) r7)), een.Z, x340Var2, (int) r7);
                int iHashCode2 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM2 = x340Var2.m();
                qim0 qim0VarE2 = zr7.E(x340Var2, nim0Var);
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(function0);
                } else {
                    x340Var2.v0();
                }
                nko1.H(jw31VarA2, x340Var2, lljVar2);
                nko1.H(xos0VarM2, x340Var2, vu30Var);
                x0d.q(iHashCode2, x340Var2, lljVar, x340Var2);
                nko1.H(qim0VarE2, x340Var2, vu30Var4);
                if (u7hVar == null) {
                    x340Var2.i0(410243787);
                    long j5 = cbx.a(x340Var2).b.a;
                    x340Var2.r(false);
                    j = j5;
                    u7hVar2 = u7hVar;
                } else {
                    x340Var2.i0(410242516);
                    x340Var2.r(false);
                    u7hVar2 = u7hVar;
                    j = u7hVar2.a;
                }
                if (z6) {
                    x340Var2.i0(-167270027);
                    fpx fpxVar = fpx.c;
                    zov0 zov0Var = cbx.b(x340Var2).g;
                    qim0 qim0VarR = u291.r(nim0Var, 24.0f);
                    iu30 iu30Var = this.d;
                    boolean zG = x340Var2.g(iu30Var);
                    Object objT = x340Var2.T();
                    if (zG || objT == fkj0.X) {
                        objT = new erj(iu30Var, (byte) 29);
                        x340Var2.s0(objT);
                    }
                    x340 x340Var3 = x340Var2;
                    z = z8;
                    vu30Var2 = vu30Var4;
                    w0h1.a(fpxVar, isl.a, bin.x(qim0VarR, false, (String) null, (pm31) null, (idn0) null, (Function0) objT, 15), j, 0L, false, x340Var3, fpx.d | 48, 48);
                    x340Var2 = x340Var3;
                    z2 = false;
                    x340Var2.r(false);
                } else {
                    vu30Var2 = vu30Var4;
                    z = z8;
                    z2 = false;
                    x340Var2.i0(-166910117);
                    x340Var2.r(false);
                }
                if (z) {
                    x340Var2.i0(-166865787);
                    rck.g(this.e, j, false, this.f, null, x340Var2, 384);
                    x340Var2.r(z2);
                } else {
                    x340Var2.i0(-166629381);
                    x340Var2.r(z2);
                }
                z3 = true;
                x340Var2.r(true);
                x340Var2.r(z2);
                r15 = z2;
            } else {
                x340Var2.i0(-650688795);
                x340Var2.r((boolean) r7);
                pw31Var = pw31Var;
                r15 = r7;
                u7hVar2 = u7hVar;
                vu30Var2 = vu30Var4;
                z3 = true;
            }
            x340Var2.r(z3);
            qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
            fra fraVar = een.N0;
            uwr uwrVar3 = cbx.a;
            cvx cvxVar2 = cbx.b(x340Var2).b;
            jw31 jw31VarA3 = ew31.a(new d36(8.0f, z3, new um5((boolean) r15)), fraVar, x340Var2, (int) r15);
            int iHashCode3 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM3 = x340Var2.m();
            qim0 qim0VarE3 = zr7.E(x340Var2, qim0VarF2);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(function0);
            } else {
                x340Var2.v0();
            }
            nko1.H(jw31VarA3, x340Var2, lljVar2);
            nko1.H(xos0VarM3, x340Var2, vu30Var);
            x0d.q(iHashCode3, x340Var2, lljVar, x340Var2);
            nko1.H(qim0VarE3, x340Var2, vu30Var2);
            hdk hdkVar3 = hdkVar;
            String str4 = hdkVar3.c;
            String str5 = hdkVar3.b;
            rck.b(str4, this.g, 4.0f, x340Var2, 0);
            qim0 qim0VarA2 = pw31Var.a(1.0f, nim0Var, true);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode4 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM4 = x340Var2.m();
            qim0 qim0VarE4 = zr7.E(x340Var2, qim0VarA2);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(function0);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA, x340Var2, lljVar2);
            nko1.H(xos0VarM4, x340Var2, vu30Var);
            x0d.q(iHashCode4, x340Var2, lljVar, x340Var2);
            nko1.H(qim0VarE4, x340Var2, vu30Var2);
            boolean zI0 = ihc1.i0(ihc1.e1(str5).toString(), ' ');
            String upperCase = str5.toUpperCase(Locale.ROOT);
            lee1 lee1Var2 = cbx.d(x340Var2).c;
            yfu yfuVar = ajx.a;
            Object obj3 = yfuVar.b;
            FontWeight fontWeight = (FontWeight) ((bjx) yfuVar.c).e;
            u7h u7hVar4 = u7hVar2;
            if (u7hVar4 == null) {
                x340Var2.i0(1077262452);
                j2 = cbx.a(x340Var2).b.a;
                x340Var2.r(false);
            } else {
                x340Var2.i0(1077261181);
                x340Var2.r(false);
                j2 = u7hVar4.a;
            }
            long j6 = j2;
            if (
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r16v0 ??
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 1059
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p.jck.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }
