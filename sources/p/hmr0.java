package p;

import com.spotify.paidpodcastbanner.v1.PaidPodcastBanner;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public abstract class hmr0 {
    public static final z5a a(PaidPodcastBanner.Cta cta) {
        int i = gmr0.a[cta.o().ordinal()];
        int i2 = 2;
        if (i != 1) {
            i2 = i != 2 ? 1 : 3;
        }
        return new z5a(i2, cta.q() ? cta.n() : null);
    }

    public static final int b(y5a y5aVar) {
        int iOrdinal = y5aVar.ordinal();
        if (iOrdinal == 1) {
            return 2;
        }
        if (iOrdinal == 2) {
            return 3;
        }
        if (iOrdinal != 3) {
            return iOrdinal != 5 ? 1 : 5;
        }
        return 4;
    }
}
