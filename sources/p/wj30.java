package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class wj30 extends hf30 {
    public static final rhc c = u890.v("0021F904");
    public final nac b;

    public wj30(gbc gbcVar) {
        super(gbcVar);
        this.b = new nac();
    }

    public final long O0(nac nacVar, long j) {
        long j2;
        long j3;
        a(j);
        nac nacVar2 = this.b;
        long j4 = 0;
        if (nacVar2.b == 0) {
            return j == 0 ? 0L : -1L;
        }
        long j5 = 0;
        while (true) {
            long jH = -1;
            while (true) {
                rhc rhcVar = c;
                j2 = j4;
                jH = nacVar2.h(rhcVar.a[0], jH + 1, Long.MAX_VALUE);
                if (jH == -1 || (a(rhcVar.a.length) && nacVar2.i0(jH, rhcVar))) {
                    break;
                }
                j4 = j2;
            }
            if (jH == -1) {
                break;
            }
            long jO0 = nacVar2.O0(nacVar, jH + 4);
            if (jO0 < j2) {
                jO0 = j2;
            }
            j5 += jO0;
            if (a(5L) && nacVar2.g(4L) == 0 && (((nacVar2.g(2L) & 255) << 8) | (nacVar2.g(1L) & 255)) < 2) {
                nacVar.R(nacVar2.g(j2));
                nacVar.R(10);
                nacVar.R(0);
                nacVar2.skip(3L);
            }
            j4 = 0;
        }
        if (j5 < j) {
            long jO1 = nacVar2.O0(nacVar, j - j5);
            j3 = 0;
            if (jO1 < 0) {
                jO1 = 0;
            }
            j5 += jO1;
        } else {
            j3 = 0;
        }
        if (j5 == j3) {
            return -1L;
        }
        return j5;
    }

    public final boolean a(long j) {
        nac nacVar = this.b;
        long j2 = nacVar.b;
        if (j2 >= j) {
            return true;
        }
        long j3 = j - j2;
        return ((hf30) this).a.O0(nacVar, j3) == j3;
    }
}
