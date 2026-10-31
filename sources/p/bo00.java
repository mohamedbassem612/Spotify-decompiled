package p;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class bo00 {
    public static final int E;
    public static final boolean F;
    public boolean A;
    public final String B;
    public boolean C;
    public final boolean D;
    public final Context a;
    public rdd1 b;
    public final v0d1 c;
    public v0d1 d;
    public v0d1 e;
    public v0d1 f;
    public v0d1 g;
    public final cwa h;
    public Looper i;
    public final int j;
    public final po7 k;
    public final boolean l;
    public final boolean m;
    public final on51 n;
    public final zu41 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final short f15p;
    public final short q;
    public final short r;
    public final a6s s;
    public final short t;
    public final short u;
    public int v;
    public int w;
    public int x;
    public final int y;
    public boolean z;

    static {
        E = zoi1.S() ? 30000 : 10000;
        F = true;
    }

    public bo00(Context context, v0d1 v0d1Var, v0d1 v0d1Var2) {
        uu7 uu7Var = new uu7(context, (byte) 3);
        p58 p58Var = new p58((byte) 4);
        uu7 uu7Var2 = new uu7(context, (byte) 4);
        cwa cwaVar = new cwa((byte) 5);
        context.getClass();
        this.a = context;
        this.c = v0d1Var;
        this.d = v0d1Var2;
        this.e = uu7Var;
        this.f = p58Var;
        this.g = uu7Var2;
        this.h = cwaVar;
        this.i = zoi1.D();
        this.k = po7.i;
        this.l = true;
        this.m = true;
        this.n = on51.d;
        this.f15p = (short) 5000;
        this.q = (short) 15000;
        this.r = (short) 3000;
        this.o = zu41.g;
        this.s = new x1c((byte) 1).a();
        this.b = rdd1.a;
        this.t = (short) 500;
        this.u = (short) 2000;
        this.v = 600000;
        boolean z = F;
        this.w = z ? E : Integer.MAX_VALUE;
        this.x = z ? 60000 : Integer.MAX_VALUE;
        this.y = 600000;
        this.z = true;
        this.B = "";
        this.j = -1000;
        new pob();
        this.C = true;
        this.D = true;
    }

    public final yo00 a() {
        dm5.y(!this.A);
        this.A = true;
        return new yo00(this, (ww81) null);
    }

    public final void b(h6s h6sVar) {
        dm5.y(!this.A);
        h6sVar.getClass();
        this.f = new x7s(h6sVar, (byte) 2);
    }

    public final void c(exs exsVar) {
        dm5.y(!this.A);
        exsVar.getClass();
        this.e = new x7s(exsVar, (byte) 4);
    }

    public bo00(Context context, rd21 rd21Var) {
        this(context, new x7s(rd21Var, (byte) 5), new uu7(context, (byte) 5));
    }

    public bo00(Context context) {
        this(context, new uu7(context, (byte) 1), new uu7(context, (byte) 2));
    }
}
