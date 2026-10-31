package p;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import com.spotify.mobius.rx3.RxEventSources;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class suo1 {
    public static b180 a;

    public static final LinkedHashMap A(Map map, List list, int i) {
        fjc0 fjc0VarC;
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        if (((String) list.get(i)).length() != 0) {
            Object obj = linkedHashMap.get(new vhc0(i));
            krf0 krf0Var = krf0.a;
            if (!u890.j(obj, krf0Var)) {
                G(linkedHashMap, list, i);
                return linkedHashMap;
            }
            if (F(linkedHashMap).size() == 1) {
                linkedHashMap.clear();
                return linkedHashMap;
            }
            fjc0 fjc0VarD = D(i, list);
            if (fjc0VarD != null && (fjc0VarC = C(i, list)) != null && u890.j(linkedHashMap.get(new vhc0(fjc0VarD.a)), krf0Var) && u890.j(linkedHashMap.get(new vhc0(fjc0VarC.a)), krf0Var)) {
                linkedHashMap.clear();
                G(linkedHashMap, list, i);
                return linkedHashMap;
            }
            linkedHashMap.remove(new vhc0(i));
            B(linkedHashMap);
            Iterator it = E(linkedHashMap, list).iterator();
            while (it.hasNext()) {
                linkedHashMap.put(new vhc0(((fjc0) it.next()).a), jrf0.a);
            }
        }
        return linkedHashMap;
    }

    public static final void B(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (u890.j((lrf0) entry.getValue(), jrf0.a)) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        for (vhc0 vhc0Var : linkedHashMap2.keySet()) {
            int i = vhc0Var.a;
            linkedHashMap.remove(vhc0Var);
        }
    }

    public static final fjc0 C(int i, List list) {
        List list2;
        do {
            i++;
            list2 = list;
            if (i >= list2.size()) {
                break;
            }
        } while (((String) list.get(i)).length() == 0);
        if (i >= list2.size()) {
            return null;
        }
        return new fjc0(i, ((String) list.get(i)).length());
    }

    public static final fjc0 D(int i, List list) {
        int i2 = i - 1;
        while (i2 > 0 && ((String) list.get(i2)).length() == 0) {
            i2--;
        }
        if (i2 < 0) {
            return null;
        }
        return new fjc0(i2, ((String) list.get(i2)).length());
    }

    public static final List E(LinkedHashMap linkedHashMap, List list) {
        if (F(linkedHashMap).size() >= 5) {
            return z6x.a;
        }
        fjc0 fjc0VarD = D(((vhc0) o7h.p0(F(linkedHashMap))).a, list);
        fjc0 fjc0VarC = C(((vhc0) o7h.z0(F(linkedHashMap))).a, list);
        smc0 smc0VarN = k4p1.n();
        if (fjc0VarD != null && !H(linkedHashMap, list, fjc0VarD)) {
            smc0VarN.add(fjc0VarD);
        }
        if (fjc0VarC != null && !H(linkedHashMap, list, fjc0VarC)) {
            smc0VarN.add(fjc0VarC);
        }
        return k4p1.k(smc0VarN);
    }

    public static final TreeSet F(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (u890.j((lrf0) entry.getValue(), krf0.a)) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        Set setKeySet = linkedHashMap2.keySet();
        TreeSet treeSet = new TreeSet(new cvt((byte) 26));
        o7h.h1(setKeySet, treeSet);
        return treeSet;
    }

    public static final void G(LinkedHashMap linkedHashMap, List list, int i) {
        if (!linkedHashMap.containsKey(new vhc0(i))) {
            linkedHashMap.clear();
        }
        linkedHashMap.put(new vhc0(i), krf0.a);
        B(linkedHashMap);
        Iterator it = E(linkedHashMap, list).iterator();
        while (it.hasNext()) {
            linkedHashMap.put(new vhc0(((fjc0) it.next()).a), jrf0.a);
        }
    }

    public static final boolean H(LinkedHashMap linkedHashMap, List list, fjc0 fjc0Var) {
        Iterator it = F(linkedHashMap).iterator();
        int length = 0;
        while (it.hasNext()) {
            length += ((String) list.get(((vhc0) it.next()).a)).length();
        }
        return length + fjc0Var.b > 200;
    }

    public static final void a(o88 o88Var, qim0 qim0Var, vzq0 vzq0Var, iu30 iu30Var, hhr hhrVar, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        qim0 qim0Var3;
        qim0 qim0VarD;
        m4c m4cVar = fkj0.X;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(2056685558);
        if ((i & 6) == 0) {
            i2 = (b0kVar2.g(o88Var) ? 4 : 2) | i;
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
                objT = yv91.a(new tf1(xtb0VarA, fX0, (byte) 1));
                b0kVar2.s0(objT);
            }
            tob1 tob1Var = (tob1) objT;
            if (o88Var.f) {
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
                objT2 = new xg6(o88Var, iu30Var, (byte) 28);
                b0kVar2.s0(objT2);
            }
            ujo1.d(qim0VarD2, xtb0VarA, vzq0Var, false, null, null, null, false, null, (iu30) objT2, b0kVar2, i3 & 896, 504);
            b0kVar2 = b0kVar2;
            uwr uwrVar = cbx.a;
            bzn1.e(null, apo.r(-1043476388, new pp5(o88Var, tob1Var, (byte) 22), b0kVar2), false, null, new qgr0(u7h.b(cbx.a(b0kVar2).a.c, ((Number) tob1Var.getValue()).floatValue(), 0.0f, 0.0f, 0.0f, 14)), null, null, null, b0kVar2, 48, 237);
            b0kVar2.r(true);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new hy0((byte) 10, i, o88Var, vzq0Var, hhrVar, iu30Var, qim0Var2);
        }
    }

    public static final void b(c380 c380Var, jkr0 jkr0Var, qim0 qim0Var, j2i j2iVar, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(89053650);
        int i2 = i | (b0kVar3.g(c380Var) ? 4 : 2) | (b0kVar3.g(jkr0Var) ? 32 : 16) | 384;
        if (!b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        } else {
            if (c380Var.isEmpty()) {
                hhg1.n("Chat tabs cannot be empty");
                return;
            }
            ld41 ld41VarG = sgc1.G(b0kVar3);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarD = u291.d(qim0Var3, 1.0f);
            boolean z = (i2 & 14) == 4;
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                objT = new xr1(c380Var, (byte) 3);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            w0h1.c(jkr0Var, qim0VarD, (vzq0) null, (gdr0) null, 0, 0.0f, (pl3) null, (ru91) null, false, (iu30) objT, (d6o0) null, (xu91) null, (hxq0) null, apo.r(-2086652205, new gk0(c380Var, ld41VarG, j2iVar, (byte) 6), b0kVar3), b0kVar2, (i2 >> 3) & 14, 15356);
            qim0Var2 = qim0Var3;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new hwd(c380Var, jkr0Var, qim0Var2, j2iVar, i, (byte) 11);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.c380 */
    public static final void c(String str, boolean z, String str2, c380 c380Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) throws c380 {
        int i2;
        c380 c380Var2;
        qim0 qim0VarF;
        qim0 qim0Var2;
        boolean z2;
        Function0 function1 = function0;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-1618304093);
        if ((i & 6) == 0) {
            i2 = (b0kVar2.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar2.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar2.g(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar2.g(c380Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar2.i(function1) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= b0kVar2.i(qim0Var) ? 131072 : 65536;
        }
        int i3 = i2;
        if (b0kVar2.Y(i3 & 1, (i3 & 74899) != 74898)) {
            qim0 qim0VarF2 = u291.f(qim0Var, 1.0f);
            qim0 qim0Var3 = nim0.a;
            if (str2 == null) {
                b0kVar2.i0(110940271);
                b0kVar2.r(false);
                qim0VarF = null;
                c380Var2 = null;
            } else {
                b0kVar2.i0(110940272);
                qim0 qim0VarQ = i1p1.q(qim0Var3, er31.b(4.0f));
                uwr uwrVar = cbx.a;
                c380Var2 = null;
                qim0VarF = dug.f(qim0VarQ, cbx.a(b0kVar2).a.b.a(), d4o1.a);
                b0kVar2.r(false);
            }
            if (qim0VarF == null) {
                b0kVar2 = b0kVar2;
                qim0VarF = qim0Var3;
            }
            b0kVar2 = b0kVar2;
            qim0 qim0VarThen = qim0VarF2.then(qim0VarF);
            uwr uwrVar2 = cbx.a;
            qim0 qim0VarX = uyn1.x(qim0VarThen, cbx.b(b0kVar2).b.a);
            era eraVar = een.Q0;
            mbh mbhVarA = jbh.a(h36.c, eraVar, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarX);
            hzj.A.getClass();
            if (((x340) b0kVar2).a == null) {
                tgp1.p();
                throw c380Var2;
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
            c380 c380Var3 = (c380Var == null || str2 == null) ? c380Var2 : c380Var;
            if (c380Var3 == null) {
                b0kVar2.i0(-1148388640);
                z2 = false;
                b0kVar2.r(false);
                qim0Var2 = qim0Var3;
            } else {
                b0kVar2.i0(-1148388639);
                qim0Var2 = qim0Var3;
                mym.c(c380Var3, u291.f(uyn1.B(qim0Var3, 0.0f, 0.0f, 0.0f, cbx.b(b0kVar2).b.a, 7), 1.0f), eraVar, b0kVar2, 0, 0);
                z2 = false;
                b0kVar2.r(false);
            }
            if (str2 == null) {
                b0kVar2.i0(-1148160511);
                b0kVar2.r(z2);
            } else {
                b0kVar2.i0(-1148160510);
                b0k b0kVar3 = b0kVar2;
                uwo1.e(str2, uyn1.B(u291.f(qim0Var2, 1.0f), 0.0f, 0.0f, 0.0f, cbx.b(b0kVar2).b.a, 7), cbx.d(b0kVar2).j, 0L, new a0e1(3), null, 0, false, null, 0, null, b0kVar3, (i3 >> 6) & 14, 0, 2024);
                b0kVar2 = b0kVar3;
                b0kVar2.r(z2);
            }
            function1 = function0;
            ouo1.h((i3 & 126) | ((i3 >> 6) & 896), str, function1, b0kVar2, z);
            b0kVar2.r(true);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new si2(str, z, str2, c380Var, function1, qim0Var, i);
        }
    }

    public static final void d(int i, int i2, int i3, String str, b0k b0kVar, qim0 qim0Var) {
        int i4;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-401561163);
        if ((i2 & 6) == 0) {
            i4 = (x340Var.g(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        int i5 = i4 | 384;
        int i6 = i3 & 8;
        if (i6 != 0) {
            i5 = i4 | 3456;
        } else if ((i2 & 3072) == 0) {
            i5 |= x340Var.e(i == 0 ? -1 : l1d.C(i)) ? 2048 : 1024;
        }
        if (x340Var.Y(i5 & 1, (i5 & 1171) != 1170)) {
            if (i6 != 0) {
                i = 1;
            }
            gfx.b(8, apo.r(724924640, new gy0(i, qim0Var, str), x340Var), x340Var, 54);
        } else {
            x340Var.b0();
        }
        int i7 = i;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new e13((byte) 1, i7, i2, i3, str, qim0Var);
        }
    }

    public static final void e(int i, qim0 qim0Var, int i2, j2i j2iVar, b0k b0kVar, int i3, int i4) {
        int i5;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(351023404);
        if ((i3 & 6) == 0) {
            i5 = (x340Var.e(l1d.C(i)) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i6 = i4 & 2;
        if (i6 != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            i5 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= x340Var.e(i2 == 0 ? -1 : l1d.C(i2)) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= x340Var.i(j2iVar) ? 2048 : 1024;
        }
        if (x340Var.Y(i5 & 1, (i5 & 1171) != 1170)) {
            if (i6 != 0) {
                qim0Var = nim0.a;
            }
            gfx.b(i, apo.r(540676247, new z3f(i2, qim0Var, j2iVar), x340Var), x340Var, (i5 & 14) | 48);
        } else {
            x340Var.b0();
        }
        qim0 qim0Var2 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xxx(i, qim0Var2, i2, j2iVar, i3, i4);
        }
    }

    public static final void f(String str, int i, qim0 qim0Var, int i2, b0k b0kVar, int i3, int i4) {
        int i5;
        int i6;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-334466711);
        if ((i3 & 6) == 0) {
            i5 = (x340Var.g(str) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= x340Var.e(l1d.C(i)) ? 32 : 16;
        }
        int i7 = i4 & 4;
        if (i7 != 0) {
            i5 |= 384;
        } else if ((i3 & 384) == 0) {
            i5 |= x340Var.i(qim0Var) ? 256 : 128;
        }
        int i8 = i5 | 3072;
        int i9 = i4 & 16;
        if (i9 != 0) {
            i8 = i5 | 27648;
        } else if ((i3 & 24576) == 0) {
            i8 |= x340Var.e(i2 == 0 ? -1 : l1d.C(i2)) ? 16384 : 8192;
        }
        if (x340Var.Y(i8 & 1, (i8 & 9363) != 9362)) {
            if (i7 != 0) {
                qim0Var = nim0.a;
            }
            int i10 = i9 == 0 ? i2 : 2;
            boolean z = (i8 & 7168) == 2048;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new dw81(1, (byte) 26);
                x340Var.s0(objT);
            }
            int i11 = i10;
            e(i, s161.b(qim0Var, false, (iu30) objT), i11, apo.r(2114875845, new qeu(str, (byte) 19), x340Var), x340Var, ((i8 >> 3) & 14) | 3072 | ((i8 >> 6) & 896), 0);
            i6 = i11;
        } else {
            x340Var.b0();
            i6 = i2;
        }
        qim0 qim0Var2 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xxx(str, i, qim0Var2, i6, i3, i4);
        }
    }

    public static final void g(qim0 qim0Var, String str, j2i j2iVar, b0k b0kVar, int i, int i2) {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1896269216);
        if ((i & 6) == 0) {
            i3 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= x340Var.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var.i(j2iVar) ? 256 : 128;
        }
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            if (i4 != 0) {
                str = null;
            }
            gfx.b(8, apo.r(-474457643, new z6a(qim0Var, str, j2iVar, (byte) 3), x340Var), x340Var, 54);
        } else {
            x340Var.b0();
        }
        String str2 = str;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qx1(qim0Var, (Object) str2, j2iVar, i, i2, (byte) 8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0038  */
    /* JADX WARN: Code duplicated, block: B:28:0x0045  */
    /* JADX WARN: Code duplicated, block: B:32:0x004e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0050  */
    /* JADX WARN: Code duplicated, block: B:36:0x0059  */
    /* JADX WARN: Code duplicated, block: B:45:0x0071 A[PHI: r0 r15
      0x0071: PHI (r0v5 p.qim0) = (r0v2 p.qim0), (r0v7 p.qim0) binds: [B:50:0x007b, B:44:0x0070] A[DONT_GENERATE, DONT_INLINE]
      0x0071: PHI (r15v12 int) = (r15v7 int), (r15v13 int) binds: [B:50:0x007b, B:44:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x0073 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x0075  */
    /* JADX WARN: Code duplicated, block: B:48:0x0078  */
    /* JADX WARN: Code duplicated, block: B:51:0x007d  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    public static final void h(int i, int i2, String str, String str2, b0k b0kVar, qim0 qim0Var) {
        int i3;
        qim0 qim0Var2;
        boolean z;
        String str3;
        qim0 qim0Var3;
        h311 h311VarV;
        qim0 qim0Var4;
        String str4;
        int i4;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2138366597);
        if ((i & 6) == 0) {
            i3 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                qim0Var2 = qim0Var;
                i3 |= x340Var.i(qim0Var2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if ((i2 & 4) == 0 || !x340Var.g(str2)) {
                    i4 = 128;
                } else {
                    i4 = 256;
                }
                i3 |= i4;
            }
            if ((i3 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i3 & 1, z)) {
                x340Var.d0();
                if ((i & 1) != 0 || x340Var.E()) {
                    if (i5 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        str4 = str;
                    }
                    x340Var.s();
                    int i6 = i3 >> 3;
                    g(qim0Var4, str4, apo.r(-625213418, new qeu(str, (byte) 20), x340Var), x340Var, (i6 & 14) | 384 | (i6 & 112), 0);
                    qim0Var3 = qim0Var4;
                    str3 = str4;
                } else {
                    x340Var.b0();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    qim0Var4 = qim0Var2;
                }
                str4 = str2;
                x340Var.s();
                int i7 = i3 >> 3;
                g(qim0Var4, str4, apo.r(-625213418, new qeu(str, (byte) 20), x340Var), x340Var, (i7 & 14) | 384 | (i7 & 112), 0);
                qim0Var3 = qim0Var4;
                str3 = str4;
            } else {
                x340Var.b0();
                str3 = str2;
                qim0Var3 = qim0Var2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new qx1((Object) str, (Object) qim0Var3, (Object) str3, i, i2, (byte) 9);
            }
        }
        i3 |= 48;
        qim0Var2 = qim0Var;
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                i4 = 128;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i3 & 1, z)) {
            x340Var.d0();
            if ((i & 1) != 0) {
                if (i5 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                    str4 = str;
                } else {
                    str4 = str2;
                }
            } else {
                if (i5 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                    str4 = str;
                } else {
                    str4 = str2;
                }
            }
            x340Var.s();
            int i8 = i3 >> 3;
            g(qim0Var4, str4, apo.r(-625213418, new qeu(str, (byte) 20), x340Var), x340Var, (i8 & 14) | 384 | (i8 & 112), 0);
            qim0Var3 = qim0Var4;
            str3 = str4;
        } else {
            x340Var.b0();
            str3 = str2;
            qim0Var3 = qim0Var2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qx1((Object) str, (Object) qim0Var3, (Object) str3, i, i2, (byte) 9);
        }
    }

    public static final void i(t370 t370Var, int i, wgh1 wgh1Var, qim0 qim0Var, b0k b0kVar, int i2) {
        qim0 qim0Var2;
        qim0 qim0Var3;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-58083403);
        int i3 = i;
        int i4 = i2 | (x340Var.g(t370Var) ? 4 : 2) | (x340Var.e(i3) ? 32 : 16) | (x340Var.g(wgh1Var) ? 256 : 128) | 3072;
        boolean z = false;
        boolean z2 = true;
        if (x340Var.Y(i4 & 1, (i4 & 1171) != 1170)) {
            Object objT = x340Var.T();
            if (objT == m4cVar) {
                objT = new htd();
                x340Var.s0(objT);
            }
            htd htdVar = (htd) objT;
            d36 d36Var = new d36(16.0f, true, new um5(false));
            es41 es41VarC = l6o1.C(0, 0, 1, x340Var);
            qim0 qim0Var4 = nim0.a;
            qim0 qim0VarD = sgc1.D(2, l6o1.t(qim0Var4, es41VarC, 14));
            jw31 jw31VarA = ew31.a(d36Var, een.Z, x340Var, 6);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
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
            x340Var.i0(867354255);
            int i5 = 0;
            for (Object obj : t370Var.a) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    p7h.T();
                    throw null;
                }
                q370 q370Var = (q370) obj;
                boolean zE = x340Var.e(q370Var.hashCode());
                Object objT2 = x340Var.T();
                if (zE || objT2 == m4cVar) {
                    Map map = tgh1.a;
                    cox coxVar = (hux) tgh1.a.get(q370Var.e);
                    if (coxVar == null) {
                        coxVar = cox.c;
                    }
                    cox coxVar2 = coxVar;
                    String str = q370Var.a;
                    String str2 = q370Var.b;
                    String str3 = q370Var.c;
                    qim0Var3 = qim0Var4;
                    dtd dtdVar = new dtd(i3, i5, q370Var.d, coxVar2, str, str2, str3, wgh1Var.f);
                    x340Var.s0(dtdVar);
                    objT2 = dtdVar;
                } else {
                    qim0Var3 = qim0Var4;
                }
                otw.c(htdVar, (dtd) objT2, anm1.N("CARD", u291.v(qim0Var3, wgh1Var.e)), (ipb1) null, x340Var, 64, 8);
                i3 = i;
                qim0Var4 = qim0Var3;
                z = false;
                z2 = true;
                i5 = i6;
            }
            x340Var.r(z);
            x340Var.r(z2);
            qim0Var2 = qim0Var4;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ri60((byte) 3, i, i2, t370Var, wgh1Var, qim0Var2);
        }
    }

    public static final void j(r370 r370Var, int i, int i2, wgh1 wgh1Var, mev mevVar, qim0 qim0Var, b0k b0kVar, int i3) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1508109639);
        int i4 = i3 | (x340Var.g(r370Var) ? 4 : 2) | (x340Var.e(i) ? 32 : 16) | (x340Var.e(i2) ? 256 : 128) | (x340Var.g(wgh1Var) ? 2048 : 1024) | (x340Var.g(mevVar) ? 16384 : 8192) | (x340Var.g(qim0Var) ? 131072 : 65536);
        if (x340Var.Y(i4 & 1, (74899 & i4) != 74898)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = new uf50((dlg1) mevVar.b);
                x340Var.s0(objT);
            }
            uf50 uf50Var = (uf50) objT;
            boolean zE = x340Var.e(r370Var.hashCode());
            Object objT2 = x340Var.T();
            if (zE || objT2 == m4cVar) {
                String str = r370Var.a;
                boolean z = r370Var.h;
                long jQ = rjo1.q(r370Var.e);
                long jQ2 = rjo1.q(r370Var.c);
                long jQ3 = rjo1.q(r370Var.d);
                String str2 = r370Var.b;
                String str3 = r370Var.f;
                String str4 = r370Var.g;
                boolean z2 = wgh1Var.f;
                pc60 pc60Var = r370Var.i;
                tf50 tf50Var = new tf50(i, i2, str4, str, jQ, z, jQ2, jQ3, str2, str3, z2, pc60Var != null ? new t9b0(pc60Var.a, rjo1.q(pc60Var.b)) : null);
                x340Var.s0(tf50Var);
                objT2 = tf50Var;
            }
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            cbx.a.getClass();
            otw.c(uf50Var, (tf50) objT2, anm1.N("GRID_ITEM", hno1.f(qim0VarF, uwr.a())), (ipb1) null, x340Var, 0, 8);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lk0(r370Var, i, i2, wgh1Var, mevVar, qim0Var, i3);
        }
    }

    public static final void k(v370 v370Var, int i, boolean z, wgh1 wgh1Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i2) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1201804580);
        int i3 = i2 | (x340Var.g(v370Var) ? 4 : 2) | (x340Var.e(i) ? 32 : 16) | (x340Var.h(z) ? 256 : 128) | (x340Var.g(wgh1Var) ? 2048 : 1024) | 196608;
        if (x340Var.Y(i3 & 1, (74899 & i3) != 74898)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = new kg50(function0);
                x340Var.s0(objT);
            }
            kg50 kg50Var = (kg50) objT;
            boolean z2 = ((i3 & 14) == 4) | ((i3 & 112) == 32) | ((i3 & 896) == 256);
            Object objT2 = x340Var.T();
            if (z2 || objT2 == m4cVar) {
                jg50 jg50Var = new jg50(i, v370Var.a, v370Var.b, z, wgh1Var.f);
                x340Var.s0(jg50Var);
                objT2 = jg50Var;
            }
            jg50 jg50Var2 = (jg50) objT2;
            qim0 qim0Var3 = nim0.a;
            otw.c(kg50Var, jg50Var2, anm1.N("GRID", sgc1.D(2, u291.f(qim0Var3, 1.0f))), (ipb1) null, x340Var, 0, 8);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sx1(v370Var, i, z, wgh1Var, function0, qim0Var2, i2);
        }
    }

    public static final void l(w370 w370Var, int i, wgh1 wgh1Var, dh30 dh30Var, qim0 qim0Var, b0k b0kVar, int i2) {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1449124726);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.g(w370Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.g(wgh1Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= (i2 & 4096) == 0 ? x340Var.g(dh30Var) : x340Var.i(dh30Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= x340Var.g(qim0Var) ? 16384 : 8192;
        }
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = new u660((dlg1) dh30Var.b, (z710) dh30Var.c);
                x340Var.s0(objT);
            }
            u660 u660Var = (u660) objT;
            boolean zE = x340Var.e(w370Var.hashCode());
            Object objT2 = x340Var.T();
            if (zE || objT2 == m4cVar) {
                String str = w370Var.g;
                String str2 = w370Var.f;
                String str3 = w370Var.a;
                String str4 = w370Var.b;
                long jQ = rjo1.q(w370Var.e);
                String str5 = w370Var.c;
                yfh0 yfh0Var = w370Var.d;
                wfm0 wfm0Var = new wfm0(yfh0Var.a, new ygm0(yfh0Var.b));
                boolean z = wgh1Var.f;
                fsd1 fsd1Var = w370Var.i;
                t660 t660Var = new t660(i, str, str3, str4, jQ, str5, wfm0Var, str2, z, fsd1Var != null ? new s660(fsd1Var.a, fsd1Var.b) : null);
                x340Var.s0(t660Var);
                objT2 = t660Var;
            }
            otw.c(u660Var, (t660) objT2, anm1.N("HERO", qim0Var), (ipb1) null, x340Var, 0, 8);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lk0(w370Var, i, wgh1Var, dh30Var, qim0Var, i2, (byte) 13);
        }
    }

    public static final void m(x370 x370Var, int i, wgh1 wgh1Var, qim0 qim0Var, b0k b0kVar, int i2) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1836825362);
        int i3 = i2 | (x340Var.g(x370Var) ? 4 : 2) | (x340Var.e(i) ? 32 : 16) | (x340Var.g(wgh1Var) ? 256 : 128) | 3072;
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = new jjx0();
                x340Var.s0(objT);
            }
            jjx0 jjx0Var = (jjx0) objT;
            boolean zE = x340Var.e(x370Var.hashCode());
            Object objT2 = x340Var.T();
            if (zE || objT2 == m4cVar) {
                String str = x370Var.a;
                String str2 = x370Var.b;
                fsd1 fsd1Var = x370Var.c;
                ijx0 ijx0Var = new ijx0(i, fsd1Var.a, fsd1Var.b, str, str2, wgh1Var.f);
                x340Var.s0(ijx0Var);
                objT2 = ijx0Var;
            }
            qim0 qim0Var3 = nim0.a;
            otw.c(jjx0Var, (ijx0) objT2, anm1.N("PROGRESS_TRACKER", u291.f(qim0Var3, 1.0f)), (ipb1) null, x340Var, 0, 8);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ri60((byte) 4, i, i2, x370Var, wgh1Var, qim0Var2);
        }
    }

    public static final void n(yxa0 yxa0Var, boolean z, Function0 function0, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1568845548);
        int i2 = (x340Var.i(yxa0Var) ? 4 : 2) | i | (x340Var.h(z) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            fra fraVar = een.N0;
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarZ = uyn1.z(0.0f, cbx.b(x340Var).b.a, 1, qim0VarF);
            jw31 jw31VarA = ew31.a(h36.e, fraVar, x340Var, 0);
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
            s110.d(yxa0Var, apo.r(811119630, new r1t0(function0, z, yxa0Var), x340Var), x340Var, (i2 & 14) | 48);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new r1t0(yxa0Var, z, function0, i);
        }
    }

    public static final void o(iac0 iac0Var, iu30 iu30Var, Function0 function0, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1868327245);
        int i2 = (x340Var.i(iac0Var) ? 4 : 2) | i | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean zI = ((i2 & 112) == 32) | x340Var.i(iac0Var) | ((i2 & 896) == 256);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                objT = new pg(iac0Var, iu30Var, function0, (byte) 0);
                x340Var.s0(objT);
            }
            qxd0.i(iac0Var, (iu30) objT, x340Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qg(iac0Var, iu30Var, function0, i, (byte) 0);
        }
    }

    public static final void p(String str, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1920851228);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            wat watVar = (wat) x340Var.k(t4k.h);
            x340Var.i0(897912531);
            int iX0 = (int) watVar.X0(dsa0.m(x340Var, 2131167025));
            x340Var.r(false);
            Object objT = x340Var.T();
            Object obj = fkj0.X;
            if (objT == obj) {
                objT = q1o1.u(new u63(new azr0(iu30Var, (byte) 8), new azr0(iu30Var, (byte) 9), RxEventSources.a(new ObservableSource[]{BehaviorSubject.f()})), null, null, 7);
                x340Var.s0(objT);
            }
            xpw xpwVar = (xpw) objT;
            Object objT2 = x340Var.T();
            if (objT2 == obj) {
                objT2 = new pys0(str, kzs0.b, Integer.valueOf(iX0));
                x340Var.s0(objT2);
            }
            otw.c(xpwVar, (pys0) objT2, qim0Var, (ipb1) null, x340Var, 64 | (i2 & 896), 8);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zj10(str, iu30Var, qim0Var, i, (byte) 2);
        }
    }

    public static final void q(z1t0 z1t0Var, swa0 swa0Var, xk xkVar, v1t0 v1t0Var, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1899979979);
        int i2 = i | (b0kVar3.i(z1t0Var) ? 4 : 2) | (b0kVar3.i(swa0Var) ? 32 : 16) | (b0kVar3.i(xkVar) ? 256 : 128) | (b0kVar3.g(v1t0Var) ? 2048 : 1024) | 24576;
        if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
            boolean z = z1t0Var.d instanceof xxa0;
            es41 es41VarC = l6o1.C(0, 0, 1, b0kVar3);
            Object[] objArr = new Object[0];
            boolean zI = b0kVar3.i(z1t0Var);
            Object objT = b0kVar3.T();
            if (zI || objT == m4cVar) {
                objT = new kks0(z1t0Var, (byte) 4);
                b0kVar3.s0(objT);
            }
            ven0 ven0Var = (ven0) k5p1.s(objArr, (Function0) objT, b0kVar3, 0);
            Object[] objArr2 = new Object[0];
            boolean zI2 = b0kVar3.i(ven0Var);
            Object objT2 = b0kVar3.T();
            if (zI2 || objT2 == m4cVar) {
                objT2 = new q2j0(ven0Var, (byte) 24);
                b0kVar3.s0(objT2);
            }
            ven0 ven0Var2 = (ven0) k5p1.s(objArr2, (Function0) objT2, b0kVar3, 0);
            WeakHashMap weakHashMap = osl1.x;
            u85 u85Var = lhc.g(b0kVar3).g;
            j2i j2iVarR = apo.r(-1908489544, new ofi0(z, z1t0Var, v1t0Var, xkVar, es41VarC, (byte) 5), b0kVar3);
            j2i j2iVarR2 = apo.r(2062412082, new swj(z, es41VarC, ven0Var, ven0Var2, v1t0Var, z1t0Var, xkVar, swa0Var, (byte) 3), b0kVar3);
            qim0 qim0Var3 = nim0.a;
            b0kVar2 = b0kVar3;
            irn1.u(qim0Var3, j2iVarR, null, u85Var, j2iVarR2, b0kVar2, 24630, 4);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new e9g0((byte) 20, i, z1t0Var, swa0Var, xkVar, v1t0Var, qim0Var2);
        }
    }

    public static final String r(ven0 ven0Var) {
        return (String) ven0Var.getValue();
    }

    public static final spi1 s(Function0 function0, Function0 function1) {
        return new spi1(function0, function1);
    }

    public static final void t(Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap2 == null) {
            return;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int width2 = bitmap2.getWidth();
        int height2 = bitmap2.getHeight();
        int[] iArr = new int[width2 * height2];
        bitmap2.getPixels(iArr, 0, width2, 0, 0, width2, height2);
        int[] iArr2 = new int[width * 32];
        int i = 0;
        while (i < height) {
            int iMin = Math.min(32, height - i);
            int i2 = width * iMin;
            bitmap.getPixels(iArr2, 0, width, 0, i, width, iMin);
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = iArr2[i3];
                int i5 = (i4 >>> 24) & 255;
                if (i5 != 0) {
                    float f = ((iArr[((i3 % width) % width2) + ((((i3 / width) + i) % height2) * width2)] >>> 16) & 255) / 255.0f;
                    float f2 = ((i4 >>> 16) & 255) / 255.0f;
                    float f3 = ((i4 >>> 8) & 255) / 255.0f;
                    float f4 = (i4 & 255) / 255.0f;
                    iArr2[i3] = (i5 << 24) | (yoi1.p((int) (((f2 >= 0.5f ? 1.0f - ((1.0f - f) * ((1.0f - f2) * 2.0f)) : (f2 * 2.0f) * f) * 255.0f) + 0.5f), 0, 255) << 16) | (yoi1.p((int) (((f3 >= 0.5f ? 1.0f - ((1.0f - f) * ((1.0f - f3) * 2.0f)) : (f3 * 2.0f) * f) * 255.0f) + 0.5f), 0, 255) << 8) | yoi1.p((int) (((f4 >= 0.5f ? 1.0f - ((1.0f - f) * ((1.0f - f4) * 2.0f)) : f4 * 2.0f * f) * 255.0f) + 0.5f), 0, 255);
                }
            }
            bitmap.setPixels(iArr2, 0, width, 0, i, width, iMin);
            i += iMin;
        }
    }

    public static final ia00 u(wm01 wm01Var, urk0 urk0Var) {
        return n3o1.q(wm01Var).a(new zm01(urk0Var, (byte) 0), kxz0.X0);
    }

    public static final void v(epb0 epb0Var, String str, j2i j2iVar) {
        epb0.Q(epb0Var, str, (Object) null, new j2i(-1791429010, new rv71(j2iVar, (byte) 16), true), 4);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0018  */
    public static final vxo1 w(x6d1 x6d1Var) {
        t7d1 t7d1Var;
        vxo1 uri1Var;
        vxo1 uri1Var2;
        ji0 ji0Var = x6d1Var.a;
        String str = ji0Var != null ? ji0Var.W0 : null;
        boolean zEquals = str == null ? false : str.equals("topic_survey");
        vxo1 vxo1Var = yri1.c;
        if (zEquals || ji0Var == null) {
            uri1Var = vxo1Var;
        } else {
            s4d1 s4d1VarK = l2p1.k(ji0Var);
            if (s4d1VarK != null) {
                s7d1 s7d1Var = s4d1VarK.b;
                t7d1Var = new t7d1(s7d1Var.a, s7d1Var.b);
            } else {
                t7d1Var = null;
            }
            if (t7d1Var == null) {
                uri1Var = vxo1Var;
            } else if (t7d1Var.a.length() == 0) {
                uri1Var = new uri1(new k6d1("survey.survey_transparency_content.transparency_label : missing"));
            } else if (t7d1Var.b.length() == 0) {
                uri1Var = new uri1(new k6d1("survey.survey_transparency_content.transparency_url : missing"));
            } else {
                uri1Var = vxo1Var;
            }
        }
        if (uri1Var instanceof uri1) {
            return uri1Var;
        }
        List listL = ji0Var != null ? l2p1.l(ji0Var) : z6x.a;
        if (listL.isEmpty()) {
            return new uri1(new k6d1("survey.survey_questions : missing"));
        }
        int i = 0;
        for (Object obj : listL) {
            int i2 = i + 1;
            if (i < 0) {
                p7h.T();
                throw null;
            }
            z6d1 z6d1Var = (z6d1) obj;
            if (z6d1Var.c.length() == 0) {
                uri1Var2 = new uri1(new k6d1(gvg.e(i, "survey.survey_questions[", "].id : missing")));
            } else if (z6d1Var.a.length() == 0) {
                uri1Var2 = new uri1(new k6d1(gvg.e(i, "survey.survey_questions[", "].primary_text : missing")));
            } else {
                int i3 = z6d1Var.d;
                if (i3 == 3 || i3 == 2) {
                    List list = z6d1Var.e;
                    if (!list.isEmpty()) {
                        Iterator it = list.iterator();
                        int i4 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                uri1Var2 = vxo1Var;
                                break;
                            }
                            Object next = it.next();
                            int i5 = i4 + 1;
                            if (i4 < 0) {
                                p7h.T();
                                throw null;
                            }
                            y6d1 y6d1Var = (y6d1) next;
                            vxo1 uri1Var3 = y6d1Var.a.length() == 0 ? new uri1(new k6d1(l1d.j(i, i4, "survey.survey_questions[", "].survey_question_options[", "].id : missing"))) : y6d1Var.b.length() == 0 ? new uri1(new k6d1(l1d.j(i, i4, "survey.survey_questions[", "].survey_question_options[", "].primary_text : missing"))) : vxo1Var;
                            if (uri1Var3 instanceof uri1) {
                                uri1Var2 = uri1Var3;
                                break;
                            }
                            i4 = i5;
                        }
                    } else {
                        uri1Var2 = new uri1(new k6d1(gvg.e(i, "survey.survey_questions[", "].survey_question_options : missing")));
                    }
                } else {
                    uri1Var2 = new uri1(new k6d1(gvg.e(i, "survey.survey_questions[", "].survey_question_type : invalid type")));
                }
            }
            if (uri1Var2 instanceof uri1) {
                return uri1Var2;
            }
            i = i2;
        }
        return vxo1Var;
    }

    public static final i7h1 x() {
        return new i7h1(fri0.P0, fri0.Q0);
    }

    public static final Bitmap y(n511 n511Var, float f, float f2, float f3, float f4, long j, float f5) {
        float f6;
        Bitmap bitmap;
        float f7 = 3.0f;
        float f8 = f4 * 3.0f;
        float f9 = f8 + f2;
        float f10 = (n511Var.c - n511Var.a) * f5;
        float f11 = (n511Var.d - n511Var.b) * f5;
        int iCeil = (int) Math.ceil((f9 * 2.0f) + f10);
        int i = iCeil < 1 ? 1 : iCeil;
        int iCeil2 = (int) Math.ceil((f8 * 2.0f) + f11);
        int i2 = iCeil2 < 1 ? 1 : iCeil2;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(1);
        paint.setColor(z4p1.G(u7h.b(j, 1.0f, 0.0f, 0.0f, 0.0f, 14)));
        paint.setMaskFilter(new BlurMaskFilter(f4, BlurMaskFilter.Blur.NORMAL));
        canvas.drawRoundRect(f9 - f2, f8, f9 + f10 + f2, f8 + f11, f, f, paint);
        float f12 = (f10 / 2.0f) + f9;
        float f13 = f11 / 2.0f;
        float f14 = f8 + f13;
        float f15 = ((f2 * 2.0f) + f10) / 2.0f;
        int i3 = i * i2;
        int i4 = i2;
        int[] iArr = new int[i3];
        Bitmap bitmap2 = bitmapCreateBitmap;
        int i5 = i;
        bitmap2.getPixels(iArr, 0, i5, 0, 0, i, i4);
        int i6 = 0;
        while (i6 < i3) {
            if (((iArr[i6] >>> 24) & 255) != 0) {
                float fAbs = (Math.abs(((i6 % i5) + 0.5f) - f12) - f15) + f;
                float fAbs2 = (Math.abs(((i6 / i5) + 0.5f) - f14) - f13) + f;
                f6 = f7;
                float fO = 0.0f;
                bitmap = bitmap2;
                float fMin = (Math.min(Math.max(fAbs, fAbs2), 0.0f) + ((float) Math.sqrt((Math.max(fAbs2, 0.0f) * Math.max(fAbs2, 0.0f)) + (Math.max(fAbs, 0.0f) * Math.max(fAbs, 0.0f))))) - f;
                float fC = u7h.c(j);
                float f16 = f3 + f4;
                if (f16 > 0.0f) {
                    fO = yoi1.o((fMin + f3) / f16, 0.0f, 1.0f);
                } else if (fMin >= 0.0f) {
                    fO = 1.0f;
                }
                int iP = yoi1.p((int) (((1.0f - ((f6 - (fO * 2.0f)) * (fO * fO))) * fC * 255.0f) + 0.5f), 0, 255);
                if (iP == 0) {
                    iArr[i6] = 0;
                } else {
                    iArr[i6] = (iP << 24) | (iArr[i6] & 16777215);
                }
            } else {
                f6 = f7;
                bitmap = bitmap2;
            }
            i6++;
            bitmap2 = bitmap;
            f7 = f6;
        }
        Bitmap bitmap3 = bitmap2;
        bitmap3.setPixels(iArr, 0, i5, 0, 0, i5, i4);
        return bitmap3;
    }

    public static final vj61 z(llw0 llw0Var, jlw0 jlw0Var, ez61 ez61Var) {
        rj61 tj61Var;
        if (llw0Var instanceof ilw0) {
            ilw0 ilw0Var = (ilw0) llw0Var;
            int i = ilw0Var.a;
            String strK = bmq0.k(i);
            int i2 = ilw0Var.b;
            tj61Var = new rj61(strK, i == i2 ? null : bmq0.k(i2));
        } else if (llw0Var instanceof jlw0) {
            tj61Var = new sj61(new uj61(Uri.parse(((jlw0) llw0Var).a)));
        } else {
            if (!(llw0Var instanceof klw0)) {
                eg.o();
                return null;
            }
            tj61Var = new tj61(Uri.parse(((klw0) llw0Var).a));
        }
        return new vj61(new qj61(tj61Var, ez61Var.b), jlw0Var != null ? new uj61(Uri.parse(jlw0Var.a)) : null);
    }
}
