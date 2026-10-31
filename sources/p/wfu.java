package p;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wfu extends fn41 {
    public static final /* synthetic */ long f = avg.a.objectFieldOffset(wfu.class.getDeclaredField("_decision$volatile"));
    private volatile /* synthetic */ int _decision$volatile;

    @Override // p.fn41, p.saa0
    public final void N(Object obj) {
        P(obj);
    }

    @Override // p.fn41, p.saa0
    public final void P(Object obj) {
        while (true) {
            Unsafe unsafe = avg.a;
            long j = f;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile != 0) {
                if (intVolatile != 1) {
                    eg.m("Already resumed");
                    return;
                } else {
                    hr80.w(uap1.o(obj), aym.t(this.e));
                    return;
                }
            }
            wfu wfuVar = this;
            if (unsafe.compareAndSwapInt(wfuVar, j, 0, 2)) {
                return;
            } else {
                this = wfuVar;
            }
        }
    }
}
