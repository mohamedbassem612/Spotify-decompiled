package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class k2y0 extends hab0 implements vu30 {
    public final /* synthetic */ m2y0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2y0(m2y0 m2y0Var) {
        super(2);
        this.a = m2y0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        w2y0 w2y0Var = this.a.c;
        return Mobius.d(t2y0.a, new a(o6x.a, kk0.i(MobiusCoroutines.a))).d(new u2y0(w2y0Var)).b(new v2y0(w2y0Var));
    }
}
