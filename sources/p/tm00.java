package p;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class tm00 extends InputStream implements InputStreamRetargetInterface {
    public final InputStream a;
    public int b = 1073741824;

    public tm00(InputStream inputStream) {
        this.a = inputStream;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.b;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i = this.a.read();
        if (i == -1) {
            this.b = 0;
        }
        return i;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        return this.a.skip(j);
    }

    @Override // java.io.InputStream
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        int i = this.a.read(bArr);
        if (i == -1) {
            this.b = 0;
        }
        return i;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.a.read(bArr, i, i2);
        if (i3 == -1) {
            this.b = 0;
        }
        return i3;
    }
}
