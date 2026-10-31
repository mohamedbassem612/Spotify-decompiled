package p;

import com.spotify.mobius.Next;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class b9k extends tv30 implements vu30 {
    public static final b9k a = new b9k(2, e9k.class, "onPropsChanged", "onPropsChanged(Lcom/spotify/liveevents/element/concertcampaigncardelementapi/ConcertCampaignCardProps;Lcom/spotify/liveevents/element/concertcampaigncardelement/ConcertCampaignCardElement$Model;)Lcom/spotify/mobius/Next;", 1);

    public final Object invoke(Object obj, Object obj2) {
        f9k f9kVar = (f9k) obj;
        a9k a9kVar = (a9k) obj2;
        List list = f9kVar.b;
        boolean z = (u890.j(f9kVar.a, a9kVar.a) && u890.j((Object) null, a9kVar.b) && u890.j((Object) null, a9kVar.c)) ? false : true;
        if (!z && !a9kVar.d && list.equals(a9kVar.e) && f9kVar.c == a9kVar.f) {
            return Next.j();
        }
        boolean z2 = z;
        return Next.i(a9k.a(a9kVar, f9kVar.a, list, f9kVar.c, z2 ? null : a9kVar.g, true, null, null, false, false, null, null, z2 ? null : a9kVar.o, 15872), e9k.t(f9kVar, true));
    }
}
