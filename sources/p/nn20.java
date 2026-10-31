package p;

import java.io.IOException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class nn20 extends hf30 {
    public final long b;
    public final boolean c;
    public long d;

    public nn20(fka1 fka1Var, long j, boolean z) {
        super(fka1Var);
        this.b = j;
        this.c = z;
    }

    public final long O0(nac nacVar, long j) throws IOException {
        long j2 = this.d;
        long j3 = this.b;
        if (j2 > j3) {
            j = 0;
        } else if (this.c) {
            long j4 = j3 - j2;
            if (j4 == 0) {
                return -1L;
            }
            j = Math.min(j, j4);
        }
        long jO0 = ((hf30) this).a.O0(nacVar, j);
        if (jO0 != -1) {
            this.d += jO0;
        }
        long j5 = this.d;
        if ((j5 >= j3 || jO0 != -1) && j5 <= j3) {
            return jO0;
        }
        if (jO0 > 0 && j5 > j3) {
            long j6 = nacVar.b - (j5 - j3);
            nac nacVar2 = new nac();
            nacVar2.B(nacVar);
            nacVar.B0(nacVar2, j6);
            nacVar2.a();
        }
        StringBuilder sbS = cy30.s(j3, "expected ", " bytes but got ");
        sbS.append(this.d);
        throw new IOException(sbS.toString());
    }
}
