package p;

import com.spotify.concertcampaignview.v1.ConcertCampaignPage;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xak implements abk {
    public final ConcertCampaignPage a;

    public xak(ConcertCampaignPage concertCampaignPage) {
        this.a = concertCampaignPage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xak) && u890.j(this.a, ((xak) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
