package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yox0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cpx0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yox0(cpx0 cpx0Var, byte b) {
        super(1);
        this.a = b;
        this.b = cpx0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        cpx0 cpx0Var = this.b;
        switch (b) {
            case 0:
                uk00 uk00Var = cpx0Var.c;
                ((View) obj).setTag(2131427536, Boolean.TRUE);
                break;
            default:
                uk00 uk00Var2 = cpx0Var.c;
                ((View) obj).setTag(2131427536, Boolean.TRUE);
                break;
        }
        return rih1Var;
    }
}
