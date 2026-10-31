package p;

import android.net.Uri;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class np extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ np(mp mpVar, byte b) {
        super(3);
        this.a = b;
        this.b = mpVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        mp mpVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                String str = mpVar.b;
                if (str == null) {
                    str = "";
                }
                Uri uri = Uri.parse(str);
                String str2 = mpVar.a;
                Integer num = mpVar.c;
                bmq0.a(uri, (qim0) null, hcx.d, (String) null, str2, num != null ? z4p1.e(num.intValue() | (-16777216)) : u7h.k, 0L, false, b0kVar, 384, 202);
                break;
            default:
                ((Number) obj3).intValue();
                uwo1.e(mpVar.a, null, null, 0L, null, null, 0, false, null, 0, null, (b0k) obj2, 0, 0, 2046);
                break;
        }
        return rih1Var;
    }
}
