package p;

import android.widget.FrameLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xr30 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yr30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xr30(yr30 yr30Var, byte b) {
        super(1);
        this.a = b;
        this.b = yr30Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        yr30 yr30Var = this.b;
        switch (b) {
            case 0:
                return q1o1.u(yr30Var.a.a((paj0) obj), u291.d(nim0.a, 1.0f), (FrameLayout.LayoutParams) null, 6);
            default:
                yr30Var.b.getClass();
                return new qj0((paj0) obj, new f0s());
        }
    }
}
