package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class ngc {
    public int a;
    public Object b;

    public ngc(byte b) {
        switch (b) {
            case 1:
                break;
            default:
                this.b = new n36();
                break;
        }
    }

    public static int b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long c(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public byte[] A(int i) {
        byte[] bArr;
        synchronized (this) {
            n36 n36Var = (n36) this.b;
            bArr = null;
            byte[] bArr2 = (byte[]) (n36Var.isEmpty() ? null : n36Var.removeLast());
            if (bArr2 != null) {
                this.a -= bArr2.length / 2;
                bArr = bArr2;
            }
        }
        return bArr == null ? new byte[i] : bArr;
    }

    public abstract void a(int i);

    public abstract int d();

    public abstract boolean e();

    public abstract void f(int i);

    public abstract int g(int i);

    public abstract boolean h();

    public abstract fhc i();

    public abstract double j();

    public abstract int k();

    public abstract int l();

    public abstract long m();

    public abstract float n();

    public abstract int o();

    public abstract long p();

    public abstract int q();

    public abstract long r();

    public abstract int s();

    public abstract long t();

    public abstract String u();

    public abstract String v();

    public abstract int w();

    public abstract int x();

    public abstract long y();

    public void z(byte[] bArr) {
        synchronized (this) {
            int i = this.a;
            if (bArr.length + i < b46.a) {
                this.a = i + (bArr.length / 2);
                ((n36) this.b).addLast(bArr);
            }
        }
    }
}
