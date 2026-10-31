package p;

import android.widget.RemoteViews;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class wy11 {
    public static final wy11 d = new wy11(new long[0], new RemoteViews[0], 1);
    public final long[] a;
    public final RemoteViews[] b;
    public final int c;

    public wy11(long[] jArr, RemoteViews[] remoteViewsArr, int i) {
        this.a = jArr;
        this.b = remoteViewsArr;
        this.c = i;
        if (jArr.length != remoteViewsArr.length) {
            hhg1.n("RemoteCollectionItems has different number of ids and views");
            throw null;
        }
        if (i < 1) {
            hhg1.n("View type count must be >= 1");
            throw null;
        }
        ArrayList arrayList = new ArrayList(remoteViewsArr.length);
        for (RemoteViews remoteViews : remoteViewsArr) {
            arrayList.add(Integer.valueOf(remoteViews.getLayoutId()));
        }
        int size = o7h.j0(arrayList).size();
        if (size <= this.c) {
            return;
        }
        throw new IllegalArgumentException(("View type count is set to " + this.c + ", but the collection contains " + size + " different layout ids").toString());
    }
}
