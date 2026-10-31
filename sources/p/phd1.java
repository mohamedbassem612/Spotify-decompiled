package p;

import com.spotify.mobius.MobiusLoop;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class phd1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qhd1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ phd1(qhd1 qhd1Var, byte b) {
        super(1);
        this.a = b;
        this.b = qhd1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        qhd1 qhd1Var = this.b;
        switch (b) {
            case 0:
                MobiusLoop mobiusLoop = qhd1Var.T0;
                if (mobiusLoop != null) {
                    mobiusLoop.dispose();
                }
                break;
            default:
                MobiusLoop mobiusLoop2 = qhd1Var.V0;
                if (mobiusLoop2 != null) {
                    mobiusLoop2.dispose();
                }
                break;
        }
        return rih1Var;
    }
}
