package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vub0 {
    public final fvb0 a;
    public final edn0 b;
    public final qub0 c;
    public final dvb0 d;
    public final long e;
    public final boolean f;
    public final isb0 g;
    public final int h;
    public final long i;
    public final int j;
    public final int k;
    public final int l;
    public final c9n m;
    public final boolean n;
    public final List o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yd50 f36p;
    public final uub0 q;
    public final mgc r;
    public final int s;

    public vub0(fvb0 fvb0Var, edn0 edn0Var, qub0 qub0Var, dvb0 dvb0Var, long j, boolean z, isb0 isb0Var, int i, long j2, int i2, int i3, int i4, c9n c9nVar, boolean z2, List list, yd50 yd50Var) {
        this.a = fvb0Var;
        this.b = edn0Var;
        this.c = qub0Var;
        this.d = dvb0Var;
        this.e = j;
        this.f = z;
        this.g = isb0Var;
        this.h = i;
        this.i = j2;
        this.j = i2;
        this.k = i3;
        this.l = i4;
        this.m = c9nVar;
        this.n = z2;
        this.o = list;
        this.f36p = yd50Var;
        this.q = new uub0(this, z, qub0Var, isb0Var, dvb0Var);
        this.r = fvb0Var.e;
        this.s = dvb0Var.b.length;
    }

    public final long a(qub0 qub0Var, int i, int i2) {
        boolean zF = qub0Var.b.d.f(i);
        int i3 = zF ? this.s : 1;
        if (zF) {
            i2 = 0;
        }
        return (((long) i2) << 32) | (((long) (i3 + i2)) & 4294967295L);
    }
}
