package p;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.spotify.share.resultreceiver.api.ShareResultReceiver;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vnr {
    public final Context a;

    public static Intent b(yn71 yn71Var, p371 p371Var) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", l0p1.j(p371Var, yn71Var.a));
        intent.setType("text/plain");
        intent.addFlags(268435456);
        return intent;
    }

    public PendingIntent a(String str, String str2, String str3, String str4, p371 p371Var, z771 z771Var, z771 z771Var2, yn71 yn71Var) {
        yy61 yy61Var;
        Context context = this.a;
        Intent intent = new Intent(context, (Class<?>) ShareResultReceiver.class);
        intent.putExtra("entity_uri", p371Var.d());
        intent.putExtra("share_id", yn71Var.b);
        intent.putExtra("share_url", yn71Var.a);
        intent.putExtra("full_url", yn71Var.d);
        intent.putExtra("source_page_id", str);
        intent.putExtra("source_page_uri", str2);
        intent.putExtra("integration_id", str3);
        z471 z471Var = z471.d;
        intent.putExtra("destination_id", "native-share-menu");
        if (p371Var instanceof g9c1) {
            yy61Var = yy61.IMAGE_STORY;
        } else if (p371Var instanceof f9c1) {
            yy61Var = yy61.GRADIENT_STORY;
        } else if (p371Var instanceof h9c1) {
            yy61Var = yy61.VIDEO_STORY;
        } else if (p371Var instanceof pz70) {
            yy61Var = yy61.IMAGE;
        } else {
            boolean z = p371Var instanceof a6j0;
            yy61 yy61Var2 = yy61.LINK;
            if (z) {
                String str5 = ((a6j0) p371Var).b;
                if (str5 != null && !ihc1.y0(str5)) {
                    yy61Var = yy61.MESSAGE;
                }
            } else if (!(p371Var instanceof vkc0)) {
                eg.o();
                return null;
            }
            yy61Var = yy61Var2;
        }
        intent.putExtra("destination_capability", yy61Var.a);
        intent.putExtra("share_format_id", z771Var != null ? z771Var.b() : null);
        intent.putExtra("preselected_share_format_id", z771Var2 != null ? z771Var2.b() : null);
        intent.putExtra("interaction_id", str4);
        return PendingIntent.getBroadcast(context, 0, intent, Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728);
    }
}
