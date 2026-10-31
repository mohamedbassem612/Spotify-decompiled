package p;

import android.net.Uri;
import android.os.Bundle;
import com.facebook.FacebookException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class md50 {
    public static final String j;
    public static final Pattern k;
    public static volatile String l;
    public final xd a;
    public final String b;
    public JSONObject c;
    public Bundle d;
    public String e;
    public final String f;
    public id50 g;
    public a370 h;
    public boolean i;

    static {
        char[] cArr = {'-', '_', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        StringBuilder sb = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        int iNextInt = secureRandom.nextInt(11) + 30;
        for (int i = 0; i < iNextInt; i++) {
            sb.append(cArr[secureRandom.nextInt(64)]);
        }
        j = sb.toString();
        k = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
    }

    public md50(xd xdVar, String str, Bundle bundle, a370 a370Var, id50 id50Var, int i) {
        id50Var = (i & 16) != 0 ? null : id50Var;
        this.a = xdVar;
        this.b = str;
        this.f = null;
        i(id50Var);
        this.h = a370Var == null ? a370.a : a370Var;
        if (bundle != null) {
            this.d = new Bundle(bundle);
        } else {
            this.d = new Bundle();
        }
        this.f = wf10.d();
    }

    public static String f() {
        String strB = wf10.b();
        w0h1.H();
        String str = wf10.h;
        if (str == null) {
            throw new FacebookException("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
        }
        if (strB.length() <= 0 || str.length() <= 0) {
            return null;
        }
        return cy30.l(strB, '|', str);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003d  */
    public final void a() {
        Bundle bundle = this.d;
        String strE = e();
        boolean zJ0 = strE != null ? ihc1.j0(strE, "|") : false;
        if (strE == null || !nhc1.Y(strE, "IG", false) || zJ0 || !h()) {
            if ((u890.j(wf10.e(), "instagram.com") ? true ^ h() : true) || zJ0) {
                String strE2 = e();
                if (strE2 != null) {
                    bundle.putString("access_token", strE2);
                }
            } else {
                bundle.putString("access_token", f());
            }
        } else {
            bundle.putString("access_token", f());
        }
        if (!bundle.containsKey("access_token")) {
            wf10 wf10Var = wf10.a;
            w0h1.H();
            if (wf10.h == null) {
                throw new FacebookException("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
            }
        }
        bundle.putString("sdk", "android");
        bundle.putString("format", "json");
        HashSet hashSet = wf10.b;
        synchronized (hashSet) {
        }
        synchronized (hashSet) {
        }
    }

    public final String b(String str, boolean z) {
        if (!z && this.h == a370.b) {
            return str;
        }
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        for (String str2 : this.d.keySet()) {
            Object obj = this.d.get(str2);
            if (obj == null) {
                obj = "";
            }
            if (cwl1.O(obj)) {
                builderBuildUpon.appendQueryParameter(str2, cwl1.T(obj).toString());
            } else if (this.h != a370.a) {
                hhg1.n(String.format(Locale.US, "Unsupported parameter type for GET request: %s", Arrays.copyOf(new Object[]{obj.getClass().getSimpleName()}, 1)));
                return null;
            }
        }
        return builderBuildUpon.toString();
    }

    public final pd50 c() {
        ArrayList arrayListW = cwl1.w(new od50(f46.Q0(new md50[]{this})));
        if (arrayListW.size() == 1) {
            return (pd50) arrayListW.get(0);
        }
        throw new FacebookException("invalid state: expected a single response");
    }

    public final nd50 d() {
        od50 od50Var = new od50(f46.Q0(new md50[]{this}));
        w0h1.C(od50Var);
        nd50 nd50Var = new nd50(od50Var);
        nd50Var.executeOnExecutor(wf10.c(), new Void[0]);
        return nd50Var;
    }

    public final String e() {
        Bundle bundle = this.d;
        xd xdVar = this.a;
        if (xdVar != null) {
            if (!bundle.containsKey("access_token")) {
                String str = xdVar.e;
                oue0.a.j(str);
                return str;
            }
        } else if (!bundle.containsKey("access_token")) {
            return f();
        }
        return this.d.getString("access_token");
    }

    public final String g(String str) {
        if (!(u890.j(wf10.e(), "instagram.com") ? true ^ h() : true)) {
            str = kno1.s();
        }
        Pattern pattern = k;
        String str2 = this.b;
        if (!pattern.matcher(str2).matches()) {
            str2 = String.format("%s/%s", Arrays.copyOf(new Object[]{this.f, str2}, 2));
        }
        return String.format("%s/%s", Arrays.copyOf(new Object[]{str, str2}, 2));
    }

    public final boolean h() {
        String str = this.b;
        if (str == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder("^/?");
        sb.append(wf10.b());
        sb.append("/?.*");
        return this.i || Pattern.matches(sb.toString(), str) || Pattern.matches("^/?app/?.*", str);
    }

    public final void i(id50 id50Var) {
        HashSet hashSet = wf10.b;
        synchronized (hashSet) {
        }
        synchronized (hashSet) {
        }
        this.g = id50Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{Request:  accessToken: ");
        Object obj = this.a;
        if (obj == null) {
            obj = "null";
        }
        sb.append(obj);
        sb.append(", graphPath: ");
        sb.append(this.b);
        sb.append(", graphObject: ");
        sb.append(this.c);
        sb.append(", httpMethod: ");
        sb.append(this.h);
        sb.append(", parameters: ");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }
}
