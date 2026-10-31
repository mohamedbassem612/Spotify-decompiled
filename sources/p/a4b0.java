package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class a4b0 {
    public int a;
    public final String b;
    public final int c;
    public final int d;
    public final ArrayList e = new ArrayList(1);
    public final ArrayList f;

    public a4b0(int i, int i2, int i3, String str) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = i3;
        zjj0.a.getClass();
        List listA = yjj0.a();
        ArrayList arrayList = new ArrayList(q7h.U(listA, 10));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            ((gja0) ((zjj0) it.next())).getClass();
            arrayList.add(new mka0());
        }
        this.f = arrayList;
    }
}
