package p;

import android.net.Uri;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class u7w extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bxn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u7w(bxn bxnVar, byte b) {
        super(3);
        this.a = b;
        this.b = bxnVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Uri uri;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        bxn bxnVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                String str = bxnVar.d;
                if (ihc1.y0(str)) {
                    str = null;
                }
                if (str == null || (uri = Uri.parse(str)) == null) {
                    uri = Uri.EMPTY;
                }
                Uri uri2 = uri;
                uri2.getClass();
                bmq0.a(uri2, (qim0) null, hcx.d, (String) null, bxnVar.c, 0L, 0L, false, b0kVar, 384, 234);
                break;
            default:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                String str2 = bxnVar.c;
                uwr uwrVar = cbx.a;
                uwo1.e(str2, null, cbx.d(b0kVar2).h, 0L, null, null, 0, false, null, 0, null, b0kVar2, 0, 0, 2042);
                break;
        }
        return rih1Var;
    }
}
