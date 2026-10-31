package p;

import java.lang.ref.ReferenceQueue;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public class zog0 extends iog0 {
    public volatile Object b;

    public zog0(ReferenceQueue referenceQueue, Object obj, int i) {
        super(referenceQueue, obj, i);
        this.b = null;
    }

    @Override // p.log0
    public final Object getValue() {
        return this.b;
    }
}
