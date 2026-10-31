package com.spotify.esperanto.esperantocosmos;

import com.spotify.cosmos.cosmos.Lifetime;
import kotlin.Metadata;
import p.hab0;
import p.iu30;
import p.p811;
import p.rih1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lp/rih1;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {2, 3, 0})
public final class CosmosCoroutineTransport$callSingle$2$1 extends hab0 implements iu30 {
    final /* synthetic */ p811 $lifetime;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CosmosCoroutineTransport$callSingle$2$1(p811 p811Var) {
        super(1);
        this.$lifetime = p811Var;
    }

    public final void invoke(Throwable th) {
        ((Lifetime) this.$lifetime.a).release();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return rih1.a;
    }
}
