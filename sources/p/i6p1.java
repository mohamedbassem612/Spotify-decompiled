package p;

import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import android.util.LruCache;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.recents.recentsdatasourceimpl.GroupMetadata;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class i6p1 {
    public static b180 a;
    public static b180 b;

    public static final void a(lf1 lf1Var, qim0 qim0Var, vzq0 vzq0Var, iu30 iu30Var, ffe1 ffe1Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        qim0 qim0Var3;
        qim0 qim0VarD;
        m4c m4cVar = fkj0.X;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(651013495);
        if ((i & 6) == 0) {
            i2 = (b0kVar2.g(lf1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= b0kVar2.i(vzq0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= b0kVar2.i(iu30Var) ? 2048 : 1024;
        }
        if (b0kVar2.Y(i3 & 1, (i3 & 1171) != 1170)) {
            b0kVar2.d0();
            int i4 = i & 1;
            qim0 qim0Var4 = nim0.a;
            if (i4 == 0 || b0kVar2.E()) {
                qim0Var3 = qim0Var4;
            } else {
                b0kVar2.b0();
                qim0Var3 = qim0Var;
            }
            b0kVar2.s();
            xtb0 xtb0VarA = aub0.a(0, b0kVar2, 3);
            float fX0 = ((wat) b0kVar2.k(t4k.h)).X0(160.0f);
            Object objT = b0kVar2.T();
            if (objT == m4cVar) {
                objT = yv91.a(new tf1(xtb0VarA, fX0, (byte) 0));
                b0kVar2.s0(objT);
            }
            tob1 tob1Var = (tob1) objT;
            if (lf1Var.g) {
                qim0VarD = d1u.E(1.0f, u7h.g, u291.d(qim0Var3, 1.0f), d4o1.a);
            } else {
                qim0VarD = u291.d(qim0Var3, 1.0f);
            }
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarD);
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
            qim0 qim0VarD2 = u291.d(anm1.N("LazyColumn", qim0Var4), 1.0f);
            boolean z = ((i3 & 14) == 4) | ((i3 & 7168) == 2048);
            Object objT2 = b0kVar2.T();
            if (z || objT2 == m4cVar) {
                objT2 = new of1(lf1Var, iu30Var);
                b0kVar2.s0(objT2);
            }
            ujo1.d(qim0VarD2, xtb0VarA, vzq0Var, false, null, null, null, false, null, (iu30) objT2, b0kVar2, i3 & 896, 504);
            b0kVar2 = b0kVar2;
            uwr uwrVar = cbx.a;
            bzn1.e(null, apo.r(53781725, new n2(lf1Var, tob1Var, (byte) 13), b0kVar2), false, null, new qgr0(u7h.b(cbx.a(b0kVar2).a.c, ((Number) tob1Var.getValue()).floatValue(), 0.0f, 0.0f, 0.0f, 14)), null, null, null, b0kVar2, 48, 237);
            b0kVar2.r(true);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new hy0((byte) 2, i, lf1Var, vzq0Var, ffe1Var, iu30Var, qim0Var2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [boolean, byte] */
    public static final void b(d5a d5aVar, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        ?? r4;
        String str;
        String str2 = d5aVar.a;
        m4c m4cVar = fkj0.X;
        String str3 = d5aVar.f;
        String str4 = d5aVar.c;
        String str5 = d5aVar.e;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-442386959);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.g(d5aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            d36 d36Var = new d36(16.0f, true, new um5(false));
            long jC = huj.c(d5aVar.d);
            cr31 cr31VarB = er31.b(8.0f);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarX = uyn1.x(u291.f(dug.f(qim0Var3, jC, cr31VarB), 1.0f), 16.0f);
            jw31 jw31VarA = ew31.a(d36Var, een.Z, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
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
            int i4 = i3;
            w0h1.a(huj.e(str4), isl.a, u291.r(qim0Var3, 24.0f), huj.c(str5), 0L, huj.d(str4), x340Var, 56, 16);
            x340 x340Var2 = x340Var;
            mbh mbhVarA = jbh.a(new d36(16.0f, true, new um5(false)), een.P0, x340Var2, 0);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0Var3);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE2, x340Var2, lljVar4);
            if (str2.length() > 0) {
                x340Var2.i0(-507006046);
                qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
                long jC2 = huj.c(str5);
                uwr uwrVar = cbx.a;
                r4 = 0;
                str = str5;
                qim0Var2 = qim0Var3;
                uwo1.e(str2, qim0VarF, cbx.d(x340Var2).h, jC2, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2032);
                x340Var2 = x340Var2;
                x340Var2.r(false);
            } else {
                r4 = 0;
                str = str5;
                qim0Var2 = qim0Var3;
                x340Var2.i0(-506804949);
                x340Var2.r(false);
            }
            String str6 = d5aVar.b;
            int i5 = i4 & 896;
            ?? r14 = i5 == 256 ? 1 : r4;
            Object objT = x340Var2.T();
            if (r14 != 0 || objT == m4cVar) {
                objT = new ib2(iu30Var, (byte) 29);
                x340Var2.s0(objT);
            }
            af5 af5VarA = huj.a(str6, (iu30) objT);
            qim0 qim0VarF2 = u291.f(qim0Var2, 1.0f);
            long jC3 = huj.c(str);
            uwr uwrVar2 = cbx.a;
            x340 x340Var3 = x340Var2;
            uwo1.d(af5VarA, jC3, qim0VarF2, cbx.d(x340Var2).g, null, null, 0, false, null, 0, null, null, x340Var3, 0, 0, 4080);
            x340Var = x340Var3;
            if (str3.length() > 0) {
                x340Var.i0(-506461903);
                hr80.d(u291.f(qim0Var2, 1.0f), 1.0f, u7h.b(huj.c(str), 0.1f, 0.0f, 0.0f, 0.0f, 14), x340Var, 0, 0);
                ?? r15 = i5 == 256 ? 1 : r4;
                Object objT2 = x340Var.T();
                if (r15 != 0 || objT2 == m4cVar) {
                    objT2 = new c5a(iu30Var, (byte) r4);
                    x340Var.s0(objT2);
                }
                uwo1.d(huj.a(str3, (iu30) objT2), u7h.b(huj.c(str), 0.7f, 0.0f, 0.0f, 0.0f, 14), u291.f(qim0Var2, 1.0f), cbx.d(x340Var).j, null, null, 0, false, null, 0, null, null, x340Var, 0, 0, 4080);
                x340Var = x340Var;
                x340Var.r((boolean) r4);
            } else {
                x340Var.i0(-505975637);
                x340Var.r((boolean) r4);
            }
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xx(d5aVar, qim0Var2, iu30Var, i, (byte) 24);
        }
    }

    public static final void c(float f, int i, b0k b0kVar, qim0 qim0Var) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1015986883);
        int i2 = i | 6 | (b0kVar3.d(f) ? 32 : 16);
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            long jA = cbx.a(b0kVar3).a.a.a();
            cua cuaVar = cbx.b(b0kVar3).f;
            b0kVar2 = b0kVar3;
            jto1.b(dug.f(qim0VarF, jA, er31.b(16.0f)), null, null, false, null, null, null, null, null, xwi.a, null, apo.r(-46372603, new yy2((byte) 6, f), b0kVar3), null, null, null, xwi.b, b0kVar2, 805306368, 196656, 30206);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ou(qim0Var2, f, i, (byte) 6);
        }
    }

    public static final void d(float f, float f2, float f3, cr31 cr31Var, b0k b0kVar, int i, int i2) {
        float f4;
        int i3;
        cr31 cr31Var2;
        float f5;
        cr31 cr31VarB;
        float f6;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1887033023);
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 = i | 384;
            f4 = f3;
        } else if ((i & 384) == 0) {
            f4 = f3;
            i3 = (x340Var.d(f4) ? 256 : 128) | i;
        } else {
            f4 = f3;
            i3 = i;
        }
        int i5 = i3 | 1024;
        if (x340Var.Y(i5 & 1, (i5 & 1171) != 1170)) {
            x340Var.d0();
            if ((i & 1) == 0 || x340Var.E()) {
                float f7 = i4 != 0 ? 0.0f : f4;
                uwr uwrVar = cbx.a;
                cua cuaVar = cbx.b(x340Var).f;
                cr31VarB = er31.b(4.0f);
                f6 = f7;
            } else {
                x340Var.b0();
                f6 = f4;
                cr31VarB = cr31Var;
            }
            x340Var.s();
            qim0 qim0VarB = uyn1.B(u291.h(u291.v(nim0.a, f), f2), 0.0f, f6, 0.0f, 0.0f, 13);
            uwr uwrVar2 = cbx.a;
            t1c.a(cwl1.l0(dug.f(qim0VarB, cbx.a(x340Var).a.b.a(), cr31VarB), 0L, cr31VarB, 13), x340Var, 0);
            cr31Var2 = cr31VarB;
            f5 = f6;
        } else {
            x340Var.b0();
            cr31Var2 = cr31Var;
            f5 = f4;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ep7(f, f2, f5, cr31Var2, i, i2);
        }
    }

    public static final void e(zyi0 zyi0Var, bzi0 bzi0Var, b0k b0kVar, int i) {
        zyi0 zyi0Var2;
        bzi0 bzi0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1784292592);
        int i2 = (x340Var.g(zyi0Var) ? 4 : 2) | i | (x340Var.i(bzi0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            zyi0Var2 = zyi0Var;
            bzi0Var2 = bzi0Var;
            otw.c(bzi0Var2, zyi0Var2, (qim0) null, (ipb1) null, x340Var, ((i2 >> 3) & 14) | ((i2 << 3) & 112), 12);
        } else {
            zyi0Var2 = zyi0Var;
            bzi0Var2 = bzi0Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new him0(zyi0Var2, bzi0Var2, i, (byte) 1);
        }
    }

    public static final jeh1 f(g020 g020Var) {
        return g020Var instanceof c020 ? geh1.a : geh1.b;
    }

    public static k310 g(String str, w281 w281Var, List list, Context context, ue4 ue4Var, mre0 mre0Var) {
        m98 m98Var;
        String str2 = null;
        if (w281Var == null) {
            return null;
        }
        boolean z = w281Var.c;
        u281 u281Var = w281Var.g;
        String str3 = u281Var != null ? u281Var.a : null;
        List list2 = list;
        ArrayList<hix0> arrayList = new ArrayList(q7h.U(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            wnb1 wnb1Var = (wnb1) ((mmr0) it.next()).b;
            arrayList.add(wnb1Var != null ? wnb1Var.e : null);
        }
        boolean zA = ue4Var.a();
        u451 u451Var = new u451(mre0Var, (byte) 29);
        if (z) {
            boolean z2 = false;
            boolean z3 = true;
            long j = 0;
            long j2 = 0;
            for (hix0 hix0Var : arrayList) {
                long jF = hix0Var != null ? hix0Var.f() : 0L;
                j2 += jF;
                if (hix0Var instanceof gix0) {
                    gix0 gix0Var = (gix0) hix0Var;
                    j += gix0Var.c;
                    if (!gix0Var.a) {
                        z3 = false;
                    }
                } else if (hix0Var instanceof hix0) {
                    boolean z4 = hix0Var.a;
                    if (z4) {
                        j += jF;
                    } else {
                        z3 = false;
                    }
                    if (z4) {
                    }
                } else {
                    if (hix0Var != null) {
                        eg.o();
                        return null;
                    }
                    z3 = false;
                }
                z2 = true;
            }
            char c = z2 ? z3 ? (char) 3 : (char) 2 : (char) 1;
            long j3 = j2 / 1000;
            long j4 = j / 1000;
            boolean z5 = c == 3 || (c == 2 && (j3 == 0 || j4 >= j3));
            boolean z6 = c == 2 && !z5;
            String string = context.getString(z6 ? 2131952604 : 2131952605);
            if (z5) {
                str2 = (String) u451Var.invoke(0L, (Object) null, Boolean.TRUE);
            } else if (z6) {
                str2 = (String) u451Var.invoke(Long.valueOf(j3), Long.valueOf(j3 - j4), Boolean.FALSE);
            }
            m98Var = new m98(false, string, str2, 2131233210, z5 ? 1.0d : z6 ? j / j2 : 0.0d, str3);
        } else {
            String string2 = zA ? context.getString(2131952606) : "";
            string2.getClass();
            m98Var = new m98(true, string2, zA ? context.getString(2131952602) : "", 2131233209, 0.0d, str3);
        }
        return new k310(m98Var.a, str, m98Var.b, m98Var.c, kno1.q(context, m98Var.d), Double.valueOf(m98Var.e), m98Var.f, false);
    }

    public static final mch h(ArrayList arrayList) {
        return new mch(arrayList);
    }

    public static r381 i(List list, Map map, w281 w281Var) {
        if (w281Var == null) {
            return null;
        }
        ArrayList<mmr0> arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zuc0 zuc0Var = (zuc0) it.next();
            wnb1 wnb1Var = (wnb1) map.get(new iey0(zuc0Var.c));
            mmr0 mmr0Var = wnb1Var != null ? new mmr0(zuc0Var, wnb1Var) : null;
            if (mmr0Var != null) {
                arrayList.add(mmr0Var);
            }
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        for (mmr0 mmr0Var2 : arrayList) {
            zuc0 zuc0Var2 = (zuc0) mmr0Var2.a;
            wnb1 wnb1Var2 = (wnb1) mmr0Var2.b;
            arrayList2.add(new n98(new mmr0(zuc0Var2, wnb1Var2), n(zuc0Var2, wnb1Var2)));
        }
        Boolean boolValueOf = Boolean.valueOf(!w281Var.c);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (!u890.j(boolValueOf.equals(Boolean.TRUE) ? Boolean.valueOf(((n98) obj).b) : null, Boolean.FALSE)) {
                arrayList3.add(obj);
            }
        }
        boolean zEquals = boolValueOf.equals(Boolean.FALSE);
        int i = -1;
        int i2 = 0;
        if (zEquals) {
            Iterator it2 = arrayList3.iterator();
            int i3 = 0;
            while (it2.hasNext()) {
                if (((n98) it2.next()).b) {
                    i = i3;
                    break;
                }
                i3++;
            }
        }
        if (i > 0) {
            List listSingletonList = Collections.singletonList(arrayList3.get(i));
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : arrayList3) {
                int i4 = i2 + 1;
                if (i2 < 0) {
                    p7h.T();
                    throw null;
                }
                if (i2 != i) {
                    arrayList4.add(obj2);
                }
                i2 = i4;
            }
            arrayList3 = o7h.N0(arrayList4, listSingletonList);
        }
        ArrayList arrayList5 = new ArrayList(q7h.U(arrayList3, 10));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList5.add(((n98) it3.next()).a);
        }
        return new r381(arrayList5, arrayList);
    }

    public static final atr0 j(zuc0 zuc0Var) {
        String str = zuc0Var.a;
        String str2 = (String) zuc0Var.g.get("children_group_id");
        if (str2 == null) {
            str2 = "";
        }
        return new atr0(str, str2);
    }

    public static w281 k(String str, Map map) {
        wnb1 wnb1Var = (wnb1) map.get(new iey0(str));
        if (wnb1Var != null) {
            return wnb1Var.h;
        }
        return null;
    }

    public static final go80 l(klm klmVar, cdp0 cdp0Var) {
        return klmVar.a("WhereToPlaySuggestionObserverPluginDaemon", new mcp0(cdp0Var, (byte) 29));
    }

    public static final void m(iz20 iz20Var) {
        if (!((pim0) iz20Var).a.N0) {
            qf80.c("visitChildren called on an unattached node");
        }
        bfn0 bfn0Var = new bfn0(0, new pim0[16]);
        pim0 pim0Var = ((pim0) iz20Var).a;
        pim0 pim0Var2 = pim0Var.f;
        if (pim0Var2 == null) {
            oap1.g(bfn0Var, pim0Var);
        } else {
            bfn0Var.b(pim0Var2);
        }
        while (true) {
            int i = bfn0Var.c;
            if (i == 0) {
                return;
            }
            pim0 pim0VarS = (pim0) bfn0Var.l(i - 1);
            if ((pim0VarS.d & 1024) == 0) {
                oap1.g(bfn0Var, pim0VarS);
            } else {
                while (pim0VarS != null) {
                    if ((pim0VarS.c & 1024) != 0) {
                        bfn0 bfn0Var2 = null;
                        while (pim0VarS != null) {
                            if (pim0VarS instanceof d030) {
                                d030 d030Var = (d030) pim0VarS;
                                vy20 vy20Var = oap1.C(d030Var).getFocusOwner().d;
                                if (vy20Var.c.a(d030Var)) {
                                    vy20Var.a();
                                }
                            } else if ((pim0VarS.c & 1024) != 0 && (pim0VarS instanceof l5t)) {
                                int i2 = 0;
                                for (pim0 pim0Var3 = ((l5t) pim0VarS).P0; pim0Var3 != null; pim0Var3 = pim0Var3.f) {
                                    if ((pim0Var3.c & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            pim0VarS = pim0Var3;
                                        } else {
                                            if (bfn0Var2 == null) {
                                                bfn0Var2 = new bfn0(0, new pim0[16]);
                                            }
                                            if (pim0VarS != null) {
                                                bfn0Var2.b(pim0VarS);
                                                pim0VarS = null;
                                            }
                                            bfn0Var2.b(pim0Var3);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            pim0VarS = oap1.s(bfn0Var2);
                        }
                        break;
                    }
                    pim0VarS = pim0VarS.f;
                }
            }
        }
    }

    public static boolean n(zuc0 zuc0Var, wnb1 wnb1Var) {
        mdz mdzVar;
        k1z k1zVar = zuc0Var.p;
        k1z k1zVar2 = k1zVar instanceof k1z ? k1zVar : null;
        return ((k1zVar2 != null ? k1zVar2.p : null) == h1z.a) || (((wnb1Var == null || (mdzVar = wnb1Var.i) == null) ? 0 : mdzVar.j) == 2);
    }

    public static rxk0 o(String str, String str2) {
        return new rxk0(str, str2);
    }

    public static final GroupMetadata p(zuc0 zuc0Var) {
        Object m231Var;
        GroupMetadata m231Var2;
        String str = (String) zuc0Var.g.get("group_metadata");
        if (str == null) {
            return null;
        }
        try {
            m231Var = Base64.decode(str, 0);
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        if (m231Var instanceof m231) {
            m231Var = null;
        }
        byte[] bArr = (byte[]) m231Var;
        if (bArr == null) {
            return null;
        }
        try {
            m231Var2 = GroupMetadata.s(bArr);
        } catch (Throwable th2) {
            m231Var2 = new m231(th2);
        }
        return m231Var2 instanceof m231 ? null : m231Var2;
    }

    public static final mch q(f4r f4rVar, f4r f4rVar2) {
        List listSingletonList = z6x.a;
        List listSingletonList2 = f4rVar != null ? Collections.singletonList(f4rVar) : listSingletonList;
        if (f4rVar2 != null) {
            listSingletonList = Collections.singletonList(f4rVar2);
        }
        return new mch(o7h.N0(listSingletonList, listSingletonList2));
    }

    public static List r(List list, Map map) {
        zoy0 zoy0Var;
        zoy0 zoy0Var2;
        Object obj;
        int i;
        ba80 ba80VarU1 = o7h.u1(list);
        ArrayList arrayList = new ArrayList();
        ca80 it = ba80VarU1.iterator();
        while (true) {
            ca80 ca80Var = it;
            if (!((Iterator) ca80Var.c).hasNext()) {
                break;
            }
            Object next = ca80Var.next();
            zuc0 zuc0Var = (zuc0) ((aa80) next).b;
            if (n(zuc0Var, (wnb1) map.get(new iey0(zuc0Var.c)))) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            Object next2 = it2.next();
            if (it2.hasNext()) {
                wnb1 wnb1Var = (wnb1) map.get(new iey0(((zuc0) ((aa80) next2).b).c));
                long j = (wnb1Var == null || (zoy0Var2 = wnb1Var.g) == null) ? 0L : zoy0Var2.c;
                do {
                    Object next3 = it2.next();
                    wnb1 wnb1Var2 = (wnb1) map.get(new iey0(((zuc0) ((aa80) next3).b).c));
                    long j2 = (wnb1Var2 == null || (zoy0Var = wnb1Var2.g) == null) ? 0L : zoy0Var.c;
                    if (j < j2) {
                        next2 = next3;
                        j = j2;
                    }
                } while (it2.hasNext());
            }
            obj = next2;
        } else {
            obj = null;
        }
        aa80 aa80Var = (aa80) obj;
        return (aa80Var == null || (i = aa80Var.a) == 0) ? list : o7h.N0(list.subList(i + 1, list.size()), o7h.N0(list.subList(0, i), Collections.singletonList((zuc0) list.get(i))));
    }

    public static final ovu0 s(dvu0 dvu0Var, String str, hvu0 hvu0Var, String str2) {
        lvu0 mvu0Var;
        zuu0 zuu0Var = dvu0Var.a;
        String id = zuu0Var.getId();
        String strD = zuu0Var.d();
        String playlistUri = zuu0Var.getPlaylistUri();
        jvu0 ivu0Var = u890.j(zuu0Var.getSender().a, str2) ? jvu0.a : new ivu0(zuu0Var.getSender().b);
        String strA = zuu0Var.a();
        boolean z = dvu0Var.b;
        if (zuu0Var instanceof zuu0) {
            mvu0Var = new lvu0(zuu0Var.f, hvu0Var);
        } else if (zuu0Var instanceof bvu0) {
            mvu0Var = new nvu0(hvu0Var);
        } else {
            if (!(zuu0Var instanceof avu0)) {
                eg.o();
                return null;
            }
            mvu0Var = new mvu0(hvu0Var, ((avu0) zuu0Var).f);
        }
        return new ovu0(id, strD, playlistUri, str, ivu0Var, strA, z, mvu0Var);
    }

    public static final jmr0 t(Uri uri, LruCache lruCache, q8n q8nVar, b0k b0kVar, int i) {
        Uri uri2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        Context context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
        uwr uwrVar = cbx.a;
        long jA = cbx.a(x340Var).a.b.a();
        i9h i9hVar = (pxa) lruCache.get(uri);
        int i2 = (i & 14) ^ 6;
        boolean z = true;
        boolean z2 = (i2 > 4 && x340Var.g(uri)) || (i & 6) == 4;
        Object objT = x340Var.T();
        if (z2 || objT == m4cVar) {
            objT = v8r.q(i9hVar != null ? i9hVar : new i9h(jA));
            x340Var.s0(objT);
        }
        ven0 ven0Var = (ven0) objT;
        Object objT2 = x340Var.T();
        if (objT2 == m4cVar) {
            objT2 = qxd0.M(o6x.a, x340Var);
            x340Var.s0(objT2);
        }
        c9n c9nVar = (c9n) objT2;
        if (i9hVar == null) {
            x340Var.i0(-515113291);
            boolean zI = x340Var.i(c9nVar) | x340Var.i(q8nVar) | x340Var.i(context);
            if ((i2 <= 4 || !x340Var.g(uri)) && (i & 6) != 4) {
                z = false;
            }
            boolean zI2 = zI | z | x340Var.i(lruCache) | x340Var.g(ven0Var);
            Object objT3 = x340Var.T();
            if (zI2 || objT3 == m4cVar) {
                uri2 = uri;
                objT3 = new t3t0(c9nVar, q8nVar, lruCache, uri2, context, ven0Var);
                x340Var.s0(objT3);
            } else {
                uri2 = uri;
            }
            qxd0.i(uri2, (iu30) objT3, x340Var);
            x340Var.r(false);
        } else {
            x340Var.i0(-514293558);
            x340Var.r(false);
        }
        return (jmr0) ven0Var.getValue();
    }

    public static final m441 u(mr20 mr20Var, Object obj) {
        return new m441(new xtz(obj, mr20Var, (lnm) null, (byte) 14));
    }

    public static final bge v(mr20 mr20Var, long j, Object obj) {
        return w(mr20Var, j, new nd70(obj, (byte) 13));
    }

    public static final bge w(mr20 mr20Var, long j, Function0 function0) {
        return h4p1.g(new xn2((Object) mr20Var, j, (Object) function0, (lnm) null, (byte) 6));
    }
}
