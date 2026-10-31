package p;

import com.spotify.home.evopage.mobius.Event;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class lsp0 extends a8d1 implements xu30 {
    public /* synthetic */ Throwable a;

    @Override // p.xu30
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        lsp0 lsp0Var = new lsp0(3, (lnm) obj3);
        lsp0Var.a = (Throwable) obj2;
        rih1 rih1Var = rih1.a;
        lsp0Var.invokeSuspend(rih1Var);
        return rih1Var;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        Throwable th = this.a;
        hm5.M(obj);
        new Event.FailedToLoadOfflineItems(th);
        return rih1.a;
    }
}
