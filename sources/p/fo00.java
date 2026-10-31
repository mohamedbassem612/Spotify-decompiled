package p;

import android.content.Context;
import android.media.MediaCodec;
import android.media.metrics.LogSessionId;
import android.os.Looper;
import androidx.car.app.model.Alert;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class fo00 implements b67 {
    public int a;
    public long b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;
    public Object g;

    public fo00(Context context, e4w e4wVar, o2i0 o2i0Var, dn3 dn3Var, int i, Looper looper, a67 a67Var, rdd1 rdd1Var, m0g1 m0g1Var, LogSessionId logSessionId, h6s h6sVar) {
        this.c = context;
        this.d = e4wVar;
        cab cabVar = new cab(dn3Var, (byte) 21);
        this.e = cabVar;
        this.g = o2i0Var;
        exs exsVarA = m0g1Var.a(context);
        bo00 bo00Var = new bo00(context, new eo00(e4wVar, cabVar, i, a67Var, logSessionId));
        dm5.y(!bo00Var.A);
        o2i0Var.getClass();
        bo00Var.d = new x7s(o2i0Var, (byte) 1);
        bo00Var.c(exsVarA);
        bo00Var.b(h6sVar);
        dm5.y(!bo00Var.A);
        looper.getClass();
        bo00Var.i = looper;
        dm5.y(!bo00Var.A);
        bo00Var.v = Alert.DURATION_SHOW_INDEFINITELY;
        dm5.y(!bo00Var.A);
        bo00Var.w = Alert.DURATION_SHOW_INDEFINITELY;
        dm5.y(!bo00Var.A);
        bo00Var.x = Alert.DURATION_SHOW_INDEFINITELY;
        dm5.y(!bo00Var.A);
        bo00Var.z = false;
        dm5.y(!bo00Var.A);
        bo00Var.C = false;
        if (rdd1Var != rdd1.a) {
            dm5.y(true ^ bo00Var.A);
            bo00Var.b = rdd1Var;
        }
        yo00 yo00VarA = bo00Var.a();
        this.f = yo00VarA;
        yo00VarA.m.a(new do00(this, a67Var));
        this.a = 0;
        this.b = -9223372036854775807L;
    }

    public static z1c d(z1c z1cVar, long j, ByteBuffer byteBuffer, int i) {
        while (j >= z1cVar.b) {
            z1cVar = (z1c) z1cVar.d;
        }
        while (i > 0) {
            int iMin = Math.min(i, (int) (z1cVar.b - j));
            nu3 nu3Var = (nu3) z1cVar.c;
            byteBuffer.put(nu3Var.a, ((int) (j - z1cVar.a)) + nu3Var.b, iMin);
            i -= iMin;
            j += (long) iMin;
            if (j == z1cVar.b) {
                z1cVar = (z1c) z1cVar.d;
            }
        }
        return z1cVar;
    }

    public static z1c e(z1c z1cVar, long j, byte[] bArr, int i) {
        while (j >= z1cVar.b) {
            z1cVar = (z1c) z1cVar.d;
        }
        int i2 = i;
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (z1cVar.b - j));
            nu3 nu3Var = (nu3) z1cVar.c;
            System.arraycopy(nu3Var.a, ((int) (j - z1cVar.a)) + nu3Var.b, bArr, i - i2, iMin);
            i2 -= iMin;
            j += (long) iMin;
            if (j == z1cVar.b) {
                z1cVar = (z1c) z1cVar.d;
            }
        }
        return z1cVar;
    }

    public static z1c f(z1c z1cVar, gar garVar, qjb qjbVar, izr0 izr0Var) {
        if (garVar.f(1073741824)) {
            long j = qjbVar.b;
            int iL = 1;
            izr0Var.O(1);
            z1c z1cVarE = e(z1cVar, j, izr0Var.a, 1);
            long j2 = j + 1;
            byte b = izr0Var.a[0];
            boolean z = (b & 128) != 0;
            int i = b & 127;
            oco ocoVar = garVar.c;
            byte[] bArr = ocoVar.a;
            if (bArr == null) {
                ocoVar.a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            z1cVar = e(z1cVarE, j2, ocoVar.a, i);
            long j3 = j2 + ((long) i);
            if (z) {
                izr0Var.O(2);
                z1cVar = e(z1cVar, j3, izr0Var.a, 2);
                j3 += 2;
                iL = izr0Var.L();
            }
            int[] iArr = ocoVar.d;
            if (iArr == null || iArr.length < iL) {
                iArr = new int[iL];
            }
            int[] iArr2 = ocoVar.e;
            if (iArr2 == null || iArr2.length < iL) {
                iArr2 = new int[iL];
            }
            if (z) {
                int i2 = iL * 6;
                izr0Var.O(i2);
                z1cVar = e(z1cVar, j3, izr0Var.a, i2);
                j3 += (long) i2;
                izr0Var.R(0);
                for (int i3 = 0; i3 < iL; i3++) {
                    iArr[i3] = izr0Var.L();
                    iArr2[i3] = izr0Var.I();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = qjbVar.a - ((int) (j3 - qjbVar.b));
            }
            ftf1 ftf1Var = (ftf1) qjbVar.c;
            String str = zoi1.a;
            byte[] bArr2 = ftf1Var.b;
            byte[] bArr3 = ocoVar.a;
            int i4 = ftf1Var.a;
            int i5 = ftf1Var.c;
            int i6 = ftf1Var.d;
            ocoVar.f = iL;
            ocoVar.d = iArr;
            ocoVar.e = iArr2;
            ocoVar.b = bArr2;
            ocoVar.a = bArr3;
            ocoVar.c = i4;
            ocoVar.g = i5;
            ocoVar.h = i6;
            MediaCodec.CryptoInfo cryptoInfo = ocoVar.i;
            cryptoInfo.numSubSamples = iL;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i4;
            gal galVar = ocoVar.j;
            MediaCodec.CryptoInfo.Pattern pattern = (MediaCodec.CryptoInfo.Pattern) galVar.c;
            pattern.set(i5, i6);
            ((MediaCodec.CryptoInfo) galVar.b).setPattern(pattern);
            long j4 = qjbVar.b;
            int i7 = (int) (j3 - j4);
            qjbVar.b = j4 + ((long) i7);
            qjbVar.a -= i7;
        }
        if (!garVar.f(268435456)) {
            garVar.i(qjbVar.a);
            return d(z1cVar, qjbVar.b, garVar.d, qjbVar.a);
        }
        izr0Var.O(4);
        z1c z1cVarE2 = e(z1cVar, qjbVar.b, izr0Var.a, 4);
        int I = izr0Var.I();
        qjbVar.b += 4;
        qjbVar.a -= 4;
        garVar.i(I);
        z1c z1cVarD = d(z1cVarE2, qjbVar.b, garVar.d, I);
        qjbVar.b += (long) I;
        int i8 = qjbVar.a - I;
        qjbVar.a = i8;
        ByteBuffer byteBuffer = garVar.g;
        if (byteBuffer == null || byteBuffer.capacity() < i8) {
            garVar.g = ByteBuffer.allocate(i8);
        } else {
            garVar.g.clear();
        }
        return d(z1cVarD, qjbVar.b, garVar.g, qjbVar.a);
    }

    public void a(long j) {
        z1c z1cVar;
        if (j == -1) {
            return;
        }
        while (true) {
            z1cVar = (z1c) this.e;
            if (j < z1cVar.b) {
                break;
            }
            ((hw3) this.c).f((nu3) z1cVar.c);
            z1c z1cVar2 = (z1c) this.e;
            z1cVar2.c = null;
            z1c z1cVar3 = (z1c) z1cVar2.d;
            z1cVar2.d = null;
            this.e = z1cVar3;
        }
        if (((z1c) this.f).a < z1cVar.a) {
            this.f = z1cVar;
        }
    }

    public int b(int i) {
        z1c z1cVar = (z1c) this.g;
        if (((nu3) z1cVar.c) == null) {
            nu3 nu3VarA = ((hw3) this.c).a();
            z1c z1cVar2 = new z1c(((z1c) this.g).b, this.a);
            z1cVar.c = nu3VarA;
            z1cVar.d = z1cVar2;
        }
        return Math.min(i, (int) (((z1c) this.g).b - this.b));
    }

    @Override // p.b67
    public int c(ij81 ij81Var) {
        if (this.a == 2) {
            long j = this.b / 1000;
            ij81Var.b = zoi1.b0(Math.min(((yo00) this.f).v(), j), j);
        }
        return this.a;
    }

    @Override // p.b67
    public j380 g() {
        h380 h380Var = new h380(4);
        cab cabVar = (cab) this.e;
        String str = (String) cabVar.c;
        if (str != null) {
            h380Var.e(1, str);
        }
        String str2 = (String) cabVar.d;
        if (str2 != null) {
            h380Var.e(2, str2);
        }
        return h380Var.b(true);
    }

    @Override // p.b67
    public void release() {
        ((yo00) this.f).y1();
        this.a = 0;
    }

    @Override // p.b67
    public void start() {
        yo00 yo00Var = (yo00) this.f;
        yo00Var.W0(((o2i0) this.g).b(((e4w) this.d).a));
        yo00Var.e();
        this.a = 1;
    }

    public fo00(hw3 hw3Var) {
        this.c = hw3Var;
        int iG = hw3Var.g();
        this.a = iG;
        this.d = new izr0(32);
        z1c z1cVar = new z1c(0L, iG);
        this.e = z1cVar;
        this.f = z1cVar;
        this.g = z1cVar;
    }
}
