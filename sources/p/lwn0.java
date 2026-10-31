package p;

import com.spotify.mobius.Mobius;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class lwn0 extends hab0 implements Function0 {
    public final /* synthetic */ mwn0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lwn0(mwn0 mwn0Var) {
        super(0);
        this.a = mwn0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        rve0 rve0Var = new rve0((byte) 9);
        mwn0 mwn0Var = this.a;
        return gvg.d("NavigationLogger", Mobius.d(rve0Var, new ku1(mwn0Var.b, (byte) 23))).d(vf61.a1).b(new erd(mwn0Var.e)).g(new lhm0(null, null, 2, z6x.a, null, null));
    }
}
