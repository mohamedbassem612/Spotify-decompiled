package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import io.reactivex.rxjava3.core.Completable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class r3p0 extends zf30 implements fn10, o6r0, lir0, jik1 {
    public final m6k0 F1;
    public u4p0 G1;
    public Completable H1;
    public mwn0 I1;
    public mir0 J1;
    public swm0 K1;
    public final tdl0 L1 = new tdl0((byte) 12);
    public final rku M1 = new rku();
    public final gn10 N1 = mno1.M;
    public final lik1 O1 = nik1.p1;

    public r3p0(m6k0 m6k0Var) {
        this.F1 = m6k0Var;
    }

    public static void a1(View view) {
        view.requestLayout();
        view.invalidate();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                childAt.getClass();
                a1(childAt);
            }
        }
    }

    public final void G0() {
        ((zf30) this).h1 = true;
        Completable completable = this.H1;
        if (completable == null) {
            u890.C("playbackStoppedTrigger");
            throw null;
        }
        this.M1.b(completable.subscribe(new c72(this, (byte) 4)));
        Z0().start();
    }

    public final void H0() {
        Z0().stop();
        this.M1.a();
        ((zf30) this).h1 = true;
    }

    public final void I0(View view, Bundle bundle) {
        swm0 swm0Var = this.K1;
        lnm lnmVar = null;
        if (swm0Var != null) {
            fn31.T(cto1.q(this), (o8n) null, 0, new cto0(swm0Var, new mvn0(view, N0(), new u6j0(this, view), (byte) 7), lnmVar, (byte) 3), 3);
        } else {
            u890.C("transitionHelper");
            throw null;
        }
    }

    public final gn10 Q() {
        return this.N1;
    }

    public final u4p0 Z0() {
        u4p0 u4p0Var = this.G1;
        if (u4p0Var != null) {
            return u4p0Var;
        }
        u890.C("nowPlayingPageElement");
        throw null;
    }

    public final mir0 c() {
        mir0 mir0Var = this.J1;
        if (mir0Var != null) {
            return mir0Var;
        }
        u890.C("pageObservable");
        throw null;
    }

    public final n6r0 e() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return yon1.X2();
    }

    public final lik1 getViewUri() {
        return this.O1;
    }

    public final void v0(Context context) {
        this.F1.f(this);
        super.v0(context);
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        u4p0 u4p0VarZ0 = Z0();
        Context contextP0 = P0();
        viewGroup.getClass();
        u4p0VarZ0.c(contextP0, layoutInflater, viewGroup);
        ViewGroup view = u4p0VarZ0.getView();
        view.getClass();
        swm0 swm0Var = this.K1;
        lnm lnmVar = null;
        if (swm0Var == null) {
            u890.C("transitionHelper");
            throw null;
        }
        fn31.T(cto1.q(this), (o8n) null, 0, new cto0(swm0Var, new j9n0(view, this, (byte) 22), lnmVar, (byte) 3), 3);
        j7p1.y(viewGroup, new ivn0(this, (byte) 18));
        return view;
    }

    public final void z0() {
        u4p0 u4p0VarZ0 = Z0();
        r24 r24Var = u4p0VarZ0.a;
        ((rku) r24Var.i).a();
        m4p0 m4p0Var = (m4p0) r24Var.k;
        if (m4p0Var != null) {
            m4p0Var.destroy();
        }
        r24Var.k = null;
        r24Var.j = null;
        ViewGroup viewGroup = u4p0VarZ0.t;
        if (viewGroup != null) {
            m87.q(viewGroup);
            ViewGroup viewGroup2 = u4p0VarZ0.t;
            if (viewGroup2 == null) {
                u890.C("rootView");
                throw null;
            }
            viewGroup2.removeAllViews();
        }
        ((zf30) this).h1 = true;
    }
}
