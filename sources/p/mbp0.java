package p;

import com.spotify.core.coreimpl.ApplicationScopeConfiguration;
import com.spotify.cosmos.sharedcosmosrouterapi.SharedCosmosRouterApi;
import com.spotify.eventsender.api.EventSenderCoreBridge;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class mbp0 extends hab0 implements Function0 {
    public final /* synthetic */ ho80 a;
    public final /* synthetic */ xap0 b;
    public final /* synthetic */ xap0 c;
    public final /* synthetic */ y52 d;
    public final /* synthetic */ xap0 e;
    public final /* synthetic */ bbp0 f;
    public final /* synthetic */ xap0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mbp0(ho80 ho80Var, xap0 xap0Var, xap0 xap0Var2, y52 y52Var, xap0 xap0Var3, bbp0 bbp0Var, xap0 xap0Var4) {
        super(0);
        this.a = ho80Var;
        this.b = xap0Var;
        this.c = xap0Var2;
        this.d = y52Var;
        this.e = xap0Var3;
        this.f = bbp0Var;
        this.g = xap0Var4;
    }

    public final Object invoke() {
        return new b6n((a8n) this.a.invoke(), (c8n) this.b.invoke(), (p5n) this.c.invoke(), (ApplicationScopeConfiguration) this.d.invoke(), (SharedCosmosRouterApi) this.e.invoke(), (EventSenderCoreBridge) this.f.invoke(), (i420) this.g.invoke());
    }
}
