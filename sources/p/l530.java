package p;

import io.reactivex.rxjava3.functions.Cancellable;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class l530 implements Cancellable {
    public final /* synthetic */ Set a;
    public final /* synthetic */ zsc b;
    public final /* synthetic */ hmf c;

    public l530(Set set, zsc zscVar, hmf hmfVar) {
        this.a = set;
        this.b = zscVar;
        this.c = hmfVar;
    }

    @Override // io.reactivex.rxjava3.functions.Cancellable
    public final void cancel() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((r630) this.b.c).g((String) it.next(), this.c);
        }
    }
}
