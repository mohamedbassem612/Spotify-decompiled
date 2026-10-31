package p;

import android.hardware.biometrics.BiometricPrompt;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class qco {
    public static BiometricPrompt.CryptoObject a(Cipher cipher) {
        return new BiometricPrompt.CryptoObject(cipher);
    }
}
