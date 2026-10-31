package p;

import android.view.Window;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ql9 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Window b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ql9(Window window, byte b) {
        super(1);
        this.a = b;
        this.b = window;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        Window window = this.b;
        switch (b) {
            case 0:
                csj1 csj1Var = new csj1(window, window.getDecorView());
                acq0 acq0Var = (acq0) csj1Var.b;
                acq0Var.G(519);
                acq0Var.K(2);
                return new rm(csj1Var, (byte) 10);
            default:
                if (window == null) {
                    return new tj4((byte) 17);
                }
                window.addFlags(128);
                return new xwm0(window, (byte) 26);
        }
    }
}
