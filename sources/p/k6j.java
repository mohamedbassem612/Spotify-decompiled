package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class k6j extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uyr0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k6j(uyr0 uyr0Var, byte b) {
        super(3);
        this.a = b;
        this.b = uyr0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        uyr0 uyr0Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x340Var2.b0();
                } else {
                    String str = uyr0Var.d;
                    Uri uri = str != null ? Uri.parse(str) : Uri.EMPTY;
                    uri.getClass();
                    nkx nkxVar = nkx.c;
                    nux nuxVar = new nux(nkxVar, nkxVar);
                    uwr uwrVar = cbx.a;
                    zov0 zov0Var = cbx.b(x340Var2).g;
                    eso1.e(uri, isl.a, i541.D(u291.r(nim0.a, 48.0f), 0.0f, 0.0f, uyr0Var.h != 1 ? 0.7f : 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, 0L, 0L, 0, null, 1048571), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, nuxVar, false, false, x340Var2, 1073741872, 0, 3576);
                }
                break;
            case 1:
                x340 x340Var3 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(1 & iIntValue2, (iIntValue2 & 17) != 16)) {
                    x340Var4.b0();
                } else {
                    mmo1.o(uyr0Var, null, x340Var4, 0);
                }
                break;
            default:
                x340 x340Var5 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(1 & iIntValue3, (iIntValue3 & 17) != 16)) {
                    x340Var6.b0();
                } else {
                    mmo1.q(uyr0Var, null, x340Var6, 0);
                }
                break;
        }
        return rih1Var;
    }
}
