package p;

import com.google.protobuf.Empty;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class anc1 implements Function0 {
    public final jkp0 a;
    public final mfb0 b;

    public anc1(jkp0 jkp0Var, mfb0 mfb0Var) {
        this.a = jkp0Var;
        this.b = mfb0Var;
    }

    public final Object invoke() {
        return ((be) this.a.b).callStream("spotify.puffin_esperanto.proto.PuffinService", "SubscribeToProcessingCompatibility", Empty.n()).map(ybx0.c).map(f4x0.c).doOnError(iqa1.Y).doOnNext(new z2a1(this, (byte) 11)).onErrorComplete().ignoreElements();
    }
}
