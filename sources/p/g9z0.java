package p;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class g9z0 implements Closeable {
    public static final Logger g = Logger.getLogger(g9z0.class.getName());
    public final RandomAccessFile a;
    public int b;
    public int c;
    public d9z0 d;
    public d9z0 e;
    public final byte[] f;

    public g9z0(File file) throws IOException {
        byte[] bArr = new byte[16];
        this.f = bArr;
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                byte[] bArr2 = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i = 0;
                for (int i2 = 0; i2 < 4; i2++) {
                    q(i, bArr2, iArr[i2]);
                    i += 4;
                }
                randomAccessFile.write(bArr2);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    k220.i("Rename failed!");
                    throw null;
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.a = randomAccessFile2;
        randomAccessFile2.seek(0L);
        randomAccessFile2.readFully(bArr);
        int iG = g(bArr, 0);
        this.b = iG;
        if (iG <= randomAccessFile2.length()) {
            this.c = g(bArr, 4);
            int iG2 = g(bArr, 8);
            int iG3 = g(bArr, 12);
            this.d = f(iG2);
            this.e = f(iG3);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.b + ", Actual length: " + randomAccessFile2.length());
    }

    public static int g(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    public static void q(int i, byte[] bArr, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    public final void a(byte[] bArr) {
        int iO;
        int length = bArr.length;
        synchronized (this) {
            if (length >= 0) {
                if (length <= bArr.length) {
                    c(length);
                    boolean zE = e();
                    if (zE) {
                        iO = 16;
                    } else {
                        d9z0 d9z0Var = this.e;
                        iO = o(d9z0Var.b + 4 + d9z0Var.c);
                    }
                    d9z0 d9z0Var2 = new d9z0((byte) 0, iO, length);
                    q(0, this.f, length);
                    j(iO, this.f, 4);
                    j(iO + 4, bArr, length);
                    p(this.b, this.c + 1, zE ? iO : this.d.b, iO);
                    this.e = d9z0Var2;
                    this.c++;
                    if (zE) {
                        this.d = d9z0Var2;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    public final void c(int i) throws IOException {
        int i2 = i + 4;
        int iM = this.b - m();
        if (iM >= i2) {
            return;
        }
        int i3 = this.b;
        do {
            iM += i3;
            i3 <<= 1;
        } while (iM < i2);
        RandomAccessFile randomAccessFile = this.a;
        randomAccessFile.setLength(i3);
        randomAccessFile.getChannel().force(true);
        d9z0 d9z0Var = this.e;
        int iO = o(d9z0Var.b + 4 + d9z0Var.c);
        if (iO < this.d.b) {
            FileChannel channel = randomAccessFile.getChannel();
            channel.position(this.b);
            long j = iO - 4;
            if (channel.transferTo(16L, j, channel) != j) {
                eg.f("Copied insufficient number of bytes!");
                return;
            }
        }
        int i4 = this.e.b;
        int i5 = this.d.b;
        if (i4 < i5) {
            int i6 = (this.b + i4) - 16;
            p(i3, this.c, i5, i6);
            this.e = new d9z0((byte) 0, i6, this.e.c);
        } else {
            p(i3, this.c, i5, i4);
        }
        this.b = i3;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.a.close();
    }

    public final synchronized void d(f9z0 f9z0Var) {
        int iO = this.d.b;
        for (int i = 0; i < this.c; i++) {
            d9z0 d9z0VarF = f(iO);
            f9z0Var.a(new e9z0(this, d9z0VarF), d9z0VarF.c);
            iO = o(d9z0VarF.b + 4 + d9z0VarF.c);
        }
    }

    public final synchronized boolean e() {
        return this.c == 0;
    }

    public final d9z0 f(int i) throws IOException {
        if (i == 0) {
            return d9z0.d;
        }
        RandomAccessFile randomAccessFile = this.a;
        randomAccessFile.seek(i);
        return new d9z0((byte) 0, i, randomAccessFile.readInt());
    }

    public final synchronized void h() {
        if (e()) {
            throw new NoSuchElementException();
        }
        if (this.c == 1) {
            synchronized (this) {
                p(4096, 0, 0, 0);
                this.c = 0;
                d9z0 d9z0Var = d9z0.d;
                this.d = d9z0Var;
                this.e = d9z0Var;
                if (this.b > 4096) {
                    RandomAccessFile randomAccessFile = this.a;
                    randomAccessFile.setLength(4096L);
                    randomAccessFile.getChannel().force(true);
                }
                this.b = 4096;
            }
        } else {
            d9z0 d9z0Var2 = this.d;
            int iO = o(d9z0Var2.b + 4 + d9z0Var2.c);
            i(iO, this.f, 0, 4);
            int iG = g(this.f, 0);
            p(this.b, this.c - 1, iO, this.e.b);
            this.c--;
            this.d = new d9z0((byte) 0, iO, iG);
        }
    }

    public final void i(int i, byte[] bArr, int i2, int i3) throws IOException {
        int iO = o(i);
        int i4 = iO + i3;
        int i5 = this.b;
        RandomAccessFile randomAccessFile = this.a;
        if (i4 <= i5) {
            randomAccessFile.seek(iO);
            randomAccessFile.readFully(bArr, i2, i3);
            return;
        }
        int i6 = i5 - iO;
        randomAccessFile.seek(iO);
        randomAccessFile.readFully(bArr, i2, i6);
        randomAccessFile.seek(16L);
        randomAccessFile.readFully(bArr, i2 + i6, i3 - i6);
    }

    public final void j(int i, byte[] bArr, int i2) throws IOException {
        int iO = o(i);
        int i3 = iO + i2;
        int i4 = this.b;
        RandomAccessFile randomAccessFile = this.a;
        if (i3 <= i4) {
            randomAccessFile.seek(iO);
            randomAccessFile.write(bArr, 0, i2);
            return;
        }
        int i5 = i4 - iO;
        randomAccessFile.seek(iO);
        randomAccessFile.write(bArr, 0, i5);
        randomAccessFile.seek(16L);
        randomAccessFile.write(bArr, i5, i2 - i5);
    }

    public final int m() {
        if (this.c == 0) {
            return 16;
        }
        d9z0 d9z0Var = this.e;
        int i = d9z0Var.b;
        int i2 = this.d.b;
        return i >= i2 ? (i - i2) + 4 + d9z0Var.c + 16 : (((i + 4) + d9z0Var.c) + this.b) - i2;
    }

    public final int o(int i) {
        int i2 = this.b;
        return i < i2 ? i : (i + 16) - i2;
    }

    public final void p(int i, int i2, int i3, int i4) throws IOException {
        int[] iArr = {i, i2, i3, i4};
        int i5 = 0;
        int i6 = 0;
        while (true) {
            byte[] bArr = this.f;
            if (i5 >= 4) {
                RandomAccessFile randomAccessFile = this.a;
                randomAccessFile.seek(0L);
                randomAccessFile.write(bArr);
                return;
            } else {
                q(i6, bArr, iArr[i5]);
                i6 += 4;
                i5++;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(g9z0.class.getSimpleName());
        sb.append("[fileLength=");
        sb.append(this.b);
        sb.append(", size=");
        sb.append(this.c);
        sb.append(", first=");
        sb.append(this.d);
        sb.append(", last=");
        sb.append(this.e);
        sb.append(", element lengths=[");
        try {
            d(new svh0(sb));
        } catch (IOException e) {
            g.log(Level.WARNING, "read error", (Throwable) e);
        }
        sb.append("]]");
        return sb.toString();
    }
}
