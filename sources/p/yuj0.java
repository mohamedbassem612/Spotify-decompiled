package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class yuj0 implements zga {
    public final ue00 a;
    public final t900 b;

    public yuj0(ue00 ue00Var, t900 t900Var) {
        this.a = ue00Var;
        this.b = t900Var;
    }

    @Override // p.zga
    public final void a(Collection collection) {
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(q7h.U(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((n700) it.next()).a));
        }
        ue00 ue00Var = this.a;
        qyo1.x(ue00Var.b, false, true, new f0z(ue00Var, arrayList, (byte) 15));
    }

    @Override // p.zga
    public final n561 b(String str) {
        return new i46(new xuj0(this, str, (lnm) null), (byte) 3);
    }
}
