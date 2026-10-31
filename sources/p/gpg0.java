package p;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class gpg0 extends WeakReference implements fpg0 {
    public final log0 a;

    public gpg0(ReferenceQueue referenceQueue, Object obj, log0 log0Var) {
        super(obj, referenceQueue);
        this.a = log0Var;
    }

    @Override // p.fpg0
    public final log0 a() {
        return this.a;
    }

    @Override // p.fpg0
    public final fpg0 b(ReferenceQueue referenceQueue, epg0 epg0Var) {
        return new gpg0(referenceQueue, get(), epg0Var);
    }
}
