package p;

import android.os.SystemClock;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bca implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dca b;

    public /* synthetic */ bca(dca dcaVar, byte b) {
        this.a = b;
        this.b = dcaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        dca dcaVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                if (dcaVar.d > 0) {
                    SystemClock.uptimeMillis();
                }
                dcaVar.setVisibility(0);
                break;
            default:
                ((c8v) dcaVar.getCurrentDrawable()).e(false, false, true);
                if (dcaVar.getProgressDrawable() == null || !dcaVar.getProgressDrawable().isVisible()) {
                    if (dcaVar.getIndeterminateDrawable() == null || !dcaVar.getIndeterminateDrawable().isVisible()) {
                        dcaVar.setVisibility(4);
                    }
                }
                break;
        }
    }
}
