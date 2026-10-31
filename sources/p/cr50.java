package p;

import android.util.Size;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class cr50 {
    public static final byte[] e = {0, 0, 1};
    public int a;
    public int b;
    public boolean c;
    public Serializable d;

    public Size a(cx70 cx70Var) {
        int iP = cx70Var.p();
        Size size = (Size) cx70Var.h(cx70.Q, (Object) null);
        int i = this.b;
        int i2 = this.a;
        if (size != null) {
            int iS = mqn1.s(mqn1.G(iP), i2, 1 == i);
            if (iS == 90 || iS == 270) {
                return new Size(size.getHeight(), size.getWidth());
            }
        }
        return size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [byte[], java.io.Serializable] */
    public void b(int i, byte[] bArr, int i2) {
        Object obj;
        if (this.c) {
            int i3 = i2 - i;
            byte[] bArr2 = (byte[]) this.d;
            int length = bArr2.length;
            int i4 = this.a + i3;
            if (length < i4) {
                obj = bArr2;
                ?? CopyOf = Arrays.copyOf(bArr2, i4 * 2);
                this.d = CopyOf;
                obj = CopyOf;
            }
            obj = bArr2;
            System.arraycopy(bArr, i, obj, this.a, i3);
            this.a += i3;
        }
    }
}
