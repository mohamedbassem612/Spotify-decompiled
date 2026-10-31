package p;

import io.reactivex.rxjava3.core.Observable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gjp0 implements Function0 {
    public final y170 a;
    public final gfr b;
    public final vip0 c;
    public final nfb0 d;
    public final g0l e;
    public final b050 f;

    public gjp0(y170 y170Var, gfr gfrVar, vip0 vip0Var, nfb0 nfb0Var, g0l g0lVar, b050 b050Var) {
        this.a = y170Var;
        this.b = gfrVar;
        this.c = vip0Var;
        this.d = nfb0Var;
        this.e = g0lVar;
        this.f = b050Var;
    }

    public final Object invoke() {
        return ((Observable) this.a.invoke()).switchMap(new zud0(this, (byte) 26));
    }
}
