package p;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.widget.ImageView;
import androidx.compose.ui.graphics.ColorFilter;
import com.spotify.listplatform.contextmenu.ItemUnavailableException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class u2p1 {
    public static b180 a;
    public static b180 b;

    public static final void a(int i, String str, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        qim0 qim0Var3;
        boolean z;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1154868416);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0Var4 = nim0.a;
            qim0 qim0VarB = uyn1.B(qim0Var4, 16.0f, 0.0f, 0.0f, 0.0f, 14);
            zov0 zov0Var = cbx.b(x340Var).g;
            qim0 qim0VarR = u291.r(qim0VarB, 48.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarR);
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
            if (str.length() > 0) {
                x340Var.i0(-869004062);
                qim0Var3 = qim0Var4;
                z = true;
                eso1.e(Uri.parse(str), isl.a, u291.d(qim0Var4, 1.0f), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var, 3120, 0, 4080);
                x340Var.r(false);
            } else {
                qim0Var3 = qim0Var4;
                z = true;
                x340Var.i0(-868813784);
                x340Var.r(false);
            }
            x340Var.r(z);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rj(str, qim0Var2, i, (byte) 8);
        }
    }

    public static final void b(nk11 nk11Var, j2i j2iVar, gbx gbxVar, b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1984967837);
        int i2 = i | (b0kVar3.g(nk11Var) ? 4 : 2) | (b0kVar3.i(gbxVar) ? 256 : 128);
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0VarN = anm1.N("related_content_discovery_row", nim0.a);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            uvx uvxVar = new uvx(0, (pgx) null, 4, new zzq0(16.0f, 8.0f, 16.0f, 8.0f), (zzq0) null, (tvx) null, (hw61) null, 0, (p3v) null, 499);
            String str = nk11Var.d;
            xu30 xu30VarR = null;
            Uri uri = str != null ? Uri.parse(str) : null;
            if (uri == null) {
                b0kVar3.i0(-1066540320);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(-1066540319);
                xu30VarR = apo.r(1293727725, new k0c0(uri, (byte) 2), b0kVar3);
                b0kVar3.r(false);
            }
            b0kVar2 = b0kVar3;
            jto1.b(qim0VarN, uvxVar, null, false, null, null, gbxVar, null, null, xu30VarR, null, apo.r(-852297429, new qk11(nk11Var, (byte) 0), b0kVar3), j2iVar, null, null, apo.r(-705796441, new qk11(nk11Var, (byte) 1), b0kVar3), b0kVar2, 64 | ((i2 << 12) & 3670016), 197040, 26044);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ffx0(nk11Var, j2iVar, gbxVar, i, (byte) 29);
        }
    }

    public static final void c(wn9 wn9Var, j2i j2iVar, j2i j2iVar2, j2i j2iVar3, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        j2i j2iVar4;
        j2i j2iVar5;
        qim0 qim0Var2;
        qim0 qim0Var3;
        qim0 qim0VarB;
        boolean z;
        boolean z2 = wn9Var.c;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1634447165);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.i(wn9Var) ? 4 : 2) | (x340Var.i(function0) ? 16384 : 8192) | 196608;
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            qim0 qim0Var4 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var4, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarF2 = dug.f(qim0VarF, z4p1.t(((vex) zex.a.e).e, z4p1.e(wn9Var.a.a)), d4o1.a);
            u85 u85Var = (erl1) x340Var.k(szf0.b);
            if (u85Var == null) {
                x340Var.i0(-241884180);
                WeakHashMap weakHashMap = osl1.x;
                u85Var = lhc.g(x340Var).g;
            } else {
                x340Var.i0(-241885792);
            }
            x340Var.r(false);
            qim0 qim0VarY = too1.y(qim0VarF2, new bgc0(u85Var, 16));
            if (z2) {
                x340Var.i0(-228202990);
                qim0Var3 = qim0Var4;
                qim0 qim0VarX = bin.x(qim0Var3, false, cwl1.o0(x340Var, 2131953074), null, null, function0, 13);
                cvx cvxVar = cbx.b(x340Var).b;
                cvx cvxVar2 = cbx.b(x340Var).b;
                qim0VarB = uyn1.B(qim0VarX, 0.0f, 0.0f, 16.0f, 8.0f, 3);
                x340Var.r(false);
            } else {
                qim0Var3 = qim0Var4;
                x340Var.i0(-227870205);
                x340Var.r(false);
                qim0VarB = qim0Var3;
            }
            qim0 qim0VarThen = qim0VarY.then(qim0VarB);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarThen);
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
            nko1.H(jw31VarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            if (z2) {
                x340Var.i0(-1307955108);
                a(0, wn9Var.b, x340Var, null);
                wnb0 wnb0Var = new wnb0(1.0f, true);
                cvx cvxVar3 = cbx.b(x340Var).b;
                qim0 qim0VarZ = uyn1.z(8.0f, 0.0f, 2, wnb0Var);
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarZ);
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
                j2iVar4 = j2iVar;
                j2iVar4.invoke(x340Var, 6);
                z = true;
                x340Var.r(true);
                j2iVar5 = j2iVar2;
                j2iVar5.invoke(x340Var, 6);
                j2iVar3.invoke(x340Var, 6);
                x340Var.r(false);
            } else {
                j2iVar4 = j2iVar;
                j2iVar5 = j2iVar2;
                z = true;
                x340Var.i0(-1307735039);
                x340Var.r(false);
            }
            x340Var.r(z);
            qim0Var2 = qim0Var3;
        } else {
            j2iVar4 = j2iVar;
            j2iVar5 = j2iVar2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new k40(wn9Var, j2iVar4, j2iVar5, j2iVar3, function0, qim0Var2, i, (byte) 8);
        }
    }

    public static final void d(dp71 dp71Var, iu30 iu30Var, jwf0 jwf0Var, mxf0 mxf0Var, q251 q251Var, yp71 yp71Var, tln tlnVar, d6o0 d6o0Var, cb0 cb0Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        iu30 iu30Var2;
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1400983162);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(dp71Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            iu30Var2 = iu30Var;
            i2 |= b0kVar3.i(iu30Var2) ? 32 : 16;
        } else {
            iu30Var2 = iu30Var;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? b0kVar3.g(jwf0Var) : b0kVar3.i(jwf0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? b0kVar3.g(mxf0Var) : b0kVar3.i(mxf0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar3.i(q251Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= b0kVar3.i(yp71Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= b0kVar3.i(tlnVar) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= b0kVar3.i(d6o0Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= b0kVar3.i(cb0Var) ? 67108864 : 33554432;
        }
        int i3 = i2 | 805306368;
        if (b0kVar3.Y(i3 & 1, (306783379 & i3) != 306783378)) {
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.FALSE);
                b0kVar3.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            ven0 ven0VarH = rwq.h(yp71Var.t, b0kVar3, 0);
            Object[] objArr = new Object[0];
            Object objT2 = b0kVar3.T();
            if (objT2 == m4cVar) {
                objT2 = da71.N0;
                b0kVar3.s0(objT2);
            }
            ven0 ven0Var2 = (ven0) k5p1.s(objArr, (Function0) objT2, b0kVar3, 48);
            boolean z = dp71Var.d && ((String) ven0Var2.getValue()).length() == 0;
            j2i j2iVarR = apo.r(671886602, new dj71(dp71Var, (byte) 3), b0kVar3);
            j2i j2iVarR2 = apo.r(603145115, new kb60(d6o0Var, tlnVar, dp71Var, iu30Var2, mxf0Var, yp71Var, z, cb0Var, ven0Var2, jwf0Var, ven0Var), b0kVar3);
            boolean zG = b0kVar3.g(ven0Var2);
            Object objT3 = b0kVar3.T();
            if (zG || objT3 == m4cVar) {
                objT3 = new r9y0(ven0Var2, (byte) 28);
                b0kVar3.s0(objT3);
            }
            qim0 qim0Var3 = nim0.a;
            b0kVar2 = b0kVar3;
            fuo1.a(j2iVarR, j2iVarR2, q251Var, (iu30) objT3, qim0Var3, false, b0kVar2, ((i3 >> 6) & 896) | 54 | ((i3 >> 15) & 57344), 32);
            if (((Boolean) ven0Var.getValue()).booleanValue() || ((Boolean) ven0VarH.getValue()).booleanValue()) {
                b0kVar2.i0(-1796896582);
                qim0 qim0VarD = u291.d(qim0Var3, 1.0f);
                uwr uwrVar = cbx.a;
                qim0 qim0VarF = dug.f(qim0VarD, u7h.b(cbx.a(b0kVar2).a.c, 0.6f, 0.0f, 0.0f, 0.0f, 14), d4o1.a);
                gfh0 gfh0VarC = t1c.c(een.h, false);
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
                nko1.H(gfh0VarC, b0kVar2, y580.O0);
                nko1.H(xos0VarM, b0kVar2, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
                nko1.F(b0kVar2);
                nko1.H(qim0VarE, b0kVar2, y580.Y);
                xto1.e(u291.B(qim0Var3, (gra) null, 3), 6, 0L, 0L, b0kVar2, 54, 12);
                b0kVar2.r(true);
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(-1796575608);
                b0kVar2.r(false);
            }
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new is9(dp71Var, iu30Var, jwf0Var, mxf0Var, q251Var, yp71Var, tlnVar, d6o0Var, cb0Var, qim0Var2, i);
        }
    }

    public static final void e(int i, int i2, int i3, b0k b0kVar) {
        byte b2;
        lee1 lee1Var;
        Object objValueOf;
        lee1 lee1Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-70200255);
        j06 j06Var = x340Var.a;
        int i4 = i3 | (x340Var.e(i2) ? 32 : 16);
        if (x340Var.Y(i4 & 1, (i4 & 19) != 18)) {
            Object objT = x340Var.T();
            Object obj = fkj0.X;
            if (objT == obj) {
                objT = uak0.b;
                x340Var.s0(objT);
            }
            nim0 nim0Var = nim0.a;
            qim0 qim0VarB = s161.b(nim0Var, true, (iu30) objT);
            jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
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
            nko1.H(qim0VarE, x340Var, lljVar4);
            uwr uwrVar = cbx.a;
            lee1 lee1Var3 = cbx.d(x340Var).n;
            lee1 lee1Var4 = cbx.d(x340Var).j;
            yae1 yae1VarQ = d5p1.q(0, x340Var, 1);
            boolean zG = x340Var.g(yae1VarQ);
            Object objT2 = x340Var.T();
            if (zG || objT2 == obj) {
                lee1Var = lee1Var3;
                objValueOf = Integer.valueOf((int) (yae1.a(yae1VarQ, "", lee1Var3, 0, false, 0, 0L, (flb0) null, (xat) null, 1020).c & 4294967295L));
                x340Var.s0(objValueOf);
            } else {
                lee1Var = lee1Var3;
                objValueOf = objT2;
            }
            int iIntValue = ((Number) objValueOf).intValue();
            boolean zG2 = x340Var.g(yae1VarQ);
            Object objT3 = x340Var.T();
            if (zG2 || objT3 == obj) {
                lee1Var2 = lee1Var4;
                objT3 = Integer.valueOf((int) (yae1.a(yae1VarQ, "", lee1Var4, 0, false, 0, 0L, (flb0) null, (xat) null, 1020).c & 4294967295L));
                x340Var.s0(objT3);
            } else {
                lee1Var2 = lee1Var4;
            }
            int iIntValue2 = ((Number) objT3).intValue();
            x340Var.i0(-932417953);
            wat watVar = (wat) x340Var.k(t4k.h);
            qim0 qim0VarH = u291.h(nim0Var, watVar.M0(iIntValue2));
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarH);
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
            b2 = 0;
            uwo1.e(String.valueOf(i), u291.r(dug.f(nim0Var, ((u7h) x340Var.k(qgx.a)).a, er31.a), watVar.M0(iIntValue)), lee1Var, ((vex) zex.a.b).a, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2016);
            x340Var.r(true);
            x340Var.r(false);
            cvx cvxVar = cbx.b(x340Var).b;
            op71.g(x340Var, u291.v(nim0Var, 8.0f));
            uwo1.e(cwl1.o0(x340Var, i2), null, lee1Var2, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2042);
            x340Var.r(true);
        } else {
            b2 = 0;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vak0(i, i2, i3, b2);
        }
    }

    public static final void f(b0k b0kVar, int i) {
        j2i j2iVar = z1j.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(543206149);
        if (x340Var.Y(i & 1, (i & 3) != 2)) {
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            uwr uwrVar = cbx.a;
            long jC = cbx.a(x340Var).a.a.c();
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarF2 = dug.f(qim0VarF, jC, er31.b(8.0f));
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarX = uyn1.x(qim0VarF2, 16.0f);
            cvx cvxVar2 = cbx.b(x340Var).b;
            mbh mbhVarA = jbh.a(new d36(12.0f, true, new um5(false)), een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
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
            b3o1.e(cbx.a(x340Var).b.b, apo.r(-173216238, new ry90((byte) 25, 2, false), x340Var), x340Var, 48);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ry90(i);
        }
    }

    public static final long g(long j, int i, int i2, int i3) {
        int i4;
        int iG = nbe1.g(j);
        int iF = nbe1.f(j);
        if (iF < i) {
            return j;
        }
        if (iG <= i && i2 <= iF) {
            i4 = i3 - (i2 - i);
            if (iG == iF) {
            }
            i = iF + i4;
            return e6p1.e(iG, i);
        }
        if (iG > i && iF < i2) {
            i += i3;
            iG = i;
        } else if (iG >= i2) {
            i4 = i3 - (i2 - i);
        } else if (i < iG) {
            iG = i + i3;
            i = (i3 - (i2 - i)) + iF;
        }
        return e6p1.e(iG, i);
        iG += i4;
        i = iF + i4;
        return e6p1.e(iG, i);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.coroutines.flow.internal.AbortFlowException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object h(ay8 ay8Var, onm onmVar) throws ItemUnavailableException, AbortFlowException {
        umj1 umj1Var;
        if (onmVar instanceof umj1) {
            umj1Var = (umj1) onmVar;
            int i = umj1Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                umj1Var.b = i - Integer.MIN_VALUE;
            } else {
                umj1Var = new umj1(onmVar);
            }
        } else {
            umj1Var = new umj1(onmVar);
        }
        Object objJ = umj1Var.a;
        int i2 = umj1Var.b;
        if (i2 == 0) {
            hm5.M(objJ);
            q1c1 q1c1Var = new q1c1(2, (lnm) null, (byte) 26);
            umj1Var.b = 1;
            objJ = b5p1.j(ay8Var, q1c1Var, umj1Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        Object objG = u890.G((k1r) objJ);
        if (objG != null) {
            return objG;
        }
        throw new ItemUnavailableException();
    }

    public static final mgc i(go20 go20Var) {
        return new mgc(zn20.b, go20Var);
    }

    public static final mgc j(go20 go20Var) {
        return new mgc(bo20.b, go20Var);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0026 A[SYNTHETIC] */
    public static final ArrayList k(List list, List list2) {
        yde1 kye1Var;
        n36 n36Var = new n36(o7h.a1(list2, new k0d((byte) 17)));
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        int i = -1;
        int i2 = 0;
        while (it.hasNext()) {
            yde1 li10Var = (of51) it.next();
            if (!n36Var.isEmpty() && li10Var.p() + i2 >= ((oi0) n36Var.first()).a) {
                oi0 oi0Var = (oi0) n36Var.removeFirst();
                int i3 = oi0Var.a;
                int i4 = oi0Var.b;
                arrayList.add(new gw0(i3, i4));
                i2 += oi0Var.c - oi0Var.d;
                i = i4;
            }
            if (li10Var instanceof yde1) {
                yde1 yde1Var = li10Var;
                int i5 = yde1Var.a + i2;
                List<mbe1> list3 = yde1Var.c;
                ArrayList arrayList2 = new ArrayList(q7h.U(list3, 10));
                for (mbe1 mbe1Var : list3) {
                    arrayList2.add(mbe1.a(mbe1Var, mbe1Var.a + i2, 0, 6));
                }
                kye1Var = new yde1(yde1Var.b, arrayList2, i5);
            } else {
                if (li10Var instanceof j2n0) {
                    j2n0 j2n0Var = (j2n0) li10Var;
                    li10Var = new j2n0(j2n0Var.c, j2n0Var.a + i2, j2n0Var.b + i2, j2n0Var.d);
                } else if (li10Var instanceof spy) {
                    spy spyVar = (spy) li10Var;
                    kye1Var = new spy(spyVar.a + i2, spyVar.b, spyVar.c, spyVar.d, spyVar.e, spyVar.f, spyVar.g, spyVar.h);
                } else if (li10Var instanceof li10) {
                    li10Var = new li10(((li10) li10Var).a + i2);
                } else if (li10Var instanceof kz70) {
                    kz70 kz70Var = (kz70) li10Var;
                    kye1Var = new kz70(kz70Var.a + i2, kz70Var.b, kz70Var.c, kz70Var.d, kz70Var.e, kz70Var.f, kz70Var.g);
                } else if (li10Var instanceof r7f0) {
                    r7f0 r7f0Var = (r7f0) li10Var;
                    kye1Var = new r7f0(r7f0Var.a + i2, r7f0Var.b, r7f0Var.c, r7f0Var.d, r7f0Var.e);
                } else if (li10Var instanceof kye1) {
                    kye1 kye1Var2 = (kye1) li10Var;
                    kye1Var = new kye1(kye1Var2.a + i2, kye1Var2.b);
                }
                if (li10Var.p() > i) {
                    arrayList.add(li10Var);
                }
            }
            li10Var = kye1Var;
            if (li10Var.p() > i) {
                arrayList.add(li10Var);
            }
        }
        while (!n36Var.isEmpty()) {
            oi0 oi0Var2 = (oi0) n36Var.removeFirst();
            arrayList.add(new gw0(oi0Var2.a, oi0Var2.b));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Serializable l(rzq rzqVar, o3r o3rVar, o3r o3rVar2, String str, onm onmVar) {
        m0r m0rVar;
        c0r c0rVarC;
        rzq rzqVar2;
        o3r o3rVar3;
        String str2;
        o3r o3rVar4;
        Throwable th;
        c0r c0rVar;
        if (onmVar instanceof m0r) {
            m0rVar = (m0r) onmVar;
            int i = m0rVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                m0rVar.g = i - Integer.MIN_VALUE;
            } else {
                m0rVar = new m0r(onmVar);
            }
        } else {
            m0rVar = new m0r(onmVar);
        }
        Object obj = m0rVar.f;
        int i2 = m0rVar.g;
        if (i2 == 0) {
            hm5.M(obj);
            c0rVarC = rzqVar.c(i6p1.q(o3rVar, o3rVar2).a(str));
            try {
                bpb1 bpb1Var = c0rVarC.a().a;
                ur1 ur1Var = new ur1(rzqVar, o3rVar, str, o3rVar2, (lnm) null);
                m0rVar.a = rzqVar;
                m0rVar.b = o3rVar;
                m0rVar.c = o3rVar2;
                m0rVar.d = str;
                m0rVar.e = c0rVarC;
                m0rVar.g = 1;
                Object objJ = b5p1.j(bpb1Var, ur1Var, m0rVar);
                d9n d9nVar = d9n.a;
                if (objJ == d9nVar) {
                    return d9nVar;
                }
                rzqVar2 = rzqVar;
                o3rVar3 = o3rVar;
                str2 = str;
                o3rVar4 = o3rVar2;
            } catch (Throwable th2) {
                th = th2;
                c0rVar = c0rVarC;
                c0rVar.dispose();
                throw th;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c0rVar = m0rVar.e;
            str2 = m0rVar.d;
            o3rVar4 = m0rVar.c;
            o3rVar3 = m0rVar.b;
            rzq rzqVar3 = m0rVar.a;
            try {
                hm5.M(obj);
                c0rVarC = c0rVar;
                rzqVar2 = rzqVar3;
            } catch (Throwable th3) {
                th = th3;
                c0rVar.dispose();
                throw th;
            }
        }
        Object objO = o(rzqVar2, o3rVar3, str2);
        Throwable thA = e331.a(objO);
        try {
            if (thA != null) {
                m231 m231Var = new m231(thA);
                c0rVarC.dispose();
                return m231Var;
            }
            Object objO2 = o(rzqVar2, o3rVar4, str2);
            Throwable thA2 = e331.a(objO2);
            if (thA2 == null) {
                mmr0 mmr0Var = new mmr0(objO, objO2);
                c0rVarC.dispose();
                return mmr0Var;
            }
            m231 m231Var2 = new m231(thA2);
            c0rVarC.dispose();
            return m231Var2;
        } catch (Throwable th4) {
            th = th4;
            c0rVar = c0rVarC;
            c0rVar.dispose();
            throw th;
        }
    }

    public static final void m(xla0 xla0Var) {
        lo20 lo20Var = no20.a;
        t0z t0zVar = hni0.c;
        ArrayList arrayList = new ArrayList(q7h.U(t0zVar, 10));
        d7 d7Var = new d7(t0zVar, (byte) 0);
        while (d7Var.hasNext()) {
            arrayList.add(((hni0) d7Var.next()).a);
        }
    }

    public static final yzu n(xla0 xla0Var) {
        mo20 mo20Var = no20.e;
        t0z t0zVar = dfm0.g;
        ArrayList arrayList = new ArrayList(q7h.U(t0zVar, 10));
        d7 d7Var = new d7(t0zVar, (byte) 0);
        while (d7Var.hasNext()) {
            arrayList.add(((dfm0) d7Var.next()).a);
        }
        return new yzu(xla0Var, mo20Var, t0zVar, arrayList);
    }

    public static final Object o(d0r d0rVar, o3r o3rVar, String str) {
        i1r i1rVarN = x2p1.n(d0rVar, o3rVar, str);
        if (i1rVarN instanceof i1r) {
            return i1rVarN.a;
        }
        if (i1rVarN instanceof h1r) {
            return new m231(new RuntimeException(((h1r) i1rVarN).a.getMessage()));
        }
        return new m231(new RuntimeException("Unexpected state: " + i1rVarN));
    }

    public static final void p(h4e1 h4e1Var) {
        yzr0 yzr0Var = h4e1Var.c;
        int length = yzr0Var.length();
        int length2 = yzr0Var.length() + 1;
        if (length < 0 || length >= length2) {
            tf80.a("Expected " + length + " to be in [0, " + length2 + ")");
        }
        h4e1Var.g = e6p1.e(length, length);
    }

    public static final mgc q(go20 go20Var) {
        return new mgc(do20.b, go20Var);
    }

    public static final String r(String str) {
        String strJ;
        String str2;
        Set set = s4b1.f;
        s4b1 s4b1VarX = uic.x(str);
        String str3 = null;
        if (s4b1VarX.c != blc0.ea) {
            s4b1VarX = null;
        }
        if (s4b1VarX == null || (strJ = s4b1VarX.j()) == null) {
            strJ = null;
        }
        if (strJ == null) {
            jxu0 jxu0VarC = oxu0.a.c(str);
            jxu0 jxu0Var = jxu0VarC instanceof jxu0 ? jxu0VarC : null;
            if (jxu0Var != null) {
                if (!u890.j(jxu0Var.a, "listening-party") || !cmd0.a.e(jxu0Var.b)) {
                    jxu0Var = null;
                }
                if (jxu0Var != null && (str2 = jxu0Var.b) != null) {
                    str3 = str2;
                }
            }
        } else {
            str3 = strJ;
        }
        return str3 != null ? f4i1.f("https://party.spotify.com/event/", str3, "/report") : "https://party.spotify.com/report-user";
    }

    public static final void s(xla0 xla0Var, du1 du1Var) {
        t0z t0zVar = cd31.b;
        ArrayList arrayList = new ArrayList(q7h.U(t0zVar, 10));
        d7 d7Var = new d7(t0zVar, (byte) 0);
        while (d7Var.hasNext()) {
            arrayList.add(new go20(du1Var, ((cd31) d7Var.next()).ordinal()));
        }
    }

    public static void t(ImageView imageView, ColorStateList colorStateList) {
        imageView.setImageTintList(colorStateList);
    }

    public static void u(ImageView imageView, PorterDuff.Mode mode) {
        imageView.setImageTintMode(mode);
    }

    public static final void v(h4e1 h4e1Var, int i, int i2) {
        h4e1Var.p(e6p1.e(yoi1.p(i, 0, h4e1Var.c.length()), yoi1.p(i2, 0, h4e1Var.c.length())));
    }

    public static final String w(blc0 blc0Var) {
        w6b1 w6b1VarA = f7b1.a(blc0Var);
        String str = w6b1VarA != null ? (String) o7h.s0(w6b1VarA.c) : null;
        return str == null ? "" : str;
    }

    public static final yzu x(xla0 xla0Var) {
        mo20 mo20Var = no20.d;
        t0z t0zVar = vjk1.f;
        ArrayList arrayList = new ArrayList(q7h.U(t0zVar, 10));
        d7 d7Var = new d7(t0zVar, (byte) 0);
        while (d7Var.hasNext()) {
            arrayList.add(((vjk1) d7Var.next()).a);
        }
        return new yzu(xla0Var, mo20Var, t0zVar, arrayList);
    }
}
