package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class sin0 {
    public final short a;
    public boolean b;
    public boolean c;
    public byte[] d;
    public int e;

    /* JADX WARN: Multi-variable type inference failed */
    public sin0(int i) {
        this.a = i;
        byte[] bArr = new byte[131];
        this.d = bArr;
        bArr[2] = 1;
    }

    public final void a(int i, byte[] bArr, int i2) {
        if (this.b) {
            int i3 = i2 - i;
            byte[] bArrCopyOf = this.d;
            int length = bArrCopyOf.length;
            int i4 = this.e + i3;
            if (length < i4) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i4 * 2);
                this.d = bArrCopyOf;
            }
            System.arraycopy(bArr, i, bArrCopyOf, this.e, i3);
            this.e += i3;
        }
    }

    public final boolean b(int i) {
        if (!this.b) {
            return false;
        }
        this.e -= i;
        this.b = false;
        this.c = true;
        return true;
    }

    public final void c() {
        this.b = false;
        this.c = false;
    }

    public final void d(int i) {
        dm5.y(!this.b);
        boolean z = i == this.a;
        this.b = z;
        if (z) {
            this.e = 3;
            this.c = false;
        }
    }
}
