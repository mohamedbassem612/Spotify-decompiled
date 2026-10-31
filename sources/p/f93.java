package p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class f93 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;

    public f93(String str, vi11 vi11Var) {
        this.a = (byte) 11;
        this.b = str;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        String str = this.b;
        switch (b) {
            case 0:
                Logger.e((Throwable) obj, l1d.m("Failed to fetch album entity ", str), new Object[0]);
                break;
            case 1:
                Logger.e((Throwable) obj, l1d.m("Failed to fetch artist entity ", str), new Object[0]);
                break;
            case 2:
                Logger.e((Throwable) obj, l1d.m("Failed to fetch artist entity ", str), new Object[0]);
                break;
            case 3:
                Logger.e((Throwable) obj, l1d.m("Failed to invalidate card cache for ", str), new Object[0]);
                break;
            case 4:
                n57.t("Failed to load metadata for ".concat(str), (Throwable) obj);
                break;
            case 5:
                n57.t("Failed to load metadata for " + str, (Throwable) obj);
                break;
            case 6:
                Logger.e((Throwable) obj, l1d.m("Failed to update selected-language: ", str), new Object[0]);
                break;
            case 7:
                Logger.e((Throwable) obj, l1d.m("Failed to fetch playlist entity ", str), new Object[0]);
                break;
            case 8:
                Logger.e((Throwable) obj, l1d.m("Failed to fetch show entity ", str), new Object[0]);
                break;
            case 9:
                Logger.d(gvg.h("Error getting Smart Shuffle recommendations for ", str, ": ", ((Throwable) obj).getMessage()), new Object[0]);
                break;
            case 10:
                Logger.e((Throwable) obj, "Failed to observe collection state for ".concat(str), new Object[0]);
                break;
            default:
                Logger.e((Throwable) obj, "vtec-startup step 1 (RESOLVE-SITE): Failed Fetching site for lookup token: ".concat(str), new Object[0]);
                break;
        }
    }

    public /* synthetic */ f93(String str, byte b) {
        this.a = b;
        this.b = str;
    }
}
