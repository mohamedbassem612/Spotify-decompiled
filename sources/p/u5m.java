package p;

import com.spotify.concertpageview.v1.TicketingTimeline;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class u5m extends e6m {
    public final TicketingTimeline a;

    public u5m(TicketingTimeline ticketingTimeline) {
        this.a = ticketingTimeline;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u5m) && u890.j(this.a, ((u5m) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
