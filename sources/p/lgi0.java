package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lgi0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pbq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lgi0(pbq pbqVar, byte b) {
        super(1);
        this.a = b;
        this.b = pbqVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        pbq pbqVar = this.b;
        switch (b) {
            case 0:
                Object obj2 = pbqVar.g;
                ((View) obj).setTag(2131427536, Boolean.TRUE);
                break;
            default:
                Object obj3 = pbqVar.g;
                ((View) obj).setTag(2131427536, Boolean.TRUE);
                break;
        }
        return rih1Var;
    }
}
