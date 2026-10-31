package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.playback_esperanto.proto.PlaybackEsperanto;
import com.spotify.player.model.ContextTrack;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class n5s extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n5s(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                n5s n5sVar = new n5s((jv51) obj2, lnmVar, (byte) 0);
                n5sVar.c = obj;
                return n5sVar;
            case 1:
                return new n5s((String) this.c, (l7m0) obj2, lnmVar, (byte) 1);
            case 2:
                n5s n5sVar2 = new n5s((o7s) obj2, lnmVar, (byte) 2);
                n5sVar2.c = obj;
                return n5sVar2;
            case 3:
                return new n5s((es41) this.c, (iu30) obj2, lnmVar, (byte) 3);
            case 4:
                n5s n5sVar3 = new n5s((tcs) obj2, lnmVar, (byte) 4);
                n5sVar3.c = obj;
                return n5sVar3;
            case 5:
                n5s n5sVar4 = new n5s((qes) obj2, lnmVar, (byte) 5);
                n5sVar4.c = obj;
                return n5sVar4;
            case 6:
                n5s n5sVar5 = new n5s((dgs) obj2, lnmVar, (byte) 6);
                n5sVar5.c = obj;
                return n5sVar5;
            case 7:
                n5s n5sVar6 = new n5s((jks) obj2, lnmVar, (byte) 7);
                n5sVar6.c = obj;
                return n5sVar6;
            case 8:
                return new n5s((ams) this.c, (String) obj2, lnmVar, (byte) 8);
            case 9:
                return new n5s((mxr) this.c, (String) obj2, lnmVar, (byte) 9);
            case 10:
                return new n5s((qqs) this.c, (er91) obj2, lnmVar, (byte) 10);
            case 11:
                return new n5s((zus) this.c, (uus) obj2, lnmVar, (byte) 11);
            case 12:
                return new n5s((vxs) this.c, (nsf1) obj2, lnmVar, (byte) 12);
            case 13:
                return new n5s((ttk1) this.c, (iu30) obj2, lnmVar, (byte) 13);
            case 14:
                n5s n5sVar7 = new n5s((gj5) obj2, lnmVar, (byte) 14);
                n5sVar7.c = obj;
                return n5sVar7;
            case 15:
                return new n5s((yzs) this.c, (a8l) obj2, lnmVar, (byte) 15);
            case 16:
                return new n5s((k1t) this.c, (upb0) obj2, lnmVar, (byte) 16);
            case 17:
                return new n5s((a680) this.c, (String) obj2, lnmVar, (byte) 17);
            case 18:
                n5s n5sVar8 = new n5s((okt) obj2, lnmVar, (byte) 18);
                n5sVar8.c = obj;
                return n5sVar8;
            case 19:
                return new n5s((kp5) this.c, (String) obj2, lnmVar, (byte) 19);
            case 20:
                n5s n5sVar9 = new n5s((ima1) obj2, lnmVar, (byte) 20);
                n5sVar9.c = obj;
                return n5sVar9;
            case 21:
                return new n5s((Function0) this.c, (es41) obj2, lnmVar, (byte) 21);
            case 22:
                n5s n5sVar10 = new n5s((ptt) obj2, lnmVar, (byte) 22);
                n5sVar10.c = obj;
                return n5sVar10;
            case 23:
                return new n5s((sut) this.c, (ots) obj2, lnmVar, (byte) 23);
            case 24:
                return new n5s((bvt) this.c, (Function0) obj2, lnmVar, (byte) 24);
            case 25:
                return new n5s((r5u) this.c, (PlaybackEsperanto.DuckRequest) obj2, lnmVar, (byte) 25);
            case 26:
                return new n5s((b6u) obj2, lnmVar, (byte) 26);
            case 27:
                return new n5s((v6u) this.c, (hqx0) obj2, lnmVar, (byte) 27);
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return new n5s((h9n) this.c, (String) obj2, lnmVar, (byte) 28);
            default:
                return new n5s((ziu) this.c, (iu30) obj2, lnmVar, (byte) 29);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((d0r) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 11:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 12:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 14:
                return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 15:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 16:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9n.a;
            case 17:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 18:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 19:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 20:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 21:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 22:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 23:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 24:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 25:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 27:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v116 */
    /* JADX WARN: Type inference failed for: r1v117 */
    /* JADX WARN: Type inference failed for: r1v94, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v99, types: [p.tac0] */
    public final Object invokeSuspend(Object obj) {
        Object objI;
        Object objJ;
        Object objJ2;
        Object objJ3;
        byte b = this.a;
        byte b2 = 22;
        byte b3 = 8;
        byte b4 = 21;
        Object obj2 = rih1.a;
        Object obj3 = this.d;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                d0r d0rVar = (d0r) this.c;
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return obj2;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                v061 v061Var = v061.a;
                String str = ((jv51) obj3).a;
                this.c = null;
                this.b = true;
                d0rVar.getClass();
                return d0r.d(d0rVar, v061Var, str, t061.a, this) == d9nVar ? d9nVar : obj2;
            case 1:
                String strF = (String) this.c;
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        objI = obj;
                    } else {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                hm5.M(obj);
                Set set = s4b1.f;
                s4b1 s4b1VarX = uic.x(strF);
                if (v5s.a[s4b1VarX.c.ordinal()] == 1 && (strF = s4b1VarX.F()) == null) {
                    strF = "";
                }
                qvc0 qvc0Var = new qvc0(strF, (c3d0) null, (Set) null, new iqz0(0, 1000), 6);
                rsc0 rsc0Var = (xrc0) ((l7m0) obj3).b;
                this.b = true;
                objI = rsc0Var.i(qvc0Var, this);
                if (objI == d9nVar) {
                    return d9nVar;
                }
                ly21 ly21Var = (py21) objI;
                ly21Var.getClass();
                if (ly21Var instanceof ly21) {
                    return new v3g1(ly21Var.a.b());
                }
                if (!(ly21Var instanceof oy21)) {
                    eg.o();
                    return null;
                }
                List list = (List) ((oy21) ly21Var).a;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(ContextTrack.create(((pvc0) it.next()).c));
                }
                return new w3g1(arrayList);
            case 2:
                o7s o7sVar = (o7s) obj3;
                mwh0 mwh0Var = o7sVar.a;
                ssw0 ssw0Var = (ssw0) this.c;
                boolean z3 = this.b;
                if (z3) {
                    if (z3) {
                        hm5.M(obj);
                        return obj2;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                sun sunVar = new sun(ssw0Var, (byte) 13);
                ExecutorService executorService = o7sVar.d;
                List<String> list2 = o7sVar.b.a;
                ArrayList arrayList2 = new ArrayList(q7h.U(list2, 10));
                for (String strConcat : list2) {
                    if (nhc1.Y(strConcat, "android.media.intent.category.", false)) {
                        strConcat = "android.media.route.feature.".concat(ihc1.H0(strConcat, "android.media.intent.category."));
                    }
                    arrayList2.add(strConcat);
                }
                mwh0Var.f(executorService, sunVar, new wr31(arrayList2));
                ilo1.E(mwh0Var.c(), ssw0Var);
                nxr nxrVar = new nxr(o7sVar, sunVar, (byte) 13);
                this.c = null;
                this.b = true;
                return jch0.s(ssw0Var, nxrVar, this) == d9nVar ? d9nVar : obj2;
            case 3:
                boolean z4 = this.b;
                if (z4) {
                    if (z4) {
                        hm5.M(obj);
                        return obj2;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                m441 m441VarQ = rwq.q(new g61((es41) this.c, (byte) 4));
                qv7 qv7Var = new qv7((iu30) obj3, (byte) 9);
                this.b = true;
                Object objCollect = m441VarQ.collect(new x5s(qv7Var, b3), this);
                if (objCollect != d9nVar) {
                    objCollect = obj2;
                }
                return objCollect == d9nVar ? d9nVar : obj2;
            case 4:
                tcs tcsVar = (tcs) obj3;
                c9n c9nVar = (c9n) this.c;
                boolean z5 = this.b;
                if (z5) {
                    if (z5) {
                        hm5.M(obj);
                        return obj2;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                FlowableMap flowableMap = tcsVar.h1;
                vbm[] vbmVarArr = q601.a;
                ve01 ve01VarR = d5p1.r(new kge(flowableMap), c9nVar, ey71.a, 1);
                if (tcsVar.i.a()) {
                    fn31.T(c9nVar, (o8n) null, 0, new n1o(tcsVar, (lnm) null, (byte) 18), 3);
                }
                plu pluVarW = rqt0.w(ve01VarR, c6s.X0, rqt0.b);
                skr skrVar = new skr(tcsVar, (byte) 10);
                this.c = null;
                this.b = true;
                return pluVarW.collect(skrVar, this) == d9nVar ? d9nVar : obj2;
            case 5:
                vr20 vr20Var = (vr20) this.c;
                boolean z6 = this.b;
                if (z6) {
                    if (z6) {
                        hm5.M(obj);
                        return obj2;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Integer num = new Integer(((qes) obj3).a.l(o1t0.b, 0));
                this.c = null;
                this.b = true;
                return vr20Var.emit(num, this) == d9nVar ? d9nVar : obj2;
            case 6:
                ssw0 ssw0Var2 = (ssw0) this.c;
                boolean z7 = this.b;
                if (z7) {
                    if (z7) {
                        hm5.M(obj);
                        return obj2;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mfe mfeVarB = k4p1.B(((dgs) obj3).n.a);
                cu cuVar = new cu(ssw0Var2, (byte) 4);
                this.c = null;
                this.b = true;
                return mfeVarB.collect(cuVar, this) == d9nVar ? d9nVar : obj2;
            case 7:
                jks jksVar = (jks) obj3;
                ssw0 ssw0Var3 = (ssw0) this.c;
                boolean z8 = this.b;
                if (z8) {
                    if (z8) {
                        hm5.M(obj);
                        return obj2;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                w2z w2zVar = new w2z(ssw0Var3);
                p7s p7sVar = jksVar.a;
                fn31.T(p7sVar.c, null, 0, new gke(p7sVar, jksVar.b, w2zVar, (lnm) null, (byte) 25), 3);
                nxr nxrVar2 = new nxr(jksVar, w2zVar, (byte) 22);
                this.c = null;
                this.b = true;
                return jch0.s(ssw0Var3, nxrVar2, this) == d9nVar ? d9nVar : obj2;
            case 8:
                boolean z9 = this.b;
                if (z9) {
                    if (z9) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ams amsVar = (ams) this.c;
                ay8 ay8VarF = d3p1.F(amsVar.g, amsVar.h, (String) obj3);
                jte jteVar = new jte(2, (lnm) null, (byte) 21);
                this.b = true;
                Object objJ4 = b5p1.j(ay8VarF, jteVar, this);
                return objJ4 == d9nVar ? d9nVar : objJ4;
            case 9:
                mxr mxrVar = (mxr) this.c;
                boolean z10 = this.b;
                try {
                    if (!z10) {
                        hm5.M(obj);
                        this.b = true;
                        if (((eg40) mxrVar.b).f((String) obj3, this) == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!z10) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    ((p681) mxrVar.c).b.a(obj2);
                    return obj2;
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception unused) {
                    return obj2;
                }
            case 10:
                boolean z11 = this.b;
                if (!z11) {
                    hm5.M(obj);
                    this.b = true;
                    if (hap1.i(450L, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z11) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                ((qqs) this.c).a.k((er91) obj3);
                return obj2;
            case 11:
                boolean z12 = this.b;
                if (!z12) {
                    hm5.M(obj);
                    this.b = true;
                    mma0[] mma0VarArr = zus.i;
                    return ((zus) this.c).f((uus) obj3, this) == d9nVar ? d9nVar : obj2;
                }
                if (z12) {
                    hm5.M(obj);
                    return obj2;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 12:
                boolean z13 = this.b;
                if (z13) {
                    if (z13) {
                        hm5.M(obj);
                        return obj2;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                vxs vxsVar = (vxs) this.c;
                pfn0 pfn0Var = vxsVar.c;
                uxs uxsVar = vxsVar.b;
                zlo zloVar = new zlo(vxsVar, (nsf1) obj3, (lnm) null, (byte) 21);
                this.b = true;
                pfn0Var.getClass();
                return smo1.s(new ofn0(hfn0.b, pfn0Var, zloVar, uxsVar, (lnm) null), this) == d9nVar ? d9nVar : obj2;
            case 13:
                boolean z14 = this.b;
                if (z14) {
                    if (z14) {
                        hm5.M(obj);
                        return obj2;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                dt71 dt71Var = (dt71) ((ttk1) this.c).d.c;
                qv7 qv7Var2 = new qv7((iu30) obj3, (byte) 10);
                this.b = true;
                dt71Var.collect(qv7Var2, this);
                return d9nVar;
            case 14:
                gj5 gj5Var = (gj5) obj3;
                ssw0 ssw0Var4 = (ssw0) this.c;
                boolean z15 = this.b;
                if (z15) {
                    if (z15) {
                        hm5.M(obj);
                        return obj2;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                uzs uzsVar = new uzs(ssw0Var4, (byte) 0);
                ((f0i) gj5Var).a.a(uzsVar);
                nxr nxrVar3 = new nxr(gj5Var, uzsVar, (byte) 28);
                this.c = null;
                this.b = true;
                return jch0.s(ssw0Var4, nxrVar3, this) == d9nVar ? d9nVar : obj2;
            case 15:
                yzs yzsVar = (yzs) this.c;
                boolean z16 = this.b;
                if (z16) {
                    if (z16) {
                        hm5.M(obj);
                        return obj2;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ezc ezcVarG = yoi1.g(((kor) yzsVar.c.get()).f);
                mib mibVar = new mib(yzsVar, (a8l) obj3, (byte) 6);
                this.b = true;
                Object objCollect2 = ezcVarG.collect(new x5s(new x5s(mibVar, b2), b4), this);
                if (objCollect2 != d9nVar) {
                    objCollect2 = obj2;
                }
                if (objCollect2 != d9nVar) {
                    objCollect2 = obj2;
                }
                return objCollect2 == d9nVar ? d9nVar : obj2;
            case 16:
                boolean z17 = this.b;
                if (z17) {
                    if (!z17) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        hm5.M(obj);
                    }
                    return null;
                }
                hm5.M(obj);
                k1t k1tVar = (k1t) this.c;
                bpb1 bpb1Var = k1tVar.P0;
                hxn hxnVar = new hxn((upb0) obj3, k1tVar, false, (lnm) null, (byte) 16);
                this.b = true;
                if (l4p1.q(bpb1Var, hxnVar, this) == d9nVar) {
                    return d9nVar;
                }
                eg.m("SharedFlow never completes, this call should never return.");
                return null;
            case 17:
                boolean z18 = this.b;
                if (!z18) {
                    hm5.M(obj);
                    this.b = true;
                    return ((y7h0) ((a680) this.c).a).c((String) obj3, this) == d9nVar ? d9nVar : obj2;
                }
                if (!z18) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Object obj4 = ((e331) obj).a;
                return obj2;
            case 18:
                vr20 vr20Var2 = (vr20) this.c;
                boolean z19 = this.b;
                if (z19) {
                    if (z19) {
                        hm5.M(obj);
                        return obj2;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                zlo zloVar2 = new zlo((okt) obj3, vr20Var2, (lnm) null, (byte) 26);
                this.c = null;
                this.b = true;
                return smo1.s(zloVar2, this) == d9nVar ? d9nVar : obj2;
            case 19:
                boolean z20 = this.b;
                if (!z20) {
                    hm5.M(obj);
                    rsc0 rsc0Var2 = (xrc0) ((kp5) this.c).c;
                    rxc0 rxc0Var = new rxc0((String) obj3);
                    this.b = true;
                    objJ = rsc0Var2.j(rxc0Var, this);
                    if (objJ == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z20) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objJ = obj;
                }
                return ((py21) objJ).d();
            case 20:
                vr20 vr20Var3 = (vr20) this.c;
                boolean z21 = this.b;
                if (z21) {
                    if (z21) {
                        hm5.M(obj);
                        return obj2;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Boolean boolValueOf = Boolean.valueOf(((ima1) obj3).h(vpt.d, false));
                this.c = null;
                this.b = true;
                return vr20Var3.emit(boolValueOf, this) == d9nVar ? d9nVar : obj2;
            case 21:
                boolean z22 = this.b;
                if (!z22) {
                    hm5.M(obj);
                    yc2 yc2Var = new yc2(rwq.q(new d4e((es41) obj3, (byte) 20)), (byte) 8);
                    this.b = true;
                    if (b5p1.i(yc2Var, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z22) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                ((Function0) this.c).invoke();
                return obj2;
            case 22:
                c9n c9nVar2 = (c9n) this.c;
                boolean z23 = this.b;
                if (z23 && !z23) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                while (smo1.u(c9nVar2)) {
                    ptt pttVar = (ptt) obj3;
                    boolean z24 = ((double) pttVar.g) > 0.1d;
                    if (pttVar.k != z24) {
                        pttVar.k = z24;
                        ArrayList arrayList3 = pttVar.j;
                        if (z24) {
                            Iterator it2 = arrayList3.iterator();
                            while (it2.hasNext()) {
                                ((bqb1) ((rpb1) it2.next()).a.c).a(5, "true");
                            }
                        } else {
                            Iterator it3 = arrayList3.iterator();
                            while (it3.hasNext()) {
                                ((bqb1) ((rpb1) it3.next()).a.c).a(5, "false");
                            }
                        }
                    }
                    this.c = c9nVar2;
                    this.b = true;
                    if (hap1.i(3000L, this) == d9nVar) {
                        return d9nVar;
                    }
                }
                return obj2;
            case 23:
                boolean z25 = this.b;
                if (!z25) {
                    hm5.M(obj);
                    this.b = true;
                    Object objI2 = ((sut) this.c).i((ots) obj3, this);
                    return objI2 == d9nVar ? d9nVar : objI2;
                }
                if (z25) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 24:
                boolean z26 = this.b;
                if (!z26) {
                    hm5.M(obj);
                    this.b = true;
                    Object objD = ((bvt) this.c).d((Function0) obj3, this);
                    return objD == d9nVar ? d9nVar : objD;
                }
                if (z26) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 25:
                boolean z27 = this.b;
                try {
                    if (!z27) {
                        hm5.M(obj);
                        Single map = ((r5u) this.c).b.callSingle("spotify.playback_esperanto.proto.PlaybackService", "Duck", (PlaybackEsperanto.DuckRequest) obj3).map(dj20.W0);
                        this.b = true;
                        objJ2 = fc11.j(map, this);
                        if (objJ2 == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!z27) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                        objJ2 = obj;
                    }
                    objJ2.getClass();
                    return obj2;
                } catch (Exception e2) {
                    Logger.d("AudioDucking", new Object[]{"Failed to process ducking request", e2});
                    return obj2;
                }
            case 26:
                tac0 tac0Var = this.b;
                try {
                    if (tac0Var == 0) {
                        hm5.M(obj);
                        y5u y5uVar = new y5u((byte) 0);
                        k8c0 k8c0Var = k8c0.ON_START;
                        tac0 tac0Var2 = y5uVar.b;
                        tac0Var2.g(k8c0Var);
                        Single singleA = ((b6u) obj3).c.a(tac0Var2).a().a(new p9u0());
                        this.c = tac0Var2;
                        this.b = true;
                        objJ3 = fc11.j(singleA, this);
                        tac0Var = tac0Var2;
                        if (objJ3 == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (tac0Var != 1) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        tac0 tac0Var3 = (tac0) this.c;
                        hm5.M(obj);
                        objJ3 = obj;
                        tac0Var = tac0Var3;
                    }
                    objJ3.getClass();
                    try {
                        tac0Var.g(k8c0.ON_DESTROY);
                        break;
                    } catch (IllegalStateException unused2) {
                    }
                    obj2 = objJ3;
                } catch (Exception unused3) {
                    op71.x(getContext());
                    try {
                        break;
                    } catch (IllegalStateException unused4) {
                    }
                } finally {
                    try {
                        tac0Var.g(k8c0.ON_DESTROY);
                        break;
                    } catch (IllegalStateException unused5) {
                    }
                }
                return obj2;
            case 27:
                boolean z28 = this.b;
                try {
                    if (!z28) {
                        hm5.M(obj);
                        ya11 ya11Var = ((v6u) this.c).b;
                        String strC = mka.c(((hqx0) obj3).a);
                        this.b = true;
                        if (ya11Var.b(strC, this) == d9nVar) {
                            obj2 = d9nVar;
                        }
                    } else {
                        if (!z28) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    return obj2;
                } catch (Exception e3) {
                    Logger.e(e3, "Failed discarding refinement session", new Object[0]);
                    return obj2;
                }
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                boolean z29 = this.b;
                if (!z29) {
                    hm5.M(obj);
                    this.b = true;
                    return ((xq81) ((h9n) this.c).b).j((String) obj3, this) == d9nVar ? d9nVar : obj2;
                }
                if (z29) {
                    hm5.M(obj);
                    return obj2;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z30 = this.b;
                if (!z30) {
                    hm5.M(obj);
                    if (((ziu) this.c).b) {
                        return obj2;
                    }
                    this.b = true;
                    if (hap1.i(2000L, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z30) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                ((iu30) obj3).invoke(nd5.a);
                return obj2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n5s(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
    }
}
