package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class oze1 extends sgp0 {
    public final /* synthetic */ byte b;
    public final /* synthetic */ pze1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oze1(pze1 pze1Var, byte b) {
        super((Object) null);
        this.b = b;
        switch (b) {
            case 1:
                Boolean bool = Boolean.FALSE;
                this.c = pze1Var;
                super(bool);
                break;
            default:
                this.c = pze1Var;
                break;
        }
    }

    public final void a(mma0 mma0Var, Object obj, Object obj2) {
        byte b = this.b;
        pze1 pze1Var = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                pze1Var.c();
                break;
            default:
                if (((Boolean) obj).booleanValue() != ((Boolean) obj2).booleanValue()) {
                    pze1Var.c();
                }
                break;
        }
    }
}
