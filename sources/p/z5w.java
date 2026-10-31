package p;

import android.net.Uri;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class z5w extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Uri b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z5w(Uri uri, String str, byte b) {
        super(3);
        this.a = b;
        this.b = uri;
        this.c = str;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x340Var2.b0();
                } else {
                    bmq0.a(this.b, (qim0) null, hcx.b, (String) null, this.c, 0L, 0L, false, x340Var2, 384, 234);
                }
                break;
            default:
                ((Number) obj3).intValue();
                Uri uri = this.b;
                uri.getClass();
                bmq0.a(uri, (qim0) null, hcx.c, this.c, (String) null, 0L, 0L, false, (b0k) obj2, 384, 242);
                break;
        }
        return rih1Var;
    }
}
