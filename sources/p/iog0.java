package p;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class iog0 extends WeakReference implements log0 {
    public final int a;

    public iog0(ReferenceQueue referenceQueue, Object obj, int i) {
        super(obj, referenceQueue);
        this.a = i;
    }

    @Override // p.log0
    public final int b() {
        return this.a;
    }

    public log0 c() {
        return null;
    }

    @Override // p.log0
    public final Object getKey() {
        return get();
    }
}
