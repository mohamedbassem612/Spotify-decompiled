package p;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import com.spotify.base.java.logging.Logger;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class f490 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ h490 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f490(Activity activity, h490 h490Var, byte b) {
        super(0);
        this.a = b;
        this.b = activity;
        this.c = h490Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        h490 h490Var = this.c;
        Activity activity = this.b;
        switch (b) {
            case 0:
                ((ClipboardManager) activity.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(activity.getString(2131956764), h490Var.b.b));
                h490Var.a();
                break;
            default:
                try {
                    activity.startActivity(Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", h490Var.b.b), null));
                } catch (Exception e) {
                    Logger.e(e, "Failed to share Jira ticket link", new Object[0]);
                }
                h490Var.a();
                break;
        }
        return rih1Var;
    }
}
