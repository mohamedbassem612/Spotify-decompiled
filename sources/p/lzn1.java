package p;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class lzn1 extends w4o1 {
    public final /* synthetic */ byte e = 1;
    public final /* synthetic */ u6o1 f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lzn1(u6o1 u6o1Var, Boolean bool) {
        super(u6o1Var, true);
        this.g = bool;
        Objects.requireNonNull(u6o1Var);
        this.f = u6o1Var;
    }

    public final void a() {
        switch (this.e) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                kvn1 kvn1Var = this.f.f;
                zod.s(kvn1Var);
                boolean zBooleanValue = ((Boolean) this.g).booleanValue();
                long j = ((w4o1) this).a;
                kvn1 kvn1Var2 = kvn1Var;
                Parcel parcelS = kvn1Var2.s();
                int i = drn1.a;
                parcelS.writeInt(zBooleanValue ? 1 : 0);
                parcelS.writeLong(j);
                kvn1Var2.B0(11, parcelS);
                break;
            case 1:
                kvn1 kvn1Var3 = this.f.f;
                zod.s(kvn1Var3);
                Bundle bundle = (Bundle) this.g;
                long j2 = ((w4o1) this).a;
                kvn1 kvn1Var4 = kvn1Var3;
                Parcel parcelS2 = kvn1Var4.s();
                drn1.a(parcelS2, bundle);
                parcelS2.writeLong(j2);
                kvn1Var4.B0(45, parcelS2);
                break;
            case 2:
                kvn1 kvn1Var5 = this.f.f;
                zod.s(kvn1Var5);
                qfp0 qfp0Var = new qfp0((Exception) this.g);
                qfp0 qfp0Var2 = new qfp0((Object) null);
                qfp0 qfp0Var3 = new qfp0((Object) null);
                kvn1 kvn1Var6 = kvn1Var5;
                Parcel parcelS3 = kvn1Var6.s();
                parcelS3.writeInt(5);
                parcelS3.writeString("Error with data collection. Data lost.");
                drn1.b(parcelS3, qfp0Var);
                drn1.b(parcelS3, qfp0Var2);
                drn1.b(parcelS3, qfp0Var3);
                kvn1Var6.B0(33, parcelS3);
                break;
            default:
                kvn1 kvn1Var7 = this.f.f;
                zod.s(kvn1Var7);
                g5o1 g5o1Var = (g5o1) this.g;
                kvn1 kvn1Var8 = kvn1Var7;
                Parcel parcelS4 = kvn1Var8.s();
                drn1.b(parcelS4, g5o1Var);
                kvn1Var8.B0(35, parcelS4);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lzn1(u6o1 u6o1Var, Bundle bundle) {
        super(u6o1Var, true);
        this.g = bundle;
        Objects.requireNonNull(u6o1Var);
        this.f = u6o1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lzn1(u6o1 u6o1Var, Exception exc) {
        super(u6o1Var, false);
        this.g = exc;
        this.f = u6o1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lzn1(u6o1 u6o1Var, g5o1 g5o1Var) {
        super(u6o1Var, true);
        this.g = g5o1Var;
        this.f = u6o1Var;
    }
}
