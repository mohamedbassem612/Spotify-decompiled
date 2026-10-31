package p;

import com.spotify.native_crypto.NativeCryptoProvider;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class amn0 {
    public static NativeCryptoProvider a() {
        try {
            Cipher.getInstance("ChaCha20-Poly1305");
            KeyPairGenerator.getInstance("Ed25519");
            KeyFactory.getInstance("Ed25519");
            Signature.getInstance("Ed25519");
            KeyPairGenerator.getInstance("X25519");
            KeyFactory.getInstance("X25519");
            KeyAgreement.getInstance("X25519");
            Mac.getInstance("HmacSHA512");
            MessageDigest.getInstance("SHA-512");
            return new NativeCryptoProvider();
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public static byte[] b(byte[] bArr) {
        if (bArr.length >= 32) {
            return f46.Z(bArr.length - 32, bArr, bArr.length);
        }
        hhg1.f(gvg.e(bArr.length, "PKCS8 encoding too short: ", " bytes"));
        return null;
    }

    public static byte[] c(byte[] bArr) {
        if (bArr.length >= 32) {
            return f46.Z(bArr.length - 32, bArr, bArr.length);
        }
        hhg1.f(gvg.e(bArr.length, "X509 encoding too short: ", " bytes"));
        return null;
    }
}
