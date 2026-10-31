package p;

import android.content.Context;
import android.text.format.DateUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import kotlin.jvm.functions.Function0;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class mgo1 {
    public static final jm a = new jm("NO_VALUE", (byte) 5);
    public static b180 b;

    public static final void a(xzz0 xzz0Var, qim0 qim0Var, b0k b0kVar, int i, int i2) {
        qim0 qim0Var2;
        int i3;
        qim0 qim0Var3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1737005453);
        j06 j06Var = x340Var.a;
        int i4 = i | (x340Var.g(xzz0Var) ? 4 : 2);
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
            qim0Var2 = qim0Var;
        } else {
            qim0Var2 = qim0Var;
            i3 = i4 | (x340Var.g(qim0Var2) ? 32 : 16);
        }
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            qim0 qim0Var4 = nim0.a;
            qim0 qim0Var5 = i5 != 0 ? qim0Var4 : qim0Var2;
            qim0 qim0VarF = u291.f(qim0Var5, 1.0f);
            gfh0 gfh0VarC = t1c.c(xzz0Var.a() ? een.i : een.g, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
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
            nko1.H(gfh0VarC, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            qim0 qim0VarV = u291.v(qim0Var4, 200.0f);
            uwr uwrVar = cbx.a;
            long jA = cbx.a(x340Var).a.b.a();
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarF2 = dug.f(qim0VarV, jA, er31.b(4.0f));
            cua cuaVar2 = cbx.b(x340Var).f;
            qim0 qim0VarL0 = cwl1.l0(qim0VarF2, 0L, er31.b(4.0f), 13);
            gfh0 gfh0VarC2 = t1c.c(een.d, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarL0);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC2, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            uwo1.e(" ", null, cbx.d(x340Var).m, u7h.j, null, null, 0, false, null, 0, null, x340Var, 3078, 0, 2034);
            x340Var.r(true);
            x340Var.r(true);
            qim0Var3 = qim0Var5;
        } else {
            x340Var.b0();
            qim0Var3 = qim0Var2;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new g8(xzz0Var, qim0Var3, i, i2, (byte) 9);
        }
    }

    public static final void b(lhg1 lhg1Var, boolean z, vu30 vu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-514778372);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(lhg1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(vu30Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
            if (z) {
                x340Var.i0(-1834167283);
                a4p1.a(lhg1Var, lrn1.x(nim0Var, 1.0f), x340Var, i2 & 14);
                x340Var.r(false);
            } else {
                x340Var.i0(-1834029860);
                x340Var.r(false);
            }
            us71.j((i2 >> 6) & 14, vu30Var, x340Var, true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new e30(lhg1Var, z, vu30Var, i, (byte) 19);
        }
    }

    public static final void c(xib0 xib0Var, Function0 function0, Function0 function1, j2i j2iVar, b0k b0kVar, int i) {
        x340 x340Var;
        boolean zJ;
        ArrayList arrayList;
        jax haxVar;
        gbx gbxVar;
        List list;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1931539503);
        int i2 = (i & 6) == 0 ? (x340Var2.i(xib0Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= x340Var2.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.i(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var2.i(j2iVar) ? 2048 : 1024;
        }
        if (x340Var2.Y(i2 & 1, (i2 & 1171) != 1170)) {
            rib0 rib0Var = xib0Var.a.a;
            boolean z = xib0Var.g;
            olw0 olw0Var = xib0Var.e;
            if (u890.j(olw0Var, tlw0.a)) {
                zJ = false;
            } else if (olw0Var instanceof olw0) {
                zJ = u890.j(olw0Var.a, rib0Var.a());
            } else {
                if (!(olw0Var instanceof rlw0)) {
                    eg.o();
                    return;
                }
                zJ = u890.j(((rlw0) olw0Var).a, rib0Var.a());
            }
            jo70 jo70Var = xib0Var.b;
            if (jo70Var == null || (list = jo70Var.d) == null) {
                arrayList = null;
            } else {
                List list2 = list;
                ArrayList arrayList2 = new ArrayList(q7h.U(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((ho70) it.next()).a);
                }
                arrayList = new ArrayList();
                for (Object obj : arrayList2) {
                    if (((String) obj).length() > 0) {
                        arrayList.add(obj);
                    }
                }
            }
            if (arrayList == null) {
                arrayList = z6x.a;
            }
            String strY0 = x340Var2.k(t4k.n) == flb0.b ? o7h.y0(o7h.T0(arrayList), ", ", (String) null, (String) null, (iu30) null, 62) : o7h.y0(arrayList, ", ", (String) null, (String) null, (iu30) null, 62);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarF);
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
            nko1.H(gfh0VarC, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            if (!xib0Var.f || rib0Var.e) {
                x340Var2.i0(-848772999);
                x340Var2.r(false);
            } else {
                x340Var2.i0(-849293861);
                uwr uwrVar = cbx.a;
                cua cuaVar = cbx.b(x340Var2).f;
                cr31 cr31VarB = er31.b(8.0f);
                qim0 qim0VarB = h2c.a.b(nim0Var);
                cvx cvxVar = cbx.b(x340Var2).b;
                qim0 qim0VarF2 = dug.f(uyn1.y(qim0VarB, 8.0f, 2.5f), cbx.a(x340Var2).a.a.b(), cr31VarB);
                avw0 avw0Var = cbx.b(x340Var2).c;
                t1c.a(d1u.E(1.0f, u7h.b(cbx.a(x340Var2).d.a, 0.3f, 0.0f, 0.0f, 0.0f, 14), qim0VarF2, cr31VarB), x340Var2, 0);
                x340Var2.r(false);
            }
            Object objT = x340Var2.T();
            if (objT == fkj0.X) {
                objT = zib0.Q0;
                x340Var2.s0(objT);
            }
            qim0 qim0VarB2 = s161.b(nim0Var, true, (iu30) objT);
            if (z) {
                x340Var2.i0(-858659683);
                x340Var2.r(false);
                haxVar = jax.a;
            } else {
                x340Var2.i0(-858658136);
                haxVar = new hax(cwl1.o0(x340Var2, 2131957181));
                x340Var2.r(false);
            }
            if (!z || xib0Var.d == null) {
                x340Var2.i0(-848356236);
                x340Var2.r(false);
                gbxVar = null;
            } else {
                x340Var2.i0(-848468021);
                String strO0 = cwl1.o0(x340Var2, 2131957180);
                if (ihc1.y0(strO0)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                } else {
                    gbx gbxVar2 = new gbx(new y50(strO0), function0);
                    x340Var2.r(false);
                    gbxVar = gbxVar2;
                }
            }
            jto1.b(qim0VarB2, null, haxVar, false, null, null, gbxVar, null, null, apo.r(2003438112, new o3((Object) xib0Var, (Object) rib0Var, zJ, (byte) 22), x340Var2), null, apo.r(-1397314783, new z3y(strY0, (byte) 20), x340Var2), apo.r(-1319193694, new o3((Object) j2iVar, (Object) function1, z, (byte) 23), x340Var2), null, null, apo.r(-1084830427, new yy80(xib0Var, (byte) 21), x340Var2), x340Var2, 805306368, 197040, 26042);
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nca0(i, xib0Var, function0, function1, j2iVar, (byte) 6);
        }
    }

    public static final dt71 d(int i, int i2, int i3) {
        if (i < 0) {
            hhg1.f(f4i1.c(i, "replay cannot be negative, but was "));
            return null;
        }
        if (i2 < 0) {
            hhg1.f(f4i1.c(i2, "extraBufferCapacity cannot be negative, but was "));
            return null;
        }
        if (i <= 0 && i2 <= 0 && i3 != 1) {
            hhg1.f("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ".concat(z5c.r(i3)));
            return null;
        }
        int i4 = i2 + i;
        if (i4 < 0) {
            i4 = Integer.MAX_VALUE;
        }
        return new dt71(i, i4, i3);
    }

    public static /* synthetic */ dt71 e(int i, int i2, int i3, int i4) {
        if ((i4 & 1) != 0) {
            i = 0;
        }
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = 1;
        }
        return d(i, i2, i3);
    }

    public static final void f(uj51 uj51Var, j2i j2iVar, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var;
        x340 x340Var2;
        int i2;
        xf51 xf51Var;
        String str;
        boolean z;
        String str2;
        float f;
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var3 = (x340) b0kVar;
        x340Var3.k0(1432525737);
        int i3 = (i & 6) == 0 ? (x340Var3.g(uj51Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= x340Var3.i(j2iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var3.i(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= x340Var3.i(iu30Var) ? 2048 : 1024;
        }
        boolean z2 = false;
        if (x340Var3.Y(i3 & 1, (i3 & 1171) != 1170)) {
            d36 d36Var = new d36(16.0f, true, new um5(false));
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0Var);
            mbh mbhVarA = jbh.a(d36Var, een.P0, x340Var3, 0);
            int iHashCode = Long.hashCode(x340Var3.T);
            xos0 xos0VarM = x340Var3.m();
            qim0 qim0VarE = zr7.E(x340Var3, qim0VarZ);
            hzj.A.getClass();
            if (x340Var3.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var3.m0();
            if (x340Var3.S) {
                x340Var3.l(hmb0.t1);
            } else {
                x340Var3.v0();
            }
            nko1.H(mbhVarA, x340Var3, y580.O0);
            nko1.H(xos0VarM, x340Var3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var3, y580.R0);
            nko1.F(x340Var3);
            nko1.H(qim0VarE, x340Var3, y580.Y);
            x340Var3.i0(-1217471195);
            for (xf51 xf51Var2 : uj51Var.a) {
                String str3 = xf51Var2.a;
                String str4 = xf51Var2.c;
                String str5 = xf51Var2.b;
                if (str3.length() > 0) {
                    x340Var3.i0(-155209419);
                    int i4 = i3;
                    String str6 = xf51Var2.a;
                    uwr uwrVar = cbx.a;
                    lee1 lee1Var = cbx.d(x340Var3).h;
                    long j = cbx.a(x340Var3).b.a;
                    str = str4;
                    str2 = str5;
                    xf51Var = xf51Var2;
                    z = false;
                    x340 x340Var4 = x340Var3;
                    i2 = i4;
                    uwo1.e(str6, null, lee1Var, j, null, null, 0, false, null, 0, null, x340Var4, 0, 0, 2034);
                    x340Var2 = x340Var4;
                    x340Var2.r(false);
                } else {
                    int i5 = i3;
                    x340Var2 = x340Var3;
                    i2 = i5;
                    xf51Var = xf51Var2;
                    str = str4;
                    z = z2;
                    str2 = str5;
                    x340Var2.i0(-155047971);
                    x340Var2.r(z);
                }
                int length = str2.length();
                qim0 qim0Var3 = nim0.a;
                if (length > 0) {
                    x340Var2.i0(-154993101);
                    boolean z3 = (i2 & 7168) == 2048 ? true : z;
                    Object objT = x340Var2.T();
                    if (z3 || objT == m4cVar) {
                        objT = new n601(iu30Var, (byte) 21);
                        x340Var2.s0(objT);
                    }
                    af5 af5VarA = huj.a(str2, (iu30) objT);
                    qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
                    uwr uwrVar2 = cbx.a;
                    x340 x340Var5 = x340Var2;
                    f = 1.0f;
                    qim0Var2 = qim0Var3;
                    uwo1.d(af5VarA, cbx.a(x340Var2).b.a, qim0VarF, cbx.d(x340Var2).g, null, null, 0, false, null, 0, null, null, x340Var5, 0, 0, 4080);
                    x340Var2 = x340Var5;
                    x340Var2.r(z);
                } else {
                    f = 1.0f;
                    qim0Var2 = qim0Var3;
                    x340Var2.i0(-154706723);
                    x340Var2.r(z);
                }
                x340Var2.i0(-1217453005);
                Iterator it = xf51Var.d.iterator();
                while (it.hasNext()) {
                    j2iVar.invoke((uzh) it.next(), x340Var2, Integer.valueOf(i2 & 112));
                }
                x340Var2.r(z);
                if (str.length() > 0) {
                    x340Var2.i0(-154594348);
                    boolean z4 = (i2 & 7168) == 2048 ? true : z;
                    Object objT2 = x340Var2.T();
                    if (z4 || objT2 == m4cVar) {
                        objT2 = new n601(iu30Var, (byte) 22);
                        x340Var2.s0(objT2);
                    }
                    af5 af5VarA2 = huj.a(str, (iu30) objT2);
                    qim0 qim0VarF2 = u291.f(qim0Var2, f);
                    uwr uwrVar3 = cbx.a;
                    x340 x340Var6 = x340Var2;
                    uwo1.d(af5VarA2, cbx.a(x340Var2).b.b, qim0VarF2, cbx.d(x340Var2).j, null, null, 0, false, null, 0, null, null, x340Var6, 0, 0, 4080);
                    x340Var2 = x340Var6;
                    x340Var2.r(z);
                } else {
                    x340Var2.i0(-154308931);
                    x340Var2.r(z);
                }
                x340 x340Var7 = x340Var2;
                i3 = i2;
                x340Var3 = x340Var7;
                z2 = z;
            }
            x340Var = x340Var3;
            x340Var.r(z2);
            x340Var.r(true);
        } else {
            x340Var = x340Var3;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nk31((byte) 8, i, uj51Var, j2iVar, iu30Var, qim0Var);
        }
    }

    public static final void g(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        b0k b0kVar2;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1273067752);
        int i2 = (b0kVar3.i(qim0Var) ? 4 : 2) | i | (b0kVar3.i(function0) ? 32 : 16);
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0VarQ = i1p1.q(qim0Var, er31.b(8.0f));
            uwr uwrVar = cbx.a;
            qim0 qim0VarN = anm1.N("unboxing_hub_entry_point", uyn1.x(dug.f(qim0VarQ, cbx.a(b0kVar3).a.a.a(), d4o1.a), 16.0f));
            boolean z = (i2 & 112) == 32;
            Object objT = b0kVar3.T();
            if (z || objT == m4cVar) {
                objT = new sah1(function0, (byte) 1);
                b0kVar3.s0(objT);
            }
            Function0 function1 = (Function0) objT;
            if (ihc1.y0("Your Benefits")) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            } else {
                b0kVar2 = b0kVar3;
                cwl1.b(qim0VarN, (tl3) null, (hw61) null, (pgx) null, (vzq0) null, (max) null, false, (idn0) null, (ga80) null, new gbx(new y50("Your Benefits"), function1), (gbx) null, toj.a, b0kVar2, 0, 48, 1534);
            }
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new t531(qim0Var, function0, i, (byte) 11);
        }
    }

    public static final Object h(Object[] objArr, long j) {
        return objArr[((int) j) & (objArr.length - 1)];
    }

    public static final void i(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }

    public static final b021 j(qfm0 qfm0Var) {
        return qfm0Var.equals(efm0.a) ? yz11.a : a021.a;
    }

    public static final void l(View view, View view2, ImageView imageView, boolean z) {
        ViewParent parent = imageView.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        int width = viewGroup != null ? viewGroup.getWidth() : imageView.getWidth();
        ViewParent parent2 = imageView.getParent();
        ViewGroup viewGroup2 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
        int height = viewGroup2 != null ? viewGroup2.getHeight() : imageView.getHeight();
        int dimensionPixelSize = imageView.getResources().getDimensionPixelSize(2131167050);
        int dimensionPixelSize2 = imageView.getResources().getDimensionPixelSize(2131167051);
        int top = (view2.getTop() - view.getBottom()) - (imageView.getResources().getDimensionPixelSize(2131167049) + dimensionPixelSize2);
        int iMin = Math.min(top, width - (dimensionPixelSize * 2));
        int bottom = z ? view.getBottom() + dimensionPixelSize2 : view.getBottom() + dimensionPixelSize2 + ((top - iMin) / 2);
        boolean z2 = width > height;
        boolean z3 = ((double) iMin) > ((double) width) * 0.4d;
        if (z2 || z3) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            marginLayoutParams.height = iMin;
            marginLayoutParams.width = iMin;
            marginLayoutParams.setMargins(0, bottom, 0, 0);
            imageView.setLayoutParams(marginLayoutParams);
        }
    }

    public static final float m(float f, float f2, float f3) {
        double d = f - f2;
        return yoi1.o((1.0f - f3) * ((float) Math.atan2((float) Math.sin(d), (float) Math.cos(d))), -0.35f, 0.35f);
    }

    public static ve90 o() {
        return new ve90(Executors.newSingleThreadExecutor());
    }

    public static final ViewGroup p(View view) {
        return u890.j(view.getTag(), 2131430188) ? (ViewGroup) view : p((ViewGroup) view.getParent());
    }

    public static final String q(long j, Long l, String str) {
        if (l == null) {
            return null;
        }
        return Math.abs(j - l.longValue()) < 60000 ? str : DateUtils.getRelativeTimeSpanString(l.longValue(), j, 60000L).toString();
    }

    public static final mr20 r(at71 at71Var, o8n o8nVar, int i, int i2) {
        return ((i == 0 || i == -3) && i2 == 1) ? at71Var : new hge(i, i2, o8nVar, at71Var);
    }

    public static final boolean s(lee1 lee1Var) {
        edt0 edt0Var;
        wdt0 wdt0Var = lee1Var.c;
        f5x f5xVar = (wdt0Var == null || (edt0Var = wdt0Var.b) == null) ? null : new f5x(edt0Var.b);
        boolean z = false;
        if (f5xVar != null && f5xVar.a == 1) {
            z = true;
        }
        return !z;
    }

    public static float u(float f, float f2, float f3) {
        return (f3 * f2) + ((1.0f - f3) * f);
    }

    public static final xd6 v(boolean z, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        Object objT = x340Var.T();
        m4c m4cVar = fkj0.X;
        if (objT == m4cVar) {
            objT = new xd6();
            x340Var.s0(objT);
        }
        xd6 xd6Var = (xd6) objT;
        Object objT2 = x340Var.T();
        if (objT2 == m4cVar) {
            objT2 = new wq50();
            x340Var.s0(objT2);
        }
        wq50 wq50Var = (wq50) objT2;
        Context context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
        Boolean boolValueOf = Boolean.valueOf(z);
        boolean zH = x340Var.h(z) | x340Var.i(context) | x340Var.i(wq50Var);
        Object objT3 = x340Var.T();
        if (zH || objT3 == m4cVar) {
            objT3 = new c30(z, context, wq50Var, (byte) 5);
            x340Var.s0(objT3);
        }
        qxd0.i(boolValueOf, (iu30) objT3, x340Var);
        Boolean boolValueOf2 = Boolean.valueOf(z);
        boolean zH2 = x340Var.h(z) | x340Var.i(wq50Var);
        Object objT4 = x340Var.T();
        if (zH2 || objT4 == m4cVar) {
            objT4 = new wd6(z, xd6Var, wq50Var, (lnm) null);
            x340Var.s0(objT4);
        }
        qxd0.t(boolValueOf2, x340Var, (vu30) objT4);
        return xd6Var;
    }

    public static final void w(ImageView imageView, String str, gw70 gw70Var) {
        int i = imageView.getResources().getDisplayMetrics().widthPixels;
        int dimensionPixelSize = imageView.getResources().getDimensionPixelSize(2131167050);
        if (str == null) {
            imageView.setImageResource(2131233988);
            return;
        }
        ixg ixgVarF = gw70Var.f(str);
        ixgVarF.l(2131233988);
        int i2 = i - (dimensionPixelSize * 2);
        ixgVarF.g = false;
        ixgVarF.p(i2, i2, 1);
        ixgVarF.k(imageView, (ird1) null);
    }

    public static /* synthetic */ boolean y(Unsafe unsafe, nvn1 nvn1Var, long j, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(nvn1Var, j, obj, obj2)) {
            if (unsafe.getObject(nvn1Var, j) != obj && unsafe.getObject(nvn1Var, j) != obj) {
                return false;
            }
        }
        return true;
    }

    public abstract void k(jyc jycVar);

    public void n(jyc jycVar, jyc jycVar2) {
        if (jycVar2 != null) {
            return;
        }
        ght.z(2);
        throw null;
    }

    public void t(jyc jycVar, jyc jycVar2) {
        n(jycVar, jycVar2);
    }

    public void x(jyc jycVar, Collection collection) {
        jycVar.k0(collection);
    }
}
