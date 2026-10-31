package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ofn1 implements tap1 {
    public final /* synthetic */ byte a;
    public final byte[] b;
    public final PublicKey c;
    public final String d;
    public final int e;
    public final Provider f;

    public /* synthetic */ ofn1(byte[] bArr, PublicKey publicKey, String str, int i, Provider provider, byte b) {
        this.a = b;
        this.b = bArr;
        this.c = publicKey;
        this.d = str;
        this.e = i;
        this.f = provider;
    }

    @Override // p.tap1
    public final void a(byte[] bArr, byte[] bArr2) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        byte b = this.a;
        PublicKey publicKey = this.c;
        Provider provider = this.f;
        String str = this.d;
        int i = this.e;
        byte[] bArr3 = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                if (!xgp1.a(bArr3, bArr)) {
                    k220.r("Invalid signature (output prefix mismatch)");
                    break;
                } else {
                    int length = bArr.length;
                    int length2 = bArr3.length;
                    if (length != length2 + i) {
                        k220.r("Invalid signature length");
                        break;
                    } else {
                        Signature signature = Signature.getInstance(str, provider);
                        signature.initVerify(publicKey);
                        signature.update(bArr2);
                        if (!signature.verify(bArr, length2, i)) {
                            k220.r("Invalid signature");
                            break;
                        }
                    }
                }
                break;
            default:
                if (!xgp1.a(bArr3, bArr)) {
                    k220.r("Invalid signature (output prefix mismatch)");
                    break;
                } else {
                    int length3 = bArr.length;
                    int length4 = bArr3.length;
                    if (length3 != length4 + i) {
                        k220.r("Invalid signature length");
                        break;
                    } else {
                        Signature signature2 = Signature.getInstance(str, provider);
                        signature2.initVerify(publicKey);
                        signature2.update(bArr2);
                        if (!signature2.verify(bArr, length4, i)) {
                            k220.r("Invalid signature");
                            break;
                        }
                    }
                }
                break;
        }
    }
}
