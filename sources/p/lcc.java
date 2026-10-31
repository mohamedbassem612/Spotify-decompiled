package p;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.compose.ui.graphics.ColorFilter;
import com.spotify.mobius.Next;
import com.spotify.player.esperanto.proto.EsPreparePlayOptions;
import com.spotify.player.esperanto.proto.EsSkipToTrack;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import spotify.resumption_progress_esperanto.proto.ResumptionProgressEsperanto;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class lcc {
    public static final int[] a = {-16842910};
    public static final int[] b = new int[0];
    public static b180 c;
    public static b180 d;

    public static apk0 A(Integer num, r6h1 r6h1Var) {
        return new apk0(num, r6h1Var);
    }

    public static final String B(ResumptionProgressEsperanto.MarkAsFinishedResponse markAsFinishedResponse) {
        h290 h290VarN = markAsFinishedResponse.n();
        ArrayList<ResumptionProgressEsperanto.ItemMarkResult> arrayList = new ArrayList();
        for (Object obj : h290VarN) {
            if (((ResumptionProgressEsperanto.ItemMarkResult) obj).o() != r831.c) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        for (ResumptionProgressEsperanto.ItemMarkResult itemMarkResult : arrayList) {
            arrayList2.add(itemMarkResult.n() + "=" + itemMarkResult.o());
        }
        return "result=" + markAsFinishedResponse.o() + ", failedItems=" + arrayList2;
    }

    public static bg11 C(List list, su30 su30Var) {
        v280 v280VarM = b380.m();
        for (int i = 0; i < list.size(); i++) {
            Bundle bundle = (Bundle) list.get(i);
            bundle.getClass();
            v280VarM.c(su30Var.apply(bundle));
        }
        return v280VarM.g();
    }

    public static final boolean D(w831 w831Var, h290 h290Var) {
        if (w831Var != w831.c) {
            return false;
        }
        if (h290Var.isEmpty()) {
            return true;
        }
        Iterator it = h290Var.iterator();
        while (it.hasNext()) {
            if (((ResumptionProgressEsperanto.ItemMarkResult) it.next()).o() != r831.c) {
                return false;
            }
        }
        return true;
    }

    public static ArrayList E(Collection collection, su30 su30Var) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((Bundle) su30Var.apply(it.next()));
        }
        return arrayList;
    }

    public static final t0c F(llw0 llw0Var) {
        if (llw0Var instanceof ilw0) {
            ilw0 ilw0Var = (ilw0) llw0Var;
            return new ant(ilw0Var.a, ilw0Var.b);
        }
        if (llw0Var instanceof jlw0) {
            return new bnt(((jlw0) llw0Var).a);
        }
        if (llw0Var instanceof klw0) {
            klw0 klw0Var = (klw0) llw0Var;
            return new cnt(klw0Var.a, klw0Var.d);
        }
        eg.o();
        return null;
    }

    public static final EsPreparePlayOptions.PreparePlayOptions G(sgt0 sgt0Var, boolean z) {
        Long l;
        lqz lqzVarS = EsPreparePlayOptions.PreparePlayOptions.s();
        lqzVarS.u(z);
        String strA = sgt0Var.a();
        if (strA != null) {
            if (strA.equals(sgt0Var.getContextUri())) {
                strA = null;
            }
            if (strA != null) {
                wrz wrzVarP = EsSkipToTrack.SkipToTrack.p();
                wrzVarP.t(strA);
                lqzVarS.C(wrzVarP.build());
            }
        }
        if ((sgt0Var instanceof kgt0) && (l = ((kgt0) sgt0Var).c) != null) {
            lqzVarS.A(String.valueOf(l.longValue()));
        }
        return lqzVarS.build();
    }

    public static Next H(kak0 kak0Var, c2k0 c2k0Var) {
        lhg1 lhg1Var = kak0Var.S0;
        if (!c2k0Var.a.equals(o2p1.o(kak0Var))) {
            return Next.j();
        }
        boolean z = u890.j(lhg1Var.b.b, kak0Var.T0) && u890.j(lhg1Var.b.h, kak0Var.U0);
        uia uiaVar = c2k0Var.b;
        uia uiaVar2 = c2k0Var.c;
        int i = c2k0Var.d;
        int i2 = c2k0Var.e;
        Float f = c2k0Var.f;
        Float f2 = c2k0Var.g;
        lhg1 lhg1VarT = t9p1.t(kak0Var.h, f, f2);
        lhg1 lhg1VarT2 = kak0Var.V0;
        if (z) {
            lhg1VarT2 = lhg1VarT2 != null ? t9p1.t(lhg1VarT2, c2k0Var.f, c2k0Var.g) : null;
        }
        return x1p1.E(Next.h(kak0.a(kak0Var, (pdm0) null, (Boolean) null, (ycu0) null, lhg1VarT, (lhg1) null, (lhg1) null, (xx8) null, (List) null, (List) null, (Float) null, (lhg1) null, (lhg1) null, (lhg1) null, (String) null, (String) null, lhg1VarT2, (m8w0) null, false, 0, i, i2, (giq0) null, uiaVar, uiaVar2, f, f2, (Float) null, (Float) null, false, false, (String) null, false, (lhg1) null, (Boolean) null, (Integer) null, (lyj0) null, 0L, (Integer) null, (Integer) null, -1612710017, 1048545)));
    }

    public static final void a(u7h u7hVar, long j, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(285228237);
        int i2 = (x340Var.g(u7hVar) ? 4 : 2) | i | (x340Var.f(j) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            flb0 flb0Var = (flb0) x340Var.k(t4k.n);
            qim0 qim0VarV = u291.v(u291.h(qim0Var, 96.0f), 54.72f);
            boolean zE = x340Var.e(flb0Var.ordinal()) | x340Var.d(4.0f);
            Object objT = x340Var.T();
            if (zE || objT == fkj0.X) {
                objT = new gdh(flb0Var, (byte) 1);
                x340Var.s0(objT);
            }
            qim0 qim0VarC = i541.C(qim0VarV, (iu30) objT);
            long j2 = u7hVar != null ? u7hVar.a : j;
            u5j1 u5j1Var = d4o1.a;
            qim0 qim0VarF = dug.f(qim0VarC, j2, u5j1Var);
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
            t1c.a(dug.f(h2c.a.b(nim0.a), ((vex) zex.a.e).d, u5j1Var), x340Var, 0);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new w5l1(u7hVar, j, qim0Var, i, (byte) 0);
        }
    }

    public static final void b(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-993322938);
        int i2 = i | (x340Var.i(qim0Var) ? 4 : 2);
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            cwl1.b(qim0Var, (tl3) null, er31.b(8.0f), mgx.e, (vzq0) null, (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, asj.a, x340Var, i2 & 14, 48, 2034);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wfe1(qim0Var, i, (byte) 21);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r21v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v3 */
    public static final void c(c9 c9Var, long j, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        long j2;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(1591711880);
        int i2 = 2;
        int i3 = i | (b0kVar2.i(c9Var) ? 4 : 2) | (b0kVar2.f(j) ? 32 : 16);
        int i4 = 1;
        ?? r6 = 0;
        if (b0kVar2.Y(i3 & 1, (i3 & 19) != 18)) {
            ListIterator listIterator = c9Var.listIterator(0);
            int i5 = 0;
            while (listIterator.hasNext()) {
                Object next = listIterator.next();
                int i6 = i5 + 1;
                if (i5 < 0) {
                    p7h.T();
                    throw null;
                }
                sx30 sx30Var = (sx30) next;
                nim0 nim0Var = nim0.a;
                qim0 qim0VarN = anm1.N("benefit_" + i5, uyn1.z(0.0f, 4.0f, i4, nim0Var));
                jw31 jw31VarA = ew31.a(h36.a, een.N0, b0kVar2, (int) r6);
                int iHashCode = Long.hashCode(((x340) b0kVar2).T);
                xos0 xos0VarM = b0kVar2.m();
                qim0 qim0VarE = zr7.E(b0kVar2, qim0VarN);
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
                nko1.H(jw31VarA, b0kVar2, y580.O0);
                nko1.H(xos0VarM, b0kVar2, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
                nko1.F(b0kVar2);
                nko1.H(qim0VarE, b0kVar2, y580.Y);
                int iC = l1d.C(sx30Var.c);
                if (iC == 0) {
                    b0kVar2.i0(2130268032);
                    uwr uwrVar = cbx.a;
                    j2 = cbx.a(b0kVar2).b.a;
                    b0kVar2.r((boolean) r6);
                } else if (iC == i4) {
                    b0kVar2.i0(2130270115);
                    uwr uwrVar2 = cbx.a;
                    j2 = cbx.a(b0kVar2).b.b;
                    b0kVar2.r((boolean) r6);
                } else {
                    if (iC != i2) {
                        throw p3d1.k(b0kVar2, 2130265421, (boolean) r6);
                    }
                    b0kVar2.i0(2130272355);
                    uwr uwrVar3 = cbx.a;
                    j2 = cbx.a(b0kVar2).b.b;
                    b0kVar2.r((boolean) r6);
                }
                long j3 = j2;
                b0k b0kVar3 = b0kVar2;
                w0h1.a(sx30Var.b, isl.a, u291.r(nim0Var, 16.0f), j, 0L, false, b0kVar3, 56 | ((i3 << 6) & 7168), 48);
                op71.g(b0kVar3, u291.r(nim0Var, 12.0f));
                b0kVar2 = b0kVar3;
                ?? r21 = i4;
                uwo1.e(sx30Var.a, (qim0) null, cbx.d(b0kVar3).j, j3, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2034);
                b0kVar2.r((boolean) r21);
                i4 = r21 == true ? 1 : 0;
                i5 = i6;
                r6 = r6 == true ? 1 : 0;
                i2 = 2;
                i3 = i3;
            }
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new nk7(c9Var, j, i, (byte) 3);
        }
    }

    public static final void d(zx30 zx30Var, iu30 iu30Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        afx afxVar;
        String str = zx30Var.j;
        String str2 = zx30Var.i;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-2009486089);
        int i2 = (b0kVar3.i(zx30Var) ? 4 : 2) | i | (b0kVar3.i(iu30Var) ? 32 : 16);
        byte b2 = 0;
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            int i3 = ihx.f;
            afx afxVarE = ihx.e(26, zx30Var.l, 0L, u7h.b);
            if (str2.length() > 0) {
                b0kVar3.i0(-1345628299);
                boolean z = (i2 & 112) == 32;
                Object objT = b0kVar3.T();
                if (z || objT == m4cVar) {
                    objT = new bb30(iu30Var, (byte) 11);
                    b0kVar3.s0(objT);
                }
                Function0 function0 = (Function0) objT;
                b0kVar2 = b0kVar3;
                afxVar = afxVarE;
                o(str2, "btn_primary", true, afxVar, function0, b0kVar2, 432);
                b0kVar2.r(false);
            } else {
                afxVar = afxVarE;
                b0kVar2 = b0kVar3;
                b0kVar2.i0(-1345422645);
                b0kVar2.r(false);
            }
            if (str.length() > 0) {
                b0kVar2.i0(-1345368736);
                op71.g(b0kVar2, u291.h(nim0.a, 16.0f));
                boolean z2 = zx30Var.k;
                boolean z3 = (i2 & 112) == 32;
                Object objT2 = b0kVar2.T();
                if (z3 || objT2 == m4cVar) {
                    objT2 = new bb30(iu30Var, (byte) 12);
                    b0kVar2.s0(objT2);
                }
                b0k b0kVar4 = b0kVar2;
                o(str, "btn_secondary", z2, afxVar, (Function0) objT2, b0kVar4, 48);
                b0kVar2 = b0kVar4;
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(-1345081397);
                b0kVar2.r(false);
            }
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new xx30(zx30Var, iu30Var, i, b2);
        }
    }

    public static final void e(zx30 zx30Var, iu30 iu30Var, b0k b0kVar, int i) {
        String str = zx30Var.h;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1074456990);
        int i2 = (x340Var.i(zx30Var) ? 4 : 2) | i | (x340Var.i(iu30Var) ? 32 : 16);
        if (!x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            x340Var.b0();
        } else if (str.length() > 0) {
            x340Var.i0(-1242932371);
            boolean z = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new z720(iu30Var, (byte) 14);
                x340Var.s0(objT);
            }
            af5 af5VarA = huj.a(str, (iu30) objT);
            uwr uwrVar = cbx.a;
            uwo1.d(af5VarA, cbx.a(x340Var).b.b, anm1.N("txt_disclaimer", u291.f(uyn1.B(nim0.a, 0.0f, 16.0f, 0.0f, 0.0f, 13), 1.0f)), cbx.d(x340Var).m, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (cqs0) null, x340Var, 0, 0, 4064);
            x340Var = x340Var;
            x340Var.r(false);
        } else {
            x340Var.i0(-1242541244);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xx30(zx30Var, iu30Var, i, (byte) 1);
        }
    }

    public static final void f(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1211703910);
        int i2 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarN = fc11.n(i1p1.q(u291.v(u291.h(qim0Var, 112.0f), 63.84f), er31.b(4.0f)), 12.0f, 12.0f, d4o1.a);
            cr31 cr31VarB = er31.b(4.0f);
            long j = ((vex) zex.a.e).d;
            qim0 qim0VarO = sto1.o(qim0VarN, 12.0f, cr31VarB, false, j, j, 4);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarO);
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
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wfe1(qim0Var, i, (byte) 22);
        }
    }

    public static final void g(u7h u7hVar, String str, long j, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-1385790208);
        int i2 = i | (b0kVar2.g(u7hVar) ? 4 : 2) | (b0kVar2.g(str) ? 32 : 16) | (b0kVar2.f(j) ? 256 : 128) | (b0kVar2.i(qim0Var) ? 2048 : 1024);
        if (b0kVar2.Y(i2 & 1, (i2 & 1171) != 1170)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar2).b;
            cua cuaVar = cbx.b(b0kVar2).f;
            qim0 qim0VarF = dug.f(i1p1.q(u291.v(u291.h(qim0Var, 112.0f), 63.84f), er31.b(4.0f)), u7hVar != null ? u7hVar.a : j, d4o1.a);
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
            nim0 nim0Var = nim0.a;
            t(anm1.N("watch_feed_banner_element_sound_wave_test_tag", u291.f(nim0Var, 1.0f)), b0kVar2, 0);
            b0kVar2 = b0kVar2;
            cwl1.f(oi7.a(Uri.parse(str), (gw70) null, (xb10) null, (yqi1) null, (jmr0) null, (jmr0) null, false, false, (j6m) null, (iu30) null, (iu30) null, (iu30) null, 0L, b0kVar2, 0, 0, 131070), (String) null, i1p1.q(uyn1.z(8.0f, 0.0f, 2, u291.f(anm1.N("watch_feed_banner_element_book_artwork_test_tag", nim0Var), 1.0f)), er31.b(4.0f)), (tl3) null, mif1.S0, 0.0f, (ColorFilter) null, b0kVar2, 48, 104);
            b0kVar2.r(true);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new x5l1(u7hVar, str, j, qim0Var, i, (byte) 0);
        }
    }

    public static final void h(u7h u7hVar, String str, long j, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1830986213);
        int i2 = i | (b0kVar3.g(u7hVar) ? 4 : 2) | (b0kVar3.g(str) ? 32 : 16) | (b0kVar3.f(j) ? 256 : 128) | (b0kVar3.i(qim0Var) ? 2048 : 1024);
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(b0kVar3).f;
            b0kVar2 = b0kVar3;
            cwl1.f(oi7.a(Uri.parse(str), (gw70) null, (xb10) null, (yqi1) null, (jmr0) null, (jmr0) null, false, false, (j6m) null, (iu30) null, (iu30) null, (iu30) null, 0L, b0kVar2, 0, 0, 131070), (String) null, anm1.N("watch_feed_banner_element_video_thumbnail_test_tag", dug.f(i1p1.q(u291.v(u291.h(qim0Var, 112.0f), 63.84f), er31.b(4.0f)), u7hVar != null ? u7hVar.a : j, d4o1.a)), (tl3) null, mif1.P0, 0.0f, (ColorFilter) null, b0kVar2, 48, 104);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new x5l1(u7hVar, str, j, qim0Var, i, (byte) 1);
        }
    }

    public static final void i(zx30 zx30Var, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1241322286);
        int i2 = i | (x340Var.i(zx30Var) ? 4 : 2) | 48 | (x340Var.i(iu30Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            long j = zx30Var.m;
            cr31 cr31VarB = er31.b(8.0f);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(i1p1.q(dug.f(qim0Var3, j, cr31VarB), er31.b(8.0f)), 1.0f);
            x340Var.j0(475845883);
            wat watVar = (wat) x340Var.k(t4k.h);
            x340Var.j0(-492369756);
            Object objT = x340Var.T();
            if (objT == m4cVar) {
                objT = x0d.o(watVar, x340Var);
            }
            x340Var.r(false);
            ufh0 ufh0Var = (ufh0) objT;
            x340Var.j0(-492369756);
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = x0d.m(x340Var);
            }
            x340Var.r(false);
            xhl xhlVar = (xhl) objT2;
            x340Var.j0(-492369756);
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = v8r.q(Boolean.FALSE);
                x340Var.s0(objT3);
            }
            x340Var.r(false);
            ven0 ven0Var = (ven0) objT3;
            x340Var.j0(-492369756);
            Object objT4 = x340Var.T();
            if (objT4 == m4cVar) {
                objT4 = x0d.n(xhlVar, x340Var);
            }
            x340Var.r(false);
            nil nilVar = (nil) objT4;
            x340Var.j0(-492369756);
            Object objT5 = x340Var.T();
            if (objT5 == m4cVar) {
                objT5 = bb00.i(rih1.a, f331.X0, x340Var);
            }
            x340Var.r(false);
            ven0 ven0Var2 = (ven0) objT5;
            who1.h(s161.b(qim0VarF, false, new tu(ufh0Var, (byte) 11)), apo.i(x340Var, -1488813576, new uk20(ven0Var2, xhlVar, new su(ven0Var, nilVar, (byte) 7), zx30Var, iu30Var, (byte) 4)), new ru(ven0Var2, ufh0Var, nilVar, ven0Var, (byte) 7), x340Var, 48);
            x340Var.r(false);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xx00(zx30Var, qim0Var2, iu30Var, i, (byte) 22);
        }
    }

    public static final void j(pnb1 pnb1Var, String str, iu30 iu30Var, weq weqVar, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(99263297);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? b0kVar3.g(pnb1Var) : b0kVar3.i(pnb1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(weqVar) ? 2048 : 1024;
        }
        if (!b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        } else if (pnb1Var instanceof fmb1) {
            b0kVar2 = b0kVar3;
            b0kVar2.i0(-2078915764);
            Object objT = b0kVar2.T();
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.TRUE);
                b0kVar2.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            if (((Boolean) ven0Var.getValue()).booleanValue()) {
                b0kVar2.i0(-2078831320);
                Object objT2 = b0kVar2.T();
                if (objT2 == m4cVar) {
                    objT2 = weqVar.a(new gp0(iu30Var, ven0Var, (byte) 16));
                    b0kVar2.s0(objT2);
                }
                hbd hbdVar = (hbd) objT2;
                boolean z = (i2 & 112) == 32;
                Object objT3 = b0kVar2.T();
                Object obj = objT3;
                if (z || objT3 == m4cVar) {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                    intent.putExtra("age_assurance_flow_completed", true);
                    b0kVar2.s0(intent);
                    obj = intent;
                }
                fmb1 fmb1Var = (fmb1) pnb1Var;
                otw.c(hbdVar, new fbd(fmb1Var.b, fmb1Var.d, (Intent) obj), (qim0) null, (ipb1) null, b0kVar2, 0, 12);
                b0kVar2 = b0kVar2;
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(-2077915487);
                b0kVar2.r(false);
            }
            b0kVar2.r(false);
        } else {
            b0kVar3.i0(-2079353887);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            Object objT4 = b0kVar3.T();
            if (objT4 == m4cVar) {
                objT4 = ktd.n(b0kVar3);
            }
            idn0 idn0Var = (idn0) objT4;
            Object objT5 = b0kVar3.T();
            if (objT5 == m4cVar) {
                objT5 = lx70.X;
                b0kVar3.s0(objT5);
            }
            qim0 qim0VarV = bin.v(qim0VarD, idn0Var, (ga80) null, false, (String) null, (pm31) null, (Function0) objT5, 28);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarV);
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
            b0kVar2 = b0kVar3;
            xto1.e(u291.B(nim0Var, (gra) null, 3), 6, 0L, 0L, b0kVar2, 48, 12);
            b0kVar2.r(true);
            b0kVar2.r(false);
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ke20(i, pnb1Var, str, iu30Var, weqVar, (byte) 22);
        }
    }

    public static final void k(boolean z, iye0 iye0Var, k2t0 k2t0Var, boolean z2, iu30 iu30Var, b0k b0kVar, int i) {
        long j;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(1040414273);
        int i2 = i | (b0kVar2.h(z) ? 4 : 2) | (b0kVar2.g(iye0Var) ? 32 : 16) | (b0kVar2.g(k2t0Var) ? 256 : 128) | (b0kVar2.h(z2) ? 2048 : 1024) | (b0kVar2.i(iu30Var) ? 16384 : 8192);
        if (b0kVar2.Y(i2 & 1, (i2 & 9363) != 9362)) {
            if (z2) {
                b0kVar2.i0(-889254583);
                uwr uwrVar = cbx.a;
                j = cbx.a(b0kVar2).c.f;
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(-889252691);
                b0kVar2.r(false);
                uwr uwrVar2 = cbx.a;
                j = ((wex) ((gmt) zex.a.c).c).d;
            }
            long j2 = j;
            j2i j2iVar = txi.a;
            j2i j2iVarR = apo.r(213111282, new o3(z, iye0Var, iu30Var, (byte) 26), b0kVar2);
            x7f1 x7f1VarC = kkn.C(u7h.j, j2, cbx.a(b0kVar2).b.a, cbx.a(b0kVar2).b.a, cbx.a(b0kVar2).b.a, b0kVar2, 32);
            b0kVar2 = b0kVar2;
            ti5.d(j2iVar, (qim0) null, (vu30) null, j2iVarR, 0.0f, (erl1) null, x7f1VarC, k2t0Var, b0kVar2, ((i2 << 15) & 29360128) | 3078, 54);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new hy(z, iye0Var, k2t0Var, z2, iu30Var, i);
        }
    }

    public static final void l(int i, String str, String str2, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(337613763);
        int i2 = i | (x340Var2.g(str) ? 4 : 2) | (x340Var2.g(str2) ? 32 : 16) | (x340Var2.i(qim0Var) ? 256 : 128);
        if (x340Var2.Y(i2 & 1, (i2 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            float f = cbx.b(x340Var2).b.b;
            cvx cvxVar2 = cbx.b(x340Var2).b;
            qim0 qim0VarY = uyn1.y(qim0Var, 16.0f, f);
            mbh mbhVarA = jbh.a(h36.e, een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarY);
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
            uwo1.e(str, uyn1.B(nim0.a, 0.0f, 0.0f, 0.0f, 4.0f, 7), cbx.d(x340Var2).e, cbx.a(x340Var2).b.a, (a0e1) null, (iu30) null, 2, false, new cjc0(4), 0, (qx8) null, x340Var2, i2 & 14, 0, 1712);
            uwo1.e(str2, (qim0) null, cbx.d(x340Var2).m, cbx.a(x340Var2).b.b, (a0e1) null, (iu30) null, 2, false, new cjc0(4), 0, (qx8) null, x340Var2, (i2 >> 3) & 14, 0, 1714);
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b071(str, str2, qim0Var, i, (byte) 8);
        }
    }

    public static final void m(u7h u7hVar, long j, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1439039967);
        int i2 = i | (x340Var.g(u7hVar) ? 4 : 2) | (x340Var.f(j) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            flb0 flb0Var = (flb0) x340Var.k(t4k.n);
            boolean zE = x340Var.e(flb0Var.ordinal()) | x340Var.d(4.0f);
            Object objT = x340Var.T();
            if (zE || objT == fkj0.X) {
                objT = new gdh(flb0Var, (byte) 2);
                x340Var.s0(objT);
            }
            qim0 qim0VarV = u291.v(u291.h(i541.C(qim0Var, (iu30) objT), 104.0f), 59.28f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarV);
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
            h2c h2cVar = h2c.a;
            nim0 nim0Var = nim0.a;
            cwl1.f(new i9h(u7hVar != null ? u7hVar.a : j), (String) null, h2cVar.b(nim0Var), (tl3) null, (j6m) null, 0.0f, (ColorFilter) null, x340Var, 56, 120);
            t1c.a(dug.f(h2cVar.b(nim0Var), u7h.b(u7h.b, 0.35f, 0.0f, 0.0f, 0.0f, 14), d4o1.a), x340Var, 0);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new w5l1(u7hVar, j, qim0Var, i, (byte) 1);
        }
    }

    public static final void n(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1243753950);
        int i2 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            flb0 flb0Var = (flb0) x340Var.k(t4k.n);
            boolean zE = x340Var.e(flb0Var.ordinal()) | x340Var.d(4.0f);
            Object objT = x340Var.T();
            if (zE || objT == fkj0.X) {
                objT = new gdh(flb0Var, (byte) 3);
                x340Var.s0(objT);
            }
            qim0 qim0VarN = fc11.n(u291.v(u291.h(i541.C(qim0Var, (iu30) objT), 104.0f), 59.28f), 12.0f, 12.0f, d4o1.a);
            cr31 cr31VarB = er31.b(4.0f);
            long j = ((vex) zex.a.e).d;
            qim0 qim0VarO = sto1.o(qim0VarN, 12.0f, cr31VarB, false, j, j, 4);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarO);
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
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wfe1(qim0Var, i, (byte) 23);
        }
    }

    public static final void o(String str, String str2, boolean z, afx afxVar, Function0 function0, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1068053438);
        int i2 = (x340Var.g(str) ? 4 : 2) | i;
        if ((i & 384) == 0) {
            i2 |= x340Var.h(z) ? 256 : 128;
        }
        int i3 = i2 | (x340Var.g(afxVar) ? 2048 : 1024) | (x340Var.i(function0) ? 16384 : 8192);
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            j2i j2iVarR = apo.r(-1753307090, new yx30(str2, str, function0, z), x340Var);
            if (z) {
                x340Var.i0(-1261453955);
                gfx.d(afxVar, apo.r(-280161885, new ak10(j2iVarR, (byte) 2), x340Var), x340Var, ((i3 >> 9) & 14) | 48);
                x340Var.r(false);
            } else {
                x340Var.i0(-1261383058);
                j2iVarR.invoke(x340Var, 6);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bk10(str, str2, z, afxVar, function0, i, (byte) 1);
        }
    }

    public static final void p(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1449046779);
        int i2 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0 qim0VarN = anm1.N("watch_feed_banner_element_play_icon_test_tag", u291.s(qim0Var, 32.0f, 32.0f));
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = v5l1.f;
                x340Var.s0(objT);
            }
            qim0 qim0VarC = i541.C(qim0VarN, (iu30) objT);
            cr31 cr31Var = er31.a;
            long j = u7h.b;
            long jB = u7h.b(j, 0.75f, 0.0f, 0.0f, 0.0f, 14);
            long jB2 = u7h.b(j, 0.75f, 0.0f, 0.0f, 0.0f, 14);
            if (p3v.b(24.0f, 0.0f) > 0) {
                qim0VarC = qim0VarC.then(new cw61(24.0f, cr31Var, false, jB, jB2));
            }
            w0h1.a(ypx.c, isl.a, qim0VarC, 0L, 0L, true, x340Var, ypx.d | 196656, 24);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wfe1(qim0Var, i, (byte) 24);
        }
    }

    public static final void q(String str, String str2, String str3, String str4, hux huxVar, long j, long j2, qim0 qim0Var, Function0 function0, b0k b0kVar, int i) {
        int i2;
        long j3;
        long j4;
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(714202283);
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
            i2 |= b0kVar3.g(str4) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? b0kVar3.g(huxVar) : b0kVar3.i(huxVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            j3 = j;
            i2 |= b0kVar3.f(j3) ? 131072 : 65536;
        } else {
            j3 = j;
        }
        if ((1572864 & i) == 0) {
            j4 = j2;
            i2 |= b0kVar3.f(j4) ? 1048576 : 524288;
        } else {
            j4 = j2;
        }
        int i3 = i2 | 12582912;
        if ((100663296 & i) == 0) {
            i3 |= b0kVar3.i(function0) ? 67108864 : 33554432;
        }
        if (!b0kVar3.Y(i3 & 1, (38347923 & i3) != 38347922)) {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        } else {
            if (ihc1.y0(str)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar = new gbx(new y50(str), function0);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarN = anm1.N(str4, u291.z(u291.f(qim0Var3, 1.0f), (fra) null, 3));
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(b0kVar3).f;
            cr31 cr31VarB = er31.b(6.0f);
            cvx cvxVar = cbx.b(b0kVar3).b;
            b0kVar2 = b0kVar3;
            cwl1.b(qim0VarN, (tl3) null, cr31VarB, (pgx) null, new zzq0(16.0f, 16.0f, 16.0f, 16.0f), (max) null, false, (idn0) null, (ga80) null, gbxVar, (gbx) null, apo.r(351925972, new yvv0(huxVar, j3, str2, j4, str3), b0kVar3), b0kVar2, 0, 48, 1514);
            qim0Var2 = qim0Var3;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new zvv0(str, str2, str3, str4, huxVar, j, j2, qim0Var2, function0, i);
        }
    }

    public static final void r(String str, qim0 qim0Var, Function0 function0, Function0 function1, Function0 function2, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1973749220);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | 48 | (x340Var.i(function0) ? 256 : 128) | (x340Var.i(function1) ? 2048 : 1024) | (x340Var.i(function2) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            es41 es41VarC = l6o1.C(0, 0, 1, x340Var);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarH = l6o1.H(qim0Var3, es41VarC, false, 14);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarP = x0d.p(lhc.g(x340Var).g, 32, qim0VarH);
            uwr uwrVar = cbx.a;
            qim0 qim0VarB = uyn1.B(qim0VarP, 0.0f, 0.0f, 0.0f, cbx.b(x340Var).b.b, 7);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
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
            cvx cvxVar = cbx.b(x340Var).b;
            tx9.e(uyn1.B(qim0Var3, 0.0f, 16.0f, 0.0f, 0.0f, 13), x340Var, 0);
            jmo1.d(cwl1.o0(x340Var, 2131960352), cbx.d(x340Var).e, (qim0) null, x340Var, 0);
            q(cwl1.o0(x340Var, 2131960336), cwl1.o0(x340Var, 2131960349), cwl1.o0(x340Var, 2131960348), "free_play_mode", gsx.c, cbx.a(x340Var).b.b, cbx.a(x340Var).b.a, null, function0, x340Var, (gsx.d << 12) | 3072 | ((i2 << 18) & 234881024));
            q(cwl1.o0(x340Var, 2131960340), cwl1.o0(x340Var, 2131960351), cwl1.o0(x340Var, 2131960350), "premium_play_mode", nox.c, cbx.a(x340Var).b.c, cbx.a(x340Var).b.c, null, function1, x340Var, (nox.d << 12) | 3072 | ((i2 << 15) & 234881024));
            cvx cvxVar2 = cbx.b(x340Var).b;
            who1.d(str, uyn1.z(0.0f, 16.0f, 1, qim0Var3), (qim0) null, function2, x340Var, (i2 & 14) | ((i2 >> 3) & 7168));
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new e9g0((byte) 24, i, str, qim0Var2, function0, function1, function2);
        }
    }

    public static final void s(zx30 zx30Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var;
        boolean z;
        String str = zx30Var.f;
        String str2 = zx30Var.e;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(673442912);
        int i2 = (b0kVar3.i(zx30Var) ? 4 : 2) | i;
        if (b0kVar3.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarZ = uyn1.z(0.0f, 12.0f, 1, qim0Var2);
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar3, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarZ);
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
            nko1.H(mbhVarA, b0kVar3, y580.O0);
            nko1.H(xos0VarM, b0kVar3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
            nko1.F(b0kVar3);
            nko1.H(qim0VarE, b0kVar3, y580.Y);
            if (str2.length() > 0) {
                b0kVar3.i0(-531641388);
                uwr uwrVar = cbx.a;
                b0kVar2 = b0kVar3;
                qim0Var = qim0Var2;
                z = false;
                uwo1.e(str2, anm1.N("txt_price", qim0Var2), cbx.d(b0kVar3).f, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2040);
                b0kVar2.r(false);
            } else {
                qim0Var = qim0Var2;
                z = false;
                b0kVar2 = b0kVar3;
                b0kVar2.i0(-531489364);
                b0kVar2.r(false);
            }
            if (str.length() > 0) {
                b0kVar2.i0(-531427240);
                uwr uwrVar2 = cbx.a;
                b0k b0kVar4 = b0kVar2;
                uwo1.e(str, anm1.N("txt_secondary_price", qim0Var), cbx.d(b0kVar2).g, cbx.a(b0kVar2).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar4, 0, 0, 2032);
                b0kVar2 = b0kVar4;
                b0kVar2.r(z);
            } else {
                b0kVar2.i0(-531217556);
                b0kVar2.r(z);
            }
            b0kVar2.r(true);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new rr10(zx30Var, i, (byte) 20);
        }
    }

    public static final void t(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-504057162);
        int i2 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            ncf0 ncf0VarG = h5p1.G(new pcf0("https://misc.spotifycdn.com/watch-feed/playback-animation.json"), (String) null, (xu30) null, x340Var, 6, 62);
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            gfh0 gfh0VarC = t1c.c(een.h, false);
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
            mp10.f(ncf0VarG.c(), (qim0) null, false, false, (bcf0) null, Integer.MAX_VALUE, (ddf0) null, (tl3) null, mif1.Q0, x340Var, 1572864, 0, 2064318);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wfe1(qim0Var, i, (byte) 25);
        }
    }

    public static final void u(dxo1 dxo1Var, Function0 function0, Function0 function1, vy71 vy71Var, boolean z, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1047877068);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? b0kVar3.g(dxo1Var) : b0kVar3.i(dxo1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(vy71Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar3.h(z) ? 16384 : 8192;
        }
        int i3 = i2 | 196608;
        if (b0kVar3.Y(i3 & 1, (74899 & i3) != 74898)) {
            qim0 qim0Var3 = nim0.a;
            b0kVar2 = b0kVar3;
            dem0.a(function1, qim0Var3, vy71Var, 0.0f, false, (hw61) null, u7h.f, u7h.b, 0.0f, 0L, (vu30) null, (vu30) null, (eem0) null, apo.r(-2031290606, new k1f1(dxo1Var, z, function0, function1), b0kVar3), b0kVar2, ((i3 >> 6) & 14) | ((i3 >> 12) & 112) | ((i3 >> 3) & 896), 3072, 7992);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new si2(dxo1Var, function0, function1, vy71Var, z, qim0Var2, i);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void v(dxo1 dxo1Var, boolean z, Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        b0k b0kVar2;
        qim0 qim0Var2;
        boolean z2;
        af5 af5Var;
        Function0 function2;
        boolean z3;
        Function0 function3 = function1;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(119239309);
        j06 j06Var = ((x340) b0kVar3).a;
        int i2 = i | (b0kVar3.g(dxo1Var) ? 4 : 2) | (b0kVar3.h(z) ? 32 : 16) | (b0kVar3.i(function0) ? 256 : 128) | (b0kVar3.i(function3) ? 2048 : 1024) | 24576;
        if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarA = uyn1.A(u291.f(qim0Var3, 1.0f), 24.0f, 32.0f, 24.0f, 40.0f);
            era eraVar = een.Q0;
            f36 f36Var = h36.c;
            mbh mbhVarA = jbh.a(f36Var, eraVar, b0kVar3, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarA);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            boolean z4 = ((x340) b0kVar3).S;
            Function0 function4 = hmb0.t1;
            if (z4) {
                b0kVar3.l(function4);
            } else {
                b0kVar3.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, b0kVar3, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar3, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar3, lljVar3);
            nko1.F(b0kVar3);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, b0kVar3, lljVar4);
            String strO0 = cwl1.o0(b0kVar3, 2131958025);
            uwr uwrVar = cbx.a;
            uwo1.e(strO0, uyn1.B(qim0Var3, 0.0f, 0.0f, 0.0f, 16.0f, 7), cbx.d(b0kVar3).d, cbx.a(b0kVar3).b.a, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar3, 0, 0, 2016);
            if (dxo1Var instanceof pri1) {
                b0kVar3.i0(1530572615);
                int i3 = af5.e;
                af5Var = ob51.j(cwl1.n0(2131958023, new Object[]{((pri1) dxo1Var).b}, b0kVar3), (pae1) null, 6);
                z2 = false;
                b0kVar3.r(false);
            } else {
                z2 = false;
                if (!dxo1Var.equals(ori1.b)) {
                    throw p3d1.k(b0kVar3, 1019202975, false);
                }
                b0kVar3.i0(1530930231);
                af5Var = new af5(cwl1.o0(b0kVar3, 2131958024));
                b0kVar3.r(false);
            }
            af5 af5Var2 = af5Var;
            qim0Var2 = qim0Var3;
            uwo1.d(af5Var2, cbx.a(b0kVar3).b.b, uyn1.B(qim0Var3, 0.0f, 0.0f, 0.0f, 32.0f, 7), cbx.d(b0kVar3).g, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (cqs0) null, b0kVar3, 0, 0, 4064);
            b0k b0kVar4 = b0kVar3;
            qim0 qim0VarZ = uyn1.z(30.0f, 0.0f, 2, u291.x(0.0f, 678.0f, 1, qim0Var2));
            mbh mbhVarA2 = jbh.a(f36Var, een.P0, b0kVar4, 0);
            int iHashCode2 = Long.hashCode(((x340) b0kVar4).T);
            xos0 xos0VarM2 = b0kVar4.m();
            qim0 qim0VarE2 = zr7.E(b0kVar4, qim0VarZ);
            b0kVar4.m0();
            if (((x340) b0kVar4).S) {
                function2 = function4;
                b0kVar4.l(function2);
            } else {
                function2 = function4;
                b0kVar4.v0();
            }
            nko1.H(mbhVarA2, b0kVar4, lljVar);
            nko1.H(xos0VarM2, b0kVar4, lljVar2);
            x0d.q(iHashCode2, b0kVar4, lljVar3, b0kVar4);
            nko1.H(qim0VarE2, b0kVar4, lljVar4);
            if (z) {
                b0kVar4.i0(-260928635);
                idx idxVar = new idx(4);
                String strO1 = cwl1.o0(b0kVar4, 2131951782);
                if (ihc1.y0(strO1)) {
                    hhg1.n("Please consider providing a non-empty action label to provide a more accessible experience for everyone. You can use SelfDescribed if the content description is sufficient.");
                    return;
                }
                Function0 function5 = function2;
                foo1.c(new gbx(new y50(strO1), function0), idxVar, u291.f(qim0Var2, 1.0f), (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, jnj.a, b0kVar4, 0, 48, 2040);
                qim0 qim0VarZ2 = uyn1.z(24.0f, 0.0f, 2, ab80.o(qim0Var2, 16.0f, b0kVar4, qim0Var2, 1.0f));
                jw31 jw31VarA = ew31.a(h36.a, een.N0, b0kVar4, 0);
                int iHashCode3 = Long.hashCode(((x340) b0kVar4).T);
                xos0 xos0VarM3 = b0kVar4.m();
                qim0 qim0VarE3 = zr7.E(b0kVar4, qim0VarZ2);
                b0kVar4.m0();
                if (((x340) b0kVar4).S) {
                    b0kVar4.l(function5);
                } else {
                    b0kVar4.v0();
                }
                nko1.H(jw31VarA, b0kVar4, lljVar);
                nko1.H(xos0VarM3, b0kVar4, lljVar2);
                x0d.q(iHashCode3, b0kVar4, lljVar3, b0kVar4);
                nko1.H(qim0VarE3, b0kVar4, lljVar4);
                if (1.0f <= 0.0d) {
                    of80.a("invalid weight; must be greater than zero");
                }
                qim0 qim0VarH = u291.h(new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 1.0f);
                long j = cbx.a(b0kVar4).d.a;
                u5j1 u5j1Var = d4o1.a;
                t1c.a(dug.f(qim0VarH, j, u5j1Var), b0kVar4, 0);
                z3 = true;
                uwo1.e(cwl1.o0(b0kVar4, 2131958022), uyn1.z(16.0f, 0.0f, 2, qim0Var2), cbx.d(b0kVar4).j, cbx.a(b0kVar4).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar4, 0, 0, 2032);
                b0kVar4 = b0kVar4;
                if (1.0f <= 0.0d) {
                    of80.a("invalid weight; must be greater than zero");
                }
                t1c.a(dug.f(u291.h(new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 1.0f), cbx.a(b0kVar4).d.a, u5j1Var), b0kVar4, 0);
                b0kVar4.r(true);
                op71.g(b0kVar4, u291.h(qim0Var2, 16.0f));
                b0kVar4.r(false);
            } else {
                z3 = true;
                b0kVar4.i0(-259425631);
                b0kVar4.r(false);
            }
            b0k b0kVar5 = b0kVar4;
            function3 = function1;
            foo1.c(new gbx(z50.c, function3), z ? ldx.c : new idx(), u291.f(qim0Var2, 1.0f), (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, jnj.b, b0kVar5, 0, 48, 2040);
            b0kVar2 = b0kVar5;
            b0kVar2.r(z3);
            b0kVar2.r(z3);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ofi0(dxo1Var, z, function0, function3, qim0Var2, i, (byte) 18);
        }
    }

    public static final void w(String str, String str2, String str3, Function0 function0, boolean z, u7h u7hVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        String str4;
        Function0 function1;
        boolean z2;
        u7h u7hVar2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(61564418);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            str4 = str3;
            i2 |= x340Var.g(str4) ? 256 : 128;
        } else {
            str4 = str3;
        }
        if ((i & 3072) == 0) {
            function1 = function0;
            i2 |= x340Var.i(function1) ? 2048 : 1024;
        } else {
            function1 = function0;
        }
        if ((i & 24576) == 0) {
            z2 = z;
            i2 |= x340Var.h(z2) ? 16384 : 8192;
        } else {
            z2 = z;
        }
        if ((196608 & i) == 0) {
            u7hVar2 = u7hVar;
            i2 |= x340Var.g(u7hVar2) ? 131072 : 65536;
        } else {
            u7hVar2 = u7hVar;
        }
        int i3 = i2 | 1572864;
        if (x340Var.Y(i3 & 1, (599187 & i3) != 599186)) {
            uwr uwrVar = cbx.a;
            long jC = cbx.a(x340Var).a.a.c();
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0Var2 = nim0.a;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, u291.f(u291.z(qim0Var2, (fra) null, 3), 1.0f));
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v5l1.g;
                x340Var.s0(objT);
            }
            qim0 qim0VarN = anm1.N("watch_feed_banner_element_test_tag", bin.x(s161.b(qim0VarZ, true, (iu30) objT), false, (String) null, (pm31) null, (idn0) null, function1, 15));
            x340Var.j0(475845883);
            wat watVar = (wat) x340Var.k(t4k.h);
            x340Var.j0(-492369756);
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = x0d.o(watVar, x340Var);
            }
            x340Var.r(false);
            ufh0 ufh0Var = (ufh0) objT2;
            x340Var.j0(-492369756);
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = x0d.m(x340Var);
            }
            x340Var.r(false);
            xhl xhlVar = (xhl) objT3;
            x340Var.j0(-492369756);
            Object objT4 = x340Var.T();
            if (objT4 == m4cVar) {
                objT4 = v8r.q(Boolean.FALSE);
                x340Var.s0(objT4);
            }
            x340Var.r(false);
            ven0 ven0Var = (ven0) objT4;
            x340Var.j0(-492369756);
            Object objT5 = x340Var.T();
            if (objT5 == m4cVar) {
                objT5 = x0d.n(xhlVar, x340Var);
            }
            x340Var.r(false);
            nil nilVar = (nil) objT5;
            x340Var.j0(-492369756);
            Object objT6 = x340Var.T();
            if (objT6 == m4cVar) {
                objT6 = bb00.i(rih1.a, f331.X0, x340Var);
            }
            x340Var.r(false);
            ven0 ven0Var2 = (ven0) objT6;
            who1.h(s161.b(qim0VarN, false, new tu(ufh0Var, (byte) 26)), apo.i(x340Var, -1488813576, new ugr0(ven0Var2, xhlVar, new su(ven0Var, nilVar, (byte) 22), str, str2, u7hVar2, jC, z2, str4)), new ru(ven0Var2, ufh0Var, nilVar, ven0Var, (byte) 22), x340Var, 48);
            x340Var.r(false);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lv1(str, str2, str3, function0, z, u7hVar, qim0Var2, i);
        }
    }

    public static final String x(Uri uri) {
        return ihc1.Y0(uri.toString(), '?');
    }

    public static final boolean y(Uri uri) {
        mss0 mss0VarC = jss0.a.c(uri.toString());
        if ((mss0VarC instanceof mss0 ? mss0VarC : null) != null) {
            return true;
        }
        String string = uri.toString();
        a3i1 a3i1Var = (a3i1) ess0.d.getValue();
        Set set = x6b1.e;
        x6b1 x6b1VarL = oqn1.l(string);
        v5b1 v5b1VarA = x6b1VarL == null ? null : a3i1Var.a(x6b1VarL);
        return (v5b1VarA instanceof iss0 ? (iss0) v5b1VarA : null) != null;
    }

    public static final Object z(j4k j4kVar, xky0 xky0Var) {
        if (!((pim0) j4kVar).a.N0) {
            qf80.c("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        xos0 xos0Var = oap1.B(j4kVar).c1;
        xos0Var.getClass();
        return d7e.x(xos0Var, xky0Var);
    }
}
