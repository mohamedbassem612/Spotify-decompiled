package p;

import android.widget.FrameLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hem0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iem0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hem0(iem0 iem0Var, byte b) {
        super(1);
        this.a = b;
        this.b = iem0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        iem0 iem0Var = this.b;
        switch (b) {
            case 0:
                return q1o1.u(iem0Var.a.a((paj0) obj), u291.d(nim0.a, 1.0f), (FrameLayout.LayoutParams) null, 6);
            case 1:
                iem0Var.b.getClass();
                return new umf0((paj0) obj, new nas());
            default:
                iem0Var.b.getClass();
                return new umf0((paj0) obj, new nas());
        }
    }
}
