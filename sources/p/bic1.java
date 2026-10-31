package p;

import com.spotify.scrollsita.v1.DiscoveryFeed;
import com.spotify.scrollsita.v1.DiscoveryFeedItem;
import com.spotify.scrollsita.v1.Section;
import com.spotify.scrollsita.v1.watchfeed.VideoFile;
import io.reactivex.rxjava3.core.Maybe;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bic1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ List b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bic1(List list, byte b) {
        super(1);
        this.a = b;
        this.b = list;
    }

    public final Object invoke(Object obj) {
        ljj1 jjj1Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        List list = this.b;
        switch (b) {
            case 0:
                return dic1.a(list, rc11.a.b(uxo0.class));
            case 1:
                return dic1.a(list, rc11.a.b(sxo0.class));
            case 2:
                return dic1.a(list, rc11.a.b(gxo0.class));
            case 3:
                return dic1.a(list, rc11.a.b(dxo0.class));
            case 4:
                Section section = (Section) obj;
                if (!section.X() || section.u().getItemsList().isEmpty()) {
                    return dic1.a(list, rc11.a.b(dyo0.class));
                }
                DiscoveryFeed discoveryFeedU = section.u();
                String title = discoveryFeedU.o().getTitle();
                List<DiscoveryFeedItem> itemsList = discoveryFeedU.getItemsList();
                ArrayList arrayList = new ArrayList(q7h.U(itemsList, 10));
                for (DiscoveryFeedItem discoveryFeedItem : itemsList) {
                    String title2 = discoveryFeedItem.n().getTitle();
                    String subtitle = discoveryFeedItem.n().getSubtitle();
                    String strS = discoveryFeedItem.n().s();
                    String strN = discoveryFeedItem.n().n();
                    String url = discoveryFeedItem.n().u().getUrl();
                    Float fValueOf = discoveryFeedItem.n().w() ? Float.valueOf((float) discoveryFeedItem.n().t()) : null;
                    VideoFile videoFileV = discoveryFeedItem.n().v();
                    int i = cic1.a[videoFileV.q().ordinal()];
                    if (i == 1) {
                        jjj1Var = new jjj1(dic1.b(videoFileV.p()), dic1.b(videoFileV.o()), videoFileV.getUri());
                    } else if (i != 2) {
                        jjj1Var = null;
                    } else {
                        jjj1Var = new kjj1(dic1.b(videoFileV.p()), dic1.b(videoFileV.o()), videoFileV.getUri());
                    }
                    arrayList.add(new zbl1(title2, subtitle, strS, strN, url, false, false, fValueOf, jjj1Var, discoveryFeedItem.n().r(), discoveryFeedItem.n().o(), discoveryFeedItem.n().q(), discoveryFeedItem.n().getUri()));
                }
                return Maybe.e(new dyo0(new val1(new acl1(title, arrayList))));
            case 5:
                return dic1.a(list, rc11.a.b(mxo0.class));
            case 6:
                return dic1.a(list, rc11.a.b(zxo0.class));
            case 7:
                return (String) list.get(((Number) obj).intValue());
            case 8:
                ((qv00) obj).b(lo7.class, list, false);
                return rih1Var;
            case 9:
                ((qv00) obj).b(xkk1.class, list, false);
                return rih1Var;
            case 10:
                return Boolean.valueOf(((wge1) list.get(((Number) obj).intValue())).e);
            default:
                p5t0 p5t0Var = (p5t0) obj;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        p5t0Var.k((q5t0) it.next(), 0, 0, 0.0f);
                    }
                }
                return rih1Var;
        }
    }
}
