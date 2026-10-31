package p;

import android.view.View;
import androidx.work.CoroutineWorker;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.protobuf.Empty;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.base.java.logging.Logger;
import com.spotify.connect.esperanto.proto.ConnectMessages;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.command.SignalCommand;
import com.spotify.storage.esperanto.proto.EsStorage;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableElementAtSingle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import retrofit2.HttpException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class awe extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ awe(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                return new awe((cwe) obj2, lnmVar, (byte) 0);
            case 1:
                return new awe((nwe) obj2, lnmVar, (byte) 1);
            case 2:
                return new awe((dlf) obj2, lnmVar, (byte) 2);
            case 3:
                return new awe((uq8) obj2, lnmVar, (byte) 3);
            case 4:
                return new awe((l4g) obj2, lnmVar, (byte) 4);
            case 5:
                return new awe((sbg) obj2, lnmVar, (byte) 5);
            case 6:
                return new awe((cce) obj2, lnmVar, (byte) 6);
            case 7:
                return new awe((b72) obj2, lnmVar, (byte) 7);
            case 8:
                return new awe((yfg) obj2, lnmVar, (byte) 8);
            case 9:
                return new awe((fbh) obj2, lnmVar, (byte) 9);
            case 10:
                return new awe((nqh) obj2, lnmVar, (byte) 10);
            case 11:
                return new awe((stk) obj2, lnmVar, (byte) 11);
            case 12:
                return new awe((mxk) obj2, lnmVar, (byte) 12);
            case 13:
                return new awe((FlowableElementAtSingle) obj2, lnmVar, (byte) 13);
            case 14:
                return new awe((c3l) obj2, lnmVar, (byte) 14);
            case 15:
                return new awe((m8l) obj2, lnmVar, (byte) 15);
            case 16:
                return new awe((a9l) obj2, lnmVar, (byte) 16);
            case 17:
                return new awe((fal) obj2, lnmVar, (byte) 17);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new awe((kly0) obj2, lnmVar, (byte) 18);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return new awe((ConstraintTrackingWorker) obj2, lnmVar, (byte) 19);
            case 20:
                return new awe((i5m) obj2, lnmVar, (byte) 20);
            case 21:
                return new awe((r7m) obj2, lnmVar, (byte) 21);
            case 22:
                return new awe((odm) obj2, lnmVar, (byte) 22);
            case 23:
                return new awe((d520) obj2, lnmVar, (byte) 23);
            case 24:
                return new awe((g1i) obj2, lnmVar, (byte) 24);
            case 25:
                return new awe((v1k) obj2, lnmVar, (byte) 25);
            case 26:
                return new awe((btm) obj2, lnmVar, (byte) 26);
            case 27:
                return new awe((CoroutineWorker) obj2, lnmVar, (byte) 27);
            case 28:
                return new awe((mwn) obj2, lnmVar, (byte) 28);
            default:
                return new awe((asn) obj2, lnmVar, (byte) 29);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((PlayerState) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 11:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 12:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 14:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 15:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 16:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 17:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 20:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
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
            case 28:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: retrofit2.HttpException */
    public final Object invokeSuspend(Object obj) throws HttpException {
        Object objQ;
        Object objB;
        Object objH;
        Object objA;
        Object objJ;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    Completable completableB = ((cwe) obj2).c.b("chats-disclaimer-accepted", "1");
                    this.b = true;
                    return fc11.i(completableB, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                nwe nweVar = (nwe) obj2;
                boolean z2 = this.b;
                try {
                    if (!z2) {
                        hm5.M(obj);
                        z1p z1pVar = nweVar.b2;
                        if (z1pVar == null) {
                            u890.C("chatDisclaimer");
                            throw null;
                        }
                        cwe cweVar = (cwe) z1pVar.get();
                        this.b = true;
                        if (cweVar.a(this) == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!z2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    nweVar.Y0();
                    return rih1Var;
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception unused) {
                    nweVar.r1(false);
                    View view = ((zf30) nweVar).j1;
                    if (view == null) {
                        return rih1Var;
                    }
                    int[] iArr = yq91.t;
                    yq91.i(view, view.getResources().getText(2131953604), 0).k();
                    return rih1Var;
                }
            case 2:
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    this.b = true;
                    bma1 bma1Var = dlf.e;
                    return ((dlf) obj2).b(this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z3) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                boolean z4 = this.b;
                if (z4) {
                    if (z4) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Single map = ((byp0) ((uq8) obj2).b).a.callSingle("spotify.offline_esperanto.proto.Offline", "LicenseStatus", Empty.n()).map(ta20.T0).map(va20.T0);
                this.b = true;
                Object objJ2 = fc11.j(map, this);
                return objJ2 == d9nVar ? d9nVar : objJ2;
            case 4:
                boolean z5 = this.b;
                if (z5) {
                    if (z5) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                o95 o95Var = ((l4g) obj2).d;
                Float f = new Float(1.0f);
                n8b1 n8b1Var = q2g.b;
                this.b = true;
                return o95.b(o95Var, f, n8b1Var, (Float) null, (iu30) null, this, 12) == d9nVar ? d9nVar : rih1Var;
            case 5:
                sbg sbgVar = (sbg) obj2;
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
                cwl1.H(sbgVar.g).f(sbgVar.h.e(), (Set) null);
                iib iibVarA = sbgVar.e.a();
                fdd fddVar = new fdd(sbgVar, (byte) 7);
                this.b = true;
                Object objCollect = iibVarA.collect(new kmf(fddVar, (byte) 17), this);
                if (objCollect != d9nVar) {
                    objCollect = rih1Var;
                }
                return objCollect == d9nVar ? d9nVar : rih1Var;
            case 6:
                boolean z7 = this.b;
                if (z7) {
                    if (z7) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                cce cceVar = (cce) obj2;
                xyc0 xyc0Var = (iyc0) cceVar.c;
                mdg mdgVar = (mdg) cceVar.d;
                String str = mdgVar.a;
                String str2 = mdgVar.b;
                this.b = true;
                xyc0 xyc0Var2 = xyc0Var;
                Object objH2 = c921.H(xyc0Var2.c, new ary(str, xyc0Var2, str2, (lnm) null, (byte) 11), this);
                return objH2 == d9nVar ? d9nVar : objH2;
            case 7:
                b72 b72Var = (b72) obj2;
                xgn0 xgn0Var = (xgn0) b72Var.c;
                boolean z8 = this.b;
                try {
                    try {
                        if (!z8) {
                            hm5.M(obj);
                            if (!xgn0Var.g()) {
                                return rih1Var;
                            }
                            jn7 jn7Var = (jn7) b72Var.b;
                            EsStorage.DeleteUnlockedItemsParams deleteUnlockedItemsParamsN = EsStorage.DeleteUnlockedItemsParams.n();
                            this.b = true;
                            if (jn7Var.m(deleteUnlockedItemsParamsN, this) == d9nVar) {
                                return d9nVar;
                            }
                        } else {
                            if (!z8) {
                                eg.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            hm5.M(obj);
                        }
                    } catch (Throwable th) {
                        xgn0Var.c((Object) null);
                        throw th;
                    }
                    break;
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Exception unused2) {
                }
                xgn0Var.c((Object) null);
                return rih1Var;
            case 8:
                boolean z9 = this.b;
                if (z9) {
                    if (z9) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                gwy0 gwy0Var = ((yfg) obj2).a;
                List list = yfg.c;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new jwy0((String) it.next()));
                }
                this.b = true;
                return gwy0Var.a("jam", arrayList, 1) == d9nVar ? d9nVar : rih1Var;
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
                fbh fbhVar = (fbh) obj2;
                mr20 mr20Var = fbhVar.g;
                fdd fddVar2 = new fdd(fbhVar, (byte) 10);
                this.b = true;
                return mr20Var.collect(fddVar2, this) == d9nVar ? d9nVar : rih1Var;
            case 10:
                boolean z11 = this.b;
                if (!z11) {
                    hm5.M(obj);
                    ayh ayhVar = (ayh) ((nqh) obj2).b.b;
                    this.b = true;
                    objQ = ayhVar.Q(this);
                    if (objQ == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z11) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objQ = obj;
                }
                return new ei31((String) objQ);
            case 11:
                stk stkVar = (stk) obj2;
                boolean z12 = this.b;
                if (!z12) {
                    hm5.M(obj);
                    xv51 xv51Var = stkVar.a;
                    this.b = true;
                    objB = xv51Var.b(this);
                    if (objB == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z12) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objB = obj;
                }
                String str3 = (String) objB;
                mia1 mia1VarA = stkVar.b.a();
                bpb1 bpb1Var = stkVar.c;
                ztc ztcVarA = ztc.a((ztc) bpb1Var.getValue(), mia1VarA, str3 != null ? Collections.singletonList(str3) : z6x.a, 0, 250);
                bpb1Var.getClass();
                bpb1Var.m((Object) null, ztcVarA);
                return rih1Var;
            case 12:
                mxk mxkVar = (mxk) obj2;
                boolean z13 = this.b;
                try {
                    if (!z13) {
                        hm5.M(obj);
                        this.b = true;
                        if (mxkVar.k(this) == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!z13) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    mxkVar.i();
                    return rih1Var;
                } catch (CancellationException e3) {
                    throw e3;
                } catch (Throwable th2) {
                    mxkVar.h(th2);
                    return rih1Var;
                }
            case 13:
                boolean z14 = this.b;
                if (!z14) {
                    hm5.M(obj);
                    this.b = true;
                    Object objJ3 = fc11.j((FlowableElementAtSingle) obj2, this);
                    return objJ3 == d9nVar ? d9nVar : objJ3;
                }
                if (z14) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 14:
                boolean z15 = this.b;
                if (!z15) {
                    hm5.M(obj);
                    jn7 jn7Var2 = ((c3l) obj2).a;
                    Empty emptyN = Empty.n();
                    this.b = true;
                    objH = jn7Var2.h(emptyN, this);
                    if (objH == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z15) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objH = obj;
                }
                return Boolean.valueOf(((ConnectMessages.ClusterUpdateAfterBackendConnectionResponse) objH).o());
            case 15:
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
                m8l m8lVar = (m8l) obj2;
                this.b = true;
                wef wefVar = new wef(yoi1.g(m8lVar.b.d()), (byte) 12);
                Flowable flowable = m8lVar.a;
                vbm[] vbmVarArr = q601.a;
                Object objCollect2 = rqt0.w(new x010(wefVar, new xy0(new kge(flowable), (byte) 11), l8l.h, (byte) 1), xj.a1, rqt0.b).collect(new fdd(m8lVar, (byte) 13), this);
                if (objCollect2 != d9nVar) {
                    objCollect2 = rih1Var;
                }
                return objCollect2 == d9nVar ? d9nVar : rih1Var;
            case 16:
                a9l a9lVar = (a9l) obj2;
                boolean z17 = this.b;
                if (z17) {
                    if (z17) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mr20 mr20VarU = rqt0.u(h4p1.g(new tya(rqt0.u(h5p1.r(a9lVar.b, new lt20(new ht20(rqt0.u(o4p1.k(h4p1.f(new m3n0(a9lVar.e, (lnm) null, (byte) 18)), -1, 2)), new z8l(a9lVar, (lnm) null, (byte) 1)), new rf2(3, (lnm) null, (byte) 14), (byte) 0), a9lVar.c, a9lVar.d, new y8l(5, (lnm) null, (byte) 0))), (lnm) null, (byte) 3)));
                z8l z8lVar = new z8l(a9lVar, (lnm) null, (byte) 0);
                this.b = true;
                return l4p1.q(mr20VarU, z8lVar, this) == d9nVar ? d9nVar : rih1Var;
            case 17:
                fal falVar = (fal) obj2;
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
                mr20 mr20VarU2 = rqt0.u(((ttz) falVar.b.get()).a);
                zti ztiVar = new zti(falVar, (lnm) null, (byte) 21);
                this.b = true;
                return l4p1.q(mr20VarU2, ztiVar, this) == d9nVar ? d9nVar : rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                boolean z19 = this.b;
                try {
                    if (!z19) {
                        hm5.M(obj);
                        bel belVar = (bel) ((kly0) obj2).get();
                        this.b = true;
                        objA = belVar.a(this);
                        if (objA == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!z19) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                        objA = obj;
                    }
                    return (List) objA;
                } catch (CancellationException e4) {
                    throw e4;
                } catch (Exception unused3) {
                }
                break;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                boolean z20 = this.b;
                if (!z20) {
                    hm5.M(obj);
                    this.b = true;
                    Object objJ4 = ((ConstraintTrackingWorker) obj2).j(this);
                    return objJ4 == d9nVar ? d9nVar : objJ4;
                }
                if (z20) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 20:
                boolean z21 = this.b;
                try {
                    if (!z21) {
                        hm5.M(obj);
                        Single singleA = ((i5m) obj2).d.a(new k9u0(SignalCommand.create("reshuffle")));
                        this.b = true;
                        objJ = fc11.j(singleA, this);
                        if (objJ == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!z21) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                        objJ = obj;
                    }
                    objJ.getClass();
                    return rih1Var;
                } catch (CancellationException e5) {
                    throw e5;
                } catch (Exception e6) {
                    Logger.e(e6, "Reshuffle from the content-resumed snackbar failed", new Object[0]);
                    return rih1Var;
                }
            case 21:
                boolean z22 = this.b;
                if (z22) {
                    if (z22) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                uji1 uji1Var = (uji1) ((r7m) obj2).d;
                this.b = true;
                Object objI = b5p1.i(uji1Var, this);
                return objI == d9nVar ? d9nVar : objI;
            case 22:
                odm odmVar = (odm) obj2;
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
                lt20 lt20Var = new lt20((sen0) odmVar.e, new jk(3, (lnm) null, (byte) 19), (byte) 0);
                fdd fddVar3 = new fdd(odmVar, (byte) 17);
                this.b = true;
                return lt20Var.collect(fddVar3, this) == d9nVar ? d9nVar : rih1Var;
            case 23:
                d520 d520Var = (d520) obj2;
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
                lt20 lt20Var2 = new lt20((x010) d520Var.c, new ew0(d520Var, (lnm) null, (byte) 14), (byte) 0);
                fdd fddVar4 = new fdd(d520Var, (byte) 18);
                this.b = true;
                return lt20Var2.collect(fddVar4, this) == d9nVar ? d9nVar : rih1Var;
            case 24:
                g1i g1iVar = (g1i) obj2;
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
                Flowable flowable2 = (Flowable) g1iVar.c;
                vbm[] vbmVarArr2 = q601.a;
                mr20 mr20VarU3 = rqt0.u(new x010(new kge(flowable2), yoi1.g(((c3s) g1iVar.d).f), new qr0(g1iVar, (lnm) null, (byte) 10), (byte) 1));
                fdd fddVar5 = new fdd(g1iVar, (byte) 19);
                this.b = true;
                return mr20VarU3.collect(fddVar5, this) == d9nVar ? d9nVar : rih1Var;
            case 25:
                boolean z26 = this.b;
                if (z26) {
                    if (z26) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Flowable flowable3 = (Flowable) ((v1k) obj2).b;
                vbm[] vbmVarArr3 = q601.a;
                kge kgeVar = new kge(flowable3);
                this.b = true;
                Object objI2 = b5p1.i(kgeVar, this);
                return objI2 == d9nVar ? d9nVar : objI2;
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
                btm btmVar = (btm) obj2;
                d0r d0rVar = btmVar.d;
                oum oumVar = btmVar.g;
                etm etmVar = btmVar.c;
                String str4 = etmVar.b;
                String str5 = etmVar.c;
                String str6 = etmVar.d;
                String str7 = etmVar.e;
                los losVar = btmVar.b;
                lwq lwqVar = btmVar.e;
                zsm zsmVar = oumVar.f ? new zsm(btmVar, (byte) 2) : null;
                this.b = true;
                return vgo1.w(d0rVar, oumVar, str4, str5, str6, str7, losVar, lwqVar, zsmVar, this) == d9nVar ? d9nVar : rih1Var;
            case 27:
                boolean z28 = this.b;
                if (!z28) {
                    hm5.M(obj);
                    this.b = true;
                    Object objH3 = ((CoroutineWorker) obj2).h();
                    return objH3 == d9nVar ? d9nVar : objH3;
                }
                if (z28) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 28:
                mwn mwnVar = (mwn) obj2;
                boolean z29 = this.b;
                if (z29) {
                    if (z29) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                f5y0 f5y0Var = ((bq11) mwnVar.c.getValue()).f;
                fdd fddVar6 = new fdd(mwnVar, (byte) 20);
                this.b = true;
                return f5y0Var.collect(fddVar6, this) == d9nVar ? d9nVar : rih1Var;
            default:
                asn asnVar = (asn) obj2;
                boolean z30 = this.b;
                if (z30) {
                    if (z30) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mr20 mr20VarC = ((qns0) asnVar.a).c();
                fdd fddVar7 = new fdd(asnVar, (byte) 21);
                this.b = true;
                return mr20VarC.collect(fddVar7, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
