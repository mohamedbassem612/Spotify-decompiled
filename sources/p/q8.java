package p;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class q8 extends FilterInputStream implements InputStreamRetargetInterface {
    public final /* synthetic */ byte a;
    public int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q8(InputStream inputStream, int i, byte b) {
        super(inputStream);
        this.a = b;
        this.b = i;
    }

    private /* synthetic */ long a(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    private /* synthetic */ long c(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        switch (this.a) {
            case 0:
                break;
        }
        return Math.min(super.available(), this.b);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        switch (this.a) {
            case 0:
                int i3 = this.b;
                if (i3 <= 0) {
                    return -1;
                }
                int i4 = super.read(bArr, i, Math.min(i2, i3));
                if (i4 >= 0) {
                    this.b -= i4;
                }
                return i4;
            default:
                int i5 = this.b;
                if (i5 <= 0) {
                    return -1;
                }
                int i6 = super.read(bArr, i, Math.min(i2, i5));
                if (i6 >= 0) {
                    this.b -= i6;
                }
                return i6;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        switch (this.a) {
            case 0:
                long jSkip = super.skip(Math.min(j, this.b));
                if (jSkip >= 0) {
                    this.b = (int) (((long) this.b) - jSkip);
                }
                return jSkip;
            default:
                int iSkip = (int) super.skip(Math.min(j, this.b));
                if (iSkip >= 0) {
                    this.b -= iSkip;
                }
                return iSkip;
        }
    }

    @Override // java.io.InputStream
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        switch (this.a) {
            case 0:
                return c(outputStream);
            default:
                return a(outputStream);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        switch (this.a) {
            case 0:
                if (this.b <= 0) {
                    return -1;
                }
                int i = super.read();
                if (i >= 0) {
                    this.b--;
                }
                return i;
            default:
                if (this.b <= 0) {
                    return -1;
                }
                int i2 = super.read();
                if (i2 >= 0) {
                    this.b--;
                }
                return i2;
        }
    }
}
