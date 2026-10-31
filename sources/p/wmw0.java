package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class wmw0 implements vmw0 {
    public final djs a;
    public final String b;
    public final SecretKeySpec c;
    public final byte d;

    public wmw0(String str, SecretKeySpec secretKeySpec) throws NoSuchAlgorithmException, InvalidAlgorithmParameterException {
        byte b = 1;
        djs djsVar = new djs(this, (byte) 1);
        this.a = djsVar;
        this.b = str;
        this.c = secretKeySpec;
        if (secretKeySpec.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        switch (str.hashCode()) {
            case -1823053428:
                b = !str.equals("HMACSHA1") ? (byte) -1 : (byte) 0;
                break;
            case 392315118:
                if (!str.equals("HMACSHA256")) {
                    b = -1;
                }
                break;
            case 392316170:
                b = !str.equals("HMACSHA384") ? (byte) -1 : (byte) 2;
                break;
            case 392317873:
                b = !str.equals("HMACSHA512") ? (byte) -1 : (byte) 3;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                this.d = (byte) 20;
                break;
            case 1:
                this.d = (byte) 32;
                break;
            case 2:
                this.d = (byte) 48;
                break;
            case 3:
                this.d = (byte) 64;
                break;
            default:
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
        }
        djsVar.get();
    }

    public final byte[] a(byte[] bArr, int i) throws InvalidAlgorithmParameterException {
        if (i > this.d) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        djs djsVar = this.a;
        ((Mac) djsVar.get()).update(bArr);
        return Arrays.copyOf(((Mac) djsVar.get()).doFinal(), i);
    }
}
