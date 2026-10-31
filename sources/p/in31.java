package p;

import java.util.TreeMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class in31 implements i1d1 {
    public static final TreeMap h = new TreeMap();
    public volatile String a;
    public final long[] b;
    public final double[] c;
    public final String[] d;
    public final byte[][] e;
    public final int[] f;
    public int g;

    public in31(int i) {
        int i2 = i + 1;
        this.f = new int[i2];
        this.b = new long[i2];
        this.c = new double[i2];
        this.d = new String[i2];
        this.e = new byte[i2][];
    }

    @Override // p.i1d1
    public final void n(byte[] bArr, int i) {
        this.f[i] = 5;
        this.e[i] = bArr;
    }

    @Override // p.i1d1
    public final void r(int i, long j) {
        this.f[i] = 2;
        this.b[i] = j;
    }

    @Override // p.i1d1
    public final void s(double d, int i) {
        this.f[i] = 3;
        this.c[i] = d;
    }

    @Override // p.i1d1
    public final void t(int i) {
        this.f[i] = 1;
    }

    @Override // p.i1d1
    public final void w0(int i, String str) {
        this.f[i] = 4;
        this.d[i] = str;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
