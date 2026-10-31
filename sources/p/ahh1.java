package p;

import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ahh1 implements iyf0 {
    public final ArrayList a;

    public ahh1(b291 b291Var) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : b291Var) {
            if (((h5d) obj).f.a.k()) {
                arrayList.add(obj);
            }
        }
        this.a = arrayList;
    }

    @Override // p.iyf0
    public final void c() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((h5d) it.next()).getClass();
        }
    }

    @Override // p.iyf0
    public final void d() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((h5d) it.next()).g.c();
        }
    }

    @Override // p.iyf0
    public final void i() {
        for (h5d h5dVar : this.a) {
            if (h5dVar.a) {
                h5dVar.g.a(h5dVar.d.j().filter(een.V0).flatMap(new l2a(h5dVar, (byte) 8)).flatMapSingle(new uq8(h5dVar, (byte) 7)).flatMap(new fna(h5dVar, (byte) 6)).observeOn(h5dVar.c).subscribeOn(h5dVar.b).subscribe(p.i, fcc.c));
            }
        }
    }

    @Override // p.iyf0
    public final void g(ViewGroup viewGroup) {
    }
}
