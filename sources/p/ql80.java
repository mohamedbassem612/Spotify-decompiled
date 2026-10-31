package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ql80 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ahs b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ql80(ahs ahsVar, byte b) {
        super(2);
        this.a = b;
        this.b = ahsVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ahs ahsVar = this.b;
        switch (b) {
            case 0:
                ahsVar.b.invoke(new rl80((View) obj, (zl80) obj2));
                break;
            case 1:
                ahsVar.b.invoke(new sl80(((vl80) obj2).d, 1));
                break;
            default:
                ahsVar.b.invoke(new sl80(((vl80) obj2).d, 2));
                break;
        }
        return rih1Var;
    }
}
