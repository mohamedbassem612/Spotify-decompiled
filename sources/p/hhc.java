package p;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class hhc extends phc {
    public final byte[] d;

    public hhc(byte[] bArr) {
        this.a = 0;
        bArr.getClass();
        this.d = bArr;
    }

    @Override // p.phc
    public final ByteBuffer b() {
        return ByteBuffer.wrap(this.d, x(), size()).asReadOnlyBuffer();
    }

    @Override // p.phc
    public byte c(int i) {
        return this.d[i];
    }

    @Override // p.phc
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof phc) && size() == ((phc) obj).size()) {
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof hhc)) {
                return obj.equals(this);
            }
            hhc hhcVar = (hhc) obj;
            int i = this.a;
            int i2 = hhcVar.a;
            if (i == 0 || i2 == 0 || i == i2) {
                int size = size();
                if (size > hhcVar.size()) {
                    eg.e(size, size());
                    return false;
                }
                if (size > hhcVar.size()) {
                    hhg1.n(cy30.i(size, "Ran off end of other: 0, ", hhcVar.size(), ", "));
                    return false;
                }
                byte[] bArr = hhcVar.d;
                int iX = x() + size;
                int iX2 = x();
                int iX3 = hhcVar.x();
                while (iX2 < iX) {
                    if (this.d[iX2] == bArr[iX3]) {
                        iX2++;
                        iX3++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new wgc(this);
    }

    @Override // p.phc
    public void k(byte[] bArr, int i) {
        System.arraycopy(this.d, 0, bArr, 0, i);
    }

    @Override // p.phc
    public byte n(int i) {
        return this.d[i];
    }

    @Override // p.phc
    public final boolean o() {
        int iX = x();
        return toi1.a.A(iX, this.d, size() + iX);
    }

    @Override // p.phc
    public final lwg p() {
        return lwg.f(this.d, x(), size(), true);
    }

    @Override // p.phc
    public final InputStream q() {
        return new ByteArrayInputStream(this.d, x(), size());
    }

    @Override // p.phc
    public final int r(int i, int i2) {
        int iX = x();
        Charset charset = l290.a;
        for (int i3 = iX; i3 < iX + i2; i3++) {
            i = (i * 31) + this.d[i3];
        }
        return i;
    }

    @Override // p.phc
    public final phc s(int i) {
        int iD = phc.d(0, i, size());
        return iD == 0 ? phc.b : new zgc(this.d, x(), iD);
    }

    @Override // p.phc
    public int size() {
        return this.d.length;
    }

    @Override // p.phc
    public final String u(Charset charset) {
        return new String(this.d, x(), size(), charset);
    }

    @Override // p.phc
    public final void w(rwg rwgVar) {
        rwgVar.t(x(), this.d, size());
    }

    public int x() {
        return 0;
    }
}
