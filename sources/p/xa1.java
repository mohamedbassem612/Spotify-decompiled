package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class xa1 implements Update {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v40, types: [p.dwz0, p.fwz0] */
    /* JADX WARN: Type inference failed for: r9v14, types: [p.dwz0] */
    /* JADX WARN: Type inference failed for: r9v15, types: [p.dwz0] */
    /* JADX WARN: Type inference failed for: r9v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v17, types: [p.ewz0] */
    /* JADX WARN: Type inference failed for: r9v19 */
    public final Next a(Object obj, Object obj2) {
        ?? B;
        Object next;
        bb1 bb1Var = (bb1) obj;
        ua1 ua1Var = (wa1) obj2;
        flr0 flr0Var = bb1Var.Y;
        boolean z = bb1Var.c;
        String str = bb1Var.N0;
        String str2 = bb1Var.a;
        iyr0 iyr0Var = bb1Var.b;
        List list = bb1Var.e;
        String str3 = bb1Var.d;
        List list2 = bb1Var.f;
        u380 u380Var = bb1Var.Z;
        if (ua1Var instanceof sa1) {
            String str4 = ((sa1) ua1Var).a;
            if (str4.equals(str3)) {
                return Next.j();
            }
            return ihc1.y0(str4) ? vgp1.a(bb1Var, str4) : vgp1.b(bb1Var, str4);
        }
        if (ua1Var instanceof ua1) {
            String str5 = ua1Var.a;
            return ihc1.y0(str5) ? vgp1.a(bb1Var, str5) : vgp1.b(bb1Var, str5);
        }
        if (ua1Var.equals(ra1.a)) {
            return vgp1.a(bb1Var, "");
        }
        Object obj3 = null;
        if (ua1Var instanceof oa1) {
            oa1 oa1Var = (oa1) ua1Var;
            boolean z2 = oa1Var.b;
            String str6 = oa1Var.a;
            List<ry41> list3 = list;
            ArrayList arrayList = new ArrayList(q7h.U(list3, 10));
            for (ry41 ry41VarA : list3) {
                if (u890.j(ry41VarA.getUri(), str6)) {
                    if (ry41VarA instanceof ry41) {
                        ry41VarA = ry41.a(ry41VarA, z2, false, 1007);
                    } else {
                        if (!(ry41VarA instanceof qy41)) {
                            eg.o();
                            return null;
                        }
                        ry41VarA = qy41.a((qy41) ry41VarA, z2);
                    }
                }
                arrayList.add(ry41VarA);
            }
            return Next.i(bb1.a(bb1Var, null, arrayList, null, false, false, false, null, null, mqo1.H(dm61.x0(str6, u380Var)), null, 12271), Collections.singleton(new t81(str2, z2, str6, oa1Var.c)));
        }
        if (ua1Var.equals(qa1.a)) {
            if (ihc1.y0(str3)) {
                return Next.h(bb1.a(bb1Var, null, null, null, false, false, false, null, new mlr0(3), null, null, 15231));
            }
            return Next.i(bb1.a(bb1Var, null, null, null, true, false, false, null, new mlr0(3), null, null, 15167), Collections.singleton(z ? new l81(str2, str3, flr0Var) : new k81(str2, str3, flr0Var)));
        }
        boolean z3 = ua1Var instanceof ta1;
        z6x z6xVar = z6x.a;
        if (z3) {
            ta1 ta1Var = (ta1) ua1Var;
            return Next.h(bb1.a(bb1Var, null, ta1Var.a, z6xVar, false, false, ta1Var.b, ta1Var.c, new mlr0(3), null, null, 14351));
        }
        boolean z4 = ua1Var instanceof ma1;
        Set setSingleton = w7x.a;
        if (z4) {
            ma1 ma1Var = (ma1) ua1Var;
            boolean z5 = ma1Var.b;
            List list4 = ma1Var.a;
            List<ry41> list5 = list;
            ArrayList arrayList2 = new ArrayList(q7h.U(list5, 10));
            for (ry41 ry41VarA2 : list5) {
                if (list4.contains(ry41VarA2.getUri())) {
                    if (ry41VarA2 instanceof ry41) {
                        ry41VarA2 = ry41.a(ry41VarA2, z5, false, 1007);
                    } else {
                        if (!(ry41VarA2 instanceof qy41)) {
                            eg.o();
                            return null;
                        }
                        ry41VarA2 = qy41.a((qy41) ry41VarA2, z5);
                    }
                } else if (ry41VarA2 instanceof ry41) {
                    ry41 ry41Var = ry41VarA2;
                    if (o7h.i0(list4, ry41Var.h)) {
                        ry41VarA2 = ry41.a(ry41Var, false, z5, 767);
                    }
                }
                arrayList2.add(ry41VarA2);
            }
            if (ma1Var.d) {
                setSingleton = Collections.singleton(new s81(ma1Var.c, z5));
            }
            return Next.i(bb1.a(bb1Var, null, arrayList2, null, false, false, false, null, null, mqo1.H(dm61.v0(u380Var, o7h.p1(list4))), null, 12271), setSingleton);
        }
        if (ua1Var instanceof na1) {
            na1 na1Var = (na1) ua1Var;
            String str7 = na1Var.a;
            List<ry41> list6 = list;
            ArrayList arrayList3 = new ArrayList(q7h.U(list6, 10));
            for (ry41 ry41VarA3 : list6) {
                if (u890.j(ry41VarA3.getUri(), str7)) {
                    if (ry41VarA3 instanceof ry41) {
                        ry41 ry41Var2 = ry41VarA3;
                        ry41VarA3 = ry41.a(ry41Var2, !ry41Var2.e, false, 1007);
                    } else {
                        if (!(ry41VarA3 instanceof qy41)) {
                            eg.o();
                            return null;
                        }
                        qy41 qy41Var = (qy41) ry41VarA3;
                        ry41VarA3 = qy41.a(qy41Var, !qy41Var.e);
                    }
                }
                arrayList3.add(ry41VarA3);
            }
            return Next.i(bb1.a(bb1Var, null, arrayList3, null, false, false, false, null, null, mqo1.H(dm61.u0(str7, u380Var)), null, 12271), Collections.singleton(new r81(str7, na1Var.b)));
        }
        boolean z6 = ua1Var instanceof ha1;
        g4a g4aVar = g4a.d;
        if (z6) {
            String str8 = ((ha1) ua1Var).a;
            if (u380Var.contains(str8)) {
                return Next.j();
            }
            for (Object obj4 : list2) {
                if (u890.j(((fwz0) obj4).getUri(), str8)) {
                    obj3 = obj4;
                    break;
                }
            }
            fwz0 fwz0Var = (fwz0) obj3;
            if (fwz0Var == null) {
                return Next.j();
            }
            if (iyr0Var == iyr0.a && (fwz0Var instanceof dwz0)) {
                dwz0 dwz0Var = (dwz0) fwz0Var;
                if (dwz0Var.c != g4aVar) {
                    return Next.h(bb1.a(bb1Var, null, null, null, false, false, false, null, null, null, dwz0Var.b, 8191));
                }
            }
            return vgp1.c(bb1Var, fwz0Var);
        }
        if (ua1Var instanceof la1) {
            String str9 = ((la1) ua1Var).a;
            for (Object obj5 : list2) {
                if (u890.j(((fwz0) obj5).getUri(), str9)) {
                    dwz0 dwz0Var2 = ((ewz0) obj5).d;
                    g4a g4aVar2 = dwz0Var2 != null ? dwz0Var2.c : null;
                    if (g4aVar2 != null) {
                        return Next.a(Collections.singleton(new q81(str9, iyr0Var, g4aVar2)));
                    }
                    Logger.k("Artist missing when handling information button click.", new Object[0]);
                    return Next.j();
                }
            }
            bhn0.t("Collection contains no element matching the predicate.");
            return null;
        }
        if (ua1Var.equals(fa1.a)) {
            if (str == null) {
                return Next.j();
            }
            bb1 bb1VarA = bb1.a(bb1Var, null, null, null, false, false, false, null, null, null, null, 8191);
            Iterator it = list2.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!u890.j(((fwz0) next).getUri(), str));
            ?? r1 = next instanceof dwz0 ? (dwz0) next : null;
            return (r1 == 0 || r1.c == g4aVar) ? Next.h(bb1VarA) : vgp1.c(bb1VarA, (fwz0) r1);
        }
        if (ua1Var.equals(ea1.a)) {
            return str == null ? Next.j() : Next.h(bb1.a(bb1Var, null, null, null, false, false, false, null, null, null, null, 8191));
        }
        if (ua1Var instanceof ja1) {
            ja1 ja1Var = (ja1) ua1Var;
            String str10 = ja1Var.a;
            if (u380Var.contains(str10)) {
                return Next.j();
            }
            for (Object obj6 : list2) {
                if (u890.j(((fwz0) obj6).getUri(), str10)) {
                    obj3 = obj6;
                    break;
                }
            }
            fwz0 fwz0Var2 = (fwz0) obj3;
            return fwz0Var2 == null ? Next.j() : Next.i(bb1.a(bb1Var, null, null, null, false, false, false, null, null, mqo1.H(dm61.x0(str10, u380Var)), null, 12287), Collections.singleton(new u81(bb1Var.a, ja1Var.a, ja1Var.b, fwz0Var2.a(), false)));
        }
        if (!(ua1Var instanceof ia1)) {
            if (ua1Var instanceof ga1) {
                String str11 = ((ga1) ua1Var).a;
                return Next.i(bb1.a(bb1Var, null, null, null, false, false, false, null, null, mqo1.H(dm61.u0(str11, u380Var)), null, 12287), Collections.singleton(new o81(str11)));
            }
            if (ua1Var instanceof ka1) {
                return Next.h(bb1.a(bb1Var, null, null, null, false, true, false, null, new mlr0(3), null, null, 15167));
            }
            if (ua1Var.equals(ba1.a)) {
                String str12 = bb1Var.t;
                if (str12 == null || bb1Var.X.a || ihc1.y0(str3)) {
                    return Next.j();
                }
                return Next.i(bb1.a(bb1Var, null, null, null, false, false, false, null, new mlr0(2), null, null, 15359), Collections.singleton(z ? new n81(str2, str3, str12, flr0Var) : new m81(str2, str3, str12, flr0Var)));
            }
            if (ua1Var instanceof da1) {
                da1 da1Var = (da1) ua1Var;
                return Next.h(bb1.a(bb1Var, null, o7h.N0(da1Var.a, list), null, false, false, false, da1Var.b, new mlr0(3), null, null, 14831));
            }
            if (ua1Var instanceof ca1) {
                return Next.h(bb1.a(bb1Var, null, null, null, false, false, false, null, new mlr0(1), null, null, 15359));
            }
            if (ua1Var instanceof va1) {
                va1 va1Var = (va1) ua1Var;
                return Next.h(bb1.a(bb1Var, null, z6xVar, va1Var.a, false, false, va1Var.b, va1Var.c, new mlr0(3), null, null, 14351));
            }
            if (ua1Var instanceof pa1) {
                pa1 pa1Var = (pa1) ua1Var;
                return Next.h(bb1.a(bb1Var, null, null, o7h.N0(pa1Var.a, list2), false, false, false, pa1Var.b, new mlr0(3), null, null, 14815));
            }
            eg.o();
            return null;
        }
        ia1 ia1Var = (ia1) ua1Var;
        g4a g4aVar3 = ia1Var.c;
        Set setP1 = o7h.p1(ia1Var.b);
        String str13 = ia1Var.a;
        LinkedHashSet linkedHashSetX0 = dm61.x0(str13, setP1);
        List<fwz0> list7 = list2;
        ArrayList arrayList4 = new ArrayList(q7h.U(list7, 10));
        for (fwz0 fwz0Var3 : list7) {
            if (fwz0Var3 instanceof ewz0) {
                B = (ewz0) fwz0Var3;
                dwz0 dwz0VarB = B.d;
                String str14 = B.b;
                boolean zContains = linkedHashSetX0.contains(str14);
                boolean zI0 = o7h.i0(linkedHashSetX0, dwz0VarB != null ? dwz0VarB.b : null);
                if (zContains || zI0) {
                    g4a g4aVar4 = zContains ? g4aVar3 : B.c;
                    if (dwz0VarB == null) {
                        dwz0VarB = null;
                    } else if (zI0) {
                        dwz0VarB = dwz0.b(dwz0VarB, g4aVar3);
                    }
                    B = new ewz0(B.a, str14, g4aVar4, dwz0VarB);
                }
            } else {
                if (!(fwz0Var3 instanceof dwz0)) {
                    eg.o();
                    return null;
                }
                B = (dwz0) fwz0Var3;
                if (linkedHashSetX0.contains(B.b)) {
                    B = dwz0.b(B, g4aVar3);
                }
            }
            arrayList4.add(B);
        }
        g4a g4aVarD = ilo1.D(iyr0Var);
        if (ia1Var.e && g4aVar3 == g4aVarD) {
            setSingleton = Collections.singleton(new p81(str13, g4aVar3, ia1Var.d));
        }
        return Next.i(bb1.a(bb1Var, null, null, arrayList4, false, false, false, null, null, mqo1.H(dm61.u0(str13, u380Var)), null, 12255), setSingleton);
    }
}
