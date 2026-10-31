package p;

import android.os.SystemClock;
import com.spotify.collection.offlinesyncnotification.offlinesyncworker.OfflineSyncWorker;
import com.spotify.download.esperanto.proto.EsDownload;
import com.spotify.download.esperanto.proto.EsDownload$FileStreamerId;
import io.reactivex.rxjava3.functions.Function;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class m1d implements Function, hx30 {
    public long a;
    public long b;
    public Object c;

    public m1d() {
        this.a = -9223372036854775807L;
        this.b = -9223372036854775807L;
    }

    public Long a() {
        long j = ((AtomicLong) this.c).get();
        Long lValueOf = Long.valueOf(j);
        if (j == -1) {
            return null;
        }
        return lValueOf;
    }

    public Object apply(Object obj) {
        f520 f520Var = (f520) this.c;
        ptu ptuVar = f520Var.a;
        inz inzVarN = EsDownload.RequestDataParams.n();
        ymz ymzVarO = EsDownload$FileStreamerId.o();
        ymzVarO.n(((Integer) obj).intValue());
        inzVarN.q((EsDownload$FileStreamerId) ymzVarO.build());
        inzVarN.r(this.a);
        inzVarN.n(this.b);
        return ptuVar.callStream("spotify.download.esperanto.proto.Download", "RequestData", inzVarN.build()).map(j561.a1).map(new laz(f520Var, (byte) 7));
    }

    public int b() {
        if (!((o1d) this.c).c()) {
            return 700;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        long j = this.b;
        if (j == -1) {
            this.b = jUptimeMillis;
            j = jUptimeMillis;
        }
        long j2 = jUptimeMillis - j;
        if (j2 <= 120000) {
            return 1000;
        }
        return j2 <= 300000 ? 2000 : 4000;
    }

    public void c(Exception exc) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.c) == null) {
            this.c = exc;
        }
        if (this.a == -9223372036854775807L && ygr.e0.get() <= 0) {
            this.a = 200 + jElapsedRealtime;
        }
        long j = this.a;
        if (j == -9223372036854775807L || jElapsedRealtime < j) {
            this.b = jElapsedRealtime + 50;
            return;
        }
        Exception exc2 = (Exception) this.c;
        if (exc2 != exc) {
            exc2.addSuppressed(exc);
        }
        Exception exc3 = (Exception) this.c;
        this.c = null;
        this.a = -9223372036854775807L;
        this.b = -9223372036854775807L;
        throw exc3;
    }

    public void onFailure(Throwable th) {
        OfflineSyncWorker offlineSyncWorker = (OfflineSyncWorker) this.c;
        offlineSyncWorker.w.c(this.a, offlineSyncWorker.r.a.a.e() - this.b, th.getClass().getSimpleName());
    }

    public void onSuccess(Object obj) {
        OfflineSyncWorker offlineSyncWorker = (OfflineSyncWorker) this.c;
        exp0 exp0Var = offlineSyncWorker.w;
        long j = this.a;
        long jE = offlineSyncWorker.r.a.a.e() - this.b;
        String str = exp0.l;
        exp0Var.c(j, jE, (String) null);
    }

    public /* synthetic */ m1d(Object obj, long j, long j2) {
        this.c = obj;
        this.a = j;
        this.b = j2;
    }
}
