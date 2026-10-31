package p;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final /* synthetic */ class yac extends tv30 implements xu30 {
    public static final yac a = new yac(3, bbc.class, "processResultSelectReceiveCatching", "processResultSelectReceiveCatching(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);

    @Override // p.xu30
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        bbc bbcVar = (bbc) obj;
        AtomicLongFieldUpdater atomicLongFieldUpdater = bbc.b;
        bbcVar.getClass();
        if (obj3 == dbc.l) {
            obj3 = flo1.e(bbcVar.o());
        }
        return new qge(obj3);
    }
}
