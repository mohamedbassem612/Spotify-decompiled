package p;

import android.net.Uri;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zhs0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kis0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zhs0(kis0 kis0Var, byte b) {
        super(3);
        this.a = b;
        this.b = kis0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        kis0 kis0Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj3).intValue();
                Uri uri = Uri.parse(kis0Var.c);
                String str = kis0Var.a;
                bmq0.a(uri, (qim0) null, hcx.d, (String) null, str, 0L, 0L, false, (b0k) obj2, 384, 234);
                break;
            default:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                String str2 = kis0Var.b;
                uwr uwrVar = cbx.a;
                uwo1.e(str2, null, cbx.d(b0kVar).g, 0L, null, null, 0, false, null, 0, null, b0kVar, 0, 0, 2042);
                break;
        }
        return rih1Var;
    }
}
