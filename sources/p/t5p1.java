package p;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.style.TextDecoration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class t5p1 {
    public static b180 a;
    public static b180 b;

    public static final void a(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        Function0 function1;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-461771184);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            String strO0 = cwl1.o0(x340Var, 2131957384);
            qim0 qim0Var2 = nim0.a;
            function1 = function0;
            lgo1.c(g4i.a, function1, strO0, qim0Var2, 2, null, x340Var, ((i2 << 3) & 112) | 27654, 32);
            qim0Var = qim0Var2;
        } else {
            function1 = function0;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vd1(function1, qim0Var, i, (byte) 0);
        }
    }

    public static final void b(qim0 qim0Var, p3v p3vVar, float f, boolean z, b0k b0kVar, int i) {
        qim0 qim0Var2;
        float f2;
        float f3;
        qim0 qim0Var3;
        qim0 qim0VarE;
        qim0 qim0VarR;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-471507228);
        int i2 = i | 48 | (x340Var.g(p3vVar) ? 256 : 128) | 1024;
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            x340Var.d0();
            int i3 = i & 1;
            qim0 qim0Var4 = nim0.a;
            if (i3 == 0 || x340Var.E()) {
                uwr uwrVar = cbx.a;
                zov0 zov0Var = cbx.b(x340Var).g;
                f3 = 16.0f;
                qim0Var3 = qim0Var4;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var;
                f3 = f;
            }
            x340Var.s();
            if (z) {
                x340Var.i0(-2128550861);
                uwr uwrVar2 = cbx.a;
                qim0VarE = d1u.E(2.0f, cbx.a(x340Var).a.a.a(), qim0Var4, er31.a);
                x340Var.r(false);
            } else {
                x340Var.i0(-2128441400);
                x340Var.r(false);
                qim0VarE = qim0Var4;
            }
            if (p3vVar == null || (qim0VarR = u291.r(qim0Var4, p3vVar.a)) == null) {
                qim0VarR = qim0Var4;
            }
            qim0 qim0VarThen = qim0Var3.then(qim0VarR).then(qim0VarE);
            uwr uwrVar3 = cbx.a;
            qim0 qim0VarF = dug.f(qim0VarThen, cbx.a(x340Var).a.a.c(), er31.a);
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarX = uyn1.x(qim0VarF, 6.0f);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarX);
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
            w0h1.a(hrx.c, isl.a, u291.r(qim0Var4, f3), cbx.a(x340Var).b.a, 0L, false, x340Var, hrx.d | 48, 48);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
            f2 = f3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
            f2 = f;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new l3a(qim0Var2, p3vVar, f2, z, i, (byte) 0);
        }
    }

    public static final void c(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1104459767);
        if (x340Var.Y(i & 1, i != 0)) {
            gt40 gt40VarK = ila0.k(dm5.I(et40.a), new tw21(2131100246));
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = u0e0.Z0;
                x340Var.s0(objT);
            }
            j2h1.b(iko1.x(gt40VarK, (iu30) objT), ql3.g, vwi.a, x340Var, 384, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ry90(i, (byte) 7);
        }
    }

    public static final void d(ArrayList arrayList, iu30 iu30Var, vnr vnrVar, qim0 qim0Var, String str, String str2, j2i j2iVar, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        qim0 qim0Var2;
        String str3;
        String str4;
        String str5;
        String str6;
        qim0 qim0Var3;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1725336481);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? b0kVar3.g(arrayList) : b0kVar3.i(arrayList) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? b0kVar3.g(vnrVar) : b0kVar3.i(vnrVar) ? 256 : 128;
        }
        int i3 = i2 | 14380032;
        if ((100663296 & i) == 0) {
            i3 |= b0kVar3.d(8.0f) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= b0kVar3.i(j2iVar) ? 536870912 : 268435456;
        }
        if (b0kVar3.Y(i3 & 1, (306783379 & i3) != 306783378)) {
            b0kVar3.d0();
            int i4 = i & 1;
            qim0 qim0Var4 = nim0.a;
            if (i4 == 0 || b0kVar3.E()) {
                str5 = "";
                str6 = str5;
                qim0Var3 = qim0Var4;
            } else {
                b0kVar3.b0();
                qim0Var3 = qim0Var;
                str5 = str;
                str6 = str2;
            }
            b0kVar3.s();
            ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(iu30Var.invoke(it.next()));
            }
            b0kVar3.i0(1626008060);
            b0kVar3.r(false);
            v8r.s(arrayList2, b0kVar3);
            v8r.s((Object) null, b0kVar3);
            b0kVar3.i0(1996065225);
            b0kVar3.r(false);
            b0kVar3.i0(191007561);
            b0kVar3.r(false);
            b0kVar2 = b0kVar3;
            w2g0.c(u291.f(qim0Var3, 1.0f).then(qim0Var4), (tl3) null, apo.r(1429790347, new kj21(vnrVar, arrayList, (k5p1) null, iu30Var, j2iVar, arrayList2, str5, str6, (cb80) null), b0kVar3), b0kVar2, 3072, 6);
            str3 = str5;
            str4 = str6;
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
            str3 = str;
            str4 = str2;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new kt3(arrayList, iu30Var, vnrVar, qim0Var2, str3, str4, j2iVar, i);
        }
    }

    public static final void e(int i, String str, b0k b0kVar, qim0 qim0Var) {
        String str2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(952564452);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).a.c;
            cua cuaVar = cbx.b(x340Var).f;
            cr31 cr31VarB = er31.b(4.0f);
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarF = dug.f(qim0Var2, j, cr31VarB);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
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
            nko1.H(qim0VarE, x340Var, y580.Y);
            qim0 qim0VarD = u291.d(qim0Var2, 1.0f);
            cua cuaVar2 = cbx.b(x340Var).f;
            str2 = str;
            pdp1.b(str2, i1p1.q(qim0VarD, er31.b(4.0f)), null, x340Var, (i2 & 14) | 48, 2040);
            x340Var.r(true);
            qim0Var = qim0Var2;
        } else {
            str2 = str;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rj(str2, qim0Var, i, (byte) 9);
        }
    }

    public static final void f(y0k1 y0k1Var, boolean z, Function0 function0, Function0 function1, Function0 function2, Function0 function3, qim0 qim0Var, boolean z2, b0k b0kVar, int i) {
        qim0 qim0Var2;
        boolean z3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1882685715);
        int i2 = i | (x340Var.g(y0k1Var) ? 4 : 2) | (x340Var.h(z) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128) | (x340Var.i(function1) ? 2048 : 1024) | (x340Var.i(function2) ? 16384 : 8192) | (x340Var.i(function3) ? 131072 : 65536) | 14155776;
        if (x340Var.Y(i2 & 1, (4793491 & i2) != 4793490)) {
            WeakHashMap weakHashMap = osl1.x;
            bgc0 bgc0Var = new bgc0(lhc.g(x340Var).g, 32);
            j2i j2iVarR = apo.r(1219591232, new h621(function3, (byte) 25), x340Var);
            j2i j2iVarR2 = apo.r(997639482, new hh1(z, y0k1Var, function0, function1, function2, (byte) 17), x340Var);
            qim0Var2 = nim0.a;
            irn1.u(qim0Var2, j2iVarR, null, bgc0Var, j2iVarR2, x340Var, 24630, 4);
            z3 = true;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
            z3 = z2;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new m8m(y0k1Var, z, function0, function1, function2, function3, qim0Var2, z3, i);
        }
    }

    public static final cb80 g(db80 db80Var, float f, float f2, bb80 bb80Var, String str, b0k b0kVar, int i, int i2) {
        if ((i2 & 8) != 0) {
            str = "FloatAnimation";
        }
        Float fValueOf = Float.valueOf(f);
        Float fValueOf2 = Float.valueOf(f2);
        int i3 = i << 3;
        return h(db80Var, fValueOf, fValueOf2, rno1.a, bb80Var, str, b0kVar, (i & 1022) | (57344 & i3) | (i3 & 458752), 0);
    }

    public static final cb80 h(db80 db80Var, Number number, Number number2, tzg1 tzg1Var, bb80 bb80Var, String str, b0k b0kVar, int i, int i2) {
        db80 db80Var2;
        Number number3;
        x340 x340Var = (x340) b0kVar;
        Object objT = x340Var.T();
        m4c m4cVar = fkj0.X;
        if (objT == m4cVar) {
            db80Var2 = db80Var;
            cb80 cb80Var = new cb80(db80Var2, number, number2, tzg1Var, bb80Var);
            number3 = number2;
            x340Var.s0(cb80Var);
            objT = cb80Var;
        } else {
            db80Var2 = db80Var;
            number3 = number2;
        }
        cb80 cb80Var2 = (cb80) objT;
        boolean z = ((((i & 112) ^ 48) > 32 && x340Var.i(number)) || (i & 48) == 32) | ((((i & 896) ^ 384) > 256 && x340Var.i(number3)) || (i & 384) == 256) | ((((57344 & i) ^ 24576) > 16384 && x340Var.i(bb80Var)) || (i & 24576) == 16384);
        Object objT2 = x340Var.T();
        if (z || objT2 == m4cVar) {
            qd4 qd4Var = new qd4(number, cb80Var2, number3, bb80Var, (byte) 3);
            x340Var.s0(qd4Var);
            objT2 = qd4Var;
        }
        qxd0.S((Function0) objT2, x340Var);
        boolean zI = x340Var.i(db80Var2);
        Object objT3 = x340Var.T();
        if (zI || objT3 == m4cVar) {
            objT3 = new b6(db80Var2, cb80Var2, (byte) 26);
            x340Var.s0(objT3);
        }
        qxd0.i(cb80Var2, (iu30) objT3, x340Var);
        return cb80Var2;
    }

    public static final mr20 i(ymd0 ymd0Var) {
        return o4p1.k(h4p1.f(new p1r(ymd0Var, (lnm) null, (byte) 22)), -1, 2);
    }

    public static y8n j(mr20 mr20Var, int i) {
        y8n y8nVarS = qmo1.s(o6x.a, (i & 2) != 0 ? 5000L : 0L, new k53(mr20Var, (lnm) null, (byte) 11));
        if (mr20Var instanceof zob1) {
            if (q26.e().a.c()) {
                y8nVarS.m(((zob1) mr20Var).getValue());
                return y8nVarS;
            }
            y8nVarS.j(((zob1) mr20Var).getValue());
        }
        return y8nVarS;
    }

    public static final float k(e9r e9rVar, float f, float f2) {
        br20 br20Var = e9rVar.a;
        ke5 ke5Var = new ke5(0.0f);
        int i = 0;
        while (i < 1) {
            ke5Var.e(br20Var.p(i == 0 ? f : 0.0f, i == 0 ? f2 : 0.0f), i);
            i++;
        }
        return ke5Var.a;
    }

    public static final int l(int i) {
        if (uah.e(-1, i) >= 4.5d) {
            return i;
        }
        float[] fArr = new float[3];
        uah.h(i, fArr);
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = 0.0f;
        while (f3 - f4 > 0.01d) {
            float f5 = (f3 + f4) * 0.5f;
            if (uah.e(-1, uah.a(new float[]{f, f2, f5})) < 4.5d) {
                f3 = f5;
            } else {
                f4 = f5;
            }
        }
        return uah.a(new float[]{f, f2, f4});
    }

    public static e9r m(float f, int i) {
        float f2 = (i & 1) != 0 ? 1.0f : 1.5f;
        if ((i & 2) != 0) {
            f = 0.1f;
        }
        return new e9r(new bhv(f2, f, (byte) 1));
    }

    public static final e9r n(c681 c681Var) {
        return new e9r(c681Var);
    }

    public static dsk0 o(UUID uuid) {
        return new dsk0(uuid, (byte) 4);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x008f  */
    /* JADX WARN: Code duplicated, block: B:50:0x009a  */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:? A[SYNTHETIC] */
    public static void p(fid fidVar, y9e1 y9e1Var) throws Throwable {
        fid fidVar2;
        Throwable th;
        zrm0 zrm0Var = y9e1Var.b;
        boolean zD = y9e1Var.d();
        x9e1 x9e1Var = y9e1Var.a;
        boolean z = zD && x9e1Var.f != 3;
        if (z) {
            long j = y9e1Var.c;
            n511 n511VarG = anm1.g(0L, (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j >> 32))) << 32));
            fidVar.q();
            fid.a(fidVar, n511VarG);
        }
        zma1 zma1Var = x9e1Var.b.a;
        TextDecoration textDecoration = zma1Var.m;
        i8e1 i8e1Var = zma1Var.a;
        if (textDecoration == null) {
            textDecoration = TextDecoration.b;
        }
        TextDecoration textDecoration2 = textDecoration;
        Shadow shadow = zma1Var.n;
        if (shadow == null) {
            shadow = Shadow.d;
        }
        Shadow shadow2 = shadow;
        z520 z520Var = zma1Var.p;
        if (z520Var == null) {
            z520Var = z520.a;
        }
        z520 z520Var2 = z520Var;
        try {
            Brush brushC = i8e1Var.c();
            i8e1 i8e1Var2 = i8e1.a;
            try {
                if (brushC == null) {
                    long jA = i8e1Var != i8e1Var2 ? i8e1Var.a() : u7h.b;
                    fidVar2 = fidVar;
                    try {
                        zrm0Var.j(fidVar2, jA, shadow2, textDecoration2, z520Var2);
                        if (z) {
                            fidVar2.i();
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        th = th;
                        if (!z) {
                            throw th;
                        }
                        fidVar2.i();
                        throw th;
                    }
                }
                float fB = i8e1Var != i8e1Var2 ? i8e1Var.b() : 1.0f;
                fidVar2 = fidVar;
                try {
                    obg1.p(zrm0Var, fidVar2, brushC, fB, shadow2, textDecoration2, z520Var2);
                    fidVar2 = fidVar2;
                    if (z) {
                        fidVar2.i();
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    if (!z) {
                        throw th;
                    }
                    fidVar2.i();
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                fidVar2 = fidVar;
            }
        } catch (Throwable th5) {
            th = th5;
            fidVar2 = fidVar;
        }
        if (!z) {
            throw th;
        }
        fidVar2.i();
        throw th;
    }

    public static final String q(String str) {
        Set set = s4b1.f;
        s4b1 s4b1VarX = uic.x(str);
        v5b1 v5b1Var = s4b1VarX.d;
        n57.k(u890.j(v5b1Var != null ? v5b1Var.getType() : null, nyu0.e), "Expected playlist URI but got: %s", new Object[]{str});
        return "spotify:playlist-history:".concat(s4b1VarX.h());
    }

    public static final db80 r(String str, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        Object objT = x340Var.T();
        if (objT == fkj0.X) {
            objT = new db80();
            x340Var.s0(objT);
        }
        db80 db80Var = (db80) objT;
        db80Var.a(x340Var, 0);
        return db80Var;
    }

    public static final oy11 s(iu30 iu30Var, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        Object objT = x340Var.T();
        Object obj = fkj0.X;
        if (objT == obj) {
            objT = v8r.q(Boolean.FALSE);
            x340Var.s0(objT);
        }
        ven0 ven0Var = (ven0) objT;
        Object objT2 = x340Var.T();
        if (objT2 == obj) {
            objT2 = new oy11(iu30Var, ven0Var);
            x340Var.s0(objT2);
        }
        return (oy11) objT2;
    }
}
