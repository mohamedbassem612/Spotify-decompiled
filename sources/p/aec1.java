package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class aec1 {
    public gtf1 b;
    public gc10 c;
    public syp0 d;
    public long e;
    public long f;
    public long g;
    public byte h;
    public int i;
    public long k;
    public boolean l;
    public boolean m;
    public final qyp0 a = new qyp0();
    public r2a1 j = new r2a1();

    public void a(long j) {
        this.g = j;
    }

    public long b(izr0 izr0Var) {
        byte[] bArr = izr0Var.a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i = (bArr[2] & 255) >> 4;
        if (i == 6 || i == 7) {
            izr0Var.S(4);
            izr0Var.M();
        }
        int iM = r2p1.m(i, izr0Var);
        izr0Var.R(0);
        return iM;
    }

    public abstract boolean c(izr0 izr0Var, long j, r2a1 r2a1Var);

    public void d(boolean z) {
        if (z) {
            this.j = new r2a1();
            this.f = 0L;
            this.h = (byte) 0;
        } else {
            this.h = (byte) 1;
        }
        this.e = -1L;
        this.g = 0L;
    }
}
