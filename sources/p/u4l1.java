package p;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class u4l1 implements Runnable {
    public final /* synthetic */ uqs a;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ u4l1(uqs uqsVar, AtomicBoolean atomicBoolean, boolean z, boolean z2) {
        this.a = uqsVar;
        this.b = atomicBoolean;
        this.c = z;
        this.d = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.set(false);
        ((qpj1) this.a.c).H(this.c, this.d);
    }
}
