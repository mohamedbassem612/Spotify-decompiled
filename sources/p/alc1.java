package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class alc1 extends msi0 implements SubMenu {
    public final ysi0 A;
    public final msi0 z;

    public alc1(Context context, msi0 msi0Var, ysi0 ysi0Var) {
        super(context);
        this.z = msi0Var;
        this.A = ysi0Var;
    }

    @Override // p.msi0
    public final boolean e(ysi0 ysi0Var) {
        return this.z.e(ysi0Var);
    }

    @Override // p.msi0
    public final boolean f(msi0 msi0Var, ysi0 ysi0Var) {
        return super.f(msi0Var, ysi0Var) || this.z.f(msi0Var, ysi0Var);
    }

    @Override // p.msi0
    public final boolean g(ysi0 ysi0Var) {
        return this.z.g(ysi0Var);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.A;
    }

    @Override // p.msi0
    public final String k() {
        int i = this.A.a;
        if (i == 0) {
            return null;
        }
        return f4i1.c(i, "android:menu:actionviewstates:");
    }

    @Override // p.msi0
    public final msi0 l() {
        return this.z.l();
    }

    @Override // p.msi0
    public final boolean n() {
        return this.z.n();
    }

    @Override // p.msi0
    public final boolean o() {
        return this.z.o();
    }

    @Override // p.msi0
    public final boolean p() {
        return this.z.p();
    }

    @Override // p.msi0, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.z.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        x(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        x(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        x(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.A.setIcon(drawable);
        return this;
    }

    @Override // p.msi0, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.z.setQwertyMode(z);
    }

    @Override // p.msi0
    public final void w(ksi0 ksi0Var) {
        throw null;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.A.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        x(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        x(i, null, 0, null, null);
        return this;
    }
}
