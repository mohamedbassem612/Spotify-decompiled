package p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Emitter;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class loc1 {
    public final LinkedHashSet a = new LinkedHashSet();

    public final String a() {
        List listL1 = o7h.l1(this.a);
        StringBuilder sb = new StringBuilder(f4i1.c(listL1.size(), "#Active subscriptions: "));
        List list = listL1;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add("\n".concat(((t2g1) it.next()).a().b()));
        }
        sb.append(arrayList);
        return sb.toString();
    }

    public final t2g1 b(String str, Emitter emitter, Disposable disposable) {
        t2g1 t2g1Var = new t2g1(emitter, disposable, ppo1.n(str), str);
        synchronized (this) {
            this.a.add(t2g1Var);
            this.a.size();
        }
        return t2g1Var;
    }

    public final synchronized List c() {
        List listL1 = o7h.l1(this.a);
        if (listL1.isEmpty()) {
            return z6x.a;
        }
        this.a.size();
        Logger.d("Found active subscribers:\n".concat(a()), new Object[0]);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listL1) {
            if (((t2g1) obj).b()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((t2g1) it.next()).a());
        }
        this.a.clear();
        this.a.size();
        return arrayList2;
    }
}
