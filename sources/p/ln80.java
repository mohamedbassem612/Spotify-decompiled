package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import j$.net.URLDecoder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ln80 implements kn80 {
    public final /* synthetic */ byte a;

    public final String a(String str) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return ilo1.v(str, "adjust_campaign");
            default:
                String strDecode = URLDecoder.decode(ilo1.v(str, "_branch_link"), nne.a.name());
                strDecode.getClass();
                return ilo1.v(strDecode, "~campaign");
        }
    }

    public final boolean b(String str) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return ihc1.h0(str, "adjust_campaign", false);
            default:
                return ihc1.h0(str, "_branch_link", false) && ihc1.h0(str, "~campaign", false);
        }
    }
}
