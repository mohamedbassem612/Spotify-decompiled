package p;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ahc extends fhc {
    public final int e;
    public final int f;

    public ahc(byte[] bArr, int i, int i2) {
        super(bArr);
        fhc.c(i, i + i2, bArr.length);
        this.e = i;
        this.f = i2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    @Override // p.fhc
    public final byte b(int i) {
        int i2 = this.f;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.b[this.e + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(f4i1.c(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(cy30.i(i, "Index > length: ", i2, ", "));
    }

    @Override // p.fhc
    public final int e() {
        return this.e;
    }

    @Override // p.fhc
    public final byte f(int i) {
        return this.b[this.e + i];
    }

    @Override // p.fhc
    public final int size() {
        return this.f;
    }

    public Object writeReplace() {
        byte[] bArr;
        int i = this.f;
        if (i == 0) {
            bArr = j290.b;
        } else {
            byte[] bArr2 = new byte[i];
            System.arraycopy(this.b, this.e, bArr2, 0, i);
            bArr = bArr2;
        }
        return new fhc(bArr);
    }
}
