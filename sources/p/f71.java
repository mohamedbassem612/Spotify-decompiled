package p;

import android.content.Intent;
import android.net.Uri;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class f71 implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Intent b;

    public /* synthetic */ f71(Intent intent, byte b) {
        this.a = b;
        this.b = intent;
    }

    public final Object apply(Object obj) {
        byte b = this.a;
        Intent intent = this.b;
        switch (b) {
            case 0:
                q941 q941Var = (q941) obj;
                if (q941Var instanceof m941) {
                    return intent;
                }
                if (q941Var.equals(k941.a) || q941Var.equals(o941.a)) {
                    eg.m("Failed to save current user in AccountSwitcher");
                    return null;
                }
                eg.o();
                return null;
            case 1:
                return ((Boolean) obj).booleanValue() ? new hrn0(ikg0.class, new kkg0(intent.getBooleanExtra("manual_select_open_user_initiated_autodetect", false), intent.getBooleanExtra("manual_select_is_ambiguous_device", false), intent.getStringExtra("manual_select_ambiguous_device_title"), intent.getBooleanExtra("manual_select_is_airpods_ambiguous_type", false), intent.getParcelableExtra("manual_select_predicted_device"), intent.getBooleanExtra("manual_select_predicted_device_was_matched", false), intent.getBooleanExtra("manual_select_resume_music", false)), new c6w0(1, false, (hd5) null, 14)) : crn0.a;
            default:
                intent.setData((Uri) obj);
                return new drn0(intent);
        }
    }
}
