package p;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kho1 implements zaa {
    public final /* synthetic */ byte a;
    public final bsd1 b;

    public kho1(xjn1 xjn1Var, bsd1 bsd1Var) {
        this.a = (byte) 0;
        this.b = bsd1Var;
        Objects.requireNonNull(xjn1Var);
    }

    public final void a(p331 p331Var) {
        byte b = this.a;
        bsd1 bsd1Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                qho1 qho1Var = (qho1) p331Var;
                Status status = qho1Var.a;
                if (!status.j()) {
                    bsd1Var.a(rzn1.r(status));
                } else {
                    bsd1Var.b(qho1Var.b);
                }
                break;
            case 1:
                Status status2 = (Status) p331Var;
                int i = status2.a;
                if (i == 0) {
                    bsd1Var.b(Boolean.TRUE);
                } else if (i != 4002) {
                    bsd1Var.a(new ApiException(status2));
                } else {
                    bsd1Var.b(Boolean.FALSE);
                }
                break;
            default:
                Status status3 = (Status) p331Var;
                int i2 = status3.a;
                if (i2 == 0 || i2 == 4001) {
                    bsd1Var.b((Object) null);
                } else {
                    bsd1Var.a(new ApiException(status3));
                }
                break;
        }
    }

    public /* synthetic */ kho1(bsd1 bsd1Var, byte b) {
        this.a = b;
        this.b = bsd1Var;
    }
}
