package p;

import com.ravelin.core.repository.RavelinFingerprintWorker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class dvz0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ RavelinFingerprintWorker b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dvz0(RavelinFingerprintWorker ravelinFingerprintWorker, onm onmVar) {
        super(onmVar);
        this.b = ravelinFingerprintWorker;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.f(this);
    }
}
