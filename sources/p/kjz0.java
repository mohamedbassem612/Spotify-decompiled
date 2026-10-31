package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kjz0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ tob1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kjz0(boolean z, ven0 ven0Var, byte b) {
        super(1);
        this.a = b;
        this.b = z;
        this.c = ven0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        int iFloatValue = 0;
        tob1 tob1Var = this.c;
        boolean z = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new qr80(((long) (((int) (((Number) tob1Var.getValue()).floatValue() * ((wat) obj).X0(20.0f))) * (z ? 1 : 0))) << 32);
            case 1:
                wat watVar = (wat) obj;
                if (z) {
                    iFloatValue = (int) (((Number) tob1Var.getValue()).floatValue() * watVar.X0(50.0f));
                }
                return new qr80(((long) iFloatValue) & 4294967295L);
            default:
                wat watVar2 = (wat) obj;
                if (z) {
                    iFloatValue = (int) (((Number) tob1Var.getValue()).floatValue() * watVar2.X0(50.0f));
                }
                return new qr80(((long) iFloatValue) & 4294967295L);
        }
    }
}
