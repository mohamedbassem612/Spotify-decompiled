package p;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class nm00 extends InputStream implements DataInput, InputStreamRetargetInterface {
    public static final ByteOrder e = ByteOrder.LITTLE_ENDIAN;
    public static final ByteOrder f = ByteOrder.BIG_ENDIAN;
    public final DataInputStream a;
    public ByteOrder b;
    public final int c;
    public int d;

    public nm00(InputStream inputStream, ByteOrder byteOrder) throws IOException {
        this.b = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.a = dataInputStream;
        int iAvailable = dataInputStream.available();
        this.c = iAvailable;
        this.d = 0;
        dataInputStream.mark(iAvailable);
        this.b = byteOrder;
    }

    public final void a(long j) throws IOException {
        int i = this.d;
        if (i > j) {
            this.d = 0;
            DataInputStream dataInputStream = this.a;
            dataInputStream.reset();
            dataInputStream.mark(this.c);
        } else {
            j -= (long) i;
        }
        int i2 = (int) j;
        if (skipBytes(i2) == i2) {
            return;
        }
        k220.i("Couldn't seek up to the byteCount");
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.a.available();
    }

    @Override // java.io.InputStream
    public final int read() {
        this.d++;
        return this.a.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.d++;
        return this.a.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() throws IOException {
        int i = this.d + 1;
        this.d = i;
        if (i > this.c) {
            eg.l();
            return (byte) 0;
        }
        int i2 = this.a.read();
        if (i2 >= 0) {
            return (byte) i2;
        }
        eg.l();
        return (byte) 0;
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.d += 2;
        return this.a.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) throws IOException {
        int length = this.d + bArr.length;
        this.d = length;
        if (length > this.c) {
            eg.l();
            return;
        }
        if (this.a.read(bArr, 0, bArr.length) == bArr.length) {
            return;
        }
        k220.i("Couldn't read up to the length of buffer");
    }

    @Override // java.io.DataInput
    public final int readInt() throws IOException {
        int i = this.d + 4;
        this.d = i;
        if (i > this.c) {
            eg.l();
            return 0;
        }
        DataInputStream dataInputStream = this.a;
        int i2 = dataInputStream.read();
        int i3 = dataInputStream.read();
        int i4 = dataInputStream.read();
        int i5 = dataInputStream.read();
        if ((i2 | i3 | i4 | i5) < 0) {
            eg.l();
            return 0;
        }
        ByteOrder byteOrder = this.b;
        if (byteOrder == e) {
            return (i5 << 24) + (i4 << 16) + (i3 << 8) + i2;
        }
        if (byteOrder == f) {
            return (i2 << 24) + (i3 << 16) + (i4 << 8) + i5;
        }
        k220.h(this.b, "Invalid byte order: ");
        return 0;
    }

    @Override // java.io.DataInput
    public final String readLine() {
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() throws IOException {
        int i = this.d + 8;
        this.d = i;
        if (i > this.c) {
            eg.l();
            return 0L;
        }
        DataInputStream dataInputStream = this.a;
        int i2 = dataInputStream.read();
        int i3 = dataInputStream.read();
        int i4 = dataInputStream.read();
        int i5 = dataInputStream.read();
        int i6 = dataInputStream.read();
        int i7 = dataInputStream.read();
        int i8 = dataInputStream.read();
        int i9 = dataInputStream.read();
        if ((i2 | i3 | i4 | i5 | i6 | i7 | i8 | i9) < 0) {
            eg.l();
            return 0L;
        }
        ByteOrder byteOrder = this.b;
        if (byteOrder == e) {
            return (((long) i9) << 56) + (((long) i8) << 48) + (((long) i7) << 40) + (((long) i6) << 32) + (((long) i5) << 24) + (((long) i4) << 16) + (((long) i3) << 8) + ((long) i2);
        }
        if (byteOrder == f) {
            return (((long) i2) << 56) + (((long) i3) << 48) + (((long) i4) << 40) + (((long) i5) << 32) + (((long) i6) << 24) + (((long) i7) << 16) + (((long) i8) << 8) + ((long) i9);
        }
        k220.h(this.b, "Invalid byte order: ");
        return 0L;
    }

    @Override // java.io.DataInput
    public final short readShort() throws IOException {
        int i = this.d + 2;
        this.d = i;
        if (i > this.c) {
            eg.l();
            return (short) 0;
        }
        DataInputStream dataInputStream = this.a;
        int i2 = dataInputStream.read();
        int i3 = dataInputStream.read();
        if ((i2 | i3) < 0) {
            eg.l();
            return (short) 0;
        }
        ByteOrder byteOrder = this.b;
        if (byteOrder == e) {
            return (short) ((i3 << 8) + i2);
        }
        if (byteOrder == f) {
            return (short) ((i2 << 8) + i3);
        }
        k220.h(this.b, "Invalid byte order: ");
        return (short) 0;
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.d += 2;
        return this.a.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.d++;
        return this.a.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() throws IOException {
        int i = this.d + 2;
        this.d = i;
        if (i > this.c) {
            eg.l();
            return 0;
        }
        DataInputStream dataInputStream = this.a;
        int i2 = dataInputStream.read();
        int i3 = dataInputStream.read();
        if ((i2 | i3) < 0) {
            eg.l();
            return 0;
        }
        ByteOrder byteOrder = this.b;
        if (byteOrder == e) {
            return (i3 << 8) + i2;
        }
        if (byteOrder == f) {
            return (i2 << 8) + i3;
        }
        k220.h(this.b, "Invalid byte order: ");
        return 0;
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) {
        int iMin = Math.min(i, this.c - this.d);
        int iSkipBytes = 0;
        while (iSkipBytes < iMin) {
            iSkipBytes += this.a.skipBytes(iMin - iSkipBytes);
        }
        this.d += iSkipBytes;
        return iSkipBytes;
    }

    @Override // java.io.InputStream
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.a.read(bArr, i, i2);
        this.d += i3;
        return i3;
    }

    public nm00(InputStream inputStream) {
        this(inputStream, ByteOrder.BIG_ENDIAN);
    }

    public nm00(byte[] bArr) {
        this(new ByteArrayInputStream(bArr));
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.d + i2;
        this.d = i3;
        if (i3 <= this.c) {
            if (this.a.read(bArr, i, i2) == i2) {
                return;
            }
            k220.i("Couldn't read up to the length of buffer");
            return;
        }
        eg.l();
    }
}
