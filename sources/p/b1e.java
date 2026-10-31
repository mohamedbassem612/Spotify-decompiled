package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class b1e extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dwl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b1e(dwl dwlVar, byte b) {
        super(1);
        this.a = b;
        this.b = dwlVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        dwl dwlVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                String str = ((evl) dwlVar).a;
                d261 d261Var = gzd1.a;
                mma0 mma0Var = d1e.a[0];
                d261Var.getClass();
                ((e261) obj).b(d261Var, str);
                break;
            case 1:
                String str2 = ((jvl) dwlVar).a;
                d261 d261Var2 = gzd1.a;
                mma0 mma0Var2 = d1e.a[0];
                d261Var2.getClass();
                ((e261) obj).b(d261Var2, str2);
                break;
            default:
                String str3 = ((xul) dwlVar).a.a;
                d261 d261Var3 = gzd1.a;
                mma0 mma0Var3 = d1e.a[0];
                d261Var3.getClass();
                ((e261) obj).b(d261Var3, str3);
                break;
        }
        return rih1Var;
    }
}
