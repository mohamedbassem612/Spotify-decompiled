package p;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ygc extends ghc {
    public final int e;
    public final int f;

    public ygc(byte[] bArr, int i, int i2) {
        super(bArr);
        ohc.c(i, i + i2, bArr.length);
        this.e = i;
        this.f = i2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    public final byte b(int i) {
        int i2 = this.f;
        if (((i2 - (i + 1)) | i) >= 0) {
            return ((ghc) this).d[this.e + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(f4i1.c(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(cy30.i(i, "Index > length: ", i2, ", "));
    }

    public final void e(byte[] bArr, int i) {
        System.arraycopy(((ghc) this).d, this.e, bArr, 0, i);
    }

    public final byte f(int i) {
        return ((ghc) this).d[this.e + i];
    }

    public final int k() {
        return this.e;
    }

    public final int size() {
        return this.f;
    }

    public Object writeReplace() {
        return new ghc(i());
    }
}
