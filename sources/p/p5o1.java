package p;

import android.app.Activity;
import android.os.Parcel;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class p5o1 extends w4o1 {
    public final /* synthetic */ byte e;
    public final /* synthetic */ Activity f;
    public final /* synthetic */ o6o1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5o1(o6o1 o6o1Var, Activity activity, byte b) {
        super(o6o1Var.a, true);
        this.e = b;
        switch (b) {
            case 1:
                this.f = activity;
                this.g = o6o1Var;
                super(o6o1Var.a, true);
                break;
            case 2:
                this.f = activity;
                this.g = o6o1Var;
                super(o6o1Var.a, true);
                break;
            case 3:
                this.f = activity;
                this.g = o6o1Var;
                super(o6o1Var.a, true);
                break;
            default:
                this.f = activity;
                this.g = o6o1Var;
                break;
        }
    }

    public final void a() {
        switch (this.e) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                kvn1 kvn1Var = this.g.a.f;
                zod.s(kvn1Var);
                lyn1 lyn1VarJ = lyn1.j(this.f);
                long j = ((w4o1) this).b;
                kvn1 kvn1Var2 = kvn1Var;
                Parcel parcelS = kvn1Var2.s();
                drn1.a(parcelS, lyn1VarJ);
                parcelS.writeLong(j);
                kvn1Var2.B0(56, parcelS);
                break;
            case 1:
                kvn1 kvn1Var3 = this.g.a.f;
                zod.s(kvn1Var3);
                lyn1 lyn1VarJ2 = lyn1.j(this.f);
                long j2 = ((w4o1) this).b;
                kvn1 kvn1Var4 = kvn1Var3;
                Parcel parcelS2 = kvn1Var4.s();
                drn1.a(parcelS2, lyn1VarJ2);
                parcelS2.writeLong(j2);
                kvn1Var4.B0(55, parcelS2);
                break;
            case 2:
                kvn1 kvn1Var5 = this.g.a.f;
                zod.s(kvn1Var5);
                lyn1 lyn1VarJ3 = lyn1.j(this.f);
                long j3 = ((w4o1) this).b;
                kvn1 kvn1Var6 = kvn1Var5;
                Parcel parcelS3 = kvn1Var6.s();
                drn1.a(parcelS3, lyn1VarJ3);
                parcelS3.writeLong(j3);
                kvn1Var6.B0(52, parcelS3);
                break;
            default:
                kvn1 kvn1Var7 = this.g.a.f;
                zod.s(kvn1Var7);
                lyn1 lyn1VarJ4 = lyn1.j(this.f);
                long j4 = ((w4o1) this).b;
                kvn1 kvn1Var8 = kvn1Var7;
                Parcel parcelS4 = kvn1Var8.s();
                drn1.a(parcelS4, lyn1VarJ4);
                parcelS4.writeLong(j4);
                kvn1Var8.B0(54, parcelS4);
                break;
        }
    }
}
