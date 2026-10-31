package p;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class wod1 implements kl60 {
    public final o5n a;
    public final h1s b;
    public final String c;
    public final int d;
    public final bnh0 e;

    public wod1(o5n o5nVar, h1s h1sVar, String str, int i, bnh0 bnh0Var) {
        this.a = o5nVar;
        this.b = h1sVar;
        this.c = str;
        this.d = i;
        this.e = bnh0Var;
    }

    @Override // p.kl60
    public final void c() {
        List list;
        o5n o5nVar;
        fl60 fl60Var = this.b.X;
        if (fl60Var == null || (list = fl60Var.b) == null) {
            list = z6x.a;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r7h.W(ihc1.Q0((String) it.next(), new String[]{","}, 0, 6), arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (ihc1.h0((String) obj, "X-SPOTIFY-KEYID", false)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add((String) o7h.A0(ihc1.Q0((String) it2.next(), new String[]{"X-SPOTIFY-KEYID="}, 0, 6)));
        }
        ArrayList arrayList4 = new ArrayList(q7h.U(arrayList3, 10));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(new rpt0((String) it3.next()));
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it4 = arrayList4.iterator();
        while (true) {
            boolean zHasNext = it4.hasNext();
            o5nVar = this.a;
            if (!zHasNext) {
                break;
            }
            Object next = it4.next();
            if (!(o5nVar.b.W(((rpt0) next).b()) instanceof eqt0)) {
                arrayList5.add(next);
            }
        }
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            o5nVar.a((rpt0) it5.next(), this.c, this.d == 2, this.e);
        }
    }

    @Override // p.kl60
    public final boolean e(Uri uri, sw9 sw9Var, boolean z) {
        return false;
    }
}
