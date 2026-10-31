package p;

import com.spotify.offline_esperanto.proto.EsOffline;
import java.util.LinkedHashMap;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class exp0 {
    public static final String l = UUID.randomUUID().toString();
    public final String a;
    public final int b;
    public final Function0 c;
    public final iu30 d;
    public final long e;
    public int f;
    public final LinkedHashMap g;
    public long h;
    public long i;
    public long j;
    public String k;

    public exp0(String str, int i, pdp0 pdp0Var, int i2) {
        pdp0Var = (i2 & 4) != 0 ? wso0.U0 : pdp0Var;
        cwp0 cwp0Var = cwp0.c;
        this.a = str;
        this.b = i;
        this.c = pdp0Var;
        this.d = cwp0Var;
        this.e = ((Number) pdp0Var.invoke()).longValue();
        this.g = new LinkedHashMap();
    }

    public final void a(String str) {
        String str2;
        synchronized (this) {
            String str3 = this.a;
            long jLongValue = ((Number) this.c.invoke()).longValue() - this.e;
            boolean zContainsKey = this.g.containsKey("normal");
            boolean zContainsKey2 = this.g.containsKey("bulk_combined");
            long j = this.h;
            long j2 = this.i;
            str2 = "OfflineSyncDiag [" + str3 + "] elapsed_ms=" + jLongValue + " ended=" + str + " normal_received=" + zContainsKey + " bulk_snapshot_seen=" + zContainsKey2 + " foreground_requested=" + j + " submission_completed=" + j2 + " submission_failed=" + this.j + " submission_pending=" + (j - j2);
        }
        this.d.invoke(str2);
    }

    public final void b(String str) {
        synchronized (this) {
            int i = this.f;
            if (i >= this.b) {
                return;
            }
            int i2 = i + 1;
            this.f = i2;
            this.d.invoke("OfflineSyncDiag [" + this.a + "] elapsed_ms=" + (((Number) this.c.invoke()).longValue() - this.e) + " " + str);
            int i3 = this.b;
            if (i2 == i3) {
                this.d.invoke("OfflineSyncDiag [" + this.a + "] detail_limit_reached=" + i3);
            }
        }
    }

    public final void c(long j, long j2, String str) {
        synchronized (this) {
            this.i++;
            if (str != null) {
                this.j++;
            }
        }
        if (j <= 3 || str != null) {
            if (str == null) {
                str = "none";
            }
            StringBuilder sbS = cy30.s(j, "foreground_submission_completed sequence=", " duration_ms=");
            sbS.append(j2);
            sbS.append(" failure=");
            sbS.append(str);
            b(sbS.toString());
        }
    }

    public final void d(String str) {
        boolean zJ;
        synchronized (this) {
            zJ = u890.j(this.k, str);
            this.k = str;
        }
        if (zJ) {
            return;
        }
        b("mapped_state=".concat(str));
    }

    public final void e(String str, EsOffline.Progress progress) {
        dxp0 dxp0Var;
        boolean zS = progress.s();
        boolean z = progress.y() == 0;
        int iA = progress.A();
        dxp0 dxp0Var2 = new dxp0(zS, z, iA);
        synchronized (this) {
            dxp0Var = (dxp0) this.g.put(str, dxp0Var2);
        }
        if (u890.j(dxp0Var, dxp0Var2)) {
            return;
        }
        boolean z2 = dxp0Var == null;
        b("source=" + str + " first_observation=" + z2 + " downloading=" + zS + " total_tracks=" + progress.y() + " queued_tracks=" + progress.v() + " totals_state=" + iA);
    }
}
