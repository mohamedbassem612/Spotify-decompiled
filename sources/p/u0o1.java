package p;

import android.os.Parcel;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class u0o1 extends w4o1 {
    public final /* synthetic */ byte e;
    public final /* synthetic */ cvn1 f;
    public final /* synthetic */ u6o1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0o1(u6o1 u6o1Var, cvn1 cvn1Var, byte b) {
        super(u6o1Var, true);
        this.e = b;
        this.f = cvn1Var;
        this.g = u6o1Var;
    }

    public final void a() {
        switch (this.e) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                kvn1 kvn1Var = this.g.f;
                zod.s(kvn1Var);
                mh70 mh70Var = this.f;
                kvn1 kvn1Var2 = kvn1Var;
                Parcel parcelS = kvn1Var2.s();
                drn1.b(parcelS, mh70Var);
                kvn1Var2.B0(21, parcelS);
                break;
            case 1:
                kvn1 kvn1Var3 = this.g.f;
                zod.s(kvn1Var3);
                mh70 mh70Var2 = this.f;
                kvn1 kvn1Var4 = kvn1Var3;
                Parcel parcelS2 = kvn1Var4.s();
                drn1.b(parcelS2, mh70Var2);
                kvn1Var4.B0(19, parcelS2);
                break;
            default:
                kvn1 kvn1Var5 = this.g.f;
                zod.s(kvn1Var5);
                mh70 mh70Var3 = this.f;
                kvn1 kvn1Var6 = kvn1Var5;
                Parcel parcelS3 = kvn1Var6.s();
                drn1.b(parcelS3, mh70Var3);
                kvn1Var6.B0(22, parcelS3);
                break;
        }
    }

    public final void b() {
        byte b = this.e;
        cvn1 cvn1Var = this.f;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                cvn1Var.D0(null);
                break;
            case 1:
                cvn1Var.D0(null);
                break;
            default:
                cvn1Var.D0(null);
                break;
        }
    }
}
