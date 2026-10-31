package p;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ywn1 extends jan1 {
    public final /* synthetic */ byte n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ywn1(j8n1 j8n1Var, byte b) {
        super(j8n1Var, (byte) 1);
        this.n = b;
    }

    public final p331 d(Status status) {
        switch (this.n) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new hzq(new DataHolder(DataHolder.X, status.a));
            case 1:
                return new bho1(status, new ArrayList());
            default:
                return new wen1(status, null);
        }
    }

    @Override // p.jan1
    public final void l(px40 px40Var) {
        switch (this.n) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                xdo1 xdo1Var = (xdo1) ((dqo1) px40Var).n();
                eno1 eno1Var = new eno1(this, (byte) 4);
                Parcel parcelA1 = xdo1Var.a1();
                zsn1.c(parcelA1, eno1Var);
                xdo1Var.Z0(8, parcelA1);
                break;
            case 1:
                xdo1 xdo1Var2 = (xdo1) ((dqo1) px40Var).n();
                eno1 eno1Var2 = new eno1(this, (byte) 3);
                Parcel parcelA2 = xdo1Var2.a1();
                zsn1.c(parcelA2, eno1Var2);
                xdo1Var2.Z0(15, parcelA2);
                break;
            default:
                xdo1 xdo1Var3 = (xdo1) ((dqo1) px40Var).n();
                eno1 eno1Var3 = new eno1(this, (byte) 1);
                Parcel parcelA3 = xdo1Var3.a1();
                zsn1.c(parcelA3, eno1Var3);
                parcelA3.writeInt(1);
                xdo1Var3.Z0(43, parcelA3);
                break;
        }
    }
}
