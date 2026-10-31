package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class h4r implements f4r {
    public final /* synthetic */ byte a = 1;
    public final f4r b;
    public final iu30 c;

    public h4r(iu30 iu30Var, f4r f4rVar) {
        this.c = iu30Var;
        this.b = f4rVar;
    }

    public final f1r a(Object obj) {
        byte b = this.a;
        iu30 iu30Var = this.c;
        f4r f4rVar = this.b;
        switch (b) {
            case 0:
                Iterable iterable = (Iterable) iu30Var.invoke(obj);
                ArrayList<lch> arrayList = new ArrayList(q7h.U(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(f4rVar.a(it.next()));
                }
                if (arrayList.isEmpty()) {
                    return new p6x();
                }
                if (arrayList.size() == 1) {
                    return (f1r) o7h.V0(arrayList);
                }
                ArrayList arrayList2 = new ArrayList();
                for (lch lchVar : arrayList) {
                    lch lchVar2 = lchVar instanceof lch ? lchVar : null;
                    r7h.W(lchVar2 != null ? lchVar2.a : Collections.singletonList(lchVar), arrayList2);
                }
                return new lch(arrayList2);
            default:
                return f4rVar.a(iu30Var.invoke(obj));
        }
    }

    public h4r(f4r f4rVar, iu30 iu30Var) {
        this.b = f4rVar;
        this.c = iu30Var;
    }
}
