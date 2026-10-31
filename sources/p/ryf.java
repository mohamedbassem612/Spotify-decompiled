package p;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import com.spotify.checkout.pageactivityproxy.PageActivityProxy;
import com.spotify.checkout.premiumcheckout.PremiumCheckoutActivity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ryf {
    public final frv0 a;
    public final x8g b;

    public ryf(frv0 frv0Var, x8g x8gVar) {
        this.a = frv0Var;
        this.b = x8gVar;
    }

    public final Intent a(Context context, lyf lyfVar) {
        v5g v5gVarB;
        zxf zxfVar = lyfVar.a;
        Uri uri = lyfVar.c;
        if (this.a.a(uri)) {
            String string = uri.toString();
            Intent intent = new Intent(context, (Class<?>) PremiumCheckoutActivity.class);
            intent.putExtra("EXTRA_ARGS", (Parcelable) new mqv0(string, zxfVar, false));
            return intent;
        }
        x8g x8gVar = this.b;
        if (x8gVar.c(uri) && (v5gVarB = x8gVar.b(zxfVar, uri)) != null) {
            return x8g.a(context, v5gVarB);
        }
        String str = nik1.k2.a;
        Intent intent2 = new Intent(context, (Class<?>) PageActivityProxy.class);
        intent2.putExtra("EXTRA_PAGE_URI", str);
        intent2.putExtra("EXTRA_INPUT", (Parcelable) lyfVar);
        intent2.putExtra("EXTRA_INPUT_CLASS_NAME", lyf.class.getName());
        return intent2;
    }

    public final void b(Activity activity, lyf lyfVar) {
        activity.startActivity(a(activity, lyfVar));
    }
}
