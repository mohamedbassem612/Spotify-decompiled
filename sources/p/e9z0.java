package p;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class e9z0 extends InputStream implements InputStreamRetargetInterface {
    public int a;
    public int b;
    public final /* synthetic */ g9z0 c;

    public e9z0(g9z0 g9z0Var, d9z0 d9z0Var) {
        this.c = g9z0Var;
        this.a = g9z0Var.o(d9z0Var.b + 4);
        this.b = d9z0Var.c;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            bhn0.i("buffer");
            return 0;
        }
        if ((i | i2) < 0 || i2 > bArr.length - i) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i3 = this.b;
        if (i3 <= 0) {
            return -1;
        }
        if (i2 > i3) {
            i2 = i3;
        }
        int i4 = this.a;
        g9z0 g9z0Var = this.c;
        g9z0Var.i(i4, bArr, i, i2);
        this.a = g9z0Var.o(this.a + i2);
        this.b -= i2;
        return i2;
    }

    @Override // java.io.InputStream
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        g9z0 g9z0Var = this.c;
        RandomAccessFile randomAccessFile = g9z0Var.a;
        if (this.b == 0) {
            return -1;
        }
        randomAccessFile.seek(this.a);
        int i = randomAccessFile.read();
        this.a = g9z0Var.o(this.a + 1);
        this.b--;
        return i;
    }
}
