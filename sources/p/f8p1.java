package p;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class f8p1 extends bno1 implements Serializable {
    public final MessageDigest c;
    public final int d;
    public final boolean e;
    public final String f;

    public f8p1() {
        boolean z;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            this.c = messageDigest;
            this.d = messageDigest.getDigestLength();
            this.f = "Hashing.sha256()";
            try {
                messageDigest.clone();
                z = true;
            } catch (CloneNotSupportedException unused) {
                z = false;
            }
            this.e = z;
        } catch (NoSuchAlgorithmException e) {
            eg.f(e);
            throw null;
        }
    }

    public final String toString() {
        return this.f;
    }
}
