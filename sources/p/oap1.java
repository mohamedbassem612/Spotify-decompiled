package p;

import android.graphics.Rect;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import com.spotify.mobius.Next;
import com.spotify.watchfeed.api.v1.WatchFeedRequest;
import com.spotify.watchfeed.api.v1.d;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class oap1 {
    public static b180 a;
    public static b180 b;

    public static final flb0 A(pim0 pim0Var) {
        return B(pim0Var).a1;
    }

    public static final hmb0 B(x4t x4tVar) {
        ndo0 ndo0Var = ((pim0) x4tVar).a.h;
        if (ndo0Var != null) {
            return ndo0Var.U0;
        }
        throw l1d.w("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public static final oxq0 C(x4t x4tVar) throws KotlinNothingValueException {
        oxq0 oxq0Var = B(x4tVar).O0;
        if (oxq0Var != null) {
            return oxq0Var;
        }
        throw l1d.w("This node does not have an owner.");
    }

    public static final hmb0 D(d030 d030Var) {
        return B(d030Var);
    }

    public static final mmr0 E(are0 are0Var, moe0 moe0Var) {
        Object ope0Var;
        xoe0 xoe0Var = are0Var.a;
        boolean z = moe0Var instanceof ioe0;
        w7x w7xVar = w7x.a;
        if (z || (moe0Var instanceof hoe0)) {
            return new mmr0(are0Var, w7xVar);
        }
        if (moe0Var instanceof goe0) {
            return new mmr0(are0Var, Collections.singleton(mpe0.a));
        }
        if (moe0Var instanceof foe0) {
            return new mmr0(are0Var, Collections.singleton(lpe0.a));
        }
        if (moe0Var instanceof joe0) {
            joe0 joe0Var = (joe0) moe0Var;
            bzn1 bzn1Var = joe0Var.a;
            boolean z2 = joe0Var.b;
            if (bzn1Var instanceof fyn0) {
                ope0Var = new npe0(((fyn0) bzn1Var).c, z2);
            } else {
                if (!(bzn1Var instanceof gyn0)) {
                    eg.o();
                    return null;
                }
                ope0Var = new ope0(((gyn0) bzn1Var).c, z2);
            }
            return new mmr0(are0Var, Collections.singleton(ope0Var));
        }
        if (moe0Var instanceof loe0) {
            loe0 loe0Var = (loe0) moe0Var;
            String str = loe0Var.a;
            String str2 = loe0Var.b;
            woe0 woe0Var = loe0Var.c;
            String str3 = woe0Var.a;
            woe0 woe0Var2 = loe0Var.d;
            iwq0 iwq0Var = new iwq0(str, str2, str3, woe0Var2.a, woe0Var.d, woe0Var2.d);
            mmr0 mmr0Var = new mmr0(r50.c, woe0Var.b);
            Object obj = woe0Var2.b;
            if (obj instanceof ioe0) {
                obj = hoe0.a;
            }
            return new mmr0(new are0(xoe0Var, iwq0Var, sqg0.J(new mmr0[]{mmr0Var, new mmr0(s50.c, obj)})), w7xVar);
        }
        if (!(moe0Var instanceof koe0)) {
            if (moe0Var instanceof eoe0) {
                eoe0 eoe0Var = (eoe0) moe0Var;
                return new mmr0(are0Var, Collections.singleton(new ppe0(eoe0Var.a, eoe0Var.b, eoe0Var.c, eoe0Var.d)));
            }
            eg.o();
            return null;
        }
        koe0 koe0Var = (koe0) moe0Var;
        String str4 = koe0Var.a;
        String str5 = koe0Var.b;
        String str6 = koe0Var.c;
        String str7 = koe0Var.d;
        ArrayList<woe0> arrayList = koe0Var.e;
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        for (woe0 woe0Var3 : arrayList) {
            arrayList2.add(new rvb(woe0Var3.a, woe0Var3.d));
        }
        hwq0 hwq0Var = new hwq0(str4, str5, str6, str7, arrayList2);
        ArrayList arrayList3 = new ArrayList(q7h.U(arrayList, 10));
        int i = 0;
        for (Object obj2 : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                p7h.T();
                throw null;
            }
            arrayList3.add(new mmr0(new l50(i), ((woe0) obj2).b));
            i = i2;
        }
        return new mmr0(new are0(xoe0Var, hwq0Var, sqg0.T(arrayList3)), w7xVar);
    }

    public static final Next F(are0 are0Var, moe0 moe0Var) {
        if (moe0Var == null) {
            return Next.j();
        }
        mmr0 mmr0VarE = E(are0Var, moe0Var);
        are0 are0Var2 = (are0) mmr0VarE.a;
        Set set = (Set) mmr0VarE.b;
        u890.j(are0Var2, are0Var);
        Set set2 = set;
        ArrayList arrayList = new ArrayList(q7h.U(set2, 10));
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            arrayList.add(rc11.a.b(((spe0) it.next()).getClass()).r());
        }
        arrayList.toString();
        if (!u890.j(are0Var2, are0Var) && !set.isEmpty()) {
            return Next.i(are0Var2, set);
        }
        if (u890.j(are0Var2, are0Var)) {
            return !set.isEmpty() ? Next.a(set) : Next.j();
        }
        return Next.h(are0Var2);
    }

    public static void G(PopupWindow popupWindow) {
        popupWindow.setWindowLayoutType(2);
    }

    public static final kf30 H(kf30 kf30Var, kf30 kf30Var2) {
        String str = kf30Var.a.a;
        lf30 lf30Var = kf30Var2.a;
        String str2 = lf30Var.a;
        if (!(kf30Var.equals(kf30Var2) || lf30Var.c() || (nhc1.Y(str, str2, false) && str.charAt(str2.length()) == '.')) || lf30Var.c()) {
            return kf30Var;
        }
        return kf30Var.equals(kf30Var2) ? kf30.c : new kf30(str.substring(str2.length() + 1));
    }

    public static final mqa I(nqa nqaVar) {
        return new mqa(nqaVar.j(), nqaVar.h(), nqaVar.a(), nqaVar.k(), nqaVar.g(), nqaVar.getDescription(), nqaVar.b(), (wkt) null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object J(lqa lqaVar, z2h z2hVar, onm onmVar) {
        pqa pqaVar;
        if (onmVar instanceof pqa) {
            pqaVar = (pqa) onmVar;
            int i = pqaVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pqaVar.c = i - Integer.MIN_VALUE;
            } else {
                pqaVar = new pqa(onmVar);
            }
        } else {
            pqaVar = new pqa(onmVar);
        }
        Object objC = pqaVar.b;
        int i2 = pqaVar.c;
        if (i2 == 0) {
            hm5.M(objC);
            z2h z2hVarA = z2hVar.a(lqaVar.d.a);
            String str = lqaVar.d.a;
            pqaVar.a = lqaVar;
            pqaVar.c = 1;
            objC = z2hVarA.c(str, pqaVar);
            d9n d9nVar = d9n.a;
            if (objC == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            lqaVar = pqaVar.a;
            hm5.M(objC);
        }
        return new dqa(lqaVar.i, lqaVar.t, lqaVar.X, lqaVar.Y, lqaVar.Z, lqaVar.e, o7h.d1(((y2h) objC).a, 3), lqaVar.O0);
    }

    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    public static final void a(String str, qim0 qim0Var, al70 al70Var, b0k b0kVar, int i, int i2) {
        int i3;
        al70 al70Var2;
        qim0 qim0Var2;
        ?? r2;
        al70 al70Var3 = al70Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1056833925);
        int i4 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | 384;
        } else {
            i3 = i4 | ((i & 512) == 0 ? x340Var.g(al70Var3) : x340Var.i(al70Var3) ? 256 : 128);
        }
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            if (i5 != 0) {
                al70Var3 = null;
            }
            fra fraVar = een.N0;
            cr31 cr31Var = er31.a;
            uwr uwrVar = cbx.a;
            qim0 qim0VarF = dug.f(qim0Var, cbx.a(x340Var).d.b, cr31Var);
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(6.0f, 0.0f, 2, qim0VarF);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = ovh.Z;
                x340Var.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarZ, true, (iu30) objT);
            jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var, 0);
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
            qim0 qim0Var3 = nim0.a;
            if (al70Var3 == null) {
                x340Var.i0(-1414831228);
                x340Var.r(false);
                qim0Var2 = qim0Var3;
                r2 = 1;
            } else {
                x340Var.i0(-1414831227);
                hux huxVar = al70Var3.a;
                long j = al70Var3.b;
                zov0 zov0Var = cbx.b(x340Var).g;
                qim0 qim0VarR = u291.r(qim0Var3, 12.0f);
                boolean z = (i3 & 896) == 256 || ((i3 & 512) != 0 && x340Var.i(al70Var3));
                Object objT2 = x340Var.T();
                if (z || objT2 == m4cVar) {
                    objT2 = new mwh(al70Var3, (byte) 2);
                    x340Var.s0(objT2);
                }
                qim0Var2 = qim0Var3;
                r2 = 1;
                w0h1.a(huxVar, isl.a, s161.b(qim0VarR, false, (iu30) objT2), j, 0L, false, x340Var, 56, 48);
                x340Var.r(false);
            }
            lee1 lee1Var = cbx.d(x340Var).m;
            cvx cvxVar2 = cbx.b(x340Var).b;
            uwo1.e(str, uyn1.z(0.0f, 2.0f, r2, qim0Var2), lee1Var, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var, i3 & 14, 0, 2032);
            x340Var = x340Var;
            x340Var.r((boolean) r2);
            al70Var2 = al70Var3;
        } else {
            x340Var.b0();
            al70Var2 = al70Var3;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new dg6(str, qim0Var, al70Var2, i, i2, (byte) 1);
        }
    }

    public static final void b(xxh xxhVar, qim0 qim0Var, b0k b0kVar, int i, int i2) {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1844129560);
        int i4 = (x340Var.g(xxhVar) ? 4 : 2) | i;
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
        } else {
            i3 = i4 | (x340Var.i(qim0Var) ? 32 : 16);
        }
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            if (i5 != 0) {
                qim0Var = nim0.a;
            }
            nyx.a(2, (wux) null, apo.r(869041845, new pxh(xxhVar, qim0Var), x340Var), x340Var, 3078, 6);
        } else {
            x340Var.b0();
        }
        qim0 qim0Var2 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new g8(xxhVar, qim0Var2, i, i2, (byte) 4);
        }
    }

    public static final void c(String str, String str2, String str3, String str4, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-1986355174);
        int i2 = i | (b0kVar2.g(str) ? 4 : 2) | (b0kVar2.g(str2) ? 32 : 16) | (b0kVar2.g(str3) ? 256 : 128) | (b0kVar2.g(str4) ? 2048 : 1024) | (b0kVar2.i(function0) ? 16384 : 8192) | (b0kVar2.i(qim0Var) ? 131072 : 65536);
        if (b0kVar2.Y(i2 & 1, (74899 & i2) != 74898)) {
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar2).b;
            qim0 qim0VarB = uyn1.B(qim0VarF, 0.0f, 16.0f, 0.0f, 0.0f, 13);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarB);
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
            byte b2 = 14;
            vbe.s(str4, (qim0) null, cbx.a(b0kVar2).b.c, cbx.a(b0kVar2).b.c, cbx.d(b0kVar2).k, false, b0kVar2, (i2 >> 9) & 14, 34);
            cvx cvxVar2 = cbx.b(b0kVar2).b;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarO = ab80.o(nim0Var, 16.0f, b0kVar2, nim0Var, 1.0f);
            cvx cvxVar3 = cbx.b(b0kVar2).b;
            uwo1.e(str, uyn1.z(16.0f, 0.0f, 2, qim0VarO), cbx.d(b0kVar2).e, 0L, new a0e1(3), null, 2, false, new cjc0(2), 0, null, b0kVar2, i2 & 14, 0, 1704);
            cvx cvxVar4 = cbx.b(b0kVar2).b;
            qim0 qim0VarO2 = ab80.o(nim0Var, 12.0f, b0kVar2, nim0Var, 1.0f);
            cvx cvxVar5 = cbx.b(b0kVar2).b;
            uwo1.e(str2, uyn1.z(16.0f, 0.0f, 2, qim0VarO2), cbx.d(b0kVar2).j, cbx.a(b0kVar2).b.b, new a0e1(3), null, 2, false, new zic0(4), 0, null, b0kVar2, (i2 >> 3) & 14, 0, 1696);
            op71.g(b0kVar2, u291.h(nim0Var, cbx.b(b0kVar2).b.b));
            idx idxVar = new idx(4);
            if (ihc1.y0(str3)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            foo1.c(new gbx(new y50(str3), function0), idxVar, null, null, yla.p(b0kVar2), null, null, null, null, null, apo.r(562727375, new nl41(str3, b2), b0kVar2), b0kVar2, 0, 48, 2012);
            b0kVar2 = b0kVar2;
            cvx cvxVar6 = cbx.b(b0kVar2).b;
            x0d.s(nim0Var, 16.0f, b0kVar2, true);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new mlm(str, str2, str3, str4, function0, qim0Var, i, (byte) 2);
        }
    }

    public static final String f() {
        w6b1 w6b1VarA = f7b1.a(blc0.R2);
        String str = w6b1VarA != null ? (String) o7h.s0(w6b1VarA.c) : null;
        return str == null ? "" : str;
    }

    public static final void g(bfn0 bfn0Var, pim0 pim0Var) {
        bfn0 bfn0VarA = B(pim0Var).A();
        int i = bfn0VarA.c - 1;
        Object[] objArr = bfn0VarA.a;
        if (i < objArr.length) {
            while (i >= 0) {
                bfn0Var.b((pim0) ((hmb0) objArr[i]).e1.g);
                i--;
            }
        }
    }

    public static final zlb0 h(pim0 pim0Var) {
        if ((pim0Var.c & 2) != 0) {
            if (pim0Var instanceof zlb0) {
                return (zlb0) pim0Var;
            }
            if (pim0Var instanceof l5t) {
                pim0 pim0Var2 = ((l5t) pim0Var).P0;
                while (pim0Var2 != null) {
                    if (pim0Var2 instanceof zlb0) {
                        return (zlb0) pim0Var2;
                    }
                    pim0Var2 = (!(pim0Var2 instanceof l5t) || (pim0Var2.c & 2) == 0) ? pim0Var2.f : ((l5t) pim0Var2).P0;
                }
            }
        }
        return null;
    }

    public static lik1 i(String str) {
        return new lik1(str);
    }

    public static final are0 j(are0 are0Var) {
        xoe0 xoe0Var = are0Var.a;
        if (are0Var.b instanceof jwq0) {
            return are0Var;
        }
        return new are0(xoe0Var, jwq0.b, fap1.e(xoe0Var));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public static final void k(x4t x4tVar) throws KotlinNothingValueException {
        ha4 ha4VarC = C(x4tVar);
        Class cls = ha4.j2;
        ViewTreeObserver viewTreeObserver = ha4VarC.getViewTreeObserver();
        try {
            Method declaredMethod = ha4.o2;
            if (declaredMethod == null) {
                declaredMethod = viewTreeObserver.getClass().getDeclaredMethod("dispatchOnScrollChanged", null);
                declaredMethod.setAccessible(true);
                ha4.o2 = declaredMethod;
            }
            declaredMethod.invoke(viewTreeObserver, null);
        } catch (Exception unused) {
        }
    }

    public static final rrb0 l(x4t x4tVar) {
        jdo0 jdo0Var;
        sim0 sim0Var;
        pim0 pim0Var = (pim0) x4tVar;
        if (!pim0Var.a.N0) {
            qf80.c("visitAncestors called on an unattached node");
        }
        sim0 sim0Var2 = pim0Var.a.e;
        hmb0 hmb0VarB = B(x4tVar);
        loop0: while (hmb0VarB != null) {
            if ((((pim0) hmb0VarB.e1.g).d & 8388640) != 0) {
                while (sim0Var2 != null) {
                    int i = ((pim0) sim0Var2).c;
                    if ((i & 8388640) != 0) {
                        if ((8388608 & i) != 0) {
                            if (!(sim0Var2 instanceof rrb0)) {
                                if (sim0Var2 instanceof l5t) {
                                    sim0Var2 = null;
                                    for (sim0 sim0Var3 = ((l5t) sim0Var2).P0; sim0Var3 != null; sim0Var3 = ((pim0) sim0Var3).f) {
                                        if (sim0Var3 instanceof rrb0) {
                                            sim0Var2 = sim0Var3;
                                        }
                                    }
                                } else {
                                    sim0Var2 = null;
                                }
                            }
                            rrb0 rrb0Var = (rrb0) sim0Var2;
                            if (rrb0Var != null) {
                                return rrb0Var;
                            }
                        } else if ((i & 32) == 0) {
                            continue;
                        } else {
                            if (sim0Var2 instanceof sim0) {
                                sim0Var = sim0Var2;
                            } else if (sim0Var2 instanceof l5t) {
                                sim0Var = null;
                                for (sim0 sim0Var4 = ((l5t) sim0Var2).P0; sim0Var4 != null; sim0Var4 = ((pim0) sim0Var4).f) {
                                    if (sim0Var4 instanceof sim0) {
                                        sim0Var = sim0Var4;
                                    }
                                }
                            } else {
                                sim0Var = null;
                            }
                            sim0 sim0Var5 = sim0Var;
                            if (sim0Var5 != null) {
                                j2h1 j2h1VarU = sim0Var5.U();
                                yky0 yky0Var = brl.a;
                                if (j2h1VarU.m(yky0Var)) {
                                    return (rrb0) sim0Var5.U().r(yky0Var);
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    sim0Var2 = ((pim0) sim0Var2).e;
                }
            }
            hmb0VarB = hmb0VarB.v();
            sim0Var2 = (hmb0VarB == null || (jdo0Var = hmb0VarB.e1) == null) ? null : (gpd1) jdo0Var.f;
        }
        return null;
    }

    public static final boolean m(pim0 pim0Var, int i) {
        return (pim0Var.a.d & i) != 0;
    }

    public static final boolean n(l5t l5tVar) {
        return ((pim0) l5tVar).a == l5tVar;
    }

    public static boolean o(String str) {
        return str != null && ((Pattern) lik1.b.getValue()).matcher(str).matches();
    }

    public static final String p(hp80 hp80Var) {
        fp80 fp80VarB = hp80Var.b();
        if (fp80VarB != null) {
            return fp80VarB.b;
        }
        return null;
    }

    public static xxh q(int i) {
        if (i > 0) {
            return new wxh(i);
        }
        return i < 0 ? new txh(Math.abs(i)) : vxh.a;
    }

    public static zok0 r() {
        return new zok0((byte) 3);
    }

    public static final pim0 s(bfn0 bfn0Var) {
        int i;
        if (bfn0Var == null || (i = bfn0Var.c) == 0) {
            return null;
        }
        return (pim0) bfn0Var.l(i - 1);
    }

    public static boolean t(n44 n44Var) {
        return n44Var.a();
    }

    public static final void u(x4t x4tVar) {
        m74 autofillManager;
        hmb0 hmb0VarB = B(x4tVar);
        if (hmb0VarB.U0) {
            return;
        }
        ha4 ha4VarA = kmb0.a(hmb0VarB);
        if (!ha4.c() || (autofillManager = ha4VarA.getAutofillManager()) == null) {
            return;
        }
        Rect rect = autofillManager.f;
        q511 q511Var = autofillManager.d;
        hmb0 hmb0Var = (hmb0) q511Var.a.b(hmb0VarB.b);
        if (hmb0Var == null || hmb0Var.g == -4) {
            return;
        }
        que0 que0Var = q511Var.c;
        int iD = q511Var.d(hmb0Var);
        long[] jArr = (long[]) que0Var.c;
        long j = jArr[iD];
        long j2 = jArr[iD + 1];
        rect.set((int) (j >> 32), (int) j, (int) (j2 >> 32), (int) j2);
        autofillManager.a.g(autofillManager.c, hmb0VarB.b, rect);
    }

    public static final d v(String str, String str2, Map map) {
        d dVarP = WatchFeedRequest.p();
        dVarP.s(str);
        if (str2 != null) {
            dVarP.r(str2);
        }
        dVarP.q(map);
        return dVarP;
    }

    public static final ndo0 w(x4t x4tVar, int i) {
        ndo0 ndo0Var = ((pim0) x4tVar).a.h;
        ndo0Var.getClass();
        if (ndo0Var.f1() != x4tVar || !odo0.g(i)) {
            return ndo0Var;
        }
        ndo0 ndo0Var2 = ndo0Var.X0;
        ndo0Var2.getClass();
        return ndo0Var2;
    }

    public static final wat x(pim0 pim0Var) {
        return B(pim0Var).Z0;
    }

    public static final yd50 y(x4t x4tVar) {
        return C(x4tVar).getGraphicsContext();
    }

    public static final ndo0 z(x4t x4tVar) {
        if (!((pim0) x4tVar).a.N0) {
            qf80.c("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        ndo0 ndo0VarW = w(x4tVar, 2);
        if (!ndo0VarW.f1().N0) {
            qf80.c("LayoutCoordinates is not attached.");
        }
        return ndo0VarW;
    }
}
