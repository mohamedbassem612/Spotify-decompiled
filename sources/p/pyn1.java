package p;

import android.app.Activity;
import android.os.Parcel;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class pyn1 extends w4o1 {
    public final /* synthetic */ byte e = 1;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pyn1(o6o1 o6o1Var, Activity activity) {
        super(o6o1Var.a, true);
        this.f = activity;
        this.g = o6o1Var;
    }

    @Override // p.w4o1
    public final void a() {
        switch (this.e) {
            case 0:
                svn1 svn1Var = ((u6o1) this.g).f;
                zod.s(svn1Var);
                qfp0 qfp0Var = new qfp0(this.f);
                long j = this.a;
                kvn1 kvn1Var = (kvn1) svn1Var;
                Parcel parcelS = kvn1Var.s();
                parcelS.writeString("fcm");
                parcelS.writeString("_ln");
                drn1.b(parcelS, qfp0Var);
                parcelS.writeInt(1);
                parcelS.writeLong(j);
                kvn1Var.B0(4, parcelS);
                break;
            default:
                svn1 svn1Var2 = ((o6o1) this.g).a.f;
                zod.s(svn1Var2);
                u9 u9VarJ = lyn1.j((Activity) this.f);
                long j2 = this.b;
                kvn1 kvn1Var2 = (kvn1) svn1Var2;
                Parcel parcelS2 = kvn1Var2.s();
                drn1.a(parcelS2, u9VarJ);
                parcelS2.writeLong(j2);
                kvn1Var2.B0(51, parcelS2);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pyn1(u6o1 u6o1Var, String str) {
        super(u6o1Var, true);
        this.f = str;
        this.g = u6o1Var;
    }
}
