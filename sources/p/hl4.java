package p;

import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.Arrays;
import javax.crypto.KeyGenerator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hl4 {
    public static final /* synthetic */ int b = 0;
    public KeyStore a = (KeyStore) new cp5().b;

    public static void a(String str) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        if (new hl4().c(str)) {
            hhg1.n(f4i1.f("cannot generate a new key ", str, " because it already exists; please delete it with deleteKey() and try again"));
            return;
        }
        String strB = gsi1.b(str);
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(new KeyGenParameterSpec.Builder(strB, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
        keyGenerator.generateKey();
    }

    public final synchronized gl4 b(String str) {
        gl4 gl4Var;
        gl4Var = new gl4(gsi1.b(str), this.a);
        byte[] bArrA = eqz0.a(10);
        byte[] bArr = new byte[0];
        if (!Arrays.equals(bArrA, gl4Var.b(gl4Var.a(bArrA, bArr), bArr))) {
            throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
        }
        return gl4Var;
    }

    public final synchronized boolean c(String str) {
        String strB;
        strB = gsi1.b(str);
        try {
        } catch (NullPointerException unused) {
            try {
                Thread.sleep(20L);
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.a = keyStore;
                keyStore.load(null);
            } catch (IOException e) {
                throw new GeneralSecurityException(e);
            } catch (InterruptedException unused2) {
            }
            return this.a.containsAlias(strB);
        }
        return this.a.containsAlias(strB);
    }
}
