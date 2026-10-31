package p;

import android.net.Uri;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class w82 implements o2r {
    public final o2r a;
    public final byte[] b;
    public final byte[] c;
    public CipherInputStream d;

    public w82(o2r o2rVar, byte[] bArr, byte[] bArr2) {
        this.a = o2rVar;
        this.b = bArr;
        this.c = bArr2;
    }

    @Override // p.o2r
    public final void a(yeg1 yeg1Var) {
        yeg1Var.getClass();
        this.a.a(yeg1Var);
    }

    @Override // p.o2r
    public final void close() {
        if (this.d != null) {
            this.d = null;
            this.a.close();
        }
    }

    @Override // p.o2r
    public final Map e() {
        return this.a.e();
    }

    @Override // p.o2r
    public final Uri getUri() {
        return this.a.getUri();
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        this.d.getClass();
        int i3 = this.d.read(bArr, i, i2);
        if (i3 < 0) {
            return -1;
        }
        return i3;
    }

    @Override // p.o2r
    public final long t(n3r n3rVar) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.b, "AES"), new IvParameterSpec(this.c));
                g3r g3rVar = new g3r(this.a, n3rVar);
                this.d = new CipherInputStream(g3rVar, cipher);
                g3rVar.a();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                eg.j(e);
                return 0L;
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            eg.j(e2);
            return 0L;
        }
    }
}
