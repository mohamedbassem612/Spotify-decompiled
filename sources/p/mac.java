package p;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class mac extends InputStream implements InputStreamRetargetInterface {
    public final /* synthetic */ nac a;

    public mac(nac nacVar) {
        this.a = nacVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        return (int) Math.min(this.a.b, 2147483647L);
    }

    @Override // java.io.InputStream
    public final int read() {
        nac nacVar = this.a;
        if (nacVar.b > 0) {
            return nacVar.u() & 255;
        }
        return -1;
    }

    public final String toString() {
        return this.a + ".inputStream()";
    }

    @Override // java.io.InputStream
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        return this.a.read(bArr, i, i2);
    }
}
