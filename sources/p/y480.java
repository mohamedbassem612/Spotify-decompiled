package p;

import android.widget.ProgressBar;
import android.widget.TextView;
import com.spotify.adsdisplay.browser.inapp.InAppBrowserActivity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class y480 extends sgp0 {
    public final /* synthetic */ byte b;
    public final /* synthetic */ InAppBrowserActivity c;

    /* JADX WARN: Illegal instructions before constructor call */
    public y480(InAppBrowserActivity inAppBrowserActivity, byte b) {
        this.b = b;
        switch (b) {
            case 3:
                this.c = inAppBrowserActivity;
                super(0);
                break;
            default:
                Boolean bool = Boolean.FALSE;
                this.c = inAppBrowserActivity;
                super(bool);
                break;
        }
    }

    public final void a(mma0 mma0Var, Object obj, Object obj2) {
        byte b = this.b;
        InAppBrowserActivity inAppBrowserActivity = this.c;
        switch (b) {
            case 0:
                String str = (String) obj2;
                TextView textView = inAppBrowserActivity.f1;
                if (textView != null) {
                    textView.setText(str);
                    return;
                } else {
                    u890.C("titleTextView");
                    throw null;
                }
            case 1:
                String str2 = (String) obj2;
                TextView textView2 = inAppBrowserActivity.g1;
                if (textView2 != null) {
                    textView2.setText(str2);
                    return;
                } else {
                    u890.C("urlTextView");
                    throw null;
                }
            case 2:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                ((Boolean) obj).getClass();
                ProgressBar progressBar = inAppBrowserActivity.k1;
                if (progressBar != null) {
                    progressBar.setVisibility(zBooleanValue ? 0 : 8);
                    return;
                } else {
                    u890.C("progressBar");
                    throw null;
                }
            default:
                int iIntValue = ((Number) obj2).intValue();
                ((Number) obj).intValue();
                ProgressBar progressBar2 = inAppBrowserActivity.k1;
                if (progressBar2 != null) {
                    progressBar2.setProgress(iIntValue, true);
                    return;
                } else {
                    u890.C("progressBar");
                    throw null;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y480(InAppBrowserActivity inAppBrowserActivity, byte b, boolean z) {
        super("");
        this.b = b;
        this.c = inAppBrowserActivity;
    }
}
