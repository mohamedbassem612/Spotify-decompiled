package p;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class cfo implements ipc1 {
    public static final tfc c = new tfc(new cwa((byte) 3), ann0.a);
    public final b380 a;
    public final long[] b;

    /* JADX WARN: Code duplicated, block: B:30:0x00ad  */
    public cfo(bg11 bg11Var) {
        int i = bg11Var.d;
        if (i == 1) {
            bfo bfoVar = (bfo) t890.o(bg11Var.r(0));
            long j = bfoVar.b;
            long j2 = bfoVar.c;
            long j3 = j == -9223372036854775807L ? 0L : j;
            b380 b380Var = bfoVar.a;
            if (j2 == -9223372036854775807L) {
                this.a = b380.t(b380Var);
                this.b = new long[]{j3};
                return;
            } else {
                w280 w280Var = b380.b;
                this.a = b380.u(b380Var, bg11.e);
                this.b = new long[]{j3, j2 + j3};
                return;
            }
        }
        long[] jArr = new long[i * 2];
        this.b = jArr;
        Arrays.fill(jArr, Long.MAX_VALUE);
        ArrayList arrayList = new ArrayList();
        bg11 bg11VarW = b380.w(bg11Var, c);
        int i2 = 0;
        for (int i3 = 0; i3 < bg11VarW.d; i3++) {
            bfo bfoVar2 = (bfo) bg11VarW.get(i3);
            long j4 = bfoVar2.b;
            long j5 = bfoVar2.c;
            b380 b380Var2 = bfoVar2.a;
            j4 = j4 == -9223372036854775807L ? 0L : j4;
            long j6 = j4 + j5;
            if (i2 != 0) {
                int i4 = i2 - 1;
                long j7 = this.b[i4];
                if (j7 < j4) {
                    this.b[i2] = j4;
                    arrayList.add(b380Var2);
                    i2++;
                } else if (j7 == j4 && ((b380) arrayList.get(i4)).isEmpty()) {
                    arrayList.set(i4, b380Var2);
                } else {
                    oon1.H("Truncating unsupported overlapping cues.");
                    this.b[i4] = j4;
                    arrayList.set(i4, b380Var2);
                }
            } else {
                this.b[i2] = j4;
                arrayList.add(b380Var2);
                i2++;
            }
            if (j5 != -9223372036854775807L) {
                this.b[i2] = j6;
                arrayList.add(bg11.e);
                i2++;
            }
        }
        this.a = b380.p(arrayList);
    }

    public final int a(long j) {
        int iB = zoi1.b(this.b, j, false);
        if (iB < this.a.size()) {
            return iB;
        }
        return -1;
    }

    public final List b(long j) {
        int iF = zoi1.f(this.b, j, false);
        if (iF != -1) {
            return (b380) this.a.get(iF);
        }
        w280 w280Var = b380.b;
        return bg11.e;
    }

    public final long c(int i) {
        dm5.m(i < this.a.size());
        return this.b[i];
    }

    public final int d() {
        return this.a.size();
    }
}
