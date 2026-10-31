package p;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.appauthorization.sso.AuthorizationActivity;
import com.spotify.betamax.playerimpl.tracking.BetamaxPlaybackSessionUpdateAfterCommitException;
import com.spotify.messages.BetamaxPlaybackSession;
import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;
import com.spotify.pam.v2.BenefitListItems;
import com.spotify.pam.v2.GetPlanDetailsViewRequest;
import com.spotify.pam.v2.GetPlanDetailsViewResponse;
import com.spotify.pending_events.esperanto.proto.AddPendingEventRequest;
import com.spotify.pending_events.esperanto.proto.CommitPendingEventRequest;
import com.spotify.pending_events.esperanto.proto.ReplacePendingEventRequest;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function4;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class t4d1 implements qiw, Function, ya, Producer, SingleOnSubscribe, Function4, xi7, ida {
    public final /* synthetic */ byte a;
    public final Object b;

    public t4d1(RecyclerView recyclerView, qxx0 qxx0Var) {
        this.a = (byte) 3;
        this.b = qxx0Var;
        recyclerView.setAdapter(qxx0Var);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        k3s k3sVar = new k3s();
        ((zw81) k3sVar).g = false;
        recyclerView.setItemAnimator(k3sVar);
        recyclerView.setClipToPadding(false);
        rwq0.s(recyclerView, o40.g);
    }

    public Object N(Object obj, Object obj2, Object obj3, Object obj4) {
        PlayerState playerState = (PlayerState) obj;
        ota1 ota1Var = (ota1) obj2;
        ogl1 ogl1Var = (ogl1) obj3;
        spq0 spq0Var = (spq0) obj4;
        ContextTrack contextTrack = (ContextTrack) playerState.track().h();
        pgl1 pgl1Var = null;
        if (!u890.j(contextTrack != null ? l4o1.b0(contextTrack) : null, ogl1Var.a)) {
            return j5.a;
        }
        Integer numValueOf = Integer.valueOf(ota1Var.a);
        ktl ktlVar = ogl1Var.b;
        pgl1 pgl1Var2 = (pgl1) spq0Var.h();
        if (pgl1Var2 != null) {
            ys4 ys4Var = (ys4) this.b;
            String str = pgl1Var2.a;
            ContextTrack contextTrack2 = (ContextTrack) playerState.track().h();
            if (str.equals(contextTrack2 != null ? ys4Var.a(contextTrack2) : null)) {
                pgl1Var = pgl1Var2;
            }
        }
        return new i5w0(new t0i0(playerState, numValueOf, ktlVar, pgl1Var));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable a(onm onmVar) {
        ut2 ut2Var;
        Object next;
        if (onmVar instanceof ut2) {
            ut2Var = (ut2) onmVar;
            int i = ut2Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ut2Var.c = i - Integer.MIN_VALUE;
            } else {
                ut2Var = new ut2(this, onmVar);
            }
        } else {
            ut2Var = new ut2(this, onmVar);
        }
        Object objE = ut2Var.a;
        int i2 = ut2Var.c;
        if (i2 == 0) {
            hm5.M(objE);
            wr2 wr2Var = (jr2) this.b;
            ut2Var.c = 1;
            objE = wr2Var.e("chat", ut2Var);
            d9n d9nVar = d9n.a;
            if (objE == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objE);
        }
        Iterable<ir2> iterable = (Iterable) objE;
        ArrayList arrayList = new ArrayList(q7h.U(iterable, 10));
        for (ir2 ir2Var : iterable) {
            String str = ir2Var.a;
            String str2 = ir2Var.b;
            Iterator it = o7h.k0(ihc1.P0(ir2Var.d, new char[]{'-'}, 6), 1).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                String str3 = (String) next;
                if (str3.length() == 2) {
                    break;
                }
                if (str3.length() == 3) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= str3.length()) {
                            break;
                        }
                        if (!Character.isDigit(str3.charAt(i3))) {
                            break;
                        }
                        i3++;
                    }
                }
            }
            String str4 = (String) next;
            String upperCase = str4 != null ? str4.toUpperCase(Locale.ROOT) : null;
            if (upperCase == null) {
                upperCase = "";
            }
            arrayList.add(new kx2(str, str2, upperCase, Locale.forLanguageTag(ir2Var.c)));
        }
        return arrayList;
    }

    public boolean accept(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 7:
                return ((bp4) obj2).a() && ((ksk) obj).b;
            default:
                return ((ksk) obj).c == le30.b && ((dp4) obj2).b();
        }
    }

    public Object apply(Object obj) {
        Single singleJust;
        String str;
        String strN;
        byte b = this.a;
        final byte b2 = 0;
        o6x o6xVar = o6x.a;
        final byte b3 = 1;
        String str2 = null;
        Object obj2 = this.b;
        switch (b) {
            case 2:
                fwo0 fwo0Var = (fwo0) obj;
                if (fwo0Var instanceof dwo0) {
                    return Single.never();
                }
                if (!(fwo0Var instanceof ewo0)) {
                    eg.o();
                    return null;
                }
                String str3 = ((ewo0) fwo0Var).a;
                if (str3 != null && (singleJust = Single.just(str3)) != null) {
                    return singleJust;
                }
                yu yuVar = (yu) obj2;
                return yuVar.e.x(bbn.b).z().flatMap(new w4b1(yuVar, (byte) 4));
            case 4:
                u11 u11Var = (u11) obj2;
                return rqt0.F(o6xVar, new q4(u11Var, (b1f0) obj, str2, (byte) 17)).map(new w4b1(u11Var, (byte) 7)).onErrorReturn(new e4b1(u11Var, (byte) 5)).toObservable();
            case 5:
                g401 g401Var = (g401) obj;
                return rqt0.F(o6xVar, new q4((ak1) obj2, g401Var, str2, (byte) 19)).toObservable().onErrorReturn(new e4b1(g401Var, (byte) 7));
            case 6:
                bx41 bx41Var = (bx41) obj;
                cz1 cz1Var = (cz1) obj2;
                tv80 tv80Var = bx41Var.c;
                String str4 = bx41Var.b;
                if (str4.length() != 0) {
                    return j2h1.D(o6xVar, new nn01(cz1Var.b, bx41Var.d, tv80Var, null, (byte) 0)).d(Observable.just(new c051(str4, tv80Var)));
                }
                Observable observableEmpty = Observable.empty();
                observableEmpty.getClass();
                return observableEmpty;
            case 21:
                return new CompletableFromAction(new xe8((dma1) obj, (ye8) obj2, (byte) 1));
            case 22:
                Object obj3 = ((e331) obj).a;
                zwe0 zwe0Var = (zwe0) obj2;
                rf8 rf8Var = zwe0Var.b;
                Throwable thA = e331.a(obj3);
                if (thA == null) {
                    return ((Single) rf8Var.d.invoke((byte[]) obj3)).map(cxo1.t).onErrorReturn(new e4b1(zwe0Var, (byte) 29));
                }
                try {
                    rf8Var.e.invoke();
                    break;
                } catch (Throwable unused) {
                }
                return Single.just(new rxe0(kto1.E(thA)));
            case 23:
                mq8 mq8Var = (mq8) obj;
                AuthorizationActivity authorizationActivity = (AuthorizationActivity) obj2;
                zq8 zq8Var = authorizationActivity.l1;
                if (zq8Var == null) {
                    u890.C("authorizationRequestProducer");
                    throw null;
                }
                ObservableEmitter observableEmitter = zq8Var.a;
                if (observableEmitter != null) {
                    observableEmitter.onNext(mq8Var);
                }
                lag lagVar = authorizationActivity.q1;
                if (lagVar == null) {
                    u890.C("clientAuthLogger");
                    throw null;
                }
                String callingPackage = authorizationActivity.getCallingPackage();
                if (callingPackage == null) {
                    callingPackage = "unknown_package_name";
                }
                return lagVar.k(callingPackage, mq8Var.a);
            case 25:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                x610 x610Var = ((kc9) obj2).k;
                if (zBooleanValue) {
                    return x610Var.c().i(15000L, j5.a);
                }
                g710 g710VarC = x610Var.c();
                g710VarC.getClass();
                return g710VarC.k.a(new l9u0()).doOnSuccess(new b710(g710VarC, (byte) 0));
            default:
                ion ionVar = (sfs0) obj;
                final noa noaVar = (noa) obj2;
                kba kbaVar = noaVar.r1;
                Scheduler scheduler = noaVar.q1;
                final byte b4 = 2;
                if (!noaVar.I1) {
                    if (!(ionVar instanceof ion)) {
                        if (!(ionVar instanceof oqh)) {
                            eg.o();
                            return null;
                        }
                        doa doaVar = noaVar.A1;
                        if (doaVar == null) {
                            noaVar.U(new Exception("An event must have been created before `Commit`"));
                            return CompletableEmpty.a;
                        }
                        kbaVar.getClass();
                        pqh pqhVarN = CommitPendingEventRequest.n();
                        pqhVarN.n(doaVar.a);
                        pqhVarN.q(doaVar.b);
                        return ((vfs0) kbaVar.b).callSingle("spotify.pending_events.esperanto.proto.PendingEvents", "CommitPendingEvent", pqhVarN.build()).map(xj20.W0).flatMapCompletable(ns80.O0).n(scheduler).h(new Consumer() { // from class: p.moa
                            public final void accept(Object obj4) {
                                byte b5 = b4;
                                noa noaVar2 = noaVar;
                                switch (b5) {
                                    case 0:
                                        noaVar2.U((Throwable) obj4);
                                        break;
                                    case 1:
                                        noaVar2.U((Throwable) obj4);
                                        break;
                                    default:
                                        noaVar2.U((Throwable) obj4);
                                        break;
                                }
                            }
                        }).o(Functions.h).g(new f72(noaVar, (byte) 6));
                    }
                    doa doaVar2 = noaVar.A1;
                    if (doaVar2 == null) {
                        BetamaxPlaybackSession betamaxPlaybackSession = ionVar.a;
                        kbaVar.getClass();
                        ii1 ii1VarN = AddPendingEventRequest.n();
                        ii1VarN.q("BetamaxPlaybackSession");
                        ii1VarN.n(betamaxPlaybackSession.toByteString());
                        return ((vfs0) kbaVar.b).callSingle("spotify.pending_events.esperanto.proto.PendingEvents", "AddPendingEvent", ii1VarN.build()).map(dj20.U0).flatMap(mm10.R0).observeOn(scheduler).flatMapCompletable(new fp8(noaVar, (byte) 5)).h(new Consumer() { // from class: p.moa
                            public final void accept(Object obj4) {
                                byte b5 = b2;
                                noa noaVar2 = noaVar;
                                switch (b5) {
                                    case 0:
                                        noaVar2.U((Throwable) obj4);
                                        break;
                                    case 1:
                                        noaVar2.U((Throwable) obj4);
                                        break;
                                    default:
                                        noaVar2.U((Throwable) obj4);
                                        break;
                                }
                            }
                        }).o(Functions.h);
                    }
                    BetamaxPlaybackSession betamaxPlaybackSession2 = ionVar.a;
                    kbaVar.getClass();
                    lf21 lf21VarN = ReplacePendingEventRequest.n();
                    lf21VarN.r(doaVar2.a);
                    lf21VarN.s(doaVar2.b);
                    lf21VarN.q("BetamaxPlaybackSession");
                    lf21VarN.n(betamaxPlaybackSession2.toByteString());
                    return ((vfs0) kbaVar.b).a(lf21VarN.build()).flatMap(new lo9(doaVar2, (byte) 2)).observeOn(scheduler).flatMapCompletable(bya0.Y).h(new Consumer() { // from class: p.moa
                        public final void accept(Object obj4) {
                            byte b5 = b3;
                            noa noaVar2 = noaVar;
                            switch (b5) {
                                case 0:
                                    noaVar2.U((Throwable) obj4);
                                    break;
                                case 1:
                                    noaVar2.U((Throwable) obj4);
                                    break;
                                default:
                                    noaVar2.U((Throwable) obj4);
                                    break;
                            }
                        }
                    }).o(Functions.h);
                }
                if (ionVar instanceof ion) {
                    ion ionVar2 = ionVar;
                    int i = ionVar2.b;
                    if (i == 1) {
                        str = "PLAYBACK_READY";
                    } else if (i == 2) {
                        str = "PLAYBACK_PAUSED";
                    } else if (i == 3) {
                        str = "PLAYBACK_RESUMED";
                    } else if (i == 4) {
                        str = "FIFTEEN_SECOND_INTERVAL_UPDATE";
                    } else {
                        if (i != 5) {
                            throw null;
                        }
                        str = "PLAYBACK_ENDED";
                    }
                    strN = ionVar2.a.n();
                } else {
                    str = "";
                    strN = "";
                }
                String str5 = ((roa) noaVar).a.d;
                long j = noaVar.H1;
                doa doaVar3 = noaVar.A1;
                Integer numValueOf = doaVar3 != null ? Integer.valueOf(doaVar3.b) : null;
                doa doaVar4 = noaVar.A1;
                str2 = doaVar4 != null ? doaVar4.a : null;
                boolean zIsDisposed = noaVar.G1.isDisposed();
                StringBuilder sbN = gvg.n("Attempted to update an event after commit - sessionId: ", str5, " featureId: ", strN, "msPlayed: ");
                sbN.append(j);
                sbN.append("event.tokenSequenceNo: ");
                sbN.append(numValueOf);
                bb00.j(sbN, " event.tokenEventName: ", str2, "consumeEvent.updateReason: ", str);
                sbN.append("disposable.isDisposed: ");
                sbN.append(zIsDisposed);
                noaVar.U(new BetamaxPlaybackSessionUpdateAfterCommitException(sbN.toString()));
                return CompletableEmpty.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(String str, onm onmVar, boolean z) {
        lv9 lv9Var;
        if (onmVar instanceof lv9) {
            lv9Var = (lv9) onmVar;
            int i = lv9Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lv9Var.c = i - Integer.MIN_VALUE;
            } else {
                lv9Var = new lv9(this, onmVar);
            }
        } else {
            lv9Var = new lv9(this, onmVar);
        }
        Object objJ = lv9Var.a;
        int i2 = lv9Var.c;
        int i3 = 1;
        if (i2 == 0) {
            hm5.M(objJ);
            enr0 enr0Var = (enr0) this.b;
            so40 so40VarN = GetPlanDetailsViewRequest.n();
            so40VarN.n(str);
            GetPlanDetailsViewRequest getPlanDetailsViewRequestBuild = so40VarN.build();
            lv9Var.c = 1;
            objJ = enr0Var.j(getPlanDetailsViewRequestBuild, lv9Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        GetPlanDetailsViewResponse getPlanDetailsViewResponse = (GetPlanDetailsViewResponse) objJ;
        String name = getPlanDetailsViewResponse.p().getName();
        String strP = getPlanDetailsViewResponse.p().p();
        String strS = getPlanDetailsViewResponse.p().s();
        String title = getPlanDetailsViewResponse.n().getTitle();
        h290<BenefitListItems> h290VarN = getPlanDetailsViewResponse.n().n();
        ArrayList arrayList = new ArrayList(q7h.U(h290VarN, 10));
        for (BenefitListItems benefitListItems : h290VarN) {
            arrayList.add(new eka(benefitListItems.n(), benefitListItems.p(), benefitListItems.o()));
        }
        zmp0 zmp0Var = new zmp0(name, strP, strS, getPlanDetailsViewResponse.p().getDescription(), new uja(title, getPlanDetailsViewResponse.n().o(), getPlanDetailsViewResponse.n().p(), arrayList), getPlanDetailsViewResponse.p().r(), getPlanDetailsViewResponse.p().n(), getPlanDetailsViewResponse.p().o());
        y6u y6uVar = new y6u(getPlanDetailsViewResponse.o().p(), getPlanDetailsViewResponse.o().o());
        int iOrdinal = getPlanDetailsViewResponse.r().ordinal();
        if (iOrdinal != 1) {
            i3 = 4;
            if (iOrdinal == 4) {
                i3 = 3;
            }
        }
        return new k8t0(zmp0Var, y6uVar, i3, getPlanDetailsViewResponse.q());
    }

    public Object get() {
        return new SchedulerWorkRunner(((ks3) this.b).c);
    }

    public Single l(Intent intent, th61 th61Var) {
        b72 b72Var = (b72) this.b;
        return ((Observable) b72Var.b).onErrorResumeNext(pbo1.i).first(iv8.c).flatMapCompletable(new it8(intent, b72Var, (byte) 1)).e(Single.just(crn0.a));
    }

    public void subscribe(SingleEmitter singleEmitter) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 12:
                o84 o84Var = (o84) obj;
                singleEmitter.onSuccess(new n84((m84) Single.create(new x5j1(o84Var, (byte) 14)).blockingGet(), ((Number) Single.create(new lan1(o84Var, (byte) 16)).blockingGet()).intValue()));
                break;
            case 13:
                eh4 eh4Var = (eh4) obj;
                luk lukVar = eh4Var.l;
                if (lukVar == null || !lukVar.i("android-feature-nowplaying-queue-bottom-sheet.is_swipe_to_play_next_in_queue_enabled")) {
                    lukVar = eh4Var.m;
                }
                if (lukVar != null) {
                    lukVar.e(new dh4(singleEmitter, eh4Var, (byte) 1));
                }
                break;
            case 14:
                hk4 hk4Var = (hk4) obj;
                luk lukVar2 = hk4Var.i;
                if (lukVar2 == null || !lukVar2.i("android-gen-alpha.use_kids_view_get_children")) {
                    lukVar2 = hk4Var.j;
                }
                if (lukVar2 != null) {
                    lukVar2.e(new p54(singleEmitter, hk4Var, (byte) 5));
                }
                break;
            default:
                ax4 ax4Var = (ax4) obj;
                luk lukVar3 = ax4Var.q;
                if (lukVar3 == null || !lukVar3.i("android-perf-tracking.observability_platform_enabled")) {
                    lukVar3 = ax4Var.r;
                }
                if (lukVar3 != null) {
                    lukVar3.e(new zw4(singleEmitter, ax4Var, (byte) 1));
                }
                break;
        }
    }

    public void v(Object obj) {
        Boolean bool = (Boolean) obj;
        bool.getClass();
        ((hrr0) ((sp) this.b).h).setValue(bool);
    }

    public /* synthetic */ t4d1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public t4d1(Context context) {
        this.a = (byte) 11;
        this.b = (ActivityManager) context.getSystemService("activity");
    }
}
