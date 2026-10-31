package p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class lj1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mj1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lj1(mj1 mj1Var, byte b) {
        super(0);
        this.a = b;
        this.b = mj1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        mj1 mj1Var = this.b;
        switch (b) {
            case 0:
                return new DispatcherWorker(mj1Var.g);
            case 1:
                return new DispatcherWorker(mj1Var.h);
            case 2:
                mj1Var.d.getClass();
                return new q251(u151.a);
            default:
                return mj1Var.e.a(mj1Var.i, new jj1(mj1Var, (byte) 3));
        }
    }
}
