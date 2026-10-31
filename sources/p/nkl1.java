package p;

import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import com.spotify.base.java.logging.Logger;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nkl1 implements bv8 {
    public final Context a;
    public final g341 b;
    public final pbk1 c;
    public final xye1 d;
    public final zn41 e;
    public final PublicKey f;

    public nkl1(Context context, g341 g341Var, pbk1 pbk1Var, xye1 xye1Var, zn41 zn41Var) {
        this.a = context;
        this.b = g341Var;
        this.c = pbk1Var;
        this.d = xye1Var;
        this.e = zn41Var;
        this.f = ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(context.getResources().openRawResource(2131886092))).getPublicKey();
    }

    public final void a(spq0 spq0Var, Uri uri) {
        long j;
        if ("spotify".equals(uri.getScheme()) && "autologin".equals(uri.getHost()) && spq0Var.c()) {
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            if (!queryParameterNames.contains("returnUrl") || !queryParameterNames.contains("signature") || !queryParameterNames.contains("signatureExpiry")) {
                uri = Uri.parse(Pattern.compile("%26").matcher(uri.toString()).replaceAll("&"));
                uri.getClass();
            }
            long jLongValue = ((Number) spq0Var.b()).longValue();
            Logger.g("WebsiteAutologinUtility: Validating Request: %s", new Object[]{uri.toString()});
            String queryParameter = uri.getQueryParameter("signature");
            if (queryParameter == null) {
                queryParameter = "";
            }
            Uri uri2 = Uri.parse(uri.getQueryParameter("returnUrl"));
            String queryParameter2 = uri.getQueryParameter("signatureExpiry");
            String str = queryParameter2 != null ? queryParameter2 : "";
            try {
                j = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                j = 0;
            }
            String strE = f4i1.e(uri2.toString(), str);
            Logger.g("WebsiteAutologinUtility: url encoded signature: %s", new Object[]{queryParameter});
            boolean z = false;
            try {
                Charset charset = one.b;
                byte[] bArrDecode = Base64.decode(queryParameter.getBytes(charset), 0);
                Signature signature = Signature.getInstance("SHA1withRSA");
                signature.initVerify(this.f);
                signature.update(strE.getBytes(charset));
                if (signature.verify(bArrDecode) && j > jLongValue) {
                    z = true;
                }
            } catch (IllegalArgumentException e) {
                Logger.e(e, "WebsiteAutologinUtility illegal argument exception", new Object[0]);
            } catch (InvalidKeyException e2) {
                Logger.e(e2, "WebsiteAutologinUtility failed to init verify a signature", new Object[0]);
            } catch (NoSuchAlgorithmException e3) {
                Logger.e(e3, "WebsiteAutologinUtility failed to get a signature", new Object[0]);
            } catch (SignatureException e4) {
                Logger.e(e4, "WebsiteAutologinUtility failed to update/verify a signature", new Object[0]);
            }
            Logger.g("WebsiteAutologinUtility: Autologin Signature isValid: %s", new Object[]{Boolean.valueOf(z)});
            if (z) {
                this.e.c("Open URL", new hij1(uri, this, (byte) 26));
            }
        }
    }
}
