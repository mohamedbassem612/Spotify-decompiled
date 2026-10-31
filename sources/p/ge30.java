package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ge30 {
    public float A;
    public int B;
    public boolean C;
    public float D;
    public byte[] E;
    public int F;
    public x8h G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public String a;
    public String b;
    public b380 c;
    public String d;
    public int e;
    public int f;
    public float g;
    public int h;
    public int i;
    public int j;
    public String k;
    public hjj0 l;
    public String m;
    public String n;
    public String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f52p;
    public int q;
    public List r;
    public x8v s;
    public long t;
    public boolean u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;

    public ge30() {
        w280 w280Var = b380.b;
        this.c = bg11.e;
        this.g = -1.0f;
        this.i = -1;
        this.j = -1;
        this.f52p = -1;
        this.q = -1;
        this.t = Long.MAX_VALUE;
        this.v = -1;
        this.w = -1;
        this.x = -1;
        this.y = -1;
        this.z = -1;
        this.A = -1.0f;
        this.D = 1.0f;
        this.F = -1;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.O = -1;
        this.P = 1;
        this.Q = -1;
        this.R = -1;
        this.S = 0;
        this.h = 0;
    }

    public final ie30 a() {
        return new ie30(this);
    }

    public final void b(int i) {
        this.I = i;
    }

    public final void c(float f) {
        dm5.m(f == -1.0f || f > 0.0f);
        this.A = f;
    }

    public final void d(int i) {
        this.L = i;
    }

    public final void e(String str) {
        this.o = asj0.p(str);
    }

    public final void f(int i) {
        this.K = i;
    }
}
