package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class lmb0 {
    public final hmb0 a;
    public boolean b;
    public boolean c;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public int l;
    public boolean m;
    public boolean n;
    public int o;
    public c6f0 q;
    public int d = 5;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ffh0 f68p = new ffh0(this);

    public lmb0(hmb0 hmb0Var) {
        this.a = hmb0Var;
    }

    public final ndo0 a() {
        return (ndo0) this.a.e1.e;
    }

    public final void b() {
        int i = this.a.f1.d;
        if (i == 3 || i == 4) {
            if (this.f68p.a1) {
                g(true);
            } else {
                f(true);
            }
        }
        if (i == 4) {
            c6f0 c6f0Var = this.q;
            if (c6f0Var == null || !c6f0Var.V0) {
                h(true);
            } else {
                i(true);
            }
        }
    }

    public final void c(long j) {
        c6f0 c6f0Var = this.q;
        if (c6f0Var != null) {
            lmb0 lmb0Var = c6f0Var.f;
            lmb0Var.d = 2;
            hmb0 hmb0Var = lmb0Var.a;
            lmb0Var.e = false;
            c6f0Var.Z0 = j;
            uxq0 snapshotObserver = ((ha4) kmb0.a(hmb0Var)).getSnapshotObserver();
            Function0 function0 = c6f0Var.a1;
            snapshotObserver.a.d(hmb0Var, snapshotObserver.b, function0);
            lmb0Var.f = true;
            lmb0Var.g = true;
            boolean zY = gio1.y(hmb0Var);
            ffh0 ffh0Var = lmb0Var.f68p;
            if (zY) {
                ffh0Var.V0 = true;
                ffh0Var.W0 = true;
            } else {
                ffh0Var.U0 = true;
            }
            lmb0Var.d = 5;
        }
    }

    public final void d(int i) {
        int i2 = this.l;
        this.l = i;
        if ((i2 == 0) != (i == 0)) {
            hmb0 hmb0VarV = this.a.v();
            lmb0 lmb0Var = hmb0VarV != null ? hmb0VarV.f1 : null;
            if (lmb0Var != null) {
                int i3 = lmb0Var.l;
                if (i == 0) {
                    lmb0Var.d(i3 - 1);
                } else {
                    lmb0Var.d(i3 + 1);
                }
            }
        }
    }

    public final void e(int i) {
        int i2 = this.o;
        this.o = i;
        if ((i2 == 0) != (i == 0)) {
            hmb0 hmb0VarV = this.a.v();
            lmb0 lmb0Var = hmb0VarV != null ? hmb0VarV.f1 : null;
            if (lmb0Var != null) {
                int i3 = lmb0Var.o;
                if (i == 0) {
                    lmb0Var.e(i3 - 1);
                } else {
                    lmb0Var.e(i3 + 1);
                }
            }
        }
    }

    public final void f(boolean z) {
        if (this.k != z) {
            this.k = z;
            if (z && !this.j) {
                d(this.l + 1);
            } else {
                if (z || this.j) {
                    return;
                }
                d(this.l - 1);
            }
        }
    }

    public final void g(boolean z) {
        if (this.j != z) {
            this.j = z;
            if (z && !this.k) {
                d(this.l + 1);
            } else {
                if (z || this.k) {
                    return;
                }
                d(this.l - 1);
            }
        }
    }

    public final void h(boolean z) {
        if (this.n != z) {
            this.n = z;
            if (z && !this.m) {
                e(this.o + 1);
            } else {
                if (z || this.m) {
                    return;
                }
                e(this.o - 1);
            }
        }
    }

    public final void i(boolean z) {
        if (this.m != z) {
            this.m = z;
            if (z && !this.n) {
                e(this.o + 1);
            } else {
                if (z || this.n) {
                    return;
                }
                e(this.o - 1);
            }
        }
    }

    public final void j() {
        ffh0 ffh0Var = this.f68p;
        lmb0 lmb0Var = ffh0Var.f;
        Object obj = ffh0Var.R0;
        hmb0 hmb0Var = this.a;
        if ((obj != null || lmb0Var.a().g() != null) && ffh0Var.Q0) {
            ffh0Var.Q0 = false;
            ffh0Var.R0 = lmb0Var.a().g();
            hmb0 hmb0VarV = hmb0Var.v();
            if (hmb0VarV != null) {
                hmb0.W(hmb0VarV, false, 7);
            }
        }
        c6f0 c6f0Var = this.q;
        if (c6f0Var != null) {
            lmb0 lmb0Var2 = c6f0Var.f;
            if (c6f0Var.Y0 == null) {
                z5f0 z5f0VarC1 = lmb0Var2.a().c1();
                z5f0VarC1.getClass();
                if (z5f0VarC1.g() == null) {
                    return;
                }
            }
            if (c6f0Var.X0) {
                c6f0Var.X0 = false;
                z5f0 z5f0VarC2 = lmb0Var2.a().c1();
                z5f0VarC2.getClass();
                c6f0Var.Y0 = z5f0VarC2.g();
                if (gio1.y(hmb0Var)) {
                    hmb0 hmb0VarV2 = hmb0Var.v();
                    if (hmb0VarV2 != null) {
                        hmb0.W(hmb0VarV2, false, 7);
                        return;
                    }
                    return;
                }
                hmb0 hmb0VarV3 = hmb0Var.v();
                if (hmb0VarV3 != null) {
                    hmb0.U(hmb0VarV3, false, 7);
                }
            }
        }
    }
}
