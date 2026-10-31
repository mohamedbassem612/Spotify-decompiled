package p;

import com.spotify.paidpodcastbanner.v1.PaidPodcastBanner;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fmr0 implements ov00 {
    public final ez00 a(byte[] bArr) {
        PaidPodcastBanner paidPodcastBannerW = PaidPodcastBanner.w(bArr);
        return new tlr0(paidPodcastBannerW.v(), paidPodcastBannerW.s(), paidPodcastBannerW.u(), paidPodcastBannerW.n(), paidPodcastBannerW.t(), hmr0.b(paidPodcastBannerW.r()), paidPodcastBannerW.q(), paidPodcastBannerW.o(), hmr0.a(paidPodcastBannerW.p()));
    }

    public final int b() {
        return 91;
    }

    public final Class type() {
        return tlr0.class;
    }
}
