package com.spotify.mobius.coroutines;

import com.spotify.mobius.runners.WorkRunner;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import p.a8d1;
import p.c921;
import p.c9n;
import p.hm5;
import p.llm;
import p.lnm;
import p.o8n;
import p.q8r;
import p.rih1;
import p.smo1;
import p.vu30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/spotify/mobius/coroutines/DispatcherWorker;", "Lcom/spotify/mobius/runners/WorkRunner;", "mobius-coroutines"}, k = 1, mv = {1, 9, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public final class DispatcherWorker implements WorkRunner {
    public final llm a;

    /* JADX INFO: renamed from: com.spotify.mobius.coroutines.DispatcherWorker$post$1, reason: invalid class name */
    @q8r(c = "com.spotify.mobius.coroutines.DispatcherWorker$post$1", f = "DispatcherWorker.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp/c9n;", "Lp/rih1;", "<anonymous>", "(Lp/c9n;)V"}, k = 3, mv = {1, 9, 0})
    final class AnonymousClass1 extends a8d1 implements vu30 {
        public final /* synthetic */ Runnable b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Runnable runnable, lnm lnmVar) {
            super(2, lnmVar);
            this.b = runnable;
        }

        @Override // p.faa
        public final lnm create(Object obj, lnm lnmVar) {
            return DispatcherWorker.this.new AnonymousClass1(this.b, lnmVar);
        }

        @Override // p.vu30
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((c9n) obj, (lnm) obj2);
            rih1 rih1Var = rih1.a;
            anonymousClass1.invokeSuspend(rih1Var);
            return rih1Var;
        }

        @Override // p.faa
        public final Object invokeSuspend(Object obj) {
            hm5.M(obj);
            if (smo1.u(DispatcherWorker.this.a)) {
                this.b.run();
            }
            return rih1.a;
        }
    }

    public DispatcherWorker(o8n o8nVar) {
        this.a = smo1.e(o8nVar);
    }

    @Override // com.spotify.mobius.disposables.Disposable
    public final void dispose() {
        smo1.p(this.a, new CancellationException("DispatcherWorker disposed"));
    }

    @Override // com.spotify.mobius.runners.WorkRunner
    public final void post(Runnable runnable) {
        c921.y(this.a, (o8n) null, 0, new AnonymousClass1(runnable, null), 3);
    }
}
