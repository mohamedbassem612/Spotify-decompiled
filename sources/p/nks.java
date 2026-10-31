package p;

import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class nks implements ss31 {
    public final MediaRouter2.RoutingController a;

    public nks(MediaRouter2.RoutingController routingController) {
        this.a = routingController;
    }

    @Override // p.ss31
    public final List a() {
        List<MediaRoute2Info> selectedRoutes = this.a.getSelectedRoutes();
        ArrayList arrayList = new ArrayList(q7h.U(selectedRoutes, 10));
        Iterator<T> it = selectedRoutes.iterator();
        while (it.hasNext()) {
            MediaRoute2Info mediaRoute2InfoF = swg0.f(it.next());
            mediaRoute2InfoF.getClass();
            arrayList.add(zh5.e(mediaRoute2InfoF));
        }
        return arrayList;
    }
}
