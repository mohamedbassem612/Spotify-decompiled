package p;

import com.google.android.recaptcha.internal.zzals;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class din1 {
    public int a;
    public int b;
    public a9a c;

    public static bin1 c(int i, byte[] bArr, int i2) {
        bin1 bin1Var = new bin1(bArr, i, i2);
        try {
            bin1Var.x(i2);
            return bin1Var;
        } catch (zzals e) {
            throw new IllegalArgumentException(e);
        }
    }

    public abstract boolean a();

    public abstract int b();

    public abstract int d();

    public abstract void e();

    public abstract double f();

    public abstract float g();

    public abstract long h();

    public abstract long i();

    public abstract int j();

    public abstract long k();

    public abstract int l();

    public abstract boolean m();

    public abstract String n();

    public abstract String o();

    public abstract vhn1 p();

    public abstract int q();

    public abstract int r();

    public abstract int s();

    public abstract long t();

    public abstract int u();

    public abstract long v();

    public abstract int w();

    public abstract int x(int i);

    public abstract void y(int i);

    public abstract int z();
}
