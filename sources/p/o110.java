package p;

import android.media.MediaRouter2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class o110 extends MediaRouter2.RouteCallback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o110(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.media.MediaRouter2.RouteCallback
    public final void onRoutesUpdated(List list) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                sun sunVar = (sun) obj;
                List list2 = list;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(zh5.e(swg0.f(it.next())));
                }
                arrayList.toString();
                ilo1.E(arrayList, (ssw0) sunVar.b);
                break;
            default:
                ((bvh0) obj).l();
                break;
        }
    }
}
