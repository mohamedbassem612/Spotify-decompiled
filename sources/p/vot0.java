package p;

import com.spotify.player.model.PlayOrigin;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vot0 extends hab0 implements Function0 {
    public final /* synthetic */ myq0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vot0(myq0 myq0Var) {
        super(0);
        this.a = myq0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        myq0 myq0Var = this.a;
        h0r0 h0r0VarB = myq0.c(myq0Var).d.b();
        return PlayOrigin.builder(cwl1.D(h0r0VarB).a.a()).featureVersion("n/a").viewUri(cwl1.D(h0r0VarB).b.a).referrerIdentifier(myq0.c(myq0Var).a()).build();
    }
}
