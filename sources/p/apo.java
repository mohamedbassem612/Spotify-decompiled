package p;

import android.os.Build;
import androidx.compose.ui.geometry.Offset;
import com.spotify.concertpageview.v1.TicketingTimeline;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.mobius.Next;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class apo {
    public static final Object a = new Object();
    public static b180 b;
    public static b180 c;

    public static final ArrayList A(List list, TicketingTimeline ticketingTimeline) {
        List<Object> list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        for (Object u5mVar : list2) {
            if (u890.j(u5mVar, t5m.a) || (u5mVar instanceof u5m)) {
                u5mVar = new u5m(ticketingTimeline);
            }
            arrayList.add(u5mVar);
        }
        return arrayList;
    }

    public static final void a(mih1 mih1Var, float f, j2i j2iVar, j2i j2iVar2, j2i j2iVar3, j2i j2iVar4, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(111736615);
        int i2 = i | (x340Var.i(mih1Var) ? 4 : 2) | (x340Var.d(f) ? 32 : 16) | (x340Var.i(qim0Var) ? 1048576 : 524288);
        if (x340Var.Y(i2 & 1, (599187 & i2) != 599186)) {
            k5k k5kVar = jxq0.a;
            ixq0 ixq0Var = (ixq0) x340Var.k(k5kVar);
            mod.b(k5kVar.a(Build.VERSION.SDK_INT >= 31 ? l8b1.a : ixq0Var), r(1149299303, new wz2(j2iVar, j2iVar3, j2iVar4, qim0Var, mih1Var, f, j2iVar2, ixq0Var), x340Var), x340Var, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xz2(mih1Var, f, j2iVar, j2iVar2, j2iVar3, j2iVar4, qim0Var, i);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void b(eob eobVar, iu30 iu30Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        String strY0;
        gbx gbxVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-571452692);
        byte b2 = 2;
        if ((i & 6) == 0) {
            i2 = (x340Var.i(eobVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            hob hobVar = eobVar.a;
            if (hobVar instanceof hob) {
                x340Var.i0(1103417210);
                boolean z = eobVar.b != null;
                hob hobVar2 = hobVar;
                String str = hobVar2.b;
                h861 h861Var = hobVar2.a;
                if (h861Var instanceof h861) {
                    x340Var.i0(589787133);
                    strY0 = cwl1.n0(2131952639, new Object[]{h861Var.a, str}, x340Var);
                    x340Var.r(false);
                } else {
                    if (!(h861Var instanceof g861)) {
                        throw p3d1.k(x340Var, 589784266, false);
                    }
                    x340Var.i0(589792287);
                    x340Var.r(false);
                    strY0 = o7h.y0(p7h.M(new String[]{((g861) h861Var).a, str}), " • ", (String) null, (String) null, (iu30) null, 62);
                }
                qim0 qim0VarN = anm1.N("audiobook_series_element", nim0.a);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                cvx cvxVar2 = cbx.b(x340Var).b;
                uvx uvxVar = new uvx(0, null, 0, new zzq0(16.0f, 8.0f, 16.0f, 8.0f), null, null, null, 0, null, 503);
                if (z) {
                    x340Var.i0(1104095335);
                    boolean z2 = (i2 & 112) == 32;
                    Object objT = x340Var.T();
                    if (z2 || objT == fkj0.X) {
                        objT = new gob(iu30Var, (byte) 0);
                        x340Var.s0(objT);
                    }
                    gbx gbxVar2 = new gbx(z50.c, (Function0) objT);
                    x340Var.r(false);
                    gbxVar = gbxVar2;
                } else {
                    x340Var.i0(1104208764);
                    x340Var.r(false);
                    gbxVar = null;
                }
                jto1.b(qim0VarN, uvxVar, (max) null, false, (idn0) null, (ga80) null, gbxVar, (gbx) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, z ? r9i.a : null, (xu30) null, (xu30) null, r(-1400932563, new c2(z, strY0, b2), x340Var), x340Var, 64, 196608, 28604);
                x340Var = x340Var;
                x340Var.r(false);
            } else {
                x340Var.i0(1105043222);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new g90(eobVar, iu30Var, i, (byte) 18);
        }
    }

    public static final void c(r740 r740Var, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1891528780);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(r740Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            qim0Var2 = qim0Var;
            i2 |= x340Var.i(qim0Var2) ? 32 : 16;
        } else {
            qim0Var2 = qim0Var;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if (!x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            x340Var.b0();
        } else {
            if (r740Var.b) {
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new s740(r740Var, qim0Var2, iu30Var, i, (byte) 0);
                    return;
                }
                return;
            }
            zzq0 zzq0Var = new zzq0(16.0f, 16.0f, 16.0f, 16.0f);
            gra graVar = een.g;
            cr31 cr31VarB = er31.b(16.0f);
            mgx mgxVar = mgx.e;
            String str = r740Var.a;
            boolean z = (i2 & 896) == 256;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new bb30(iu30Var, (byte) 15);
                x340Var.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            if (ihc1.y0(str)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            cwl1.b(qim0Var, graVar, cr31VarB, mgxVar, zzq0Var, (max) null, false, (idn0) null, (ga80) null, new gbx(new y50(str), function0), (gbx) null, r(-896474173, new mp20(r740Var, (byte) 17), x340Var), x340Var, (i2 >> 3) & 14, 48, 1504);
        }
        h311 h311VarV2 = x340Var.v();
        if (h311VarV2 != null) {
            h311VarV2.d = new s740(r740Var, qim0Var, iu30Var, i, (byte) 1);
        }
    }

    public static final void d(int i, j2i j2iVar, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-312421212);
        int i2 = (x340Var.i(j2iVar) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = new v3t();
                x340Var.s0(objT);
            }
            v3t v3tVar = (v3t) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = qxd0.M(o6x.a, x340Var);
                x340Var.s0(objT2);
            }
            c9n c9nVar = (c9n) objT2;
            uwr uwrVar = cbx.a;
            xpv0 xpv0Var = cbx.c(x340Var).c;
            n8b1 n8b1VarK = xpv0.k();
            boolean zI = x340Var.i(v3tVar) | x340Var.i(c9nVar) | x340Var.i(n8b1VarK);
            Object objT3 = x340Var.T();
            if (zI || objT3 == m4cVar) {
                objT3 = new t6(v3tVar, c9nVar, n8b1VarK, (byte) 10);
                x340Var.s0(objT3);
            }
            iu30 iu30Var = (iu30) objT3;
            boolean zI2 = x340Var.i(v3tVar) | x340Var.i(c9nVar) | x340Var.i(n8b1VarK);
            Object objT4 = x340Var.T();
            if (zI2 || objT4 == m4cVar) {
                objT4 = new n891(v3tVar, c9nVar, n8b1VarK, (byte) 14);
                x340Var.s0(objT4);
            }
            u06 u06Var = new u06((xu30) objT4, iu30Var);
            gfh0 gfh0VarC = t1c.c(een.d, true);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, u06Var);
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
            dv20.l(i2 & 14, j2iVar, x340Var, true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pu2(j2iVar, i, (byte) 3);
        }
    }

    public static final void e(qa31 qa31Var, boolean z, kj31 kj31Var, qim0 qim0Var, b0k b0kVar, int i) {
        Object obj;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-42788033);
        int i2 = i | (x340Var.i(qa31Var) ? 4 : 2) | (x340Var.h(z) ? 32 : 16) | (x340Var.i(kj31Var) ? 256 : 128) | (x340Var.i(qim0Var) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            boolean zG = x340Var.g(qa31Var);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                obj = objT;
                zj31 zj31VarA = kj31Var.a(new ra31(qa31Var.a));
                x340Var.s0(zj31VarA);
                obj = zj31VarA;
            }
            obj = objT;
            ((wj31) obj).b(new jj31(false, z ? 1 : 0, qim0Var, 0, (jfe) null, qa31Var.b, (Map) null, false, false, (Function0) null, (iu30) null, 4056), x340Var, 8);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qy90(qa31Var, z, kj31Var, qim0Var, i, (byte) 28);
        }
    }

    public static final void f(vnr0 vnr0Var, boolean z, vnr0 vnr0Var2, int i, ll31 ll31Var, float f, boolean z2, String str, dzo1 dzo1Var, kj31 kj31Var, qim0 qim0Var, Function0 function0, b0k b0kVar, int i2) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1883372895);
        int i3 = i2 | (b0kVar3.i(vnr0Var) ? 4 : 2) | (b0kVar3.h(z) ? 32 : 16) | (b0kVar3.i(vnr0Var2) ? 256 : 128) | (b0kVar3.e(i) ? 2048 : 1024) | (b0kVar3.g(ll31Var) ? 16384 : 8192) | (b0kVar3.d(f) ? 131072 : 65536) | (b0kVar3.h(z2) ? 1048576 : 524288) | (b0kVar3.g(str) ? 8388608 : 4194304) | (b0kVar3.g(dzo1Var) ? 67108864 : 33554432) | (b0kVar3.i(kj31Var) ? 536870912 : 268435456);
        int i4 = 6 | (b0kVar3.i(function0) ? ' ' : (char) 16);
        if (b0kVar3.Y(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 19) == 18) ? false : true)) {
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = ktd.n(b0kVar3);
            }
            idn0 idn0Var = (idn0) objT;
            boolean z3 = (i3 & 29360128) == 8388608;
            Object objT2 = b0kVar3.T();
            if (z3 || objT2 == m4cVar) {
                objT2 = new sc21(str, (byte) 13);
                b0kVar3.s0(objT2);
            }
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarR = u291.r(s161.b(qim0Var3, false, (iu30) objT2), f);
            boolean z4 = (i4 & 112) == 32;
            Object objT3 = b0kVar3.T();
            if (z4 || objT3 == m4cVar) {
                objT3 = new us21(function0, (byte) 12);
                b0kVar3.s0(objT3);
            }
            b0kVar2 = b0kVar3;
            cwl1.b(qim0VarR, (tl3) null, (hw61) null, (pgx) null, new zzq0(0.0f, 0.0f, 0.0f, 0.0f), (max) null, false, idn0Var, jtr.g, new gbx(dzo1Var, (Function0) objT3), (gbx) null, r(-824099000, new pl31(ll31Var, z2, kj31Var, vnr0Var, f, z, i, vnr0Var2), b0kVar3), b0kVar2, 100663296, 48, 1134);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ql31(vnr0Var, z, vnr0Var2, i, ll31Var, f, z2, str, dzo1Var, kj31Var, qim0Var2, function0, i2);
        }
    }

    public static final void g(j2i j2iVar, qim0 qim0Var, xu30 xu30Var, vu30 vu30Var, b0k b0kVar, int i) {
        vu30 vu30Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1055531533);
        int i2 = i | (x340Var.i(qim0Var) ? 32 : 16) | 196992;
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            vu30Var2 = vu30Var;
            cgj1.n(qim0Var, r(436620497, new say0(vu30Var2, (byte) 5), x340Var), r(1989707858, new rvd1((byte) 7, 2, false), x340Var), (vu30) null, (vu30) null, 0, 0L, 0L, poo1.s(0.0f, 14), r(83951644, new xw91(j2iVar, xu30Var, (byte) 18), x340Var), x340Var, ((i2 >> 3) & 14) | 805306800, 248);
        } else {
            vu30Var2 = vu30Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bvd1(j2iVar, qim0Var, xu30Var, vu30Var2, i);
        }
    }

    public static final void h(p5j1 p5j1Var, Function0 function0, Function0 function1, b0k b0kVar, int i) {
        int i2;
        Function0 function2;
        Function0 function3;
        h311 h311VarV;
        kcl1 kcl1Var;
        p5j1 p5j1Var2;
        ven0 ven0Var;
        ni20 ni20Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1983336460);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(p5j1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function1) ? 256 : 128;
        }
        int i3 = i & 3072;
        nim0 nim0Var = nim0.a;
        if (i3 == 0) {
            i2 |= x340Var.i(nim0Var) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            if (p5j1Var.e == 0) {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    kcl1Var = new kcl1(p5j1Var, function0, function1, i, (byte) 0);
                }
            } else {
                function2 = function0;
                function3 = function1;
                ven0 ven0VarS = v8r.s(function2, x340Var);
                ven0 ven0VarS2 = v8r.s(function3, x340Var);
                Object objT = x340Var.T();
                m4c m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = v8r.q(Boolean.FALSE);
                    x340Var.s0(objT);
                }
                ven0 ven0Var2 = (ven0) objT;
                Object objT2 = x340Var.T();
                if (objT2 == m4cVar) {
                    objT2 = v8r.q(Boolean.FALSE);
                    x340Var.s0(objT2);
                }
                ven0 ven0Var3 = (ven0) objT2;
                Boolean bool = (Boolean) ven0Var2.getValue();
                bool.booleanValue();
                boolean zI = x340Var.i(ven0Var2) | x340Var.i(ven0VarS);
                Object objT3 = x340Var.T();
                if (zI || objT3 == m4cVar) {
                    objT3 = new vs3(ven0Var2, ven0VarS, (lnm) null, (byte) 11);
                    x340Var.s0(objT3);
                }
                qxd0.t(bool, x340Var, (vu30) objT3);
                boolean zI2 = x340Var.i(ven0Var2) | ((i2 & 14) == 4) | x340Var.i(ven0Var3);
                Object objT4 = x340Var.T();
                if (zI2 || objT4 == m4cVar) {
                    wba1 wba1Var = new wba1(p5j1Var, ven0Var2, ven0Var3, (lnm) null, (byte) 21);
                    p5j1Var2 = p5j1Var;
                    ven0Var = ven0Var3;
                    ni20Var = null;
                    x340Var.s0(wba1Var);
                    objT4 = wba1Var;
                } else {
                    ven0Var = ven0Var3;
                    ni20Var = null;
                    p5j1Var2 = p5j1Var;
                }
                qxd0.t(rih1.a, x340Var, (vu30) objT4);
                fq7.g(((Boolean) ven0Var2.getValue()).booleanValue(), u291.d(nim0Var, 1.0f), xay.e(3, ni20Var), xay.f(3, ni20Var), (String) null, r(2115488460, new kj21(ven0VarS2, ven0Var, p5j1Var2, h5p1.G(new pcf0(p5j1Var2.g), (String) null, (xu30) null, x340Var, 0, 62), (byte) 22), x340Var), x340Var, 196608, 16);
            }
            h311VarV.d = kcl1Var;
        }
        function2 = function0;
        function3 = function1;
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            kcl1Var = new kcl1(p5j1Var, function2, function3, i, (byte) 1);
            h311VarV.d = kcl1Var;
        }
    }

    public static final j2i i(b0k b0kVar, int i, hab0 hab0Var) {
        j2i j2iVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.f0(Integer.rotateLeft(i, 1), a);
        Object objT = x340Var.T();
        if (objT == fkj0.X) {
            j2iVar = new j2i(i, hab0Var, true);
            x340Var.s0(j2iVar);
        } else {
            j2iVar = (j2i) objT;
            j2iVar.o(hab0Var);
        }
        x340Var.r(false);
        return j2iVar;
    }

    public static final j2i j(int i, Object obj, boolean z) {
        return new j2i(i, obj, z);
    }

    public static final int k(int i) {
        return 2 << (((i % 10) * 3) + 1);
    }

    public static final ArrayList l(chm0 chm0Var) {
        ArrayList arrayListB = chm0Var.b();
        ArrayList arrayList = new ArrayList(q7h.U(arrayListB, 10));
        Iterator it = arrayListB.iterator();
        while (it.hasNext()) {
            arrayList.add(((jn60) it.next()).getId());
        }
        return arrayList;
    }

    public static v5u m() {
        return v5u.d;
    }

    public static final List n(List list, List list2, float f) {
        if (list.isEmpty()) {
            return list2;
        }
        if (list2.isEmpty()) {
            return list;
        }
        tr80 tr80VarQ = yoi1.Q(0, Math.min(list.size(), list2.size()));
        ArrayList arrayList = new ArrayList(q7h.U(tr80VarQ, 10));
        lr80 it = tr80VarQ.iterator();
        while (((sr80) it).c) {
            int iNextInt = it.nextInt();
            long j = ((Offset) list.get(iNextInt)).a;
            long j2 = ((Offset) list2.get(iNextInt)).a;
            float f2 = 1.0f - f;
            float fE = us71.e((int) (j2 >> 32), f, Float.intBitsToFloat((int) (j >> 32)) * f2);
            float fE2 = us71.e((int) (j2 & 4294967295L), f, Float.intBitsToFloat((int) (j & 4294967295L)) * f2);
            arrayList.add(new Offset((((long) Float.floatToRawIntBits(fE)) << 32) | (((long) Float.floatToRawIntBits(fE2)) & 4294967295L)));
        }
        return arrayList;
    }

    public static final boolean o(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[9];
        float f11 = fArr[10];
        float f12 = fArr[11];
        float f13 = fArr[12];
        float f14 = fArr[13];
        float f15 = fArr[14];
        float f16 = fArr[15];
        float f17 = (f * f6) - (f2 * f5);
        float f18 = (f * f7) - (f3 * f5);
        float f19 = (f * f8) - (f4 * f5);
        float f20 = (f2 * f7) - (f3 * f6);
        float f21 = (f2 * f8) - (f4 * f6);
        float f22 = (f3 * f8) - (f4 * f7);
        float f23 = (f9 * f14) - (f10 * f13);
        float f24 = (f9 * f15) - (f11 * f13);
        float f25 = (f9 * f16) - (f12 * f13);
        float f26 = (f10 * f15) - (f11 * f14);
        float f27 = (f10 * f16) - (f12 * f14);
        float f28 = (f11 * f16) - (f12 * f15);
        float f29 = (f22 * f23) + (((f20 * f25) + ((f19 * f26) + ((f17 * f28) - (f18 * f27)))) - (f21 * f24));
        if (f29 != 0.0f) {
            float f30 = 1.0f / f29;
            fArr2[0] = c13.p(f8, f26, (f6 * f28) - (f7 * f27), f30);
            fArr2[1] = fd21.g(f4, f26, (f3 * f27) + ((-f2) * f28), f30);
            fArr2[2] = c13.p(f16, f20, (f14 * f22) - (f15 * f21), f30);
            fArr2[3] = fd21.g(f12, f20, (f11 * f21) + ((-f10) * f22), f30);
            float f31 = -f5;
            fArr2[4] = fd21.g(f8, f24, (f7 * f25) + (f31 * f28), f30);
            fArr2[5] = c13.p(f4, f24, (f28 * f) - (f3 * f25), f30);
            float f32 = -f13;
            fArr2[6] = fd21.g(f16, f18, (f15 * f19) + (f32 * f22), f30);
            fArr2[7] = c13.p(f12, f18, (f9 * f22) - (f11 * f19), f30);
            fArr2[8] = c13.p(f8, f23, (f5 * f27) - (f6 * f25), f30);
            fArr2[9] = fd21.g(f4, f23, (f25 * f2) + ((-f) * f27), f30);
            fArr2[10] = c13.p(f16, f17, (f13 * f21) - (f14 * f19), f30);
            fArr2[11] = fd21.g(f12, f17, (f19 * f10) + ((-f9) * f21), f30);
            fArr2[12] = fd21.g(f7, f23, (f6 * f24) + (f31 * f26), f30);
            fArr2[13] = c13.p(f3, f23, (f * f26) - (f2 * f24), f30);
            fArr2[14] = fd21.g(f15, f17, (f14 * f18) + (f32 * f20), f30);
            fArr2[15] = c13.p(f11, f17, (f9 * f20) - (f10 * f18), f30);
        }
        return !(f29 == 0.0f);
    }

    public static final long p(float f, long j, long j2) {
        int i = (int) (j >> 32);
        float fIntBitsToFloat = ((Float.intBitsToFloat((int) (j2 >> 32)) - Float.intBitsToFloat(i)) * f) + Float.intBitsToFloat(i);
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = ((Float.intBitsToFloat((int) (j2 & 4294967295L)) - Float.intBitsToFloat(i2)) * f) + Float.intBitsToFloat(i2);
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    public static final err0 q(int i) {
        return new err0(i);
    }

    public static final j2i r(int i, cv30 cv30Var, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        Object objT = x340Var.T();
        if (objT == fkj0.X) {
            objT = new j2i(i, cv30Var, true);
            x340Var.s0(objT);
        }
        j2i j2iVar = (j2i) objT;
        j2iVar.o(cv30Var);
        return j2iVar;
    }

    public static final boolean s(h311 h311Var, h311 h311Var2) {
        return h311Var == null || !h311Var.a() || h311Var == h311Var2 || u890.j(h311Var.c, h311Var2.c);
    }

    public static final g7f0 t(l7f0 l7f0Var, q6w0 q6w0Var, ruq0 ruq0Var, Float f) {
        x6b x6bVarZ = l7f0Var != null ? xto.z(l7f0Var, q6w0Var.P0, ruq0Var, f) : null;
        if (x6bVarZ != null) {
            l7f0Var = new l7f0(l7f0Var.a, x6bVarZ, l7f0Var.c);
        }
        return new g7f0(l7f0Var, x6bVarZ != null);
    }

    public static final int u(int i) {
        return 1 << (((i % 10) * 3) + 1);
    }

    public static final float v(float f) {
        return fd21.g(2.0f, f, 3.0f, f * f);
    }

    public static final int w(b8w0 b8w0Var) {
        switch (b8w0Var.ordinal()) {
            case 0:
                return 2131958871;
            case 1:
                return 2131958858;
            case 2:
                return 2131958855;
            case 3:
                return 2131958873;
            case 4:
                return 2131958870;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return 2131958877;
            case 11:
                return 2131958874;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                return 2131958877;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return 2131958878;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return 2131958877;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return 2131958857;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return 2131958875;
            case 22:
                return 2131958853;
            case 23:
                return 2131958877;
            default:
                eg.o();
                return 0;
        }
    }

    public static final Set x(chm0 chm0Var) {
        ArrayList arrayListB = chm0Var.b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListB) {
            if (obj instanceof ftl) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            r7h.W(((ftl) it.next()).b(), arrayList2);
        }
        return o7h.p1(arrayList2);
    }

    public static final Set y(chm0 chm0Var) {
        ArrayList arrayListB = chm0Var.b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListB) {
            if (obj instanceof h030) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((h030) it.next()).e());
        }
        return o7h.p1(arrayList2);
    }

    public static Next z(kak0 kak0Var) {
        return Next.h(kak0.a(kak0Var, new ldm0(kak0Var.S0.b), (Boolean) null, (ycu0) null, (lhg1) null, (lhg1) null, (lhg1) null, (xx8) null, (List) null, (List) null, (Float) null, (lhg1) null, (lhg1) null, (lhg1) null, (String) null, (String) null, (lhg1) null, (m8w0) null, false, 0, 0, 0, (giq0) null, (uia) null, (uia) null, (Float) null, (Float) null, (Float) null, (Float) null, false, false, (String) null, false, (lhg1) null, (Boolean) null, (Integer) null, (lyj0) null, 0L, (Integer) null, (Integer) null, -17, 1048575));
    }
}
