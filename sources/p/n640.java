package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class n640 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Uri b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n640(Uri uri) {
        super(2);
        this.a = (byte) 0;
        this.b = uri;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        nim0 nim0Var = nim0.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    Uri uri = this.b;
                    uri.getClass();
                    cbx.a.getClass();
                    eso1.e(uri, isl.a, anm1.N("showArtwork", i1p1.q(u291.r(nim0Var, 32.0f), er31.b(2.0f))), (p3v) null, (zvx) null, uwr.a(), (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var2, 48, 0, 4056);
                }
                break;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    Uri uri2 = this.b;
                    uri2.getClass();
                    cbx.a.getClass();
                    eso1.e(uri2, isl.a, i1p1.q(u291.r(nim0Var, 32.0f), er31.b(2.0f)), (p3v) null, (zvx) null, uwr.a(), (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var4, 48, 0, 4056);
                }
                break;
            default:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x340Var6.b0();
                } else {
                    Uri uri3 = this.b;
                    uri3.getClass();
                    cbx.a.getClass();
                    eso1.e(uri3, isl.a, anm1.N("paidPodcastBannerArtwork", i1p1.q(u291.r(nim0Var, 32.0f), er31.b(2.0f))), (p3v) null, (zvx) null, uwr.a(), (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var6, 48, 0, 4056);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n640(Uri uri, wux wuxVar, byte b) {
        super(2);
        this.a = b;
        this.b = uri;
    }
}
