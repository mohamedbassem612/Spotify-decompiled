package p;

import com.spotify.extendedmetadata.extensions.episodeaccessimpl.proto.PodcastSubscription;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class n1z implements ov00 {
    public final ez00 a(byte[] bArr) {
        PodcastSubscription podcastSubscriptionR = PodcastSubscription.r(bArr);
        boolean zO = podcastSubscriptionR.o();
        boolean zP = podcastSubscriptionR.p();
        String strO = podcastSubscriptionR.q().o();
        strO.getClass();
        if (strO.length() <= 0) {
            strO = null;
        }
        return new l1z(strO, m1z.a[podcastSubscriptionR.n().ordinal()] == 1 ? 2 : 1, zO, zP);
    }

    public final int b() {
        return 30;
    }

    public final Class type() {
        return l1z.class;
    }
}
