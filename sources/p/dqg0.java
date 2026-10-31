package p;

import android.widget.FrameLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dqg0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ FrameLayout b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dqg0(FrameLayout frameLayout, byte b) {
        super(1);
        this.a = b;
        this.b = frameLayout;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        FrameLayout frameLayout = this.b;
        switch (b) {
            case 0:
                Object tag = frameLayout.getTag(2131428154);
                iu30 iu30Var = w0h1.y(1, tag) ? (iu30) tag : null;
                if (iu30Var != null) {
                    iu30Var.invoke(obj);
                }
                return rih1.a;
            default:
                return frameLayout;
        }
    }
}
