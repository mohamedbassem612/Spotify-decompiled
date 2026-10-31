package p;

import androidx.work.WorkerParameters;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.storage.localstorage.CacheMovingWorkerImpl;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.KotlinNothingValueException;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vk6 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vk6(boolean z, Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = z;
        this.c = obj;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new vk6((yu3) obj2, lnmVar, (byte) 0);
            case 1:
                return new vk6(this.b, (jr6) obj2, lnmVar, (byte) 1);
            case 2:
                return new vk6((bv6) obj2, lnmVar, (byte) 2);
            case 3:
                return new vk6((ot7) obj2, lnmVar, (byte) 3);
            case 4:
                return new vk6((d78) obj2, lnmVar, (byte) 4);
            case 5:
                return new vk6((cl8) obj2, lnmVar, (byte) 5);
            case 6:
                return new vk6((or8) obj2, lnmVar, (byte) 6);
            case 7:
                return new vk6((g7a) obj2, lnmVar, (byte) 7);
            case 8:
                return new vk6((qla) obj2, lnmVar, (byte) 8);
            case 9:
                return new vk6((cpa) obj2, lnmVar, (byte) 9);
            case 10:
                return new vk6((w6b) obj2, lnmVar, (byte) 10);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return new vk6((aab) obj2, lnmVar, (byte) 11);
            case grn1.d /* 12 */:
                return new vk6((ggb) obj2, lnmVar, (byte) 12);
            case 13:
                return new vk6((yjb) obj2, lnmVar, (byte) 13);
            case 14:
                return new vk6((fqb) obj2, lnmVar, (byte) 14);
            case 15:
                return new vk6((fta) obj2, lnmVar, (byte) 15);
            case 16:
                return new vk6((g7c) obj2, lnmVar, (byte) 16);
            case 17:
                return new vk6((a8c) obj2, lnmVar, (byte) 17);
            case 18:
                return new vk6((rrc) obj2, lnmVar, (byte) 18);
            case 19:
                return new vk6((CacheMovingWorkerImpl) obj2, lnmVar, (byte) 19);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                return new vk6((xvc) obj2, lnmVar, (byte) 20);
            case 21:
                return new vk6((s6d) obj2, lnmVar, (byte) 21);
            case 22:
                return new vk6((nid) obj2, lnmVar, (byte) 22);
            case 23:
                return new vk6((sjd) obj2, lnmVar, (byte) 23);
            case 24:
                return new vk6((vkd) obj2, lnmVar, (byte) 24);
            case 25:
                return new vk6((p2o0) obj2, lnmVar, (byte) 25);
            case 26:
                return new vk6((i4e) obj2, lnmVar, (byte) 26);
            case 27:
                return new vk6(this.b, (cce) obj2, lnmVar, (byte) 27);
            case 28:
                return new vk6((y1c1) obj2, lnmVar, (byte) 28);
            default:
                return new vk6((joe) obj2, lnmVar, (byte) 29);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.coroutines.flow.internal.AbortFlowException */
    public final Object invoke(Object obj, Object obj2) throws AbortFlowException, KotlinNothingValueException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 1:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 2:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 3:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return d9n.a;
            case 4:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 5:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 6:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 7:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 8:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 9:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 10:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case grn1.d /* 12 */:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 13:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 14:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 15:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 16:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 17:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 18:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 19:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 21:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 22:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 23:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 24:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 25:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 26:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 27:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return rih1Var;
            case 28:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            default:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.coroutines.flow.internal.AbortFlowException */
    /* JADX WARN: Code duplicated, block: B:31:0x0098  */
    /* JADX WARN: Code duplicated, block: B:339:0x00b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:342:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b2  */
    public final Object invokeSuspend(Object obj) throws AbortFlowException, KotlinNothingValueException {
        Object objB;
        Object objJ;
        Object objC;
        Object objL;
        Object objC2;
        Object value;
        lb31 lb31Var;
        Object objI;
        ArrayList arrayList;
        nsn nsnVar;
        ahe aheVar;
        byte b = this.a;
        boolean z = false;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        Object obj2 = this.c;
        lnm lnmVar = null;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                yu3 yu3Var = (yu3) obj2;
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mr20 mr20VarU = rqt0.u(new xr0((xe01) ((em0) yu3Var.c).g, (byte) 4));
                hb0 hb0Var = new hb0(yu3Var, (byte) 12);
                this.b = true;
                return mr20VarU.collect(hb0Var, this) == d9nVar ? d9nVar : rih1Var;
            case 1:
                hm5.M(obj);
                jr6 jr6Var = (jr6) obj2;
                return (yzc0) (this.b ? jr6Var.c : jr6Var.d).get();
            case 2:
                bv6 bv6Var = (bv6) obj2;
                boolean z3 = this.b;
                if (z3) {
                    if (z3) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                d0r d0rVar = bv6Var.d;
                jge jgeVarE = hu20.e(rqt0.u(new x010(rqt0.u(new c64(new te1(d3p1.F(d0rVar, dv6.b, rih1Var), (byte) 6), bv6Var, (byte) 11)), (xe01) bv6Var.e.g, new qr0(bv6Var, (lnm) null, (byte) 3), (byte) 1)), new qt(lnmVar, (Object) bv6Var, (byte) 13));
                o3r o3rVar = dv6.c;
                String str = bv6Var.f;
                mr20 mr20VarR = o4p1.r(h5p1.r(jgeVarE, d3p1.F(d0rVar, o3rVar, str), new te1(d3p1.F(d0rVar, dv6.d, str), (byte) 5), bv6Var.O0, new f3(5, (lnm) null, (byte) 3)), b3s.c);
                hb0 hb0Var2 = new hb0(bv6Var, (byte) 13);
                this.b = true;
                return mr20VarR.collect(hb0Var2, this) == d9nVar ? d9nVar : rih1Var;
            case 3:
                boolean z4 = this.b;
                if (z4) {
                    if (z4) {
                        throw l1d.v(obj);
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ot7 ot7Var = (ot7) obj2;
                bpb1 bpb1Var = (bpb1) ot7Var.b.f;
                hb0 hb0Var3 = new hb0(ot7Var, (byte) 16);
                this.b = true;
                bpb1Var.collect(hb0Var3, this);
                return d9nVar;
            case 4:
                boolean z5 = this.b;
                if (z5) {
                    if (z5) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                d78 d78Var = (d78) obj2;
                this.b = true;
                ohd ohdVar = new ohd(1, aym.t(this));
                ohdVar.t();
                c78 c78Var = new c78(d78Var, ohdVar, (byte) 0);
                d78Var.a.a(c78Var);
                ohdVar.n(new xg6(d78Var, c78Var, (byte) 26));
                Object objR = ohdVar.r();
                return objR == d9nVar ? d9nVar : objR;
            case 5:
                cl8 cl8Var = (cl8) obj2;
                boolean z6 = this.b;
                if (z6) {
                    if (z6) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ipr iprVar = new ipr(cl8Var.f, new x010(new ht20(cl8Var.a.a, new sd0(2, (lnm) null, (byte) 14)), hu20.e(cl8Var.b.a, new qt(lnmVar, (Object) cl8Var, (byte) 18)), new vm0(3, (lnm) null, (byte) 2), (byte) 1), new qr0(cl8Var, (lnm) null, (byte) 5), (byte) 16);
                hb0 hb0Var4 = new hb0(cl8Var, (byte) 18);
                this.b = true;
                return iprVar.collect(hb0Var4, this) == d9nVar ? d9nVar : rih1Var;
            case 6:
                or8 or8Var = (or8) obj2;
                boolean z7 = this.b;
                if (z7) {
                    if (z7) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ezc ezcVarG = yoi1.g(or8Var.c);
                hb0 hb0Var5 = new hb0(or8Var, (byte) 19);
                this.b = true;
                return ezcVarG.collect(hb0Var5, this) == d9nVar ? d9nVar : rih1Var;
            case 7:
                g7a g7aVar = (g7a) obj2;
                boolean z8 = this.b;
                if (z8) {
                    if (z8) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mr20 mr20Var = g7aVar.l;
                mr20 mr20Var2 = g7aVar.k;
                ce2 ce2Var = new ce2(3, (lnm) null, (byte) 4);
                hb0 hb0Var6 = new hb0(g7aVar, (byte) 22);
                this.b = true;
                Object objS = fc11.s(vrl.c, this, hb0Var6, new ekv(ce2Var, (lnm) null), new mr20[]{mr20Var, mr20Var2});
                if (objS != d9nVar) {
                    objS = rih1Var;
                }
                return objS == d9nVar ? d9nVar : rih1Var;
            case 8:
                boolean z9 = this.b;
                if (!z9) {
                    hm5.M(obj);
                    ohm1 ohm1Var = ((qla) obj2).f;
                    this.b = true;
                    objB = ohm1Var.b("listening-age-quiz-completed", this);
                    if (objB == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z9) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objB = obj;
                }
                String str2 = (String) objB;
                return Boolean.valueOf(str2 != null ? u890.j(ihc1.d1(str2), Boolean.TRUE) : false);
            case 9:
                boolean z10 = this.b;
                if (z10) {
                    if (z10) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                cpa cpaVar = (cpa) obj2;
                dt71 dt71Var = ((dpa) cpaVar.c).b;
                hb0 hb0Var7 = new hb0(cpaVar, (byte) 25);
                this.b = true;
                dt71Var.collect(hb0Var7, this);
                return d9nVar;
            case 10:
                w6b w6bVar = (w6b) obj2;
                boolean z11 = this.b;
                if (!z11) {
                    hm5.M(obj);
                    long j = w6bVar.c;
                    this.b = true;
                    if (hap1.i(j, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z11) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                if (((ymd0) w6bVar.a).c > 0) {
                    return rih1Var;
                }
                faa0 faa0Var = w6bVar.f;
                if (faa0Var != null) {
                    faa0Var.d((CancellationException) null);
                }
                w6bVar.f = null;
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                aab aabVar = (aab) obj2;
                boolean z12 = this.b;
                try {
                    if (!z12) {
                        hm5.M(obj);
                        Single singleC = aabVar.d.c(mmq0.g, 3, nik1.t6.a);
                        this.b = true;
                        objJ = fc11.j(singleC, this);
                        if (objJ == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!z12) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                        objJ = obj;
                    }
                    if (((rmq0) objJ).a) {
                        if (aabVar.e.a.g(aabVar.f)) {
                            z = true;
                        }
                    }
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception unused) {
                }
                return Boolean.valueOf(z);
            case grn1.d /* 12 */:
                ggb ggbVar = (ggb) obj2;
                boolean z13 = this.b;
                if (!z13) {
                    hm5.M(obj);
                    faa0 faa0Var2 = ggbVar.d;
                    this.b = true;
                    if (faa0Var2.j(this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z13) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                smo1.p(ggbVar.b, null);
                Iterator it = ((Set) ggbVar.c.getValue()).iterator();
                while (it.hasNext()) {
                    ((akb) it.next()).stop();
                }
                return rih1Var;
            case 13:
                boolean z14 = this.b;
                if (z14) {
                    if (z14) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                this.b = true;
                ohd ohdVar2 = new ohd(1, aym.t(this));
                ohdVar2.t();
                ((yjb) obj2).invoke(ohdVar2);
                Object objR2 = ohdVar2.r();
                return objR2 == d9nVar ? d9nVar : objR2;
            case 14:
                boolean z15 = this.b;
                if (!z15) {
                    hm5.M(obj);
                    this.b = true;
                    objC = ((fqb) obj2).c(j120.a, this);
                    if (objC == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z15) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objC = ((e331) obj).a;
                }
                return new e331(objC);
            case 15:
                fta ftaVar = (fta) obj2;
                boolean z16 = this.b;
                if (z16) {
                    if (z16) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                jge jgeVarE2 = hu20.e(new mgb(rqt0.u(yoi1.g(((xvo) ftaVar.b).a(true))), ftaVar, (byte) 6), new b7c((lnm) null, ftaVar, (byte) 0));
                hb0 hb0Var8 = new hb0(ftaVar, (byte) 27);
                this.b = true;
                return jgeVarE2.collect(hb0Var8, this) == d9nVar ? d9nVar : rih1Var;
            case 16:
                g7c g7cVar = (g7c) obj2;
                boolean z17 = this.b;
                if (!z17) {
                    hm5.M(obj);
                    zwa zwaVar = g7cVar.d;
                    String str3 = g7cVar.e.d;
                    this.b = true;
                    objL = zwaVar.l(str3, this);
                    if (objL == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z17) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objL = ((e331) obj).a;
                }
                if (!(objL instanceof m231)) {
                    g7cVar.i.l((tpl) objL);
                    g7cVar.i();
                }
                Throwable thA = e331.a(objL);
                if (thA == null) {
                    return rih1Var;
                }
                g7cVar.h(thA);
                return rih1Var;
            case 17:
                a8c a8cVar = (a8c) obj2;
                d520 d520Var = a8cVar.e;
                boolean z18 = this.b;
                if (z18) {
                    if (z18) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                snc0 snc0Var = (snc0) d520Var.e;
                if (snc0Var == null) {
                    u890.C("listContentRuntime");
                    throw null;
                }
                mr20 mr20VarC = snc0Var.c();
                mr20 mr20VarF = d520Var.F();
                w7c w7cVar = w7c.h;
                hb0 hb0Var9 = new hb0(a8cVar, (byte) 29);
                this.b = true;
                Object objS2 = fc11.s(vrl.c, this, hb0Var9, new ekv(w7cVar, (lnm) null), new mr20[]{mr20VarC, mr20VarF});
                if (objS2 != d9nVar) {
                    objS2 = rih1Var;
                }
                return objS2 == d9nVar ? d9nVar : rih1Var;
            case 18:
                boolean z19 = this.b;
                if (!z19) {
                    hm5.M(obj);
                    this.b = true;
                    return ((rrc) obj2).b(this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z19) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 19:
                CacheMovingWorkerImpl cacheMovingWorkerImpl = (CacheMovingWorkerImpl) obj2;
                WorkerParameters workerParameters = cacheMovingWorkerImpl.j;
                boolean z20 = this.b;
                if (z20) {
                    if (z20) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                String strC = workerParameters.b.c("volume");
                if (strC == null) {
                    strC = "";
                }
                long jB = workerParameters.b.b("estimated-size", 0L);
                this.b = true;
                Object objJ2 = cacheMovingWorkerImpl.j(jB, strC, this);
                return objJ2 == d9nVar ? d9nVar : objJ2;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                boolean z21 = this.b;
                if (z21) {
                    if (z21) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                xvc xvcVar = (xvc) obj2;
                qzn0 qzn0Var = xvcVar.h;
                wqn0 wqn0VarF = xvcVar.f();
                this.b = true;
                return qzn0Var.a(wqn0VarF, this) == d9nVar ? d9nVar : rih1Var;
            case 21:
                boolean z22 = this.b;
                if (!z22) {
                    hm5.M(obj);
                    ohm1 ohm1Var2 = ((s6d) obj2).b;
                    this.b = true;
                    objC2 = ohm1Var2.c("2026_wrapped_seen_story_cards", this);
                    if (objC2 == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z22) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objC2 = obj;
                }
                return Boolean.valueOf(objC2 != null);
            case 22:
                nid nidVar = (nid) obj2;
                boolean z23 = this.b;
                if (z23) {
                    if (z23) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mr20 mr20VarB = nidVar.a.b();
                fdd fddVar = new fdd(nidVar, (byte) 1);
                this.b = true;
                return mr20VarB.collect(fddVar, this) == d9nVar ? d9nVar : rih1Var;
            case 23:
                boolean z24 = this.b;
                if (z24) {
                    if (z24) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                sjd sjdVar = (sjd) obj2;
                mr20 mr20Var3 = sjdVar.a1;
                fdd fddVar2 = new fdd(sjdVar, (byte) 2);
                this.b = true;
                return mr20Var3.collect(fddVar2, this) == d9nVar ? d9nVar : rih1Var;
            case 24:
                boolean z25 = this.b;
                if (z25) {
                    if (z25) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                vkd vkdVar = (vkd) obj2;
                mr20 mr20Var4 = vkdVar.e1;
                fdd fddVar3 = new fdd(vkdVar, (byte) 3);
                this.b = true;
                return mr20Var4.collect(fddVar3, this) == d9nVar ? d9nVar : rih1Var;
            case 25:
                boolean z26 = this.b;
                if (!z26) {
                    hm5.M(obj);
                    this.b = true;
                    if (hap1.i(5000L, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z26) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                bpb1 bpb1Var2 = (bpb1) ((p2o0) obj2).f;
                do {
                    value = bpb1Var2.getValue();
                } while (!bpb1Var2.k(value, uyd.a((uyd) value, (List) null, (ArrayList) null, true, 7)));
                return rih1Var;
            case 26:
                boolean z27 = this.b;
                if (z27) {
                    if (z27) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                i4e i4eVar = (i4e) obj2;
                hts htsVar = i4eVar.a;
                txs txsVar = htsVar.a;
                vkr vkrVar = htsVar.c;
                evz evzVarP = x4p1.p(new lt20(new m441(new sxa(new m441(new sxa(new fu20(new yc2(new m441(new sxa(new fu20(hu20.d(new mr20[]{new fts(txsVar.m, (byte) 0), htsVar.b.d, new fts(vkrVar.f, (byte) 1)}), new pid(i4eVar, (lnm) null, (byte) 1), (byte) 1), (lnm) null, new nty(new f4e(i4eVar, (byte) 0), (byte) 23), (byte) 15)), (byte) 3), new s4(2, (lnm) null, (byte) 24), (byte) 1), (lnm) null, i4eVar, (byte) 17)), (lnm) null, new hxn(vkrVar, htsVar.d, false, (lnm) null, (byte) 24), (byte) 16)), new l2(i4eVar, (lnm) null, (byte) 21), (byte) 0), 3L, new s4(2, (lnm) null, (byte) 25));
                this.b = true;
                return l4p1.p(evzVarP, this) == d9nVar ? d9nVar : rih1Var;
            case 27:
                hm5.M(obj);
                if (this.b) {
                    cce cceVar = (cce) obj2;
                    i8h1 i8h1Var = (i8h1) ((idd1) cceVar.d).getValue();
                    txk0 txk0Var = (txk0) cceVar.c;
                    x6h1 x6h1VarC = txk0Var.b.c();
                    x6h1VarC.i.add(new a7h1("error_label", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = true;
                    y6h1 y6h1VarA = x6h1VarC.a();
                    k7h1 k7h1Var = new k7h1();
                    ((xjn) k7h1Var).a = y6h1VarA;
                    ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                    k7h1Var.e = txk0Var.c;
                    i8h1Var.f(k7h1Var.a(), (Set) null);
                }
                return rih1Var;
            case 28:
                boolean z28 = this.b;
                if (!z28) {
                    hm5.M(obj);
                    zob1 zob1VarU = ((y1c1) obj2).U(pb31.class);
                    Object value2 = zob1VarU.getValue();
                    lb31Var = value2 instanceof lb31 ? (lb31) value2 : null;
                    if (lb31Var == null) {
                        p90 p90Var = new p90(zob1VarU, (byte) 4);
                        this.b = true;
                        objI = b5p1.i(p90Var, this);
                        if (objI == d9nVar) {
                            return d9nVar;
                        }
                    }
                    List<nsn> list = lb31Var.c;
                    arrayList = new ArrayList();
                    for (nsn nsnVar2 : list) {
                        if (nsnVar2 instanceof nsn) {
                            nsnVar = nsnVar2;
                        } else {
                            nsnVar = null;
                        }
                        if (nsnVar != null) {
                            aheVar = new ahe(nsnVar.a, nsnVar.b);
                        } else {
                            aheVar = null;
                        }
                        if (aheVar != null) {
                            arrayList.add(aheVar);
                        }
                    }
                    return arrayList;
                }
                if (!z28) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                objI = obj;
                lb31Var = (lb31) objI;
                List<nsn> list2 = lb31Var.c;
                arrayList = new ArrayList();
                while (r0.hasNext()) {
                    if (nsnVar2 instanceof nsn) {
                        nsnVar = nsnVar2;
                    } else {
                        nsnVar = null;
                    }
                    if (nsnVar != null) {
                        aheVar = new ahe(nsnVar.a, nsnVar.b);
                    } else {
                        aheVar = null;
                    }
                    if (aheVar != null) {
                        arrayList.add(aheVar);
                    }
                }
                return arrayList;
            default:
                boolean z29 = this.b;
                if (z29) {
                    if (z29) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ve01 ve01VarG = d5p1.g(((joe) obj2).c.a);
                s4 s4Var = new s4(2, (lnm) null, (byte) 29);
                this.b = true;
                Object objJ3 = b5p1.j(ve01VarG, s4Var, this);
                return objJ3 == d9nVar ? d9nVar : objJ3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vk6(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
    }
}
