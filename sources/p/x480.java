package p;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.PopupMenu;
import com.spotify.adsdisplay.browser.inapp.InAppBrowserActivity;
import com.spotify.adsdisplay.browser.inapp.external.ShareSheetCallback;
import com.spotify.messages.InAppBrowserEvent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class x480 implements PopupMenu.OnMenuItemClickListener {
    public final /* synthetic */ InAppBrowserActivity a;

    public x480(InAppBrowserActivity inAppBrowserActivity) {
        this.a = inAppBrowserActivity;
    }

    @Override // android.widget.PopupMenu.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        String url;
        c580 c580VarP0 = this.a.p0();
        int itemId = menuItem.getItemId();
        t2j0 t2j0Var = c580VarP0.X;
        String str = c580VarP0.S0;
        InAppBrowserActivity inAppBrowserActivity = c580VarP0.a;
        yqg yqgVar = c580VarP0.Y;
        idd1 idd1Var = c580VarP0.b.c;
        if (itemId == 2131427453) {
            String url2 = ((WebView) idd1Var.getValue()).getUrl();
            if (url2 != null) {
                k9r k9rVarA = c580VarP0.a();
                if (k9rVarA != null) {
                    ((Activity) k9rVarA.b).startActivity(new Intent("android.intent.action.VIEW", Uri.parse(url2)));
                }
                vga0 vga0Var = new vga0();
                eqr0.K(vga0Var, "currentUrl", url2);
                uga0 uga0VarA = vga0Var.a();
                z480 z480VarN = InAppBrowserEvent.n();
                e4p1.u(z480VarN, 5);
                z480VarN.n(c580VarP0.b().b);
                z480VarN.r(ihc1.c1(4600, c580VarP0.b().a));
                z480VarN.q(c580VarP0.b().d);
                z480VarN.y(yqgVar.b());
                int i = c580VarP0.R0;
                c580VarP0.R0 = i + 1;
                z480VarN.v(i);
                z480VarN.u(inAppBrowserActivity.o0());
                z480VarN.w(str);
                e4p1.t(z480VarN, uga0VarA);
                f3o1.r(t2j0Var, z480VarN);
                return true;
            }
        } else {
            if (itemId == 2131427473) {
                c580VarP0.g();
                return true;
            }
            if (itemId != 2131427465) {
                if (itemId != 2131427477 || (url = ((WebView) idd1Var.getValue()).getUrl()) == null) {
                    return true;
                }
                yh71 yh71Var = c580VarP0.d;
                a580 a580VarB = c580VarP0.b();
                hf71 hf71Var = new hf71(url, a580VarB);
                Activity activity = yh71Var.a;
                String str2 = a580VarB.c;
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.setFlags(319291392);
                if (str2.length() > 0 && !str2.equals(url)) {
                    intent.putExtra("android.intent.extra.SUBJECT", str2);
                }
                intent.putExtra("android.intent.extra.TEXT", url);
                intent.setType("text/plain");
                int i2 = ShareSheetCallback.d;
                Intent intent2 = new Intent(activity, (Class<?>) ShareSheetCallback.class);
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.spotify.adsdisplay.browser.inapp.external.ShareSheetCallback.SHARE_SHEET_DATA", hf71Var);
                activity.startActivity(Intent.createChooser(intent, null, PendingIntent.getBroadcast(activity, 769, intent2.putExtra("com.spotify.adsdisplay.browser.inapp.external.ShareSheetCallback.SHARE_SHEET_DATA", bundle), Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728).getIntentSender()));
                return true;
            }
            String url3 = ((WebView) idd1Var.getValue()).getUrl();
            if (url3 != null) {
                c580VarP0.e.setPrimaryClip(ClipData.newPlainText(c580VarP0.b().c, url3));
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131962615});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                c580VarP0.t.k(new er91((fs91) null, "", 2131962615, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                vga0 vga0Var2 = new vga0();
                eqr0.K(vga0Var2, "currentUrl", url3);
                uga0 uga0VarA2 = vga0Var2.a();
                z480 z480VarN2 = InAppBrowserEvent.n();
                e4p1.u(z480VarN2, 2);
                z480VarN2.n(c580VarP0.b().b);
                z480VarN2.r(ihc1.c1(4600, c580VarP0.b().a));
                z480VarN2.q(c580VarP0.b().d);
                z480VarN2.y(yqgVar.b());
                int i3 = c580VarP0.R0;
                c580VarP0.R0 = i3 + 1;
                z480VarN2.v(i3);
                z480VarN2.u(inAppBrowserActivity.o0());
                z480VarN2.w(str);
                e4p1.t(z480VarN2, uga0VarA2);
                f3o1.r(t2j0Var, z480VarN2);
                return true;
            }
        }
        return true;
    }
}
