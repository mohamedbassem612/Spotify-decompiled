package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.coroutines.b;
import com.spotify.playlistmixing.endpoints.MixingReorderingError;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ltv extends hab0 implements vu30 {
    public final /* synthetic */ mtv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ltv(mtv mtvVar) {
        super(2);
        this.a = mtvVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        dtv dtvVar = this.a.f;
        final wcr wcrVar = dtvVar.b;
        Update update = new Update() { // from class: p.atv
            public final Next a(Object obj3, Object obj4) {
                Object grvVar;
                boolean z;
                boolean z2;
                htv htvVarM = (htv) obj3;
                usv usvVar = (usv) obj4;
                gtv gtvVar = htvVarM.h;
                c380 c380Var = htvVarM.l;
                etv etvVar = htvVarM.j;
                int i = etvVar.a;
                List list = etvVar.g;
                boolean z3 = htvVarM.c;
                if (usvVar instanceof nsv) {
                    nsv nsvVar = (nsv) usvVar;
                    return z3 ? Next.j() : Next.h(oqn1.i(htvVarM, new aom0(nsvVar.b, nsvVar.a)));
                }
                if (usvVar instanceof xrv) {
                    zwa zwaVar = (zwa) wcrVar.b;
                    xrv xrvVar = (xrv) usvVar;
                    if (z3) {
                        return Next.j();
                    }
                    htv htvVarA = ((jtv) zwaVar.b).a(htvVarM, xrvVar.a);
                    htv htvVarM2 = oqn1.m(htvVarA, htvVarA.j);
                    return Next.i(htvVarM2, Collections.singleton(new hrv(htvVarM2.l, null, 4)));
                }
                if (usvVar instanceof zrv) {
                    zrv zrvVar = (zrv) usvVar;
                    if (z3) {
                        return Next.j();
                    }
                    Set set = zrvVar.a;
                    ArrayList arrayList = new ArrayList(q7h.U(set, 10));
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((ftv) it.next()).a);
                    }
                    return Next.h(oqn1.i(htvVarM, new r8t(o7h.p1(arrayList), null)));
                }
                if (usvVar instanceof vrv) {
                    return htvVarM.n ? Next.h(htv.a(htvVarM, false, false, true, null, null, null, null, null, null, 4087)) : Next.a(Collections.singleton(new arv(null, null, null, 7)));
                }
                if (usvVar instanceof rsv) {
                    if (z3) {
                        return Next.j();
                    }
                    List list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            if (((ilq0) it2.next()) instanceof bhk0) {
                                List list3 = htvVarM.k;
                                if (!gtvVar.h) {
                                    List list4 = list3;
                                    r561 r561VarA = j2h1.A((vu30) z561.n0(new i46(list4, (byte) 1)).b);
                                    while (r561VarA.hasNext()) {
                                        mmr0 mmr0Var = (mmr0) r561VarA.next();
                                        if (((Number) mmr0Var.a).intValue() > ((Number) mmr0Var.b).intValue()) {
                                            r561 r561VarA2 = j2h1.A((vu30) z561.n0(new i46(list4, (byte) 1)).b);
                                            while (r561VarA2.hasNext()) {
                                                mmr0 mmr0Var2 = (mmr0) r561VarA2.next();
                                                if (((Number) mmr0Var2.a).intValue() < ((Number) mmr0Var2.b).intValue()) {
                                                    return Next.h(htv.a(htvVarM, false, false, false, null, gtv.a(gtvVar, false, false, true, null, false, 1015), null, null, null, null, 3967));
                                                }
                                            }
                                            break;
                                        }
                                    }
                                    break;
                                }
                                break;
                            }
                        }
                    }
                    return w361.q(htvVarM);
                }
                if (usvVar instanceof qsv) {
                    if (z3 || !(z2 = etvVar.e)) {
                        return Next.j();
                    }
                    if (z2) {
                        htvVarM = oqn1.m(htvVarM, etv.a(etvVar, i + 1, null, null, 6));
                    }
                    return Next.h(htvVarM);
                }
                if (usvVar instanceof ssv) {
                    if (z3 || !(z = etvVar.d)) {
                        return Next.j();
                    }
                    if (z) {
                        htvVarM = oqn1.m(htvVarM, etv.a(etvVar, i - 1, null, null, 6));
                    }
                    return Next.h(htvVarM);
                }
                if (usvVar instanceof osv) {
                    return Next.i(htv.a(htvVarM, false, false, false, null, null, null, new etv(3, c380Var), null, null, 3563), Collections.singleton(((osv) usvVar).a));
                }
                if (usvVar instanceof yrv) {
                    return Next.h(htv.a(htvVarM, false, false, false, null, null, null, null, null, null, 4094));
                }
                if (usvVar instanceof gsv) {
                    gsv gsvVar = (gsv) usvVar;
                    MixingReorderingError mixingReorderingError = gsvVar.a;
                    int i2 = gsvVar.b;
                    htv htvVarA2 = htv.a(htvVarM, false, i2 != 2 ? z3 : false, false, null, gtv.a(gtvVar, false, false, false, null, false, 1021), null, null, null, null, 3963);
                    if (i2 == 2 && u890.j(mixingReorderingError, MixingReorderingError.RevisionConflict.a)) {
                        grvVar = new arv(2131955226, null, null, 6);
                    } else if (i2 == 2 && u890.j(mixingReorderingError, MixingReorderingError.TrackLimitExceeded.a)) {
                        grvVar = new arv(2131955227, null, null, 6);
                    } else {
                        grvVar = u890.j(mixingReorderingError, MixingReorderingError.TrackLimitExceeded.a) ? new grv(2) : new grv(1);
                    }
                    return Next.i(htvVarA2, Collections.singleton(grvVar));
                }
                if (usvVar instanceof lsv) {
                    lsv lsvVar = (lsv) usvVar;
                    ArrayList arrayList2 = lsvVar.c;
                    ArrayList arrayList3 = new ArrayList(q7h.U(c380Var, 10));
                    Iterator it3 = c380Var.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(((ftv) it3.next()).a);
                    }
                    boolean zEquals = arrayList2.equals(arrayList3);
                    htv htvVarI = oqn1.i(htvVarM, new bhk0(lsvVar.a, arrayList2, lsvVar.b, lsvVar.d.a));
                    return Next.h(htv.a(htvVarI, false, false, false, null, gtv.a(htvVarI.h, false, !zEquals, false, null, zEquals, 953), null, null, null, null, 3967));
                }
                if (usvVar instanceof asv) {
                    return Next.a(Collections.singleton(new grv(1)));
                }
                if (usvVar instanceof bsv) {
                    List list5 = ((bsv) usvVar).a;
                    int size = i - list5.size();
                    return Next.i(htv.a(htvVarM, false, false, false, null, null, null, new etv(list5.size(), list5, size > 0 ? oqn1.m(htvVarM, etv.a(etvVar, size, null, null, 6)).l : etvVar.c), null, null, 3579), Collections.singleton(new grv(1)));
                }
                if (usvVar instanceof ksv) {
                    return gtvVar.b ? Next.j() : Next.i(htv.a(htvVarM, false, false, false, null, gtv.a(gtvVar, true, false, false, null, false, 1021), null, null, null, null, 3967), Collections.singleton(new brv(c380Var, list, ((ksv) usvVar).a)));
                }
                if (usvVar instanceof tsv) {
                    int iC = l1d.C(((tsv) usvVar).a);
                    if (iC == 0) {
                        return Next.i(htv.a(htvVarM, false, false, false, null, null, null, null, null, null, 4087), Collections.singleton(new arv(null, null, null, 7)));
                    }
                    if (iC == 1) {
                        return Next.h(htv.a(htvVarM, false, false, false, null, null, null, null, null, null, 4087));
                    }
                    eg.o();
                    return null;
                }
                if (usvVar instanceof msv) {
                    msv msvVar = (msv) usvVar;
                    return Next.a(Collections.singleton(new crv(c4p1.s(htvVarM, msvVar.a), c4p1.s(htvVarM, msvVar.b), msvVar.c)));
                }
                if (usvVar instanceof psv) {
                    return Next.h(htv.a(htvVarM, false, false, false, null, gtv.a(gtvVar, false, false, false, null, false, 1019), null, null, null, null, 3967));
                }
                if (usvVar instanceof wrv) {
                    return Next.a(Collections.singleton(new hrv(c380Var, Integer.valueOf(((wrv) usvVar).a), 2)));
                }
                if (usvVar instanceof hsv) {
                    return Next.h(htv.a(htvVarM, false, false, false, null, gtv.a(gtvVar, false, false, false, null, false, 959), null, null, null, null, 3967));
                }
                if (usvVar instanceof isv) {
                    return Next.h(htv.a(htvVarM, false, false, false, null, gtv.a(gtvVar, false, false, false, null, false, 1015), null, null, null, null, 3967));
                }
                if (usvVar instanceof jsv) {
                    return w361.q(htv.a(htvVarM, false, false, false, null, gtv.a(gtvVar, false, false, false, null, false, 1015), null, null, null, null, 3967));
                }
                if (!(usvVar instanceof fsv)) {
                    eg.o();
                    return null;
                }
                esv esvVar = ((fsv) usvVar).a;
                boolean zEquals2 = esvVar.equals(dsv.a);
                drv drvVar = drv.a;
                if (zEquals2) {
                    return Next.i(htv.a(htvVarM, false, false, false, null, gtv.a(gtvVar, false, false, false, null, false, 1007), null, null, null, null, 3967), Collections.singleton(drvVar));
                }
                if (esvVar instanceof csv) {
                    return Next.i(htv.a(htvVarM, false, false, false, null, gtv.a(gtvVar, true, false, false, null, false, 1005), null, null, null, null, 3967), f46.S0(new irv[]{drvVar, new brv(c380Var, list, ((csv) esvVar).a)}));
                }
                eg.o();
                return null;
            }
        };
        urv urvVar = dtvVar.a;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        i09 i09Var = urvVar.b;
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        prv prvVar = new prv(i09Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(erv.class), runSequentially.a(prvVar));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(crv.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new krv(urvVar.e)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(hrv.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new lrv(urvVar.f)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(arv.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new mrv(urvVar.a)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(frv.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new rrv(urvVar.g)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(brv.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new trv(urvVar.d)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(grv.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new nrv(urvVar.h)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(drv.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new jrv(urvVar.i)));
        MobiusLoop.Builder builderD = Mobius.d(update, new a(urvVar.c, coroutinesSubtypeEffectHandlerBuilderI));
        wsv wsvVar = dtvVar.d;
        ((cir0) obj2).j(new pd8(wsvVar, (byte) 6));
        FlowEventSources.Companion companion = FlowEventSources.a;
        q8n q8nVar = wsvVar.c;
        mr20[] mr20VarArr = {wsvVar.d, new lt20(new x3s(wsvVar.b.b, (byte) 15), new re1(3, (lnm) null, (byte) 22), (byte) 0)};
        companion.getClass();
        return l1d.g(builderD.h(new b(q8nVar, mr20VarArr))).b(new btv(dtvVar)).d(new ctv(dtvVar));
    }
}
