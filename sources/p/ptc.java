package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableRefCount;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ptc implements zeu0 {
    public final vuz a;
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final Observable c;

    public ptc(vuz vuzVar) {
        this.a = vuzVar;
        this.c = vuzVar.a().share();
    }

    @Override // p.zeu0
    public final Observable a() {
        return this.c;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [p.otc] */
    @Override // p.zeu0
    public final Flowable b(final int i, final int i2) {
        return (Flowable) spq0.a((Flowable) this.b.get(new nmr0(Integer.valueOf(i), Integer.valueOf(i2)))).f((otc) new v0d1() { // from class: p.otc
            public final Object get() {
                ptc ptcVar = this.a;
                vuz vuzVar = ptcVar.a;
                byte b = i;
                byte b2 = i2;
                FlowableRefCount flowableRefCount = new FlowableRefCount(vuzVar.b(b, b2).Q());
                ConcurrentHashMap concurrentHashMap = ptcVar.b;
                concurrentHashMap.putIfAbsent(new nmr0(Integer.valueOf(b), Integer.valueOf(b2)), flowableRefCount);
                return (Flowable) concurrentHashMap.get(new nmr0(Integer.valueOf(b), Integer.valueOf(b2)));
            }
        });
    }

    @Override // p.zeu0
    public final Flowable c() {
        return b(2, 2);
    }
}
