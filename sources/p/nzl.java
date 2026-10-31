package p;

import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nzl {
    public final em3 a;
    public final ms3 b;
    public final i3h1 c;
    public final hu3 d;
    public final boolean e;

    public nzl(em3 em3Var, ms3 ms3Var, i3h1 i3h1Var, hu3 hu3Var, boolean z) {
        this.a = em3Var;
        this.b = ms3Var;
        this.c = i3h1Var;
        this.d = hu3Var;
        this.e = z;
    }

    public final ObservableTransformer a(Consumer consumer) {
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        byte b = 0;
        subtypeEffectHandlerBuilderC.c(yyl.class, new mzl(this, b));
        subtypeEffectHandlerBuilderC.g(azl.class, new bk1(this, (byte) 8));
        byte b2 = 1;
        subtypeEffectHandlerBuilderC.c(gzl.class, new lzl(this, consumer, b2));
        subtypeEffectHandlerBuilderC.g(zyl.class, nm3.d);
        subtypeEffectHandlerBuilderC.c(izl.class, new dn(consumer, (byte) 18));
        subtypeEffectHandlerBuilderC.c(czl.class, new mzl(this, b2));
        subtypeEffectHandlerBuilderC.c(bzl.class, new mzl(this, (byte) 2));
        subtypeEffectHandlerBuilderC.c(dzl.class, new mzl(this, (byte) 3));
        subtypeEffectHandlerBuilderC.c(fzl.class, new mzl(this, (byte) 4));
        subtypeEffectHandlerBuilderC.c(xyl.class, new dn(consumer, (byte) 15));
        subtypeEffectHandlerBuilderC.c(hzl.class, new lzl(this, consumer, b));
        subtypeEffectHandlerBuilderC.c(jzl.class, new dn(consumer, (byte) 16));
        subtypeEffectHandlerBuilderC.c(wyl.class, new dn(consumer, (byte) 17));
        return subtypeEffectHandlerBuilderC.h();
    }
}
