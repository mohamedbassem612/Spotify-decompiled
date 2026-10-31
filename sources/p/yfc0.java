package p;

import android.net.nsd.NsdServiceInfo;
import androidx.media3.common.VideoFrameProcessingException;
import com.spotify.base.java.logging.Logger;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ConflictResolutionStrategy;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DynamicTagsMetadata;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.TriggerType;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.playlist.ai.creation.v2.GetMessageHistoryRequest;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableMergeDelayErrorIterable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatWithSingle;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableTake;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class yfc0 implements Function, SingleOnSubscribe, uoj1 {
    public final /* synthetic */ byte a;
    public final Object b;

    public yfc0(hwb hwbVar, qfl1 qfl1Var) {
        this.a = (byte) 24;
        this.b = qfl1Var;
    }

    public void a(VideoFrameProcessingException videoFrameProcessingException) {
        mym0 mym0Var = (mym0) this.b;
        mym0Var.e.execute(new zyh0(mym0Var, videoFrameProcessingException, (byte) 9));
    }

    public Object apply(Object obj) {
        byte b = this.a;
        o6x o6xVar = o6x.a;
        boolean z = false;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return new il51((List) obj, (String) ((v6a0) obj2).c, 8186);
            case 1:
                qsn qsnVar = (qsn) obj;
                r0x r0xVar = (r0x) obj2;
                Observable observableI = yoi1.i(((b7n) r0xVar.e).a(s6n.a), o6xVar);
                Observable map = ((wf4) r0xVar.g).b() ? ((o241) r0xVar.f).a.map(rh20.t) : Observable.just(Boolean.FALSE);
                map.getClass();
                Observable observableDistinctUntilChanged = map.distinctUntilChanged();
                mr20 huzVar = (mr20) r0xVar.j;
                if (huzVar == null) {
                    huzVar = new huz(Boolean.valueOf(r0xVar.b), (byte) 10);
                }
                return Observable.combineLatest(observableI, observableDistinctUntilChanged, yoi1.i(huzVar, o6xVar), xi20.t).switchMap(new ye90(r0xVar, qsnVar, (byte) 24));
            case 2:
            case 7:
            case 13:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
            case 21:
            default:
                return ((jap0) obj2).b((NsdServiceInfo) obj);
            case 3:
                ppd0 ppd0Var = (ppd0) obj2;
                qpd0 qpd0Var = new qpd0(ppd0Var.i.a, ((Boolean) obj).booleanValue());
                ppd0Var.i = qpd0Var;
                return qpd0Var;
            case 4:
                if (((Boolean) obj).booleanValue()) {
                    return Flowable.a0(30L, TimeUnit.SECONDS, (Scheduler) ((o860) obj2).d).J(qs10.X);
                }
                return Flowable.I(oqd0.a);
            case 5:
                mqx0 mqx0Var = (mqx0) obj;
                h4e0 h4e0Var = (h4e0) obj2;
                j23 j23Var = h4e0Var.b;
                String str = mqx0Var.a;
                long j = mqx0Var.b;
                j23 j23Var2 = j23Var;
                r23 r23Var = j23Var2.a;
                GetMessageHistoryRequest.Builder builderNewBuilder = GetMessageHistoryRequest.newBuilder();
                builderNewBuilder.setSessionId(str);
                builderNewBuilder.setBeforeTimestampMs(j);
                return r23Var.a(builderNewBuilder.build()).map(stf0.i).flatMap(new t7o0((Object) j23Var2, (byte) 12)).flatMapObservable(new zc80(h4e0Var, (byte) 14));
            case 6:
                Throwable th = (Throwable) obj;
                String str2 = ((gnh) obj2).a;
                Logger.e(th, l1d.m("Failed to load single comment thread for comment uri: ", str2), new Object[0]);
                return new dph(str2, th);
            case 8:
                bxg0 bxg0Var = (bxg0) obj;
                yon yonVar = (yon) obj2;
                return u890.j(bxg0Var.c, (String) yonVar.e) ? Observable.empty() : j2h1.D(o6xVar, new m2a0(yonVar, bxg0Var, (lnm) null, (byte) 17)).o(Functions.h).d(Observable.empty());
            case 9:
                o3e0 o3e0Var = (o3e0) obj2;
                return !((Boolean) obj).booleanValue() ? Observable.just(new k8f0()) : ((Observable) ((eip0) o3e0Var.b).invoke()).map(new zc80(o3e0Var, (byte) 16));
            case 10:
                return new ObservableFromPublisher(new FlowableTake(((Flowable) obj2).x(zi20.t))).map(aj20.Z);
            case 11:
                Map map2 = (Map) obj;
                buf0 buf0Var = (buf0) obj2;
                if (!y7y0.G(map2)) {
                    buf0Var.b.getClass();
                    if (rh11.c(map2)) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 12:
                ggg0 ggg0Var = (ggg0) obj;
                hgg0 hgg0Var = (hgg0) obj2;
                of8 of8Var = ggg0Var.b;
                return ggg0Var.a ? hgg0Var.a.f(true).map(new zc80(ggg0Var, hgg0Var, (byte) 19)).onErrorReturnItem(new ufg0(fhg0.i, of8Var)) : Single.just(new ufg0(ghg0.i, of8Var));
            case 15:
                return new yki0(!((mki0) obj2).c);
            case 18:
                if (!((Boolean) obj).booleanValue()) {
                    return Observable.just(new mmr0(Boolean.FALSE, 0L));
                }
                vf2 vf2Var = (vf2) obj2;
                return ((ObservableFromPublisher) vf2Var.f).map(new zc80(vf2Var, (byte) 26));
            case 22:
                q1o0 q1o0Var = (q1o0) obj2;
                hma1 hma1VarEdit = q1o0Var.a.b(q1o0Var.e, (String) obj).edit();
                hma1VarEdit.a(bma1.b.n("key_bt_permissions_edu_dialog_count_accurate"), true);
                hma1VarEdit.g();
                return CompletableEmpty.a;
            case 23:
                d3o0 d3o0Var = (d3o0) obj2;
                return Long.valueOf(d3o0Var.a.b(d3o0Var.h, (String) obj).g(bma1.b.n("key_tap_bt_permissions_timestamp"), -1L));
            case 24:
                pqx0 pqx0Var = (pqx0) obj;
                int i = pqx0Var.c ? 2131963862 : 2131963861;
                String strX = hwb.x();
                String strB = pqx0Var.b;
                if (strB == null) {
                    strB = ((qfl1) obj2).b(i, new Object[0]);
                }
                return new jtx0(strX, strB, pqx0Var.a + 1);
            case 25:
                Single singleCast = Single.just((ru50) obj).map(yj20.P0).cast(uu50.class);
                su50 su50Var = su50.a;
                Single singleJust = Single.just(su50Var);
                Scheduler scheduler = (Scheduler) ((cr6) obj2).e;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                Flowable flowableConcatWith = singleCast.concatWith(singleJust.delay(5000L, timeUnit, scheduler));
                Single singleDelay = Single.just(su50Var).delay(2000L, timeUnit, scheduler);
                flowableConcatWith.getClass();
                Objects.requireNonNull(singleDelay, "other is null");
                return new FlowableConcatWithSingle(flowableConcatWith, singleDelay);
            case 26:
                smc0 smc0VarN = k4p1.n();
                ljg ljgVar = ((x3p0) obj2).e;
                String str3 = nik1.l1.a;
                TriggerType triggerType = TriggerType.URI;
                j7a j7aVar = j7a.a;
                smc0VarN.add(ljg.c(ljgVar, str3, triggerType, (String) null, (List) null, (tv80) null, j7aVar, (DynamicTagsMetadata) null, (ConflictResolutionStrategy) null, (d3j0) null, 476).ignoreElement());
                TriggerType triggerType2 = TriggerType.CLIENT_EVENT;
                smc0VarN.add(ljg.c(ljgVar, "nowplayingview:npv-open:v1", triggerType2, (String) null, (List) null, (tv80) null, j7aVar, (DynamicTagsMetadata) null, (ConflictResolutionStrategy) null, (d3j0) null, 476).ignoreElement());
                ContextTrack contextTrack = (ContextTrack) ((PlayerState) obj).track().h();
                if (contextTrack != null && contextTrack.metadata().get("video_association") != null) {
                    smc0VarN.add(ljg.c(ljgVar, "nowplayingview:npv-open-mv:v1", triggerType2, (String) null, (List) null, (tv80) null, j7aVar, (DynamicTagsMetadata) null, (ConflictResolutionStrategy) null, (d3j0) null, 476).ignoreElement());
                }
                smc0 smc0VarK = k4p1.k(smc0VarN);
                Objects.requireNonNull(smc0VarK, "sources is null");
                return new CompletableMergeDelayErrorIterable(smc0VarK);
        }
    }

    public void b(final long j, final boolean z) {
        if (j == 0) {
            ((mym0) this.b).t = true;
        }
        mym0 mym0Var = (mym0) this.b;
        mym0Var.s = j;
        final byte b = 0;
        mym0Var.e.execute(new Runnable() { // from class: p.kym0
            @Override // java.lang.Runnable
            public final void run() {
                byte b2 = b;
                boolean z2 = z;
                long j2 = j;
                w360 w360Var = this;
                switch (b2) {
                    case 0:
                        ((mym0) ((yfc0) w360Var).b).d.b(j2, z2);
                        break;
                    default:
                        ((ez81) w360Var.b).d.b(j2, z2);
                        break;
                }
            }
        });
    }

    public void c(int i, int i2) {
        ((mym0) this.b).e.execute(new jym0(this, i, i2, (byte) 0));
    }

    public cug0 d(Map map) {
        rxj0 rxj0Var = (rxj0) this.b;
        boolean z = rxj0Var.m;
        cug0 cug0Var = cug0.a;
        if (!z) {
            return cug0Var;
        }
        boolean z2 = rxj0Var.o;
        cug0 cug0Var2 = cug0.b;
        if (!z2) {
            return cug0Var2;
        }
        String str = (String) map.get("market-portfolio-type");
        if (u890.j(str, "DEFAULT")) {
            return cug0Var;
        }
        return u890.j(str, "GBB") ? cug0Var2 : cug0.c;
    }

    public void e(final float f) {
        final byte b = 0;
        ((mym0) this.b).e.execute(new Runnable() { // from class: p.iym0
            @Override // java.lang.Runnable
            public final void run() {
                byte b2 = b;
                float f2 = f;
                w360 w360Var = this;
                switch (b2) {
                    case 0:
                        ((mym0) ((yfc0) w360Var).b).d.e(f2);
                        break;
                    default:
                        ((ez81) w360Var.b).d.e(f2);
                        break;
                }
            }
        });
    }

    public void h() {
        ((mym0) this.b).e.execute(new gv40(this, (byte) 21));
    }

    public void n() {
        ((mym0) this.b).p();
    }

    public void subscribe(SingleEmitter singleEmitter) {
        hgd0 hgd0Var = (hgd0) this.b;
        luk lukVar = hgd0Var.s;
        if (lukVar == null || !lukVar.i("listening-activity.visibility_indicator_enabled")) {
            lukVar = hgd0Var.t;
        }
        if (lukVar != null) {
            lukVar.e(new ggd0(singleEmitter, hgd0Var, (byte) 0));
        }
    }

    public /* synthetic */ yfc0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
