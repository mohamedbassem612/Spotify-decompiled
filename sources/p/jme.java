package p;

import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.b;
import androidx.datastore.preferences.protobuf.c;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class jme {
    public int a;
    public Object b;

    public jme(byte b) {
        switch (b) {
            case 1:
                break;
            case 2:
                this.b = new long[8];
                this.a = -1;
                break;
            default:
                this.b = new n36();
                break;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException */
    public static b p0(byte[] bArr) {
        int length = bArr.length;
        b bVar = new b(bArr, length);
        try {
            bVar.y0(length);
            return bVar;
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalArgumentException((Throwable) e);
        }
    }

    public static jme q0(FileInputStream fileInputStream) {
        return new c(fileInputStream);
    }

    public abstract boolean A0();

    public abstract ihc B0();

    public abstract double C0();

    public abstract int D0();

    public abstract int E0();

    public abstract long F0();

    public abstract float G0();

    public abstract int H0();

    public abstract long I0();

    public abstract int J0();

    public abstract long K0();

    public abstract int L0();

    public abstract long M0();

    public abstract String N0();

    public abstract String O0();

    public abstract int P0();

    public abstract int Q0();

    public abstract long R0();

    public void S0(char[] cArr) {
        synchronized (this) {
            int i = this.a;
            if (cArr.length + i < b46.a) {
                this.a = i + cArr.length;
                ((n36) this.b).addLast(cArr);
            }
        }
    }

    public abstract boolean T0(int i);

    public char[] U0(int i) {
        char[] cArr;
        synchronized (this) {
            n36 n36Var = (n36) this.b;
            cArr = null;
            char[] cArr2 = (char[]) (n36Var.isEmpty() ? null : n36Var.removeLast());
            if (cArr2 != null) {
                this.a -= cArr2.length;
                cArr = cArr2;
            }
        }
        return cArr == null ? new char[i] : cArr;
    }

    public abstract void j0(int i);

    public long k0() {
        return ((long[]) this.b)[this.a];
    }

    public long l0() {
        int i = this.a;
        if (i == -1) {
            return 19500L;
        }
        return ((long[]) this.b)[i];
    }

    public int m0() {
        return this.a;
    }

    public abstract int n0();

    public abstract boolean o0();

    public abstract hsl1 t0(hsl1 hsl1Var, List list);

    public abstract frl1 u0(mrl1 mrl1Var, frl1 frl1Var);

    public abstract void v0(int i);

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public long w0() throws SerializationException {
        int i = this.a;
        if (i < 0) {
            uh61.j("No tag in stack for requested element");
            return 0L;
        }
        long[] jArr = (long[]) this.b;
        this.a = i - 1;
        return jArr[i];
    }

    public long x0() {
        int i = this.a;
        if (i == -1) {
            return 19500L;
        }
        long[] jArr = (long[]) this.b;
        this.a = i - 1;
        return jArr[i];
    }

    public abstract int y0(int i);

    public void z0(long j) {
        if (j == 19500) {
            return;
        }
        int i = this.a + 1;
        this.a = i;
        long[] jArrCopyOf = (long[]) this.b;
        if (i >= jArrCopyOf.length) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, jArrCopyOf.length * 2);
            this.b = jArrCopyOf;
        }
        jArrCopyOf[i] = j;
    }

    public void r0(mrl1 mrl1Var) {
    }

    public void s0(mrl1 mrl1Var) {
    }

    public jme(String str, int i) {
        this.b = str;
        this.a = i;
    }

    public jme(int i) {
        this.a = i;
    }
}
