package p;

import android.os.Bundle;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class a22 implements ne41 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ h22 b;

    public /* synthetic */ a22(h22 h22Var, byte b) {
        this.a = b;
        this.b = h22Var;
    }

    public final Bundle a() {
        byte b = this.a;
        h22 h22Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                Bundle bundle = new Bundle();
                bundle.putSerializable("STATE_KEY_VIEW_ID", (UUID) h22Var.U1.getValue());
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("STATE_TRACKED_DROPDOWN_SEARCH", h22Var.V1);
                return bundle2;
        }
    }
}
