package p;

import android.content.Context;
import android.view.MenuInflater;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qab1 extends o60 implements ksi0 {
    public final Context d;
    public final ActionBarContextView e;
    public final em3 f;
    public WeakReference g;
    public boolean h;
    public final msi0 i;

    public qab1(Context context, ActionBarContextView actionBarContextView, em3 em3Var) {
        this.d = context;
        this.e = actionBarContextView;
        this.f = em3Var;
        msi0 msi0Var = new msi0(actionBarContextView.getContext());
        msi0Var.l = true;
        this.i = msi0Var;
        msi0Var.e = this;
    }

    @Override // p.o60
    public final void b() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.f.x(this);
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
        return ((ua91) this.f.b).N(this, ysi0Var);
    }

    @Override // p.o60
    public final msi0 f() {
        return this.i;
    }

    @Override // p.o60
    public final MenuInflater g() {
        return new d1d1(this.e.getContext());
    }

    public final void h(msi0 msi0Var) {
        k();
        g60 g60Var = this.e.d;
        if (g60Var != null) {
            g60Var.l();
        }
    }

    @Override // p.o60
    public final CharSequence i() {
        return this.e.getSubtitle();
    }

    @Override // p.o60
    public final CharSequence j() {
        return this.e.getTitle();
    }

    @Override // p.o60
    public final void k() {
        this.f.y(this, this.i);
    }

    @Override // p.o60
    public final boolean l() {
        return this.e.V0;
    }

    @Override // p.o60
    public final void n(View view) {
        this.e.setCustomView(view);
        this.g = view != null ? new WeakReference(view) : null;
    }

    @Override // p.o60
    public final void o(int i) {
        p(this.d.getString(i));
    }

    @Override // p.o60
    public final void p(CharSequence charSequence) {
        this.e.setSubtitle(charSequence);
    }

    @Override // p.o60
    public final void q(int i) {
        r(this.d.getString(i));
    }

    @Override // p.o60
    public final void r(CharSequence charSequence) {
        this.e.setTitle(charSequence);
    }

    @Override // p.o60
    public final void s(boolean z) {
        this.b = z;
        this.e.setTitleOptional(z);
    }
}
