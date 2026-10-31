package p;

import android.os.Bundle;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class dfo1 extends bfn1 {
    public final /* synthetic */ byte l;
    public final /* synthetic */ bsd1 m;

    public /* synthetic */ dfo1(pxo1 pxo1Var, bsd1 bsd1Var, byte b) {
        this.l = b;
        this.m = bsd1Var;
    }

    public final void D0(Bundle bundle) {
        byte b = this.l;
        bsd1 bsd1Var = this.m;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                bsd1Var.b(bundle);
                break;
            default:
                bsd1Var.b(bundle);
                break;
        }
    }
}
