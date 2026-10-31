package p;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import android.os.Parcelable;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import io.reactivex.rxjava3.core.ObservableSource;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class bs51 {
    public static b180 a;

    public static final void a(int i, String str, String str2, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0VarB;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1287554645);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.i(qim0Var) ? 32 : 16) | (x340Var.g(str2) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            fra fraVar = een.N0;
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarF2 = dug.f(qim0VarF, cbx.a(x340Var).a.c, d4o1.a);
            qim0 qim0Var2 = nim0.a;
            if (str2 != null) {
                x340Var.i0(389442265);
                boolean z = (i2 & 896) == 256;
                Object objT = x340Var.T();
                if (z || objT == fkj0.X) {
                    objT = new i3o(str2, (byte) 23);
                    x340Var.s0(objT);
                }
                qim0VarB = s161.b(qim0Var2, false, (iu30) objT);
                x340Var.r(false);
            } else {
                x340Var.i0(389443581);
                x340Var.r(false);
                qim0VarB = qim0Var2;
            }
            qim0 qim0VarThen = qim0VarF2.then(qim0VarB);
            jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarThen);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            w0h1.a(nox.c, isl.a, u291.r(qim0Var2, 10.0f), cbx.a(x340Var).b.a, 0L, false, x340Var, nox.d | 48, 48);
            cvx cvxVar = cbx.b(x340Var).b;
            op71.g(x340Var, u291.v(qim0Var2, 12.0f));
            cvx cvxVar2 = cbx.b(x340Var).b;
            uwo1.e(str, uyn1.z(0.0f, 8.0f, 1, qim0Var2), cbx.d(x340Var).h, cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, i2 & 14, 0, 2032);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new c4(str, qim0Var, str2, i, (byte) 14);
        }
    }

    public static final void b(int i, String str, String str2, String str3, Function0 function0, b0k b0kVar) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1352015778);
        int i2 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.g(str2) ? 32 : 16) | (b0kVar3.g(str3) ? 256 : 128) | (b0kVar3.i(function0) ? 2048 : 1024);
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            xu30 xu30VarR = null;
            uvx uvxVarB = uvx.b((uvx) b0kVar3.k(vvx.a), 0, (tvx) null, (p3v) null, 30);
            if (str2 == null) {
                b0kVar3.i0(302533436);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(302533437);
                xu30VarR = apo.r(206031436, new iww0(str2, (byte) 10), b0kVar3);
                b0kVar3.r(false);
            }
            xu30 xu30Var = xu30VarR;
            boolean z = (i2 & 7168) == 2048;
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                objT = new us21(function0, (byte) 15);
                b0kVar3.s0(objT);
            }
            Function0 function1 = (Function0) objT;
            if (ihc1.y0(str)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            } else {
                b0kVar2 = b0kVar3;
                jto1.b(qim0VarF, uvxVarB, (max) null, false, (idn0) null, (ga80) null, new gbx(new y50(str), function1), (gbx) null, (xu30) null, apo.r(292934727, new iww0(str3, (byte) 11), b0kVar3), (xu30) null, xu30Var, (xu30) null, (xu30) null, (xu30) null, apo.r(-267780190, new iww0(str, (byte) 12), b0kVar3), b0kVar2, 805306432, 196608, 30140);
            }
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new pby0(i, str, str2, str3, function0, (byte) 21);
        }
    }

    public static final void c(flb0 flb0Var, c380 c380Var, c380 c380Var2, int i, ggv ggvVar, iu30 iu30Var, qim0 qim0Var, fde1 fde1Var, List list, String str, long j, boolean z, b0k b0kVar, int i2) {
        b0k b0kVar2;
        fgv fgvVar;
        ven0 ven0Var;
        int i3;
        tob1 tob1Var;
        xtb0 xtb0Var;
        Object rzuVar;
        tob1 tob1Var2;
        int i4;
        float f;
        int i5;
        int i6;
        float f2;
        dw91 dw91Var;
        tob1 tob1Var3;
        dw91 dw91Var2;
        boolean z2;
        Object obj;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1595163625);
        int i7 = i2 | (b0kVar3.e(flb0Var.ordinal()) ? 4 : 2) | (b0kVar3.g(c380Var) ? 32 : 16) | (b0kVar3.g(c380Var2) ? 256 : 128) | (b0kVar3.e(i) ? 2048 : 1024) | (b0kVar3.i(ggvVar) ? 16384 : 8192) | (b0kVar3.i(iu30Var) ? 131072 : 65536) | (b0kVar3.i(qim0Var) ? 1048576 : 524288) | (b0kVar3.e(fde1Var == null ? -1 : fde1Var.ordinal()) ? 8388608 : 4194304) | (b0kVar3.g(list) ? 67108864 : 33554432) | (b0kVar3.g(str) ? 536870912 : 268435456);
        if (b0kVar3.Y(i7 & 1, ((i7 & 306783379) == 306783378 && (((b0kVar3.f(j) ? (char) 4 : (char) 2) | (b0kVar3.h(z) ? ' ' : (char) 16)) & 19) == 18) ? false : true)) {
            boolean z3 = (i7 & 896) == 256;
            Object objT = b0kVar3.T();
            Object obj2 = objT;
            if (z3 || objT == m4cVar) {
                Set setP1 = o7h.p1(c380Var2);
                b0kVar3.s0(setP1);
                obj2 = setP1;
            }
            Set set = (Set) obj2;
            Integer num = (Integer) o7h.s0(c380Var2);
            int iIntValue = num != null ? num.intValue() : 0;
            Integer num2 = (Integer) o7h.C0(c380Var2);
            int iIntValue2 = num2 != null ? num2.intValue() : 0;
            uwr uwrVar = cbx.a;
            float f3 = cbx.b(b0kVar3).b.a;
            wat watVar = (wat) b0kVar3.k(t4k.h);
            float fX0 = watVar.X0(f3);
            ss50 ss50Var = (ss50) b0kVar3.k(t4k.l);
            b0kVar3.i0(-351051418);
            mta mtaVar = cbx.b(b0kVar3).d;
            float fX1 = watVar.X0(48.0f);
            b0kVar3.r(false);
            float fX2 = watVar.X0(60.0f);
            float fX3 = watVar.X0(8.0f);
            float fX4 = watVar.X0(16.0f);
            b0kVar3.i0(-351041373);
            cvx cvxVar = cbx.b(b0kVar3).b;
            mta mtaVar2 = cbx.b(b0kVar3).d;
            mta mtaVar3 = cbx.b(b0kVar3).d;
            float fX5 = watVar.X0(-4.0f);
            b0kVar3.r(false);
            Object objT2 = b0kVar3.T();
            Object obj3 = objT2;
            if (objT2 == m4cVar) {
                hrr0 hrr0VarQ = v8r.q(new h7v(false, false, 0.0f, 0.0f, 0.0f, 0.0f, null, null, -1, -1, 0.0f, null, 0, 0.0f, false, false));
                b0kVar3.s0(hrr0VarQ);
                obj3 = hrr0VarQ;
            }
            tob1 tob1Var4 = (ven0) obj3;
            Object objT3 = b0kVar3.T();
            Object obj4 = objT3;
            if (objT3 == m4cVar) {
                hrr0 hrr0VarQ2 = v8r.q(Float.valueOf(0.0f));
                b0kVar3.s0(hrr0VarQ2);
                obj4 = hrr0VarQ2;
            }
            ven0 ven0Var2 = (ven0) obj4;
            Object objT4 = b0kVar3.T();
            Object obj5 = objT4;
            if (objT4 == m4cVar) {
                dw91 dw91Var3 = new dw91();
                b0kVar3.s0(dw91Var3);
                obj5 = dw91Var3;
            }
            dw91 dw91Var4 = (dw91) obj5;
            Object objT5 = b0kVar3.T();
            Object obj6 = objT5;
            if (objT5 == m4cVar) {
                dw91 dw91Var5 = new dw91();
                b0kVar3.s0(dw91Var5);
                obj6 = dw91Var5;
            }
            dw91 dw91Var6 = (dw91) obj6;
            xtb0 xtb0VarA = aub0.a(0, b0kVar3, 3);
            tob1 tob1VarS = v8r.s(iu30Var, b0kVar3);
            Object objT6 = b0kVar3.T();
            Object obj7 = objT6;
            if (objT6 == m4cVar) {
                hrr0 hrr0VarQ3 = v8r.q((Object) null);
                b0kVar3.s0(hrr0VarQ3);
                obj7 = hrr0VarQ3;
            }
            ven0 ven0Var3 = (ven0) obj7;
            Object objT7 = b0kVar3.T();
            Object obj8 = objT7;
            if (objT7 == m4cVar) {
                hrr0 hrr0VarQ4 = v8r.q("");
                b0kVar3.s0(hrr0VarQ4);
                obj8 = hrr0VarQ4;
            }
            ven0 ven0Var4 = (ven0) obj8;
            Object objT8 = b0kVar3.T();
            err0 err0Var = (hdn0) (objT8 == m4cVar ? bb00.h(0, b0kVar3) : objT8);
            fgv fgvVar2 = new fgv(3, 2);
            Object objT9 = b0kVar3.T();
            Object obj9 = objT9;
            if (objT9 == m4cVar) {
                hrr0 hrr0VarQ5 = v8r.q((Object) null);
                b0kVar3.s0(hrr0VarQ5);
                obj9 = hrr0VarQ5;
            }
            ven0 ven0Var5 = (ven0) obj9;
            boolean z4 = ven0Var5.getValue() == null;
            float f4 = fX3;
            if (c380Var2.equals(ven0Var5.getValue())) {
                fgvVar = fgvVar2;
                ven0Var = ven0Var3;
                i3 = iIntValue;
                tob1Var = tob1VarS;
            } else {
                ven0Var5.setValue(c380Var2);
                fde1 fde1Var2 = (fde1) ven0Var3.getValue();
                fde1 fde1Var3 = fde1Var2 == null ? fde1Var : fde1Var2;
                fgvVar = fgvVar2;
                ven0Var = ven0Var3;
                int i8 = iIntValue;
                int i9 = iIntValue2;
                tob1Var = tob1VarS;
                i3 = i8;
                iIntValue2 = i9;
                d(tob1Var4, ss50Var, xtb0VarA, tob1Var, new o00(i8, i9, fde1Var3, z4, c380Var, j));
                ven0Var.setValue((Object) null);
            }
            boolean zI = b0kVar3.i(ven0Var2) | b0kVar3.i(tob1Var4) | b0kVar3.i(ss50Var) | b0kVar3.i(tob1Var) | b0kVar3.i(xtb0VarA);
            Object objT10 = b0kVar3.T();
            if (zI || objT10 == m4cVar) {
                objT10 = new uh0(ven0Var2, tob1Var4, ss50Var, xtb0VarA, tob1Var);
                xtb0Var = xtb0VarA;
                b0kVar3.s0(objT10);
            } else {
                xtb0Var = xtb0VarA;
            }
            qim0 qim0VarX = ern1.x(qim0Var, (iu30) objT10);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarX);
            hzj.A.getClass();
            if (((x340) b0kVar3).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(hmb0.t1);
            } else {
                b0kVar3.v0();
            }
            nko1.H(gfh0VarC, b0kVar3, y580.O0);
            nko1.H(xos0VarM, b0kVar3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
            nko1.F(b0kVar3);
            nko1.H(qim0VarE, b0kVar3, y580.Y);
            Integer numValueOf = Integer.valueOf(((h7v) tob1Var4.getValue()).m);
            boolean zI2 = b0kVar3.i(tob1Var4) | ((i7 & 112) == 32) | ((i7 & 234881024) == 67108864) | b0kVar3.i(xtb0Var);
            Object objT11 = b0kVar3.T();
            if (zI2 || objT11 == m4cVar) {
                tob1Var2 = tob1Var4;
                i4 = i3;
                rzuVar = new rzu(c380Var, list, xtb0Var, tob1Var2, (lnm) null, (byte) 2);
                b0kVar3.s0(rzuVar);
            } else {
                tob1Var2 = tob1Var4;
                i4 = i3;
                rzuVar = objT11;
            }
            qxd0.t(numValueOf, b0kVar3, (vu30) rzuVar);
            Boolean boolValueOf = Boolean.valueOf(((h7v) tob1Var2.getValue()).b());
            boolean zI3 = b0kVar3.i(tob1Var2) | b0kVar3.i(ss50Var) | b0kVar3.i(tob1Var) | b0kVar3.i(xtb0Var) | b0kVar3.e(i4) | b0kVar3.e(iIntValue2) | b0kVar3.i(dw91Var4) | b0kVar3.i(dw91Var6) | b0kVar3.d(fX0) | b0kVar3.d(fX2) | b0kVar3.d(f4) | b0kVar3.d(fX4);
            Object objT12 = b0kVar3.T();
            if (zI3 || objT12 == m4cVar) {
                f = fX2;
                i5 = i4;
                i6 = iIntValue2;
                f2 = fX0;
                dw91Var = dw91Var4;
                tob1 tob1Var5 = tob1Var2;
                objT12 = new s6v(i5, i6, tob1Var5, dw91Var, dw91Var6, f2, f, f4, fX4, ss50Var, xtb0Var, tob1Var, null);
                tob1Var3 = tob1Var5;
                dw91Var2 = dw91Var6;
                f4 = f4;
                b0kVar3.s0(objT12);
            } else {
                f = fX2;
                i5 = i4;
                i6 = iIntValue2;
                f2 = fX0;
                dw91Var = dw91Var4;
                dw91Var2 = dw91Var6;
                tob1Var3 = tob1Var2;
            }
            qxd0.t(boolValueOf, b0kVar3, (vu30) objT12);
            ely0[] ely0VarArr = {t4k.n.a(flb0Var), jxq0.a.a((Object) null)};
            c7v c7vVar = new c7v(list, f3, xtb0Var, dw91Var, dw91Var2, c380Var, z, set, tob1Var3, i, i5, i6, ven0Var, ss50Var, tob1Var, ggvVar, fgvVar, ven0Var4, err0Var, j, ven0Var2, iu30Var, str, c380Var2, fX1, fX5, f2, f, f4, fX4);
            b0kVar2 = b0kVar3;
            mod.c(ely0VarArr, apo.r(-892105553, c7vVar, b0kVar2), b0kVar2, 56);
            int length = ((String) ven0Var4.getValue()).length();
            nim0 nim0Var = nim0.a;
            if (length > 0) {
                b0kVar2.i0(854728690);
                b0kVar2.f0(-1219353854, Integer.valueOf(err0Var.s()));
                qim0 qim0VarK = d9y0.k(u291.r(nim0Var, 1.0f), 0.0f);
                boolean zI4 = b0kVar2.i(ven0Var4);
                Object objT13 = b0kVar2.T();
                if (zI4 || objT13 == m4cVar) {
                    z2 = false;
                    d7v d7vVar = new d7v(ven0Var4, (byte) 0);
                    b0kVar2.s0(d7vVar);
                    obj = d7vVar;
                } else {
                    z2 = false;
                    obj = objT13;
                }
                t1c.a(s161.b(qim0VarK, z2, (iu30) obj), b0kVar2, z2 ? 1 : 0);
                b0kVar2.r(z2);
                b0kVar2.r(z2);
            } else {
                z2 = false;
                b0kVar2.i0(854975667);
                b0kVar2.r(false);
            }
            qim0 qim0VarH = u291.h(u291.f(nim0Var, 1.0f), f3);
            if (list.isEmpty()) {
                b0kVar2.i0(855081656);
                cxm.a(okb.b, qim0VarH, b0kVar2, 6);
                b0kVar2.r(z2);
            } else {
                b0kVar2.i0(855169107);
                b0kVar2.r(z2);
            }
            cxm.a(okb.c, h2c.a.a(qim0VarH, een.X), b0kVar2, 6);
            b0kVar2.r(true);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new e7v(i, i2, j, str, list, ggvVar, iu30Var, c380Var, c380Var2, flb0Var, qim0Var, fde1Var, z);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x011f  */
    public static final g811 d(ven0 ven0Var, ss50 ss50Var, xtb0 xtb0Var, tob1 tob1Var, m10 m10Var) {
        maw mawVar;
        naw nawVar;
        g811 g811Var;
        fde1 fde1Var;
        Integer num;
        float f;
        q5v q5vVar;
        h7v h7vVarA;
        float fE;
        fde1 fde1Var2;
        int i;
        g811 g811Var2;
        Integer num2;
        boolean z;
        Integer num3;
        fde1 fde1Var3;
        h7v h7vVarA2;
        naw nawVar2;
        maw mawVar2;
        h7v h7vVar = (h7v) ven0Var.getValue();
        float f2 = h7vVar.d;
        float f3 = h7vVar.c;
        int i2 = h7vVar.m;
        boolean z2 = h7vVar.a;
        Integer num4 = h7vVar.h;
        Integer num5 = h7vVar.g;
        boolean z3 = m10Var instanceof p00;
        maw mawVar3 = maw.a;
        naw nawVar3 = naw.a;
        zaw zawVar = zaw.a;
        if (z3) {
            float f4 = ((p00) m10Var).a;
            nawVar = nawVar3;
            mawVar = mawVar3;
            g811Var = new g811(h7v.a(h7vVar, true, false, f4, 0.0f, f4, 0.0f, null, null, -1, 0, 0.0f, null, 0, 0.0f, false, false, 65258), p7h.M(new jiw[]{zawVar, nawVar}));
        } else {
            mawVar = mawVar3;
            nawVar = nawVar3;
            if (m10Var instanceof hz) {
                float f5 = ((hz) m10Var).a;
                g811Var2 = new g811(h7v.a(h7vVar, false, true, 0.0f, f5, 0.0f, f5, null, null, 0, -1, 0.0f, null, 0, 0.0f, false, false, 64981), p7h.M(new jiw[]{zawVar, nawVar}));
            } else {
                boolean z4 = m10Var instanceof nz;
                List listSingletonList = z6x.a;
                fde1 fde1Var4 = fde1.b;
                fde1 fde1Var5 = fde1.a;
                if (z4) {
                    nz nzVar = (nz) m10Var;
                    if (h7vVar.b()) {
                        fde1 fde1Var6 = z2 ? fde1Var5 : fde1Var4;
                        if (!z2) {
                            f3 = f2;
                        }
                        float f6 = nzVar.a;
                        q5v q5vVar2 = nzVar.d;
                        float f7 = f6 + f3;
                        Integer numL = w361.l(f7, q5vVar2);
                        Integer num6 = fde1Var6 == fde1Var5 ? num5 : num4;
                        Float fK = w361.k(fde1Var6, num6, q5vVar2);
                        float fMax = fK == null ? f7 : fde1Var6 == fde1Var5 ? Math.max(f7, fK.floatValue()) : Math.min(f7, fK.floatValue());
                        float fD = c13.d(f7, fMax, 10.0f, fMax);
                        if (fK != null) {
                            float fFloatValue = fK.floatValue();
                            if (fde1Var6 != fde1Var5 ? f7 < fFloatValue : f7 > fFloatValue) {
                                z = false;
                            } else {
                                z = true;
                            }
                        } else {
                            z = false;
                        }
                        if (fde1Var6 == fde1Var5) {
                            fde1Var3 = fde1Var6;
                            num3 = num6;
                            h7vVarA2 = h7v.a(h7vVar, false, false, f7, 0.0f, fD, 0.0f, null, null, 0, 0, 0.0f, null, 0, 0.0f, false, z, 32747);
                        } else {
                            num3 = num6;
                            fde1Var3 = fde1Var6;
                            h7vVarA2 = h7v.a(h7vVar, false, false, 0.0f, f7, 0.0f, fD, null, null, 0, 0, 0.0f, null, 0, 0.0f, false, z, 32727);
                        }
                        if (z && !h7vVar.f26p) {
                            listSingletonList = Collections.singletonList(dgw.a);
                        }
                        g811Var = w361.x(h7vVarA2, fde1Var3, numL, num3, nzVar.b, nzVar.c, listSingletonList, 384);
                    } else {
                        g811Var = new g811(h7vVar);
                    }
                } else if (m10Var instanceof kz) {
                    h7v h7vVarA3 = h7v.a(h7vVar, false, false, 0.0f, 0.0f, 0.0f, 0.0f, null, null, -1, -1, 0.0f, null, 0, 0.0f, false, false, 31996);
                    if (h7vVar.b()) {
                        listSingletonList = Collections.singletonList(mawVar);
                    }
                    g811Var = new g811(h7vVarA3, listSingletonList);
                } else if (m10Var instanceof oz) {
                    oz ozVar = (oz) m10Var;
                    fde1 fde1Var7 = ozVar.a;
                    Integer numValueOf = Integer.valueOf(ozVar.b);
                    int iOrdinal = fde1Var7.ordinal();
                    if (iOrdinal == 0) {
                        num2 = num5;
                    } else {
                        if (iOrdinal != 1) {
                            eg.o();
                            return null;
                        }
                        num2 = num4;
                    }
                    g811Var = w361.x(h7vVar, fde1Var7, numValueOf, num2, ozVar.c, ozVar.d, listSingletonList, 128);
                } else if (m10Var instanceof n00) {
                    n00 n00Var = (n00) m10Var;
                    long j = n00Var.c;
                    if (j <= 0 || j >= Long.MAX_VALUE || n00Var.b <= j) {
                        g811Var2 = new g811(h7vVar, Collections.singletonList(new oaw(n00Var.a)));
                    } else {
                        g811Var = new g811(h7vVar);
                    }
                } else if (m10Var instanceof vy) {
                    g811Var = new g811(h7v.a(h7vVar, false, false, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 0, 0, ((vy) m10Var).a, null, 0, 0.0f, false, false, 64511));
                } else if (m10Var instanceof q00) {
                    float f8 = ((q00) m10Var).a;
                    g811Var = f8 == h7vVar.n ? new g811(h7vVar) : new g811(h7v.a(h7vVar, false, false, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 0, 0, 0.0f, null, 0, f8, false, false, 57343));
                } else if (m10Var instanceof o00) {
                    o00 o00Var = (o00) m10Var;
                    c380 c380Var = o00Var.e;
                    int i3 = o00Var.a;
                    h7v h7vVarA4 = h7v.a(h7vVar, false, false, 0.0f, 0.0f, 0.0f, 0.0f, w361.j(fde1Var5, c380Var, i3, o00Var.b, o00Var.f), w361.j(fde1Var4, c380Var, o00Var.a, o00Var.b, o00Var.f), 0, 0, 0.0f, null, 0, 0.0f, false, false, 65343);
                    if (h7vVar.b()) {
                        g811Var = new g811(h7vVarA4);
                    } else {
                        if (o00Var.d || (fde1Var2 = o00Var.c) == fde1Var5) {
                            i = i3;
                        } else if (fde1Var2 == fde1Var4) {
                            i = o00Var.b;
                        } else {
                            g811Var = new g811(h7vVarA4);
                        }
                        g811Var = new g811(h7v.a(h7vVarA4, false, false, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 0, 0, 0.0f, Integer.valueOf(i), i2 + 1, 0.0f, false, false, 43007));
                    }
                } else if (m10Var instanceof ry) {
                    ry ryVar = (ry) m10Var;
                    if (h7vVar.b()) {
                        fde1 fde1Var8 = z2 ? fde1Var5 : fde1Var4;
                        if (fde1Var8 == fde1Var5) {
                            num4 = num5;
                        }
                        float fMax2 = z2 ? f3 : f2;
                        q5v q5vVar3 = ryVar.c;
                        Float fK2 = w361.k(fde1Var8, num4, q5vVar3);
                        if (fK2 != null) {
                            fMax2 = fde1Var8 == fde1Var5 ? Math.max(fMax2, fK2.floatValue()) : Math.min(fMax2, fK2.floatValue());
                        }
                        if (!z2) {
                            f3 = f2;
                        }
                        float fD2 = c13.d(f3, fMax2, 10.0f, fMax2);
                        if (fde1Var8 == fde1Var5) {
                            fde1Var = fde1Var8;
                            num = num4;
                            q5vVar = q5vVar3;
                            f = fMax2;
                            h7vVarA = h7v.a(h7vVar, false, false, 0.0f, 0.0f, fD2, 0.0f, null, null, 0, 0, 0.0f, null, 0, 0.0f, false, false, 65519);
                        } else {
                            fde1Var = fde1Var8;
                            num = num4;
                            f = fMax2;
                            q5vVar = q5vVar3;
                            h7vVarA = h7v.a(h7vVar, false, false, 0.0f, 0.0f, 0.0f, fD2, null, null, 0, 0, 0.0f, null, 0, 0.0f, false, false, 65503);
                        }
                        h7v h7vVar2 = h7vVarA;
                        float f9 = q5vVar.f;
                        float f10 = q5vVar.e;
                        float f11 = q5vVar.d;
                        float f12 = 0.0f + f11;
                        if (f < f12) {
                            fE = -l1d.e(f9, f10, yoi1.o((f12 - f) / f11, 0.0f, 1.0f), f10);
                        } else {
                            float f13 = q5vVar.c - f11;
                            fE = f > f13 ? l1d.e(f9, f10, yoi1.o((f - f13) / f11, 0.0f, 1.0f), f10) : 0.0f;
                        }
                        g811Var = fE == 0.0f ? new g811(h7vVar2) : w361.x(h7vVar2, fde1Var, w361.l(f, q5vVar), num, ryVar.a, ryVar.b, Collections.singletonList(new yew(fE)), 256);
                    } else {
                        g811Var = new g811(h7vVar);
                    }
                } else {
                    if (!(m10Var instanceof uy)) {
                        eg.o();
                        return null;
                    }
                    g811Var = new g811(h7v.a(h7vVar, false, false, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 0, 0, 0.0f, Integer.valueOf(((uy) m10Var).a), i2 + 1, 0.0f, true, false, 43007));
                }
            }
            g811Var = g811Var2;
        }
        ven0Var.setValue(g811Var.a);
        for (jiw jiwVar : g811Var.b) {
            if (jiwVar instanceof zaw) {
                ((sct0) ss50Var).a(0);
            } else {
                if (jiwVar instanceof dgw) {
                    ((sct0) ss50Var).a(23);
                } else {
                    nawVar2 = nawVar;
                    if (u890.j(jiwVar, nawVar2)) {
                        ((iu30) tob1Var.getValue()).invoke(ide1.a);
                    } else if (jiwVar instanceof yew) {
                        xtb0Var.e(((yew) jiwVar).a);
                    } else if (jiwVar instanceof law) {
                        law lawVar = (law) jiwVar;
                        ((iu30) tob1Var.getValue()).invoke(new gde1(lawVar.a, lawVar.b));
                    } else {
                        mawVar2 = mawVar;
                        if (u890.j(jiwVar, mawVar2)) {
                            ((iu30) tob1Var.getValue()).invoke(hde1.a);
                        } else {
                            if (!(jiwVar instanceof oaw)) {
                                eg.o();
                                return null;
                            }
                            ((iu30) tob1Var.getValue()).invoke(new jde1(((oaw) jiwVar).a));
                        }
                    }
                    mawVar2 = mawVar;
                }
                mawVar = mawVar2;
                nawVar = nawVar2;
            }
            nawVar2 = nawVar;
            mawVar2 = mawVar;
            mawVar = mawVar2;
            nawVar = nawVar2;
        }
        return g811Var;
    }

    public static final q5v e(dw91 dw91Var, dw91 dw91Var2, float f, float f2, float f3, float f4, ven0 ven0Var) {
        return new q5v(dw91Var, dw91Var2, ((h7v) ven0Var.getValue()).k - f, f2, f3, f4);
    }

    public static final void f(Float f, float f2, float f3, gra graVar, String str, String str2, String str3, float f4, vfx0 vfx0Var, iu30 iu30Var, Function0 function0, iu30 iu30Var2, Function0 function1, h7v h7vVar, b0k b0kVar, int i) {
        String str4;
        x340 x340Var;
        String str5;
        float fFloatValue;
        boolean z;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(38782571);
        int i2 = i | (x340Var2.g(f) ? 32 : 16) | (x340Var2.d(f2) ? 256 : 128) | (x340Var2.d(f3) ? 2048 : 1024) | (x340Var2.i(graVar) ? 16384 : 8192) | (x340Var2.g(str2) ? 1048576 : 524288) | (x340Var2.g(str3) ? 8388608 : 4194304) | (x340Var2.d(f4) ? 67108864 : 33554432) | (x340Var2.g(vfx0Var) ? 536870912 : 268435456);
        if (x340Var2.Y(i2 & 1, ((i2 & 306783379) == 306783378 && ((((((x340Var2.i(iu30Var) ? (char) 4 : (char) 2) | (x340Var2.i(function0) ? ' ' : (char) 16)) | (x340Var2.i(iu30Var2) ? 256 : 128)) | (x340Var2.i(function1) ? (char) 2048 : (char) 1024)) | (x340Var2.g(h7vVar) ? (char) 16384 : (char) 8192)) & 9363) == 9362) ? false : true)) {
            x340Var2.d0();
            if ((i & 1) != 0 && !x340Var2.E()) {
                x340Var2.b0();
            }
            x340Var2.s();
            ven0 ven0VarS = v8r.s(function0, x340Var2);
            ven0 ven0VarS2 = v8r.s(iu30Var2, x340Var2);
            ven0 ven0VarS3 = v8r.s(function1, x340Var2);
            ven0 ven0VarS4 = v8r.s(iu30Var, x340Var2);
            ven0 ven0VarS5 = v8r.s(f, x340Var2);
            Object objT = x340Var2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.FALSE);
                x340Var2.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            float f5 = (-f2) * 2.0f;
            Float f6 = (Float) ven0VarS5.getValue();
            float fFloatValue2 = f6 != null ? f6.floatValue() : f5;
            n8b1 n8b1VarL0 = ((Boolean) ven0Var.getValue()).booleanValue() ? irn1.l0(0.0f, 400.0f, (Object) null, 5) : irn1.j0();
            boolean zI = x340Var2.i(ven0Var);
            Object objT2 = x340Var2.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new d7v(ven0Var, (byte) 3);
                x340Var2.s0(objT2);
            }
            tob1 tob1VarB = z95.b(fFloatValue2, n8b1VarL0, (String) null, (iu30) objT2, x340Var2, 0, 12);
            if (((Boolean) ven0Var.getValue()).booleanValue()) {
                fFloatValue = ((Number) tob1VarB.getValue()).floatValue();
            } else {
                Float f7 = (Float) ven0VarS5.getValue();
                fFloatValue = f7 != null ? f7.floatValue() : f5;
            }
            boolean z2 = fFloatValue < h7vVar.n;
            gra graVar2 = een.h;
            boolean z3 = z2;
            qim0 qim0VarA = h2c.a.a(nim0.a, graVar);
            uwr uwrVar = cbx.a;
            mta mtaVar = cbx.b(x340Var2).d;
            qim0 qim0VarK = d9y0.k(u291.r(qim0VarA, 48.0f), z3 ? 0.0f : 1.0f);
            boolean zD = ((i2 & 7168) == 2048) | x340Var2.d(fFloatValue) | ((i2 & 896) == 256);
            Object objT3 = x340Var2.T();
            if (zD || objT3 == m4cVar) {
                objT3 = new f7v(f3, fFloatValue, f2);
                x340Var2.s0(objT3);
            }
            qim0 qim0VarB = eqr0.B(qim0VarK, (iu30) objT3);
            boolean zI2 = ((3670016 & i2) == 1048576) | ((29360128 & i2) == 8388608) | ((1879048192 & i2) == 536870912) | ((234881024 & i2) == 67108864) | x340Var2.i(ven0VarS4);
            Object objT4 = x340Var2.T();
            if (zI2 || objT4 == m4cVar) {
                x340Var = x340Var2;
                z = false;
                bza bzaVar = new bza(str, str2, str3, vfx0Var, f4, ven0VarS4);
                str4 = str2;
                x340Var.s0(bzaVar);
                objT4 = bzaVar;
            } else {
                x340Var = x340Var2;
                z = false;
                str4 = str2;
            }
            qim0 qim0VarA2 = s161.a(qim0VarB, (iu30) objT4);
            boolean zI3 = x340Var.i((Object) 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0286: ARITH (r5v22 'zI3' boolean) = (wrap boolean:0x0281: ARITH (wrap boolean:0x027c: ARITH (wrap boolean:0x0274: INVOKE (r2v5 'x340Var' p.x340), (wrap java.lang.Object:?: CAST (java.lang.Object) (r26v0 ?? I:??[OBJECT, ARRAY])) VIRTUAL call: p.x340.i(java.lang.Object):boolean A[WRAPPED] (LINE:629)) | (wrap boolean:0x0278: INVOKE (r2v5 'x340Var' p.x340), (r10v16 'ven0Var' p.ven0) VIRTUAL call: p.x340.i(java.lang.Object):boolean A[WRAPPED] (LINE:633)) A[DONT_WRAP, WRAPPED] (LINE:637)) | (wrap boolean:0x027d: INVOKE (r2v5 'x340Var' p.x340), (r9v2 'ven0VarS3' p.ven0) VIRTUAL call: p.x340.i(java.lang.Object):boolean A[WRAPPED] (LINE:638)) A[DONT_WRAP, WRAPPED] (LINE:642)) | (wrap boolean:0x0282: INVOKE (r2v5 'x340Var' p.x340), (r8v4 'ven0VarS2' p.ven0) VIRTUAL call: p.x340.i(java.lang.Object):boolean A[WRAPPED] (LINE:643)) A[DECLARE_VAR] (LINE:647) in method: p.bs51.f(java.lang.Float, float, float, p.gra, java.lang.String, java.lang.String, java.lang.String, float, p.vfx0, p.iu30, kotlin.jvm.functions.Function0, p.iu30, kotlin.jvm.functions.Function0, p.h7v, p.b0k, int):void, file: /workspace/spotify-analysis/dex-input/classes9.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
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
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r26v0 ??
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 826
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p.bs51.f(java.lang.Float, float, float, p.gra, java.lang.String, java.lang.String, java.lang.String, float, p.vfx0, p.iu30, kotlin.jvm.functions.Function0, p.iu30, kotlin.jvm.functions.Function0, p.h7v, p.b0k, int):void");
        }

        public static final void g(b0k b0kVar, int i) {
            b0k b0kVar2;
            b0k b0kVar3 = (x340) b0kVar;
            b0kVar3.k0(975135388);
            if (b0kVar3.Y(i & 1, i != 0)) {
                uwr uwrVar = cbx.a;
                long jC = cbx.a(b0kVar3).a.a.c();
                cua cuaVar = cbx.b(b0kVar3).f;
                b0kVar2 = b0kVar3;
                jto1.b(anm1.N("shimmer_row", u291.f(nim0.a, 1.0f)), uvx.b((uvx) b0kVar3.k(vvx.a), 0, (tvx) null, (p3v) null, 30), (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, (xu30) null, apo.r(1472946387, new r7j(jC, er31.b(4.0f), (byte) 4), b0kVar3), (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, apo.r(-1856495656, new rvh((byte) 12, jC), b0kVar3), b0kVar2, 805306432, 196608, 32252);
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
            }
            h311 h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new fk01(i, (byte) 12);
            }
        }

        public static final cgl h(bgl bglVar) {
            int iOrdinal = bglVar.ordinal();
            if (iOrdinal != 2) {
                return iOrdinal != 3 ? cgl.b : cgl.c;
            }
            return cgl.a;
        }

        public static final ColorFilter i(int i, long j) {
            if (Build.VERSION.SDK_INT < 29) {
                return new PorterDuffColorFilter(z4p1.G(j), x74.w0(i));
            }
            i15.l();
            return i15.a(z4p1.G(j), x74.v0(i));
        }

        public static final ColorFilter j(androidx.compose.ui.graphics.ColorFilter colorFilter) {
            return colorFilter.a;
        }

        public static ezc k(ObservableSource observableSource) {
            return yoi1.g(observableSource);
        }

        public static ArrayList l(byte[] bArr) {
            long j = (((long) (((bArr[11] & 255) << 8) | (bArr[10] & 255))) * 1000000000) / 48000;
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(bArr);
            arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j).array());
            arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
            return arrayList;
        }

        public static final l3b0 m(int i) {
            l3b0 l3b0Var = new l3b0();
            l3b0Var.b = f4i1.c(i, "kotlin/Function");
            Enum r2 = ieg.c;
            yzu yzuVar = xm7.d;
            mma0[] mma0VarArr = xm7.a;
            mma0 mma0Var = mma0VarArr[9];
            yzuVar.J(l3b0Var, r2);
            Enum r3 = dfm0.d;
            yzu yzuVar2 = xm7.b;
            mma0 mma0Var2 = mma0VarArr[7];
            yzuVar2.J(l3b0Var, r3);
            Enum r4 = vjk1.d;
            yzu yzuVar3 = xm7.c;
            mma0 mma0Var3 = mma0VarArr[8];
            yzuVar3.J(l3b0Var, r4);
            ArrayList arrayList = l3b0Var.c;
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    arrayList.add(new a4b0(0, i2, 2, f4i1.c(i2, "P")));
                    if (i2 == i) {
                        break;
                    }
                    i2++;
                }
            }
            int i3 = i + 1;
            arrayList.add(new a4b0(0, i3, 3, "R"));
            y3b0 y3b0Var = new y3b0(0);
            y3b0Var.b = new m3b0("kotlin/Function");
            y3b0 y3b0Var2 = new y3b0(0);
            y3b0Var2.b = new o3b0(i3);
            y3b0Var.c.add(new b4b0(1, y3b0Var2));
            l3b0Var.d.add(y3b0Var);
            return l3b0Var;
        }

        public static int n(int[] iArr) {
            int i;
            if (iArr.length == 0) {
                hhg1.h("Empty array can't be reduced.");
                return 0;
            }
            int i2 = iArr[0];
            tr80 tr80Var = new tr80(1, iArr.length - 1, 1);
            int i3 = ((rr80) tr80Var).b;
            int i4 = ((rr80) tr80Var).c;
            boolean z = i4 <= 0 ? 1 >= i3 : 1 <= i3;
            int i5 = z ? 1 : i3;
            while (z) {
                if (i5 != i3) {
                    i = i5 + i4;
                } else {
                    if (!z) {
                        hhg1.k();
                        return 0;
                    }
                    z = false;
                    i = i5;
                }
                i2 *= iArr[i5];
                i5 = i;
            }
            return i2;
        }

        public static void o() {
            Parcelable.Creator creator = j8x0.CREATOR;
        }

        public static long p(byte b, byte b2) {
            int i;
            int i2;
            int i3 = b & 255;
            int i4 = b & 3;
            if (i4 != 0) {
                i = 2;
                if (i4 != 1 && i4 != 2) {
                    i = b2 & 63;
                }
            } else {
                i = 1;
            }
            int i5 = i3 >> 3;
            int i6 = i5 & 3;
            if (i5 >= 16) {
                i2 = 2500 << i6;
            } else if (i5 >= 12) {
                i2 = 10000 << (i5 & 1);
            } else {
                i2 = i6 == 3 ? 60000 : 10000 << i6;
            }
            return ((long) i) * ((long) i2);
        }

        public static final String q(pjw0 pjw0Var) {
            String str;
            ljw0 ljw0Var = pjw0Var.b;
            if (ljw0Var instanceof ljw0) {
                l8g1 l8g1Var = ljw0Var.a.b;
                str = l8g1Var != null ? l8g1Var.a.a : null;
                return str == null ? "" : str;
            }
            if (!(ljw0Var instanceof mjw0)) {
                eg.o();
                return null;
            }
            l8g1 l8g1Var2 = ((mjw0) ljw0Var).a.d;
            str = l8g1Var2 != null ? l8g1Var2.a.a : null;
            return str == null ? "" : str;
        }

        public static boolean r(Context context) {
            return context.isDeviceProtectedStorage();
        }

        public static nx40 s(View view, Class cls) {
            view.getClass();
            nx40 nx40Var = (nx40) cls.cast(view.getTag(2131429011));
            if (nx40Var != null) {
                return nx40Var;
            }
            eg.m("This view doesn't have a GlueViewBinder associated with it. Have you called GlueViewBinders.save()?");
            return null;
        }

        public static void t(RecyclerView recyclerView, int... iArr) {
            int[] iArr2;
            if (iArr.length > 0) {
                int i = iArr[0];
                z511 adapter = recyclerView.getAdapter();
                if (!(adapter instanceof s470)) {
                    hhg1.n("RecyclerView not managed by Hubs!");
                    return;
                }
                if (i < 0) {
                    Locale locale = Locale.US;
                    hhg1.n(l1d.j(i, adapter.e(), "Index out of bounds: ", " (count: ", ")"));
                    return;
                }
                LinearLayoutManager layoutManager = recyclerView.getLayoutManager();
                recyclerView.B0();
                if (layoutManager instanceof LinearLayoutManager) {
                    layoutManager.w1(i, 0);
                } else {
                    recyclerView.u0(i);
                }
                w611 w611VarN = recyclerView.N(i);
                int length = iArr.length;
                if (length == 0) {
                    hhg1.n("Invalid empty path");
                    return;
                }
                if (length != 1) {
                    int i2 = length - 1;
                    iArr2 = new int[i2];
                    System.arraycopy(iArr, 1, iArr2, 0, i2);
                } else {
                    iArr2 = ha71.a;
                }
                if (w611VarN != null) {
                    s470.C(recyclerView.T(w611VarN.a)).f(iArr2);
                } else {
                    recyclerView.k(new p470(i, recyclerView, iArr2, (byte) 1));
                }
            }
        }

        public static o8a0 u(int i, boolean z, drb0 drb0Var, int i2) {
            boolean z2 = (i2 & 1) != 0 ? false : z;
            boolean z3 = (i2 & 2) == 0;
            if ((i2 & 4) != 0) {
                drb0Var = null;
            }
            return new o8a0(i, z3, z2, drb0Var != null ? Collections.singleton(drb0Var) : null, 34);
        }
    }
