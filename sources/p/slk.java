package p;

import com.spotify.concertpageview.v1.TicketingTimeline;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class slk extends vlk {
    public final TicketingTimeline a;
    public final Long b;
    public final boolean c;

    public slk(TicketingTimeline ticketingTimeline, Long l, boolean z) {
        this.a = ticketingTimeline;
        this.b = l;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof slk)) {
            return false;
        }
        slk slkVar = (slk) obj;
        return u890.j(this.a, slkVar.a) && u890.j(this.b, slkVar.b) && this.c == slkVar.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Long l = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (l == null ? 0 : l.hashCode())) * 31);
    }
}
