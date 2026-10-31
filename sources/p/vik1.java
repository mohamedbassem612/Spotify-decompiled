package p;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vik1 {
    public final o8n a;
    public final yqg b;
    public View c;
    public Function0 d;
    public iu30 e;
    public iu30 f;
    public boolean g;
    public x8c0 h;
    public final ek2 i;
    public final y22 j;
    public final z22 k;
    public final Handler l;
    public llm m;
    public long n;
    public boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final seg1 f127p;
    public boolean q;
    public int r;
    public boolean s;
    public m511 t;
    public final int[] u;
    public Boolean v;
    public boolean w;

    public vik1() {
        fns fnsVar = igu.a;
        bs50 bs50Var = pyf0.a;
        h94 h94Var = new h94();
        this.a = bs50Var;
        this.b = h94Var;
        this.d = kvj1.Y;
        this.i = new ek2(this, (byte) 25);
        this.j = new y22(this, (byte) 26);
        this.k = new z22(this, (byte) 4);
        this.l = new Handler(Looper.getMainLooper());
        this.f127p = new seg1(this, (byte) 9);
        this.q = true;
        this.u = new int[2];
    }

    public final void a() {
        if (this.c == null || u890.j(this.v, Boolean.FALSE)) {
            return;
        }
        long jC = this.b.c();
        long j = 10 - (jC - this.n);
        boolean z = this.o;
        Runnable runnable = this.f127p;
        Handler handler = this.l;
        if (j > 0) {
            if (z) {
                return;
            }
            this.o = true;
            handler.postDelayed(runnable, j);
            return;
        }
        if (z) {
            handler.removeCallbacks(runnable);
            this.o = false;
        }
        this.n = jC;
        c();
    }

    public final void b() {
        ViewTreeObserver viewTreeObserver;
        View view = this.c;
        if (view == null) {
            return;
        }
        if (this.w) {
            if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
                viewTreeObserver.removeOnScrollChangedListener(this.k);
            }
            this.w = false;
        }
        View view2 = this.c;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this.j);
        }
        x8c0 x8c0Var = this.h;
        if (x8c0Var != null) {
            x8c0Var.d(this.i);
        }
        if (this.o) {
            this.l.removeCallbacks(this.f127p);
            this.o = false;
        }
        llm llmVar = this.m;
        if (llmVar != null) {
            smo1.q(llmVar);
        }
        this.m = null;
        iu30 iu30Var = this.e;
        iu30 iu30Var2 = this.f;
        boolean z = this.r != 0;
        boolean z2 = (this.s && this.t == null) ? false : true;
        this.c = null;
        this.d = kvj1.Y;
        this.e = null;
        this.f = null;
        this.g = false;
        this.q = true;
        this.v = null;
        this.n = 0L;
        this.r = 0;
        this.s = false;
        this.t = null;
        if (z && iu30Var != null) {
            iu30Var.invoke(0);
        }
        if (!z2 || iu30Var2 == null) {
            return;
        }
        iu30Var2.invoke((Object) null);
    }

    public final void c() {
        m511 m511VarX;
        View view;
        x8c0 x8c0Var;
        w8c0 w8c0VarB;
        View view2 = this.c;
        int iB = 0;
        if (view2 == null || ((!this.q && this.f == null) || !view2.isAttachedToWindow() || !this.g || (view = this.c) == null || !view.isShown() || u890.j(this.v, Boolean.FALSE) || (x8c0Var = this.h) == null || (w8c0VarB = x8c0Var.b()) == null || !w8c0VarB.a(w8c0.d) || f7p1.l(view2))) {
            m511VarX = null;
        } else {
            m511VarX = hap1.x(view2, this.u);
            m511 m511Var = (m511) this.d.invoke();
            if (m511Var != null) {
                iB = m511VarX.b(m511Var);
            }
        }
        d(m511VarX, iB);
    }

    public final void d(m511 m511Var, int i) {
        iu30 iu30Var = this.e;
        iu30 iu30Var2 = this.f;
        boolean z = (this.s && u890.j(this.t, m511Var)) ? false : true;
        if (z) {
            this.s = true;
            this.t = m511Var;
        }
        if (iu30Var != null) {
            if (!this.q) {
                i = 0;
            }
            if (this.r != i) {
                this.r = i;
                iu30Var.invoke(Integer.valueOf(i));
            }
        }
        if (!z || iu30Var2 == null) {
            return;
        }
        iu30Var2.invoke(m511Var);
    }

    public final void e(View view, Function0 function0, moy0 moy0Var, iu30 iu30Var, r1t r1tVar) {
        ViewTreeObserver viewTreeObserver;
        x8c0 lifecycle;
        if (this.c != null || this.d.invoke() != null) {
            eg.m("startTracking can not be used more than once unless endTracking is called!");
            return;
        }
        iac0 iac0VarH = x9p1.h(view);
        if (iac0VarH != null && (lifecycle = iac0VarH.getLifecycle()) != null) {
            x8c0 x8c0Var = this.h;
            ek2 ek2Var = this.i;
            if (x8c0Var != null) {
                x8c0Var.d(ek2Var);
            }
            this.h = lifecycle;
            lifecycle.a(ek2Var);
        }
        this.c = view;
        this.d = function0;
        this.e = iu30Var;
        this.f = r1tVar;
        this.r = 0;
        this.s = false;
        this.t = null;
        if (moy0Var != null) {
            llm llmVarE = smo1.e(this.a);
            this.m = llmVarE;
            c921.y(llmVarE, (o8n) null, 0, new anf0(moy0Var, this, (lnm) null), 3);
        }
        if (!this.w) {
            View view2 = this.c;
            if (view2 != null && (viewTreeObserver = view2.getViewTreeObserver()) != null) {
                viewTreeObserver.addOnScrollChangedListener(this.k);
            }
            this.w = true;
        }
        view.addOnAttachStateChangeListener(this.j);
        aiq0.a(view, new mqh1(view, this, (byte) 5));
    }
}
