package p;

import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ykd0 implements wyo0 {
    public final yqg a;
    public final idd1 b;
    public final idd1 c;

    public ykd0(thq thqVar, Flowable flowable, yqg yqgVar, thq thqVar2, cqd0 cqd0Var) {
        this.a = yqgVar;
        this.b = new idd1(new pd3(thqVar2, (byte) 9));
        this.c = new idd1(new jzm(thqVar, flowable, cqd0Var, this, (byte) 26));
    }

    public final mr20 a() {
        return (mr20) this.c.getValue();
    }
}
