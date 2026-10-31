package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.wrapped.v1.proto.Paragraph;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class kub {
    public static final ceo a = new ceo(0.3f, 1.4f, 0.5f, 1.0f);
    public static final ceo b = new ceo(0.3f, 0.0f, 0.0f, 1.0f);
    public static final ceo c = new ceo(0.0f, 0.0f, 0.2f, 1.0f);
    public static final ceo d = new ceo(0.0f, 0.0f, 0.2f, 1.0f);
    public static final ceo e = new ceo(0.0f, 0.0f, 0.2f, 1.0f);
    public static final ceo f = new ceo(0.42f, 0.0f, 0.58f, 1.0f);
    public static final ceo g = new ceo(0.3f, 0.0f, 0.0f, 1.0f);
    public static final ceo h = new ceo(0.0f, 0.0f, 0.2f, 1.0f);
    public static final float i = 16.0f;

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void a(btb btbVar, egm1 egm1Var, List list, boolean z, boolean z2, float f2, float f3, float f4, float f5, Function0 function0, Function0 function1, iu30 iu30Var, Function0 function2, Function0 function3, Function0 function4, Function0 function5, Function0 function6, Function0 function7, b0k b0kVar, int i2, int i3) throws NoWhenBranchMatchedException {
        int i4;
        int i5;
        Function0 function8;
        b0k b0kVar2;
        qim0 qim0Var;
        qim0 qim0VarB;
        tl3 tl3Var;
        vu30 vu30Var;
        sdp0 sdp0Var;
        boolean z3;
        boolean z4;
        vnr0 vnr0Var;
        tl3 tl3Var2 = een.t;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-108872333);
        j06 j06Var = ((x340) b0kVar3).a;
        if ((i2 & 6) == 0) {
            i4 = i2 | ((i2 & 8) == 0 ? b0kVar3.g(btbVar) : b0kVar3.i(btbVar) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= b0kVar3.i(egm1Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= (i2 & 512) == 0 ? b0kVar3.g(list) : b0kVar3.i(list) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= b0kVar3.h(z) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= b0kVar3.h(z2) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= b0kVar3.d(f2) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= b0kVar3.d(f3) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= b0kVar3.d(f4) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= b0kVar3.d(f5) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= b0kVar3.i(function0) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (b0kVar3.i(function1) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= b0kVar3.i(iu30Var) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= b0kVar3.i(function2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= b0kVar3.i(function3) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= b0kVar3.i(function4) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            i5 |= b0kVar3.i(function5) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i5 |= b0kVar3.i(function6) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i5 |= b0kVar3.i(function7) ? 8388608 : 4194304;
        }
        if (b0kVar3.Y(i4 & 1, ((i4 & 306783379) == 306783378 && (i5 & 4793491) == 4793490) ? false : true)) {
            ArrayList arrayList = btbVar.c;
            sdp0 sdp0Var2 = btbVar.b;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Iterator it2 = it;
                Object next = it2.next();
                if (next instanceof w50) {
                    arrayList2.add(next);
                }
                it = it2;
            }
            w50 w50Var = (w50) o7h.s0(arrayList2);
            ArrayList arrayList3 = btbVar.c;
            ArrayList arrayList4 = new ArrayList();
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                w50 w50Var2 = w50Var;
                Object next2 = it3.next();
                Iterator it4 = it3;
                if (next2 instanceof x50) {
                    arrayList4.add(next2);
                }
                w50Var = w50Var2;
                it3 = it4;
            }
            w50 w50Var3 = w50Var;
            x50 x50Var = (x50) o7h.s0(arrayList4);
            iec iecVar = (w50Var3 == null || list.isEmpty()) ? null : (iec) o7h.q0(list);
            qim0 qim0Var2 = nim0.a;
            float f6 = 1.0f;
            iec iecVar2 = iecVar;
            qim0 qim0VarF = u291.f(qim0Var2, 1.0f);
            float f7 = 0.0f;
            qim0 qim0VarZ = uyn1.z(20.0f, 0.0f, 2, qim0VarF);
            if ((x50Var != null ? x50Var.h : null) != null) {
                qim0VarB = uyn1.B(qim0Var2, 0.0f, i, 0.0f, 0.0f, 13);
                qim0Var = qim0Var2;
            } else {
                qim0Var = qim0Var2;
                qim0VarB = qim0Var;
            }
            qim0 qim0VarJ = u291.j(48.0f, 0.0f, 2, qim0VarZ.then(qim0VarB));
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = zmb.e1;
                b0kVar3.s0(objT);
            }
            qim0 qim0VarB2 = s161.b(qim0VarJ, false, (iu30) objT);
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarB2);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            boolean z5 = ((x340) b0kVar3).S;
            n4k n4kVar = hmb0.t1;
            if (z5) {
                b0kVar3.l(n4kVar);
            } else {
                b0kVar3.v0();
            }
            vu30 vu30Var2 = y580.O0;
            nko1.H(gfh0VarC, b0kVar3, vu30Var2);
            llj lljVar = y580.N0;
            nko1.H(xos0VarM, b0kVar3, lljVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar2 = y580.R0;
            nko1.H(numValueOf, b0kVar3, lljVar2);
            nko1.F(b0kVar3);
            llj lljVar3 = y580.Y;
            nko1.H(qim0VarE, b0kVar3, lljVar3);
            h2c h2cVar = h2c.a;
            if (sdp0Var2 == null || j(sdp0Var2.a) == null || f2 <= 0.0f) {
                tl3Var = tl3Var2;
                vu30Var = vu30Var2;
                sdp0Var = sdp0Var2;
                b0kVar2 = b0kVar3;
                b0kVar2.i0(-1099147319);
                b0kVar2.r(false);
            } else {
                b0kVar3.i0(-1099505772);
                e(function2, function3, b0kVar3, (i5 >> 6) & 126);
                int i6 = i4 >> 3;
                function5 = function5;
                lljVar3 = lljVar3;
                lljVar = lljVar;
                n4kVar = n4kVar;
                vu30Var = vu30Var2;
                sdp0Var = sdp0Var2;
                h2cVar = h2cVar;
                lljVar2 = lljVar2;
                tl3Var = tl3Var2;
                b0kVar2 = b0kVar3;
                function4 = function4;
                g(btbVar.b, f2, z, z2, function1, s161.b(h2cVar.a(qim0Var, tl3Var2), false, new jc5((byte) 10, 2.0f)), b0kVar2, ((i4 >> 12) & 112) | (i6 & 896) | (i6 & 7168) | ((i5 << 12) & 57344));
                b0kVar2.r(false);
            }
            Paragraph paragraph = sdp0Var != null ? sdp0Var.g : null;
            if (paragraph == null || j(sdp0Var.a) == null || f3 <= 0.0f) {
                b0kVar2.i0(-1098816983);
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(-1098999573);
                z6p1.f(paragraph, f3, h2cVar.a(qim0Var, tl3Var), b0kVar2, ((i4 >> 15) & 112) | 384);
                b0kVar2.r(false);
            }
            if (iecVar2 == null || !egm1Var.d || f4 <= 0.0f) {
                z3 = false;
                z4 = true;
                b0kVar2.i0(-1098304119);
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(-1098687558);
                e(function4, function5, b0kVar2, (i5 >> 12) & 126);
                float f8 = (1.0f - f4) * 10.0f;
                qim0 qim0VarN = fc11.n(i541.C(uyn1.z(60.0f, 0.0f, 2, s161.b(h2cVar.a(qim0Var, een.X), false, new jc5((byte) 10, f7))), new e8(f4, (0.07999998f * f4) + 0.92f, (byte) 2)), f8, f8, d4o1.a);
                gfh0 gfh0VarC2 = t1c.c(graVar, false);
                int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
                xos0 xos0VarM2 = b0kVar2.m();
                qim0 qim0VarE2 = zr7.E(b0kVar2, qim0VarN);
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                b0kVar2.m0();
                if (((x340) b0kVar2).S) {
                    b0kVar2.l(n4kVar);
                } else {
                    b0kVar2.v0();
                }
                nko1.H(gfh0VarC2, b0kVar2, vu30Var);
                nko1.H(xos0VarM2, b0kVar2, lljVar);
                x0d.q(iHashCode2, b0kVar2, lljVar2, b0kVar2);
                nko1.H(qim0VarE2, b0kVar2, lljVar3);
                z3 = false;
                e4p1.a(iecVar2, false, b0kVar2, 8, 2);
                z4 = true;
                b0kVar2.r(true);
                b0kVar2.r(false);
            }
            if (x50Var == null || f5 <= 0.0f) {
                function8 = function6;
                b0kVar2.i0(-1095461047);
                b0kVar2.r(z3);
            } else {
                b0kVar2.i0(-1098164340);
                Paragraph paragraph2 = x50Var.g;
                if (paragraph2 == null) {
                    b0kVar2.i0(-1098145803);
                    b0kVar2.r(z3);
                    vnr0Var = null;
                } else {
                    b0kVar2.i0(-1975086708);
                    vnr0 vnr0VarA = shy0.a(paragraph2, b0kVar2);
                    b0kVar2.r(z3);
                    vnr0Var = vnr0VarA;
                }
                hux huxVarJ = j(x50Var.a);
                if (paragraph2 == null && huxVarJ == null) {
                    b0kVar2.i0(-1095466999);
                    b0kVar2.r(z3);
                    function8 = function6;
                } else {
                    b0kVar2.i0(-1097956950);
                    function8 = function6;
                    e(function8, function7, b0kVar2, (i5 >> 18) & 126);
                    long j = x50Var.e;
                    long j2 = x50Var.d;
                    gqb gqbVar = x50Var.f;
                    zd60 zd60Var = x50Var.h;
                    String str = x50Var.c;
                    boolean zI = ((i5 & 112) == 32) | b0kVar2.i(x50Var);
                    Object objT2 = b0kVar2.T();
                    if (zI || objT2 == m4cVar) {
                        objT2 = new rqa(iu30Var, x50Var, (byte) 8);
                        b0kVar2.s0(objT2);
                    }
                    z3 = false;
                    z4 = true;
                    c(function0, j, j2, gqbVar, zd60Var, str, f5, z, (Function0) objT2, s161.b(h2cVar.a(qim0Var, een.Y), false, new jc5((byte) 10, f6)), apo.r(1468751988, new k8(paragraph2, huxVarJ, x50Var, vnr0Var, (byte) 16), b0kVar2), b0kVar2, ((i4 >> 27) & 14) | (3670016 & (i4 >> 6)) | (29360128 & (i4 << 12)));
                    b0kVar2.r(false);
                }
                b0kVar2.r(z3);
            }
            b0kVar2.r(z4);
        } else {
            function8 = function6;
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new vtb(btbVar, egm1Var, list, z, z2, f2, f3, f4, f5, function0, function1, iu30Var, function2, function3, function4, function5, function8, function7, i2, i3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:153:0x024e  */
    /* JADX WARN: Code duplicated, block: B:156:0x0253  */
    /* JADX WARN: Code duplicated, block: B:158:0x0257  */
    /* JADX WARN: Code duplicated, block: B:159:0x025a  */
    /* JADX WARN: Code duplicated, block: B:163:0x0289  */
    /* JADX WARN: Code duplicated, block: B:165:0x028f  */
    /* JADX WARN: Code duplicated, block: B:171:0x029d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:172:0x029f  */
    /* JADX WARN: Code duplicated, block: B:177:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:180:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:182:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:184:0x02db  */
    /* JADX WARN: Code duplicated, block: B:185:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:186:0x02df  */
    /* JADX WARN: Code duplicated, block: B:189:0x02f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:190:0x02f2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:191:0x02f4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:194:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:198:0x031e  */
    /* JADX WARN: Code duplicated, block: B:200:0x0324  */
    /* JADX WARN: Code duplicated, block: B:206:0x0333 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:207:0x0335  */
    /* JADX WARN: Code duplicated, block: B:212:0x0366 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:214:0x036a  */
    /* JADX WARN: Code duplicated, block: B:216:0x036d  */
    /* JADX WARN: Code duplicated, block: B:219:0x0373  */
    /* JADX WARN: Code duplicated, block: B:222:0x0380 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:223:0x0382 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:224:0x0384  */
    /* JADX WARN: Code duplicated, block: B:225:0x0387  */
    /* JADX WARN: Code duplicated, block: B:229:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:231:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:237:0x03c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:238:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:242:0x0421  */
    /* JADX WARN: Code duplicated, block: B:247:0x0435  */
    /* JADX WARN: Code duplicated, block: B:248:0x0438  */
    /* JADX WARN: Code duplicated, block: B:250:0x043b  */
    /* JADX WARN: Code duplicated, block: B:251:0x043e  */
    /* JADX WARN: Code duplicated, block: B:253:0x0442 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:255:0x0446  */
    /* JADX WARN: Code duplicated, block: B:258:0x0456 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:259:0x0458  */
    /* JADX WARN: Code duplicated, block: B:262:0x0479  */
    /* JADX WARN: Code duplicated, block: B:264:0x047f  */
    /* JADX WARN: Code duplicated, block: B:270:0x0498 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:271:0x049a  */
    /* JADX WARN: Code duplicated, block: B:276:0x04c2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:279:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:282:0x04d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:285:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:288:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:289:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:292:0x04f4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:295:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:298:0x050e  */
    /* JADX WARN: Code duplicated, block: B:299:0x0510  */
    /* JADX WARN: Code duplicated, block: B:302:0x053c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:303:0x053e  */
    /* JADX WARN: Code duplicated, block: B:306:0x056c  */
    /* JADX WARN: Code duplicated, block: B:308:0x0575  */
    /* JADX WARN: Code duplicated, block: B:309:0x0579  */
    /* JADX WARN: Code duplicated, block: B:312:0x0599 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:322:0x0600  */
    /* JADX WARN: Code duplicated, block: B:325:0x0610  */
    /* JADX WARN: Code duplicated, block: B:331:0x0623  */
    /* JADX WARN: Code duplicated, block: B:333:0x0687  */
    /* JADX WARN: Code duplicated, block: B:341:0x0429 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:343:0x041b A[SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: PrepareForCodeGen
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r30v2 int
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.instructions.args.RegisterArg.sameCodeVar(RegisterArg.java:193)
        	at jadx.core.dex.visitors.PrepareForCodeGen.modifyArith(PrepareForCodeGen.java:242)
        	at jadx.core.dex.visitors.PrepareForCodeGen.visit(PrepareForCodeGen.java:88)
        */
    public static final void b(p.btb r43, p.egm1 r44, java.util.List r45, long r46, boolean r48, boolean r49, java.lang.Integer r50, boolean r51, p.qim0 r52, boolean r53, kotlin.jvm.functions.Function0 r54, p.iu30 r55, kotlin.jvm.functions.Function0 r56, kotlin.jvm.functions.Function0 r57, kotlin.jvm.functions.Function0 r58, kotlin.jvm.functions.Function0 r59, kotlin.jvm.functions.Function0 r60, kotlin.jvm.functions.Function0 r61, kotlin.jvm.functions.Function0 r62, kotlin.jvm.functions.Function0 r63, kotlin.jvm.functions.Function0 r64, p.b0k r65, int r66) {
        /*
            Method dump skipped, instruction units count: 1746
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.kub.b(p.btb, p.egm1, java.util.List, long, boolean, boolean, java.lang.Integer, boolean, p.qim0, boolean, kotlin.jvm.functions.Function0, p.iu30, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, p.b0k, int):void");
    }

    public static final void c(Function0 function0, long j, long j2, gqb gqbVar, zd60 zd60Var, String str, float f2, boolean z, Function0 function1, qim0 qim0Var, j2i j2iVar, b0k b0kVar, int i2) {
        int i3;
        zd60 zd60Var2;
        qim0 qim0Var2;
        j2i j2iVar2;
        Function0 function2;
        x340 x340Var;
        zd60 zd60Var3;
        vu30 vu30Var;
        vu30 vu30Var2;
        x340 x340Var2;
        int i4;
        String str2;
        boolean zI;
        gqb gqbVar2 = gqbVar;
        gra graVar = een.h;
        x340 x340Var3 = (x340) b0kVar;
        x340Var3.k0(1879778636);
        j06 j06Var = x340Var3.a;
        if ((i2 & 6) == 0) {
            i3 = (x340Var3.i(function0) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var3.f(j) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var3.f(j2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= (i2 & 4096) == 0 ? x340Var3.g(gqbVar2) : x340Var3.i(gqbVar2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            if ((32768 & i2) == 0) {
                zd60Var2 = zd60Var;
                zI = x340Var3.g(zd60Var2);
            } else {
                zd60Var2 = zd60Var;
                zI = x340Var3.i(zd60Var2);
            }
            i3 |= zI ? 16384 : 8192;
        } else {
            zd60Var2 = zd60Var;
        }
        if ((i2 & 196608) == 0) {
            i3 |= x340Var3.g(str) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i3 |= x340Var3.d(f2) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i3 |= x340Var3.h(z) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i3 |= x340Var3.i(function1) ? 67108864 : 33554432;
        }
        if ((805306368 & i2) == 0) {
            qim0Var2 = qim0Var;
            i3 |= x340Var3.i(qim0Var2) ? 536870912 : 268435456;
        } else {
            qim0Var2 = qim0Var;
        }
        int i5 = i3;
        if (x340Var3.Y(i5 & 1, (i5 & 306783379) != 306783378)) {
            Object objT = x340Var3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = ktd.n(x340Var3);
            }
            idn0 idn0Var = (idn0) objT;
            tob1 tob1VarB = z95.b((!((Boolean) k1u.m(idn0Var, x340Var3, 0).getValue()).booleanValue() || z) ? 1.0f : 0.92f, irn1.o0(150, 0, d, 2), "flare-press", (iu30) null, x340Var3, 3072, 20);
            if (zd60Var2 == null) {
                zd60 zd60Var4 = new zd60(j, j2, gqbVar2);
                gqbVar2 = gqbVar2;
                zd60Var3 = zd60Var4;
            } else {
                zd60Var3 = zd60Var;
            }
            gqb gqbVar3 = zd60Var3.c;
            u5j1 u5j1Var = zd60Var != null ? null : d4o1.a;
            boolean z2 = zd60Var != null;
            u5j1 u5j1Var2 = u5j1Var;
            long j3 = gqbVar2 != null ? gqbVar2.a : j;
            long j4 = gqbVar3 != null ? gqbVar3.a : zd60Var3.a;
            kiv kivVar = t4k.h;
            long j5 = j4;
            float fX0 = ((wat) x340Var3.k(kivVar)).X0(gqbVar2 != null ? gqbVar2.b : 0.0f);
            float fX1 = ((wat) x340Var3.k(kivVar)).X0(gqbVar3 != null ? gqbVar3.b : 0.0f);
            float f3 = (1.0f - f2) * 10.0f;
            boolean z3 = (zd60Var == null && gqbVar2 == null) ? false : true;
            qim0 qim0VarN = fc11.n(i541.C(qim0Var2, new e8(f2, (0.19999999f * f2) + 0.8f, (byte) 2)), f3, f3, u5j1Var2);
            boolean zI2 = x340Var3.i(tob1VarB);
            Object objT2 = x340Var3.T();
            if (zI2 || objT2 == m4cVar) {
                objT2 = new lq2(tob1VarB, (byte) 23);
                x340Var3.s0(objT2);
            }
            qim0 qim0VarR = u291.r(i541.C(qim0VarN, (iu30) objT2), 48.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var3.T);
            xos0 xos0VarM = x340Var3.m();
            qim0 qim0VarE = zr7.E(x340Var3, qim0VarR);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var3.m0();
            boolean z4 = x340Var3.S;
            n4k n4kVar = hmb0.t1;
            if (z4) {
                x340Var3.l(n4kVar);
            } else {
                x340Var3.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, x340Var3, lljVar);
            vu30 vu30Var3 = y580.N0;
            nko1.H(xos0VarM, x340Var3, vu30Var3);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar2 = y580.R0;
            nko1.H(numValueOf, x340Var3, lljVar2);
            nko1.F(x340Var3);
            vu30 vu30Var4 = y580.Y;
            nko1.H(qim0VarE, x340Var3, vu30Var4);
            nim0 nim0Var = nim0.a;
            if (z2) {
                x340Var3.i0(1361929714);
                vu30Var = vu30Var3;
                vu30Var2 = vu30Var4;
                i4 = 32;
                d(function0, zd60Var3.a, h2c.a.a(nim0Var, graVar), x340Var3, i5 & 14);
                x340Var2 = x340Var3;
                x340Var2.r(false);
            } else {
                vu30Var = vu30Var3;
                vu30Var2 = vu30Var4;
                x340Var2 = x340Var3;
                i4 = 32;
                x340Var2.i0(1362093084);
                x340Var2.r(false);
            }
            qim0 qim0VarQ = i1p1.q(u291.d(nim0Var, 1.0f), er31.a);
            int i6 = i5 & 14;
            boolean zI3 = (i6 == 4) | ((i5 & 112) == i4) | x340Var2.i(zd60Var3) | x340Var2.h(z3) | x340Var2.d((float) 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x02ea: ARITH (r2v45 'zI3' boolean) = (wrap boolean:0x02e5: ARITH (wrap boolean:0x02e0: ARITH (wrap boolean:0x02db: ARITH (wrap boolean:0x02d6: ARITH (wrap boolean:0x02d1: ARITH (wrap boolean:0x02cc: ARITH (wrap boolean:?: TERNARY null = ((r1v16 'i6' int) == (4 int)) ? true : false) | (wrap boolean:?: TERNARY null = ((wrap int:0x02c5: ARITH (r24v0 'i5' int) & (112 int) A[WRAPPED] (LINE:710)) == (r8v4 'i4' int)) ? true : false) A[DONT_WRAP, WRAPPED] (LINE:717)) | (wrap boolean:0x02cd: INVOKE (r0v10 'x340Var2' p.x340), (r7v5 'zd60Var3' p.zd60) VIRTUAL call: p.x340.i(java.lang.Object):boolean A[WRAPPED] (LINE:718)) A[DONT_WRAP, WRAPPED] (LINE:722)) | (wrap boolean:0x02d2: INVOKE (r0v10 'x340Var2' p.x340), (r21v4 'z3' boolean) VIRTUAL call: p.x340.h(boolean):boolean A[WRAPPED] (LINE:723)) A[DONT_WRAP, WRAPPED] (LINE:727)) | (wrap boolean:0x02d7: INVOKE 
                  (r0v10 'x340Var2' p.x340)
                  (wrap float:?: CAST (float) (r22v2 ?? I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]))
                 VIRTUAL call: p.x340.d(float):boolean A[WRAPPED] (LINE:728)) A[DONT_WRAP, WRAPPED] (LINE:732)) | (wrap boolean:0x02dc: INVOKE 
                  (r0v10 'x340Var2' p.x340)
                  (wrap float:?: CAST (float) (r30v0 ?? I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]))
                 VIRTUAL call: p.x340.d(float):boolean A[WRAPPED] (LINE:733)) A[DONT_WRAP, WRAPPED] (LINE:737)) | (wrap boolean:0x02e1: INVOKE (r0v10 'x340Var2' p.x340), (r3v4 'j3' long) VIRTUAL call: p.x340.f(long):boolean A[WRAPPED] (LINE:738)) A[DONT_WRAP, WRAPPED] (LINE:742)) | (wrap boolean:0x02e6: INVOKE (r0v10 'x340Var2' p.x340), (r28v0 'j5' long) VIRTUAL call: p.x340.f(long):boolean A[WRAPPED] (LINE:743)) A[DECLARE_VAR] (LINE:747) in method: p.kub.c(kotlin.jvm.functions.Function0, long, long, p.gqb, p.zd60, java.lang.String, float, boolean, kotlin.jvm.functions.Function0, p.qim0, p.j2i, p.b0k, int):void, file: /workspace/spotify-analysis/dex-input/classes5.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r22v2 ??
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 987
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p.kub.c(kotlin.jvm.functions.Function0, long, long, p.gqb, p.zd60, java.lang.String, float, boolean, kotlin.jvm.functions.Function0, p.qim0, p.j2i, p.b0k, int):void");
        }

        public static final void d(Function0 function0, long j, qim0 qim0Var, b0k b0kVar, int i2) {
            int i3;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(1994974876);
            if ((i2 & 6) == 0) {
                i3 = (x340Var.i(function0) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & 48) == 0) {
                i3 |= x340Var.f(j) ? 32 : 16;
            }
            if ((i2 & 384) == 0) {
                i3 |= x340Var.i(qim0Var) ? 256 : 128;
            }
            byte b2 = 0;
            if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
                wat watVar = (wat) x340Var.k(t4k.h);
                float f2 = i;
                qim0 qim0VarM = u291.m(qim0Var, (2.0f * f2) + 48.0f);
                boolean zI = x340Var.i(watVar) | ((i3 & 14) == 4);
                Object objT = x340Var.T();
                if (zI || objT == fkj0.X) {
                    objT = new ztb(function0, watVar, b2);
                    x340Var.s0(objT);
                }
                t1c.a(dug.f(uyn1.x(i541.C(qim0VarM, (iu30) objT), f2), j, er31.a), x340Var, 0);
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new je3(function0, j, qim0Var, i2, (byte) 1);
            }
        }

        public static final void e(Function0 function0, Function0 function1, b0k b0kVar, int i2) {
            int i3;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(-568077017);
            if ((i2 & 6) == 0) {
                i3 = (x340Var.i(function0) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & 48) == 0) {
                i3 |= x340Var.i(function1) ? 32 : 16;
            }
            if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
                int i4 = i3 << 3;
                f(true, function0, function1, x340Var, (i4 & 896) | (i4 & 112) | 6);
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new k16(function0, function1, i2, (byte) 1);
            }
        }

        public static final void f(boolean z, Function0 function0, Function0 function1, b0k b0kVar, int i2) {
            int i3;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(2111742283);
            if ((i2 & 6) == 0) {
                i3 = (x340Var.h(z) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & 48) == 0) {
                i3 |= x340Var.i(function0) ? 32 : 16;
            }
            if ((i2 & 384) == 0) {
                i3 |= x340Var.i(function1) ? 256 : 128;
            }
            if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
                xhm1 xhm1Var = (xhm1) x340Var.k(yhm1.a);
                Boolean boolValueOf = Boolean.valueOf(z);
                boolean z2 = ((i3 & 14) == 4) | ((i3 & 112) == 32) | ((i3 & 896) == 256);
                Object objT = x340Var.T();
                if (z2 || objT == fkj0.X) {
                    objT = new c30(z, function0, function1, (byte) 8);
                    x340Var.s0(objT);
                }
                qxd0.h(boolValueOf, xhm1Var, (iu30) objT, x340Var);
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new bub(z, function0, function1, i2, (byte) 0);
            }
        }

        public static final void g(sdp0 sdp0Var, float f2, boolean z, boolean z2, Function0 function0, qim0 qim0Var, b0k b0kVar, int i2) {
            int i3;
            sdp0 sdp0Var2;
            h311 h311VarV;
            cub cubVar;
            int i4;
            tob1 tob1Var;
            Boolean bool;
            byte b2;
            o95 o95Var;
            qim0 qim0VarE;
            sdp0 sdp0Var3 = sdp0Var;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(836399870);
            int i5 = x340Var.S ? -x340Var.I.v : x340Var.G.i;
            if ((i2 & 6) == 0) {
                i3 = ((i2 & 8) == 0 ? x340Var.g(sdp0Var3) : x340Var.i(sdp0Var3) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & 48) == 0) {
                i3 |= x340Var.d(f2) ? 32 : 16;
            }
            if ((i2 & 384) == 0) {
                i3 |= x340Var.h(z) ? 256 : 128;
            }
            if ((i2 & 3072) == 0) {
                i3 |= x340Var.h(z2) ? 2048 : 1024;
            }
            if ((i2 & 24576) == 0) {
                i3 |= x340Var.i(function0) ? 16384 : 8192;
            }
            if ((196608 & i2) == 0) {
                i3 |= x340Var.i(qim0Var) ? 131072 : 65536;
            }
            if (x340Var.Y(i3 & 1, (74899 & i3) != 74898)) {
                Object objT = x340Var.T();
                m4c m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = ktd.n(x340Var);
                }
                idn0 idn0Var = (idn0) objT;
                tob1 tob1VarB = z95.b((!((Boolean) k1u.m(idn0Var, x340Var, 0).getValue()).booleanValue() || z) ? 1.0f : 0.92f, irn1.o0(150, 0, d, 2), "nudge-press", (iu30) null, x340Var, 3072, 20);
                boolean z3 = f2 >= 1.0f;
                Object objT2 = x340Var.T();
                if (objT2 == m4cVar) {
                    objT2 = v8r.q(Boolean.FALSE);
                    x340Var.s0(objT2);
                }
                tob1 tob1Var2 = (ven0) objT2;
                Boolean boolValueOf = Boolean.valueOf(z3);
                Boolean boolValueOf2 = Boolean.valueOf(z);
                int i6 = i3 & 14;
                int i7 = i5;
                boolean zH = x340Var.h(z3) | ((i3 & 896) == 256) | (i6 == 4 || ((i3 & 8) != 0 && x340Var.i(sdp0Var3))) | x340Var.i(tob1Var2);
                Object objT3 = x340Var.T();
                if (zH || objT3 == m4cVar) {
                    i4 = i6;
                    tob1Var = tob1Var2;
                    bool = boolValueOf2;
                    boolean z4 = z3;
                    b2 = 2;
                    objT3 = new es9(z4, z, (Object) sdp0Var3, (ven0) tob1Var, (lnm) null, (byte) 1);
                    sdp0Var3 = sdp0Var3;
                    x340Var.s0(objT3);
                } else {
                    i4 = i6;
                    tob1Var = tob1Var2;
                    b2 = 2;
                    bool = boolValueOf2;
                }
                qxd0.s(boolValueOf, bool, (vu30) objT3, x340Var);
                Object objT4 = x340Var.T();
                if (objT4 == m4cVar) {
                    objT4 = c97.b(0.0f);
                    x340Var.s0(objT4);
                }
                o95 o95Var2 = (o95) objT4;
                Object objT5 = x340Var.T();
                if (objT5 == m4cVar) {
                    objT5 = us71.i(-2.0f, x340Var);
                }
                drr0 drr0Var = (drr0) objT5;
                Boolean bool2 = (Boolean) tob1Var.getValue();
                bool2.booleanValue();
                Boolean boolValueOf3 = Boolean.valueOf(z2);
                boolean zI = ((i3 & 7168) == 2048) | x340Var.i(tob1Var) | x340Var.i(o95Var2) | x340Var.i(drr0Var);
                Object objT6 = x340Var.T();
                if (zI || objT6 == m4cVar) {
                    o95Var = o95Var2;
                    kv1 kv1Var = new kv1(z2, o95Var, tob1Var, drr0Var, (lnm) null, (byte) 3);
                    x340Var.s0(kv1Var);
                    objT6 = kv1Var;
                } else {
                    o95Var = o95Var2;
                }
                qxd0.s(bool2, boolValueOf3, (vu30) objT6, x340Var);
                float fFloatValue = ((Number) o95Var.e()).floatValue();
                float f3 = 10.0f * (1.0f - f2);
                qim0 qim0VarC = i541.C(qim0Var, new e8(f2, (0.19999999f * f2) + 0.8f, b2));
                u5j1 u5j1Var = d4o1.a;
                qim0 qim0VarN = fc11.n(qim0VarC, f3, f3, u5j1Var);
                boolean zI2 = x340Var.i(tob1VarB);
                Object objT7 = x340Var.T();
                if (zI2 || objT7 == m4cVar) {
                    objT7 = new lq2(tob1VarB, (byte) 24);
                    x340Var.s0(objT7);
                }
                qim0 qim0VarR = u291.r(i541.C(qim0VarN, (iu30) objT7), 48.0f);
                cr31 cr31Var = er31.a;
                qim0 qim0VarF = dug.f(i1p1.q(qim0VarR, cr31Var), sdp0Var3.e, u5j1Var);
                gqb gqbVar = sdp0Var3.f;
                qim0 qim0Var2 = nim0.a;
                if (gqbVar == null || (qim0VarE = d1u.E(gqbVar.b, gqbVar.a, qim0Var2, cr31Var)) == null) {
                    qim0VarE = qim0Var2;
                }
                qim0 qim0VarThen = qim0VarF.then(qim0VarE);
                boolean z5 = i4 == 4 || ((i3 & 8) != 0 && x340Var.i(sdp0Var3));
                Object objT8 = x340Var.T();
                if (z5 || objT8 == m4cVar) {
                    objT8 = new tla(sdp0Var3, (byte) 18);
                    x340Var.s0(objT8);
                }
                qim0 qim0VarU = bin.u(s161.b(qim0VarThen, true, (iu30) objT8), idn0Var, (ga80) null, f2 >= 1.0f, sdp0Var3.b, new pm31(0), function0);
                gfh0 gfh0VarC = t1c.c(een.h, false);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarU);
                hzj.A.getClass();
                if (x340Var.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(hmb0.t1);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE2, x340Var, y580.Y);
                x340Var.i0(493912059);
                hux huxVarJ = j(sdp0Var3.a);
                if (huxVarJ == null) {
                    if (i7 >= 0) {
                        if (x340Var.S) {
                            hf91 hf91Var = x340Var.I;
                            while (x340Var.S) {
                                x340Var.r(hf91Var.x(hf91Var.v));
                            }
                        }
                        ye91 ye91Var = x340Var.G;
                        while (true) {
                            int i8 = ye91Var.i;
                            if (i8 <= i7) {
                                break;
                            } else {
                                x340Var.r(ye91Var.l(i8));
                            }
                        }
                    } else {
                        int i9 = -i7;
                        hf91 hf91Var2 = x340Var.I;
                        while (true) {
                            int i10 = hf91Var2.v;
                            if (i10 <= i9) {
                                break;
                            } else {
                                x340Var.r(hf91Var2.x(i10));
                            }
                        }
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV == null) {
                        return;
                    } else {
                        cubVar = new cub(sdp0Var3, f2, z, z2, function0, qim0Var, i2, (byte) 0);
                    }
                } else {
                    sdp0Var2 = sdp0Var3;
                    w0h1.a(huxVarJ, isl.a, eqr0.D(0.0f, fFloatValue, 1, qim0Var2), sdp0Var2.d, 0L, false, x340Var, 56, 48);
                    x340Var.r(false);
                    x340Var.r(true);
                }
                h311VarV.d = cubVar;
            }
            sdp0Var2 = sdp0Var3;
            x340Var.b0();
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                cubVar = new cub(sdp0Var2, f2, z, z2, function0, qim0Var, i2, (byte) 1);
                h311VarV.d = cubVar;
            }
        }

        public static final void h(float f2, long j, long j2, float f3, b0k b0kVar, int i2) {
            m4c m4cVar = fkj0.X;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(-920561826);
            int i3 = i2 | (x340Var.d(f2) ? 4 : 2) | (x340Var.f(j) ? 32 : 16) | (x340Var.f(j2) ? 256 : 128) | (x340Var.d(f3) ? 2048 : 1024);
            if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
                float f4 = (0.7f * f3) + 0.3f;
                qim0 qim0VarH = u291.h(uyn1.z(24.0f, 0.0f, 2, u291.f(nim0.a, 1.0f)), 4.0f * f3);
                boolean zD = x340Var.d(f4);
                Object objT = x340Var.T();
                if (zD || objT == m4cVar) {
                    objT = new jc5((byte) 9, f4);
                    x340Var.s0(objT);
                }
                qim0 qim0VarC = i541.C(qim0VarH, (iu30) objT);
                boolean z = ((i3 & 14) == 4) | ((i3 & 896) == 256) | ((i3 & 112) == 32);
                Object objT2 = x340Var.T();
                if (z || objT2 == m4cVar) {
                    dub dubVar = new dub(f2, j2, j);
                    x340Var.s0(dubVar);
                    objT2 = dubVar;
                }
                j0o1.b(0, x340Var, (iu30) objT2, qim0VarC);
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new eub(f2, j, j2, f3, i2);
            }
        }

        public static final Object i(ven0 ven0Var, dw8 dw8Var) {
            Object objJ;
            return (((Boolean) ven0Var.getValue()).booleanValue() && (objJ = b5p1.j(rwq.q(new bp9(ven0Var, (byte) 6)), new nw5(2, (lnm) null, (byte) 4), dw8Var)) == d9n.a) ? objJ : rih1.a;
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public static final hux j(String str) {
            switch (str.hashCode()) {
                case -1776226330:
                    if (str.equals("arrow-down")) {
                        return hkx.c;
                    }
                    break;
                case -1280058657:
                    if (str.equals("arrow-up")) {
                        return mkx.c;
                    }
                    break;
                case 111155841:
                    if (str.equals("share-android")) {
                        return fsx.c;
                    }
                    break;
                case 1301671304:
                    if (str.equals("information-alt")) {
                        return eox.c;
                    }
                    break;
                case 1657765257:
                    if (str.equals("list-numerical")) {
                        return kox.c;
                    }
                    break;
            }
            Logger.d("BottomBar: Unknown icon name: ".concat(str), new Object[0]);
            return null;
        }

        public static final float k(boolean z, int i2, Integer num, boolean z2, dlv dlvVar, b0k b0kVar, int i3, int i4) {
            m4c m4cVar = fkj0.X;
            if ((i4 & 16) != 0) {
                dlvVar = a;
            }
            dlv dlvVar2 = dlvVar;
            x340 x340Var = (x340) b0kVar;
            boolean zG = x340Var.g(num);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                objT = c97.b(0.0f);
                x340Var.s0(objT);
            }
            o95 o95Var = (o95) objT;
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zI = ((((i3 & 14) ^ 6) > 4 && x340Var.h(z)) || (i3 & 6) == 4) | ((((i3 & 7168) ^ 3072) > 2048 && x340Var.h(z2)) || (i3 & 3072) == 2048) | x340Var.i(o95Var) | ((((i3 & 112) ^ 48) > 32 && x340Var.e(i2)) || (i3 & 48) == 32) | x340Var.i(dlvVar2);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                fub fubVar = new fub(z, z2, o95Var, i2, dlvVar2, null);
                x340Var.s0(fubVar);
                objT2 = fubVar;
            }
            qxd0.s(boolValueOf, num, (vu30) objT2, x340Var);
            return ((Number) o95Var.e()).floatValue();
        }
    }
