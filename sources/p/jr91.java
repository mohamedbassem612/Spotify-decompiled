package p;

import android.widget.FrameLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jr91 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kr91 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jr91(kr91 kr91Var, byte b) {
        super(1);
        this.a = b;
        this.b = kr91Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        kr91 kr91Var = this.b;
        switch (b) {
            case 0:
                paj0 paj0Var = (paj0) obj;
                switch (kr91Var.a.a) {
                    case 0:
                        return new qj0(new gr91(), paj0Var);
                    case 1:
                        return new qj0(new gr91(), paj0Var);
                    case 2:
                        return new qj0(new gr91(), paj0Var);
                    default:
                        return new qj0(new gr91(), paj0Var);
                }
            default:
                return q1o1.u(kr91Var.b.a((paj0) obj), u291.f(nim0.a, 1.0f), (FrameLayout.LayoutParams) null, 6);
        }
    }
}
