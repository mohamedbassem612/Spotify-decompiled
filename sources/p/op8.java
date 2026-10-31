package p;

import android.content.Context;
import android.content.pm.Signature;
import android.os.Bundle;
import com.spotify.appauthorization.sso.ClientIdentity;
import com.spotify.messages.ClientAuthEventRequest;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.completable.CompletableToSingle;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class op8 implements vdh {
    public final ro5 a;
    public final Context b;
    public final o241 c;
    public final pp8 d;
    public final t2j0 e;
    public final zx4 f;

    public op8(ro5 ro5Var, jma jmaVar, Context context, o241 o241Var, pp8 pp8Var, t2j0 t2j0Var, zx4 zx4Var) {
        this.a = ro5Var;
        this.b = context;
        this.c = o241Var;
        this.d = pp8Var;
        this.e = t2j0Var;
        this.f = zx4Var;
    }

    public final boolean a(String str) {
        return str.equals("preflight_auth");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.ArrayList] */
    public final Single b(Bundle bundle) {
        Object arrayList;
        Object arrayList2;
        Object arrayList3;
        xig xigVar;
        ro5 ro5Var = this.a;
        if (bundle == null) {
            return Single.just(new eeh(3, cy30.g("com.spotify.music.extra.ERROR_MESSAGE", "Extras are null")));
        }
        boolean z = bundle.getBoolean("com.spotify.music.extra.AUTH_BYPASS_SUPPORTED", false);
        np8 np8Var = np8.c;
        String string = bundle.getString("com.spotify.music.extra.CLIENT_ID", null);
        String string2 = bundle.getString("com.spotify.music.extra.REDIRECT_URI", null);
        String string3 = bundle.getString("com.spotify.music.extra.PACKAGE_NAME", null);
        boolean z2 = bundle.getBoolean("com.spotify.music.extra.PREMIUM_ONLY", false);
        String string4 = bundle.getString("com.spotify.music.extra.GOOGLE_ANALYTICS_IDENTIFIER", null);
        if (string != null && string2 != null && string3 != null) {
            if (this.f.a() && z) {
                return Single.just(new eeh(5, (Bundle) null));
            }
            boolean z3 = bundle.getBoolean("com.spotify.music.extra.SHOW_AUTH_VIEW", false);
            try {
                Signature signatureA = xig.a(this.b, string3);
                int i = hu50.a;
                cyi0 cyi0Var = fu50.a;
                byte[] byteArray = signatureA.toByteArray();
                cyi0Var.getClass();
                int length = byteArray.length;
                dm5.v(0, length, byteArray.length);
                dm5.l("expectedInputSize must be >= 0 but was %s", length, length >= 0);
                bmq0 bmq0VarM = cyi0Var.M();
                bmq0VarM.U(byteArray, length);
                xigVar = new xig(string3, bmq0VarM.C().toString().toUpperCase(Locale.US));
            } catch (ClientIdentity.ValidationException unused) {
                xigVar = null;
            }
            gg11 gg11VarJ = j380.j("redirect_uri", string2, "show_auth_view", String.valueOf(z3), "scopes", "app-remote-control");
            bg11 bg11VarT = b380.t("com.spotify.interapp.service.model.APP_ID");
            fy8 fy8Var = xigVar != null ? new fy8(string, gg11VarJ, bg11VarT, xigVar) : new fy8(string, gg11VarJ, bg11VarT, (xig) null);
            try {
                ro5Var.b(fy8Var);
                if (string4 != null) {
                    hig higVarN = ClientAuthEventRequest.n();
                    higVarN.n(string4);
                    higVarN.q(string);
                    this.e.a(higVarN.build());
                }
                Completable completableA = ro5Var.a(fy8Var);
                ln70 ln70Var = new ln70(this);
                completableA.getClass();
                return new CompletableToSingle(completableA, ln70Var, (Object) null).flatMap(new lls0(z2, this, (byte) 4)).onErrorReturn(new ow3(this, string, (byte) 26));
            } catch (Exception e) {
                String message = e.getMessage();
                return Single.just(new eeh(3, message != null ? cy30.g("com.spotify.music.extra.ERROR_MESSAGE", message) : null));
            }
        }
        if (string != null) {
            arrayList = new ArrayList(string.length());
            for (int i2 = 0; i2 < string.length(); i2++) {
                string.charAt(i2);
                arrayList.add("");
            }
        } else {
            arrayList = np8Var + ", ";
        }
        if (string2 != null) {
            arrayList2 = new ArrayList(string2.length());
            for (int i3 = 0; i3 < string2.length(); i3++) {
                string2.charAt(i3);
                arrayList2.add("");
            }
        } else {
            arrayList2 = np8.e + ", ";
        }
        if (string3 != null) {
            arrayList3 = new ArrayList(string3.length());
            for (int i4 = 0; i4 < string3.length(); i4++) {
                string3.charAt(i4);
                arrayList3.add("");
            }
        } else {
            arrayList3 = np8.d + ", ";
        }
        return Single.just(new eeh(3, cy30.g("com.spotify.music.extra.ERROR_MESSAGE", "Missing extras: " + arrayList + arrayList2 + arrayList3)));
    }

    public final String c() {
        return "preflight_auth";
    }
}
