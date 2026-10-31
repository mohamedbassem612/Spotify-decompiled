package p;

import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qh80 implements Init {
    public final Init a;
    public final Init b;
    public final iu30 c;
    public final vu30 d;
    public final iu30 e;

    public qh80(Init init, Init init2, iu30 iu30Var, vu30 vu30Var, iu30 iu30Var2) {
        this.a = init;
        this.b = init2;
        this.c = iu30Var;
        this.d = vu30Var;
        this.e = iu30Var2;
    }

    public final First e0(Object obj) {
        First firstE0 = this.a.e0(obj);
        First firstE1 = this.b.e0(this.c.invoke(firstE0.d()));
        Object objInvoke = this.d.invoke(firstE0.d(), firstE1.d());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(firstE0.a());
        Set setA = firstE1.a();
        ArrayList arrayList = new ArrayList(q7h.U(setA, 10));
        Iterator it = setA.iterator();
        while (it.hasNext()) {
            arrayList.add(this.e.invoke(it.next()));
        }
        linkedHashSet.addAll(arrayList);
        return First.c(objInvoke, linkedHashSet);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qh80)) {
            return false;
        }
        qh80 qh80Var = (qh80) obj;
        return this.a.equals(qh80Var.a) && this.b.equals(qh80Var.b) && this.c.equals(qh80Var.c) && this.d.equals(qh80Var.d) && this.e.equals(qh80Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + hrt.g(ktd.g(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31, this.d);
    }
}
