package p;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jhc extends OutputStream {
    public static final byte[] f = new byte[0];
    public static final byte[] g = new byte[0];
    public final /* synthetic */ byte a;
    public final ArrayList b;
    public int c;
    public byte[] d;
    public int e;

    public jhc(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = new ArrayList();
                this.d = new byte[128];
                break;
            default:
                this.b = new ArrayList();
                this.d = new byte[128];
                break;
        }
    }

    public void a(int i) {
        this.b.add(new qmd0(this.d));
        int length = this.c + this.d.length;
        this.c = length;
        this.d = new byte[Math.max(128, Math.max(i, length >>> 1))];
        this.e = 0;
    }

    public void c() {
        int i = this.e;
        byte[] bArr = this.d;
        int length = bArr.length;
        ArrayList arrayList = this.b;
        if (i >= length) {
            arrayList.add(new qmd0(bArr));
            this.d = f;
        } else if (i > 0) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i));
            arrayList.add(new qmd0(bArr2));
        }
        this.c += this.e;
        this.e = 0;
    }

    public synchronized qhc d() {
        ArrayList arrayList;
        c();
        arrayList = this.b;
        return arrayList.isEmpty() ? qhc.a : qhc.b(arrayList.iterator(), arrayList.size());
    }

    public synchronized ain1 e() {
        ArrayList arrayList;
        int size;
        try {
            int i = this.e;
            byte[] bArr = this.d;
            if (i >= bArr.length) {
                this.b.add(new vhn1(this.d));
                this.d = g;
            } else if (i > 0) {
                this.b.add(new vhn1(Arrays.copyOf(bArr, i)));
            }
            this.c += this.e;
            this.e = 0;
            arrayList = this.b;
            size = arrayList.size();
        } catch (Throwable th) {
            throw th;
        }
        return size == 0 ? ain1.b : ain1.q(arrayList.iterator(), size);
    }

    public void f(int i) {
        this.b.add(new vhn1(this.d));
        int length = this.c + this.d.length;
        this.c = length;
        this.d = new byte[Math.max(128, Math.max(i, length >>> 1))];
        this.e = 0;
    }

    public final String toString() {
        int i;
        int i2;
        switch (this.a) {
            case 0:
                String hexString = Integer.toHexString(System.identityHashCode(this));
                synchronized (this) {
                    i = this.c + this.e;
                }
                return String.format("<ByteString.Output@%s size=%d>", hexString, Integer.valueOf(i));
            default:
                Locale locale = Locale.ROOT;
                String hexString2 = Integer.toHexString(System.identityHashCode(this));
                synchronized (this) {
                    i2 = this.c + this.e;
                }
                return "<ByteString.Output@" + hexString2 + " size=" + i2 + ">";
        }
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        byte b = this.a;
        synchronized (this) {
            switch (b) {
                case 0:
                    try {
                        byte[] bArr2 = this.d;
                        int length = bArr2.length;
                        int i3 = this.e;
                        if (i2 <= length - i3) {
                            System.arraycopy(bArr, i, bArr2, i3, i2);
                            this.e += i2;
                        } else {
                            int length2 = bArr2.length - i3;
                            System.arraycopy(bArr, i, bArr2, i3, length2);
                            int i4 = i2 - length2;
                            a(i4);
                            System.arraycopy(bArr, i + length2, this.d, 0, i4);
                            this.e = i4;
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                default:
                    byte[] bArr3 = this.d;
                    int length3 = bArr3.length;
                    int i5 = this.e;
                    int i6 = length3 - i5;
                    if (i2 <= i6) {
                        System.arraycopy(bArr, i, bArr3, i5, i2);
                        this.e += i2;
                        return;
                    }
                    System.arraycopy(bArr, i, bArr3, i5, i6);
                    int i7 = i2 - i6;
                    f(i7);
                    System.arraycopy(bArr, i + i6, this.d, 0, i7);
                    this.e = i7;
                    return;
            }
        }
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i) {
        byte b = this.a;
        synchronized (this) {
            switch (b) {
                case 0:
                    try {
                        if (this.e == this.d.length) {
                            a(1);
                        }
                        byte[] bArr = this.d;
                        int i2 = this.e;
                        this.e = i2 + 1;
                        bArr[i2] = (byte) i;
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                default:
                    try {
                        if (this.e == this.d.length) {
                            f(1);
                        }
                        byte[] bArr2 = this.d;
                        int i3 = this.e;
                        this.e = i3 + 1;
                        bArr2[i3] = (byte) i;
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    }
            }
        }
    }
}
