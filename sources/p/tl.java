package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tl extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ String d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ short f;
    public final /* synthetic */ byte g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public tl(String str, String str2, qim0 qim0Var, boolean z, boolean z2, iu30 iu30Var, int i, int i2) {
        super(2);
        this.b = str;
        this.d = str2;
        this.h = qim0Var;
        this.c = z;
        this.e = z2;
        this.i = iu30Var;
        this.f = i;
        this.g = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        short s = this.f;
        Object obj3 = this.i;
        Object obj4 = this.h;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                iu30 iu30Var = (iu30) obj3;
                int iP = czo1.p(s | 1);
                byte b2 = this.g;
                String str = this.b;
                String str2 = this.d;
                zxo1.a(str, str2, (qim0) obj4, this.c, this.e, iu30Var, (b0k) obj, iP, b2);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(s | 1);
                byte b3 = this.g;
                String str3 = this.b;
                boolean z = this.c;
                poo1.a(str3, (gt40) obj4, z, (q10) obj3, this.d, this.e ? 1 : 0, (b0k) obj, iP2, b3);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public tl(String str, gt40 gt40Var, boolean z, q10 q10Var, String str2, int i, int i2, int i3) {
        super(2);
        this.b = str;
        this.h = gt40Var;
        this.c = z;
        this.i = q10Var;
        this.d = str2;
        this.e = i;
        this.f = i2;
        this.g = i3;
    }
}
