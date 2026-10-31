package p;

import com.google.android.material.appbar.AppBarLayout;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class e260 implements wi5 {
    public final ggh a;
    public int b = Integer.MAX_VALUE;
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();

    public e260(ggh gghVar) {
        this.a = gghVar;
    }

    public final void a(AppBarLayout appBarLayout, int i) {
        if (i == this.b) {
            return;
        }
        this.b = i;
        this.a.invoke(Integer.valueOf(i));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.c;
        Iterator it = arrayList2.iterator();
        if (it.hasNext()) {
            throw pze0.g(it);
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            throw pze0.g(it2);
        }
        arrayList2.removeAll(arrayList);
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = this.d.iterator();
        if (it3.hasNext()) {
            throw pze0.g(it3);
        }
        Iterator it4 = arrayList3.iterator();
        if (it4.hasNext()) {
            throw pze0.g(it4);
        }
    }
}
