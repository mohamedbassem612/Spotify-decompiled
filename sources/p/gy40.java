package p;

import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gy40 {
    public final jal a;
    public final g6a1 b;
    public final ha61 c;
    public final tvt0 d;
    public final zle1 e;
    public final CompositeDisposable f = new CompositeDisposable();
    public final PublishSubject g = new PublishSubject();

    public gy40(jal jalVar, g6a1 g6a1Var, ha61 ha61Var, tvt0 tvt0Var, zle1 zle1Var) {
        this.a = jalVar;
        this.b = g6a1Var;
        this.c = ha61Var;
        this.d = tvt0Var;
        this.e = zle1Var;
    }

    public static final void b(gy40 gy40Var, w8l w8lVar) {
        w8lVar.b = 3;
        gy40Var.g.onNext(w8lVar);
    }

    public final ArrayList c() {
        Collection<w8l> collectionValues = this.a.a.values();
        ArrayList arrayList = new ArrayList();
        for (w8l w8lVar : collectionValues) {
            int i = w8lVar.b;
            if (i == 2 || i == 3) {
                arrayList.add(w8lVar);
            }
        }
        return arrayList;
    }
}
