package p;

import android.os.Parcel;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class fzn1 extends w4o1 {
    public final /* synthetic */ byte e;
    public final /* synthetic */ String f;
    public final /* synthetic */ u6o1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzn1(u6o1 u6o1Var, String str) {
        super(u6o1Var, true);
        this.e = (byte) 0;
        this.f = str;
        Objects.requireNonNull(u6o1Var);
        this.g = u6o1Var;
    }

    public final void a() {
        switch (this.e) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                kvn1 kvn1Var = this.g.f;
                zod.s(kvn1Var);
                String str = this.f;
                long j = ((w4o1) this).a;
                kvn1 kvn1Var2 = kvn1Var;
                Parcel parcelS = kvn1Var2.s();
                parcelS.writeString(str);
                parcelS.writeLong(j);
                kvn1Var2.B0(7, parcelS);
                break;
            case 1:
                kvn1 kvn1Var3 = this.g.f;
                zod.s(kvn1Var3);
                String str2 = this.f;
                long j2 = ((w4o1) this).b;
                kvn1 kvn1Var4 = kvn1Var3;
                Parcel parcelS2 = kvn1Var4.s();
                parcelS2.writeString(str2);
                parcelS2.writeLong(j2);
                kvn1Var4.B0(23, parcelS2);
                break;
            default:
                kvn1 kvn1Var5 = this.g.f;
                zod.s(kvn1Var5);
                String str3 = this.f;
                long j3 = ((w4o1) this).b;
                kvn1 kvn1Var6 = kvn1Var5;
                Parcel parcelS3 = kvn1Var6.s();
                parcelS3.writeString(str3);
                parcelS3.writeLong(j3);
                kvn1Var6.B0(24, parcelS3);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fzn1(u6o1 u6o1Var, String str, byte b) {
        super(u6o1Var, true);
        this.e = b;
        this.f = str;
        this.g = u6o1Var;
    }
}
