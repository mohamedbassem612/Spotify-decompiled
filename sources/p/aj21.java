package p;

import com.spotify.mobius.rx3.RxMobius;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class aj21 extends hab0 implements vu30 {
    public final /* synthetic */ cj21 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj21(cj21 cj21Var) {
        super(2);
        this.a = cj21Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        wi21 wi21Var = this.a.d;
        return RxMobius.a(ui21.a, wi21Var.a.c).h(wi21Var.b);
    }
}
