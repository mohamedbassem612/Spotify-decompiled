package p;

import android.net.Uri;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kzt {
    public final yqg a;

    public static final int b(tob1 tob1Var) {
        return ((Number) tob1Var.getValue()).intValue();
    }

    public static final void c(float f, ven0 ven0Var) {
        ven0Var.setValue(Float.valueOf(f));
    }

    public static bxt f(bxt bxtVar, String str) {
        if (bxtVar instanceof axt) {
            axt axtVar = (axt) bxtVar;
            return new axt(str, axtVar.b, axtVar.c, axtVar.d, axtVar.e, axtVar.f, axtVar.g, axtVar.h, axtVar.i);
        }
        if (bxtVar instanceof xwt) {
            xwt xwtVar = (xwt) bxtVar;
            return new xwt(str, xwtVar.b, xwtVar.c, xwtVar.d, xwtVar.e, xwtVar.f, xwtVar.g, xwtVar.h);
        }
        eg.o();
        return null;
    }

    public void a(xtb0 xtb0Var, qim0 qim0Var, Integer num, b0k b0kVar, int i) {
        int i2;
        xtb0 xtb0Var2;
        b0k b0kVar2;
        boolean z;
        m4c m4cVar;
        wat watVar;
        c9n c9nVar;
        Object obj;
        tob1 tob1Var;
        ven0 ven0Var;
        tob1 tob1Var2;
        xtb0 xtb0Var3;
        ven0 ven0Var2;
        m4c m4cVar2;
        ven0 ven0Var3;
        boolean z2;
        qim0 qim0VarB;
        wat watVar2;
        long j;
        Object vt41Var;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1219060841);
        j06 j06Var = ((x340) b0kVar3).a;
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(xtb0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(qim0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.g(num) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.g(this) ? 2048 : 1024;
        }
        int i3 = i2;
        if (b0kVar3.Y(i3 & 1, (i3 & 1171) != 1170)) {
            wat watVar3 = (wat) b0kVar3.k(t4k.h);
            WeakHashMap weakHashMap = osl1.x;
            u85 u85Var = lhc.g(b0kVar3).h;
            Object objT = b0kVar3.T();
            m4c m4cVar3 = fkj0.X;
            if (objT == m4cVar3) {
                objT = qxd0.M(o6x.a, b0kVar3);
                b0kVar3.s0(objT);
            }
            c9n c9nVar2 = (c9n) objT;
            Object objT2 = b0kVar3.T();
            if (objT2 == m4cVar3) {
                objT2 = v8r.q(Float.valueOf(1.0f));
                b0kVar3.s0(objT2);
            }
            ven0 ven0Var4 = (ven0) objT2;
            Object objT3 = b0kVar3.T();
            if (objT3 == m4cVar3) {
                objT3 = v8r.q(Boolean.FALSE);
                b0kVar3.s0(objT3);
            }
            ven0 ven0Var5 = (ven0) objT3;
            Object objT4 = b0kVar3.T();
            if (objT4 == m4cVar3) {
                objT4 = v8r.q(Long.valueOf(this.a.b()));
                b0kVar3.s0(objT4);
            }
            ven0 ven0Var6 = (ven0) objT4;
            Object objT5 = b0kVar3.T();
            if (objT5 == m4cVar3) {
                objT5 = yv91.a(new wt41(xtb0Var, (byte) 0));
                b0kVar3.s0(objT5);
            }
            tob1 tob1Var3 = (tob1) objT5;
            Object objT6 = b0kVar3.T();
            if (objT6 == m4cVar3) {
                watVar = watVar3;
                m4cVar = m4cVar3;
                z = false;
                objT6 = yv91.a(new odp0(num, xtb0Var, u85Var, watVar, (byte) 15));
                b0kVar3.s0(objT6);
            } else {
                z = false;
                m4cVar = m4cVar3;
                watVar = watVar3;
            }
            tob1 tob1Var4 = (tob1) objT6;
            Object objT7 = b0kVar3.T();
            if (objT7 == m4cVar) {
                objT7 = v8r.q(Float.valueOf(0.0f));
                b0kVar3.s0(objT7);
            }
            ven0 ven0Var7 = (ven0) objT7;
            Object objT8 = b0kVar3.T();
            if (objT8 == m4cVar) {
                c9nVar = c9nVar2;
                tob1Var2 = tob1Var3;
                ven0Var2 = ven0Var5;
                m4cVar2 = m4cVar;
                qi1 qi1Var = new qi1(this, c9nVar, ven0Var2, ven0Var6, xtb0Var, tob1Var2, tob1Var4, ven0Var7, (byte) 12);
                ven0Var = ven0Var6;
                xtb0Var3 = xtb0Var;
                tob1Var = tob1Var4;
                ven0Var7 = ven0Var7;
                bz0 bz0Var = k6v.a;
                xvr xvrVar = new xvr(qi1Var);
                b0kVar3.s0(xvrVar);
                obj = xvrVar;
            } else {
                c9nVar = c9nVar2;
                obj = objT8;
                tob1Var = tob1Var4;
                ven0Var = ven0Var6;
                tob1Var2 = tob1Var3;
                xtb0Var3 = xtb0Var;
                ven0Var2 = ven0Var5;
                m4cVar2 = m4cVar;
            }
            r6v r6vVar = (r6v) obj;
            b0kVar3.i0(-1008532154);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarC = u291.c(nim0Var, 1.0f);
            float f = yt41.a;
            qim0 qim0VarV = u291.v(qim0VarC, 16.0f);
            if (((Number) ven0Var4.getValue()).floatValue() > r3) {
                b0kVar3.i0(1503763647);
                boolean zI = b0kVar3.i(c9nVar) | b0kVar3.i(ven0Var2) | b0kVar3.i(ven0Var) | ((i3 & 7168) == 2048) | b0kVar3.i(tob1Var) | b0kVar3.i(tob1Var2) | b0kVar3.i(ven0Var7) | b0kVar3.i(xtb0Var3);
                Object objT9 = b0kVar3.T();
                if (zI || objT9 == m4cVar2) {
                    qim0Var2 = qim0VarV;
                    xtb0 xtb0Var4 = xtb0Var3;
                    ven0 ven0Var8 = ven0Var;
                    vt41Var = new vt41(c9nVar, this, ven0Var2, ven0Var8, tob1Var, tob1Var2, ven0Var7, xtb0Var4);
                    ven0Var3 = ven0Var8;
                    xtb0Var3 = xtb0Var4;
                    b0kVar3.s0(vt41Var);
                } else {
                    qim0Var2 = qim0VarV;
                    vt41Var = objT9;
                    ven0Var3 = ven0Var;
                }
                qim0VarB = f8d1.b(qim0Var2, rih1.a, (PointerInputEventHandler) vt41Var);
                z2 = false;
                b0kVar3.r(false);
            } else {
                ven0Var3 = ven0Var;
                ven0Var2 = ven0Var2;
                z2 = z;
                b0kVar3.i0(1504664321);
                b0kVar3.r(z2);
                qim0VarB = qim0VarV;
            }
            b0kVar3.r(z2);
            qim0 qim0VarThen = qim0Var.then(qim0VarB);
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, z2);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarThen);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            boolean z3 = ((x340) b0kVar3).S;
            n4k n4kVar = hmb0.t1;
            if (z3) {
                b0kVar3.l(n4kVar);
            } else {
                b0kVar3.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, b0kVar3, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar3, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar3, lljVar3);
            nko1.F(b0kVar3);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, b0kVar3, lljVar4);
            Object objT10 = b0kVar3.T();
            if (objT10 == m4cVar2) {
                objT10 = yv91.a(new ks41(xtb0Var3, tob1Var2, (byte) 1));
                b0kVar3.s0(objT10);
            }
            tob1 tob1Var5 = (tob1) objT10;
            Object objT11 = b0kVar3.T();
            if (objT11 == m4cVar2) {
                watVar2 = watVar;
                objT11 = yv91.a(new d4v0(watVar2, tob1Var5, tob1Var, (byte) 26));
                b0kVar3.s0(objT11);
            } else {
                watVar2 = watVar;
            }
            tob1 tob1Var6 = (tob1) objT11;
            Object objT12 = b0kVar3.T();
            if (objT12 == m4cVar2) {
                objT12 = yv91.a(new odp0(xtb0Var, watVar2, tob1Var5, tob1Var, (byte) 14));
                b0kVar3.s0(objT12);
            }
            tob1 tob1Var7 = (tob1) objT12;
            if (((Boolean) ven0Var2.getValue()).booleanValue()) {
                b0kVar3.i0(-1307787749);
                uwr uwrVar = cbx.a;
                j = cbx.a(b0kVar3).c.c;
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(-1307714496);
                uwr uwrVar2 = cbx.a;
                j = cbx.a(b0kVar3).c.b;
                b0kVar3.r(false);
            }
            ven0 ven0Var9 = ven0Var3;
            b0kVar2 = b0kVar3;
            xtb0Var2 = xtb0Var;
            tob1 tob1VarA = w191.a(j, (fe5) null, "Scroll bar thumb color", b0kVar2, 384, 10);
            boolean z4 = xtb0Var2.j.b() || ((Boolean) ven0Var2.getValue()).booleanValue();
            Boolean boolValueOf = Boolean.valueOf(z4);
            boolean zH = b0kVar2.h(z4) | b0kVar2.i(ven0Var4);
            Object objT13 = b0kVar2.T();
            if (zH || objT13 == m4cVar2) {
                objT13 = new uw5(z4, ven0Var4, null, (byte) 3);
                b0kVar2.s0(objT13);
            }
            qxd0.t(boolValueOf, b0kVar2, (vu30) objT13);
            Long lValueOf = Long.valueOf(((Number) ven0Var9.getValue()).longValue());
            boolean zI2 = b0kVar2.i(ven0Var2);
            Object objT14 = b0kVar2.T();
            if (zI2 || objT14 == m4cVar2) {
                objT14 = new hj6(ven0Var2, (lnm) null, (byte) 21);
                b0kVar2.s0(objT14);
            }
            qxd0.t(lValueOf, b0kVar2, (vu30) objT14);
            qim0 qim0VarB2 = k6v.b(d9y0.k(u291.f(u291.h(eqr0.D(0.0f, ((p3v) tob1Var7.getValue()).a - 24.0f, 1, nim0Var), ((p3v) tob1Var6.getValue()).a + 24.0f + 24.0f), 1.0f), ((Number) ven0Var4.getValue()).floatValue()), r6vVar, qqq0.a, false, (idn0) null, false, (xu30) null, (xu30) null, false, 252);
            gfh0 gfh0VarC2 = t1c.c(graVar, false);
            int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM2 = b0kVar2.m();
            qim0 qim0VarE2 = zr7.E(b0kVar2, qim0VarB2);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            nko1.H(gfh0VarC2, b0kVar2, lljVar);
            nko1.H(xos0VarM2, b0kVar2, lljVar2);
            x0d.q(iHashCode2, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE2, b0kVar2, lljVar4);
            t1c.a(h2c.a.a(dug.f(uyn1.A(u291.d(nim0Var, 1.0f), yt41.a, 24.0f, 4.0f, 24.0f), ((u7h) tob1VarA.getValue()).a, er31.b(4.0f)), een.h), b0kVar2, 0);
            b0kVar2.r(true);
            b0kVar2.r(true);
        } else {
            xtb0Var2 = xtb0Var;
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new nk31((byte) 5, i, this, xtb0Var2, num, qim0Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0084  */
    public kxt d(bxt bxtVar, szt sztVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        pzt pztVar = sztVar.c;
        qzt qztVar = sztVar.b;
        rzt rztVar = sztVar.d;
        Set set = pztVar.a;
        h5u0 h5u0Var = pztVar.b;
        boolean z5 = pztVar.g;
        Long l = pztVar.d;
        boolean z6 = pztVar.c;
        yqg yqgVar = this.a;
        boolean z7 = z6 && l != null && yqgVar.b() < l.longValue() + rztVar.a;
        boolean z8 = (h5u0Var != null ? h5u0Var.c : 0) == 4;
        f5u0 f5u0Var = h5u0Var != null ? h5u0Var.b : null;
        boolean z9 = (f5u0Var instanceof e5u0) && u890.j(((e5u0) f5u0Var).a, bxtVar.d());
        f5u0 f5u0Var2 = h5u0Var != null ? h5u0Var.b : null;
        if (!(f5u0Var2 instanceof e5u0) || u890.j(((e5u0) f5u0Var2).a, bxtVar.d())) {
            z = false;
        } else {
            Long l2 = pztVar.e;
            long j = rztVar.b;
            iwc1 iwc1Var = qztVar.b;
            int i = iwc1Var == null ? -1 : jzt.a[iwc1Var.ordinal()];
            if (i == 1 || (i == 2 && l2 != null && yqgVar.b() < l2.longValue() + j)) {
                z = true;
            } else {
                z = false;
            }
        }
        Long l3 = (Long) pztVar.f.get(bxtVar.d());
        boolean z10 = l3 != null && yqgVar.b() < l3.longValue() + rztVar.c;
        Set set2 = set;
        if (!(set2 instanceof Collection) || !set2.isEmpty()) {
            Iterator it = set2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z2 = false;
                    break;
                }
                if (u890.j(((o89) it.next()).a, bxtVar.d())) {
                    z2 = true;
                    break;
                }
            }
        } else {
            z2 = false;
            break;
        }
        Set set3 = qztVar.c;
        if (!(set3 instanceof Collection) || !set3.isEmpty()) {
            Iterator it2 = set3.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z3 = false;
                    break;
                }
                if (u890.j(((n89) it2.next()).a, bxtVar.d())) {
                    z3 = true;
                    break;
                }
            }
        } else {
            z3 = false;
            break;
        }
        boolean z11 = z2 || z3;
        Set set4 = set;
        if (!(set4 instanceof Collection) || !set4.isEmpty()) {
            Iterator it3 = set4.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    z4 = false;
                    break;
                }
                o89 o89Var = (o89) it3.next();
                if (o89Var.d && !u890.j(o89Var.a, bxtVar.d())) {
                    z4 = true;
                    break;
                }
            }
        } else {
            z4 = false;
            break;
        }
        if (z5) {
            return dxt.a;
        }
        if (z7) {
            return cxt.a;
        }
        if (z8) {
            return fxt.a;
        }
        if (z9) {
            return hxt.a;
        }
        if (z) {
            return ixt.a;
        }
        if (z10) {
            return jxt.a;
        }
        if (!z11) {
            return gxt.a;
        }
        if (z4) {
            return ext.a;
        }
        return null;
    }

    public Object e(u310 u310Var, msg msgVar) {
        String str;
        try {
            String str2 = u310Var.c;
            if (str2 == null || ihc1.y0(str2)) {
                throw new IllegalArgumentException("content name is required");
            }
            String str3 = u310Var.d;
            if (str3 == null || ihc1.y0(str3)) {
                throw new IllegalArgumentException("Subtitle is required");
            }
            Uri uri = u310Var.j;
            if (uri == null) {
                throw new IllegalArgumentException("A media uri is required");
            }
            ArrayList arrayListG = a0b.g(u310Var);
            int i = u310Var.J;
            if (i == 0) {
                return new m231(new IllegalArgumentException("Media type can not be null"));
            }
            wmy wmyVar = new wmy();
            frl1 frl1Var = (frl1) wmyVar.a;
            frl1 frl1Var2 = (frl1) frl1Var.c;
            frl1Var2.b = u310Var.a;
            frl1Var.b = str2;
            ((v280) wmyVar.f).c(str3);
            String strL = new y6b1(uri.toString(), false).l();
            int iOrdinal = msgVar.ordinal();
            boolean z = true;
            if (iOrdinal == 0) {
                str = "spotify-engage-sdk-recommendation";
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "spotify-engage-sdk-continuation";
            }
            wmyVar.b = ekb.l(strL, str);
            ((v280) frl1Var2.c).e(arrayListG);
            wmyVar.c = Boolean.valueOf(u310Var.m);
            if (i != 4 && i != 6) {
                z = false;
            }
            wmyVar.e = Boolean.valueOf(z);
            rjn rjnVar = new rjn((byte) 27, false);
            rjnVar.b = Long.valueOf(this.a.b() + 86400000);
            ((v280) wmyVar.d).c(new fku(rjnVar));
            return new qh40(wmyVar);
        } catch (Throwable th) {
            return new m231(th);
        }
    }

    public kzt(ekb ekbVar, a0b a0bVar, yqg yqgVar) {
        this.a = yqgVar;
    }
}
