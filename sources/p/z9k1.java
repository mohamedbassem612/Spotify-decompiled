package p;

import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Scheduler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class z9k1 extends hab0 implements Function0 {
    public final /* synthetic */ e821 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z9k1(e821 e821Var) {
        super(0);
        this.a = e821Var;
    }

    public final Object invoke() {
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        e821 e821Var = this.a;
        y9k1 y9k1Var = new y9k1(e821Var, (byte) 9);
        Scheduler scheduler = (Scheduler) e821Var.c;
        viw.b(subtypeEffectHandlerBuilderC, e9k1.class, y9k1Var, scheduler);
        subtypeEffectHandlerBuilderC.d(f9k1.class, new rdj1(e821Var, (byte) 3), scheduler);
        viw.b(subtypeEffectHandlerBuilderC, b9k1.class, new y9k1(e821Var, (byte) 11), scheduler);
        viw.b(subtypeEffectHandlerBuilderC, p9k1.class, new y9k1(e821Var, (byte) 12), scheduler);
        viw.b(subtypeEffectHandlerBuilderC, p8k1.class, new y9k1(e821Var, (byte) 13), scheduler);
        viw.b(subtypeEffectHandlerBuilderC, q8k1.class, new y9k1(e821Var, (byte) 14), scheduler);
        viw.b(subtypeEffectHandlerBuilderC, u8k1.class, new y9k1(e821Var, (byte) 15), scheduler);
        viw.b(subtypeEffectHandlerBuilderC, s8k1.class, new y9k1(e821Var, (byte) 16), scheduler);
        viw.b(subtypeEffectHandlerBuilderC, t8k1.class, new y9k1(e821Var, (byte) 17), scheduler);
        viw.b(subtypeEffectHandlerBuilderC, y8k1.class, new y9k1(e821Var, (byte) 0), scheduler);
        viw.b(subtypeEffectHandlerBuilderC, x8k1.class, new y9k1(e821Var, (byte) 1), scheduler);
        viw.b(subtypeEffectHandlerBuilderC, z8k1.class, new y9k1(e821Var, (byte) 2), scheduler);
        viw.b(subtypeEffectHandlerBuilderC, v8k1.class, new y9k1(e821Var, (byte) 3), scheduler);
        viw.b(subtypeEffectHandlerBuilderC, c9k1.class, new y9k1(e821Var, (byte) 4), scheduler);
        viw.b(subtypeEffectHandlerBuilderC, w8k1.class, new y9k1(e821Var, (byte) 5), scheduler);
        viw.b(subtypeEffectHandlerBuilderC, m8k1.class, new y9k1(e821Var, (byte) 6), scheduler);
        viw.b(subtypeEffectHandlerBuilderC, d9k1.class, new y9k1(e821Var, (byte) 7), scheduler);
        viw.b(subtypeEffectHandlerBuilderC, m9k1.class, new y9k1(e821Var, (byte) 8), scheduler);
        subtypeEffectHandlerBuilderC.g(k9k1.class, new uiw(new xaj1(e821Var, (byte) 29)));
        subtypeEffectHandlerBuilderC.f(new lxh1(e821Var, (byte) 4), scheduler);
        viw.b(subtypeEffectHandlerBuilderC, i9k1.class, new y9k1(e821Var, (byte) 10), scheduler);
        return subtypeEffectHandlerBuilderC.h();
    }
}
