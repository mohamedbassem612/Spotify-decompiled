package p;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class cyi0 extends jch0 implements Serializable {
    public final MessageDigest d;
    public final int e;
    public final boolean f;
    public final String g;

    public cyi0(String str, int i, String str2) {
        this.g = str2;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            this.d = messageDigest;
            int digestLength = messageDigest.getDigestLength();
            boolean z = false;
            dm5.k("bytes (%s) must be >= 4 and < %s", i, digestLength, i >= 4 && i <= digestLength);
            this.e = i;
            try {
                messageDigest.clone();
                z = true;
            } catch (CloneNotSupportedException unused) {
            }
            this.f = z;
        } catch (NoSuchAlgorithmException e) {
            eg.f(e);
            throw null;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public final bmq0 M() {
        boolean z = this.f;
        int i = this.e;
        MessageDigest messageDigest = this.d;
        if (z) {
            try {
                return new ayi0((MessageDigest) messageDigest.clone(), i);
            } catch (CloneNotSupportedException unused) {
            }
        }
        try {
            return new ayi0(MessageDigest.getInstance(messageDigest.getAlgorithm()), i);
        } catch (NoSuchAlgorithmException e) {
            eg.f(e);
            return null;
        }
    }

    public final String toString() {
        return this.g;
    }

    public Object writeReplace() {
        return new byi0(this.d.getAlgorithm(), this.e, this.g);
    }

    public cyi0(String str, String str2) {
        boolean z;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            this.d = messageDigest;
            this.e = messageDigest.getDigestLength();
            this.g = str2;
            try {
                messageDigest.clone();
                z = true;
            } catch (CloneNotSupportedException unused) {
                z = false;
            }
            this.f = z;
        } catch (NoSuchAlgorithmException e) {
            eg.f(e);
            throw null;
        }
    }
}
