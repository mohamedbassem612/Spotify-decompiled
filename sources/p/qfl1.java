package p;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qfl1 {
    public final Context a;

    static {
        new c9c((byte) 29);
    }

    public static x5o a(qfl1 qfl1Var) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            x5o b6oVar = new b6o(qfl1Var.a);
            x5o x5oVar = b6oVar.a() ? b6oVar : null;
            return x5oVar == null ? qfl1Var.e() : x5oVar;
        }
        if (i <= 33) {
            return qfl1Var.e();
        }
        return null;
    }

    public String b(int i, Object... objArr) {
        return this.a.getString(i, Arrays.copyOf(objArr, objArr.length));
    }

    public void c(Uri uri) {
        String queryParameter;
        String queryParameter2;
        try {
            queryParameter = uri.getQueryParameter("redirect_uri");
        } catch (UnsupportedOperationException unused) {
            queryParameter = (String) smo1.y(uri).get("redirect_uri");
        }
        Uri uri2 = queryParameter == null ? null : Uri.parse(queryParameter);
        Context context = this.a;
        if (uri2 != null) {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(uri2.toString());
            if (launchIntentForPackage != null) {
                try {
                    context.startActivity(launchIntentForPackage);
                    return;
                } catch (ActivityNotFoundException unused2) {
                }
            }
        }
        try {
            queryParameter2 = uri.getQueryParameter("origin_uri");
        } catch (UnsupportedOperationException unused3) {
            queryParameter2 = (String) smo1.y(uri).get("origin_uri");
        }
        Uri uri3 = queryParameter2 != null ? Uri.parse(queryParameter2) : null;
        if (uri3 == null) {
            return;
        }
        if (smo1.w(uri3)) {
            uri3.toString();
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW", uri3);
        intent.addFlags(268435456);
        intent.setPackage(context.getPackageName());
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused4) {
            Objects.toString(uri3);
        }
    }

    public boolean d() {
        boolean zF;
        Context context = this.a;
        String strL = lvx.l(context);
        if (strL == null) {
            zF = false;
        } else {
            try {
                zF = c9c.f(strL);
            } catch (NumberFormatException e) {
                Logger.e(e, "Unsupported version number: %s", strL);
                zF = false;
            }
        }
        if (zF) {
            return false;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.waze&referrer=utm_source%3Dpartner%26utm_medium%3Ddirect%26utm_campaign%3Dcom.spotify.music"));
            intent.addFlags(268435456);
            context.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException unused) {
            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.waze&referrer=utm_source%3Dpartner%26utm_medium%3Ddirect%26utm_campaign%3Dcom.spotify.music"));
            intent2.addFlags(268435456);
            context.startActivity(intent2);
            return true;
        }
    }

    public x5o e() throws PackageManager.NameNotFoundException {
        String string;
        Context context = this.a;
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 132);
        ArrayList arrayList = new ArrayList();
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                Bundle bundle = serviceInfo.metaData;
                if (bundle != null && (string = bundle.getString("androidx.credentials.CREDENTIAL_PROVIDER_KEY")) != null) {
                    arrayList.add(string);
                }
            }
        }
        List listL1 = o7h.l1(arrayList);
        if (listL1.isEmpty()) {
            return null;
        }
        Iterator it = listL1.iterator();
        b6o b6oVar = null;
        while (it.hasNext()) {
            try {
                b6o b6oVar2 = (x5o) Class.forName((String) it.next()).getConstructor(Context.class).newInstance(context);
                if (!b6oVar2.a()) {
                    continue;
                } else {
                    if (b6oVar != null) {
                        return null;
                    }
                    b6oVar = b6oVar2;
                }
            } catch (Throwable unused) {
            }
        }
        return b6oVar;
    }
}
