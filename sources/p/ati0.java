package p;

import android.content.Context;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ati0 extends z60 implements ActionProvider.VisibilityListener {
    public d4e0 b;
    public final ActionProvider c;

    public ati0(dti0 dti0Var, Context context, ActionProvider actionProvider) {
        super(context);
        this.c = actionProvider;
    }

    @Override // p.z60
    public final boolean a() {
        return this.c.hasSubMenu();
    }

    @Override // p.z60
    public final boolean b() {
        return this.c.isVisible();
    }

    @Override // p.z60
    public final View c(MenuItem menuItem) {
        return this.c.onCreateActionView(menuItem);
    }

    @Override // p.z60
    public final boolean d() {
        return this.c.onPerformDefaultAction();
    }

    @Override // p.z60
    public final void e(alc1 alc1Var) {
        this.c.onPrepareSubMenu(alc1Var);
    }

    @Override // p.z60
    public final boolean f() {
        return this.c.overridesItemVisibility();
    }

    @Override // p.z60
    public final void g(d4e0 d4e0Var) {
        this.b = d4e0Var;
        this.c.setVisibilityListener(this);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        d4e0 d4e0Var = this.b;
        if (d4e0Var != null) {
            msi0 msi0Var = ((ysi0) d4e0Var.b).n;
            msi0Var.h = true;
            msi0Var.q(true);
        }
    }
}
