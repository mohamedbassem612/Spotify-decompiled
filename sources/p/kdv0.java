package p;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kdv0 extends ByteArrayOutputStream {
    public final mgc a;

    public kdv0(mgc mgcVar, int i) {
        this.a = mgcVar;
        ((ByteArrayOutputStream) this).buf = mgcVar.s(Math.max(i, 256));
    }

    public final void a(int i) {
        int i2 = ((ByteArrayOutputStream) this).count;
        if (i2 + i <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        int i3 = (i2 + i) * 2;
        mgc mgcVar = this.a;
        byte[] bArrS = mgcVar.s(i3);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, bArrS, 0, ((ByteArrayOutputStream) this).count);
        mgcVar.N(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = bArrS;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.N(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public final void finalize() {
        this.a.N(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i) {
        a(1);
        super.write(i);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        a(i2);
        super.write(bArr, i, i2);
    }
}
