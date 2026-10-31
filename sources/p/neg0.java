package p;

import android.net.Uri;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class neg0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Uri b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ neg0(Uri uri, String str, long j, byte b) {
        super(3);
        this.a = b;
        this.b = uri;
        this.c = str;
        this.d = j;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj3).intValue();
                bmq0.a(this.b, (qim0) null, hcx.d, (String) null, this.c, this.d, 0L, false, (b0k) obj2, 384, 202);
                break;
            default:
                ((Number) obj3).intValue();
                bmq0.a(this.b, (qim0) null, hcx.d, (String) null, this.c, this.d, 0L, false, (b0k) obj2, 384, 202);
                break;
        }
        return rih1Var;
    }
}
