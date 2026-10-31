package p;

import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class u4q implements fl3 {
    public final /* synthetic */ thq a;

    public u4q(thq thqVar) {
        this.a = thqVar;
    }

    public final k2q a(String str, Flowable flowable) {
        thq thqVar = this.a;
        return new k2q((hl3) thq.a(thqVar).r5.get(), (x4q) thq.a(thqVar).s5.get(), str, flowable);
    }
}
