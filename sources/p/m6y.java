package p;

import android.content.Context;
import android.net.NetworkRequest;
import com.spotify.base.java.logging.Logger;
import com.spotify.collection.offlinesyncnotification.offlinesyncworker.OfflineSyncWorker;
import com.spotify.engagesdk.engagecontinuationcluster.workers.EngageContinuationClusterPublisher;
import com.spotify.engagesdk.engagerecommendationscluster.workers.EngageRecommendationsClusterPublisher;
import com.spotify.notifications.notifications.workers.NotificationLoggingQuasarWorker;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class m6y implements r0z0 {
    public final /* synthetic */ byte a;
    public final Context b;
    public final Object c;

    public /* synthetic */ m6y(byte b, Context context, Object obj) {
        this.a = b;
        this.b = context;
        this.c = obj;
    }

    public final void a() {
        byte b = this.a;
        TimeUnit timeUnit = TimeUnit.MICROSECONDS;
        TimeUnit timeUnit2 = TimeUnit.HOURS;
        Context context = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                if (!((je4) obj).a()) {
                    cancel();
                } else {
                    awl1.d(context).b("EngageContinuationClusterPublisher", 2, new uks0(EngageContinuationClusterPublisher.class, 24L, timeUnit2).h(0L, timeUnit).f(new gjl(11)).b());
                }
                break;
            case 1:
                ke4 ke4Var = (ke4) obj;
                if (!ke4Var.a()) {
                    cancel();
                } else {
                    ha71.q(awl1.d(context), "EngageRecommendationsPublisher", new uks0(EngageRecommendationsClusterPublisher.class, ke4Var.b(), timeUnit2).h(0L, timeUnit).f(new gjl(11)).b());
                }
                break;
            case 2:
                zg4 zg4Var = (zg4) obj;
                long jF = zg4Var.f();
                long jE = zg4Var.e();
                uks0 uks0Var = new uks0(NotificationLoggingQuasarWorker.class);
                ((qwl1) uks0Var).c.d(timeUnit2.toMillis(jF), timeUnit2.toMillis(jE));
                awl1.d(context).b("notification_logging", 2, uks0Var.f(new gjl(new e8o0((NetworkRequest) null), 2, false, false, true, false, -1L, -1L, o7h.p1(new LinkedHashSet()))).b());
                break;
            default:
                long jB = ((yqg) obj).b();
                ciq0 ciq0Var = new ciq0(OfflineSyncWorker.class);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String str = exp0.l;
                linkedHashMap.put("offline_sync_origin_process", str);
                linkedHashMap.put("offline_sync_enqueue_time_ms", Long.valueOf(jB));
                ewq ewqVar = new ewq(linkedHashMap);
                o0c.N(ewqVar);
                diq0 diq0VarB = ciq0Var.i(ewqVar).b();
                Logger.b("OfflineSyncDiag [enqueue-%s] requested policy=KEEP process=%s wall_ms=%d", new Object[]{((rwl1) diq0VarB).a, str, Long.valueOf(jB)});
                awl1.d(context).c("offline_sync", 2, diq0VarB);
                break;
        }
    }

    public final void cancel() {
        byte b = this.a;
        Context context = this.b;
        switch (b) {
            case 0:
                bzn1.r("EngageContinuationClusterPublisher", awl1.d(context));
                break;
            case 1:
                bzn1.r("EngageRecommendationsPublisher", awl1.d(context));
                break;
            case 2:
                bzn1.r("notification_logging", awl1.d(context));
                break;
            default:
                bzn1.r("offline_sync", awl1.d(context));
                break;
        }
    }
}
