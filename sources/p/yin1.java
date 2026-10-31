package p;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class yin1 extends InputStream implements InputStreamRetargetInterface {
    public Iterator a;
    public ByteBuffer b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public byte[] g;
    public int h;

    public final boolean a() {
        ByteBuffer byteBuffer;
        Iterator it = this.a;
        do {
            this.d++;
            if (!it.hasNext()) {
                return false;
            }
            byteBuffer = (ByteBuffer) it.next();
            this.b = byteBuffer;
        } while (!byteBuffer.hasRemaining());
        this.e = this.b.position();
        if (this.b.hasArray()) {
            this.f = true;
            this.g = this.b.array();
            this.h = this.b.arrayOffset();
        } else {
            this.f = false;
            this.g = null;
        }
        return true;
    }

    public final void c(int i) {
        int i2 = this.e + i;
        this.e = i2;
        if (i2 == this.b.limit()) {
            a();
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (this.d == this.c) {
            return -1;
        }
        int iLimit = this.b.limit();
        int i3 = this.e;
        int i4 = iLimit - i3;
        if (i2 > i4) {
            i2 = i4;
        }
        if (this.f) {
            System.arraycopy(this.g, i3 + this.h, bArr, i, i2);
            c(i2);
            return i2;
        }
        int iPosition = this.b.position();
        this.b.position(this.e);
        this.b.get(bArr, i, i2);
        this.b.position(iPosition);
        c(i2);
        return i2;
    }

    @Override // java.io.InputStream
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.d == this.c) {
            return -1;
        }
        if (this.f) {
            int i = this.g[this.e + this.h] & 255;
            c(1);
            return i;
        }
        int i2 = this.b.get(this.e) & 255;
        c(1);
        return i2;
    }
}
