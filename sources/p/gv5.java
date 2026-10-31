package p;

import io.reactivex.rxjava3.internal.observers.BlockingMultiObserver;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class gv5 implements bkl {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gv5(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                CompletableFromAction completableFromAction = new CompletableFromAction(new ok70(((oh61) obj2).m, ((Integer) obj).intValue()));
                BlockingMultiObserver blockingMultiObserver = new BlockingMultiObserver();
                completableFromAction.subscribe(blockingMultiObserver);
                blockingMultiObserver.b();
                break;
            default:
                u5y u5yVar = (u5y) obj;
                LinkedHashMap linkedHashMap = ((nk70) obj2).d;
                if (!linkedHashMap.containsKey(u5yVar.getUri())) {
                    linkedHashMap.put(u5yVar.getUri(), u5yVar);
                } else {
                    l1d.z("Endpoint already registered for URI: \"", u5yVar.getUri(), "\".");
                }
                break;
        }
    }
}
