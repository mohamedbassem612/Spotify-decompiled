package p;

import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vrl implements Function0 {
    public static final vrl b = new vrl((byte) 0);
    public static final vrl c = new vrl((byte) 1);
    public static final /* synthetic */ vrl d = new vrl((byte) 3);
    public final /* synthetic */ byte a;

    public vrl(mr20[] mr20VarArr) {
        this.a = (byte) 2;
    }

    public final Object invoke() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        switch (this.a) {
            case 0:
                int i = u7h.l;
                return new u7h(nfb.i());
            case 1:
                return null;
            case 2:
                return new Object[6];
            default:
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                keyStore.load(null);
                return keyStore;
        }
    }

    public /* synthetic */ vrl(byte b2) {
        this.a = b2;
    }
}
