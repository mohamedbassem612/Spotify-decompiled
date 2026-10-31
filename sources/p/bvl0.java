package p;

import com.ravelin.core.repository.MobileReportWorker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bvl0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ MobileReportWorker b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvl0(MobileReportWorker mobileReportWorker, onm onmVar) {
        super(onmVar);
        this.b = mobileReportWorker;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.f(this);
    }
}
