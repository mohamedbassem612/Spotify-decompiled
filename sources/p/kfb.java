package p;

import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kfb implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ofb b;

    public /* synthetic */ kfb(ofb ofbVar, byte b) {
        this.a = b;
        this.b = ofbVar;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        ofb ofbVar = this.b;
        switch (b) {
            case 0:
                sp00 sp00Var = (sp00) ofbVar.h;
                if (sp00Var != null) {
                    i210 i210Var = (i210) sp00Var.d;
                    m210 m210Var = (m210) sp00Var.c;
                    if (i210Var.h) {
                        c921.y(i210Var.e, (o8n) null, 0, new hl1(false, (Object) i210Var, (Object) m210Var, (lnm) null, (byte) 6), 3);
                    } else {
                        i210Var.f.remove(m210Var);
                    }
                    op71.q(((llm) sp00Var.e).a, (CancellationException) null);
                }
                t141 t141Var = (t141) ofbVar.c;
                HashSet hashSet = t141Var.a;
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    t141Var.b.onNext(new agb((String) it.next(), false));
                }
                hashSet.clear();
                Disposable disposable = (Disposable) ofbVar.g;
                if (disposable != null && !disposable.isDisposed()) {
                    Disposable disposable2 = (Disposable) ofbVar.g;
                    disposable2.getClass();
                    disposable2.dispose();
                    break;
                }
                break;
            default:
                String str = (String) obj;
                t141 t141Var2 = (t141) ofbVar.c;
                str.getClass();
                agb agbVar = new agb(str, true);
                BehaviorSubject behaviorSubject = t141Var2.b;
                HashSet hashSet2 = t141Var2.a;
                if (!hashSet2.contains(str)) {
                    hashSet2.add(str);
                    behaviorSubject.onNext(agbVar);
                }
                break;
        }
    }
}
