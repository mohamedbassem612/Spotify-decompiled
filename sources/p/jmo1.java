package p;

import android.graphics.Color;
import com.spotify.notifications.notificationsettings.NotificationCategory;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class jmo1 {
    public static final j690 a = new j690((byte) 9);
    public static b180 b;

    public static final void a(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(2077358041);
        int i2 = (b0kVar3.i(function0) ? 4 : 2) | i | 48;
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            String strO0 = cwl1.o0(b0kVar3, 2131952588);
            if (ihc1.y0(strO0)) {
                hhg1.n("Please consider providing a non-empty action label to provide a more accessible experience for everyone. You can use SelfDescribed if the content description is sufficient.");
                return;
            }
            gbx gbxVar = new gbx(new y50(strO0), function0);
            nex nexVar = new nex(18);
            lex lexVarZ = yoo1.z(b0kVar3);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            zzq0 zzq0VarH = uyn1.h(2, 12.0f, 0.0f);
            qim0 qim0Var3 = nim0.a;
            b0kVar2 = b0kVar3;
            poo1.e(gbxVar, nexVar, lexVarZ, anm1.N("ChapterListButton", qim0Var3), 0, cwl1.o0(b0kVar3, 2131952588), null, ebi.a, null, null, null, false, zzq0VarH, ebi.b, b0kVar2, 12582912, 3072, 3920);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new vd1(function0, qim0Var2, i, (byte) 11);
        }
    }

    public static final void b(fiz0 fiz0Var, iu30 iu30Var, amq amqVar, bmq bmqVar, xip xipVar, zja1 zja1Var, rgn0 rgn0Var, b0k b0kVar, int i) {
        int i2;
        List list = fiz0Var.g;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1084204376);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(fiz0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? x340Var.g(amqVar) : x340Var.i(amqVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? x340Var.g(bmqVar) : x340Var.i(bmqVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(xipVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.i(zja1Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= x340Var.i(rgn0Var) ? 1048576 : 524288;
        }
        if (x340Var.Y(i2 & 1, (599187 & i2) != 599186)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = xipVar.a(rgn0Var);
                x340Var.s0(objT);
            }
            xiz0 xiz0Var = (xiz0) objT;
            boolean zG = x340Var.g(list);
            Object objT2 = x340Var.T();
            if (zG || objT2 == m4cVar) {
                aka1 aka1Var = aka1.b;
                objT2 = fn31.K(list);
                x340Var.s0(objT2);
            }
            aka1 aka1Var2 = (aka1) objT2;
            boolean zI = x340Var.i(zja1Var) | x340Var.i(aka1Var2);
            Object objT3 = x340Var.T();
            if (zI || objT3 == m4cVar) {
                objT3 = new j140(zja1Var, aka1Var2, (lnm) null, (byte) 1);
                x340Var.s0(objT3);
            }
            aka1 aka1Var3 = aka1.b;
            qxd0.t(aka1Var2, x340Var, (vu30) objT3);
            mod.b(bka1.a.a(aka1Var2), apo.r(1687182824, new wyy0(xiz0Var, fiz0Var, (klz0) x340Var.k(llz0.a), amqVar, iu30Var, bmqVar, (byte) 1), x340Var), x340Var, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kt3(fiz0Var, iu30Var, amqVar, bmqVar, xipVar, zja1Var, rgn0Var, i);
        }
    }

    public static final void c(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(306537946);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i | (x340Var.g(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            String strO0 = cwl1.o0(x340Var, 2131958429);
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new us21(function0, (byte) 28);
                x340Var.s0(objT);
            }
            Function0 function1 = (Function0) objT;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            wro1.h(new gbx(new y50(strO0), function1), new idx(4), qim0Var, null, null, null, false, null, null, cgj.a, x340Var, (i2 << 3) & 896, 6, 1016);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new t531(function0, qim0Var, i, (byte) 3);
        }
    }

    public static final void d(String str, lee1 lee1Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1756750339);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.i(lee1Var) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarZ = u291.z(u291.f(qim0Var3, 1.0f), (fra) null, 3);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarY = uyn1.y(qim0VarZ, 16.0f, 12.0f);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarY);
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
            uwo1.e(str, null, lee1Var, cbx.a(x340Var).b.a, new a0e1(3), null, 0, false, new cjc0(2), 0, null, x340Var, (i2 & 14) | ((i2 << 3) & 896), 0, 1762);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new h2(str, lee1Var, qim0Var2, i, (byte) 2);
        }
    }

    public static final wa3 e(mr20... mr20VarArr) {
        return new wa3((mr20[]) Arrays.copyOf(mr20VarArr, mr20VarArr.length), (byte) 12);
    }

    public static final lax f(lax... laxVarArr) {
        lax laxVar;
        int length = laxVarArr.length;
        int i = 0;
        while (true) {
            laxVar = null;
            if (i >= length) {
                break;
            }
            lax laxVar2 = laxVarArr[i];
            laxVar = laxVar2 instanceof gax ? laxVar2 : null;
            if (laxVar != null) {
                break;
            }
            i++;
        }
        return laxVar == null ? iax.a : laxVar;
    }

    public static final int g(int i, CharSequence charSequence) {
        int length = charSequence.length();
        while (i < length) {
            if (charSequence.charAt(i) == '\n') {
                return i;
            }
            i++;
        }
        return charSequence.length();
    }

    public static final int h(int i, CharSequence charSequence) {
        while (i > 0) {
            if (charSequence.charAt(i - 1) == '\n') {
                return i;
            }
            i--;
        }
        return 0;
    }

    public static Object i(mkb0 mkb0Var, Object obj, vu30 vu30Var) {
        return vu30Var.invoke(obj, mkb0Var);
    }

    public static m8n j(mkb0 mkb0Var, n8n n8nVar) {
        return ilo1.u(mkb0Var, n8nVar);
    }

    public static final qim0 k(int i, qim0 qim0Var, String str) {
        int iC = l1d.C(i);
        if (iC == 0) {
            return l(qim0Var, p7h.M(new u7h[]{new u7h(z4p1.g(4294937375L)), new u7h(z4p1.g(4294920244L)), new u7h(z4p1.g(4281149695L))}));
        }
        if (iC == 1) {
            if (str != null && !ihc1.y0(str)) {
                uwr uwrVar = cbx.a;
                return l(qim0Var, p7h.M(new u7h[]{new u7h(((vex) zex.a.b).b), new u7h(z4p1.e(Color.parseColor(str)))}));
            }
            uwr uwrVar2 = cbx.a;
            zsc zscVar = zex.a;
            return l(qim0Var, p7h.M(new u7h[]{new u7h(((vex) zscVar.b).b), new u7h(((vex) zscVar.b).b)}));
        }
        if (iC != 2) {
            if (iC == 3) {
                return qim0Var;
            }
            eg.o();
            return null;
        }
        u7h u7hVar = new u7h(z4p1.g(4294417362L));
        u7h u7hVar2 = new u7h(z4p1.g(4294908607L));
        u7h u7hVar3 = new u7h(z4p1.g(4293401344L));
        uwr uwrVar3 = cbx.a;
        return l(qim0Var, p7h.M(new u7h[]{u7hVar, u7hVar2, u7hVar3, new u7h(((vex) zex.a.b).a)}));
    }

    public static final qim0 l(qim0 qim0Var, List list) {
        return d1u.F(qim0Var, 1.5f, new mic0(0, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), list, (List) null), er31.b(32.0f));
    }

    public static final boolean m(String str) {
        r0z entries = NotificationCategory.getEntries();
        if (entries != null && entries.isEmpty()) {
            return false;
        }
        Iterator it = entries.iterator();
        while (it.hasNext()) {
            if (u890.j(((NotificationCategory) it.next()).getKey(), str)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean n(vuh0 vuh0Var) {
        return vuh0Var.d == 2;
    }

    public static final int o(tyr0 tyr0Var) {
        if (tyr0Var.h) {
            return 3;
        }
        if (!tyr0Var.e || tyr0Var.i) {
            return tyr0Var.g ? 2 : 1;
        }
        return 4;
    }

    public static o8n p(mkb0 mkb0Var, n8n n8nVar) {
        return ilo1.z(mkb0Var, n8nVar);
    }

    public static o8n r(mkb0 mkb0Var, o8n o8nVar) {
        return flo1.l(mkb0Var, o8nVar);
    }

    public static final xyb1 s(boolean z, boolean z2, Function0 function0, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        p5c p5cVar = (p5c) x340Var.k(r5c.a);
        flb0 flb0Var = (flb0) x340Var.k(t4k.n);
        boolean zE = ((((i & 896) ^ 384) > 256 && x340Var.g(function0)) || (i & 384) == 256) | ((((i & 14) ^ 6) > 4 && x340Var.h(z)) || (i & 6) == 4) | x340Var.e(flb0Var.ordinal()) | x340Var.g(p5cVar) | ((((i & 112) ^ 48) > 32 && x340Var.h(z2)) || (i & 48) == 32);
        Object objT = x340Var.T();
        if (zE || objT == fkj0.X) {
            xyb1 xyb1Var = new xyb1(function0, z, flb0Var, z2, p5cVar);
            x340Var.s0(xyb1Var);
            objT = xyb1Var;
        }
        return (xyb1) objT;
    }

    public static String t(String str, Object... objArr) {
        int length;
        int iIndexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i >= length || (iIndexOf = str.indexOf("%s", i2)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i2, iIndexOf);
            sb.append(u(objArr[i]));
            i2 = iIndexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i2, str.length());
        if (i < length) {
            String str2 = " [";
            while (i < objArr.length) {
                sb.append(str2);
                sb.append(u(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static String u(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            String strQ = l1d.q(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strQ), (Throwable) e);
            String name2 = e.getClass().getName();
            StringBuilder sb = new StringBuilder(strQ.length() + 8 + name2.length() + 1);
            bb00.j(sb, "<", strQ, " threw ", name2);
            sb.append(">");
            return sb.toString();
        }
    }

    public abstract void q(rvh0 rvh0Var, jqd0 jqd0Var);
}
