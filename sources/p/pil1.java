package p;

import java.io.Closeable;
import java.util.Random;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class pil1 implements Closeable {
    public final df01 a;
    public final Random b;
    public final boolean c;
    public final boolean d;
    public final short e;
    public final nac g;
    public boolean h;
    public yxi0 i;
    public final nac f = new nac();
    public final byte[] t = new byte[4];
    public final lac X = new lac();

    /* JADX WARN: Type inference failed for: r2v1, types: [int, short] */
    public pil1(df01 df01Var, Random random, boolean z, boolean z2, long j) {
        this.a = df01Var;
        this.b = random;
        this.c = z;
        this.d = z2;
        this.e = (int) j;
        this.g = df01Var.b;
    }

    public final void a(int i, rhc rhcVar) {
        if (this.h) {
            k220.i("closed");
            return;
        }
        int iD = rhcVar.d();
        if (iD > 125) {
            hhg1.n("Payload size must be less than or equal to 125");
            return;
        }
        nac nacVar = this.g;
        nacVar.R(i | 128);
        nacVar.R(iD | 128);
        byte[] bArr = this.t;
        bArr.getClass();
        this.b.nextBytes(bArr);
        nacVar.write(bArr, 0, bArr.length);
        if (iD > 0) {
            long j = nacVar.b;
            nacVar.N(rhcVar);
            lac lacVar = this.X;
            lacVar.getClass();
            nacVar.q(lacVar);
            lacVar.c(j);
            x760.G(lacVar, bArr);
            lacVar.close();
        }
        this.a.flush();
    }

    public final void c(int i, rhc rhcVar) {
        if (this.h) {
            k220.i("closed");
            return;
        }
        nac nacVar = this.f;
        nacVar.N(rhcVar);
        int i2 = i | 128;
        if (this.c && rhcVar.d() >= this.e) {
            yxi0 yxi0Var = this.i;
            if (yxi0Var == null) {
                yxi0Var = new yxi0((byte) 0, this.d);
                this.i = yxi0Var;
            }
            yxi0Var.a(nacVar);
            i2 = i | 192;
        }
        long j = nacVar.b;
        nac nacVar2 = this.g;
        nacVar2.R(i2);
        if (j <= 125) {
            nacVar2.R(((int) j) | 128);
        } else if (j <= 65535) {
            nacVar2.R(254);
            nacVar2.V((int) j);
        } else {
            nacVar2.R(255);
            ip51 ip51VarM = nacVar2.M(8);
            byte[] bArr = ip51VarM.a;
            int i3 = ip51VarM.c;
            bArr[i3] = (byte) ((j >>> 56) & 255);
            bArr[i3 + 1] = (byte) ((j >>> 48) & 255);
            bArr[i3 + 2] = (byte) ((j >>> 40) & 255);
            bArr[i3 + 3] = (byte) ((j >>> 32) & 255);
            bArr[i3 + 4] = (byte) ((j >>> 24) & 255);
            bArr[i3 + 5] = (byte) ((j >>> 16) & 255);
            bArr[i3 + 6] = (byte) ((j >>> 8) & 255);
            bArr[i3 + 7] = (byte) (j & 255);
            ip51VarM.c = i3 + 8;
            nacVar2.b += 8;
        }
        byte[] bArr2 = this.t;
        bArr2.getClass();
        this.b.nextBytes(bArr2);
        nacVar2.write(bArr2, 0, bArr2.length);
        if (j > 0) {
            lac lacVar = this.X;
            lacVar.getClass();
            nacVar.q(lacVar);
            lacVar.c(0L);
            x760.G(lacVar, bArr2);
            lacVar.close();
        }
        nacVar2.B0(nacVar, j);
        this.a.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        yxi0 yxi0Var = this.i;
        if (yxi0Var != null) {
            w4n1.b(yxi0Var);
        }
        w4n1.b(this.a);
    }
}
