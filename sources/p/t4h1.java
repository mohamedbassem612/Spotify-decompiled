package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class t4h1 {
    public final hce1 A;
    public final oyb a;
    public final oyj0 b;
    public final c9n c;
    public final hrr0 d;
    public final mdt e;
    public final hrr0 f;
    public final hrr0 g;
    public final hrr0 h;
    public final hrr0 i;
    public final dlg1 j;
    public final dlg1 k;
    public final hrr0 l;
    public final hrr0 m;
    public final hrr0 n;
    public final hrr0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public s4h1 f14p;
    public final hrr0 q;
    public boolean r;
    public long s;
    public xab1 t;
    public final mdt u;
    public final mdt v;
    public final r4h1 w;
    public final q881 x;
    public final dxy y;
    public final ywv0 z;

    public t4h1(oyb oybVar, oyj0 oyj0Var, c9n c9nVar) {
        this.a = oybVar;
        this.b = oyj0Var;
        this.c = c9nVar;
        Boolean bool = Boolean.FALSE;
        this.d = v8r.q(bool);
        this.e = yv91.a(new q4h1(this, (byte) 13));
        this.f = v8r.q(bool);
        this.g = v8r.q(bool);
        this.h = v8r.q(bool);
        this.i = v8r.q(bool);
        this.j = new dlg1(this);
        this.k = new dlg1(this);
        this.l = v8r.q((Object) null);
        this.m = v8r.q((Object) null);
        this.n = v8r.q((Object) null);
        this.o = v8r.q((Object) null);
        this.q = v8r.q(bool);
        kyj0 kyj0Var = oyj0Var.b;
        lyj0 lyj0VarC = kyj0Var.c();
        this.r = lyj0VarC.c || lyj0VarC.d;
        this.s = kyj0Var.c().b;
        this.u = yv91.a(new q4h1(this, (byte) 11));
        this.v = yv91.a(new q4h1(this, (byte) 12));
        r4h1 r4h1Var = new r4h1();
        r4h1Var.a = new hce1((byte) 15);
        r4h1Var.b = new hce1((byte) 15);
        r4h1Var.c = new hce1((byte) 15);
        r4h1Var.d = new hce1((byte) 15);
        r4h1Var.e = yv91.a(new q4h1(this, (byte) 0));
        r4h1Var.f = this.g;
        this.w = r4h1Var;
        this.x = new q881(this);
        this.y = new dxy(this);
        this.z = new ywv0(this);
        this.A = new hce1(this);
    }

    public final dlg1 a(ijf1 ijf1Var) {
        int iOrdinal = ijf1Var.ordinal();
        if (iOrdinal == 0) {
            return this.j;
        }
        if (iOrdinal == 1) {
            return this.k;
        }
        eg.o();
        return null;
    }

    public final boolean b(long j) {
        wxj0 wxj0Var = (wxj0) this.b.b.e.get(Long.valueOf(j));
        if (wxj0Var == null) {
            return false;
        }
        r4h1 r4h1Var = this.w;
        ((hce1) r4h1Var.a).i(wxj0Var.a, wxj0Var.b, wxj0Var.c);
        ((hce1) r4h1Var.b).i(wxj0Var.d, wxj0Var.e, wxj0Var.f);
        ((hce1) r4h1Var.c).i(wxj0Var.g, wxj0Var.h, wxj0Var.i);
        ((hce1) r4h1Var.d).i(wxj0Var.j, wxj0Var.k, wxj0Var.l);
        Boolean bool = Boolean.FALSE;
        this.h.setValue(bool);
        this.i.setValue(bool);
        this.l.setValue((Object) null);
        this.m.setValue((Object) null);
        this.n.setValue((Object) null);
        this.o.setValue((Object) null);
        this.j.o();
        this.k.o();
        return true;
    }

    public final void c(ijf1 ijf1Var, Integer num) {
        int iOrdinal = ijf1Var.ordinal();
        if (iOrdinal == 0) {
            this.l.setValue(num);
        } else if (iOrdinal == 1) {
            this.m.setValue(num);
        } else {
            eg.o();
        }
    }

    public final void d(ijf1 ijf1Var, Integer num) {
        int iOrdinal = ijf1Var.ordinal();
        if (iOrdinal == 0) {
            this.n.setValue(num);
        } else if (iOrdinal == 1) {
            this.o.setValue(num);
        } else {
            eg.o();
        }
    }

    public final void e() {
        xab1 xab1Var = this.t;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.q.setValue(Boolean.TRUE);
        this.t = fn31.T(this.c, (o8n) null, 0, new b0f1(this, (lnm) null, (byte) 15), 3);
    }
}
