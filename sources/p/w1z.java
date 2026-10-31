package p;

import com.spotify.episode.episodeassociationsimpl.proto.EpisodeassociationsResponse$Entity;
import com.spotify.episode.episodeassociationsimpl.proto.EpisodeassociationsResponse$Track;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class w1z {
    public static final ArrayList a(ArrayList arrayList, String str, x1z x1zVar, Map map) {
        dem1 qyyVar;
        int i;
        dem1 azyVar;
        String str2 = x1zVar.a;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            EpisodeassociationsResponse$Entity episodeassociationsResponse$Entity = (EpisodeassociationsResponse$Entity) it.next();
            int iQ = episodeassociationsResponse$Entity.q();
            int i2 = 3;
            switch (iQ == 0 ? -1 : v1z.b[l1d.C(iQ)]) {
                case 1:
                    qyyVar = syy.b;
                    azyVar = qyyVar;
                    break;
                case 2:
                    qyyVar = bzy.b;
                    azyVar = qyyVar;
                    break;
                case 3:
                    h290 h290VarN = episodeassociationsResponse$Entity.n().n();
                    int i3 = v1z.a[episodeassociationsResponse$Entity.n().p().ordinal()];
                    if (i3 != 1) {
                        i2 = i3 != 2 ? 1 : 2;
                    }
                    qyyVar = new qyy(i2, h290VarN);
                    azyVar = qyyVar;
                    break;
                case 4:
                    List artistList = episodeassociationsResponse$Entity.v().getArtistList();
                    ArrayList arrayList3 = new ArrayList(q7h.U(artistList, 10));
                    Iterator it2 = artistList.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(((EpisodeassociationsResponse$Track.ArtistEntry) it2.next()).getName());
                    }
                    boolean isExplicit = episodeassociationsResponse$Entity.v().getIsExplicit();
                    boolean zO = episodeassociationsResponse$Entity.v().o();
                    boolean isPlayable = episodeassociationsResponse$Entity.v().getIsPlayable();
                    boolean zG = y7y0.G(map);
                    String uri = episodeassociationsResponse$Entity.getUri();
                    boolean z = x1zVar.b;
                    if (u890.j(uri, str2) && z) {
                        i = 1;
                    } else {
                        i = (!u890.j(episodeassociationsResponse$Entity.getUri(), str2) || z) ? 3 : 2;
                    }
                    azyVar = new azy(arrayList3, isExplicit, zO, isPlayable, zG, i);
                    break;
                case 5:
                    qyyVar = new yyy(episodeassociationsResponse$Entity.t().n());
                    azyVar = qyyVar;
                    break;
                case 6:
                    qyyVar = new zyy(episodeassociationsResponse$Entity.u().o());
                    azyVar = qyyVar;
                    break;
                case 7:
                    qyyVar = new xyy(episodeassociationsResponse$Entity.r().p(), episodeassociationsResponse$Entity.r().getIsExplicit(), episodeassociationsResponse$Entity.r().o());
                    azyVar = qyyVar;
                    break;
                case 8:
                    qyyVar = new uyy(episodeassociationsResponse$Entity.o().n());
                    azyVar = qyyVar;
                    break;
                case 9:
                    qyyVar = new vyy(episodeassociationsResponse$Entity.p().n(), episodeassociationsResponse$Entity.p().o(), episodeassociationsResponse$Entity.p().p());
                    azyVar = qyyVar;
                    break;
                default:
                    azyVar = null;
                    break;
            }
            iby ibyVar = azyVar != null ? new iby(str, episodeassociationsResponse$Entity.getUri(), episodeassociationsResponse$Entity.getName(), episodeassociationsResponse$Entity.s(), azyVar) : null;
            if (ibyVar != null) {
                arrayList2.add(ibyVar);
            }
        }
        return arrayList2;
    }
}
