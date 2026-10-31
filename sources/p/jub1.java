package p;

import android.os.Looper;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jub1 extends BasePendingResult {
    public final /* synthetic */ byte n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jub1(Looper looper) {
        super(looper);
        this.n = (byte) 0;
    }

    public final p331 d(Status status) {
        switch (this.n) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return status;
            case 1:
                return new won1(this, status);
            default:
                pue0 pue0Var = b4e.m;
                return status;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jub1(j8n1 j8n1Var, byte b) {
        super(j8n1Var);
        this.n = b;
    }
}
