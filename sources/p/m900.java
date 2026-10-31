package p;

import android.util.LruCache;
import com.spotify.eventcardinfoservice.v1.DateWithOffset;
import com.spotify.eventcardinfoservice.v1.EventCardInfoResponse;
import com.spotify.eventcardinfoservice.v1.SingleEvent;
import io.reactivex.rxjava3.core.Scheduler;
import j$.time.Instant;
import j$.time.OffsetDateTime;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class m900 {
    public final w2z a;
    public final Scheduler b;
    public final yqg c;
    public final fod0 d;
    public final LruCache e = new LruCache(20);
    public final ConcurrentHashMap f = new ConcurrentHashMap();

    public m900(w2z w2zVar, Scheduler scheduler, yqg yqgVar, fod0 fod0Var) {
        this.a = w2zVar;
        this.b = scheduler;
        this.c = yqgVar;
        this.d = fod0Var;
    }

    public final boolean a(h900 h900Var) {
        boolean zB;
        if (h900Var instanceof g900) {
            EventCardInfoResponse eventCardInfoResponse = ((g900) h900Var).a;
            int iP = eventCardInfoResponse.p();
            int i = iP == 0 ? -1 : l900.a[l1d.C(iP)];
            if (i != 1) {
                zB = i == 2 && !eventCardInfoResponse.s().o().isEmpty() && b(((SingleEvent) o7h.q0(eventCardInfoResponse.s().o())).n());
            } else {
                zB = b(eventCardInfoResponse.t().n());
            }
            if (zB) {
                return true;
            }
        }
        return false;
    }

    public final boolean b(DateWithOffset dateWithOffset) {
        Instant instant;
        OffsetDateTime offsetDateTimeE = fod0.e(this.d, dateWithOffset.n());
        Long lValueOf = (offsetDateTimeE == null || (instant = offsetDateTimeE.toInstant()) == null) ? null : Long.valueOf(instant.toEpochMilli());
        return lValueOf != null && this.c.b() > lValueOf.longValue();
    }
}
