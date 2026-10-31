package p;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.FontWeight;
import j$.time.Duration;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.format.DateTimeFormatter;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class t8p1 {
    public static b180 a;
    public static b180 b;
    public static b180 c;

    public static final void a(long j, rms rmsVar, n2 n2Var, vzq0 vzq0Var, Function0 function0, Function0 function1, b0k b0kVar, int i) {
        int i2;
        Function0 function2;
        Object obj = fkj0.X;
        String str = rmsVar.b;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-693571301);
        if ((i & 6) == 0) {
            i2 = (x340Var.f(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(rmsVar) : x340Var.i(rmsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(n2Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.g(vzq0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(function0) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            function2 = function1;
            i2 |= x340Var.i(function2) ? 131072 : 65536;
        } else {
            function2 = function1;
        }
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            Long lValueOf = Long.valueOf(j);
            boolean z = (57344 & i2) == 16384;
            Object objT = x340Var.T();
            if (z || objT == obj) {
                objT = new to1(function0, (lnm) null, (byte) 0);
                x340Var.s0(objT);
            }
            qxd0.t(lValueOf, x340Var, (vu30) objT);
            boolean zG = x340Var.g(str);
            Object objT2 = x340Var.T();
            if (zG || objT2 == obj) {
                objT2 = (ecv) n2Var.invoke(rmsVar, new y1(function0, (byte) 12));
                x340Var.s0(objT2);
            }
            ecv ecvVar = (ecv) objT2;
            ven0 ven0VarH = rwq.h(ecvVar.c, x340Var, 0);
            Object objT3 = x340Var.T();
            if (objT3 == obj) {
                objT3 = new mxs0();
                x340Var.s0(objT3);
            }
            int i3 = i2;
            qim0 qim0VarW = uyn1.w(bmq0.L(u291.d(nim0.a, 1.0f), (mxs0) objT3, (g6o0) null), vzq0Var);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarW);
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
            v9p1.h(function2, (String) ven0VarH.getValue(), ecvVar.d, apo.r(1553547003, new ab(ecvVar, (byte) 24), x340Var), x340Var, ((i3 >> 15) & 14) | 3072);
            otw.b(ecvVar.a, rih1.a, new joa0(str), new wnb0(1.0f, true), x340Var, 48, 0);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uo1(j, rmsVar, n2Var, vzq0Var, function0, function1, i, (byte) 0);
        }
    }

    public static final void b(int i, String str, String str2, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(16321366);
        int i2 = i | (x340Var2.g(str) ? 4 : 2) | (x340Var2.g(str2) ? 32 : 16) | (x340Var2.i(qim0Var) ? 256 : 128);
        if (x340Var2.Y(i2 & 1, (i2 & 147) != 146)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0Var);
            hzj.A.getClass();
            if (x340Var2.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(hmb0.t1);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            uwr uwrVar = cbx.a;
            uwo1.e(str, null, cbx.d(x340Var2).e, 0L, null, null, 2, false, new cjc0(2), 0, null, x340Var2, i2 & 14, 0, 1722);
            x340Var = x340Var2;
            uwo1.e(str2, null, kk0.p(nim0.a, 8.0f, x340Var, x340Var).j, cbx.a(x340Var).b.b, null, null, 2, false, new cjc0(3), 0, null, x340Var2, (i2 >> 3) & 14, 0, 1714);
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new c4(str, str2, qim0Var, i, (byte) 12);
        }
    }

    public static final void c(int i, String str, String str2, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2114312127);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, qim0Var3);
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
            Uri uri = Uri.parse(str);
            uwr uwrVar = cbx.a;
            cbx.a.getClass();
            eso1.e(uri, isl.a, (qim0) null, (p3v) null, (zvx) null, uwr.b(), (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var, 27696, 0, 4036);
            h2c h2cVar = h2c.a;
            qim0 qim0VarB = h2cVar.b(qim0Var3);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = mls.Q0;
                x340Var.s0(objT);
            }
            t1c.a(exd0.q(qim0VarB, (iu30) objT), x340Var, 0);
            uwo1.e(str2, uyn1.x(h2cVar.a(qim0Var3, graVar), 16.0f), cbx.d(x340Var).h, cbx.a(x340Var).b.a, null, null, 2, false, new cjc0(1), 0, null, x340Var, (i2 >> 3) & 14, 0, 1712);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new c4(str, str2, qim0Var2, i, (byte) 13);
        }
    }

    public static final void d(zph zphVar, xtb0 xtb0Var, Function0 function0, j2i j2iVar, b0k b0kVar, int i) {
        zph zphVar2;
        xtb0 xtb0Var2;
        Object hffVar;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1316360844);
        int i2 = (x340Var.i(zphVar) ? 4 : 2) | i | (x340Var.i(xtb0Var) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            ven0 ven0VarS = v8r.s(function0, x340Var);
            boolean zG = x340Var.g(zphVar) | x340Var.g(xtb0Var);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                objT = new yph(zphVar, xtb0Var, ven0VarS);
                x340Var.s0(objT);
            }
            yph yphVar = (yph) objT;
            boolean zI = x340Var.i(xtb0Var) | x340Var.i(zphVar) | x340Var.i(ven0VarS);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                zphVar2 = zphVar;
                xtb0Var2 = xtb0Var;
                hffVar = new hff(xtb0Var2, zphVar2, ven0VarS, (lnm) null, (byte) 8);
                x340Var.s0(hffVar);
            } else {
                zphVar2 = zphVar;
                hffVar = objT2;
                xtb0Var2 = xtb0Var;
            }
            qxd0.s(zphVar2, xtb0Var2, (vu30) hffVar, x340Var);
            j2iVar.invoke(bmq0.L(nim0.a, yphVar, (g6o0) null), x340Var, 48);
        } else {
            zphVar2 = zphVar;
            xtb0Var2 = xtb0Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hwd(i, zphVar2, xtb0Var2, function0, j2iVar, (byte) 16);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void e(pl80 pl80Var, boolean z, boolean z2, Instant instant, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        qim0 qim0Var2;
        boolean z3;
        int i2;
        int i3;
        String strK;
        String strK2;
        String str;
        j06 j06Var;
        String str2;
        qim0 qim0VarX;
        Object obj = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(772930361);
        j06 j06Var2 = x340Var.a;
        int i4 = i | (x340Var.i(pl80Var) ? 4 : 2) | (x340Var.h(z) ? 32 : 16) | (x340Var.h(z2) ? 256 : 128) | (x340Var.i(instant) ? 2048 : 1024) | (x340Var.i(function0) ? 16384 : 8192) | 196608;
        if (x340Var.Y(i4 & 1, (74899 & i4) != 74898)) {
            Locale locale = ((Configuration) x340Var.k(AndroidCompositionLocals_androidKt.a)).getLocales().get(0);
            ol80 ol80Var = pl80Var.b;
            if (ol80Var == null) {
                j06Var = j06Var2;
                strK2 = x0d.k(x340Var, 1049043730, 2131953620, x340Var, false);
                str = null;
            } else {
                x340Var.i0(1049155051);
                String strO0 = cwl1.o0(x340Var, 2131956704);
                boolean zG = x340Var.g(ol80Var) | x340Var.g(locale) | x340Var.g(strO0);
                Object objT = x340Var.T();
                if (zG || objT == obj) {
                    locale.getClass();
                    Duration duration = nl80.a;
                    DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern("MMM d", locale);
                    LocalDate localDate = ol80Var.a;
                    int year = localDate.getYear();
                    LocalDate localDate2 = ol80Var.b;
                    objT = String.format(locale, strO0, Arrays.copyOf(new Object[]{dateTimeFormatterOfPattern.format(localDate), ((year == localDate2.getYear() && localDate.getMonth() == localDate2.getMonth()) ? DateTimeFormatter.ofPattern("d", locale) : dateTimeFormatterOfPattern).format(localDate2)}, 2));
                    x340Var.s0(objT);
                }
                String str3 = (String) objT;
                Instant instant2 = ol80Var.c;
                Duration duration2 = nl80.a;
                Duration durationBetween = Duration.between(instant2, instant);
                int i5 = 3;
                if (!durationBetween.isNegative()) {
                    Duration duration3 = nl80.a;
                    if (durationBetween.compareTo(duration3) < 0) {
                        i5 = 1;
                    } else if (durationBetween.compareTo(duration3.multipliedBy(2L)) < 0) {
                        i5 = 2;
                    }
                }
                int iC = l1d.C(i5);
                if (iC != 0) {
                    if (iC == 1) {
                        z3 = false;
                        i2 = 1049581859;
                        i3 = 2131956688;
                    } else {
                        if (iC != 2) {
                            throw p3d1.k(x340Var, -243244292, false);
                        }
                        x340Var.i0(1049717887);
                        strK = cwl1.n0(2131956690, new Object[]{str3}, x340Var);
                        z3 = false;
                        x340Var.r(false);
                        str3 = null;
                    }
                    x340Var.r(z3);
                    strK2 = strK;
                    str = str3;
                    j06Var = j06Var2;
                } else {
                    z3 = false;
                    i2 = 1049442979;
                    i3 = 2131956689;
                }
                strK = x0d.k(x340Var, i2, i3, x340Var, z3);
                x340Var.r(z3);
                strK2 = strK;
                str = str3;
                j06Var = j06Var2;
            }
            String strO1 = cwl1.o0(x340Var, z2 ? 2131956687 : 2131956685);
            String strO2 = cwl1.o0(x340Var, z2 ? 2131956684 : 2131956686);
            qim0 qim0Var3 = nim0.a;
            if (z) {
                str2 = strO1;
                qim0VarX = bin.x(qim0Var3, false, strO2, new pm31(0), null, function0, 9);
            } else {
                str2 = strO1;
                qim0VarX = qim0Var3;
            }
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarThen = dug.f(qim0VarF, cbx.a(x340Var).a.c, d4o1.a).then(qim0VarX);
            boolean zG2 = ((i4 & 112) == 32) | x340Var.g(str2);
            Object objT2 = x340Var.T();
            if (zG2 || objT2 == obj) {
                objT2 = new cl1(z, str2, (byte) 19);
                x340Var.s0(objT2);
            }
            qim0 qim0VarB = s161.b(qim0VarThen, true, (iu30) objT2);
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarN = anm1.N("insight-week-header-" + pl80Var.a, u291.j(42.0f, 0.0f, 2, uyn1.y(qim0VarB, 16.0f, 4.0f)));
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 48);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z4 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z4) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            wnb0 wnb0VarQ = kk0.q(x340Var, qim0VarE, lljVar4, 1.0f, true);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, wnb0VarQ);
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
            uwo1.e(strK2, null, cbx.d(x340Var).e, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
            x340Var = x340Var;
            if (str != null) {
                x340Var.i0(-1930648018);
                uwo1.e(str, null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
                x340Var = x340Var;
                x340Var.r(false);
            } else {
                x340Var.i0(-1930493297);
                x340Var.r(false);
            }
            x340Var.r(true);
            if (z) {
                x340Var.i0(-30334187);
                tob1 tob1VarB = z95.b(z2 ? 180.0f : 0.0f, (fe5) null, "insightWeekChevronRotation", (iu30) null, x340Var, 3072, 22);
                mlx mlxVar = mlx.c;
                long j = cbx.a(x340Var).b.a;
                zov0 zov0Var = cbx.b(x340Var).g;
                x340 x340Var2 = x340Var;
                w0h1.a(mlxVar, isl.a, anm1.N("insight-week-chevron", k1u.u(u291.r(qim0Var3, 24.0f), ((Number) tob1VarB.getValue()).floatValue())), j, 0L, false, x340Var2, mlx.d | 48, 48);
                x340Var = x340Var2;
                x340Var.r(false);
            } else {
                x340Var.i0(-29826779);
                x340Var.r(false);
            }
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new erc(pl80Var, z, z2, instant, function0, qim0Var2, i);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void f(aqb0 aqb0Var, pe21 pe21Var, Object obj, qim0 qim0Var, qim0 qim0Var2, boolean z, j2i j2iVar, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        qim0 qim0Var3;
        qim0 qim0Var4;
        boolean z2;
        qim0 qim0VarB;
        boolean z3;
        int i3;
        qim0 qim0Var5;
        qim0 qim0VarThen;
        boolean z4;
        qim0 qim0VarC;
        boolean z5;
        boolean z6;
        qim0 qim0VarC2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-401333467);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(aqb0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(pe21Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(obj) ? 256 : 128;
        }
        int i4 = i2 | 3072;
        if ((i & 24576) == 0) {
            i4 = i2 | 11264;
        }
        int i5 = 196608 | i4;
        if ((1572864 & i) == 0) {
            i5 |= x340Var.i(j2iVar) ? 1048576 : 524288;
        }
        if (x340Var.Y(i5 & 1, (599187 & i5) != 599186)) {
            x340Var.d0();
            int i6 = i & 1;
            qim0 qim0Var6 = nim0.a;
            if (i6 == 0 || x340Var.E()) {
                qim0VarB = aqb0.b(aqb0Var, qim0Var6, (pxg1) null, (ni20) null, 7);
                z3 = true;
                i3 = i5 & (-57345);
                qim0Var5 = qim0Var6;
            } else {
                x340Var.b0();
                qim0VarB = qim0Var2;
                z3 = z;
                i3 = i5 & (-57345);
                qim0Var5 = qim0Var;
            }
            x340Var.s();
            boolean zE = x340Var.e(pe21Var.d().ordinal());
            Object objT = x340Var.T();
            if (zE || objT == m4cVar) {
                objT = yv91.a(new he21(pe21Var, (byte) 4));
                x340Var.s0(objT);
            }
            tob1 tob1Var = (tob1) objT;
            mdt mdtVarA = yv91.a(new zkz0(obj, pe21Var, (byte) 29));
            if (((Boolean) mdtVarA.getValue()).booleanValue()) {
                x340Var.i0(1064107559);
                qim0 qim0VarX = lrn1.x(qim0Var6, 1.0f);
                int iOrdinal = ((qqq0) tob1Var.getValue()).ordinal();
                if (iOrdinal == 0) {
                    x340Var.i0(865614016);
                    z4 = (i3 & 112) == 32;
                    Object objT2 = x340Var.T();
                    if (z4 || objT2 == m4cVar) {
                        z6 = false;
                        objT2 = new ne21(pe21Var, (byte) 0);
                        x340Var.s0(objT2);
                    } else {
                        z6 = false;
                    }
                    qim0VarC2 = i541.C(qim0Var6, (iu30) objT2);
                    x340Var.r(z6);
                } else {
                    if (iOrdinal != 1) {
                        throw p3d1.k(x340Var, 865611670, false);
                    }
                    x340Var.i0(865617920);
                    boolean z7 = (i3 & 112) == 32;
                    Object objT3 = x340Var.T();
                    if (z7 || objT3 == m4cVar) {
                        objT3 = new ne21(pe21Var, (byte) 1);
                        x340Var.s0(objT3);
                    }
                    qim0 qim0VarC3 = i541.C(qim0Var6, (iu30) objT3);
                    x340Var.r(false);
                    qim0VarC2 = qim0VarC3;
                    z6 = false;
                }
                qim0VarThen = qim0VarX.then(qim0VarC2);
                x340Var.r(z6);
            } else if (obj.equals(pe21Var.u.getValue())) {
                x340Var.i0(1064495307);
                qim0 qim0VarX2 = lrn1.x(qim0Var6, 1.0f);
                int iOrdinal2 = ((qqq0) tob1Var.getValue()).ordinal();
                if (iOrdinal2 == 0) {
                    x340Var.i0(865626510);
                    z4 = (i3 & 112) == 32;
                    Object objT4 = x340Var.T();
                    if (z4 || objT4 == m4cVar) {
                        objT4 = new ne21(pe21Var, (byte) 2);
                        x340Var.s0(objT4);
                    }
                    qim0VarC = i541.C(qim0Var6, (iu30) objT4);
                    z5 = false;
                    x340Var.r(false);
                } else {
                    if (iOrdinal2 != 1) {
                        throw p3d1.k(x340Var, 865624178, false);
                    }
                    x340Var.i0(865630862);
                    z4 = (i3 & 112) == 32;
                    Object objT5 = x340Var.T();
                    if (z4 || objT5 == m4cVar) {
                        objT5 = new ne21(pe21Var, (byte) 3);
                        x340Var.s0(objT5);
                    }
                    qim0VarC = i541.C(qim0Var6, (iu30) objT5);
                    z5 = false;
                    x340Var.r(false);
                }
                qim0VarThen = qim0VarX2.then(qim0VarC);
                x340Var.r(z5);
            } else {
                x340Var.i0(1064857852);
                x340Var.r(false);
                qim0VarThen = qim0VarB;
            }
            s8p1.c(pe21Var, obj, ((Boolean) mdtVarA.getValue()).booleanValue(), qim0Var5.then(qim0VarThen), z3, j2iVar, x340Var, (i3 >> 3) & 516222);
            qim0Var3 = qim0Var5;
            z2 = z3;
            qim0Var4 = qim0VarB;
        } else {
            x340Var.b0();
            qim0Var3 = qim0Var;
            qim0Var4 = qim0Var2;
            z2 = z;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lv1((byte) 10, i, (Object) aqb0Var, (Object) pe21Var, obj, (Object) qim0Var3, (Object) qim0Var4, (Object) j2iVar, z2);
        }
    }

    public static final void g(xq41 xq41Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1927252534);
        int i2 = i | (x340Var.g(xq41Var) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            mgx mgxVar = mgx.e;
            zzq0 zzq0Var = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
            String strO0 = cwl1.o0(x340Var, 2131953450);
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar = new gbx(new y50(strO0), function0);
            cr31 cr31VarB = er31.b(16.0f);
            j2i j2iVarR = apo.r(-176171917, new b1s(xq41Var, (byte) 17), x340Var);
            qim0Var2 = nim0.a;
            cwl1.b(qim0Var2, (tl3) null, cr31VarB, mgxVar, zzq0Var, (max) null, false, (idn0) null, (ga80) null, gbxVar, (gbx) null, j2iVarR, x340Var, 6, 48, 1506);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new won(xq41Var, function0, qim0Var2, i, (byte) 13);
        }
    }

    public static final Map h(Map map, qm81 qm81Var, String str) {
        w7x w7xVar = (Set) map.get(qm81Var);
        if (w7xVar == null) {
            w7xVar = w7x.a;
        }
        return sqg0.P(map, new mmr0(qm81Var, dm61.x0(str, w7xVar)));
    }

    public static void i(View view) {
        ArrayList arrayList = new ArrayList();
        j(arrayList, view, new StringBuilder());
        if (arrayList.isEmpty()) {
            return;
        }
        bhn0.f("State restore ID conflicts: ".concat(o7h.y0(arrayList, "; ", (String) null, (String) null, eak1.h, 30)));
    }

    public static final void j(ArrayList arrayList, View view, StringBuilder sb) {
        int iNextInt;
        if (view instanceof ViewGroup) {
            ArrayList arrayList2 = new ArrayList();
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getId() != -1 && childAt.isSaveEnabled()) {
                    arrayList2.add(new mmr0(Integer.valueOf(childAt.getId()), childAt));
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : arrayList2) {
                Integer numValueOf = Integer.valueOf(((Number) ((mmr0) obj).a).intValue());
                Object arrayList3 = linkedHashMap.get(numValueOf);
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                    linkedHashMap.put(numValueOf, arrayList3);
                }
                ((List) arrayList3).add(obj);
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                int iIntValue = ((Number) entry.getKey()).intValue();
                List list = (List) entry.getValue();
                if (list.size() > 1) {
                    String simpleName = sb.length() == 0 ? view.getClass().getSimpleName() : sb.toString();
                    List list2 = list;
                    ArrayList arrayList4 = new ArrayList(q7h.U(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        View view2 = (View) ((mmr0) it.next()).b;
                        lr80 it2 = yoi1.Q(0, viewGroup.getChildCount()).iterator();
                        do {
                            if (!((sr80) it2).c) {
                                bhn0.t("Collection contains no element matching the predicate.");
                                return;
                            }
                            iNextInt = it2.nextInt();
                        } while (viewGroup.getChildAt(iNextInt) != view2);
                        arrayList4.add(view2.getClass().getSimpleName() + "(" + iNextInt + ")");
                    }
                    arrayList.add(new kqb1(iIntValue, simpleName, arrayList4));
                }
            }
            int childCount2 = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount2; i2++) {
                View childAt2 = viewGroup.getChildAt(i2);
                if (childAt2 instanceof ViewGroup) {
                    StringBuilder sb2 = new StringBuilder(sb);
                    if (sb2.length() > 0) {
                        sb2.append("/");
                    }
                    sb2.append(view.getClass().getSimpleName() + "(" + i2 + ")");
                    j(arrayList, childAt2, sb2);
                }
            }
        }
    }

    public static final long k() {
        return Thread.currentThread().getId();
    }

    public static final String l() {
        return Thread.currentThread().getName();
    }

    public static boolean m(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z = true;
        for (File file2 : fileArrListFiles) {
            z = m(file2) && z;
        }
        return z;
    }

    public static void n(Context context, mlw0 mlw0Var) {
        if (m(Build.VERSION.SDK_INT >= 34 ? context.createDeviceProtectedStorageContext().getCacheDir() : context.createDeviceProtectedStorageContext().getCodeCacheDir())) {
            mlw0Var.d(14, (Object) null);
        } else {
            mlw0Var.d(15, (Object) null);
        }
    }

    public static ksk0 o() {
        return new ksk0((byte) 6);
    }

    public static qim0 p(qim0 qim0Var, ky4 ky4Var) {
        return qim0Var.then(new dav0(ky4Var));
    }

    public static final pe21 q(xtb0 xtb0Var, iu30 iu30Var, zu30 zu30Var, xu30 xu30Var, vzq0 vzq0Var, b0k b0kVar, int i) {
        rs11 rs11Var;
        m4c m4cVar = fkj0.X;
        boolean z = (((i & 14) ^ 6) > 4 && ((x340) b0kVar).g(xtb0Var)) || (i & 6) == 4;
        x340 x340Var = (x340) b0kVar;
        Object objT = x340Var.T();
        if (z || objT == m4cVar) {
            objT = new nxb0(xtb0Var, (byte) 26);
            x340Var.s0(objT);
        }
        Function0 function0 = (Function0) objT;
        Object objT2 = x340Var.T();
        o6x o6xVar = o6x.a;
        if (objT2 == m4cVar) {
            objT2 = qxd0.M(o6xVar, x340Var);
            x340Var.s0(objT2);
        }
        c9n c9nVar = (c9n) objT2;
        ven0 ven0VarS = v8r.s(function0, x340Var);
        ven0 ven0VarS2 = v8r.s(100L, x340Var);
        boolean zF = x340Var.f(100L) | x340Var.g(xtb0Var) | x340Var.g(c9nVar);
        Object objT3 = x340Var.T();
        if (zF || objT3 == m4cVar) {
            objT3 = new st41(xtb0Var, c9nVar, new zqe(ven0VarS, ven0VarS2, (byte) 11));
            x340Var.s0(objT3);
        }
        st41 st41Var = (st41) objT3;
        x340 x340Var2 = (x340) b0kVar;
        wat watVar = (wat) x340Var2.k(t4k.h);
        float fX0 = watVar.X0(48.0f);
        Object objT4 = x340Var2.T();
        if (objT4 == m4cVar) {
            objT4 = qxd0.M(o6xVar, x340Var2);
            x340Var2.s0(objT4);
        }
        c9n c9nVar2 = (c9n) objT4;
        ven0 ven0VarS3 = v8r.s(zu30Var, x340Var2);
        ven0 ven0VarS4 = v8r.s(iu30Var, x340Var2);
        ven0 ven0VarS5 = v8r.s(xu30Var, x340Var2);
        flb0 flb0Var = (flb0) x340Var2.k(t4k.n);
        l5 l5Var = new l5(watVar.X0(uyn1.n(vzq0Var, flb0Var)), watVar.X0(uyn1.m(vzq0Var, flb0Var)), watVar.X0(vzq0Var.d()), watVar.X0(vzq0Var.a()));
        int i2 = (i & 14) ^ 6;
        boolean z2 = (i2 > 4 && x340Var2.g(xtb0Var)) || (i & 6) == 4;
        Object objT5 = x340Var2.T();
        if (z2 || objT5 == m4cVar) {
            objT5 = yv91.a(new nxb0(xtb0Var, (byte) 27));
            x340Var2.s0(objT5);
        }
        tob1 tob1Var = (tob1) objT5;
        qqq0 qqq0Var = (qqq0) tob1Var.getValue();
        boolean zG = ((((57344 & i) ^ 24576) > 16384 && x340Var2.g(vzq0Var)) || (i & 24576) == 16384) | ((i2 > 4 && x340Var2.g(xtb0Var)) || (i & 6) == 4) | x340Var2.g(c9nVar2) | ((((458752 & i) ^ 196608) > 131072 && x340Var2.d(48.0f)) || (i & 196608) == 131072) | ((((3670016 & i) ^ 1572864) > 1048576 && x340Var2.g(st41Var)) || (i & 1572864) == 1048576) | x340Var2.e(qqq0Var.ordinal());
        Object objT6 = x340Var2.T();
        if (zG || objT6 == m4cVar) {
            int iOrdinal = ((qqq0) tob1Var.getValue()).ordinal();
            if (iOrdinal == 0) {
                rs11Var = rs11.R0;
            } else {
                if (iOrdinal != 1) {
                    eg.o();
                    return null;
                }
                rs11Var = rs11.S0;
            }
            pe21 pe21Var = new pe21(new tz01(xtb0Var, (byte) 6), c9nVar2, ven0VarS4, ven0VarS3, ven0VarS5, fX0, l5Var, st41Var, flb0Var, rs11Var);
            x340Var2.s0(pe21Var);
            objT6 = pe21Var;
        }
        return (pe21) objT6;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002d  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object r(int i, Object obj, a930 a930Var, FontWeight fontWeight, int i2) {
        Object[] objArr;
        if (!(obj instanceof Typeface)) {
            return obj;
        }
        boolean z = false;
        int i3 = 0;
        z = false;
        if ((i & 1) == 0 || u890.j(a930Var.getWeight(), fontWeight)) {
            objArr = false;
        } else {
            FontWeight fontWeight2 = FontWeight.d;
            if (fontWeight.a(fontWeight2) < 0 || u890.q(a930Var.getWeight().a, fontWeight2.a) >= 0) {
                objArr = false;
            } else {
                objArr = true;
            }
        }
        Object[] objArr2 = ((i & 2) == 0 || i2 == a930Var.b()) ? false : true;
        if (objArr2 != true && objArr != true) {
            return obj;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            int i4 = objArr != false ? fontWeight.a : a930Var.getWeight().a;
            if (objArr2 == false ? a930Var.b() == 1 : i2 == 1) {
                z = true;
            }
            return mmg1.b((Typeface) obj, i4, z);
        }
        Object[] objArr3 = objArr2 == true && i2 == 1;
        if (objArr3 == true && objArr == true) {
            i3 = 3;
        } else if (objArr == true) {
            i3 = 1;
        } else if (objArr3 != false) {
            i3 = 2;
        }
        return Typeface.create((Typeface) obj, i3);
    }
}
