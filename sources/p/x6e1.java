package p;

import android.content.ClipDescription;
import androidx.compose.ui.geometry.Offset;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class x6e1 {
    public boolean A;
    public final hhh1 a;
    public r1c0 d;
    public Function0 f;
    public ung g;
    public c9n h;
    public hdt0 i;
    public ss50 j;
    public lz20 k;
    public final hrr0 l;
    public final hrr0 m;
    public long n;
    public nbe1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f167p;
    public final hrr0 q;
    public final hrr0 r;
    public int s;
    public c8e1 t;
    public jqd0 u;
    public nbe1 v;
    public final hrr0 w;
    public final k3f1 x;
    public final v6e1 y;
    public final jqd0 z;
    public hyp0 b = qri1.a;
    public iu30 c = new p5e1((byte) 7);
    public final hrr0 e = v8r.q(new c8e1(0, 7, (String) null));

    public x6e1(hhh1 hhh1Var) {
        this.a = hhh1Var;
        Boolean bool = Boolean.TRUE;
        this.l = v8r.q(bool);
        this.m = v8r.q(bool);
        this.n = 0L;
        this.f167p = 0L;
        this.q = v8r.q((Object) null);
        this.r = v8r.q((Object) null);
        this.s = -1;
        this.t = new c8e1(0L, 7, (String) null);
        this.w = v8r.q(Boolean.FALSE);
        this.x = new k3f1();
        this.y = new v6e1(this);
        this.z = new jqd0(this);
    }

    public static c8e1 b(af5 af5Var, long j) {
        return new c8e1(af5Var, j, (nbe1) null);
    }

    public final xab1 a(boolean z) {
        c9n c9nVar = this.h;
        if (c9nVar != null) {
            return fn31.T(c9nVar, null, 4, new oy3(this, z, (lnm) null, (byte) 19), 1);
        }
        return null;
    }

    public final void c() {
        c9n c9nVar = this.h;
        if (c9nVar != null) {
            fn31.T(c9nVar, null, 4, new xba1(this, (lnm) null, (byte) 26), 1);
        }
    }

    public final void d(Offset offset) {
        if (!nbe1.d(l().b)) {
            r1c0 r1c0Var = this.d;
            z9e1 z9e1VarD = r1c0Var != null ? r1c0Var.d() : null;
            int iF = (offset == null || z9e1VarD == null) ? nbe1.f(l().b) : this.b.i(z9e1VarD.b(offset.a, true));
            c8e1 c8e1VarA = c8e1.a(l(), (af5) null, e6p1.e(iF, iF), 5);
            this.c.invoke(c8e1VarA);
            this.v = new nbe1(c8e1VarA.b);
        }
        r((offset == null || l().a.b.length() <= 0) ? zr50.a : zr50.c);
        u(false);
    }

    public final void e(boolean z) {
        lz20 lz20Var;
        r1c0 r1c0Var = this.d;
        if (r1c0Var != null && !r1c0Var.b() && (lz20Var = this.k) != null) {
            lz20.b(lz20Var);
        }
        this.t = l();
        u(z);
        r(zr50.b);
    }

    public final mmr0 f() {
        String str;
        nbe1 nbe1Var;
        af5 af5VarK = k();
        if (af5VarK == null || (str = af5VarK.b) == null || (nbe1Var = this.v) == null) {
            return null;
        }
        long j = nbe1Var.a;
        return new mmr0(str, new nbe1(e6p1.e(this.b.o((int) (j >> 32)), this.b.o((int) (j & 4294967295L)))));
    }

    public final Offset g() {
        return (Offset) this.r.getValue();
    }

    public final boolean h() {
        return ((Boolean) this.l.getValue()).booleanValue();
    }

    public final boolean i() {
        return ((Boolean) this.m.getValue()).booleanValue();
    }

    public final long j(boolean z) {
        z9e1 z9e1VarD;
        long j;
        r1c0 r1c0Var = this.d;
        if (r1c0Var == null || (z9e1VarD = r1c0Var.d()) == null) {
            return 9205357640488583168L;
        }
        y9e1 y9e1Var = z9e1VarD.a;
        af5 af5VarK = k();
        if (af5VarK == null) {
            return 9205357640488583168L;
        }
        if (!u890.j(af5VarK.b, y9e1Var.a.a.b)) {
            return 9205357640488583168L;
        }
        c8e1 c8e1VarL = l();
        if (z) {
            long j2 = c8e1VarL.b;
            int i = nbe1.c;
            j = j2 >> 32;
        } else {
            long j3 = c8e1VarL.b;
            int i2 = nbe1.c;
            j = j3 & 4294967295L;
        }
        return l6p1.k(y9e1Var, this.b.o((int) j), z, nbe1.h(l().b));
    }

    public final af5 k() {
        r1c0 r1c0Var = this.d;
        if (r1c0Var != null) {
            return (af5) r1c0Var.a.b;
        }
        return null;
    }

    public final c8e1 l() {
        return (c8e1) this.e.getValue();
    }

    public final void m() {
        this.x.a();
    }

    public final void n(nbe1 nbe1Var) {
        af5 af5VarK;
        String str;
        c9n c9nVar;
        if (nbe1Var == null) {
            return;
        }
        long j = nbe1Var.a;
        hdt0 hdt0Var = this.i;
        if (hdt0Var == null || (af5VarK = k()) == null || (str = af5VarK.b) == null) {
            return;
        }
        hyp0 hyp0Var = this.b;
        long jE = e6p1.e(hyp0Var.o((int) (j >> 32)), hyp0Var.o((int) (j & 4294967295L)));
        if (str.length() <= 0 || nbe1.d(jE) || (c9nVar = this.h) == null) {
            return;
        }
        fn31.T(c9nVar, null, 0, new ie3(hdt0Var, str, jE, nbe1Var, this, hyp0Var, (lnm) null), 3);
    }

    public final void o() {
        c9n c9nVar = this.h;
        if (c9nVar != null) {
            fn31.T(c9nVar, null, 4, new i7u0(this, (lnm) null, (byte) 10), 1);
        }
    }

    public final void p(Offset offset) {
        this.r.setValue(offset);
    }

    public final void q(qr50 qr50Var) {
        this.q.setValue(qr50Var);
    }

    public final void r(zr50 zr50Var) {
        r1c0 r1c0Var = this.d;
        if (r1c0Var != null) {
            if (r1c0Var.a() == zr50Var) {
                r1c0Var = null;
            }
            if (r1c0Var != null) {
                r1c0Var.k.setValue(zr50Var);
            }
        }
    }

    public final void s() {
        r1c0 r1c0Var;
        jv91 jv91VarO = ekb.o();
        iu30 iu30VarE = jv91VarO != null ? jv91VarO.e() : null;
        jv91 jv91VarU = ekb.u(jv91VarO);
        try {
            if (!i() || ((r1c0Var = this.d) != null && !((Boolean) r1c0Var.q.getValue()).booleanValue())) {
                ekb.C(jv91VarO, jv91VarU, iu30VarE);
            } else {
                ekb.C(jv91VarO, jv91VarU, iu30VarE);
                this.x.b();
            }
        } catch (Throwable th) {
            ekb.C(jv91VarO, jv91VarU, iu30VarE);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object t(onm onmVar) {
        w6e1 w6e1Var;
        if (onmVar instanceof w6e1) {
            w6e1Var = (w6e1) onmVar;
            int i = w6e1Var.d;
            if ((i & os00.INVALID_ID) != 0) {
                w6e1Var.d = i - os00.INVALID_ID;
            } else {
                w6e1Var = new w6e1(this, onmVar);
            }
        } else {
            w6e1Var = new w6e1(this, onmVar);
        }
        Object objValueOf = w6e1Var.b;
        int i2 = w6e1Var.d;
        if (i2 == 0) {
            hm5.M(objValueOf);
            ung ungVar = this.g;
            if (ungVar != null) {
                w6e1Var.a = this;
                w6e1Var.d = 1;
                ClipDescription primaryClipDescription = ob51.l(ungVar).getPrimaryClipDescription();
                objValueOf = Boolean.valueOf(primaryClipDescription == null ? false : primaryClipDescription.hasMimeType("text/*"));
                Object obj = d9n.a;
                if (objValueOf == obj) {
                    return obj;
                }
            }
            return rih1.a;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        this = w6e1Var.a;
        hm5.M(objValueOf);
        Boolean bool = (Boolean) objValueOf;
        bool.getClass();
        this.w.setValue(bool);
        return rih1.a;
    }

    public final void u(boolean z) {
        r1c0 r1c0Var = this.d;
        if (r1c0Var != null) {
            r1c0Var.l.setValue(Boolean.valueOf(z));
        }
        if (z) {
            s();
        } else {
            m();
        }
    }

    public final long v(c8e1 c8e1Var, long j, boolean z, boolean z2, f341 f341Var, boolean z3, vs50 vs50Var) {
        z9e1 z9e1VarD;
        char c;
        sct0 sct0Var;
        r1c0 r1c0Var = this.d;
        if (r1c0Var == null || (z9e1VarD = r1c0Var.d()) == null) {
            return nbe1.b;
        }
        hyp0 hyp0Var = this.b;
        long j2 = c8e1Var.b;
        af5 af5Var = c8e1Var.a;
        int i = nbe1.c;
        long jE = e6p1.e(hyp0Var.o((int) (j2 >> 32)), this.b.o((int) (j2 & 4294967295L)));
        boolean z4 = false;
        int iB = z9e1VarD.b(j, false);
        int i2 = (z2 || z) ? iB : (int) (jE >> 32);
        int i3 = (!z2 || z) ? iB : (int) (jE & 4294967295L);
        jqd0 jqd0Var = this.u;
        int i4 = -1;
        if (z || jqd0Var == null) {
            c = ' ';
        } else {
            c = ' ';
            int i5 = this.s;
            if (i5 != -1) {
                i4 = i5;
            }
        }
        jqd0 jqd0VarQ = ejo1.q(z9e1VarD.a, i2, i3, i4, jE, z, z2);
        if (jqd0VarQ.B(jqd0Var)) {
            this.u = jqd0VarQ;
            this.s = iB;
            ax51 ax51VarA = f341Var.a(jqd0VarQ);
            long jE2 = e6p1.e(this.b.i(ax51VarA.a.b), this.b.i(ax51VarA.b.b));
            if (!nbe1.c(jE2, j2)) {
                boolean z5 = nbe1.h(jE2) != nbe1.h(j2) && nbe1.c(e6p1.e((int) (4294967295L & jE2), (int) (jE2 >> c)), j2);
                boolean z6 = nbe1.d(jE2) && nbe1.d(j2);
                if (z3 && af5Var.b.length() > 0 && !z5 && !z6 && vs50Var != null && (sct0Var = this.j) != null) {
                    sct0Var.a(vs50Var.a);
                }
                this.c.invoke(b(af5Var, jE2));
                this.v = new nbe1(jE2);
                if (!z3) {
                    u(!nbe1.d(jE2));
                }
                r1c0 r1c0Var2 = this.d;
                if (r1c0Var2 != null) {
                    r1c0Var2.q.setValue(Boolean.valueOf(z3));
                }
                r1c0 r1c0Var3 = this.d;
                if (r1c0Var3 != null) {
                    r1c0Var3.m.setValue(Boolean.valueOf(!nbe1.d(jE2) && a4p1.m(this, true)));
                }
                r1c0 r1c0Var4 = this.d;
                if (r1c0Var4 != null) {
                    r1c0Var4.n.setValue(Boolean.valueOf(!nbe1.d(jE2) && a4p1.m(this, false)));
                }
                r1c0 r1c0Var5 = this.d;
                if (r1c0Var5 != null) {
                    if (nbe1.d(jE2) && a4p1.m(this, true)) {
                        z4 = true;
                    }
                    r1c0Var5.o.setValue(Boolean.valueOf(z4));
                }
                return jE2;
            }
        }
        return j2;
    }
}
