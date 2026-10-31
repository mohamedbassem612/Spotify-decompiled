package p;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wyp0 implements dxc {
    public final qo21 a;
    public final Object b;
    public final Object[] c;
    public final cxc d;
    public final t2n e;
    public volatile boolean f;
    public jf01 g;
    public Throwable h;
    public boolean i;

    public wyp0(qo21 qo21Var, Object obj, Object[] objArr, cxc cxcVar, t2n t2nVar) {
        this.a = qo21Var;
        this.b = obj;
        this.c = objArr;
        this.d = cxcVar;
        this.e = t2nVar;
    }

    public final jf01 a() {
        k370 k370Var;
        l370 l370VarB;
        qo21 qo21Var = this.a;
        fho1[] fho1VarArr = qo21Var.k;
        Object[] objArr = this.c;
        int length = objArr.length;
        if (length != fho1VarArr.length) {
            hhg1.n(gvg.j(cy30.r(length, "Argument count (", ") doesn't match expected count ("), fho1VarArr.length, ")"));
            return null;
        }
        un21 un21Var = new un21(qo21Var.d, qo21Var.c, qo21Var.e, qo21Var.f, qo21Var.g, qo21Var.h, qo21Var.i, qo21Var.j);
        if (qo21Var.l) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(objArr[i]);
            fho1VarArr[i].l(un21Var, objArr[i]);
        }
        k370 k370Var2 = un21Var.d;
        if (k370Var2 != null) {
            l370VarB = k370Var2.b();
        } else {
            String str = un21Var.c;
            l370 l370Var = un21Var.b;
            l370Var.getClass();
            try {
                k370Var = new k370();
                k370Var.f(l370Var, str);
            } catch (IllegalArgumentException unused) {
                k370Var = null;
            }
            l370VarB = k370Var != null ? k370Var.b() : null;
            if (l370VarB == null) {
                StringBuilder sb = new StringBuilder("Malformed URL. Base: ");
                sb.append(l370Var);
                hhg1.j(sb, ", Relative: ", un21Var.c);
                return null;
            }
        }
        ce30 xq50Var = un21Var.k;
        if (xq50Var == null) {
            be30 be30Var = un21Var.j;
            if (be30Var != null) {
                xq50Var = be30Var.c();
            } else {
                kqi0 kqi0Var = un21Var.i;
                if (kqi0Var != null) {
                    xq50Var = kqi0Var.g();
                } else if (un21Var.h) {
                    w4n1.a(0L, 0L, 0L);
                    xq50Var = new sn21(0, null, new byte[0]);
                }
            }
        }
        r8i0 r8i0Var = un21Var.g;
        t360 t360Var = un21Var.f;
        if (r8i0Var != null) {
            if (xq50Var != null) {
                xq50Var = new xq50(xq50Var, r8i0Var, (byte) 1);
            } else {
                t360Var.b("Content-Type", r8i0Var.a);
            }
        }
        ne neVar = un21Var.e;
        neVar.a = l370VarB;
        t360Var.getClass();
        neVar.c = m5n1.i(m5n1.g(t360Var));
        neVar.L(un21Var.a, xq50Var);
        neVar.c0(re90.class, new re90(qo21Var.a, this.b, qo21Var.b, arrayList));
        jf01 jf01VarA = this.d.a(new ln21(neVar));
        if (jf01VarA != null) {
            return jf01VarA;
        }
        bhn0.i("Call.Factory returned null.");
        return null;
    }

    public final jf01 b() throws IOException {
        jf01 jf01Var = this.g;
        if (jf01Var != null) {
            return jf01Var;
        }
        Throwable th = this.h;
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
        try {
            jf01 jf01VarA = a();
            this.g = jf01VarA;
            return jf01VarA;
        } catch (IOException | Error | RuntimeException e) {
            m5n1.V(e);
            this.h = e;
            throw e;
        }
    }

    @Override // p.dxc
    public final sy21 c() {
        jf01 jf01VarB;
        synchronized (this) {
            if (this.i) {
                throw new IllegalStateException("Already executed.");
            }
            this.i = true;
            jf01VarB = b();
        }
        if (this.f) {
            jf01VarB.cancel();
        }
        return d(jf01VarB.e());
    }

    @Override // p.dxc
    public final void cancel() {
        jf01 jf01Var;
        this.f = true;
        synchronized (this) {
            jf01Var = this.g;
        }
        if (jf01Var != null) {
            jf01Var.cancel();
        }
    }

    public final Object clone() {
        return new wyp0(this.a, this.b, this.c, this.d, this.e);
    }

    public final sy21 d(ry21 ry21Var) throws IOException {
        uz21 uz21Var = ry21Var.g;
        zx21 zx21VarC = ry21Var.c();
        zx21VarC.g = new vyp0(uz21Var.e(), uz21Var.d());
        ry21 ry21VarA = zx21VarC.a();
        int i = ry21VarA.d;
        if (i < 200 || i >= 300) {
            try {
                nac nacVar = new nac();
                uz21Var.d1().Z0(nacVar);
                return sy21.b(new tz21(uz21Var.e(), uz21Var.d(), nacVar), ry21VarA);
            } finally {
                uz21Var.close();
            }
        }
        if (i == 204 || i == 205) {
            uz21Var.close();
            return sy21.d(null, ry21VarA);
        }
        uyp0 uyp0Var = new uyp0(uz21Var);
        try {
            return sy21.d(this.e.g(uyp0Var), ry21VarA);
        } catch (RuntimeException e) {
            IOException iOException = uyp0Var.d;
            if (iOException == null) {
                throw e;
            }
            throw iOException;
        }
    }

    @Override // p.dxc
    public final synchronized boolean f() {
        return this.i;
    }

    @Override // p.dxc
    public final synchronized ln21 m() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create request.", e);
        }
        return b().b;
    }

    @Override // p.dxc
    public final boolean o() {
        boolean z = true;
        if (this.f) {
            return true;
        }
        synchronized (this) {
            try {
                jf01 jf01Var = this.g;
                if (jf01Var == null || !jf01Var.R0) {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // p.dxc
    public final void p(myc mycVar) {
        jf01 jf01Var;
        Throwable th;
        synchronized (this) {
            try {
                if (this.i) {
                    throw new IllegalStateException("Already executed.");
                }
                this.i = true;
                jf01Var = this.g;
                th = this.h;
                if (jf01Var == null && th == null) {
                    try {
                        jf01 jf01VarA = a();
                        this.g = jf01VarA;
                        jf01Var = jf01VarA;
                    } catch (Throwable th2) {
                        th = th2;
                        m5n1.V(th);
                        this.h = th;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (th != null) {
            mycVar.u(this, th);
            return;
        }
        if (this.f) {
            jf01Var.cancel();
        }
        jf01Var.d(new yfu(this, mycVar, false, (byte) 28));
    }

    @Override // p.dxc
    public final dxc clone() {
        return new wyp0(this.a, this.b, this.c, this.d, this.e);
    }
}
