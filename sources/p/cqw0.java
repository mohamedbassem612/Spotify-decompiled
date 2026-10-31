package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class cqw0 extends pxa1 {
    public final /* synthetic */ byte a;
    public final long b;
    public final long c;

    public cqw0(byte b, long j, long j2) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = j;
                this.c = j2;
                break;
            default:
                this.b = j2;
                this.c = j;
                break;
        }
    }

    public static long d(long j, izr0 izr0Var) {
        long jE = izr0Var.E();
        if ((128 & jE) != 0) {
            return 8589934591L & ((((jE & 1) << 32) | izr0Var.G()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // p.pxa1
    public final String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
                sb.append(this.b);
                sb.append(", identifier= ");
                return pze0.h(this.c, " }", sb);
            default:
                StringBuilder sb2 = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
                sb2.append(this.b);
                sb2.append(", playbackPositionUs= ");
                return pze0.h(this.c, " }", sb2);
        }
    }
}
