package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.functions.Function;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class k150 implements Function {
    public final /* synthetic */ l150 a;

    public k150(l150 l150Var) {
        this.a = l150Var;
    }

    public final Object apply(Object obj) {
        Consumer consumer = (Consumer) obj;
        h150 h150Var = new h150();
        l150 l150Var = this.a;
        r050 r050Var = l150Var.c;
        consumer.getClass();
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.g(j050.class, new o050(r050Var));
        subtypeEffectHandlerBuilderC.g(k050.class, new p050(r050Var));
        subtypeEffectHandlerBuilderC.c(n050.class, new q050(consumer));
        return l1d.g(Mobius.d(h150Var, RxConnectables.a(subtypeEffectHandlerBuilderC.h()))).h(l150Var.b).d(new i150(l150Var)).b(new j150(l150Var));
    }
}
