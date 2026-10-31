package p;

import com.google.android.recaptcha.internal.zzhm;
import org.chromium.net.UrlResponseInfo;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class oyo1 {
    public final UrlResponseInfo a;
    public final byte[] b;

    public oyo1(UrlResponseInfo urlResponseInfo, byte[] bArr) {
        this.a = urlResponseInfo;
        this.b = bArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.recaptcha.internal.zzhm */
    public final void a() throws zzhm {
        ij81 ij81Var = ij81.Q0;
        tgo1 tgo1Var = tgo1.d;
        try {
            int httpStatusCode = this.a.getHttpStatusCode();
            if (httpStatusCode != 200) {
                if (httpStatusCode == 400) {
                    throw new zzhm(tgo1Var, ij81.l1, (String) null, (Exception) null);
                }
                tgo1 tgo1Var2 = tgo1.j;
                if (httpStatusCode != 503 && httpStatusCode != 403) {
                    if (httpStatusCode == 404) {
                    }
                }
            }
        } catch (Exception e) {
            throw new zzhm(tgo1Var, ij81.Y0, e.getMessage(), (Exception) null);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.recaptcha.internal.zzhm */
    public final nhn1 b(rin1 rin1Var) throws zzhm {
        a();
        byte[] bArr = this.b;
        int length = bArr.length;
        tgo1 tgo1Var = tgo1.d;
        if (length == 0) {
            throw new zzhm(tgo1Var, ij81.k1, (String) null, (Exception) null);
        }
        try {
            return rin1Var.f().a(bArr);
        } catch (Exception e) {
            throw new zzhm(tgo1Var, ij81.O0, e.getMessage(), (Exception) null);
        }
    }
}
