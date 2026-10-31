package p;

import android.content.Context;
import android.view.MenuInflater;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class sql1 extends o60 implements ksi0 {
    public final Context d;
    public final msi0 e;
    public em3 f;
    public WeakReference g;
    public final /* synthetic */ tql1 h;

    public sql1(tql1 tql1Var, Context context, em3 em3Var) {
        this.h = tql1Var;
        this.d = context;
        this.f = em3Var;
        msi0 msi0Var = new msi0(context);
        msi0Var.l = true;
        this.e = msi0Var;
        msi0Var.e = this;
    }

    @Override // p.o60
    public final void b() {
        tql1 tql1Var = this.h;
        if (tql1Var.k != this) {
            return;
        }
        boolean z = tql1Var.r;
        boolean z2 = tql1Var.s;
        if (z || z2) {
            tql1Var.l = this;
            tql1Var.m = this.f;
        } else {
            this.f.x(this);
        }
        this.f = null;
        tql1Var.o0(false);
        ActionBarContextView actionBarContextView = tql1Var.h;
        if (actionBarContextView.N0 == null) {
            actionBarContextView.e();
        }
        tql1Var.e.setHideOnContentScrollEnabled(tql1Var.x);
        tql1Var.k = null;
    }

    @Override // p.o60
    public final View c() {
        WeakReference weakReference = this.g;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public final boolean d(msi0 msi0Var, ysi0 ysi0Var) {
        em3 em3Var = this.f;
        if (em3Var != null) {
            return ((ua91) em3Var.b).N(this, ysi0Var);
        }
        return false;
    }

    @Override // p.o60
    public final msi0 f() {
        return this.e;
    }

    @Override // p.o60
    public final MenuInflater g() {
        return new d1d1(this.d);
    }

    public final void h(msi0 msi0Var) {
        if (this.f == null) {
            return;
        }
        k();
        g60 g60Var = this.h.h.d;
        if (g60Var != null) {
            g60Var.l();
        }
    }

    @Override // p.o60
    public final CharSequence i() {
        return this.h.h.getSubtitle();
    }

    @Override // p.o60
    public final CharSequence j() {
        return this.h.h.getTitle();
    }

    @Override // p.o60
    public final void k() {
        if (this.h.k != this) {
            return;
        }
        msi0 msi0Var = this.e;
        msi0Var.A();
        try {
            this.f.y(this, msi0Var);
        } finally {
            msi0Var.z();
        }
    }

    @Override // p.o60
    public final boolean l() {
        return this.h.h.V0;
    }

    @Override // p.o60
    public final void n(View view) {
        this.h.h.setCustomView(view);
        this.g = new WeakReference(view);
    }

    @Override // p.o60
    public final void o(int i) {
        p(this.h.c.getResources().getString(i));
    }

    @Override // p.o60
    public final void p(CharSequence charSequence) {
        this.h.h.setSubtitle(charSequence);
    }

    @Override // p.o60
    public final void q(int i) {
        r(this.h.c.getResources().getString(i));
    }

    @Override // p.o60
    public final void r(CharSequence charSequence) {
        this.h.h.setTitle(charSequence);
    }

    @Override // p.o60
    public final void s(boolean z) {
        this.b = z;
        this.h.h.setTitleOptional(z);
    }
}
