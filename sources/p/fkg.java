package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class fkg implements Update {
    public final Next a(Object obj, Object obj2) {
        String str;
        fbp1 fbp1Var;
        ssa ssaVar = (ssa) obj;
        fsa fsaVar = (fsa) obj2;
        ebp1 ebp1Var = ssaVar.e;
        ebp1 ebp1Var2 = ssaVar.d;
        ucp1 ucp1Var = ssaVar.c;
        int i = ssaVar.a;
        int i2 = ssaVar.b;
        fbp1 ksaVar = ssaVar.f;
        if (fsaVar instanceof vuy0) {
            return i == 1 ? Next.i(ssa.a(ssaVar, 2, 0, null, null, null, null, 62), Collections.singleton(new yzk())) : Next.j();
        }
        boolean z = fsaVar instanceof bbl;
        bz10 bz10Var = bz10.c;
        ucp1 psaVar = qsa.d;
        osa osaVar = osa.d;
        v020 v020Var = v020.c;
        hsa hsaVar = hsa.c;
        isa isaVar = isa.c;
        lsa lsaVar = lsa.c;
        if (z) {
            kbl kblVar = ((bbl) fsaVar).a;
            boolean z2 = kblVar instanceof ibl;
            int i3 = z2 ? 3 : 1;
            if (i3 == i) {
                return Next.j();
            }
            boolean z3 = kblVar instanceof jbl;
            if (z3 && ((jbl) kblVar).a == 2 && i2 < 5) {
                int i4 = i2 + 1;
                return Next.i(ssa.a(ssaVar, 0, i4, null, null, null, null, 61), Collections.singleton(new yzk(((long) i4) * 1000)));
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            boolean z4 = ucp1Var instanceof rsa;
            if (z4 && z2) {
                linkedHashSet.add(v020Var);
                ucp1Var = osaVar;
            } else if (z4 && z3) {
                jbl jblVar = (jbl) kblVar;
                linkedHashSet.add(new w2d1(new b231(2, jblVar.a, jblVar.b)));
                ucp1Var = psaVar;
            }
            boolean z5 = ebp1Var2 instanceof jsa;
            if (z5 && z2) {
                linkedHashSet.add(bz10Var);
                ebp1Var2 = hsaVar;
            } else if (z5 && z3) {
                jbl jblVar2 = (jbl) kblVar;
                linkedHashSet.add(new ysa(new b231(2, jblVar2.a, jblVar2.b)));
                ebp1Var2 = isaVar;
            }
            boolean z6 = ebp1Var instanceof jsa;
            if (z6 && z2) {
                linkedHashSet.add(u020.c);
                ebp1Var = hsaVar;
            } else if (z6 && z3) {
                jbl jblVar3 = (jbl) kblVar;
                linkedHashSet.add(new zoc1(new b231(2, jblVar3.a, jblVar3.b)));
                ebp1Var = isaVar;
            }
            boolean z7 = ksaVar instanceof nsa;
            if (!z7 || !z2) {
                if (z7 && z3) {
                    jbl jblVar4 = (jbl) kblVar;
                    linkedHashSet.add(new zjb0(((nsa) ksaVar).c, new b231(2, jblVar4.a, jblVar4.b)));
                    fbp1Var = lsaVar;
                }
                return Next.i(ssa.a(ssaVar, i3, 0, ucp1Var, ebp1Var2, ebp1Var, fbp1Var, 2), linkedHashSet);
            }
            pta ptaVar = ((nsa) ksaVar).c;
            linkedHashSet.add(new jz10(ptaVar));
            ksaVar = new ksa(ptaVar);
            fbp1Var = ksaVar;
            return Next.i(ssa.a(ssaVar, i3, 0, ucp1Var, ebp1Var2, ebp1Var, fbp1Var, 2), linkedHashSet);
        }
        boolean z8 = fsaVar instanceof v2d1;
        rsa rsaVar = rsa.d;
        if (z8) {
            if (ucp1Var instanceof psa) {
                return Next.a(Collections.singleton(new w2d1(new v231(((psa) ucp1Var).d))));
            }
            if ((ucp1Var instanceof osa) || (ucp1Var instanceof rsa)) {
                return Next.h(ssa.a(ssaVar, 0, 0, null, null, null, null, 61));
            }
            if (i == 1) {
                return Next.i(ssa.a(ssaVar, 2, 0, rsaVar, null, null, null, 56), Collections.singleton(new yzk()));
            }
            return i == 2 ? Next.h(ssa.a(ssaVar, 0, 0, rsaVar, null, null, null, 57)) : Next.i(ssa.a(ssaVar, 0, 0, osaVar, null, null, null, 57), Collections.singleton(v020Var));
        }
        if (fsaVar instanceof u2d1) {
            u2d1 u2d1Var = (u2d1) fsaVar;
            j331 j331Var = u2d1Var.a;
            if (!(ucp1Var instanceof osa)) {
                Logger.d("Received " + u2d1Var + " that doesn't match the current supported status " + ucp1Var, new Object[0]);
                return Next.j();
            }
            if (i2 < 5 && pzs0.b(j331Var)) {
                int i5 = 1 + i2;
                return Next.i(ssa.a(ssaVar, 2, i5, rsaVar, null, null, null, 56), Collections.singleton(new yzk(((long) i5) * 1000)));
            }
            if (j331Var instanceof v231) {
                psaVar = new psa((t2d1) ((v231) j331Var).a);
            }
            return Next.i(ssa.a(ssaVar, 0, 0, psaVar, null, null, null, 59), Collections.singleton(new w2d1(j331Var)));
        }
        if (fsaVar instanceof yjb0) {
            pta ptaVar2 = ((yjb0) fsaVar).a;
            if (u890.j(ksaVar, lsaVar)) {
                if (i == 1) {
                    return Next.i(ssa.a(ssaVar, 2, 0, null, null, null, new nsa(ptaVar2), 28), Collections.singleton(new yzk()));
                }
                return i == 2 ? Next.h(ssa.a(ssaVar, 0, 0, null, null, null, new nsa(ptaVar2), 29)) : Next.i(ssa.a(ssaVar, 0, 0, null, null, null, new ksa(ptaVar2), 29), Collections.singleton(new jz10(ptaVar2)));
            }
            pta ptaVarA = pzs0.a(ksaVar);
            if (u890.j(ptaVarA, ptaVar2)) {
                Logger.g("Trying to launch the same flow again: " + ptaVarA, new Object[0]);
                return Next.j();
            }
            Logger.d("Trying to launch flow with " + ptaVar2 + ", different from the current " + ptaVarA, new Object[0]);
            return Next.a(Collections.singleton(new zjb0(ptaVar2, z131.a)));
        }
        if (fsaVar instanceof wjb0) {
            pta ptaVar3 = ((wjb0) fsaVar).a;
            pta ptaVarA2 = pzs0.a(ksaVar);
            if (u890.j(ptaVarA2, ptaVar3)) {
                return Next.i(ssa.a(ssaVar, 0, 0, null, null, null, lsaVar, 31), f46.S0(new cbp1[]{ugd.c, new zjb0(ptaVarA2, c331.a)}));
            }
            Logger.k("Trying to cancel a launch flow with " + ptaVar3 + ", different from the current " + ptaVarA2, new Object[0]);
            return Next.j();
        }
        if (fsaVar instanceof xjb0) {
            xjb0 xjb0Var = (xjb0) fsaVar;
            if (!(ksaVar instanceof ksa)) {
                Logger.d("Received " + xjb0Var + " that doesn't match the current launching flow status " + ksaVar, new Object[0]);
                return Next.j();
            }
            pta ptaVar4 = ((ksa) ksaVar).c;
            usw0 usw0Var = ptaVar4.b;
            int i6 = usw0Var.a;
            int i7 = xjb0Var.a;
            j331 j331Var2 = xjb0Var.b;
            j331 j331Var3 = xjb0Var.c;
            if (i6 != i7) {
                Logger.g("Skipping fetched purchases with type " + lzu0.l(i7) + ", different from current " + lzu0.l(i6), new Object[0]);
                return Next.j();
            }
            if (!(j331Var3 instanceof v231)) {
                if (j331Var3 instanceof c331) {
                    return Next.i(ssa.a(ssaVar, 0, 0, null, null, null, lsaVar, 31), Collections.singleton(new zjb0(ptaVar4, j331Var3)));
                }
                if (j331Var3 instanceof i231) {
                    return Next.i(ssa.a(ssaVar, 0, 0, null, null, null, lsaVar, 31), Collections.singleton(new zjb0(ptaVar4, j331Var3)));
                }
                eg.o();
                return null;
            }
            String str2 = (String) ((v231) j331Var3).a;
            if (!(j331Var2 instanceof v231)) {
                if (j331Var2 instanceof c331) {
                    return Next.i(ssa.a(ssaVar, 0, 0, null, null, null, lsaVar, 31), Collections.singleton(new zjb0(ptaVar4, j331Var2)));
                }
                if (!(j331Var2 instanceof i231)) {
                    eg.o();
                    return null;
                }
                if (i2 >= 5 || !pzs0.b(j331Var2)) {
                    return Next.i(ssa.a(ssaVar, 0, 0, null, null, null, lsaVar, 31), Collections.singleton(new zjb0(ptaVar4, j331Var2)));
                }
                int i8 = 1 + i2;
                return Next.i(ssa.a(ssaVar, 2, i8, null, null, null, new nsa(ptaVar4), 28), Collections.singleton(new yzk(((long) i8) * 1000)));
            }
            List list = (List) ((v231) j331Var2).a;
            boolean z9 = list instanceof Collection;
            if (!z9 || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!u890.j(((uuy0) it.next()).d, str2)) {
                        return Next.i(ssa.a(ssaVar, 0, 0, null, null, null, lsaVar, 31), Collections.singleton(new zjb0(ptaVar4, a231.a)));
                    }
                }
            }
            if ((usw0Var instanceof usw0) && (str = usw0Var.d) != null) {
                if (!z9 || !list.isEmpty()) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (u890.j(((uuy0) it2.next()).a, str)) {
                        }
                    }
                }
                return Next.i(ssa.a(ssaVar, 0, 0, null, null, null, lsaVar, 31), Collections.singleton(new zjb0(ptaVar4, g231.a)));
            }
            return Next.i(ssa.a(ssaVar, 0, 0, null, null, null, new msa(ptaVar4), 31), Collections.singleton(new vjb0(ptaVar4, str2)));
        }
        if (fsaVar instanceof zu20) {
            zu20 zu20Var = (zu20) fsaVar;
            pta ptaVar5 = zu20Var.a;
            if (ksaVar instanceof msa) {
                pta ptaVar6 = ((msa) ksaVar).c;
                j331 j331Var4 = zu20Var.b;
                if (ptaVar6.equals(ptaVar5)) {
                    if (i2 >= 5 || !pzs0.b(j331Var4)) {
                        return Next.i(ssa.a(ssaVar, 0, 0, null, null, null, lsaVar, 31), Collections.singleton(new zjb0(ptaVar6, j331Var4)));
                    }
                    int i9 = 1 + i2;
                    return Next.i(ssa.a(ssaVar, 2, i9, null, null, null, new nsa(ptaVar5), 28), Collections.singleton(new yzk(((long) i9) * 1000)));
                }
            }
            Logger.d("Received " + zu20Var + " that doesn't match the currently launching flow " + pzs0.a(ksaVar), new Object[0]);
            return Next.j();
        }
        boolean z10 = fsaVar instanceof xsa;
        jsa jsaVar = jsa.c;
        if (z10) {
            if ((ebp1Var2 instanceof hsa) || (ebp1Var2 instanceof jsa)) {
                return Next.h(ssa.a(ssaVar, 0, 0, null, null, null, null, 61));
            }
            if (i == 1) {
                return Next.i(ssa.a(ssaVar, 2, 0, null, jsaVar, null, null, 52), Collections.singleton(new yzk()));
            }
            return i == 2 ? Next.h(ssa.a(ssaVar, 0, 0, null, jsaVar, null, null, 53)) : Next.i(ssa.a(ssaVar, 0, 0, null, hsaVar, null, null, 53), Collections.singleton(bz10Var));
        }
        if (fsaVar instanceof wsa) {
            wsa wsaVar = (wsa) fsaVar;
            j331 j331Var5 = wsaVar.a;
            if (ebp1Var2 instanceof hsa) {
                if (i2 >= 5 || !pzs0.b(j331Var5)) {
                    return Next.i(ssa.a(ssaVar, 0, 0, null, isaVar, null, null, 55), Collections.singleton(new ysa(j331Var5)));
                }
                int i10 = 1 + i2;
                return Next.i(ssa.a(ssaVar, 2, i10, null, jsaVar, null, null, 52), Collections.singleton(new yzk(((long) i10) * 1000)));
            }
            Logger.d("Received " + wsaVar + " that doesn't match the current billing config status " + ebp1Var2, new Object[0]);
            return Next.j();
        }
        if (!(fsaVar instanceof yoc1)) {
            eg.o();
            return null;
        }
        yoc1 yoc1Var = (yoc1) fsaVar;
        j331 j331Var6 = yoc1Var.a;
        if (ebp1Var instanceof hsa) {
            if (i2 >= 5 || !pzs0.b(j331Var6)) {
                return Next.i(ssa.a(ssaVar, 0, 0, null, null, isaVar, null, 47), Collections.singleton(new zoc1(j331Var6)));
            }
            int i11 = 1 + i2;
            return Next.i(ssa.a(ssaVar, 2, i11, null, null, jsaVar, null, 44), Collections.singleton(new yzk(((long) i11) * 1000)));
        }
        Logger.d("Received " + yoc1Var + " that doesn't match the current subscriptions status " + ebp1Var, new Object[0]);
        return Next.j();
    }
}
