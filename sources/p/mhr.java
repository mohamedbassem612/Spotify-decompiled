package p;

import com.spotify.cosmos.util.policy.proto.ShowDecorationPolicy;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissReason;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Consumer;
import spotify.collection.esperanto.proto.CollectionDecorateRequest;
import spotify.collection.esperanto.proto.CollectionShowDecorationPolicy;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class mhr implements ha8 {
    public final ccc0 a;
    public final c9n b;
    public final kt91 c;
    public final Scheduler d;
    public final Scheduler e;
    public final r5h f;
    public final ljg g;
    public final qhr h;
    public final hhr i;
    public final phr j;
    public final q8n k;
    public final vku l = new vku();
    public final vku m = new vku();
    public mmr0 n;

    public mhr(ccc0 ccc0Var, c9n c9nVar, kt91 kt91Var, Scheduler scheduler, Scheduler scheduler2, r5h r5hVar, ljg ljgVar, qhr qhrVar, hhr hhrVar, phr phrVar, q8n q8nVar) {
        this.a = ccc0Var;
        this.b = c9nVar;
        this.c = kt91Var;
        this.d = scheduler;
        this.e = scheduler2;
        this.f = r5hVar;
        this.g = ljgVar;
        this.h = qhrVar;
        this.i = hhrVar;
        this.j = phrVar;
        this.k = q8nVar;
    }

    public final void a(String str) {
        mmr0 mmr0Var = this.n;
        if (mmr0Var == null || u890.j((String) mmr0Var.a, str)) {
            if (this.n == null) {
                b(str);
                return;
            }
            return;
        }
        sqm sqmVar = new sqm(this, str, (byte) 23);
        mmr0 mmr0Var2 = this.n;
        if (mmr0Var2 != null) {
            this.g.b((String) mmr0Var2.b, DismissReason.ProgrammaticDismissal.INSTANCE);
            sqmVar.invoke();
        } else {
            sqmVar.invoke();
        }
        this.n = null;
    }

    public final void b(String str) {
        vku vkuVar = this.m;
        vkuVar.c();
        e3h e3hVarP = CollectionDecorateRequest.p();
        e3hVarP.q(str);
        c7h c7hVarN = CollectionShowDecorationPolicy.n();
        c7hVarN.s((ShowDecorationPolicy) ShowDecorationPolicy.newBuilder().setName(true).setCovers(true).build());
        e3hVarP.w((CollectionShowDecorationPolicy) c7hVarN.build());
        vkuVar.a(this.f.b((CollectionDecorateRequest) e3hVarP.build()).flatMap(new khr(this, str)).observeOn(this.e).onErrorComplete().subscribe((Consumer) new lhr(this, str)));
    }
}
