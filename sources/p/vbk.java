package p;

import com.spotify.concertcampaignview.v1.ConcertCampaignPage;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class vbk implements Update {
    public static final vbk a = new vbk();

    public final Next a(Object obj, Object obj2) {
        xbk xbkVar = (xbk) obj;
        abk abkVar = (abk) obj2;
        if (abkVar instanceof yak) {
            return Next.h(xbk.a(xbkVar, null, null, null, null, null, null, null, null, null, 0, ((yak) abkVar).a, 65535));
        }
        if (abkVar instanceof zak) {
            zak zakVar = (zak) abkVar;
            return Next.h(xbk.a(xbkVar, null, null, null, null, null, null, null, null, new x9r(zakVar.a, zakVar.b), 0, false, 122879));
        }
        if (abkVar instanceof vak) {
            vak vakVar = (vak) abkVar;
            x9r x9rVar = new x9r(vakVar.a, vakVar.b);
            return xbkVar.l ? Next.h(xbk.a(xbkVar, null, null, null, null, null, null, null, x9rVar, x9rVar, 0, false, 116735)) : Next.h(xbk.a(xbkVar, null, null, null, null, null, null, null, x9rVar, null, 0, false, 126975));
        }
        if (abkVar.equals(uak.a)) {
            return Next.i(xbk.a(xbkVar, null, null, null, null, null, null, null, null, null, 0, false, 122879), Collections.singleton(new q9k(xbkVar.a)));
        }
        if (abkVar.equals(wak.a)) {
            return Next.h(xbk.a(xbkVar, null, null, null, null, null, null, null, null, null, 0, false, 122879));
        }
        if (abkVar.equals(tak.a)) {
            return Next.h(xbk.a(xbkVar, null, null, null, null, null, null, null, null, null, xbkVar.o + 1, false, 114687));
        }
        if (!(abkVar instanceof xak)) {
            eg.o();
            return null;
        }
        ConcertCampaignPage concertCampaignPage = ((xak) abkVar).a;
        xbk xbkVarA = xbk.a(xbkVar, concertCampaignPage.o(), concertCampaignPage.r(), concertCampaignPage.v() ? concertCampaignPage.q() : null, concertCampaignPage.u() ? concertCampaignPage.p() : null, concertCampaignPage.x() ? concertCampaignPage.t() : null, concertCampaignPage.w() ? concertCampaignPage.s() : null, concertCampaignPage.n(), null, null, 0, false, 129063);
        return Next.i(xbkVarA, k4k.v(xbkVarA));
    }
}
