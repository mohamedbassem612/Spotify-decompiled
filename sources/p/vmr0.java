package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vmr0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tja b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vmr0(tja tjaVar, byte b) {
        super(1);
        this.a = b;
        this.b = tjaVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        tja tjaVar = this.b;
        switch (b) {
            case 0:
                ((ljr) ((View) obj).getTag()).f(tjaVar);
                break;
            default:
                ((ljr) ((View) obj).getTag()).f(tjaVar);
                break;
        }
        return rih1Var;
    }
}
