package p;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.view.View;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import app.p000rive.semantics.SemanticState;
import com.comscore.streaming.ContentType;
import com.spotify.messaging.messagingplatformimpl.slate.SlateMessageHostActivity;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class rc2 {
    public static final l691 a = new l691("", false, new fvf1(0, 0));
    public static b180 b;
    public static b180 c;

    public static final mnv0 A(String str) {
        return new mnv0(str);
    }

    public static final mnv0 B(String str) {
        return new mnv0(str);
    }

    public static crl0 C() {
        return new crl0();
    }

    public static LinkedHashSet D(ajn0 ajn0Var, Collection collection, Collection collection2, beg begVar, siz sizVar, exq0 exq0Var, boolean z) {
        if (collection == null) {
            a(13);
            throw null;
        }
        if (begVar == null) {
            a(15);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        exq0Var.h(ajn0Var, collection, collection2, begVar, new ght(sizVar, linkedHashSet, z));
        return linkedHashSet;
    }

    public static LinkedHashSet E(ajn0 ajn0Var, AbstractCollection abstractCollection, Collection collection, beg begVar, siz sizVar, exq0 exq0Var) {
        if (begVar != null) {
            return D(ajn0Var, abstractCollection, collection, begVar, sizVar, exq0Var, false);
        }
        a(3);
        throw null;
    }

    public static LinkedHashSet F(ajn0 ajn0Var, Collection collection, AbstractCollection abstractCollection, beg begVar, exq0 exq0Var) {
        rdx0 rdx0Var = rdx0.g;
        if (collection == null) {
            a(7);
            throw null;
        }
        if (begVar != null) {
            return D(ajn0Var, collection, abstractCollection, begVar, rdx0Var, exq0Var, true);
        }
        a(9);
        throw null;
    }

    public static final rgp0 G(svz0 svz0Var, Collection collection) {
        if (collection.isEmpty() || svz0Var.b.isEmpty()) {
            w7x w7xVar = w7x.a;
            return new rgp0(w7xVar, w7xVar);
        }
        HashSet hashSetJ1 = o7h.j1(collection);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (m67 m67Var : svz0Var.a.c) {
            long j = m67Var.f;
            if (!linkedHashSet.contains(Long.valueOf(j))) {
                String strI = xcg1.i(m67Var.b, ".", m67Var.a);
                if (hashSetJ1.contains(strI)) {
                    Long lValueOf = Long.valueOf(j);
                    Object linkedHashSet2 = linkedHashMap.get(lValueOf);
                    if (linkedHashSet2 == null) {
                        linkedHashSet2 = new LinkedHashSet();
                        linkedHashMap.put(lValueOf, linkedHashSet2);
                    }
                    ((Set) linkedHashSet2).add(strI);
                } else {
                    linkedHashSet.add(Long.valueOf(j));
                    linkedHashMap.remove(Long.valueOf(j));
                }
            }
        }
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        LinkedHashSet linkedHashSet4 = new LinkedHashSet();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            long jLongValue = ((Number) entry.getKey()).longValue();
            linkedHashSet3.addAll((Set) entry.getValue());
            linkedHashSet4.add(Integer.valueOf((int) jLongValue));
        }
        return new rgp0(linkedHashSet3, linkedHashSet4);
    }

    public static final mnv0 H(String str) {
        return new mnv0(str);
    }

    public static final mnv0 I(String str) {
        return new mnv0(str);
    }

    public static final pdy0 J(svz0 svz0Var, ydy0 ydy0Var) {
        return ydy0Var.create(new f141(svz0Var.b));
    }

    public static final j1q0 K(p0q0 p0q0Var) {
        if (p0q0Var instanceof n0q0) {
            return new e1q0(((n0q0) p0q0Var).a);
        }
        if (p0q0Var instanceof o0q0) {
            o0q0 o0q0Var = (o0q0) p0q0Var;
            return new h1q0(o0q0Var.a, o0q0Var.b, o0q0Var.c);
        }
        eg.o();
        return null;
    }

    public static final ArrayList L(ye91 ye91Var, int i, Integer num) {
        re01 re01Var = new re01(ye91Var);
        i = ye91Var.q(i);
        Integer numA = ye91Var.a(i);
        while (i >= 0) {
            re01Var.f(ye91Var.i(i), ye91Var.k(i) ? ye91Var.p(i, ye91Var.b) : fkj0.X, ye91Var.a.l(i), num);
            if (i >= 0) {
                Integer num2 = numA;
                numA = ye91Var.a(i);
                i = ye91Var.q(i);
                num = num2;
            } else {
                num = numA;
            }
        }
        return re01Var.a;
    }

    public static final Object M(long j, vu30 vu30Var, lnm lnmVar) {
        if (j <= 0) {
            throw new TimeoutCancellationException("Timed out immediately", (hve1) null);
        }
        hve1 hve1Var = new hve1(j, lnmVar);
        op71.w(hve1Var, hap1.l(((fn41) hve1Var).e.getContext()).f(hve1Var.f, hve1Var, ((q6) hve1Var).d));
        return wgo1.E(hve1Var, false, hve1Var, vu30Var);
    }

    public static final Object N(long j, vu30 vu30Var, onm onmVar) {
        return M(hap1.u(j), vu30Var, onmVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.coroutines.TimeoutCancellationException */
    /* JADX WARN: Code duplicated, block: B:37:0x0079  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object O(long j, vu30 vu30Var, lnm lnmVar) throws TimeoutCancellationException {
        ive1 ive1Var;
        p811 p811Var;
        if (lnmVar instanceof ive1) {
            ive1Var = (ive1) lnmVar;
            int i = ive1Var.c;
            if ((i & os00.INVALID_ID) != 0) {
                ive1Var.c = i - os00.INVALID_ID;
            } else {
                ive1Var = new ive1(lnmVar);
            }
        } else {
            ive1Var = new ive1(lnmVar);
        }
        Object obj = ive1Var.b;
        int i2 = ive1Var.c;
        if (i2 == 0) {
            hm5.M(obj);
            if (j > 0) {
                p811 p811Var2 = new p811();
                try {
                    ive1Var.a = p811Var2;
                    ive1Var.c = 1;
                    hve1 hve1Var = new hve1(j, ive1Var);
                    p811Var2.a = hve1Var;
                    try {
                        op71.w(hve1Var, hap1.l(((fn41) hve1Var).e.getContext()).f(hve1Var.f, hve1Var, ((q6) hve1Var).d));
                        Object objE = wgo1.E(hve1Var, false, hve1Var, vu30Var);
                        d9n d9nVar = d9n.a;
                        return objE == d9nVar ? d9nVar : objE;
                    } catch (TimeoutCancellationException e) {
                        e = e;
                        p811Var = p811Var2;
                        if (e.a != p811Var.a) {
                            throw e;
                        }
                        return null;
                    }
                } catch (TimeoutCancellationException e2) {
                    e = e2;
                }
            }
            return null;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        p811Var = ive1Var.a;
        try {
            hm5.M(obj);
            return obj;
        } catch (TimeoutCancellationException e3) {
            e = e3;
        }
        if (e.a != p811Var.a) {
            throw e;
        }
        return null;
    }

    public static final Object P(long j, vu30 vu30Var, lnm lnmVar) {
        return O(hap1.u(j), vu30Var, lnmVar);
    }

    public static /* synthetic */ void a(int i) {
        String str = i != 18 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 18 ? 3 : 2];
        switch (i) {
            case 1:
            case 7:
            case 13:
                objArr[0] = "membersFromSupertypes";
                break;
            case 2:
            case 8:
            case 14:
                objArr[0] = "membersFromCurrent";
                break;
            case 3:
            case 9:
            case 15:
                objArr[0] = "classDescriptor";
                break;
            case 4:
            case 10:
            case 16:
                objArr[0] = "errorReporter";
                break;
            case 5:
            case 11:
            case 17:
                objArr[0] = "overridingUtil";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "name";
                break;
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            case 20:
                objArr[0] = "annotationClass";
                break;
        }
        if (i != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        } else {
            objArr[1] = "resolveOverrides";
        }
        switch (i) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "resolveOverridesForStaticMembers";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "resolveOverrides";
                break;
            case 18:
                break;
            case 19:
            case 20:
                objArr[2] = "getAnnotationParameterByName";
                break;
            default:
                objArr[2] = "resolveOverridesForNonStaticMembers";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i == 18) {
            throw new IllegalStateException(str2);
        }
    }

    public static final void b(Function0 function0, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1231534734);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            String strO0 = cwl1.o0(x340Var, 2131957790);
            bdl0 bdl0VarC = mno1.C(gfe0.b(x340Var));
            bdl0 bdl0Var = bdl0VarC instanceof bdl0 ? bdl0VarC : null;
            j82.k(bdl0Var != null ? new adl0(bdl0Var) : null, apo.r(-323236526, new s721(strO0, function0, (byte) 9), x340Var), x340Var, 48);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new h621(function0, i, (byte) 26);
        }
    }

    public static final void c(qyk1 qyk1Var, Function0 function0, Function0 function1, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(393170769);
        int i2 = (x340Var.i(qyk1Var) ? 4 : 2) | i | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(function1) ? SemanticState.Hidden : SemanticState.Focused);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            d(qyk1Var, apo.r(2145744816, new zuk1(qyk1Var, function1, function0), x340Var), x340Var, (i2 & 14) | 48);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zuk1(qyk1Var, function0, function1, i);
        }
    }

    public static final void d(qyk1 qyk1Var, j2i j2iVar, b0k b0kVar, int i) {
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(66915449);
        int i2 = i | (b0kVar2.i(qyk1Var) ? 4 : 2);
        if (b0kVar2.Y(i2 & 1, (i2 & 19) != 18)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar2, 0);
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
            String strO0 = cwl1.o0(b0kVar2, 2131957795);
            uwr uwrVar = cbx.a;
            vbe.s(strO0, null, cbx.a(b0kVar2).b.c, cbx.a(b0kVar2).b.c, cbx.d(b0kVar2).k, false, b0kVar2, 0, 34);
            cvx cvxVar = cbx.b(b0kVar2).b;
            String strG = ydh.g(6.0f, 2131957796, b0kVar2, b0kVar2, nim0Var);
            long j = cbx.a(b0kVar2).b.a;
            lee1 lee1Var = cbx.d(b0kVar2).h;
            b0kVar2 = b0kVar2;
            uwo1.e(strG, (qim0) null, lee1Var, j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2034);
            cvx cvxVar2 = cbx.b(b0kVar2).b;
            op71.g(b0kVar2, u291.h(nim0Var, 4.0f));
            k(qyk1Var.d, 0, b0kVar2, qyk1Var.h);
            cvx cvxVar3 = cbx.b(b0kVar2).b;
            op71.g(b0kVar2, u291.h(nim0Var, 6.0f));
            j2iVar.invoke(b0kVar2, 6);
            b0kVar2.r(true);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new eii1(qyk1Var, j2iVar, i, (byte) 22);
        }
    }

    public static final void e(tn30 tn30Var, qim0 qim0Var, b0k b0kVar, int i) {
        byte b2;
        qim0 qim0Var2;
        String strN0;
        String str = tn30Var.b;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1559395548);
        int i2 = (x340Var.i(tn30Var) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            if (str.length() == 0) {
                strN0 = x0d.k(x340Var, 1586656057, 2131956144, x340Var, false);
            } else {
                x340Var.i0(1586739354);
                strN0 = cwl1.n0(2131956143, new Object[]{str}, x340Var);
                x340Var.r(false);
            }
            Uri uri = Uri.parse(tn30Var.a);
            jsl jslVar = new jsl(strN0);
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarA = o2a.a(u291.r(qim0Var3, 64.0f));
            jmr0 jmr0VarN = i3o1.n(2131233069, x340Var, 0);
            b2 = 18;
            eso1.e(uri, jslVar, qim0VarA, (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, new pux(jmr0VarN, jmr0VarN), false, false, x340Var, 1073741824, 0, 3576);
            qim0Var2 = qim0Var3;
        } else {
            b2 = 18;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xh00(tn30Var, qim0Var2, i, b2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0057  */
    public static final void f(q0q0 q0q0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        boolean z;
        boolean zA;
        e0q0 c0q0Var;
        e0q0 e0q0Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-88101522);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(q0q0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            if (q0q0Var.f instanceof m0q0) {
                z = false;
            } else {
                g0q0 g0q0Var = q0q0Var.g;
                g0q0 g0q0Var2 = g0q0Var instanceof g0q0 ? g0q0Var : null;
                if (g0q0Var2 == null || !g0q0Var2.a) {
                    z = false;
                } else {
                    z = true;
                }
            }
            boolean z2 = q0q0Var.c instanceof w4m;
            if (q0q0Var.i) {
                e0q0Var = a0q0.a;
            } else {
                l840 l840Var = q0q0Var.d;
                if (l840Var instanceof l840) {
                    zA = l840Var.a();
                } else {
                    zA = (l840Var instanceof e840) || (l840Var instanceof f840) || (l840Var instanceof m840);
                }
                if (zA) {
                    c0q0Var = new b0q0(z2);
                } else {
                    c0q0Var = q0q0Var.e == ast0.a ? new c0q0(z2) : new d0q0(z2);
                }
                e0q0Var = c0q0Var;
            }
            boolean zI = x340Var.i(q0q0Var);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                objT = new pdp0(q0q0Var, (byte) 18);
                x340Var.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            String str = q0q0Var.b;
            boolean z3 = (i2 & ContentType.LONG_FORM_ON_DEMAND) == 32;
            Object objT2 = x340Var.T();
            if (z3 || objT2 == m4cVar) {
                objT2 = new tro0(iu30Var, (byte) 20);
                x340Var.s0(objT2);
            }
            c1q0.d(e0q0Var, function0, str, (Function0) objT2, q0q0Var.f, z, x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nbf0(q0q0Var, iu30Var, i, (byte) 24);
        }
    }

    public static final void g(qyk1 qyk1Var, Function0 function0, b0k b0kVar, int i) {
        boolean z;
        rre1 rre1Var = rre1.V0;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(722165550);
        j06 j06Var = x340Var.a;
        int i2 = (x340Var.i(qyk1Var) ? 4 : 2) | i | (x340Var.i(function0) ? 32 : 16);
        boolean z2 = false;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
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
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            k(qyk1Var.d, 0, x340Var, qyk1Var.h);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarO = ab80.o(nim0Var, 4.0f, x340Var, nim0Var, 1.0f);
            cvx cvxVar2 = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(6.0f, true, new um5(z2)), een.Z, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarO);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            uwo1.e(qyk1Var.b, new wnb0(1.0f, true), cbx.d(x340Var).m, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2032);
            if (u890.j(qyk1Var.j, oyk1.a)) {
                x340Var.i0(10910568);
                j(0, 0, x340Var, j9k1.x(nim0Var, rre1Var));
                x340Var.r(false);
                z = true;
            } else {
                x340Var.i0(10990641);
                z = true;
                h((i2 << 3) & 896, 0, qyk1Var.g, function0, x340Var, j9k1.x(nim0Var, rre1Var), qyk1Var.e);
                x340Var.r(false);
            }
            x340Var.r(z);
            x340Var.r(z);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new eii1(qyk1Var, function0, i, (byte) 23);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x0065  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:46:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x008d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0090  */
    /* JADX WARN: Code duplicated, block: B:51:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    public static final void h(int i, int i2, String str, Function0 function0, b0k b0kVar, qim0 qim0Var, boolean z) {
        int i3;
        qim0 qim0Var2;
        boolean z2;
        b0k b0kVar2;
        qim0 qim0Var3;
        h311 h311VarV;
        qim0 qim0Var4;
        jax haxVar;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-2146365409);
        if ((i & 6) == 0) {
            i3 = (b0kVar3.g(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= b0kVar3.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= b0kVar3.i(function0) ? SemanticState.Hidden : SemanticState.Focused;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                qim0Var2 = qim0Var;
                i3 |= b0kVar3.i(qim0Var2) ? SemanticState.Modal : SemanticState.ReadOnly;
            }
            if ((i3 & 1171) != 1170) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (b0kVar3.Y(i3 & 1, z2)) {
                if (i4 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if (!ihc1.y0(str)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                }
                gbx gbxVar = new gbx(new y50(str), function0);
                idx idxVar = new idx(6);
                if (z) {
                    haxVar = jax.a;
                } else {
                    haxVar = new hax(str);
                }
                b0kVar2 = b0kVar3;
                foo1.c(gbxVar, idxVar, qim0Var4, haxVar, yla.s(b0kVar3), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(493326720, new zsd1(str, (byte) 27), b0kVar3), b0kVar2, (i3 >> 3) & 896, 48, 1992);
                qim0Var3 = qim0Var4;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                qim0Var3 = qim0Var2;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new wqi0(str, z, function0, qim0Var3, i, i2);
            }
        }
        i3 |= 3072;
        qim0Var2 = qim0Var;
        if ((i3 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (b0kVar3.Y(i3 & 1, z2)) {
            if (i4 != 0) {
                qim0Var4 = nim0.a;
            } else {
                qim0Var4 = qim0Var2;
            }
            if (!ihc1.y0(str)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar2 = new gbx(new y50(str), function0);
            idx idxVar2 = new idx(6);
            if (z) {
                haxVar = jax.a;
            } else {
                haxVar = new hax(str);
            }
            b0kVar2 = b0kVar3;
            foo1.c(gbxVar2, idxVar2, qim0Var4, haxVar, yla.s(b0kVar3), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(493326720, new zsd1(str, (byte) 27), b0kVar3), b0kVar2, (i3 >> 3) & 896, 48, 1992);
            qim0Var3 = qim0Var4;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var3 = qim0Var2;
        }
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new wqi0(str, z, function0, qim0Var3, i, i2);
        }
    }

    public static final TimeoutCancellationException i(long j, hve1 hve1Var, String str) {
        String strF = gvg.f(j, "Timed out waiting for ", " ms");
        if (str != null) {
            StringBuilder sbT = l1d.t("Coroutine \"", str, "\" ");
            if (strF.length() > 0) {
                strF = Character.toLowerCase(strF.charAt(0)) + strF.substring(1);
            }
            sbT.append(strF);
            strF = sbT.toString();
        }
        return new TimeoutCancellationException(strF, hve1Var);
    }

    public static final void j(int i, int i2, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-402874267);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            qim0Var2 = qim0Var;
        } else {
            qim0Var2 = qim0Var;
            i3 = (x340Var.i(qim0Var2) ? 4 : 2) | i;
        }
        if (x340Var.Y(i3 & 1, (i3 & 3) != 2)) {
            qim0 qim0Var3 = i4 != 0 ? nim0.a : qim0Var2;
            String strO0 = cwl1.o0(x340Var, 2131957801);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = kvj1.O0;
                x340Var.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar = new gbx(new y50(strO0), function0);
            jdx jdxVar = jdx.c;
            gdx gdxVarS = yla.s(x340Var);
            boolean zG = x340Var.g(strO0);
            Object objT2 = x340Var.T();
            if (zG || objT2 == m4cVar) {
                objT2 = new bek1(strO0, (byte) 3);
                x340Var.s0(objT2);
            }
            foo1.c(gbxVar, jdxVar, s161.a(qim0Var3, (iu30) objT2), jax.a, gdxVarS, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, prj.a, apo.r(-686140572, new zsd1(strO0, (byte) 28), x340Var), x340Var, 0, 54, 968);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new z3z0((byte) 6, i, i2, qim0Var2);
        }
    }

    public static final void k(int i, int i2, b0k b0kVar, boolean z) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(140230580);
        int i3 = (b0kVar3.e(i) ? 4 : 2) | i2 | (b0kVar3.h(z) ? 32 : 16);
        if (b0kVar3.Y(i3 & 1, (i3 & 19) != 18)) {
            View view = (View) b0kVar3.k(AndroidCompositionLocals_androidKt.f);
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            boolean z2 = true;
            lnm lnmVar = null;
            if (objT == m4cVar) {
                objT = v8r.q((Object) null);
                b0kVar3.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            Integer numValueOf = Integer.valueOf(i);
            if ((i3 & 14) != 4) {
                z2 = false;
            }
            boolean zI = b0kVar3.i(ven0Var) | z2 | b0kVar3.i(view);
            Object objT2 = b0kVar3.T();
            if (zI || objT2 == m4cVar) {
                v2b v2bVar = new v2b(i, (Object) view, ven0Var, lnmVar, (byte) 14);
                b0kVar3.s0(v2bVar);
                objT2 = v2bVar;
            }
            qxd0.t(numValueOf, b0kVar3, (vu30) objT2);
            Resources resources = ((Context) b0kVar3.k(AndroidCompositionLocals_androidKt.b)).getResources();
            CharSequence quantityText = resources.getQuantityText(2131820743, i);
            uwr uwrVar = cbx.a;
            zma1 zma1VarA = zma1.a(cbx.d(b0kVar3).k.a, cbx.a(b0kVar3).b.a, 0L, (FontWeight) null, (FontStyle) null, (FontFamily) null, 65534);
            ye5 ye5Var = new ye5();
            int iW0 = ihc1.w0(quantityText, "%1$d", 0, false, 6);
            if (iW0 == -1) {
                ye5Var.g(resources.getQuantityString(2131820743, i, Integer.valueOf(i)));
            } else {
                ye5Var.f(quantityText.subSequence(0, iW0));
                StringBuilder sb = ye5Var.a;
                int length = sb.length();
                ye5Var.g(String.valueOf(i));
                ye5Var.d(zma1VarA, length, sb.length());
                ye5Var.f(quantityText.subSequence(iW0 + 4, quantityText.length()));
            }
            af5 af5VarP = ye5Var.p();
            long j = cbx.a(b0kVar3).b.b;
            lee1 lee1Var = cbx.d(b0kVar3).j;
            b0kVar3.i0(1617618046);
            qim0 qim0VarL0 = nim0.a;
            if (z) {
                qim0VarL0 = cwl1.l0(qim0VarL0, cbx.a(b0kVar3).a.c, (hw61) null, 14);
            }
            b0kVar3.r(false);
            b0kVar2 = b0kVar3;
            uwo1.d(af5VarP, j, qim0VarL0, lee1Var, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (cqs0) null, b0kVar2, 0, 0, 4080);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new zdx(i, z, i2);
        }
    }

    public static final void l(String str, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(297298929);
        int i2 = i | (x340Var.g(str) ? 4 : 2);
        boolean z = false;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(6.0f, true, new um5(z)), een.N0, x340Var, 0);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            uwo1.e(str, new wnb0(1.0f, true), cbx.d(x340Var).m, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, i2 & 14, 0, 2032);
            j(0, 1, x340Var, null);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zsd1(str, i, (byte) 29);
        }
    }

    public static final void m(String str, b0k b0kVar, int i) {
        byte b2;
        x340 x340Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(39410688);
        int i2 = i | (x340Var2.g(str) ? 4 : 2);
        boolean z = false;
        if (x340Var2.Y(i2 & 1, (i2 & 3) != 2)) {
            String strO0 = cwl1.o0(x340Var2, 2131957785);
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            jw31 jw31VarA = ew31.a(new d36(6.0f, true, new um5(z)), een.N0, x340Var2, 0);
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
            nko1.H(jw31VarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            uwo1.e(strO0, new wnb0(1.0f, true), cbx.d(x340Var2).m, cbx.a(x340Var2).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2032);
            Object objT = x340Var2.T();
            if (objT == fkj0.X) {
                objT = kvj1.P0;
                x340Var2.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            if (ihc1.y0(str)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            foo1.c(new gbx(new y50(str), function0), new idx(6), (qim0) null, new hax(strO0), yla.s(x340Var2), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(-931395651, new avk1(str, (byte) 0), x340Var2), x340Var2, 0, 48, 1996);
            x340Var = x340Var2;
            b2 = 1;
            x340Var.r(true);
        } else {
            b2 = 1;
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new avk1(str, i, b2);
        }
    }

    public static final k2v n(k2v k2vVar, h2v h2vVar, String str) {
        return new k2v(sqg0.P(k2vVar.a, new mmr0(str, h2vVar)), k2vVar.b);
    }

    public static final mnv0 o(String str) {
        return new mnv0(str);
    }

    public static final List p(ye91 ye91Var) {
        boolean z = ye91Var.f;
        int[] iArr = ye91Var.b;
        if (z || ye91Var.c == 0) {
            return z6x.a;
        }
        re01 re01Var = new re01(ye91Var);
        int iQ = ye91Var.i;
        s340 s340VarValueOf = Integer.valueOf(ye91Var.l - bf91.d(iQ, iArr));
        while (iQ >= 0) {
            re01Var.f(ye91Var.i(iQ), ye91Var.k(iQ) ? ye91Var.p(iQ, iArr) : fkj0.X, ye91Var.a.l(iQ), s340VarValueOf);
            s340VarValueOf = ye91Var.a(iQ);
            iQ = ye91Var.q(iQ);
        }
        return re01Var.a;
    }

    public static final List q(hf91 hf91Var, Integer num, int i, Integer num2) {
        int iF;
        int iR;
        wdn0 wdn0Var;
        if (hf91Var.w || hf91Var.o() == 0) {
            return z6x.a;
        }
        re01 re01Var = new re01(hf91Var);
        if (num2 != null) {
            iF = num2.intValue();
        } else {
            iF = hf91Var.v;
            if (iF < 0) {
                iF = hf91Var.F(i, hf91Var.b);
            }
        }
        if (num == null) {
            int iO = hf91Var.i - hf91Var.O(hf91Var.q(i), hf91Var.b);
            fdn0 fdn0Var = hf91Var.s;
            num = Integer.valueOf(iO + ((fdn0Var == null || (wdn0Var = (wdn0) fdn0Var.b(i)) == null) ? 0 : wdn0Var.b));
        }
        int iQ = hf91Var.q(i) * 5;
        int[] iArr = hf91Var.b;
        if (iQ < iArr.length) {
            iR = hf91Var.r(i);
        } else {
            int iF2 = iF >= 0 ? hf91Var.F(iF, iArr) : iF;
            iR = hf91Var.r(iF);
            int i2 = iF;
            iF = iF2;
            i = i2;
        }
        while (i >= 0) {
            re01Var.f(iR, (hf91Var.b[(hf91Var.q(i) * 5) + 1] & 536870912) != 0 ? hf91Var.s(i) : fkj0.X, hf91Var.P(i), num);
            num = hf91Var.b(i);
            if (iF >= 0) {
                int iF3 = hf91Var.F(iF, hf91Var.b);
                iR = hf91Var.r(iF);
                int i3 = iF;
                iF = iF3;
                i = i3;
            } else {
                i = iF;
            }
        }
        return re01Var.a;
    }

    public static List r(hf91 hf91Var) {
        return q(hf91Var, null, hf91Var.t, null);
    }

    public static final mnv0 s(String str) {
        return new mnv0(str);
    }

    public static final Integer t(ze91 ze91Var, v3k v3kVar) {
        ye91 ye91VarF = ze91Var.f();
        try {
            return u(ye91VarF, v3kVar, 0, ye91VarF.c);
        } finally {
            ye91VarF.c();
        }
    }

    public static final Integer u(ye91 ye91Var, v3k v3kVar, int i, int i2) {
        Integer numU;
        int[] iArr = ye91Var.b;
        while (true) {
            if (i >= i2) {
                return null;
            }
            int i3 = iArr[(i * 5) + 3] + i;
            if (ye91Var.j(i) && ye91Var.i(i) == 206 && u890.j(ye91Var.p(i, iArr), g0k.e)) {
                Object objH = ye91Var.h(i, 0);
                b440 b440Var = objH instanceof b440 ? (b440) objH : null;
                ky11 ky11Var = b440Var != null ? b440Var.a : null;
                u340 u340Var = ky11Var instanceof u340 ? (u340) ky11Var : null;
                if (u340Var != null && u340Var.a == v3kVar) {
                    return Integer.valueOf(i);
                }
            }
            if (ye91Var.d(i) && (numU = u(ye91Var, v3kVar, i + 1, i3)) != null) {
                return Integer.valueOf(numU.intValue());
            }
            i = i3;
        }
    }

    public static final mnv0 v(String str) {
        return new mnv0(str);
    }

    public static tsi1 w(ajn0 ajn0Var, beg begVar) {
        if (ajn0Var == null) {
            a(19);
            throw null;
        }
        if (begVar == null) {
            a(20);
            throw null;
        }
        Collection collectionH = begVar.h();
        if (collectionH.size() != 1) {
            return null;
        }
        for (tsi1 tsi1Var : ((xdg) collectionH.iterator().next()).F()) {
            if (tsi1Var.getName().equals(ajn0Var)) {
                return tsi1Var;
            }
        }
        return null;
    }

    public static th2 x() {
        Calendar calendar = Calendar.getInstance();
        return new th2(calendar.get(5), calendar.get(2), calendar.get(1) - 10, vj2.a, false, false);
    }

    public static final String y(p0q0 p0q0Var) {
        if (p0q0Var instanceof n0q0) {
            return ((n0q0) p0q0Var).a;
        }
        if (p0q0Var instanceof o0q0) {
            return ((o0q0) p0q0Var).b;
        }
        eg.o();
        return null;
    }

    public static Intent z(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SlateMessageHostActivity.class);
        intent.putExtra("notification_id", str);
        return intent;
    }
}
