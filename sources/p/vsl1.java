package p;

import android.graphics.Insets;
import android.os.CancellationSignal;
import android.view.View;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vsl1 implements d6o0, WindowInsetsAnimationControlListener {
    public final u85 a;
    public final View b;
    public final vf81 c;
    public final wat d;
    public WindowInsetsAnimationController e;
    public boolean f;
    public final CancellationSignal g = new CancellationSignal();
    public float h;
    public xab1 i;
    public ohd t;

    public vsl1(u85 u85Var, View view, vf81 vf81Var, wat watVar) {
        this.a = u85Var;
        this.b = view;
        this.c = vf81Var;
        this.d = watVar;
    }

    public final long M(int i, long j) {
        float fA = this.c.a(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (4294967295L & j)));
        if (fA > 0.0f) {
            fA = 0.0f;
        }
        return e(fA, j);
    }

    public final Object Q0(long j, long j2, lnm lnmVar) {
        float fA = this.c.a(qui1.d(j2), qui1.e(j2));
        return d(j2, fA < 0.0f ? 0.0f : fA, true, (onm) lnmVar);
    }

    public final void a(float f) {
        WindowInsetsAnimationController windowInsetsAnimationController = this.e;
        if (windowInsetsAnimationController != null) {
            windowInsetsAnimationController.setInsetsAndAlpha(this.c.b(windowInsetsAnimationController.getCurrentInsets(), Math.round(f)), 1.0f, 0.0f);
        }
    }

    public final void b() {
        WindowInsetsAnimationController windowInsetsAnimationController;
        WindowInsetsAnimationController windowInsetsAnimationController2 = this.e;
        if (windowInsetsAnimationController2 != null && windowInsetsAnimationController2.isReady() && (windowInsetsAnimationController = this.e) != null) {
            windowInsetsAnimationController.finish(this.a.f());
        }
        this.e = null;
        ohd ohdVar = this.t;
        if (ohdVar != null) {
            ohdVar.f((Object) null, k6i.i);
        }
        this.t = null;
        xab1 xab1Var = this.i;
        if (xab1Var != null) {
            xab1Var.S(new lk20());
        }
        this.i = null;
        this.h = 0.0f;
        this.f = false;
    }

    public final void c() {
        ohd ohdVar = this.t;
        if (ohdVar != null) {
            ohdVar.f((Object) null, k6i.t);
        }
        xab1 xab1Var = this.i;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        WindowInsetsAnimationController windowInsetsAnimationController = this.e;
        if (windowInsetsAnimationController != null) {
            windowInsetsAnimationController.finish(!u890.j(windowInsetsAnimationController.getCurrentInsets(), windowInsetsAnimationController.getHiddenStateInsets()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public final Object d(long j, float f, boolean z, onm onmVar) {
        qsl1 qsl1Var;
        boolean z2;
        d9n d9nVar;
        Object objR;
        long j2;
        Object obj;
        float f2;
        m811 m811Var;
        long j3;
        long j4;
        float f3;
        if (onmVar instanceof qsl1) {
            qsl1Var = (qsl1) onmVar;
            int i = qsl1Var.f;
            if ((i & os00.INVALID_ID) != 0) {
                qsl1Var.f = i - os00.INVALID_ID;
            } else {
                qsl1Var = new qsl1(this, onmVar);
            }
        } else {
            qsl1Var = new qsl1(this, onmVar);
        }
        qsl1 qsl1Var2 = qsl1Var;
        Object obj2 = qsl1Var2.d;
        int i2 = qsl1Var2.f;
        vf81 vf81Var = this.c;
        d9n d9nVar2 = d9n.a;
        if (i2 == 0) {
            hm5.M(obj2);
            xab1 xab1Var = this.i;
            if (xab1Var != null) {
                xab1Var.S(new lk20());
            }
            this.i = null;
            this.h = 0.0f;
            if (f != 0.0f || z) {
                WindowInsetsAnimationController windowInsetsAnimationController = this.e;
                u85 u85Var = this.a;
                if (windowInsetsAnimationController != null || u85Var.f() != z) {
                    qsl1Var2.a = j;
                    qsl1Var2.b = f;
                    z2 = true;
                    qsl1Var2.f = 1;
                    WindowInsetsAnimationController windowInsetsAnimationController2 = this.e;
                    if (windowInsetsAnimationController2 == null) {
                        ohd ohdVar = new ohd(1, aym.t(qsl1Var2));
                        ohdVar.t();
                        this.t = ohdVar;
                        if (this.f) {
                            d9nVar = d9nVar2;
                        } else {
                            this.f = true;
                            WindowInsetsController windowInsetsController = this.b.getWindowInsetsController();
                            if (windowInsetsController != null) {
                                d9nVar = d9nVar2;
                                windowInsetsController.controlWindowInsetsAnimation(u85Var.a, -1L, null, this.g, this);
                            } else {
                                d9nVar = d9nVar2;
                            }
                        }
                        objR = ohdVar.r();
                    } else {
                        d9nVar = d9nVar2;
                        z2 = true;
                        objR = windowInsetsAnimationController2;
                    }
                    if (objR != d9nVar) {
                        j2 = j;
                        obj = objR;
                        f2 = f;
                    }
                    return d9nVar;
                }
            }
            return new qui1(0L);
        }
        if (i2 != 1) {
            if (i2 == 2) {
                j3 = qsl1Var2.a;
                m811Var = qsl1Var2.c;
                hm5.M(obj2);
                return new qui1(vf81Var.e(m811Var.a, j3));
            }
            if (i2 != 3) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j4 = qsl1Var2.a;
            hm5.M(obj2);
            f3 = 0.0f;
            return new qui1(vf81Var.e(f3, j4));
        }
        float f4 = qsl1Var2.b;
        j2 = qsl1Var2.a;
        hm5.M(obj2);
        f2 = f4;
        obj = obj2;
        d9nVar = d9nVar2;
        z2 = true;
        WindowInsetsAnimationController windowInsetsAnimationController3 = (WindowInsetsAnimationController) obj;
        if (windowInsetsAnimationController3 == null) {
            return new qui1(0L);
        }
        int iD = vf81Var.d(windowInsetsAnimationController3.getHiddenStateInsets());
        int iD2 = vf81Var.d(windowInsetsAnimationController3.getShownStateInsets());
        int iD3 = vf81Var.d(windowInsetsAnimationController3.getCurrentInsets());
        if ((f2 <= 0.0f && iD3 == iD) || (f2 >= 0.0f && iD3 == iD2)) {
            windowInsetsAnimationController3.finish(iD3 == iD2 ? z2 : false);
            this.e = null;
            return new qui1(0L);
        }
        ir20 ir20Var = new ir20(this.d);
        float fE = ir20Var.e(f2) + iD3;
        float f5 = iD;
        boolean z3 = (fE - f5) / ((float) (iD2 - iD)) > 0.5f ? z2 : false;
        long j5 = j2;
        int i3 = z3 ? iD2 : iD;
        if (fE > iD2 || fE < f5) {
            m811 m811Var2 = new m811();
            tsl1 tsl1Var = new tsl1(f2, iD3, iD, iD2, windowInsetsAnimationController3, null, ir20Var, m811Var2, this, z3);
            qsl1Var2.c = m811Var2;
            qsl1Var2.a = j5;
            qsl1Var2.f = 2;
            if (smo1.s(tsl1Var, qsl1Var2) != d9nVar) {
                m811Var = m811Var2;
                j3 = j5;
                return new qui1(vf81Var.e(m811Var.a, j3));
            }
        } else {
            x2c x2cVar = new x2c(f2, iD3, i3, windowInsetsAnimationController3, (lnm) null, this, z3);
            qsl1Var2.a = j5;
            qsl1Var2.f = 3;
            if (smo1.s(x2cVar, qsl1Var2) != d9nVar) {
                j4 = j5;
                f3 = 0.0f;
                return new qui1(vf81Var.e(f3, j4));
            }
        }
        return d9nVar;
    }

    public final long e(float f, long j) {
        xab1 xab1Var = this.i;
        if (xab1Var != null) {
            xab1Var.S(new lk20());
            this.i = null;
        }
        WindowInsetsAnimationController windowInsetsAnimationController = this.e;
        if (f != 0.0f) {
            u85 u85Var = this.a;
            if (u85Var.f() != (f > 0.0f) || windowInsetsAnimationController != null) {
                vf81 vf81Var = this.c;
                if (windowInsetsAnimationController == null) {
                    this.h = 0.0f;
                    if (!this.f) {
                        this.f = true;
                        WindowInsetsController windowInsetsController = this.b.getWindowInsetsController();
                        if (windowInsetsController != null) {
                            windowInsetsController.controlWindowInsetsAnimation(u85Var.a, -1L, null, this.g, this);
                        }
                    }
                    return vf81Var.f(j);
                }
                int iD = vf81Var.d(windowInsetsAnimationController.getHiddenStateInsets());
                int iD2 = vf81Var.d(windowInsetsAnimationController.getShownStateInsets());
                Insets currentInsets = windowInsetsAnimationController.getCurrentInsets();
                int iD3 = vf81Var.d(currentInsets);
                if (iD3 == (f > 0.0f ? iD2 : iD)) {
                    this.h = 0.0f;
                    return 0L;
                }
                float f2 = iD3 + f + this.h;
                int iP = yoi1.p(Math.round(f2), iD, iD2);
                this.h = f2 - Math.round(f2);
                if (iP != iD3) {
                    windowInsetsAnimationController.setInsetsAndAlpha(vf81Var.b(currentInsets, iP), 1.0f, 0.0f);
                }
                return vf81Var.f(j);
            }
        }
        return 0L;
    }

    public final long h0(int i, long j, long j2) {
        float fA = this.c.a(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (4294967295L & j2)));
        if (fA < 0.0f) {
            fA = 0.0f;
        }
        return e(fA, j2);
    }

    public final Object k0(long j, lnm lnmVar) {
        float fA = this.c.a(qui1.d(j), qui1.e(j));
        return d(j, fA > 0.0f ? 0.0f : fA, false, (onm) lnmVar);
    }

    public final void onCancelled(WindowInsetsAnimationController windowInsetsAnimationController) {
        b();
    }

    public final void onFinished(WindowInsetsAnimationController windowInsetsAnimationController) {
        b();
    }

    public final void onReady(WindowInsetsAnimationController windowInsetsAnimationController, int i) {
        this.e = windowInsetsAnimationController;
        this.f = false;
        ohd ohdVar = this.t;
        if (ohdVar != null) {
            ohdVar.f(windowInsetsAnimationController, new psl1());
        }
        this.t = null;
    }
}
