package p;

import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ct20 extends a8d1 implements iu30 {
    public final /* synthetic */ long a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ct20(long j, lnm lnmVar) {
        super(1, lnmVar);
        this.a = j;
    }

    @Override // p.faa
    public final lnm create(lnm lnmVar) {
        return new ct20(this.a, lnmVar);
    }

    @Override // p.iu30
    public final Object invoke(Object obj) {
        ((ct20) create((lnm) obj)).invokeSuspend(rih1.a);
        throw null;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        hm5.M(obj);
        throw new TimeoutCancellationException("Timed out waiting for " + ((Object) jfv.v(this.a)), null);
    }
}
