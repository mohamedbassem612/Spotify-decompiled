package p;

import com.google.protobuf.Timestamp;
import com.spotify.party.mobile.v2.ListeningPartyMarketingCard;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.format.DateTimeFormatter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fug0 {
    public final yqg a;

    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    public ljd0 a(ListeningPartyMarketingCard listeningPartyMarketingCard) {
        int i;
        String uri = listeningPartyMarketingCard.p().getUri();
        int i2 = eug0.a[listeningPartyMarketingCard.q().o().ordinal()];
        if (i2 != 1) {
            i = 2;
            if (i2 == 2 || i2 == 3) {
                i = 1;
            } else if (i2 != 4) {
                i = 3;
            }
        } else {
            i = 1;
        }
        String imageUrl = listeningPartyMarketingCard.o().getImageUrl();
        Timestamp timestampP = listeningPartyMarketingCard.p().p();
        return new ljd0(uri, i, imageUrl, Instant.ofEpochSecond(timestampP.q(), timestampP.p()).atZone(ZoneId.of(this.a.g().getID())).format(DateTimeFormatter.ISO_INSTANT), listeningPartyMarketingCard.o().getName(), listeningPartyMarketingCard.p().o() && listeningPartyMarketingCard.n().o() == lld0.NON_PREMIUM, listeningPartyMarketingCard.p().o(), false);
    }
}
