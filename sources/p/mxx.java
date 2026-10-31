package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mxx extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t24 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mxx(t24 t24Var, byte b) {
        super(1);
        this.a = b;
        this.b = t24Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        t24 t24Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new qr80(((long) jch0.U(t24Var.g())) << 32);
            default:
                hav0 hav0Var = (hav0) obj;
                t24Var.b(Float.intBitsToFloat((int) (p8p1.B(hav0Var, false) >> 32)));
                hav0Var.a();
                return rih1.a;
        }
    }
}
