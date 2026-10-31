package p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.car.app.SessionInfo;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.spotify.mobius.Next;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.Restrictions;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class yoo1 {
    public static final t8e1 a = new t8e1((byte) 26);
    public static final t8e1 b = new t8e1((byte) 27);
    public static b180 c;

    public static final xd60 A(x340 x340Var) {
        uwr uwrVar = cbx.a;
        cvx cvxVar = cbx.b(x340Var).b;
        uyx uyxVarD = cbx.d(x340Var);
        Object obj = ajx.a.b;
        Object objT = x340Var.T();
        m4c m4cVar = fkj0.X;
        if (objT == m4cVar) {
            objT = z860.R0;
            x340Var.s0(objT);
        }
        ajc0 ajc0Var = new ajc0((iu30) objT);
        float f = cvxVar.a;
        zzq0 zzq0VarH = uyn1.h(2, 16.0f, 0.0f);
        zzq0 zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 16.0f);
        zzq0 zzq0Var2 = new zzq0(16.0f, 12.0f, 16.0f, cvxVar.b);
        Object objT2 = x340Var.T();
        if (objT2 == m4cVar) {
            objT2 = z860.S0;
            x340Var.s0(objT2);
        }
        return new xd60(ajc0Var, f, zzq0VarH, zzq0Var, zzq0Var2, new ajc0((iu30) objT2), new fb60(50.0f, uyxVarD.f.a.b, uyxVarD.c.a.b));
    }

    public static final aak0 B(hlk0 hlk0Var) {
        Double d = hlk0Var.a;
        Integer numValueOf = d != null ? Integer.valueOf((int) Math.rint(d.doubleValue())) : null;
        String str = hlk0Var.b;
        aak0 aak0Var = new aak0(str, hlk0Var.c, numValueOf);
        if (numValueOf == null && str == null) {
            return null;
        }
        return aak0Var;
    }

    public static final Next C(w9p0 w9p0Var, gmm1 gmm1Var) {
        boolean zEquals = gmm1Var.equals(wlm1.a);
        nlm1 nlm1Var = nlm1.a;
        if (zEquals) {
            return Next.i(w9p0Var, Collections.singleton(nlm1Var));
        }
        boolean zEquals2 = gmm1Var.equals(ulm1.a);
        mlm1 mlm1Var = mlm1.a;
        if (zEquals2) {
            return Next.i(w9p0Var, Collections.singleton(mlm1Var));
        }
        boolean zEquals3 = gmm1Var.equals(dmm1.a);
        qlm1 qlm1Var = qlm1.a;
        if (zEquals3) {
            return Next.i(w9p0Var, Collections.singleton(qlm1Var));
        }
        boolean zEquals4 = gmm1Var.equals(fmm1.a);
        rlm1 rlm1Var = rlm1.a;
        if (zEquals4) {
            return Next.i(w9p0Var, Collections.singleton(rlm1Var));
        }
        boolean zEquals5 = gmm1Var.equals(bmm1.a);
        plm1 plm1Var = plm1.a;
        if (zEquals5) {
            return Next.a(Collections.singleton(plm1Var));
        }
        boolean zEquals6 = gmm1Var.equals(zlm1.a);
        olm1 olm1Var = olm1.a;
        if (zEquals6) {
            return Next.a(Collections.singleton(olm1Var));
        }
        if (gmm1Var.equals(slm1.a)) {
            return Next.a(Collections.singleton(llm1.a));
        }
        if (gmm1Var.equals(vlm1.a)) {
            return Next.i(w9p0Var, Collections.singleton(nlm1Var));
        }
        if (gmm1Var.equals(tlm1.a)) {
            return Next.i(w9p0Var, Collections.singleton(mlm1Var));
        }
        if (gmm1Var.equals(cmm1.a)) {
            return Next.i(w9p0Var, Collections.singleton(qlm1Var));
        }
        if (gmm1Var.equals(emm1.a)) {
            return Next.i(w9p0Var, Collections.singleton(rlm1Var));
        }
        if (gmm1Var.equals(amm1.a)) {
            return Next.a(Collections.singleton(plm1Var));
        }
        if (gmm1Var.equals(ylm1.a)) {
            return Next.a(Collections.singleton(olm1Var));
        }
        if (gmm1Var instanceof xlm1) {
            xlm1 xlm1Var = (xlm1) gmm1Var;
            return Next.h(new w9p0(xlm1Var.a, xlm1Var.b, xlm1Var.c, xlm1Var.d, xlm1Var.e, xlm1Var.f, xlm1Var.g, xlm1Var.h, xlm1Var.i, xlm1Var.j, xlm1Var.k, xlm1Var.l, xlm1Var.m, xlm1Var.n, xlm1Var.o));
        }
        eg.o();
        return null;
    }

    public static final qim0 D(qim0 qim0Var, erl1 erl1Var) {
        return qim0Var.then(new hdt(erl1Var, b));
    }

    public static final qim0 E(qim0 qim0Var, u85 u85Var) {
        return qim0Var.then(new hdt(u85Var, a));
    }

    public static gap1 F(int i) throws GeneralSecurityException {
        int i2 = i - 2;
        if (i2 == 0) {
            return gap1.c;
        }
        if (i2 == 1) {
            return gap1.d;
        }
        if (i2 == 2) {
            return gap1.e;
        }
        if (i2 == 3) {
            return gap1.f;
        }
        if (i2 == 4) {
            return gap1.g;
        }
        throw new GeneralSecurityException("Unknown KeyMaterialType: ".concat(Integer.toString(i2)));
    }

    public static clv G(int i) throws GeneralSecurityException {
        int i2 = i - 2;
        if (i2 == 0) {
            return clv.e;
        }
        if (i2 == 1) {
            return clv.f;
        }
        if (i2 == 2) {
            return clv.g;
        }
        if (i2 == 3) {
            return clv.h;
        }
        if (i2 == 4) {
            return clv.i;
        }
        if (i2 == 5) {
            return clv.t;
        }
        throw new GeneralSecurityException("Unknown OutputPrefixType: ".concat(Integer.toString(i2)));
    }

    public static final void a(int i, String str, List list, b0k b0kVar) {
        List list2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(947290825);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(list) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            mbh mbhVarA = jbh.a(new d36(8.0f, true, new um5(false)), een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, nim0Var);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = zib0.W0;
                x340Var.s0(objT);
            }
            list2 = list;
            uwo1.e(str, s161.b(qim0VarF, false, (iu30) objT), cbx.d(x340Var).k, 0L, null, null, 0, false, null, 0, null, x340Var, i2 & 14, 0, 2040);
            d(list2, x340Var, (i2 >> 3) & 14);
            x340Var.r(true);
        } else {
            list2 = list;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vwb0(str, list2, i);
        }
    }

    public static final void b(k37 k37Var, float f, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        zvx zvxVar;
        qim0 qim0Var2 = qim0Var;
        boolean z = k37Var.b;
        String str = k37Var.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(590011737);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(k37Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.d(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(qim0Var2) ? 256 : 128;
        }
        if (!x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            x340Var.b0();
        } else if (str.length() == 0) {
            x340Var.i0(2033616618);
            z1a1.c(k37Var.c, f, qim0Var2, k37Var.b, 0.0f, x340Var, i2 & 1008, 16);
            qim0Var2 = qim0Var2;
            x340Var.r(false);
        } else {
            x340Var.i0(2033792481);
            Uri uri = Uri.parse(str);
            if (z) {
                x340Var.i0(2033956036);
                x340Var.r(false);
                zvxVar = null;
            } else {
                x340Var.i0(65612352);
                uwr uwrVar = cbx.a;
                cua cuaVar = cbx.b(x340Var).f;
                cua cuaVar2 = cbx.b(x340Var).f;
                zvxVar = new zvx();
                x340Var.r(false);
            }
            zvx zvxVar2 = zvxVar;
            cbx.a.getClass();
            ecx ecxVarA = uwr.a();
            qim0 qim0VarQ = nim0.a;
            if (z) {
                qim0VarQ = i1p1.q(qim0VarQ, er31.a);
            }
            eso1.e(uri, isl.a, qim0Var2.then(qim0VarQ), (p3v) null, zvxVar2, ecxVarA, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var, 3120, 0, 4032);
            x340Var = x340Var;
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jh6((Object) k37Var, f, qim0Var2, i, (byte) 1);
        }
    }

    public static final void c(int i, String str, Function0 function0, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(34392466);
        int i2 = i | (x340Var.i(function0) ? 4 : 2) | (x340Var.g(str) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(0.0f, 16.0f, 1, nim0.a);
            jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarZ);
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
            foo1.c(new gbx(z50.c, function0), ldx.c, null, null, yla.s(x340Var), null, null, null, r6j.b, null, apo.r(-1078505867, new psr0(str, (byte) 3), x340Var), x340Var, 805306368, 48, 1500);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ql(i, str, function0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(List list, b0k b0kVar, int i) {
        x340 x340Var;
        byte b2;
        vu30 vu30Var = y580.Y;
        vu30 vu30Var2 = y580.R0;
        llj lljVar = y580.N0;
        llj lljVar2 = y580.O0;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-770510023);
        j06 j06Var = x340Var2.a;
        int i2 = (i & 6) == 0 ? (x340Var2.g(list) ? 4 : 2) | i : i;
        int i3 = 0;
        boolean z = true;
        if (x340Var2.Y(i2 & 1, (i2 & 3) != 2)) {
            boolean z2 = (i2 & 14) == 4;
            Object objT = x340Var2.T();
            if (z2 || objT == m4cVar) {
                objT = new s6(list, (byte) 29);
                x340Var2.s0(objT);
            }
            qim0 qim0Var = nim0.a;
            qim0 qim0VarB = s161.b(qim0Var, false, (iu30) objT);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            mbh mbhVarA = jbh.a(new d36(8.0f, true, new um5(false)), een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarB);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z3 = x340Var2.S;
            Function0 function0 = hmb0.t1;
            if (z3) {
                x340Var2.l(function0);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA, x340Var2, lljVar2);
            nko1.H(xos0VarM, x340Var2, lljVar);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, vu30Var2);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, vu30Var);
            x340Var2.i0(-1927572706);
            int i4 = 0;
            for (Object obj : list) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    p7h.T();
                    throw null;
                }
                String str = (String) obj;
                qim0 qim0VarF = u291.f(qim0Var, 1.0f);
                boolean zE = x340Var2.e(i4);
                Object objT2 = x340Var2.T();
                if (zE || objT2 == m4cVar) {
                    objT2 = new po60(i4, (byte) 10);
                    x340Var2.s0(objT2);
                }
                qim0 qim0VarB2 = s161.b(qim0VarF, z, (iu30) objT2);
                jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var2, i3);
                int iHashCode2 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM2 = x340Var2.m();
                qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarB2);
                hzj.A.getClass();
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(function0);
                } else {
                    x340Var2.v0();
                }
                nko1.H(jw31VarA, x340Var2, lljVar2);
                nko1.H(xos0VarM2, x340Var2, lljVar);
                nko1.H(Integer.valueOf(iHashCode2), x340Var2, vu30Var2);
                nko1.F(x340Var2);
                nko1.H(qim0VarE2, x340Var2, vu30Var);
                uwr uwrVar2 = cbx.a;
                cvx cvxVar2 = cbx.b(x340Var2).b;
                qim0 qim0VarB3 = uyn1.B(qim0Var, 0.0f, 0.0f, 8.0f, 0.0f, 11);
                qim0 qim0Var2 = qim0Var;
                Object objT3 = x340Var2.T();
                if (objT3 == m4cVar) {
                    objT3 = zib0.X0;
                    x340Var2.s0(objT3);
                }
                x340 x340Var3 = x340Var2;
                uwo1.e("•", s161.a(qim0VarB3, (iu30) objT3), cbx.d(x340Var2).j, 0L, null, null, 0, false, null, 0, null, x340Var3, 6, 0, 2040);
                uwo1.e(str, new wnb0(1.0f, true), cbx.d(x340Var3).j, 0L, null, null, 0, false, null, 0, null, x340Var3, 0, 0, 2040);
                x340Var3.r(true);
                x340Var2 = x340Var3;
                z = true;
                i4 = i5;
                qim0Var = qim0Var2;
                vu30Var2 = vu30Var2;
                function0 = function0;
                vu30Var = vu30Var;
                i3 = 0;
            }
            x340Var = x340Var2;
            boolean z4 = z;
            x340Var.r(i3);
            x340Var.r(z4);
            b2 = z4;
        } else {
            x340Var = x340Var2;
            b2 = 1;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new eu30(list, i, b2);
        }
    }

    public static final void e(c380 c380Var, int i, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i2) {
        qim0 qim0Var2;
        boolean z;
        long j;
        int i3 = i;
        iu30 iu30Var2 = iu30Var;
        llj lljVar = y580.Y;
        llj lljVar2 = y580.R0;
        llj lljVar3 = y580.N0;
        llj lljVar4 = y580.O0;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1317410440);
        j06 j06Var = x340Var.a;
        int i4 = i2 | (x340Var.i(c380Var) ? 4 : 2) | (x340Var.e(i3) ? 32 : 16) | (x340Var.i(iu30Var2) ? 256 : 128) | 3072;
        if (x340Var.Y(i4 & 1, (i4 & 1171) != 1170)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarY = voo1.y(dug.f(qim0VarF, cbx.a(x340Var).a.a.a(), d4o1.a), voo1.g);
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(0.0f, 4.0f, 1, qim0VarY);
            jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarZ);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z2 = x340Var.S;
            Function0 function0 = hmb0.t1;
            if (z2) {
                x340Var.l(function0);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, lljVar4);
            nko1.H(xos0VarM, x340Var, lljVar3);
            x0d.q(iHashCode, x340Var, lljVar2, x340Var);
            Iterator itN = kk0.n(x340Var, qim0VarE, lljVar, 2006770385, c380Var);
            int i5 = 0;
            while (itN.hasNext()) {
                Object next = itN.next();
                int i6 = i5 + 1;
                if (i5 < 0) {
                    p7h.T();
                    throw null;
                }
                xse xseVar = (xse) next;
                if (i3 == i5) {
                    x340Var.i0(1965422705);
                    uwr uwrVar2 = cbx.a;
                    j = cbx.a(x340Var).b.a;
                    z = false;
                } else {
                    z = false;
                    x340Var.i0(1965423700);
                    uwr uwrVar3 = cbx.a;
                    j = cbx.a(x340Var).b.b;
                }
                x340Var.r(z);
                wnb0 wnb0Var = new wnb0(1.0f, true);
                pm31 pm31Var = new pm31(4);
                boolean zI = ((i4 & 896) == 256) | x340Var.i(xseVar);
                Object objT = x340Var.T();
                if (zI || objT == fkj0.X) {
                    objT = new ame(iu30Var2, xseVar, (byte) 2);
                    x340Var.s0(objT);
                }
                qim0 qim0VarX = bin.x(wnb0Var, false, null, pm31Var, null, (Function0) objT, 11);
                cvx cvxVar2 = cbx.b(x340Var).b;
                qim0 qim0VarZ2 = uyn1.z(0.0f, 4.0f, 1, qim0VarX);
                era eraVar = een.Q0;
                cvx cvxVar3 = cbx.b(x340Var).b;
                int i7 = i4;
                mbh mbhVarA = jbh.a(new d36(4.0f, false, new g21(een.N0, (byte) 28)), eraVar, x340Var, 0);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarZ2);
                hzj.A.getClass();
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(function0);
                } else {
                    x340Var.v0();
                }
                nko1.H(mbhVarA, x340Var, lljVar4);
                nko1.H(xos0VarM2, x340Var, lljVar3);
                x0d.q(iHashCode2, x340Var, lljVar2, x340Var);
                nko1.H(qim0VarE2, x340Var, lljVar);
                hux huxVar = xseVar.c;
                zov0 zov0Var = cbx.b(x340Var).g;
                Function0 function1 = function0;
                long j2 = j;
                w0h1.a(huxVar, isl.a, u291.r(qim0Var3, 24.0f), j2, 0L, false, x340Var, 56, 48);
                x340 x340Var2 = x340Var;
                uwo1.e(xseVar.b, null, cbx.d(x340Var).m, j2, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2034);
                x340Var = x340Var2;
                x340Var.r(true);
                i3 = i;
                iu30Var2 = iu30Var;
                i4 = i7;
                i5 = i6;
                qim0Var3 = qim0Var3;
                function0 = function1;
            }
            x340Var.r(false);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ate(c380Var, i, iu30Var, qim0Var2, i2, (byte) 0);
        }
    }

    public static final void f(v5q0 v5q0Var, boolean z, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(582748691);
        int i2 = (x340Var.g(v5q0Var) ? 4 : 2) | i | (x340Var.h(z) ? 32 : 16) | (x340Var.g(qim0Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            c4p1.k(v5q0Var, z, anm1.N("create.group", qim0Var), apo.r(27365089, new h1m(v5q0Var, (byte) 21), x340Var), x340Var, (i2 & 112) | (i2 & 14) | 3072);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zs((Object) v5q0Var, z, (Object) qim0Var, i, (byte) 12);
        }
    }

    public static final void g(ccs0 ccs0Var, iu30 iu30Var, Function0 function0, vu30 vu30Var, Function0 function1, String str, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1919711770);
        int i2 = (x340Var.i(ccs0Var) ? 4 : 2) | i | (x340Var.i(iu30Var) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function0) ? 256 : 128;
        }
        int i3 = i2 | (x340Var.i(vu30Var) ? 2048 : 1024);
        if ((i & 24576) == 0) {
            i3 |= x340Var.i(function1) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= x340Var.i(nim0.a) ? 131072 : 65536;
        }
        int i4 = i3 | (x340Var.g(str) ? 1048576 : 524288);
        if (x340Var.Y(i4 & 1, (599187 & i4) != 599186)) {
            x340Var.d0();
            if ((i & 1) != 0 && !x340Var.E()) {
                x340Var.b0();
            }
            x340Var.s();
            anm1.a(function0, new i3u(3, false, false, false), apo.r(-1905608131, new uuy(vu30Var, function0, str, ccs0Var, iu30Var, function1), x340Var), x340Var, ((i4 >> 6) & 14) | 384, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kqf0(ccs0Var, iu30Var, function0, vu30Var, function1, str, i);
        }
    }

    public static final void h(ccs0 ccs0Var, String str, String str2, boolean z, tob1 tob1Var, c380 c380Var, t2c0 t2c0Var, vu30 vu30Var, Function0 function0, vu30 vu30Var2, vu30 vu30Var3, j2i j2iVar, b0k b0kVar, int i, int i2) {
        int i3;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1081876649);
        int i4 = i | (b0kVar3.i(ccs0Var) ? 4 : 2) | (b0kVar3.g(str) ? 32 : 16) | (b0kVar3.g(str2) ? 256 : 128) | (b0kVar3.h(z) ? 2048 : 1024) | (b0kVar3.i(tob1Var) ? 16384 : 8192);
        if ((i & 196608) == 0) {
            i4 |= b0kVar3.i(c380Var) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i4 |= b0kVar3.i(t2c0Var) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i4 |= b0kVar3.i(vu30Var) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= b0kVar3.i(function0) ? 67108864 : 33554432;
        }
        int i5 = i4 | (b0kVar3.i(vu30Var2) ? 536870912 : 268435456);
        if ((i2 & 6) == 0) {
            i3 = i2 | (b0kVar3.i(vu30Var3) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= b0kVar3.i(j2iVar) ? 32 : 16;
        }
        int i6 = i2 & 384;
        nim0 nim0Var = nim0.a;
        if (i6 == 0) {
            i3 |= b0kVar3.i(nim0Var) ? 256 : 128;
        }
        int i7 = i3;
        if (b0kVar3.Y(i5 & 1, ((i5 & 306783379) == 306783378 && (i7 & 147) == 146) ? false : true)) {
            int i8 = i7 >> 3;
            b0kVar2 = b0kVar3;
            t(j2iVar, nim0Var, vu30Var2, apo.r(2096418856, new tbs0(c380Var, t2c0Var, vu30Var, (byte) 0), b0kVar3), apo.r(-138625943, new lpk(tob1Var, (byte) 6), b0kVar3), apo.r(1921296554, new ofi0(str, ccs0Var, z, str2, function0), b0kVar3), vu30Var3, t2c0Var.a, b0kVar2, (i8 & 112) | (i8 & 14) | 224256 | ((i5 >> 21) & 896) | ((i7 << 21) & 29360128), 64);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ubs0(ccs0Var, str, str2, z, tob1Var, c380Var, t2c0Var, vu30Var, function0, vu30Var2, vu30Var3, j2iVar, i, i2);
        }
    }

    public static final void i(bwd1 bwd1Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        iu30 iu30Var2;
        qim0 qim0Var2;
        int i3 = bwd1Var.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(439903481);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.i(bwd1Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            iu30Var2 = iu30Var;
            i2 |= x340Var.i(iu30Var2) ? 32 : 16;
        } else {
            iu30Var2 = iu30Var;
        }
        int i4 = i2 | 384;
        if (x340Var.Y(i4 & 1, (i4 & 147) != 146)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarP = x0d.p(lhc.g(x340Var).g, 32, qim0VarF);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            cvx cvxVar3 = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(qim0VarP, 16.0f, 0.0f, 16.0f, 8.0f, 2);
            cvx cvxVar4 = cbx.b(x340Var).b;
            mbh mbhVarA = jbh.a(new d36(16.0f, true, new um5(false)), een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            qim0 qim0VarF2 = u291.f(qim0Var3, 1.0f);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = zib0.Y0;
                x340Var.s0(objT);
            }
            uwo1.e(cwl1.o0(x340Var, 2131957194), s161.b(qim0VarF2, false, (iu30) objT), cbx.d(x340Var).e, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2040);
            a(0, cwl1.n0(2131957197, new Object[]{Integer.valueOf(i3 + 1), Integer.valueOf(bwd1Var.c)}, x340Var), p7h.M(new String[]{cwl1.o0(x340Var, 2131957199), cwl1.o0(x340Var, 2131957201), cwl1.o0(x340Var, 2131957200), cwl1.o0(x340Var, 2131957198)}), x340Var);
            a(0, cwl1.n0(2131957190, new Object[]{Integer.valueOf(i3)}, x340Var), p7h.M(new String[]{cwl1.o0(x340Var, 2131957191), cwl1.o0(x340Var, 2131957189), cwl1.o0(x340Var, 2131957193), cwl1.o0(x340Var, 2131957192)}), x340Var);
            uwo1.d(wmo1.A(2131957195, 2131957196, "https://support.spotify.com/article/managed-accounts/plain/", new zma1(cbx.a(x340Var).c.f, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, cbx.d(x340Var).m.a.f, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.c, (Shadow) null, (PlatformSpanStyle) null, 61406), iu30Var2, x340Var, ((i4 << 9) & 57344) | 384, 0), cbx.a(x340Var).b.b, u291.f(qim0Var3, 1.0f), cbx.d(x340Var).m, null, null, 0, false, null, 0, null, null, x340Var, 0, 0, 4080);
            x340Var = x340Var;
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ri60((byte) 20, i, bwd1Var, qim0Var2, iu30Var);
        }
    }

    public static final void j(hob1 hob1Var, j2i j2iVar, qim0 qim0Var, vu30 vu30Var, boolean z, boolean z2, Function0 function0, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(829549077);
        int i2 = i | (x340Var.i(hob1Var) ? 4 : 2) | 384 | (x340Var.h(z) ? 16384 : 8192) | 196608 | (x340Var.h(z2) ? 1048576 : 524288) | (x340Var.i(function0) ? 8388608 : 4194304);
        if (x340Var.Y(i2 & 1, (4793491 & i2) != 4793490)) {
            cr00 cr00Var = hob1Var.h;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
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
            int i3 = i2 >> 3;
            n(cr00Var, vu30Var, j2iVar, z, hob1Var.x, z2, x340Var, (i3 & 7168) | 432 | (i3 & 458752));
            x340Var.i0(484188819);
            x340Var.r(false);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vl(hob1Var, j2iVar, qim0Var2, vu30Var, z, z2, function0, i);
        }
    }

    public static final void k(int i, String str, String str2, String str3, Function0 function0, b0k b0kVar) {
        int i2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(304891);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.g(str3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(function0) ? 2048 : 1024;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            b0kVar2 = b0kVar3;
            fn31.b(function0, apo.r(-366335677, new ql(function0, str3, (byte) 24), b0kVar3), (qim0) null, (vu30) null, apo.r(-678296761, new psr0(str, (byte) 5), b0kVar3), apo.r(-756287032, new psr0(str2, (byte) 6), b0kVar3), (hw61) null, 0L, 0L, 0L, 0L, (i3u) null, b0kVar2, ((i2 >> 9) & 14) | 1769520, 16284);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ptd(str, str2, str3, function0, i, (byte) 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:83:0x014c  */
    public static final void l(ccs0 ccs0Var, iu30 iu30Var, iu30 iu30Var2, Function0 function0, tob1 tob1Var, Function0 function1, Function0 function2, c380 c380Var, t2c0 t2c0Var, vu30 vu30Var, mr20 mr20Var, mr20 mr20Var2, Function0 function3, qim0 qim0Var, gpv0 gpv0Var, b0k b0kVar, int i) {
        x340 x340Var;
        qim0 qim0Var2;
        ccs0 ccs0Var2;
        j2i j2iVar;
        j2i j2iVarR;
        ccs0 ccs0Var3;
        j2i j2iVar2;
        Object obj;
        boolean z;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1190032809);
        int i2 = i | (x340Var2.i(ccs0Var) ? 4 : 2) | (x340Var2.i(iu30Var) ? 32 : 16) | (x340Var2.i(iu30Var2) ? 256 : 128) | (x340Var2.i(function0) ? 2048 : 1024) | (x340Var2.i(tob1Var) ? 16384 : 8192) | (x340Var2.i(function1) ? 131072 : 65536) | (x340Var2.i(function2) ? 1048576 : 524288) | (x340Var2.i(c380Var) ? 8388608 : 4194304) | (x340Var2.i(t2c0Var) ? 67108864 : 33554432) | (x340Var2.i(vu30Var) ? 536870912 : 268435456);
        int i3 = (x340Var2.i(mr20Var) ? 4 : 2) | (x340Var2.i(mr20Var2) ? 32 : 16) | (x340Var2.i(function3) ? 256 : 128) | 3072 | (x340Var2.i(gpv0Var) ? 16384 : 8192);
        if (x340Var2.Y(i2 & 1, ((i2 & 306783379) == 306783378 && (i3 & 9363) == 9362) ? false : true)) {
            int i4 = i2 & 14;
            boolean zI = x340Var2.i(ccs0Var);
            Object objT = x340Var2.T();
            lnm lnmVar = null;
            if (zI || objT == m4cVar) {
                objT = new e3p0(ccs0Var, lnmVar, (byte) 26);
                x340Var2.s0(objT);
            }
            ccs0 ccs0Var4 = (ccs0) yto.p(null, ccs0Var, (vu30) objT, x340Var2, ((i4 << 3) & 112) | 6).getValue();
            boolean zB0 = ccs0Var.b0();
            if (zB0) {
                boolean z2 = ccs0Var4 != null;
                tqw0 tqw0VarG = ccs0Var.g();
                n57.k(z2, "Missing model without overlay when rendering overlay %s", new Object[]{tqw0VarG != null ? tqw0VarG.getClass().getSimpleName() : null});
                if (ccs0Var4 == null) {
                    ccs0Var2 = ccs0Var;
                }
            } else {
                ccs0Var2 = ccs0Var;
            }
            if (zB0) {
                ccs0Var2 = ccs0Var4;
                j2iVar = r6j.a;
            } else {
                ccs0Var2 = ccs0Var4;
                j2iVar = null;
            }
            String str = ccs0Var.e;
            if (str == null) {
                x340Var2.i0(1608599548);
                x340Var2.r(false);
                j2iVarR = null;
            } else {
                x340Var2.i0(1608599549);
                j2iVarR = apo.r(434454904, new ql(str, function0, (byte) 25), x340Var2);
                x340Var2.r(false);
            }
            boolean zG = x340Var2.g(ccs0Var2.a.f);
            Object objT2 = x340Var2.T();
            if (zG || objT2 == m4cVar) {
                c380 c380Var2 = ccs0Var.a.f;
                ArrayList arrayList = new ArrayList(q7h.U(c380Var2, 10));
                Iterator it = c380Var2.iterator();
                while (it.hasNext()) {
                    xbs0 xbs0Var = (xbs0) it.next();
                    arrayList.add(new mmr0(new zbs0(xbs0Var.a), new j2i(-328108779, new w9(new xnm0(new j2i(-703201834, new eus(new j2i(207280700, new nso0(xbs0Var, (byte) 24), true), (byte) 1), true)), (byte) 15), true)));
                    it = it;
                    ccs0Var2 = ccs0Var2;
                    j2iVarR = j2iVarR;
                }
                ccs0Var3 = ccs0Var2;
                j2iVar2 = j2iVarR;
                List listL1 = o7h.l1(arrayList);
                dw91 dw91Var = new dw91();
                dw91Var.putAll(sqg0.T(listL1));
                x340Var2.s0(dw91Var);
                obj = dw91Var;
            } else {
                ccs0Var3 = ccs0Var2;
                j2iVar2 = j2iVarR;
                obj = objT2;
            }
            j2i j2iVarR2 = apo.r(-564128927, new ydi0((Object) ccs0Var3, obj, (Object) iu30Var2, (Object) iu30Var, (Object) mr20Var, (Object) mr20Var2, (Object) gpv0Var, (byte) 4), x340Var2);
            ee30 ee30VarG = ccs0Var3.g();
            if (ee30VarG instanceof ee30) {
                x340Var2.i0(1609672211);
                ee30 ee30Var = ee30VarG;
                int i5 = i2 >> 6;
                h(ccs0Var3, ee30Var.c, ee30Var.b, !ee30Var.d, tob1Var, c380Var, t2c0Var, vu30Var, function1, j2iVar2, j2iVar, j2iVarR2, x340Var2, (i2 & 57344) | (458752 & i5) | (3670016 & i5) | (i5 & 29360128) | ((i2 << 9) & 234881024), 432);
                x340Var = x340Var2;
                z = false;
                x340Var.r(false);
            } else {
                vu30 vu30Var2 = j2iVar;
                x340Var = x340Var2;
                j2i j2iVar3 = j2iVar2;
                z = false;
                if (ee30VarG instanceof ihs0) {
                    x340Var.i0(1610094152);
                    g(ccs0Var3, iu30Var, function2, vu30Var2, function0, ((ihs0) ee30VarG).a, x340Var, (i2 & 112) | ((i2 >> 12) & 896) | ((i2 << 3) & 57344) | 196608);
                    x340Var.r(false);
                } else {
                    x340Var.i0(1610378577);
                    r(j2iVar3, vu30Var2, j2iVarR2, x340Var, 3456);
                    x340Var.r(false);
                }
            }
            imr0 imr0Var = ccs0Var.S0;
            if (imr0Var == null) {
                x340Var.i0(1610517332);
                x340Var.r(z);
            } else {
                x340Var.i0(1610517333);
                k((i3 << 3) & 7168, imr0Var.a, imr0Var.b, imr0Var.c, function3, x340Var);
                x340Var.r(z);
            }
            qim0Var2 = nim0.a;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vbs0(ccs0Var, iu30Var, iu30Var2, function0, tob1Var, function1, function2, c380Var, t2c0Var, vu30Var, mr20Var, mr20Var2, function3, qim0Var2, gpv0Var, i);
        }
    }

    public static final void m(List list, int i, Function0 function0, qim0 qim0Var, b0k b0kVar, int i2) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-951640378);
        int i3 = i2 | (b0kVar3.g(list) ? 4 : 2) | (b0kVar3.e(i) ? 32 : 16) | (b0kVar3.i(function0) ? 256 : 128) | 3072;
        if (b0kVar3.Y(i3 & 1, (i3 & 1171) != 1170)) {
            String quantityString = ((Context) b0kVar3.k(AndroidCompositionLocals_androidKt.b)).getResources().getQuantityString(2131820870, i, Integer.valueOf(i));
            gbx gbxVar = new gbx(z50.c, function0);
            ngx ngxVar = ngx.e;
            boolean z = false;
            zzq0 zzq0Var = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
            boolean zG = b0kVar3.g(quantityString);
            if ((i3 & 896) == 256) {
                z = true;
            }
            boolean z2 = zG | z;
            Object objT = b0kVar3.T();
            if (z2 || objT == fkj0.X) {
                objT = new f0n(quantityString, function0, (byte) 3);
                b0kVar3.s0(objT);
            }
            qim0 qim0Var3 = nim0.a;
            b0kVar2 = b0kVar3;
            cwl1.b(s161.a(qim0Var3, (iu30) objT), (tl3) null, (hw61) null, ngxVar, zzq0Var, (max) null, false, (idn0) null, (ga80) null, gbxVar, (gbx) null, apo.r(-1128621379, new ut1(i, (Object) list, (byte) 7), b0kVar3), b0kVar2, 27648, 48, 1510);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new j5w0(list, i, function0, qim0Var2, i2);
        }
    }

    public static final void n(cr00 cr00Var, vu30 vu30Var, j2i j2iVar, boolean z, ch7 ch7Var, boolean z2, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1352681023);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(cr00Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(vu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(j2iVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(ch7Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.h(z2) ? 131072 : 65536;
        }
        if (!x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            x340Var.b0();
        } else if (upo1.A(x340Var)) {
            x340Var.i0(1958096610);
            q(cr00Var, vu30Var, j2iVar, z, ch7Var, z2, x340Var, i2 & 524286);
            x340Var.r(false);
        } else {
            x340Var.i0(1958292034);
            p(cr00Var, vu30Var, j2iVar, z, ch7Var, z2, x340Var, i2 & 524286);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ybi0(cr00Var, vu30Var, j2iVar, z, ch7Var, z2, i, (byte) 0);
        }
    }

    public static final void o(ch7 ch7Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1824975587);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.i(ch7Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            x340Var.i0(-1454878370);
            ye5 ye5Var = new ye5();
            x340Var.i0(-1454877546);
            uwr uwrVar = cbx.a;
            zsc zscVar = zex.a;
            vex vexVar = (vex) zscVar.e;
            vex vexVar2 = (vex) zscVar.e;
            int iO = ye5Var.o(new zma1(vexVar.m, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
            try {
                ye5Var.g(cwl1.o0(x340Var, 2131963494));
                ye5Var.k(iO);
                x340Var.r(false);
                int iO2 = ye5Var.o(new zma1(cbx.a(x340Var).b.a, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
                try {
                    ye5Var.g(" " + ch7Var.a);
                    ye5Var.k(iO2);
                    af5 af5VarP = ye5Var.p();
                    x340Var.r(false);
                    uwo1.d(af5VarP, vexVar2.m, null, cbx.d(x340Var).j, null, null, 0, false, null, 0, null, null, x340Var, 0, 0, 4084);
                    x340Var = x340Var;
                    String str = ch7Var.b;
                    if (str == null) {
                        x340Var.i0(2143876903);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(2143876904);
                        x340Var.i0(-1454861435);
                        ye5 ye5Var2 = new ye5();
                        x340Var.i0(-1454860521);
                        int iO3 = ye5Var2.o(new zma1(vexVar2.m, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
                        try {
                            ye5Var2.g(cwl1.o0(x340Var, 2131961065));
                            ye5Var2.k(iO3);
                            x340Var.r(false);
                            int iO4 = ye5Var2.o(new zma1(cbx.a(x340Var).b.a, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
                            try {
                                ye5Var2.g(" ".concat(str));
                                ye5Var2.k(iO4);
                                af5 af5VarP2 = ye5Var2.p();
                                x340Var.r(false);
                                uwo1.f(af5VarP2, null, cbx.d(x340Var).j, null, null, null, 0, false, null, 0, null, null, x340Var, 0, 0, 4090);
                                x340Var.r(false);
                            } catch (Throwable th) {
                                ye5Var2.k(iO4);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            ye5Var2.k(iO3);
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    ye5Var.k(iO2);
                    throw th3;
                }
            } catch (Throwable th4) {
                ye5Var.k(iO);
                throw th4;
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ug50(ch7Var, i, (byte) 11);
        }
    }

    public static final void p(cr00 cr00Var, vu30 vu30Var, j2i j2iVar, boolean z, ch7 ch7Var, boolean z2, b0k b0kVar, int i) {
        int i2;
        ch7 ch7Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1843608865);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.i(cr00Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(vu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(j2iVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(ch7Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.h(z2) ? 131072 : 65536;
        }
        int i3 = i2;
        if (x340Var.Y(i3 & 1, (i3 & 74899) != 74898)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarB = uyn1.B(u291.f(nim0Var, 1.0f), 16.0f, 0.0f, 16.0f, 0.0f, 10);
            era eraVar = een.P0;
            f36 f36Var = h36.c;
            mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z3 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z3) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarF);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            qim0 qim0VarO = sto1.o(u291.r(uyn1.B(nim0Var, 0.0f, 16.0f, 0.0f, 16.0f, 5), 88.0f), 10.0f, er31.b(4.0f), false, 0L, 0L, 28);
            mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarO);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            Uri uri = Uri.parse(cr00Var.d);
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            int i4 = i3 & 14;
            fwx fwxVarG = hso1.G(box.c, 0L, u7h.b(bth.n(cr00Var, x340Var), 1.0f, 0.0f, 0.0f, 0.0f, 14), x340Var, box.d, 22);
            eso1.e(uri, isl.a, qim0VarD, (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, new pux(fwxVarG, fwxVarG), false, false, x340Var, 1073744944, 0, 3568);
            x340Var = x340Var;
            x340Var.r(true);
            qim0 qim0VarB2 = uyn1.B(nim0Var, 16.0f, 8.0f, 0.0f, 0.0f, 12);
            mbh mbhVarA3 = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode4 = Long.hashCode(x340Var.T);
            xos0 xos0VarM4 = x340Var.m();
            qim0 qim0VarE4 = zr7.E(x340Var, qim0VarB2);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA3, x340Var, lljVar);
            nko1.H(xos0VarM4, x340Var, lljVar2);
            x0d.q(iHashCode4, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE4, x340Var, lljVar4);
            if (vu30Var == null) {
                x340Var.i0(503917979);
            } else {
                c13.o(x340Var, 503917980, 0, vu30Var, x340Var);
            }
            x340Var.r(false);
            x340Var.r(true);
            x340Var.r(true);
            if (ch7Var != null) {
                x340Var.i0(599897173);
                ch7Var2 = ch7Var;
                o(ch7Var2, x340Var, (i3 >> 12) & 14);
                x340Var.r(false);
            } else {
                ch7Var2 = ch7Var;
                x340Var.i0(599976595);
                int i5 = i3 >> 3;
                bth.g(cr00Var, j2iVar, z, false, false, (qim0) null, false, z2, x340Var, i4 | 27648 | (i5 & 112) | (i5 & 896) | (29360128 & (i3 << 6)), 96);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            ch7Var2 = ch7Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ybi0(cr00Var, vu30Var, j2iVar, z, ch7Var2, z2, i, (byte) 1);
        }
    }

    public static final void q(cr00 cr00Var, vu30 vu30Var, j2i j2iVar, boolean z, ch7 ch7Var, boolean z2, b0k b0kVar, int i) {
        int i2;
        ch7 ch7Var2;
        vu30 vu30Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(737944571);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.i(cr00Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(vu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(j2iVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(ch7Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.h(z2) ? 131072 : 65536;
        }
        int i3 = i2;
        if (x340Var.Y(i3 & 1, (i3 & 74899) != 74898)) {
            era eraVar = een.P0;
            f36 f36Var = h36.c;
            mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, nim0Var);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z3 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z3) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            qim0 qim0VarO = sto1.o(u291.r(uyn1.B(nim0Var, 16.0f, 16.0f, 0.0f, 8.0f, 4), 88.0f), 10.0f, er31.b(4.0f), false, 0L, 0L, 28);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarO);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            Uri uri = Uri.parse(cr00Var.d);
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            int i4 = i3 & 14;
            fwx fwxVarG = hso1.G(box.c, 0L, u7h.b(bth.n(cr00Var, x340Var), 1.0f, 0.0f, 0.0f, 0.0f, 14), x340Var, box.d, 22);
            eso1.e(uri, isl.a, qim0VarD, (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, new pux(fwxVarG, fwxVarG), false, false, x340Var, 1073741872, 0, 3576);
            x340Var = x340Var;
            x340Var.r(true);
            qim0 qim0VarB = uyn1.B(u291.f(nim0Var, 1.0f), 16.0f, 0.0f, 16.0f, 0.0f, 10);
            mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarB);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            if (vu30Var == null) {
                x340Var.i0(-1655111322);
                x340Var.r(false);
                vu30Var2 = vu30Var;
            } else {
                vu30Var2 = vu30Var;
                c13.o(x340Var, -1655111321, 0, vu30Var2, x340Var);
                x340Var.r(false);
            }
            if (ch7Var != null) {
                x340Var.i0(-1655054963);
                ch7Var2 = ch7Var;
                o(ch7Var2, x340Var, (i3 >> 12) & 14);
                x340Var.r(false);
            } else {
                ch7Var2 = ch7Var;
                x340Var.i0(-1654971170);
                int i5 = i3 >> 3;
                bth.g(cr00Var, j2iVar, z, false, true, (qim0) null, false, z2, x340Var, i4 | 27648 | (i5 & 112) | (i5 & 896) | (29360128 & (i3 << 6)), 96);
                x340Var.r(false);
            }
            x340Var.r(true);
            x340Var.r(true);
        } else {
            ch7Var2 = ch7Var;
            vu30Var2 = vu30Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ybi0(cr00Var, vu30Var2, j2iVar, z, ch7Var2, z2, i, (byte) 2);
        }
    }

    public static final void r(vu30 vu30Var, vu30 vu30Var2, j2i j2iVar, b0k b0kVar, int i) {
        int i2;
        vu30 vu30Var3;
        vu30 vu30Var4;
        j2i j2iVar2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2110240691);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(vu30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(vu30Var2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(j2iVar) ? 256 : 128;
        }
        int i3 = i & 3072;
        nim0 nim0Var = nim0.a;
        if (i3 == 0) {
            i2 |= x340Var.i(nim0Var) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            vu30Var3 = vu30Var;
            vu30Var4 = vu30Var2;
            j2iVar2 = j2iVar;
            t(j2iVar2, nim0Var, vu30Var3, null, null, null, vu30Var4, false, x340Var, ((i2 >> 6) & 126) | ((i2 << 6) & 896) | ((i2 << 18) & 29360128), 376);
        } else {
            vu30Var3 = vu30Var;
            vu30Var4 = vu30Var2;
            j2iVar2 = j2iVar;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jmk0(vu30Var3, vu30Var4, j2iVar2, i);
        }
    }

    public static final void s(s32 s32Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-619100169);
        int i2 = i | (b0kVar2.i(s32Var) ? 4 : 2) | (b0kVar2.i(function0) ? 32 : 16) | 384;
        if (b0kVar2.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar2).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarF);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarP = x0d.p(lhc.g(b0kVar2).g, 32, qim0VarZ);
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarP);
            hzj.A.getClass();
            if (((x340) b0kVar2).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(hmb0.t1);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA, b0kVar2, y580.O0);
            nko1.H(xos0VarM, b0kVar2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
            nko1.F(b0kVar2);
            nko1.H(qim0VarE, b0kVar2, y580.Y);
            uwo1.e(ydh.g(cbx.b(b0kVar2).b.a, 2131952008, b0kVar2, b0kVar2, qim0Var3), u291.f(qim0Var3, 1.0f), cbx.d(b0kVar2).e, 0L, new a0e1(3), null, 0, false, null, 0, null, b0kVar2, 0, 0, 2024);
            cvx cvxVar2 = cbx.b(b0kVar2).b;
            uwo1.e(ydh.g(12.0f, 2131952007, b0kVar2, b0kVar2, qim0Var3), u291.f(qim0Var3, 1.0f), cbx.d(b0kVar2).j, cbx.a(b0kVar2).b.b, new a0e1(3), null, 0, false, null, 0, null, b0kVar2, 0, 0, 2016);
            uwo1.e(ydh.g(cbx.b(b0kVar2).b.a, 2131952006, b0kVar2, b0kVar2, qim0Var3), null, cbx.d(b0kVar2).k, 0L, null, null, 0, false, null, 0, null, b0kVar2, 0, 0, 2042);
            cvx cvxVar3 = cbx.b(b0kVar2).b;
            uwo1.e(ydh.g(12.0f, 2131952005, b0kVar2, b0kVar2, qim0Var3), null, cbx.d(b0kVar2).j, cbx.a(b0kVar2).b.b, null, null, 0, false, null, 0, null, b0kVar2, 0, 0, 2034);
            uwo1.e(cwl1.o0(b0kVar2, s32Var.c), null, cbx.d(b0kVar2).g, 0L, null, null, 0, false, null, 0, null, b0kVar2, 0, 0, 2042);
            op71.g(b0kVar2, u291.h(qim0Var3, cbx.b(b0kVar2).b.c));
            boolean z = (i2 & 112) == 32;
            Object objT = b0kVar2.T();
            if (z || objT == fkj0.X) {
                objT = new pt61(function0, (byte) 29);
                b0kVar2.s0(objT);
            }
            foo1.c(new gbx(z50.c, (Function0) objT), new idx(4), new tq60(een.Q0), null, null, null, null, null, null, null, plj.a, b0kVar2, 0, 48, 2040);
            b0kVar2 = b0kVar2;
            x0d.s(qim0Var3, cbx.b(b0kVar2).b.a, b0kVar2, true);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new qm71(s32Var, function0, qim0Var2, i, (byte) 27);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0135  */
    /* JADX WARN: Code duplicated, block: B:102:0x0137  */
    /* JADX WARN: Code duplicated, block: B:105:0x0143 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:106:0x0145  */
    /* JADX WARN: Code duplicated, block: B:109:0x0161  */
    /* JADX WARN: Code duplicated, block: B:110:0x0163  */
    /* JADX WARN: Code duplicated, block: B:113:0x016f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:114:0x0171  */
    /* JADX WARN: Code duplicated, block: B:117:0x019d  */
    /* JADX WARN: Code duplicated, block: B:119:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:121:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:124:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:125:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:128:0x020d  */
    /* JADX WARN: Code duplicated, block: B:129:0x021d  */
    /* JADX WARN: Code duplicated, block: B:131:0x0241  */
    /* JADX WARN: Code duplicated, block: B:132:0x0245  */
    /* JADX WARN: Code duplicated, block: B:136:0x026e  */
    /* JADX WARN: Code duplicated, block: B:137:0x0278  */
    /* JADX WARN: Code duplicated, block: B:139:0x0287  */
    /* JADX WARN: Code duplicated, block: B:140:0x0294  */
    /* JADX WARN: Code duplicated, block: B:142:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:143:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:146:0x02db  */
    /* JADX WARN: Code duplicated, block: B:147:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:150:0x0305  */
    /* JADX WARN: Code duplicated, block: B:151:0x0315  */
    /* JADX WARN: Code duplicated, block: B:153:0x034e  */
    /* JADX WARN: Code duplicated, block: B:156:0x037f  */
    /* JADX WARN: Code duplicated, block: B:157:0x0383  */
    /* JADX WARN: Code duplicated, block: B:161:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:163:0x03af  */
    /* JADX WARN: Code duplicated, block: B:166:0x03be  */
    /* JADX WARN: Code duplicated, block: B:168:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x008a  */
    /* JADX WARN: Code duplicated, block: B:49:0x008f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0095  */
    /* JADX WARN: Code duplicated, block: B:53:0x009b  */
    /* JADX WARN: Code duplicated, block: B:54:0x009e  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ee A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:91:0x0108  */
    /* JADX WARN: Code duplicated, block: B:94:0x0118  */
    /* JADX WARN: Code duplicated, block: B:97:0x0124  */
    /* JADX WARN: Code duplicated, block: B:98:0x0127  */
    public static final void t(j2i j2iVar, qim0 qim0Var, vu30 vu30Var, vu30 vu30Var2, vu30 vu30Var3, vu30 vu30Var4, vu30 vu30Var5, boolean z, b0k b0kVar, int i, int i2) {
        int i3;
        vu30 vu30Var6;
        int i4;
        vu30 vu30Var7;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z2;
        vu30 vu30Var8;
        boolean z3;
        vu30 vu30Var9;
        vu30 vu30Var10;
        h311 h311VarV;
        vu30 vu30Var11;
        boolean z4;
        Object objT;
        m4c m4cVar;
        j5c j5cVar;
        Object objT2;
        j5c j5cVar2;
        boolean z5;
        int i11;
        boolean z6;
        boolean zI;
        Object objT3;
        boolean z7;
        boolean zI2;
        Object objT4;
        gra graVar;
        gfh0 gfh0VarC;
        boolean z8;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        boolean z9;
        n4k n4kVar;
        llj lljVar;
        llj lljVar2;
        llj lljVar3;
        llj lljVar4;
        vu30 vu30Var12;
        vu30 vu30Var13;
        nim0 nim0Var;
        Integer num;
        boolean z10;
        vu30 vu30Var14;
        boolean z11;
        Object objT5;
        boolean z12;
        int i12;
        vu30 vu30Var15 = vu30Var5;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-48699803);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i3 = (x340Var.i(j2iVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var.i(vu30Var) ? 256 : 128;
        }
        int i13 = i2 & 8;
        if (i13 == 0) {
            if ((i & 3072) == 0) {
                vu30Var6 = vu30Var2;
                i3 |= x340Var.i(vu30Var6) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    vu30Var7 = vu30Var3;
                    if (x340Var.i(vu30Var7)) {
                        i5 = 16384;
                    } else {
                        i5 = 8192;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    i3 |= 196608;
                } else if ((i & 196608) == 0) {
                    if (x340Var.i(vu30Var4)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                i8 = i3 | 1572864;
                if ((i & 12582912) == 0) {
                    if (x340Var.i(vu30Var15)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                    i8 |= i12;
                }
                i9 = i2 & 256;
                if (i9 != 0) {
                    i8 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (x340Var.h(z)) {
                        i10 = 67108864;
                    } else {
                        i10 = 33554432;
                    }
                    i8 |= i10;
                }
                if ((i8 & 38347923) != 38347922) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (x340Var.Y(i8 & 1, z2)) {
                    if (i13 != 0) {
                        vu30Var6 = null;
                    }
                    if (i4 != 0) {
                        vu30Var7 = null;
                    }
                    if (i6 != 0) {
                        vu30Var11 = null;
                    } else {
                        vu30Var11 = vu30Var4;
                    }
                    if (i9 != 0) {
                        z4 = false;
                    } else {
                        z4 = z;
                    }
                    objT = x340Var.T();
                    m4cVar = fkj0.X;
                    if (objT == m4cVar) {
                        objT = new j5c();
                        x340Var.s0(objT);
                    }
                    j5cVar = (j5c) objT;
                    objT2 = x340Var.T();
                    if (objT2 == m4cVar) {
                        objT2 = new j5c();
                        x340Var.s0(objT2);
                    }
                    j5cVar2 = (j5c) objT2;
                    if (vu30Var != null) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    Boolean boolValueOf = Boolean.valueOf(z5);
                    i11 = i8;
                    if ((i8 & 896) == 256) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    zI = z6 | x340Var.i(j5cVar);
                    objT3 = x340Var.T();
                    if (zI || objT3 == m4cVar) {
                        objT3 = new k53(vu30Var, j5cVar, (lnm) null, (byte) 22);
                        x340Var.s0(objT3);
                    }
                    qxd0.t(boolValueOf, x340Var, (vu30) objT3);
                    Boolean boolValueOf2 = Boolean.valueOf(z4);
                    if ((i11 & 234881024) == 67108864) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    zI2 = z7 | x340Var.i(j5cVar2);
                    objT4 = x340Var.T();
                    if (zI2 || objT4 == m4cVar) {
                        objT4 = new wbs0(z4, j5cVar2, (lnm) null);
                        x340Var.s0(objT4);
                    }
                    qxd0.t(boolValueOf2, x340Var, (vu30) objT4);
                    graVar = een.d;
                    gfh0VarC = t1c.c(graVar, false);
                    z8 = z4;
                    iHashCode = Long.hashCode(x340Var.T);
                    xos0VarM = x340Var.m();
                    qim0VarE = zr7.E(x340Var, qim0Var);
                    hzj.A.getClass();
                    if (j06Var != null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.m0();
                    z9 = x340Var.S;
                    n4kVar = hmb0.t1;
                    if (z9) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    lljVar = y580.O0;
                    nko1.H(gfh0VarC, x340Var, lljVar);
                    lljVar2 = y580.N0;
                    nko1.H(xos0VarM, x340Var, lljVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    lljVar3 = y580.R0;
                    nko1.H(numValueOf, x340Var, lljVar3);
                    nko1.F(x340Var);
                    lljVar4 = y580.Y;
                    nko1.H(qim0VarE, x340Var, lljVar4);
                    vu30Var12 = vu30Var11;
                    vu30Var13 = vu30Var6;
                    mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
                    int iHashCode2 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM2 = x340Var.m();
                    nim0Var = nim0.a;
                    qim0 qim0VarE2 = zr7.E(x340Var, nim0Var);
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(mbhVarA, x340Var, lljVar);
                    nko1.H(xos0VarM2, x340Var, lljVar2);
                    x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
                    nko1.H(qim0VarE2, x340Var, lljVar4);
                    if (vu30Var == null) {
                        x340Var.i0(580573686);
                        x340Var.r(false);
                        num = 0;
                        z10 = false;
                    } else {
                        x340Var.i0(580573687);
                        qim0 qim0VarN = aym.n(nim0Var, j5cVar);
                        gfh0 gfh0VarC2 = t1c.c(graVar, false);
                        int iHashCode3 = Long.hashCode(x340Var.T);
                        xos0 xos0VarM3 = x340Var.m();
                        qim0 qim0VarE3 = zr7.E(x340Var, qim0VarN);
                        x340Var.m0();
                        if (x340Var.S) {
                            x340Var.l(n4kVar);
                        } else {
                            x340Var.v0();
                        }
                        nko1.H(gfh0VarC2, x340Var, lljVar);
                        nko1.H(xos0VarM3, x340Var, lljVar2);
                        x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
                        nko1.H(qim0VarE3, x340Var, lljVar4);
                        num = 0;
                        vu30Var.invoke(x340Var, (Object) null);
                        x340Var.r(true);
                        z10 = false;
                        x340Var.r(false);
                    }
                    j2iVar.invoke(x340Var, Integer.valueOf(i11 & 14));
                    if (vu30Var7 == null) {
                        x340Var.i0(580684728);
                        x340Var.r(z10);
                    } else {
                        x340Var.i0(-396910231);
                        us71.j((i11 >> 12) & 14, vu30Var7, x340Var, z10);
                    }
                    if (vu30Var13 == null) {
                        x340Var.i0(580713744);
                        x340Var.r(z10);
                        vu30Var14 = vu30Var13;
                        z11 = z10;
                    } else {
                        x340Var.i0(580713745);
                        qim0 qim0VarN2 = aym.n(nim0Var, j5cVar2);
                        gfh0 gfh0VarC3 = t1c.c(graVar, z10);
                        int iHashCode4 = Long.hashCode(x340Var.T);
                        xos0 xos0VarM4 = x340Var.m();
                        qim0 qim0VarE4 = zr7.E(x340Var, qim0VarN2);
                        x340Var.m0();
                        if (x340Var.S) {
                            x340Var.l(n4kVar);
                        } else {
                            x340Var.v0();
                        }
                        nko1.H(gfh0VarC3, x340Var, lljVar);
                        nko1.H(xos0VarM4, x340Var, lljVar2);
                        x0d.q(iHashCode4, x340Var, lljVar3, x340Var);
                        nko1.H(qim0VarE4, x340Var, lljVar4);
                        vu30Var14 = vu30Var13;
                        vu30Var14.invoke(x340Var, num);
                        x340Var.r(true);
                        z11 = false;
                        x340Var.r(false);
                    }
                    if (vu30Var12 == null) {
                        x340Var.i0(580802776);
                        x340Var.r(z11);
                        vu30Var8 = vu30Var12;
                    } else {
                        x340Var.i0(-396906423);
                        vu30Var8 = vu30Var12;
                        us71.j((i11 >> 15) & 14, vu30Var8, x340Var, z11);
                    }
                    x340Var.i0(580831544);
                    x340Var.r(z11);
                    x340Var.r(true);
                    if (vu30Var5 == null) {
                        x340Var.i0(1672025589);
                        x340Var.r(z11);
                        vu30Var15 = vu30Var5;
                        z12 = true;
                    } else {
                        x340Var.i0(1672025590);
                        gra graVar2 = een.h;
                        uwr uwrVar = cbx.a;
                        qim0 qim0VarB = h2c.a.b(dug.f(nim0Var, u7h.b(cbx.a(x340Var).a.c, 0.6f, 0.0f, 0.0f, 0.0f, 14), d4o1.a));
                        objT5 = x340Var.T();
                        if (objT5 == m4cVar) {
                            objT5 = v0r0.T0;
                            x340Var.s0(objT5);
                        }
                        qim0 qim0VarX = bin.x(qim0VarB, false, null, null, null, (Function0) objT5, 15);
                        gfh0 gfh0VarC4 = t1c.c(graVar2, false);
                        int iHashCode5 = Long.hashCode(x340Var.T);
                        xos0 xos0VarM5 = x340Var.m();
                        qim0 qim0VarE5 = zr7.E(x340Var, qim0VarX);
                        x340Var.m0();
                        if (x340Var.S) {
                            x340Var.l(n4kVar);
                        } else {
                            x340Var.v0();
                        }
                        nko1.H(gfh0VarC4, x340Var, lljVar);
                        nko1.H(xos0VarM5, x340Var, lljVar2);
                        x0d.q(iHashCode5, x340Var, lljVar3, x340Var);
                        nko1.H(qim0VarE5, x340Var, lljVar4);
                        vu30Var15 = vu30Var5;
                        vu30Var15.invoke(x340Var, num);
                        z12 = true;
                        x340Var.r(true);
                        x340Var.r(false);
                    }
                    x340Var.r(z12);
                    z3 = z8;
                    vu30Var9 = vu30Var14;
                } else {
                    x340Var.b0();
                    vu30Var8 = vu30Var4;
                    z3 = z;
                    vu30Var9 = vu30Var6;
                }
                vu30Var10 = vu30Var7;
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new s2g(j2iVar, qim0Var, vu30Var, vu30Var9, vu30Var10, vu30Var8, vu30Var15, z3, i, i2);
                }
            }
            i3 |= 24576;
            vu30Var7 = vu30Var3;
            i6 = i2 & 32;
            if (i6 != 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                if (x340Var.i(vu30Var4)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            i8 = i3 | 1572864;
            if ((i & 12582912) == 0) {
                if (x340Var.i(vu30Var15)) {
                    i12 = 8388608;
                } else {
                    i12 = 4194304;
                }
                i8 |= i12;
            }
            i9 = i2 & 256;
            if (i9 != 0) {
                i8 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (x340Var.h(z)) {
                    i10 = 67108864;
                } else {
                    i10 = 33554432;
                }
                i8 |= i10;
            }
            if ((i8 & 38347923) != 38347922) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (x340Var.Y(i8 & 1, z2)) {
                if (i13 != 0) {
                    vu30Var6 = null;
                }
                if (i4 != 0) {
                    vu30Var7 = null;
                }
                if (i6 != 0) {
                    vu30Var11 = null;
                } else {
                    vu30Var11 = vu30Var4;
                }
                if (i9 != 0) {
                    z4 = false;
                } else {
                    z4 = z;
                }
                objT = x340Var.T();
                m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = new j5c();
                    x340Var.s0(objT);
                }
                j5cVar = (j5c) objT;
                objT2 = x340Var.T();
                if (objT2 == m4cVar) {
                    objT2 = new j5c();
                    x340Var.s0(objT2);
                }
                j5cVar2 = (j5c) objT2;
                if (vu30Var != null) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                Boolean boolValueOf3 = Boolean.valueOf(z5);
                i11 = i8;
                if ((i8 & 896) == 256) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                zI = z6 | x340Var.i(j5cVar);
                objT3 = x340Var.T();
                if (zI) {
                    objT3 = new k53(vu30Var, j5cVar, (lnm) null, (byte) 22);
                    x340Var.s0(objT3);
                } else {
                    objT3 = new k53(vu30Var, j5cVar, (lnm) null, (byte) 22);
                    x340Var.s0(objT3);
                }
                qxd0.t(boolValueOf3, x340Var, (vu30) objT3);
                Boolean boolValueOf4 = Boolean.valueOf(z4);
                if ((i11 & 234881024) == 67108864) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                zI2 = z7 | x340Var.i(j5cVar2);
                objT4 = x340Var.T();
                if (zI2) {
                    objT4 = new wbs0(z4, j5cVar2, (lnm) null);
                    x340Var.s0(objT4);
                } else {
                    objT4 = new wbs0(z4, j5cVar2, (lnm) null);
                    x340Var.s0(objT4);
                }
                qxd0.t(boolValueOf4, x340Var, (vu30) objT4);
                graVar = een.d;
                gfh0VarC = t1c.c(graVar, false);
                z8 = z4;
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0Var);
                hzj.A.getClass();
                if (j06Var != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                z9 = x340Var.S;
                n4kVar = hmb0.t1;
                if (z9) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                lljVar = y580.O0;
                nko1.H(gfh0VarC, x340Var, lljVar);
                lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var, lljVar2);
                Integer numValueOf2 = Integer.valueOf(iHashCode);
                lljVar3 = y580.R0;
                nko1.H(numValueOf2, x340Var, lljVar3);
                nko1.F(x340Var);
                lljVar4 = y580.Y;
                nko1.H(qim0VarE, x340Var, lljVar4);
                vu30Var12 = vu30Var11;
                vu30Var13 = vu30Var6;
                mbh mbhVarA2 = jbh.a(h36.c, een.P0, x340Var, 0);
                int iHashCode6 = Long.hashCode(x340Var.T);
                xos0 xos0VarM6 = x340Var.m();
                nim0Var = nim0.a;
                qim0 qim0VarE6 = zr7.E(x340Var, nim0Var);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(mbhVarA2, x340Var, lljVar);
                nko1.H(xos0VarM6, x340Var, lljVar2);
                x0d.q(iHashCode6, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE6, x340Var, lljVar4);
                if (vu30Var == null) {
                    x340Var.i0(580573686);
                    x340Var.r(false);
                    num = 0;
                    z10 = false;
                } else {
                    x340Var.i0(580573687);
                    qim0 qim0VarN3 = aym.n(nim0Var, j5cVar);
                    gfh0 gfh0VarC5 = t1c.c(graVar, false);
                    int iHashCode7 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM7 = x340Var.m();
                    qim0 qim0VarE7 = zr7.E(x340Var, qim0VarN3);
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0VarC5, x340Var, lljVar);
                    nko1.H(xos0VarM7, x340Var, lljVar2);
                    x0d.q(iHashCode7, x340Var, lljVar3, x340Var);
                    nko1.H(qim0VarE7, x340Var, lljVar4);
                    num = 0;
                    vu30Var.invoke(x340Var, (Object) null);
                    x340Var.r(true);
                    z10 = false;
                    x340Var.r(false);
                }
                j2iVar.invoke(x340Var, Integer.valueOf(i11 & 14));
                if (vu30Var7 == null) {
                    x340Var.i0(580684728);
                    x340Var.r(z10);
                } else {
                    x340Var.i0(-396910231);
                    us71.j((i11 >> 12) & 14, vu30Var7, x340Var, z10);
                }
                if (vu30Var13 == null) {
                    x340Var.i0(580713744);
                    x340Var.r(z10);
                    vu30Var14 = vu30Var13;
                    z11 = z10;
                } else {
                    x340Var.i0(580713745);
                    qim0 qim0VarN4 = aym.n(nim0Var, j5cVar2);
                    gfh0 gfh0VarC6 = t1c.c(graVar, z10);
                    int iHashCode8 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM8 = x340Var.m();
                    qim0 qim0VarE8 = zr7.E(x340Var, qim0VarN4);
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0VarC6, x340Var, lljVar);
                    nko1.H(xos0VarM8, x340Var, lljVar2);
                    x0d.q(iHashCode8, x340Var, lljVar3, x340Var);
                    nko1.H(qim0VarE8, x340Var, lljVar4);
                    vu30Var14 = vu30Var13;
                    vu30Var14.invoke(x340Var, num);
                    x340Var.r(true);
                    z11 = false;
                    x340Var.r(false);
                }
                if (vu30Var12 == null) {
                    x340Var.i0(580802776);
                    x340Var.r(z11);
                    vu30Var8 = vu30Var12;
                } else {
                    x340Var.i0(-396906423);
                    vu30Var8 = vu30Var12;
                    us71.j((i11 >> 15) & 14, vu30Var8, x340Var, z11);
                }
                x340Var.i0(580831544);
                x340Var.r(z11);
                x340Var.r(true);
                if (vu30Var5 == null) {
                    x340Var.i0(1672025589);
                    x340Var.r(z11);
                    vu30Var15 = vu30Var5;
                    z12 = true;
                } else {
                    x340Var.i0(1672025590);
                    gra graVar3 = een.h;
                    uwr uwrVar2 = cbx.a;
                    qim0 qim0VarB2 = h2c.a.b(dug.f(nim0Var, u7h.b(cbx.a(x340Var).a.c, 0.6f, 0.0f, 0.0f, 0.0f, 14), d4o1.a));
                    objT5 = x340Var.T();
                    if (objT5 == m4cVar) {
                        objT5 = v0r0.T0;
                        x340Var.s0(objT5);
                    }
                    qim0 qim0VarX2 = bin.x(qim0VarB2, false, null, null, null, (Function0) objT5, 15);
                    gfh0 gfh0VarC7 = t1c.c(graVar3, false);
                    int iHashCode9 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM9 = x340Var.m();
                    qim0 qim0VarE9 = zr7.E(x340Var, qim0VarX2);
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0VarC7, x340Var, lljVar);
                    nko1.H(xos0VarM9, x340Var, lljVar2);
                    x0d.q(iHashCode9, x340Var, lljVar3, x340Var);
                    nko1.H(qim0VarE9, x340Var, lljVar4);
                    vu30Var15 = vu30Var5;
                    vu30Var15.invoke(x340Var, num);
                    z12 = true;
                    x340Var.r(true);
                    x340Var.r(false);
                }
                x340Var.r(z12);
                z3 = z8;
                vu30Var9 = vu30Var14;
            } else {
                x340Var.b0();
                vu30Var8 = vu30Var4;
                z3 = z;
                vu30Var9 = vu30Var6;
            }
            vu30Var10 = vu30Var7;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new s2g(j2iVar, qim0Var, vu30Var, vu30Var9, vu30Var10, vu30Var8, vu30Var15, z3, i, i2);
            }
        }
        i3 |= 3072;
        vu30Var6 = vu30Var2;
        i4 = i2 & 16;
        if (i4 != 0) {
            if ((i & 24576) == 0) {
                vu30Var7 = vu30Var3;
                if (x340Var.i(vu30Var7)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i3 |= i5;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                if (x340Var.i(vu30Var4)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            i8 = i3 | 1572864;
            if ((i & 12582912) == 0) {
                if (x340Var.i(vu30Var15)) {
                    i12 = 8388608;
                } else {
                    i12 = 4194304;
                }
                i8 |= i12;
            }
            i9 = i2 & 256;
            if (i9 != 0) {
                i8 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (x340Var.h(z)) {
                    i10 = 67108864;
                } else {
                    i10 = 33554432;
                }
                i8 |= i10;
            }
            if ((i8 & 38347923) != 38347922) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (x340Var.Y(i8 & 1, z2)) {
                if (i13 != 0) {
                    vu30Var6 = null;
                }
                if (i4 != 0) {
                    vu30Var7 = null;
                }
                if (i6 != 0) {
                    vu30Var11 = null;
                } else {
                    vu30Var11 = vu30Var4;
                }
                if (i9 != 0) {
                    z4 = false;
                } else {
                    z4 = z;
                }
                objT = x340Var.T();
                m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = new j5c();
                    x340Var.s0(objT);
                }
                j5cVar = (j5c) objT;
                objT2 = x340Var.T();
                if (objT2 == m4cVar) {
                    objT2 = new j5c();
                    x340Var.s0(objT2);
                }
                j5cVar2 = (j5c) objT2;
                if (vu30Var != null) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                Boolean boolValueOf5 = Boolean.valueOf(z5);
                i11 = i8;
                if ((i8 & 896) == 256) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                zI = z6 | x340Var.i(j5cVar);
                objT3 = x340Var.T();
                if (zI) {
                    objT3 = new k53(vu30Var, j5cVar, (lnm) null, (byte) 22);
                    x340Var.s0(objT3);
                } else {
                    objT3 = new k53(vu30Var, j5cVar, (lnm) null, (byte) 22);
                    x340Var.s0(objT3);
                }
                qxd0.t(boolValueOf5, x340Var, (vu30) objT3);
                Boolean boolValueOf6 = Boolean.valueOf(z4);
                if ((i11 & 234881024) == 67108864) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                zI2 = z7 | x340Var.i(j5cVar2);
                objT4 = x340Var.T();
                if (zI2) {
                    objT4 = new wbs0(z4, j5cVar2, (lnm) null);
                    x340Var.s0(objT4);
                } else {
                    objT4 = new wbs0(z4, j5cVar2, (lnm) null);
                    x340Var.s0(objT4);
                }
                qxd0.t(boolValueOf6, x340Var, (vu30) objT4);
                graVar = een.d;
                gfh0VarC = t1c.c(graVar, false);
                z8 = z4;
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0Var);
                hzj.A.getClass();
                if (j06Var != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                z9 = x340Var.S;
                n4kVar = hmb0.t1;
                if (z9) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                lljVar = y580.O0;
                nko1.H(gfh0VarC, x340Var, lljVar);
                lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var, lljVar2);
                Integer numValueOf3 = Integer.valueOf(iHashCode);
                lljVar3 = y580.R0;
                nko1.H(numValueOf3, x340Var, lljVar3);
                nko1.F(x340Var);
                lljVar4 = y580.Y;
                nko1.H(qim0VarE, x340Var, lljVar4);
                vu30Var12 = vu30Var11;
                vu30Var13 = vu30Var6;
                mbh mbhVarA3 = jbh.a(h36.c, een.P0, x340Var, 0);
                int iHashCode10 = Long.hashCode(x340Var.T);
                xos0 xos0VarM10 = x340Var.m();
                nim0Var = nim0.a;
                qim0 qim0VarE10 = zr7.E(x340Var, nim0Var);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(mbhVarA3, x340Var, lljVar);
                nko1.H(xos0VarM10, x340Var, lljVar2);
                x0d.q(iHashCode10, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE10, x340Var, lljVar4);
                if (vu30Var == null) {
                    x340Var.i0(580573686);
                    x340Var.r(false);
                    num = 0;
                    z10 = false;
                } else {
                    x340Var.i0(580573687);
                    qim0 qim0VarN5 = aym.n(nim0Var, j5cVar);
                    gfh0 gfh0VarC8 = t1c.c(graVar, false);
                    int iHashCode11 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM11 = x340Var.m();
                    qim0 qim0VarE11 = zr7.E(x340Var, qim0VarN5);
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0VarC8, x340Var, lljVar);
                    nko1.H(xos0VarM11, x340Var, lljVar2);
                    x0d.q(iHashCode11, x340Var, lljVar3, x340Var);
                    nko1.H(qim0VarE11, x340Var, lljVar4);
                    num = 0;
                    vu30Var.invoke(x340Var, (Object) null);
                    x340Var.r(true);
                    z10 = false;
                    x340Var.r(false);
                }
                j2iVar.invoke(x340Var, Integer.valueOf(i11 & 14));
                if (vu30Var7 == null) {
                    x340Var.i0(580684728);
                    x340Var.r(z10);
                } else {
                    x340Var.i0(-396910231);
                    us71.j((i11 >> 12) & 14, vu30Var7, x340Var, z10);
                }
                if (vu30Var13 == null) {
                    x340Var.i0(580713744);
                    x340Var.r(z10);
                    vu30Var14 = vu30Var13;
                    z11 = z10;
                } else {
                    x340Var.i0(580713745);
                    qim0 qim0VarN6 = aym.n(nim0Var, j5cVar2);
                    gfh0 gfh0VarC9 = t1c.c(graVar, z10);
                    int iHashCode12 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM12 = x340Var.m();
                    qim0 qim0VarE12 = zr7.E(x340Var, qim0VarN6);
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0VarC9, x340Var, lljVar);
                    nko1.H(xos0VarM12, x340Var, lljVar2);
                    x0d.q(iHashCode12, x340Var, lljVar3, x340Var);
                    nko1.H(qim0VarE12, x340Var, lljVar4);
                    vu30Var14 = vu30Var13;
                    vu30Var14.invoke(x340Var, num);
                    x340Var.r(true);
                    z11 = false;
                    x340Var.r(false);
                }
                if (vu30Var12 == null) {
                    x340Var.i0(580802776);
                    x340Var.r(z11);
                    vu30Var8 = vu30Var12;
                } else {
                    x340Var.i0(-396906423);
                    vu30Var8 = vu30Var12;
                    us71.j((i11 >> 15) & 14, vu30Var8, x340Var, z11);
                }
                x340Var.i0(580831544);
                x340Var.r(z11);
                x340Var.r(true);
                if (vu30Var5 == null) {
                    x340Var.i0(1672025589);
                    x340Var.r(z11);
                    vu30Var15 = vu30Var5;
                    z12 = true;
                } else {
                    x340Var.i0(1672025590);
                    gra graVar4 = een.h;
                    uwr uwrVar3 = cbx.a;
                    qim0 qim0VarB3 = h2c.a.b(dug.f(nim0Var, u7h.b(cbx.a(x340Var).a.c, 0.6f, 0.0f, 0.0f, 0.0f, 14), d4o1.a));
                    objT5 = x340Var.T();
                    if (objT5 == m4cVar) {
                        objT5 = v0r0.T0;
                        x340Var.s0(objT5);
                    }
                    qim0 qim0VarX3 = bin.x(qim0VarB3, false, null, null, null, (Function0) objT5, 15);
                    gfh0 gfh0VarC10 = t1c.c(graVar4, false);
                    int iHashCode13 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM13 = x340Var.m();
                    qim0 qim0VarE13 = zr7.E(x340Var, qim0VarX3);
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0VarC10, x340Var, lljVar);
                    nko1.H(xos0VarM13, x340Var, lljVar2);
                    x0d.q(iHashCode13, x340Var, lljVar3, x340Var);
                    nko1.H(qim0VarE13, x340Var, lljVar4);
                    vu30Var15 = vu30Var5;
                    vu30Var15.invoke(x340Var, num);
                    z12 = true;
                    x340Var.r(true);
                    x340Var.r(false);
                }
                x340Var.r(z12);
                z3 = z8;
                vu30Var9 = vu30Var14;
            } else {
                x340Var.b0();
                vu30Var8 = vu30Var4;
                z3 = z;
                vu30Var9 = vu30Var6;
            }
            vu30Var10 = vu30Var7;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new s2g(j2iVar, qim0Var, vu30Var, vu30Var9, vu30Var10, vu30Var8, vu30Var15, z3, i, i2);
            }
        }
        i3 |= 24576;
        vu30Var7 = vu30Var3;
        i6 = i2 & 32;
        if (i6 != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            if (x340Var.i(vu30Var4)) {
                i7 = 131072;
            } else {
                i7 = 65536;
            }
            i3 |= i7;
        }
        i8 = i3 | 1572864;
        if ((i & 12582912) == 0) {
            if (x340Var.i(vu30Var15)) {
                i12 = 8388608;
            } else {
                i12 = 4194304;
            }
            i8 |= i12;
        }
        i9 = i2 & 256;
        if (i9 != 0) {
            i8 |= 100663296;
        } else if ((i & 100663296) == 0) {
            if (x340Var.h(z)) {
                i10 = 67108864;
            } else {
                i10 = 33554432;
            }
            i8 |= i10;
        }
        if ((i8 & 38347923) != 38347922) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (x340Var.Y(i8 & 1, z2)) {
            if (i13 != 0) {
                vu30Var6 = null;
            }
            if (i4 != 0) {
                vu30Var7 = null;
            }
            if (i6 != 0) {
                vu30Var11 = null;
            } else {
                vu30Var11 = vu30Var4;
            }
            if (i9 != 0) {
                z4 = false;
            } else {
                z4 = z;
            }
            objT = x340Var.T();
            m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = new j5c();
                x340Var.s0(objT);
            }
            j5cVar = (j5c) objT;
            objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = new j5c();
                x340Var.s0(objT2);
            }
            j5cVar2 = (j5c) objT2;
            if (vu30Var != null) {
                z5 = true;
            } else {
                z5 = false;
            }
            Boolean boolValueOf7 = Boolean.valueOf(z5);
            i11 = i8;
            if ((i8 & 896) == 256) {
                z6 = true;
            } else {
                z6 = false;
            }
            zI = z6 | x340Var.i(j5cVar);
            objT3 = x340Var.T();
            if (zI) {
                objT3 = new k53(vu30Var, j5cVar, (lnm) null, (byte) 22);
                x340Var.s0(objT3);
            } else {
                objT3 = new k53(vu30Var, j5cVar, (lnm) null, (byte) 22);
                x340Var.s0(objT3);
            }
            qxd0.t(boolValueOf7, x340Var, (vu30) objT3);
            Boolean boolValueOf8 = Boolean.valueOf(z4);
            if ((i11 & 234881024) == 67108864) {
                z7 = true;
            } else {
                z7 = false;
            }
            zI2 = z7 | x340Var.i(j5cVar2);
            objT4 = x340Var.T();
            if (zI2) {
                objT4 = new wbs0(z4, j5cVar2, (lnm) null);
                x340Var.s0(objT4);
            } else {
                objT4 = new wbs0(z4, j5cVar2, (lnm) null);
                x340Var.s0(objT4);
            }
            qxd0.t(boolValueOf8, x340Var, (vu30) objT4);
            graVar = een.d;
            gfh0VarC = t1c.c(graVar, false);
            z8 = z4;
            iHashCode = Long.hashCode(x340Var.T);
            xos0VarM = x340Var.m();
            qim0VarE = zr7.E(x340Var, qim0Var);
            hzj.A.getClass();
            if (j06Var != null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            z9 = x340Var.S;
            n4kVar = hmb0.t1;
            if (z9) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            lljVar = y580.O0;
            nko1.H(gfh0VarC, x340Var, lljVar);
            lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf4 = Integer.valueOf(iHashCode);
            lljVar3 = y580.R0;
            nko1.H(numValueOf4, x340Var, lljVar3);
            nko1.F(x340Var);
            lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            vu30Var12 = vu30Var11;
            vu30Var13 = vu30Var6;
            mbh mbhVarA4 = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode14 = Long.hashCode(x340Var.T);
            xos0 xos0VarM14 = x340Var.m();
            nim0Var = nim0.a;
            qim0 qim0VarE14 = zr7.E(x340Var, nim0Var);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA4, x340Var, lljVar);
            nko1.H(xos0VarM14, x340Var, lljVar2);
            x0d.q(iHashCode14, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE14, x340Var, lljVar4);
            if (vu30Var == null) {
                x340Var.i0(580573686);
                x340Var.r(false);
                num = 0;
                z10 = false;
            } else {
                x340Var.i0(580573687);
                qim0 qim0VarN7 = aym.n(nim0Var, j5cVar);
                gfh0 gfh0VarC11 = t1c.c(graVar, false);
                int iHashCode15 = Long.hashCode(x340Var.T);
                xos0 xos0VarM15 = x340Var.m();
                qim0 qim0VarE15 = zr7.E(x340Var, qim0VarN7);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC11, x340Var, lljVar);
                nko1.H(xos0VarM15, x340Var, lljVar2);
                x0d.q(iHashCode15, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE15, x340Var, lljVar4);
                num = 0;
                vu30Var.invoke(x340Var, (Object) null);
                x340Var.r(true);
                z10 = false;
                x340Var.r(false);
            }
            j2iVar.invoke(x340Var, Integer.valueOf(i11 & 14));
            if (vu30Var7 == null) {
                x340Var.i0(580684728);
                x340Var.r(z10);
            } else {
                x340Var.i0(-396910231);
                us71.j((i11 >> 12) & 14, vu30Var7, x340Var, z10);
            }
            if (vu30Var13 == null) {
                x340Var.i0(580713744);
                x340Var.r(z10);
                vu30Var14 = vu30Var13;
                z11 = z10;
            } else {
                x340Var.i0(580713745);
                qim0 qim0VarN8 = aym.n(nim0Var, j5cVar2);
                gfh0 gfh0VarC12 = t1c.c(graVar, z10);
                int iHashCode16 = Long.hashCode(x340Var.T);
                xos0 xos0VarM16 = x340Var.m();
                qim0 qim0VarE16 = zr7.E(x340Var, qim0VarN8);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC12, x340Var, lljVar);
                nko1.H(xos0VarM16, x340Var, lljVar2);
                x0d.q(iHashCode16, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE16, x340Var, lljVar4);
                vu30Var14 = vu30Var13;
                vu30Var14.invoke(x340Var, num);
                x340Var.r(true);
                z11 = false;
                x340Var.r(false);
            }
            if (vu30Var12 == null) {
                x340Var.i0(580802776);
                x340Var.r(z11);
                vu30Var8 = vu30Var12;
            } else {
                x340Var.i0(-396906423);
                vu30Var8 = vu30Var12;
                us71.j((i11 >> 15) & 14, vu30Var8, x340Var, z11);
            }
            x340Var.i0(580831544);
            x340Var.r(z11);
            x340Var.r(true);
            if (vu30Var5 == null) {
                x340Var.i0(1672025589);
                x340Var.r(z11);
                vu30Var15 = vu30Var5;
                z12 = true;
            } else {
                x340Var.i0(1672025590);
                gra graVar5 = een.h;
                uwr uwrVar4 = cbx.a;
                qim0 qim0VarB4 = h2c.a.b(dug.f(nim0Var, u7h.b(cbx.a(x340Var).a.c, 0.6f, 0.0f, 0.0f, 0.0f, 14), d4o1.a));
                objT5 = x340Var.T();
                if (objT5 == m4cVar) {
                    objT5 = v0r0.T0;
                    x340Var.s0(objT5);
                }
                qim0 qim0VarX4 = bin.x(qim0VarB4, false, null, null, null, (Function0) objT5, 15);
                gfh0 gfh0VarC13 = t1c.c(graVar5, false);
                int iHashCode17 = Long.hashCode(x340Var.T);
                xos0 xos0VarM17 = x340Var.m();
                qim0 qim0VarE17 = zr7.E(x340Var, qim0VarX4);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC13, x340Var, lljVar);
                nko1.H(xos0VarM17, x340Var, lljVar2);
                x0d.q(iHashCode17, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE17, x340Var, lljVar4);
                vu30Var15 = vu30Var5;
                vu30Var15.invoke(x340Var, num);
                z12 = true;
                x340Var.r(true);
                x340Var.r(false);
            }
            x340Var.r(z12);
            z3 = z8;
            vu30Var9 = vu30Var14;
        } else {
            x340Var.b0();
            vu30Var8 = vu30Var4;
            z3 = z;
            vu30Var9 = vu30Var6;
        }
        vu30Var10 = vu30Var7;
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new s2g(j2iVar, qim0Var, vu30Var, vu30Var9, vu30Var10, vu30Var8, vu30Var15, z3, i, i2);
        }
    }

    public static final void u(String str, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        String str2;
        int i2;
        x340 x340Var;
        iu30 iu30Var2 = iu30Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1541899225);
        j06 j06Var = x340Var2.a;
        if ((i & 6) == 0) {
            str2 = str;
            i2 = i | (x340Var2.g(str2) ? 4 : 2);
        } else {
            str2 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.i(iu30Var2) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (x340Var2.Y(i3 & 1, (i3 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var2).a.c;
            u5j1 u5j1Var = d4o1.a;
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarZ = uyn1.z(cbx.b(x340Var2).b.b, 0.0f, 2, u291.f(dug.f(qim0Var2, j, u5j1Var), 1.0f));
            cvx cvxVar = cbx.b(x340Var2).b;
            qim0 qim0VarB = uyn1.B(qim0VarZ, 0.0f, 16.0f, 0.0f, cbx.b(x340Var2).b.b, 5);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
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
            nko1.H(mbhVarA, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            qim0 qim0VarF = u291.f(qim0Var2, 1.0f);
            era eraVar = een.Q0;
            uwo1.e(cwl1.n0(2131963542, new Object[]{str2}, x340Var2), ktd.m(eraVar, qim0VarF), cbx.d(x340Var2).h, cbx.a(x340Var2).b.a, new a0e1(3), null, 0, false, null, 0, null, x340Var2, 0, 0, 2016);
            qim0 qim0VarM = ktd.m(eraVar, u291.f(qim0Var2, 1.0f));
            cvx cvxVar2 = cbx.b(x340Var2).b;
            uwo1.e(cwl1.o0(x340Var2, 2131963541), uyn1.B(qim0VarM, 0.0f, 4.0f, 0.0f, 0.0f, 13), cbx.d(x340Var2).m, cbx.a(x340Var2).b.b, new a0e1(3), null, 0, false, null, 0, null, x340Var2, 0, 0, 2016);
            qim0 qim0VarF2 = u291.f(qim0Var2, 1.0f);
            cvx cvxVar3 = cbx.b(x340Var2).b;
            qim0 qim0VarB2 = uyn1.B(qim0VarF2, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            cvx cvxVar4 = cbx.b(x340Var2).b;
            jw31 jw31VarA = ew31.a(new d36(16.0f, true, new g21(eraVar, (byte) 29)), een.N0, x340Var2, 0);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarB2);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(jw31VarA, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE2, x340Var2, lljVar4);
            int i4 = i3 & 112;
            boolean z2 = i4 == 32;
            Object objT = x340Var2.T();
            if (z2 || objT == m4cVar) {
                objT = new uyh1(iu30Var, (byte) 12);
                x340Var2.s0(objT);
            }
            z50 z50Var = z50.c;
            qim0Var = qim0Var2;
            foo1.c(new gbx(z50Var, (Function0) objT), jdx.c, null, null, yla.s(x340Var2), null, null, null, null, null, npj.a, x340Var2, 0, 48, 2012);
            boolean z3 = i4 == 32;
            Object objT2 = x340Var2.T();
            if (z3 || objT2 == m4cVar) {
                iu30Var2 = iu30Var;
                objT2 = new uyh1(iu30Var2, (byte) 13);
                x340Var2.s0(objT2);
            } else {
                iu30Var2 = iu30Var;
            }
            foo1.c(new gbx(z50Var, (Function0) objT2), new idx(4), null, null, yla.s(x340Var2), null, null, null, null, null, npj.b, x340Var2, 0, 48, 2012);
            x340Var = x340Var2;
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        qim0 qim0Var3 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rgd(str, iu30Var2, qim0Var3, i, (byte) 4);
        }
    }

    public static SessionInfo v(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            Bundle bundle = extras.getBundle("androidx.car.app.extra.SESSION_INFO_BUNDLE");
            return new SessionInfo(bundle.getInt("display-type"), bundle.getString("session-id"));
        }
        hhg1.n("Expected the SessionInfo to be encoded in the bind intent extras, but the extras were null.");
        return null;
    }

    public static final boolean w(eh4 eh4Var) {
        return eh4Var.g() && eh4Var.i();
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00b5  */
    public static final hjf1 x(hcz0 hcz0Var, eh4 eh4Var) {
        boolean zJ;
        String strA0;
        aak0 aak0VarB;
        hlk0 hlk0Var;
        boolean z = hcz0Var.l;
        boolean z2 = hcz0Var.z;
        LinkedHashSet linkedHashSetR = v1p1.r(hcz0Var);
        ContextTrack contextTrack = hcz0Var.a;
        if (contextTrack == null) {
            return null;
        }
        kw21 kw21Var = (kw21) hcz0Var.A.get(contextTrack.uri());
        String strUri = contextTrack.uri();
        if (z2) {
            zJ = !l4o1.C(contextTrack);
        } else {
            zJ = u890.j(hcz0Var.D.get(contextTrack.uri()), Boolean.TRUE);
        }
        boolean zContains = linkedHashSetR.contains(l4o1.c0(contextTrack));
        Restrictions restrictions = hcz0Var.j;
        List list = z ? hcz0Var.n : z6x.a;
        boolean z3 = true;
        ktw0 ktw0Var = hcz0Var.k;
        boolean zF = eh4Var.f();
        if (z2 && l4o1.C(contextTrack)) {
            strA0 = l4o1.a0(contextTrack, "image_url");
        } else {
            strA0 = kw21Var != null ? kw21Var.a : null;
        }
        String str = kw21Var != null ? kw21Var.c : null;
        boolean z4 = eh4Var.k() || l4o1.L(contextTrack);
        if (!hcz0Var.C || !zJ || zContains) {
            z3 = false;
        }
        String str2 = (String) hcz0Var.E.get(strUri);
        if (kw21Var == null || (hlk0Var = kw21Var.e) == null) {
            aak0VarB = null;
        } else {
            if (!hcz0Var.u || z) {
                hlk0Var = null;
            }
            if (hlk0Var != null) {
                aak0VarB = B(hlk0Var);
            } else {
                aak0VarB = null;
            }
        }
        return d4o1.r(contextTrack, 0, restrictions, list, zF, false, ktw0Var, false, false, false, strA0, str, (66000 & 2048) != 0 ? false : z4, zContains, z3, str2, (66000 & 32768) != 0 ? null : aak0VarB, false);
    }

    public static lex y(b0k b0kVar) {
        uwr uwrVar = cbx.a;
        cvx cvxVar = cbx.b(b0kVar).b;
        cvx cvxVar2 = cbx.b(b0kVar).b;
        zzq0 zzq0Var = new zzq0(8.0f, 8.0f, 8.0f, 8.0f);
        mta mtaVar = cbx.b(b0kVar).d;
        zov0 zov0Var = cbx.b(b0kVar).g;
        cvx cvxVar3 = cbx.b(b0kVar).b;
        return new lex(zzq0Var, 48.0f, 24.0f, 8.0f, cbx.d(b0kVar).g);
    }

    public static lex z(b0k b0kVar) {
        uwr uwrVar = cbx.a;
        cvx cvxVar = cbx.b(b0kVar).b;
        cvx cvxVar2 = cbx.b(b0kVar).b;
        zzq0 zzq0Var = new zzq0(4.0f, 4.0f, 4.0f, 4.0f);
        mta mtaVar = cbx.b(b0kVar).d;
        zov0 zov0Var = cbx.b(b0kVar).g;
        cvx cvxVar3 = cbx.b(b0kVar).b;
        return new lex(zzq0Var, 32.0f, 16.0f, 6.0f, cbx.d(b0kVar).j);
    }
}
