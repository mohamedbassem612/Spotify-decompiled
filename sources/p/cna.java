package p;

import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class cna {
    public final dqu a;
    public final vna b;
    public final t390 c;
    public final q8n d;
    public final q8n e;
    public volatile boolean i;
    public final zma f = new zma(this);
    public final ConcurrentHashMap g = new ConcurrentHashMap();
    public Disposable h = EmptyDisposable.a;
    public final ConcurrentHashMap.KeySetView j = ConcurrentHashMap.newKeySet();

    public cna(dqu dquVar, vna vnaVar, t390 t390Var, q8n q8nVar, q8n q8nVar2) {
        this.a = dquVar;
        this.b = vnaVar;
        this.c = t390Var;
        this.d = q8nVar;
        this.e = q8nVar2;
    }
}
