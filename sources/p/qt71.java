package p;

import com.spotify.wrapped.v1.proto.StoryCard;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qt71 implements f961 {
    public static final bma1 b;
    public static final bma1 c;
    public static final bma1 d;
    public static final bma1 e;
    public final dma1 a;

    static {
        nbc nbcVar = bma1.b;
        b = nbcVar.q("anr_watchdog_next_launch_auth_enabled");
        c = nbcVar.q("anr_watchdog_next_launch_auth_threshold_ms");
        d = nbcVar.q("anr_watchdog_next_launch_auth_poll_interval_ms");
        e = nbcVar.q("anr_watchdog_next_launch_auth_max_stalls_per_hour");
    }

    public qt71(dma1 dma1Var) {
        this.a = dma1Var;
    }

    public final lg5 a() {
        bma1 bma1Var = b;
        ima1 ima1Var = this.a;
        boolean zH = ima1Var.h(bma1Var, false);
        ima1 ima1Var2 = ima1Var;
        bma1 bma1Var2 = c;
        int i = StoryCard.CLASSIC_CONTENT_FIELD_NUMBER;
        int iL = ima1Var2.l(bma1Var2, StoryCard.CLASSIC_CONTENT_FIELD_NUMBER);
        int i2 = 500;
        if (500 <= iL && iL <= 10000) {
            i = iL;
        }
        long j = i;
        int iL2 = ima1Var2.l(d, 500);
        if (500 <= iL2 && iL2 <= 2000) {
            i2 = iL2;
        }
        long j2 = i2;
        int iL3 = ima1Var2.l(e, 10);
        return new lg5((1 > iL3 || iL3 > 30) ? 10 : iL3, j, j2, zH);
    }

    public final Object getApi() {
        return this;
    }

    public final void shutdown() {
    }
}
