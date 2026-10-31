package p;

import android.bluetooth.BluetoothGattServer;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.spotify.mobius.Next;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class e9k {
    public static Boolean a;
    public static Boolean b;
    public static Boolean c;
    public static Boolean d;
    public static b180 e;
    public static b180 f;

    public static Next A(kak0 kak0Var, r2k0 r2k0Var) {
        int iC = l1d.C(r2k0Var.a);
        k1k0 k1k0Var = i0k0.a;
        if (iC == 0) {
            return Next.i(kak0.a(kak0Var, (pdm0) null, (Boolean) null, (ycu0) null, (lhg1) null, (lhg1) null, (lhg1) null, (xx8) null, (List) null, (List) null, (Float) null, (lhg1) null, (lhg1) null, (lhg1) null, (String) null, (String) null, (lhg1) null, (m8w0) null, false, 0, 0, 0, giq0.b, (uia) null, (uia) null, (Float) null, (Float) null, (Float) null, (Float) null, false, false, (String) null, false, (lhg1) null, (Boolean) null, (Integer) null, (lyj0) null, 0L, (Integer) null, (Integer) null, -1, 1048574), f46.S0(new k1k0[]{k1k0Var, new j0k0(kak0Var.S0, kak0Var.h, r2k0Var.b)}));
        }
        giq0 giq0Var = giq0.a;
        if (iC == 1) {
            return Next.i(kak0.a(kak0Var, (pdm0) null, (Boolean) null, (ycu0) null, (lhg1) null, (lhg1) null, (lhg1) null, (xx8) null, (List) null, (List) null, (Float) null, (lhg1) null, (lhg1) null, (lhg1) null, (String) null, (String) null, (lhg1) null, (m8w0) null, false, 0, 0, 0, giq0Var, (uia) null, (uia) null, (Float) null, (Float) null, (Float) null, (Float) null, false, false, (String) null, false, (lhg1) null, (Boolean) null, (Integer) null, (lyj0) null, 0L, (Integer) null, (Integer) null, -1, 1048574), Collections.singleton(k1k0Var));
        }
        if (iC == 2) {
            return Next.i(kak0.a(kak0Var, (pdm0) null, (Boolean) null, (ycu0) null, (lhg1) null, (lhg1) null, (lhg1) null, (xx8) null, (List) null, (List) null, (Float) null, (lhg1) null, (lhg1) null, (lhg1) null, (String) null, (String) null, (lhg1) null, (m8w0) null, false, 0, 0, 0, giq0Var, (uia) null, (uia) null, (Float) null, (Float) null, (Float) null, (Float) null, false, false, (String) null, false, (lhg1) null, (Boolean) null, (Integer) null, (lyj0) null, 0L, (Integer) null, (Integer) null, -1, 1048574), Collections.singleton(k1k0Var));
        }
        eg.o();
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [boolean] */
    public static final void a(fv2 fv2Var, xu30 xu30Var, b0k b0kVar, int i) {
        xu30 xu30Var2;
        boolean z;
        boolean z2;
        jdx idxVar;
        byte b2;
        ldx idxVar2;
        m4c m4cVar;
        byte b3;
        llj lljVar = y580.Y;
        llj lljVar2 = y580.R0;
        llj lljVar3 = y580.N0;
        llj lljVar4 = y580.O0;
        String str = fv2Var.c;
        era eraVar = een.P0;
        m4c m4cVar2 = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(756892565);
        j06 j06Var = x340Var.a;
        int i2 = (i & 6) == 0 ? (x340Var.i(fv2Var) ? 4 : 2) | i : i;
        int i3 = (i & 48) == 0 ? i2 | (x340Var.i(xu30Var) ? 32 : 16) : i2;
        int i4 = i & 384;
        qim0 qim0Var = nim0.a;
        if (i4 == 0) {
            i3 |= x340Var.i(qim0Var) ? 256 : 128;
        }
        int i5 = i3;
        if (x340Var.Y(i5 & 1, (i5 & 147) != 146)) {
            String str2 = fv2Var.d;
            ArrayList<ev2> arrayList = fv2Var.e;
            String strN0 = cwl1.n0(2131952129, new Object[]{str2}, x340Var);
            String strF = f4i1.f(str, ". ", strN0);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarF = u291.f(u291.x(0.0f, 480.0f, 1, uyn1.B(qim0Var, 0.0f, 12.0f, 0.0f, 0.0f, 13)), 1.0f);
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarF2 = dug.f(i1p1.q(qim0VarF, er31.b(16.0f)), cbx.a(x340Var).a.a.a(), d4o1.a);
            cvx cvxVar3 = cbx.b(x340Var).b;
            qim0 qim0VarX = uyn1.x(qim0VarF2, 16.0f);
            boolean zG = x340Var.g(strF);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar2) {
                objT = new v1(strF, (byte) 23);
                x340Var.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarX, false, (iu30) objT);
            cvx cvxVar4 = cbx.b(x340Var).b;
            mbh mbhVarA = jbh.a(new d36(12.0f, true, new um5(false)), eraVar, x340Var, 0);
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
            nko1.H(mbhVarA, x340Var, lljVar4);
            nko1.H(xos0VarM, x340Var, lljVar3);
            x0d.q(iHashCode, x340Var, lljVar2, x340Var);
            nko1.H(qim0VarE, x340Var, lljVar);
            int i6 = 0;
            String strSubstring = strN0;
            m4c m4cVar3 = m4cVar2;
            uwo1.e(str, (qim0) null, cbx.d(x340Var).h, cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2034);
            x340 x340Var2 = x340Var;
            ye5 ye5VarO = kk0.o(-1089863240, x340Var2);
            zma1 zma1Var = new zma1(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, cbx.d(x340Var2).l.a.f, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, cbx.a(x340Var2).a.a.c(), (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 63455);
            int iV0 = ihc1.v0(strSubstring, '`', 0, 6);
            while (iV0 != -1) {
                ye5VarO.g(strSubstring.substring(i6, iV0));
                int i7 = iV0 + 1;
                int iV1 = ihc1.v0(strSubstring, '`', i7, 4);
                if (iV1 == -1) {
                    ye5VarO.g(strSubstring.substring(iV0));
                    strSubstring = "";
                    iV0 = -1;
                    i6 = 0;
                } else {
                    int iO = ye5VarO.o(zma1Var);
                    try {
                        ye5VarO.g(" " + strSubstring.substring(i7, iV1) + " ");
                        ye5VarO.k(iO);
                        strSubstring = strSubstring.substring(iV1 + 1);
                        iV0 = ihc1.v0(strSubstring, '`', 0, 6);
                        i6 = 0;
                    } catch (Throwable th) {
                        ye5VarO.k(iO);
                        throw th;
                    }
                }
            }
            if (strSubstring.length() > 0) {
                ye5VarO.g(strSubstring);
            }
            af5 af5VarP = ye5VarO.p();
            x340Var2.r(false);
            uwr uwrVar2 = cbx.a;
            uwo1.d(af5VarP, cbx.a(x340Var2).b.b, (qim0) null, cbx.d(x340Var2).j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (cqs0) null, x340Var2, 0, 0, 4084);
            ?? r2 = fv2Var.f;
            z50 z50Var = z50.c;
            f36 f36Var = h36.c;
            boolean z4 = true;
            if (r2 >= 1) {
                x340Var2.i0(833267051);
                qim0 qim0Var2 = qim0Var;
                qim0 qim0VarF3 = u291.f(qim0Var2, 1.0f);
                mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var2, 0);
                int iHashCode2 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM2 = x340Var2.m();
                qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarF3);
                hzj.A.getClass();
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(mbhVarA2, x340Var2, lljVar4);
                nko1.H(xos0VarM2, x340Var2, lljVar3);
                x0d.q(iHashCode2, x340Var2, lljVar2, x340Var2);
                nko1.H(qim0VarE2, x340Var2, lljVar);
                x340Var2.i0(1423278845);
                for (ev2 ev2Var : arrayList) {
                    int iC = l1d.C(ev2Var.c);
                    if (iC == 0) {
                        idxVar2 = new idx(4);
                    } else if (iC == z4) {
                        idxVar2 = jdx.c;
                    } else {
                        if (iC != 2) {
                            eg.o();
                            return;
                        }
                        idxVar2 = ldx.c;
                    }
                    boolean zI = ((i5 & 112) == 32 ? z4 : false) | x340Var2.i(fv2Var) | x340Var2.i(ev2Var);
                    Object objT2 = x340Var2.T();
                    if (zI) {
                        m4cVar = m4cVar3;
                    } else {
                        m4cVar = m4cVar3;
                        if (objT2 != m4cVar) {
                            b3 = 0;
                        }
                        x340 x340Var3 = x340Var2;
                        foo1.c(new gbx(z50Var, (Function0) objT2), idxVar2, u291.f(qim0Var2, 1.0f), (max) null, yla.s(x340Var2), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(-1236116227, new jv2(ev2Var, b3), x340Var2), x340Var3, 0, 48, 2008);
                        z4 = z4;
                        m4cVar3 = m4cVar;
                        x340Var2 = x340Var3;
                        qim0Var2 = qim0Var2;
                    }
                    b3 = 0;
                    objT2 = new iv2(xu30Var, fv2Var, ev2Var, (byte) 0);
                    x340Var2.s0(objT2);
                    x340 x340Var4 = x340Var2;
                    foo1.c(new gbx(z50Var, (Function0) objT2), idxVar2, u291.f(qim0Var2, 1.0f), (max) null, yla.s(x340Var2), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(-1236116227, new jv2(ev2Var, b3), x340Var2), x340Var4, 0, 48, 2008);
                    z4 = z4;
                    m4cVar3 = m4cVar;
                    x340Var2 = x340Var4;
                    qim0Var2 = qim0Var2;
                }
                z = z4;
                z2 = false;
                x340Var = x340Var2;
                xu30Var2 = xu30Var;
            } else {
                x340Var = x340Var2;
                qim0 qim0Var3 = qim0Var;
                m4c m4cVar4 = m4cVar3;
                xu30Var2 = xu30Var;
                x340Var.i0(834205979);
                qim0 qim0VarF4 = u291.f(qim0Var3, 1.0f);
                mbh mbhVarA3 = jbh.a(f36Var, eraVar, x340Var, 0);
                int iHashCode3 = Long.hashCode(x340Var.T);
                xos0 xos0VarM3 = x340Var.m();
                qim0 qim0VarE3 = zr7.E(x340Var, qim0VarF4);
                hzj.A.getClass();
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(mbhVarA3, x340Var, lljVar4);
                nko1.H(xos0VarM3, x340Var, lljVar3);
                x0d.q(iHashCode3, x340Var, lljVar2, x340Var);
                nko1.H(qim0VarE3, x340Var, lljVar);
                x340Var.i0(1219791254);
                for (ev2 ev2Var2 : o7h.a1(arrayList, new k0d((byte) 18))) {
                    int iC2 = l1d.C(ev2Var2.c);
                    if (iC2 == 0) {
                        idxVar = new idx(4);
                    } else {
                        if (iC2 != 1 && iC2 != 2) {
                            eg.o();
                            return;
                        }
                        idxVar = jdx.c;
                    }
                    boolean zI2 = x340Var.i(fv2Var) | ((i5 & 112) == 32) | x340Var.i(ev2Var2);
                    Object objT3 = x340Var.T();
                    if (zI2 || objT3 == m4cVar4) {
                        b2 = 1;
                        objT3 = new iv2(xu30Var2, fv2Var, ev2Var2, (byte) 1);
                        x340Var.s0(objT3);
                    } else {
                        b2 = 1;
                    }
                    x340 x340Var5 = x340Var;
                    foo1.c(new gbx(z50Var, (Function0) objT3), idxVar, u291.f(qim0Var3, 1.0f), (max) null, yla.s(x340Var), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(-779164154, new jv2(ev2Var2, b2), x340Var), x340Var5, 0, 48, 2008);
                    x340Var = x340Var5;
                    qim0Var3 = qim0Var3;
                    m4cVar4 = m4cVar4;
                }
                z = true;
                z2 = false;
            }
            us71.m(x340Var, z2, z, z2);
            x340Var.r(z);
        } else {
            xu30Var2 = xu30Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new g90(fv2Var, xu30Var2, i);
        }
    }

    public static final void b(fv2 fv2Var, xu30 xu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        Object obj;
        m4c m4cVar = fkj0.X;
        String str = fv2Var.h;
        Boolean bool = fv2Var.g;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-348975119);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(fv2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(xu30Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            boolean zG = x340Var.g(bool);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                obj = objT;
                hrr0 hrr0VarQ = v8r.q(bool);
                x340Var.s0(hrr0VarQ);
                obj = hrr0VarQ;
            }
            ven0 ven0Var = (ven0) obj;
            boolean zG2 = x340Var.g(str);
            Object objT2 = x340Var.T();
            Object obj2 = objT2;
            if (zG2 || objT2 == m4cVar) {
                hrr0 hrr0VarQ2 = v8r.q(str);
                x340Var.s0(hrr0VarQ2);
                obj2 = hrr0VarQ2;
            }
            ven0 ven0Var2 = (ven0) obj2;
            if (((Boolean) ven0Var.getValue()) != null) {
                x340Var.i0(1798454226);
                boolean zJ = u890.j((Boolean) ven0Var.getValue(), Boolean.TRUE);
                c(fv2Var.f ? 1 : 0, (i3 >> 3) & 112, (String) ven0Var2.getValue(), x340Var, zJ);
                x340Var.r(false);
            } else {
                x340Var.i0(1798625904);
                boolean zI = x340Var.i(ven0Var) | x340Var.i(ven0Var2) | ((i3 & 112) == 32);
                Object objT3 = x340Var.T();
                Object obj3 = objT3;
                if (zI || objT3 == m4cVar) {
                    n891 n891Var = new n891(xu30Var, ven0Var, ven0Var2, (byte) 13);
                    x340Var.s0(n891Var);
                    obj3 = n891Var;
                }
                a(fv2Var, (xu30) obj3, x340Var, i3 & 910);
                x340Var.r(false);
            }
            qim0Var = nim0.a;
        } else {
            x340Var.b0();
        }
        qim0 qim0Var2 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xx(fv2Var, xu30Var, qim0Var2, i, (byte) 9);
        }
    }

    public static final void c(int i, int i2, String str, b0k b0kVar, boolean z) {
        int i3;
        int i4;
        int i5;
        String strK;
        long j;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(672324895);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.h(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i6 = i2 & 48;
        nim0 nim0Var = nim0.a;
        if (i6 == 0) {
            i3 |= x340Var.i(nim0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.g(str) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= x340Var.e(i) ? 2048 : 1024;
        }
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            if (i < 1 || str == null) {
                x340Var.i0(1798898795);
                if (z) {
                    i4 = 1859144888;
                    i5 = 2131952131;
                } else {
                    i4 = 1859147095;
                    i5 = 2131952130;
                }
                strK = x0d.k(x340Var, i4, i5, x340Var, false);
                x340Var.r(false);
            } else {
                x340Var.i0(1798644998);
                if (z) {
                    x340Var.i0(1798662389);
                    strK = cwl1.n0(2131952133, new Object[]{p(str, x340Var)}, x340Var);
                    x340Var.r(false);
                } else {
                    strK = x0d.k(x340Var, 1798807221, 2131952132, x340Var, false);
                }
                x340Var.r(false);
            }
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(0.0f, 12.0f, 1, nim0Var);
            boolean zG = x340Var.g(strK);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = new v1(strK, (byte) 24);
                x340Var.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarZ, false, (iu30) objT);
            fra fraVar = een.N0;
            cvx cvxVar2 = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(8.0f, true, new um5(false)), fraVar, x340Var, 0);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            uwo1.e(strK, (qim0) null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2034);
            x340Var = x340Var;
            klx klxVar = z ? klx.c : gux.c;
            boolean z2 = !z;
            if (z) {
                x340Var.i0(603390891);
                j = cbx.a(x340Var).c.f;
            } else {
                x340Var.i0(603392171);
                j = cbx.a(x340Var).c.d;
            }
            x340Var.r(false);
            w0h1.a(klxVar, isl.a, (qim0) null, j, 0L, z2, x340Var, 56, 20);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new au2(str, i, i2, z);
        }
    }

    public static final void d(String str, r140 r140Var, r140 r140Var2, boolean z, boolean z2, boolean z3, String str2, b0k b0kVar, int i) throws Throwable {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1212034033);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(r140Var) ? 32 : 16) | (x340Var.g(r140Var2) ? 256 : 128) | (x340Var.h(z) ? 2048 : 1024) | (x340Var.h(z2) ? 16384 : 8192) | (x340Var.h(z3) ? 131072 : 65536) | (x340Var.g(str2) ? 1048576 : 524288);
        if (x340Var.Y(i2 & 1, (599187 & i2) != 599186)) {
            boolean zJ = u890.j(r140Var.a, str);
            e(zJ ? r140Var : r140Var2, zJ ? r140Var2 : r140Var, zJ, z, z2, z3, str2, x340Var, i2 & 4193280);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new x140(str, r140Var, r140Var2, z, z2, z3, str2, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:170:0x039e  */
    /* JADX WARN: Code duplicated, block: B:172:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:177:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:183:0x03de  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(r140 r140Var, r140 r140Var2, boolean z, boolean z2, boolean z3, boolean z4, String str, b0k b0kVar, int i) throws Throwable {
        int i2;
        float f2;
        m4c m4cVar;
        Throwable th;
        b0k b0kVar2;
        o95 o95Var;
        ven0 ven0Var;
        o95 o95Var2;
        o95 o95Var3;
        boolean z5;
        boolean z6;
        boolean z7;
        int iIntValue;
        boolean z8;
        String str2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-189002371);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(r140Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.g(r140Var2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.h(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar3.h(z3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= b0kVar3.h(z4) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= b0kVar3.g(str) ? 1048576 : 524288;
        }
        if (b0kVar3.Y(i2 & 1, (599187 & i2) != 599186)) {
            pxg1 pxg1VarO0 = z3 ? irn1.o0(1100, 0, (dlv) null, 6) : irn1.o0(0, 0, (dlv) null, 6);
            Object objT = b0kVar3.T();
            m4c m4cVar2 = fkj0.X;
            if (objT == m4cVar2) {
                objT = bb00.h(0, b0kVar3);
            }
            err0 err0Var = (hdn0) objT;
            Object objT2 = b0kVar3.T();
            if (objT2 == m4cVar2) {
                objT2 = bb00.h(0, b0kVar3);
            }
            err0 err0Var2 = (hdn0) objT2;
            Object objT3 = b0kVar3.T();
            if (objT3 == m4cVar2) {
                objT3 = p3d1.n(0L, b0kVar3);
            }
            ven0 ven0Var2 = (ven0) objT3;
            Object objT4 = b0kVar3.T();
            if (objT4 == m4cVar2) {
                objT4 = c13.l(!z3, b0kVar3);
            }
            ven0 ven0Var3 = (ven0) objT4;
            tob1 tob1VarC = z95.c(err0Var.s(), pxg1VarO0, "player_score_animation", (iu30) null, b0kVar3, 384, 8);
            tob1 tob1VarC2 = z95.c(err0Var2.s(), pxg1VarO0, "opponent_score_animation", (iu30) null, b0kVar3, 384, 8);
            if (z4) {
                b0kVar3.i0(-1242607227);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(b0kVar3).b;
                b0kVar3.r(false);
                f2 = 8.0f;
            } else {
                b0kVar3.i0(-1242605916);
                uwr uwrVar2 = cbx.a;
                cvx cvxVar2 = cbx.b(b0kVar3).b;
                b0kVar3.r(false);
                f2 = 12.0f;
            }
            Object objT5 = b0kVar3.T();
            if (objT5 == m4cVar2) {
                objT5 = c97.b(0.0f);
                b0kVar3.s0(objT5);
            }
            o95 o95Var4 = (o95) objT5;
            Object objT6 = b0kVar3.T();
            if (objT6 == m4cVar2) {
                objT6 = c97.b(0.0f);
                b0kVar3.s0(objT6);
            }
            o95 o95Var5 = (o95) objT6;
            float fX0 = ((wat) b0kVar3.k(t4k.h)).X0(f2);
            Object objT7 = b0kVar3.T();
            if (objT7 == m4cVar2) {
                objT7 = c97.b(1.0f);
                b0kVar3.s0(objT7);
            }
            o95 o95Var6 = (o95) objT7;
            Integer numValueOf = Integer.valueOf(r140Var.d);
            Integer numValueOf2 = Integer.valueOf(r140Var2.d);
            Boolean boolValueOf = Boolean.valueOf(z3);
            boolean zI = b0kVar3.i(ven0Var3) | ((i2 & 57344) == 16384) | b0kVar3.i(o95Var4) | b0kVar3.i(o95Var5) | b0kVar3.i(o95Var6) | b0kVar3.i(err0Var) | ((i2 & 14) == 4) | b0kVar3.i(err0Var2) | ((i2 & 112) == 32) | ((i2 & 896) == 256) | ((i2 & 7168) == 2048) | b0kVar3.i(ven0Var2) | b0kVar3.d(fX0);
            Object objT8 = b0kVar3.T();
            if (zI || objT8 == m4cVar2) {
                m4cVar = m4cVar2;
                th = null;
                b0kVar2 = b0kVar3;
                o95Var = o95Var4;
                ven0Var = ven0Var2;
                z140 z140Var = new z140(z3, o95Var, o95Var5, o95Var6, r140Var, r140Var2, z2, z, ven0Var3, err0Var, err0Var2, ven0Var, fX0, null);
                o95Var2 = o95Var5;
                o95Var3 = o95Var6;
                b0kVar2.s0(z140Var);
                objT8 = z140Var;
            } else {
                ven0Var = ven0Var2;
                o95Var = o95Var4;
                m4cVar = m4cVar2;
                o95Var2 = o95Var5;
                th = null;
                o95Var3 = o95Var6;
                b0kVar2 = b0kVar3;
            }
            qxd0.r(numValueOf, numValueOf2, boolValueOf, (vu30) objT8, b0kVar2);
            boolean z9 = (!((Boolean) ven0Var3.getValue()).booleanValue() || z || z2) ? false : true;
            r140 r140Var3 = z9 ? r140Var2 : r140Var;
            r140 r140Var4 = z9 ? r140Var : r140Var2;
            boolean z10 = z9 || (z && !z2);
            boolean z11 = (z9 || z || z2) ? false : true;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            mbh mbhVarA = jbh.a(new d36(f2, true, new um5(false)), een.P0, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarF);
            hzj.A.getClass();
            if (((x340) b0kVar2).a == null) {
                tgp1.p();
                throw th;
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
            String str3 = r140Var3.a;
            String str4 = r140Var3.b;
            o95 o95Var7 = o95Var;
            String str5 = r140Var3.c;
            int iIntValue2 = z9 ? ((Number) tob1VarC2.getValue()).intValue() : ((Number) tob1VarC.getValue()).intValue();
            boolean z12 = z10 && ((Boolean) ven0Var3.getValue()).booleanValue();
            String str6 = r140Var3.e;
            boolean z13 = r140Var3.f;
            String str7 = (z10 && ((Boolean) ven0Var3.getValue()).booleanValue()) ? str : th;
            boolean zI2 = b0kVar2.i(ven0Var);
            Object objT9 = b0kVar2.T();
            if (zI2) {
                z5 = z13;
            } else {
                z5 = z13;
                if (objT9 == m4cVar) {
                }
                qim0 qim0VarC = i541.C(lrn1.u(nim0Var, (iu30) objT9), new b240(z9, ((Number) o95Var7.e()).floatValue(), z10, ((Number) o95Var3.e()).floatValue()));
                int i3 = (i2 >> 15) & 14;
                z6 = z9;
                r140 r140Var5 = r140Var4;
                b0kVar3 = b0kVar2;
                z7 = z11;
                t3p1.j(str3, str4, str5, str4, z12, iIntValue2, qim0VarC, str6, z5, str7, z4, b0kVar3, 0, i3, 0);
                String str8 = r140Var5.a;
                String str9 = r140Var5.b;
                String str10 = r140Var5.c;
                if (z6) {
                    iIntValue = ((Number) tob1VarC.getValue()).intValue();
                } else {
                    iIntValue = ((Number) tob1VarC2.getValue()).intValue();
                }
                int i4 = iIntValue;
                if (z7 || !((Boolean) ven0Var3.getValue()).booleanValue()) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                String str11 = r140Var5.e;
                boolean z14 = r140Var5.f;
                if (z7 || !((Boolean) ven0Var3.getValue()).booleanValue()) {
                    str2 = th;
                } else {
                    str2 = str;
                }
                t3p1.j(str8, str9, str10, str9, z8, i4, i541.C(nim0Var, new b240(z6, ((Number) o95Var2.e()).floatValue(), z7, ((Number) o95Var3.e()).floatValue())), str11, z14, str2, z4, b0kVar3, 0, i3, 0);
                b0kVar3.r(true);
            }
            objT9 = new i030(ven0Var, (byte) 6);
            b0kVar2.s0(objT9);
            qim0 qim0VarC2 = i541.C(lrn1.u(nim0Var, (iu30) objT9), new b240(z9, ((Number) o95Var7.e()).floatValue(), z10, ((Number) o95Var3.e()).floatValue()));
            int i5 = (i2 >> 15) & 14;
            z6 = z9;
            r140 r140Var6 = r140Var4;
            b0kVar3 = b0kVar2;
            z7 = z11;
            t3p1.j(str3, str4, str5, str4, z12, iIntValue2, qim0VarC2, str6, z5, str7, z4, b0kVar3, 0, i5, 0);
            String str12 = r140Var6.a;
            String str13 = r140Var6.b;
            String str14 = r140Var6.c;
            if (z6) {
                iIntValue = ((Number) tob1VarC.getValue()).intValue();
            } else {
                iIntValue = ((Number) tob1VarC2.getValue()).intValue();
            }
            int i6 = iIntValue;
            if (z7) {
                z8 = false;
            } else {
                z8 = false;
            }
            String str15 = r140Var6.e;
            boolean z15 = r140Var6.f;
            if (z7) {
                str2 = th;
            } else {
                str2 = th;
            }
            t3p1.j(str12, str13, str14, str13, z8, i6, i541.C(nim0Var, new b240(z6, ((Number) o95Var2.e()).floatValue(), z7, ((Number) o95Var3.e()).floatValue())), str15, z15, str2, z4, b0kVar3, 0, i5, 0);
            b0kVar3.r(true);
        } else {
            b0kVar3.b0();
        }
        h311 h311VarV = b0kVar3.v();
        if (h311VarV != null) {
            h311VarV.d = new a240(r140Var, r140Var2, z, z2, z3, z4, str, i);
        }
    }

    public static final void f(int i, String str, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1815451057);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(qim0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function0) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            ncf0 ncf0VarG = h5p1.G(new pcf0(str), (String) null, (xu30) null, x340Var, 0, 62);
            kbf0 kbf0VarN = zpn1.n(ncf0VarG.c(), true, false, (bcf0) null, 0.0f, Integer.MAX_VALUE, x340Var, 956);
            if (((Boolean) ncf0VarG.e.getValue()).booleanValue()) {
                x340Var.i0(1874654980);
                boolean z = (i2 & 896) == 256;
                Object objT = x340Var.T();
                if (z || objT == m4cVar) {
                    objT = new to1(function0, (lnm) null, (byte) 17);
                    x340Var.s0(objT);
                }
                qxd0.t(rih1.a, x340Var, (vu30) objT);
                x340Var.r(false);
            } else {
                x340Var.i0(1874698225);
                x340Var.r(false);
            }
            fcf0 fcf0VarC = ncf0VarG.c();
            gra graVar = een.e;
            boolean zG = x340Var.g(kbf0VarN);
            Object objT2 = x340Var.T();
            if (zG || objT2 == m4cVar) {
                objT2 = new uk1(kbf0VarN, (byte) 16);
                x340Var.s0(objT2);
            }
            mp10.e(fcf0VarC, (Function0) objT2, qim0Var, false, false, false, (xc21) null, false, (ddf0) null, graVar, (j6m) null, false, false, (Map) null, (jj7) null, false, x340Var, ((i2 << 3) & 896) | 805306368, 0, 65016);
            x340Var = x340Var;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new o82(str, qim0Var, function0, i, (byte) 11);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void g(s140 s140Var, b0k b0kVar, int i) throws Throwable {
        int i2;
        r140 r140Var = s140Var.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1487709155);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(s140Var) : x340Var.i(s140Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            p140 p140Var = s140Var.b;
            if (p140Var instanceof p140) {
                x340Var.i0(576048218);
                l(r140Var, p140Var.a, s140Var.c, s140Var.d, x340Var, 0);
                x340Var.r(false);
            } else {
                if (!(p140Var instanceof o140)) {
                    throw p3d1.k(x340Var, -535609215, false);
                }
                x340Var.i0(576366836);
                o140 o140Var = (o140) p140Var;
                d(r140Var.a, o140Var.a, o140Var.b, o140Var.c, s140Var.c, s140Var.d, o140Var.d, x340Var, 0);
                x340Var = x340Var;
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new du0(s140Var, i, (byte) 29);
        }
    }

    public static final void h(uoa uoaVar, o2u0 o2u0Var, ji0 ji0Var, op0 op0Var, xpw xpwVar, xpw xpwVar2, Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i) {
        ji0 ji0Var2;
        qim0 qim0Var2;
        Function0 function2;
        qim0 qim0Var3;
        m4c m4cVar = fkj0.X;
        String str = ji0Var.U0;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-813888885);
        j06 j06Var = ((x340) b0kVar2).a;
        int i2 = i | (b0kVar2.i(uoaVar) ? 4 : 2) | (b0kVar2.i(o2u0Var) ? 32 : 16) | (b0kVar2.i(ji0Var) ? 256 : 128) | (b0kVar2.i(op0Var) ? 2048 : 1024) | (b0kVar2.i(xpwVar) ? 16384 : 8192) | (b0kVar2.i(xpwVar2) ? 131072 : 65536) | (b0kVar2.i(function1) ? 8388608 : 4194304) | 100663296;
        if (b0kVar2.Y(i2 & 1, (i2 & 38347923) != 38347922)) {
            uvb0 uvb0Var = (crl1) b0kVar2.k(t4k.u);
            Object objT = b0kVar2.T();
            if (objT == m4cVar) {
                objT = new j160(function0, (byte) 17);
                b0kVar2.s0(objT);
            }
            q3p1.b(0, 1, (Function0) objT, b0kVar2, false);
            boolean zI = b0kVar2.i(o2u0Var) | b0kVar2.i(uoaVar);
            Object objT2 = b0kVar2.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new r790(o2u0Var, uoaVar, (lnm) null);
                b0kVar2.s0(objT2);
            }
            qxd0.t(o2u0Var, b0kVar2, (vu30) objT2);
            uvb0 uvb0Var2 = uvb0Var;
            Boolean boolValueOf = Boolean.valueOf(uvb0Var2.b());
            boolean zI2 = b0kVar2.i(uvb0Var2) | b0kVar2.i(uoaVar);
            Object objT3 = b0kVar2.T();
            if (zI2 || objT3 == m4cVar) {
                objT3 = new y160(uvb0Var2, uoaVar, null, (byte) 14);
                b0kVar2.s0(objT3);
            }
            qxd0.t(boolValueOf, b0kVar2, (vu30) objT3);
            qim0 qim0Var4 = nim0.a;
            qim0 qim0VarD = u291.d(qim0Var4, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarF = dug.f(qim0VarD, cbx.a(b0kVar2).a.c, d4o1.a);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            boolean z = ((x340) b0kVar2).S;
            Function0 function3 = hmb0.t1;
            if (z) {
                b0kVar2.l(function3);
            } else {
                b0kVar2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, b0kVar2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar2, lljVar3);
            nko1.F(b0kVar2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, b0kVar2, lljVar4);
            boolean zI3 = b0kVar2.i(uoaVar);
            Object objT4 = b0kVar2.T();
            if (zI3 || objT4 == m4cVar) {
                objT4 = new cu0(uoaVar, (byte) 4);
                b0kVar2.s0(objT4);
            }
            iu30 iu30Var = (iu30) objT4;
            qim0 qim0VarD2 = u291.d(qim0Var4, 1.0f);
            boolean zI4 = b0kVar2.i(uoaVar);
            Object objT5 = b0kVar2.T();
            if (zI4 || objT5 == m4cVar) {
                objT5 = new cu0(uoaVar, (byte) 5);
                b0kVar2.s0(objT5);
            }
            dm5.b(iu30Var, qim0VarD2, (iu30) null, (iu30) objT5, (iu30) null, b0kVar2, 0, 20);
            i(u291.d(qim0Var4, 1.0f), b0kVar2, 0);
            qim0 qim0VarY = voo1.y(u291.f(qim0Var4, 1.0f), voo1.e);
            cvx cvxVar = cbx.b(b0kVar2).b;
            qim0 qim0VarZ = uyn1.z(12.0f, 0.0f, 2, qim0VarY);
            gra graVar = een.f;
            h2c h2cVar = h2c.a;
            qim0 qim0VarA = h2cVar.a(qim0VarZ, graVar);
            jw31 jw31VarA = ew31.a(h36.b, een.Z, b0kVar2, 0);
            int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM2 = b0kVar2.m();
            qim0 qim0VarE2 = zr7.E(b0kVar2, qim0VarA);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(function3);
            } else {
                b0kVar2.v0();
            }
            nko1.H(jw31VarA, b0kVar2, lljVar);
            nko1.H(xos0VarM2, b0kVar2, lljVar2);
            x0d.q(iHashCode2, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE2, b0kVar2, lljVar4);
            cs10 cs10Var = new cs10(false);
            String str2 = ji0Var.U0;
            String str3 = ji0Var.c;
            String str4 = ji0Var.i;
            String str5 = ji0Var.b;
            String value = ji0Var.Z.getValue();
            String str6 = ji0Var.W0;
            String str7 = ji0Var.Y0.a;
            Object objT6 = b0kVar2.T();
            if (objT6 == m4cVar) {
                objT6 = o390.d;
                b0kVar2.s0(objT6);
            }
            ji0Var2 = ji0Var;
            b0kVar2 = b0kVar2;
            otw.c(op0Var, new kp0(cs10Var, str2, str3, ji0Var, str4, str5, value, str6, str7, true, (iu30) objT6), (qim0) null, (ipb1) null, b0kVar2, (i2 >> 9) & 14, 12);
            b0kVar2.r(true);
            qim0 qim0VarY2 = voo1.y(h2cVar.a(u291.f(qim0Var4, 1.0f), een.X), voo1.g);
            cvx cvxVar2 = cbx.b(b0kVar2).b;
            qim0 qim0VarB = uyn1.B(qim0VarY2, 0.0f, 0.0f, 0.0f, 16.0f, 7);
            era eraVar = een.P0;
            f36 f36Var = h36.c;
            mbh mbhVarA = jbh.a(f36Var, eraVar, b0kVar2, 0);
            int iHashCode3 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM3 = b0kVar2.m();
            qim0 qim0VarE3 = zr7.E(b0kVar2, qim0VarB);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                function2 = function3;
                b0kVar2.l(function2);
            } else {
                function2 = function3;
                b0kVar2.v0();
            }
            nko1.H(mbhVarA, b0kVar2, lljVar);
            nko1.H(xos0VarM3, b0kVar2, lljVar2);
            x0d.q(iHashCode3, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE3, b0kVar2, lljVar4);
            qim0 qim0VarF2 = u291.f(qim0Var4, 1.0f);
            boolean zB = ji0Var2.b();
            boolean z2 = (i2 & 29360128) == 8388608;
            Object objT7 = b0kVar2.T();
            if (z2 || objT7 == m4cVar) {
                objT7 = new j160(function1, (byte) 18);
                b0kVar2.s0(objT7);
            }
            qim0 qim0VarX = bin.x(qim0VarF2, zB, (String) null, (pm31) null, (idn0) null, (Function0) objT7, 14);
            float f2 = cbx.b(b0kVar2).b.b;
            cvx cvxVar3 = cbx.b(b0kVar2).b;
            qim0 qim0VarY3 = uyn1.y(qim0VarX, f2, 8.0f);
            jw31 jw31VarA2 = ew31.a(h36.a, een.N0, b0kVar2, 0);
            int iHashCode4 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM4 = b0kVar2.m();
            qim0 qim0VarE4 = zr7.E(b0kVar2, qim0VarY3);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(function2);
            } else {
                b0kVar2.v0();
            }
            nko1.H(jw31VarA2, b0kVar2, lljVar);
            nko1.H(xos0VarM4, b0kVar2, lljVar2);
            x0d.q(iHashCode4, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE4, b0kVar2, lljVar4);
            if (str == null || ihc1.y0(str)) {
                qim0Var3 = qim0Var4;
                b0kVar2.i0(-913721833);
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(-914008211);
                Uri uri = Uri.parse(str);
                zov0 zov0Var = cbx.b(b0kVar2).g;
                eso1.e(uri, isl.a, (qim0) null, new p3v(48.0f), (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, b0kVar2, 48, 0, 4084);
                cvx cvxVar4 = cbx.b(b0kVar2).b;
                qim0Var3 = qim0Var4;
                ab80.p(qim0Var3, 12.0f, b0kVar2, false);
            }
            mbh mbhVarA2 = jbh.a(f36Var, eraVar, b0kVar2, 0);
            int iHashCode5 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM5 = b0kVar2.m();
            qim0 qim0VarE5 = zr7.E(b0kVar2, qim0Var3);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(function2);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA2, b0kVar2, lljVar);
            nko1.H(xos0VarM5, b0kVar2, lljVar2);
            x0d.q(iHashCode5, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE5, b0kVar2, lljVar4);
            uwo1.e(ji0Var2.c, (qim0) null, cbx.d(b0kVar2).e, cbx.a(b0kVar2).b.a, (a0e1) null, (iu30) null, 0, false, new cjc0(1), 0, (qx8) null, b0kVar2, 0, 0, 1778);
            uwo1.e(cwl1.n0(2131952029, new Object[]{1, 1}, b0kVar2), (qim0) null, cbx.d(b0kVar2).j, ((vex) zex.a.e).m, (a0e1) null, (iu30) null, 0, false, new cjc0(1), 0, (qx8) null, b0kVar2, 0, 0, 1778);
            b0kVar2.r(true);
            b0kVar2.r(true);
            qim0 qim0VarZ2 = uyn1.z(cbx.b(b0kVar2).b.a, 0.0f, 2, u291.f(qim0Var3, 1.0f));
            mbh mbhVarA3 = jbh.a(f36Var, eraVar, b0kVar2, 0);
            int iHashCode6 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM6 = b0kVar2.m();
            qim0 qim0VarE6 = zr7.E(b0kVar2, qim0VarZ2);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(function2);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA3, b0kVar2, lljVar);
            nko1.H(xos0VarM6, b0kVar2, lljVar2);
            x0d.q(iHashCode6, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE6, b0kVar2, lljVar4);
            rih1 rih1Var = rih1.a;
            Function0 function4 = function2;
            otw.c(xpwVar, rih1Var, (qim0) null, (ipb1) null, b0kVar2, ((i2 >> 12) & 14) | 48, 12);
            b0kVar2.r(true);
            cvx cvxVar5 = cbx.b(b0kVar2).b;
            qim0 qim0VarZ3 = uyn1.z(cbx.b(b0kVar2).b.a, 0.0f, 2, ab80.o(qim0Var3, 16.0f, b0kVar2, qim0Var3, 1.0f));
            mbh mbhVarA4 = jbh.a(f36Var, eraVar, b0kVar2, 0);
            int iHashCode7 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM7 = b0kVar2.m();
            qim0 qim0VarE7 = zr7.E(b0kVar2, qim0VarZ3);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(function4);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA4, b0kVar2, lljVar);
            nko1.H(xos0VarM7, b0kVar2, lljVar2);
            x0d.q(iHashCode7, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE7, b0kVar2, lljVar4);
            otw.c(xpwVar2, rih1Var, (qim0) null, (ipb1) null, b0kVar2, ((i2 >> 15) & 14) | 48, 12);
            us71.m(b0kVar2, true, true, true);
            qim0Var2 = qim0Var3;
        } else {
            ji0Var2 = ji0Var;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new zx(uoaVar, o2u0Var, ji0Var2, op0Var, xpwVar, xpwVar2, function0, function1, qim0Var2, i, (byte) 6);
        }
    }

    public static final void i(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1325112890);
        int i2 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            long j = ((vex) zex.a.b).a;
            boolean zF = x340Var.f(j);
            Object objT = x340Var.T();
            if (zF || objT == fkj0.X) {
                objT = v9c.t((mmr0[]) Arrays.copyOf(new mmr0[]{new mmr0(Float.valueOf(0.0f), new u7h(u7h.b(j, 0.7f, 0.0f, 0.0f, 0.0f, 14))), new mmr0(Float.valueOf(0.3f), new u7h(u7h.b(j, 0.0f, 0.0f, 0.0f, 0.0f, 14))), new mmr0(Float.valueOf(0.35f), new u7h(u7h.b(j, 0.0f, 0.0f, 0.0f, 0.0f, 14))), new mmr0(Float.valueOf(1.0f), new u7h(u7h.b(j, 0.8f, 0.0f, 0.0f, 0.0f, 14)))}, 4), 0.0f, 0.0f, 14);
                x340Var.s0(objT);
            }
            t1c.a(dug.e(qim0Var, (Brush) objT, (hw61) null, 0.0f, 6), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ns30(qim0Var, i, (byte) 13);
        }
    }

    public static final void j(int i, String str, b0k b0kVar, iu30 iu30Var) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(471019584);
        int i2 = (b0kVar3.g(str) ? 4 : 2) | i | (b0kVar3.i(iu30Var) ? 32 : 16);
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 14) == 4;
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                objT = gf5.a(str, iu30Var);
                b0kVar3.s0(objT);
            }
            uwr uwrVar = cbx.a;
            b0kVar2 = b0kVar3;
            uwo1.d((af5) objT, cbx.a(b0kVar3).b.b, (qim0) null, cbx.d(b0kVar3).j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (cqs0) null, b0kVar2, 0, 0, 4084);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new qgd(str, iu30Var, i, (byte) 2);
        }
    }

    public static final void k(mhm0 mhm0Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1860478274);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(mhm0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.e(l1d.C(6)) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(qim0Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            pe peVarA = ef.a(x340Var);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(new dgm0(""));
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            k8c0 k8c0Var = k8c0.ON_RESUME;
            boolean zI = ((i2 & 112) == 32) | x340Var.i(peVarA) | ((i2 & 14) == 4);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new d4v0(peVarA, mhm0Var, ven0Var, (byte) 23);
                x340Var.s0(objT2);
            }
            cso1.j(k8c0Var, (iac0) null, (Function0) objT2, x340Var, 6);
            uwr uwrVar = cbx.a;
            long jA = cbx.a(x340Var).a.a.a();
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                i9h i9hVar = new i9h(jA);
                objT3 = new pux(i9hVar, i9hVar);
                x340Var.s0(objT3);
            }
            pux puxVar = (pux) objT3;
            wfm0 wfm0Var = (mhm0) ven0Var.getValue();
            if (wfm0Var instanceof wfm0) {
                x340Var.i0(1045410620);
                wfm0 wfm0Var2 = wfm0Var;
                String str = wfm0Var2.a;
                boolean zG = x340Var.g(wfm0Var);
                Object objT4 = x340Var.T();
                if (zG || objT4 == m4cVar) {
                    objT4 = new rl21(wfm0Var2, ven0Var, (byte) 4);
                    x340Var.s0(objT4);
                }
                f((i2 >> 3) & 112, str, (Function0) objT4, x340Var, qim0Var);
                x340Var.r(false);
            } else if (wfm0Var instanceof ygm0) {
                x340Var.i0(1045536697);
                String str2 = ((ygm0) wfm0Var).a;
                Object objT5 = x340Var.T();
                if (objT5 == m4cVar) {
                    objT5 = n521.S0;
                    x340Var.s0(objT5);
                }
                f(((i2 >> 3) & 112) | 384, str2, (Function0) objT5, x340Var, qim0Var);
                x340Var.r(false);
            } else {
                if (!(wfm0Var instanceof dgm0)) {
                    throw p3d1.k(x340Var, -1213204429, false);
                }
                x340Var.i0(1045648669);
                eso1.e(Uri.parse(((dgm0) wfm0Var).a), isl.a, qim0Var, (p3v) null, (zvx) null, (ecx) null, mif1.Q0, een.e, (ColorFilter) null, puxVar, false, false, x340Var, (i2 & 896) | 1088094256, 0, 3352);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wjz0(mhm0Var, qim0Var, i, (byte) 13);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [boolean, int] */
    public static final void l(r140 r140Var, String str, boolean z, boolean z2, b0k b0kVar, int i) {
        ?? r5;
        float f2;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(113114811);
        int i2 = i | (b0kVar2.g(r140Var) ? 4 : 2) | (b0kVar2.g(str) ? 32 : 16) | (b0kVar2.h(z) ? 256 : 128) | (b0kVar2.h(z2) ? 2048 : 1024);
        if (b0kVar2.Y(i2 & 1, (i2 & 1171) != 1170)) {
            pxg1 pxg1VarO0 = z ? irn1.o0(1100, 0, (dlv) null, 6) : irn1.o0(0, 0, (dlv) null, 6);
            Object objT = b0kVar2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = bb00.h(0, b0kVar2);
            }
            err0 err0Var = (hdn0) objT;
            tob1 tob1VarC = z95.c(err0Var.s(), pxg1VarO0, "solo_score_animation", (iu30) null, b0kVar2, 384, 8);
            Integer numValueOf = Integer.valueOf(r140Var.d);
            boolean zI = b0kVar2.i(err0Var) | ((i2 & 14) == 4);
            Object objT2 = b0kVar2.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new h210(r140Var, err0Var, (lnm) null, (byte) 17);
                b0kVar2.s0(objT2);
            }
            qxd0.t(numValueOf, b0kVar2, (vu30) objT2);
            if (z2) {
                b0kVar2.i0(1329174883);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(b0kVar2).b;
                r5 = 0;
                b0kVar2.r(false);
                f2 = 8.0f;
            } else {
                r5 = 0;
                b0kVar2.i0(1329176194);
                uwr uwrVar2 = cbx.a;
                cvx cvxVar2 = cbx.b(b0kVar2).b;
                b0kVar2.r(false);
                f2 = 12.0f;
            }
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            mbh mbhVarA = jbh.a(new d36(f2, true, new um5((boolean) r5)), een.P0, b0kVar2, (int) r5);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarF);
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
            boolean z3 = r5;
            b0kVar2 = b0kVar2;
            t3p1.j(r140Var.a, r140Var.b, r140Var.c, cwl1.o0(b0kVar2, 2131959017), true, ((Number) tob1VarC.getValue()).intValue(), (qim0) null, (String) null, false, (String) null, z2, b0kVar2, 24576, (i2 >> 9) & 14, 960);
            if (str == null) {
                b0kVar2.i0(-1947464906);
            } else {
                b0kVar2.i0(-1947464905);
                xap1.a((i2 >> 3) & 896, str, b0kVar2, (qim0) null, z2);
            }
            b0kVar2.r(z3);
            b0kVar2.r(true);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new pa0(r140Var, str, z, z2, i, (byte) 6);
        }
    }

    public static final g23 m(ajq0 ajq0Var, Set set, xu30 xu30Var) throws Exception {
        w940 w940Var = (w940) ((idd1) ajq0Var.e).getValue();
        v940 v940Var = w940Var != null ? new v940(w940Var) : null;
        try {
            BluetoothManager bluetoothManager = (BluetoothManager) ajq0Var.a;
            Context context = (Context) ajq0Var.b;
            fp8 fp8Var = (fp8) ajq0Var.c;
            qka qkaVar = v940Var != null ? new qka(1, v940Var, v940.class, "dispatch", "dispatch(Lkotlin/jvm/functions/Function0;)Z", 0, (byte) 8) : null;
            boolean zIsEnabled = ((tgb) ajq0Var.d).isEnabled();
            p811 p811Var = new p811();
            BluetoothGattServer bluetoothGattServerOpenGattServer = bluetoothManager.openGattServer(context, new hbc(new zk9(p811Var, (byte) 22), xu30Var, fp8Var, qkaVar, zIsEnabled));
            p811Var.a = bluetoothGattServerOpenGattServer;
            return new g23(bluetoothGattServerOpenGattServer, set, v940Var);
        } catch (Exception e2) {
            if (v940Var == null) {
                throw e2;
            }
            synchronized (v940Var) {
                v940Var.b = true;
                throw e2;
            }
        }
    }

    public static qim0 n(int i, qim0 qim0Var) {
        return qim0Var.then(new tug0((i & 1) != 0 ? 3 : Integer.MAX_VALUE, 0, 1200, yon1.a, 30.0f));
    }

    public static final String o(a9k a9kVar) {
        String str;
        i5d i5dVar = a9kVar.g;
        if (i5dVar == null) {
            return "";
        }
        String str2 = i5dVar.l;
        if (str2.length() == 0) {
            str2 = "unknown";
        }
        ArrayList<u5d> arrayList = i5dVar.g;
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        for (u5d u5dVar : arrayList) {
            if (u5dVar instanceof q5d) {
                str = "remind_me";
            } else if (u5dVar instanceof o5d) {
                str = "join_waitlist";
            } else if (u5dVar instanceof t5d) {
                str = "waitlisted";
            } else if (u5dVar instanceof n5d) {
                str = "cant_attend";
            } else if (u5dVar instanceof p5d) {
                str = "not_interested";
            } else if (u5dVar instanceof m5d) {
                str = "buy_tickets";
            } else if (u5dVar instanceof r5d) {
                str = "see_all_events";
            } else {
                if (!(u5dVar instanceof s5d)) {
                    eg.o();
                    return null;
                }
                str = "share";
            }
            arrayList2.add(str);
        }
        return o7h.y0(o7h.N0(arrayList2, Collections.singletonList(str2)), "|", (String) null, (String) null, (iu30) null, 62);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final String p(String str, b0k b0kVar) {
        switch (str.hashCode()) {
            case -1438754875:
                if (str.equals("allow_always")) {
                    x340 x340Var = (x340) b0kVar;
                    return x0d.k(x340Var, -852208313, 2131952124, x340Var, false);
                }
                break;
            case -1341859401:
                if (str.equals("allow_once")) {
                    x340 x340Var2 = (x340) b0kVar;
                    return x0d.k(x340Var2, -852211003, 2131952127, x340Var2, false);
                }
                break;
            case 3079692:
                if (str.equals("deny")) {
                    x340 x340Var3 = (x340) b0kVar;
                    return x0d.k(x340Var3, -852199169, 2131952128, x340Var3, false);
                }
                break;
            case 978909945:
                if (str.equals("allow_for_all_routines")) {
                    x340 x340Var4 = (x340) b0kVar;
                    return x0d.k(x340Var4, -852201967, 2131952125, x340Var4, false);
                }
                break;
            case 1879971672:
                if (str.equals("allow_for_routine")) {
                    x340 x340Var5 = (x340) b0kVar;
                    return x0d.k(x340Var5, -852205396, 2131952126, x340Var5, false);
                }
                break;
        }
        x340 x340Var6 = (x340) b0kVar;
        x340Var6.i0(-852197040);
        x340Var6.r(false);
        return str;
    }

    public static lr91 q() {
        xj61 xj61Var = new xj61();
        xj61Var.add("StackTrace");
        String canonicalName = kt91.class.getCanonicalName();
        if (canonicalName != null) {
            xj61Var.add(ihc1.J0(canonicalName, kt91.class.getSimpleName()));
        }
        xj61 xj61VarJ = cwl1.j(xj61Var);
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTrace) {
            String strI = xcg1.i(stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName());
            if (xj61VarJ != null && xj61VarJ.a.isEmpty()) {
                arrayList.add(stackTraceElement);
                break;
                break;
            }
            wkg0 it = xj61VarJ.iterator();
            do {
                if (!((g0y) it).hasNext()) {
                    arrayList.add(stackTraceElement);
                    break;
                }
            } while (!ihc1.h0(strI, (String) it.next(), false));
        }
        return new lr91(arrayList);
    }

    public static final String r(s4b1 s4b1Var) {
        String str;
        String strZ = s4b1Var.z();
        return (strZ == null || (str = (String) o7h.s0(ihc1.Q0(strZ, new String[]{"?"}, 0, 6))) == null) ? "" : str;
    }

    public static final String s(s4b1 s4b1Var) {
        Uri uri = s4b1Var.a;
        if (uri != null) {
            return uri.getQueryParameter("itemId");
        }
        return null;
    }

    public static final Set t(f9k f9kVar, boolean z) {
        String str = f9kVar.a;
        if (ihc1.y0(str)) {
            return w7x.a;
        }
        xj61 xj61Var = new xj61();
        if (z) {
            xj61Var.add(new z6k(str, (String) null, (String) null));
        }
        xj61Var.add(new h7k(str));
        xj61Var.add(new i7k(str));
        return cwl1.j(xj61Var);
    }

    public static boolean u(Context context) {
        PackageManager packageManager = context.getPackageManager();
        Boolean boolValueOf = d;
        if (boolValueOf == null) {
            boolean z = false;
            if (wyo1.j() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z = true;
            }
            boolValueOf = Boolean.valueOf(z);
            d = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    public static boolean v(Context context) {
        PackageManager packageManager = context.getPackageManager();
        Boolean boolValueOf = a;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
            a = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    public static boolean w(Context context) {
        v(context);
        Boolean boolValueOf = b;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
            b = boolValueOf;
        }
        if (boolValueOf.booleanValue()) {
            return !wyo1.j() || Build.VERSION.SDK_INT >= 30;
        }
        return false;
    }

    public static final boolean x(a9k a9kVar, String str, String str2, String str3) {
        return u890.j(a9kVar.a, str) && u890.j(a9kVar.b, str2) && u890.j(a9kVar.c, str3);
    }

    public static brl0 y() {
        return new brl0((byte) 29);
    }

    public static void z(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            kw7.J(view, charSequence);
            return;
        }
        c4f1 c4f1Var = c4f1.X;
        if (c4f1Var != null && c4f1Var.a == view) {
            c4f1.b((c4f1) null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new c4f1(view, charSequence);
            return;
        }
        c4f1 c4f1Var2 = c4f1.Y;
        if (c4f1Var2 != null && c4f1Var2.a == view) {
            c4f1Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }
}
