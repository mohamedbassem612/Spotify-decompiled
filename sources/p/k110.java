package p;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class k110 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vek1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k110(vek1 vek1Var, byte b) {
        super(1);
        this.a = b;
        this.b = vek1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        vek1 vek1Var = this.b;
        switch (b) {
            case 0:
                ((rtr) obj).h = new lbq(new z5z(vek1Var, (byte) 6), new z5z(vek1Var, (byte) 7), (byte) 29);
                return rih1.a;
            default:
                View view = (View) vek1Var.m().invoke(new FrameLayout((Context) obj));
                view.addOnAttachStateChangeListener(new y22(vek1Var, (byte) 11));
                return view;
        }
    }
}
