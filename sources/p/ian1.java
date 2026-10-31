package p;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ian1 extends jan1 {
    public final /* synthetic */ byte n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ian1(j8n1 j8n1Var, byte b) {
        super(j8n1Var, (byte) 0);
        this.n = b;
    }

    public final /* bridge */ /* synthetic */ p331 d(Status status) {
        byte b = this.n;
        return status;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [p.gan1, p.xaa] */
    /* JADX WARN: Type inference failed for: r4v3, types: [p.gan1, p.xaa] */
    @Override // p.jan1
    public final void l(px40 px40Var) {
        switch (this.n) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ?? r4 = (gan1) px40Var;
                nan1 nan1Var = (nan1) r4.n();
                mh70 han1Var = new han1(this, (byte) 0);
                GoogleSignInOptions googleSignInOptions = r4.B;
                Parcel parcelS = nan1Var.s();
                int i = ean1.a;
                parcelS.writeStrongBinder(han1Var);
                ean1.b(parcelS, googleSignInOptions);
                nan1Var.B0(102, parcelS);
                break;
            default:
                ?? r5 = (gan1) px40Var;
                nan1 nan1Var2 = (nan1) r5.n();
                mh70 han1Var2 = new han1(this, (byte) 1);
                GoogleSignInOptions googleSignInOptions2 = r5.B;
                Parcel parcelS2 = nan1Var2.s();
                int i2 = ean1.a;
                parcelS2.writeStrongBinder(han1Var2);
                ean1.b(parcelS2, googleSignInOptions2);
                nan1Var2.B0(103, parcelS2);
                break;
        }
    }
}
