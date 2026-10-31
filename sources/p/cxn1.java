package p;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class cxn1 extends jan1 {
    public final /* synthetic */ byte n;
    public final /* synthetic */ Uri o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f4p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public cxn1(adm1 adm1Var, j8n1 j8n1Var, Uri uri, int i, byte b) {
        super(j8n1Var, (byte) 1);
        this.n = b;
        switch (b) {
            case 1:
                this.o = uri;
                this.f4p = i;
                Objects.requireNonNull(adm1Var);
                super(j8n1Var, (byte) 1);
                break;
            default:
                this.o = uri;
                this.f4p = i;
                Objects.requireNonNull(adm1Var);
                break;
        }
    }

    public final p331 d(Status status) {
        switch (this.n) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new hzq(new DataHolder(DataHolder.X, status.a));
            default:
                return new oyn1(status, 0);
        }
    }

    @Override // p.jan1
    public final void l(px40 px40Var) {
        byte b = this.n;
        boolean z = this.f4p;
        Uri uri = this.o;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                xdo1 xdo1Var = (xdo1) ((dqo1) px40Var).n();
                eno1 eno1Var = new eno1(this, (byte) 4);
                Parcel parcelA1 = xdo1Var.a1();
                zsn1.c(parcelA1, eno1Var);
                zsn1.b(parcelA1, uri);
                parcelA1.writeInt(z ? 1 : 0);
                xdo1Var.Z0(40, parcelA1);
                break;
            default:
                xdo1 xdo1Var2 = (xdo1) ((dqo1) px40Var).n();
                eno1 eno1Var2 = new eno1(this, (byte) 0);
                Parcel parcelA2 = xdo1Var2.a1();
                zsn1.c(parcelA2, eno1Var2);
                zsn1.b(parcelA2, uri);
                parcelA2.writeInt(z ? 1 : 0);
                xdo1Var2.Z0(41, parcelA2);
                break;
        }
    }
}
