package p;

import java.lang.ref.ReferenceQueue;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public class cpg0 extends iog0 implements epg0 {
    public volatile fpg0 b;

    public cpg0(ReferenceQueue referenceQueue, Object obj, int i) {
        super(referenceQueue, obj, i);
        this.b = ipg0.t;
    }

    @Override // p.epg0
    public final fpg0 a() {
        return this.b;
    }

    @Override // p.log0
    public final Object getValue() {
        return this.b.get();
    }
}
