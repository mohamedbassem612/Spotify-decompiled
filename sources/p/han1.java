package p;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class han1 extends mh70 implements IInterface {
    public final /* synthetic */ byte l;
    public final /* synthetic */ jan1 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public han1(jan1 jan1Var, byte b) {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks", (byte) 1);
        this.l = b;
        this.m = jan1Var;
    }

    public final boolean X0(int i, Parcel parcel, Parcel parcel2) {
        jan1 jan1Var = this.m;
        byte b = this.l;
        switch (i) {
            case 101:
                ean1.a(parcel, Status.CREATOR);
                k220.c();
                return false;
            case 102:
                Status statusA = ean1.a(parcel, Status.CREATOR);
                switch (b) {
                    case SplitInstallErrorCode.NO_ERROR /* 0 */:
                        ((ian1) jan1Var).g(statusA);
                        break;
                    default:
                        throw new UnsupportedOperationException();
                }
                break;
            case 103:
                Status statusA2 = ean1.a(parcel, Status.CREATOR);
                switch (b) {
                    case 1:
                        ((ian1) jan1Var).g(statusA2);
                        break;
                    default:
                        throw new UnsupportedOperationException();
                }
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
