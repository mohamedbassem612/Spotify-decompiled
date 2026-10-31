package p;

import java.nio.ByteOrder;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xn20 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    public final t7y k;
    public final hjj0 l;

    public xn20(byte[] bArr, int i) {
        bae baeVar = new bae(bArr, bArr.length);
        baeVar.m(i * 8);
        this.a = baeVar.g(16);
        this.b = baeVar.g(16);
        this.c = baeVar.g(24);
        this.d = baeVar.g(24);
        int iG = baeVar.g(20);
        this.e = iG;
        this.f = d(iG);
        this.g = baeVar.g(3) + 1;
        int iG2 = baeVar.g(5) + 1;
        this.h = iG2;
        this.i = a(iG2);
        this.j = baeVar.i(36);
        this.k = null;
        this.l = null;
    }

    public static int a(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 20) {
            return 5;
        }
        if (i != 24) {
            return i != 32 ? -1 : 7;
        }
        return 6;
    }

    public static int d(int i) {
        switch (i) {
            case 8000:
                return 4;
            case mpd.AUDIO_CONTENT_SAMPLING_RATE /* 16000 */:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long b() {
        long j = this.j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / ((long) this.e);
    }

    public final ie30 c(byte[] bArr, hjj0 hjj0Var) {
        bArr[4] = -128;
        int i = this.d;
        if (i <= 0) {
            i = -1;
        }
        hjj0 hjj0Var2 = this.l;
        if (hjj0Var2 != null) {
            hjj0Var = hjj0Var2.b(hjj0Var);
        }
        ge30 ge30Var = new ge30();
        ge30Var.o = asj0.p("audio/flac");
        ge30Var.f52p = i;
        ge30Var.I = this.g;
        ge30Var.K = this.e;
        String str = zoi1.a;
        ge30Var.L = zoi1.I(this.h, ByteOrder.LITTLE_ENDIAN);
        ge30Var.r = Collections.singletonList(bArr);
        ge30Var.l = hjj0Var;
        return new ie30(ge30Var);
    }

    public xn20(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, t7y t7yVar, hjj0 hjj0Var) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = d(i5);
        this.g = i6;
        this.h = i7;
        this.i = a(i7);
        this.j = j;
        this.k = t7yVar;
        this.l = hjj0Var;
    }
}
