package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class h0k extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ f4h1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0k(f4h1 f4h1Var, byte b) {
        super(1);
        this.a = b;
        this.b = f4h1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        f4h1 f4h1Var = this.b;
        switch (b) {
            case 0:
                f4h1Var.start();
                return new rm(f4h1Var, (byte) 25);
            default:
                return (View) f4h1Var.getView();
        }
    }
}
